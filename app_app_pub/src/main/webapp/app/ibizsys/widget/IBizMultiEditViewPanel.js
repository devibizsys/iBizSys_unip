/**
 * 多编辑视图面板部件
 */
var IBizMultiEditViewPanel = IBizControl.extend({
	editCtrlers:{},//选项表单控制器数据
	removeKeys:'',//需要删除的键值
	subindex:0,//选项页序号
	parentViewCtrler:null,
	isReadOnly:false,
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
		if(config.readonly)
			me.isReadOnly = true;
		me.parentViewCtrler=config.viewctrler;
		me.mainPanel = $('#'+me.getId());
		me.createMainPanel();
		
		if(!me.isReadOnly){
			//添加新建按钮
			me.addNewItemDiv();
		}
	},
	/**
	 * 加载数据
	 */
	load:function(){
		var me = this;		
		var params = {};
		if(me.parentViewCtrler.parentMode)
			$.extend(params,me.parentViewCtrler.parentMode);
		if(me.parentViewCtrler.parentData)
			$.extend(params,me.parentViewCtrler.parentData);

		var dataurl = me.config.url+'srfaction=fetch&start=0&limit=500&';
		IBiz.ajax({
			url: dataurl,
			params : params,
			method : "POST",
			dataType: "json",
			success:function(data){
				if(data.ret == 0){
					if(data.items && data.items.length>0){
						var bActive=true;
						$.each(data.items,function(name,item){
							var id=me.addItemDiv({srfkey:item.srfkey,srfmajortext:item.srfmajortext,active:bActive});
							var param={containerid:id,srfkey:item.srfkey};
							me.fireEvent(IBizMultiEditViewPanel.FINDEDITVIEWCONTROLLER,me,param);	
							if(bActive){
								bActive=false;
							}
				        });
					}
					//没有返回数据，新建默认表单
					if(data.items.length == 0 && me.config.defaultLoad){
						if(me.config.defaultLoad>0){
							var params = {};
							for(var i=0,number=me.config.defaultLoad;i<number;i++){
								me.doNew(params)
							}
						}
					}
				}else{
					console.log('加载计数数据异常.'+data.info);
				}
			},
			failure:function(e){
				
			}	
		});
	},
	/**
	 * 添加选项页编辑视图控制器
	 */
	addEditViewCtrler:function(ctrler){
		var me = this;
		if(!ctrler.isInited())
		{
			if(ctrler.config.srfkey)
				ctrler.viewparam.srfkey=ctrler.config.srfkey;
			var parentMode = me.parentViewCtrler.parentMode;
			var parentData = me.parentViewCtrler.parentData;
			var renderTo = ctrler.config.containerid;
			var subApp = me.parentViewCtrler.subApp;
			$.extend(parentData,parentMode);
			
			ctrler.asyncInit({parentMode:parentMode,parentData:parentData,renderTo:renderTo,subApp:subApp});

			//注册编辑视图保存成功事件
			ctrler.on(EditView9ControllerBase.FORMSAVED, function (sender,data,e){
				var me=e.data;
				me.onEditViewSaved(sender,data);
			}, me);
			//注册编辑视图保存失败事件
			ctrler.on(EditView9ControllerBase.FORMSAVEERROR, function (sender,data,e){
				var me=e.data;
				me.onEditViewSaveError(sender,data);
			}, me);
			
			me.editCtrlers[renderTo]=ctrler;
		}
	},	
	/**
	 * 表单保存成功
	 */
	onEditViewSaved:function(ctrler,data){
		var me=this;
		if(ctrler)
			me.doTabs.pop(ctrler.config.containerid);
		
		if(!me.doTabs || me.doTabs.length==0){
			//调用主数据保存
			me.doMajorSave();
		}
	},
	/**
	 * 表单保存错误
	 */
	onEditViewSaveError:function(ctrler,data){
		
	},
	/**
	 * 新建
	 */
	doNew:function(params){
		var me=this;
		
		//添加div及注册删除操作
		var id=me.addItemDiv({active:true});
		
		//触发获取编辑视图控制器事件
		var param={pcontroller:me.parentViewCtrler,appctx:me.config.appctx,containerid:id};
		me.fireEvent(IBizMultiEditViewPanel.FINDEDITVIEWCONTROLLER,me,param);	
	},
	/**
	 * 删除
	 */
	doRemove: function(panelId) {
		me = this;
		var ctrler=me.editCtrlers[panelId];
		if(ctrler){
			var srfkey = '';
			if (srfkey == undefined || srfkey == '') {
				field = ctrler.getForm().findField('srfkey');
				if (field) {
					srfkey = field.getValue();
				}
			}
			if(srfkey){
				if(me.removeKeys.length>0)
					me.removeKeys+=';';
				me.removeKeys+=srfkey;
			}
			delete me.editCtrlers[panelId];
		}
		me.onRemove(panelId);
	},
	/**
	 * 保存数据
	 */
	doSave:function(){
		var me=this;
		
		me.errorTabId='';
		me.doTabs=[];
		var bNeedOuterSave=true;
		//需要添加或更新的数据
		for(var key in me.editCtrlers){
			//仅保存变更的子数据
			var ctrler = me.editCtrlers[key];
			if(ctrler && ctrler.form.isDirty()){
				bNeedOuterSave=false;
				ctrler.doSave({afterformsaveaction:'embedsave'})
				me.doTabs.push(ctrler.config.containerid);					
			}
		}
		
		if(bNeedOuterSave)
			me.doMajorSave();
	},
	/**
	 * 保存主数据
	 */
	doMajorSave:function(ctrler,data){
		var me=this;
		var bNeedOuterSave=true;
		//需要删除的数据
		if(me.removeKeys.length>0){
			bNeedOuterSave=false;
			var params={srfaction: 'remove','srfkeys':me.removeKeys};
			IBiz.ajax({
				url: me.config.url,
				params: params,
				method: 'POST',
				dataType: 'json',
				async:false,  
				success: function(data) {
					me.removeKeys='';
					if (data.ret == 0) {
						me.parentViewCtrler.onDRDataSaved();
					} else {
						IBiz.alert($IGM('IBIZMULTIEDITVIEWPANEL.DOMAJORSAVE.TITLE','删除失败'),$IGM('IBIZMULTIEDITVIEWPANEL.DOMAJORSAVE.INFO','删除数据失败,'+data.info,[data.info]),2);
					}
				},
				failure: function(e) {
					IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZMULTIEDITVIEWPANEL.AJAX.INFO','执行请求发生异常'),2);
				}
			});
		}
		
		//调用主数据保存
		if(bNeedOuterSave)
			me.parentViewCtrler.onDRDataSaved();
	},
	/**
	 * 注册删除操作
	 */
	regRemoveUIAction:function(params){
		var me = this;
		var uiaction = {type:"Remove"};
		$.extend(uiaction,params);
		me.regUIAction(uiaction);
	},
	/**
	 * 点击按钮
	 */
	tabItemClick : function(params, e) {
		var me = this;
		var uiaction = me.getUIAction(params.tag);
		if(!uiaction)
			return;
		$.extend(uiaction,params);
		me.doUIAction(uiaction);
	},
	doUIAction: function(uiaction) {
		var me = this;
		if (uiaction) {
			if (uiaction.type == 'Add') {
				me.doNew(uiaction);
				return;
			}
			if (uiaction.type == 'Remove') {
				if(uiaction.panelId){
					me.doRemove(uiaction.panelId);
					return;
				}
			}
		}
	},
	/**
	 * 控件刷新
	 */
	refresh:function(){
		var me = this;
		me.uiactions={};
		me.editCtrlers={};
		me.removeKeys='';
		me.subindex=0;
		
		me.onRefresh();
		
		if(!me.isReadOnly){
			//添加新建按钮
			me.addNewItemDiv();
		}
		
		me.load();
	},
	/**
	 * 数据是否有修改  有修改返回true 否则返回false
	 */
	isDirty:function(){
		var me=this;
		var bDirty = false;
		
		//只读模式不提供数据修改能力
		if(me.isReadOnly){
			return bDirty;
		}
		if(me.removeKeys.length>0){
			bDirty=true;
		}else{
			for(var key in me.editCtrlers){
				var ctrler = me.editCtrlers[key];
				if(ctrler && ctrler.form && ctrler.form.isDirty()){
					bDirty=true;
					break;
				}
			}
		}
		
		return bDirty;
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		//arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		me.onSetDisabled(disabled);
	},
	onSetDisabled:function(disabled){},
	getHeight:function(){
		return 600;
	},
	/**
	 * 注册界面行为
	 */
	regUIAction:function(uiaction){
		var me = this;
		if(!me.uiactions){
			me.uiactions = {};
		}
		me.uiactions[uiaction.tag] = uiaction;
	},
	/**
	 * 获取界面行为
	 */
	getUIAction:function(uiactionId){
		var me = this;
		
		if(me.uiactions){
			return me.uiactions[uiactionId];
		}
		return null;
	},
	/**
	 * 控件刷新
	 */
	onRefresh:function(){},
	/**
	 * 删除操作
	 */
	onRemove:function(panelId){},
	/**
	 * 添加基础面板
	 */
	createMainPanel:function(){},
	/**
	 * 添加div及注册删除操作
	 * params.srfmajortext	主信息内容
	 * params.active		是否激活显示
	 */
	addItemDiv:function(params){},
	/**
	 * 添加选项页div及注册新建操作
	 */
	addNewItemDiv:function(){}
		
});
/*****************事件声明************************/
/**
 * 获取选项编辑页控制对象事件
 */
IBizMultiEditViewPanel.FINDEDITVIEWCONTROLLER = 'FINDEDITVIEWCONTROLLER';

