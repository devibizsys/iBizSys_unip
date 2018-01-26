/*基类*/
var ViewControllerBase = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.bInited = false;
		me.htmlwin=window;
		$.getIBizApp().regSRFController(me);
	
		me.lastTimer = new Date().getTime();
		setInterval(function(){me.lastTimer = new Date().getTime();},1000);
		
		me.autoLayout = config.autoLayout;
		if(me.autoLayout==undefined)
			me.autoLayout = false;
		me.itemMap = {};
		me.ctrlers = {};
		me.viewLogics = {};
		me.pagecontext = new IBizPageContext(config);
		var winId = me.pagecontext.getParamValue('windowid');
		var hookUnload = true;
		if(winId){
			me.window = $.getIBizApp().findWindow(winId);
			if(me.window){
				me.viewparam = me.window.viewparam;
				me.window.setOwnerWindow(window);
			//	if(!me.getPController() && (me.window.beforecallback==undefined)){
				if(!me.getPController() && me.window.isShowModal()){
					hookUnload = false;
					me.window.beforecallback = function(e){
						var tag = me.unloaded();
						if(tag)
						{
							return {win:window,msg:tag}; 
						}
						return tag;
					}
				}
			}	
		}	
		me.viewparam = $.extend({},me.pagecontext.viewparam,me.viewparam);
		if(!me.getPController()){
			if(hookUnload){
				//注册窗口关闭事件
				window.onbeforeunload = function(){
					var tag = me.unloaded();
					if(tag)
						return tag;
					return ;
				}
			}
			if(me.isAutoLayout()){
				$(window).resize(function(){
					me.doLayout();
				});
			}
		}
	},
	isClosed:function(){
		var me=this;
		if(me.htmlwin)
		{
			if(me.htmlwin.closed)
			{
				me.htmlwin = null;
				return true;
			}
			try
			{
				var lastTimer = new Date().getTime();
				if(lastTimer-me.lastTimer>=10000)
				{
					me.htmlwin = null;
					return true;
				}
				else
					return false;
			}
			catch(e)
			{
				me.htmlwin = null;
				return true;
			}
		}
		return true;
	},
	quit:function()
	{
		var me=this;
		me.htmlwin=null;
	},
	isAutoLayout:function()
	{
		var me=this;
		return me.autoLayout;
	}
	,doLayout:function(){
		var me = this;
		if(!me.isAutoLayout())
			return;
		if(me.getPController()){
			$('#'+me.getCId2()).ibizLayout({ctrler:me});
			$('#'+me.getCId2()).find('.ibiz-layout').ibizLayout({ctrler:me});
		}else{
			$('.ibiz-layout').ibizLayout({ctrler:me});
		}
	},
	/**
	 * 执行初始化
	 */
	onInit:function(){
		var me = this;
		if(me.tmpwidth != undefined)
			$('#'+me.getCId2()).width(me.tmpwidth);
		if( me.tmpheight != undefined)
			$('#'+me.getCId2()).height(me.tmpheight);
		me.tmpwidth = undefined;
		me.tmpheight = undefined;
	},
	setSize:function(width,height){
		var me = this;
		if(me.getPController()&&me.isAutoLayout()){
			if(me.isInited()){
				if(width!=undefined){
					$('#'+me.getCId2()).width(width);
				}
				if(height!=undefined){
					$('#'+me.getCId2()).height(height);
				}
				me.doLayout();
			}else{
				me.tmpwidth = width;
				me.tmpheight = height;
			}
		}
	},
	getItem:function(itemId){
		var me = this;
		return me.itemMap[itemId];
	},
	registerItem:function(itemId,item){
		var me = this;
		me.itemMap[itemId] = item;
	},
	unloaded:function(){
		/*//子控件如何处理，
		if(me.ctrlers && me.ctrlers.length> 0){
			
		}*/
		return null;
	},
	/**
	 * 初始化
	 */
	init:function(params){
		var me = this;
		if(params)
		{
			me.parentMode = params.parentMode;
			me.setParentData(params.parentData); 
		}
		
		me.bInited = true;
		me.onInit();
		me.initViewLogic();
		if(!me.getPController()&&me.isAutoLayout()){
			me.doLayout();
		}
		me.reloadUpdatePanels();
		me.fireEvent(ViewControllerBase.INITED, me, {});
	},
	/**
	 * 异步初始化<加载HTML内容动态绘制到界面>
	 */
	asyncInit:function(params){
		var me = this;

		me.pagecontext.clear();
		me.parentMode = params.parentMode;
		me.setParentData(params.parentData); 
		me.subapp = params.subApp;
		if(params.renderTo)
			me.renderTo = $('#'+params.renderTo);
		
		var root;
		if(params.subApp){
			root = WEBROOTURL+'/'+params.subApp;
		}else{
			root = BASEURL;
		}
		
		IBiz.ajax({url:root+'/jsp/'+me.config.viewurl,
			params:params,
			method:'GET',
			dataType:'html',
			success:function(data){
				me.renderHTML(data);
				me.init();
			},
			failure:function(e){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('VIEWCONTROLLERBASE.AJAX.INFO','加载内容布局异常'),1);
			}	
		});	
	},
	/**
	 * 绘制内容布局
	 */
	renderHTML:function(data){
		var me = this;
		if(me.renderTo){
			me.renderTo.html(data);
		}	
	},
	/**
	 * 是否初始化完毕
	 */
	isInited:function(){
		var me = this;
		return me.bInited;
	},
	/**
	 * 获取当前容器标识
	 */
	getCId:function(){
		var me = this;
		return me.config.containerid;
	},
	/**
	 * 获取当前容器标识2<自动附加_>
	 */
	getCId2:function(){
		var me  = this;
		var cid = me.getCId();
		if(cid !='')
			return cid+'_';
		return cid;
	},
	getAppCtx:function(){
		var me = this;
		return me.config.appctx;
	},
	/**
	 * 注册子控制器对象
	 */
	regController:function(ctrler){
		var me = this;
		me.ctrlers[ctrler.getCId()] = ctrler;
	},
	/**
	 *获取子控制器对象
	 */
	getController:function(id){
		var me = this;
		return me.ctrlers[id];
	},
	/**
	 * 获取父控件
	 */
	getPController:function(){
		var me = this;
		if(me.config && me.config.pcontroller){
			return me.config.pcontroller;
		}
		return null;
	},
	/**
	 * 注销子控制器对象
	 */
	unRegController:function(ctrler){
		var me = this;
		me.ctrlers[ctrler.getCId()] = null;
	},
	/**
	 * 注册代码表
	 */
	regCodeList:function(codelist){
		var me = this;
		if(!me.codelists){
			me.codelists = {};
		}
		me.codelists[codelist.getId()] = codelist;
	},
	/**
	 * 获取代码表
	 */
	getCodeList:function(codelistId){
		var me = this;
		
		if(me.codelists){
			return me.codelists[codelistId];
		}
		return null;
	}
	,
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
	}
	,
	/**
	 * 注册界面计数器
	 */
	regUICounter:function(uicounter){
		var me = this;
		if(!me.uicounters){
			me.uicounters = {};
		}
		me.uicounters[uicounter.tag] = uicounter;
	},
	/**
	 * 获取界面计数器
	 */
	getUICounter:function(uicounterId){
		var me = this;
		
		if(me.uicounters){
			return me.uicounters[uicounterId];
		}
		return null;
	}
	/**
	 * 刷新全部界面计数器
	 */
	,reloadUICounters:function()
	{
		var me = this;
		if(me.uicounters){
			$.each(me.uicounters,function(idx,item){
				if(item){
					item.reload();
				}
			});
		}
		var pController = me.getPController();
		if(pController){
			pController.reloadUICounters();
		}
	}
	,
	getWindow:function(){
		var me = this;
		return me.window;
	},
	
	/**
	 * 是否支持视图模型
	 */
    isEnableViewModel:function(){
    	return false;
    },
	/**
	 * 获取后台地址
	 */
	getBackendUrl : function(){
		var me = this;
		if(me.config && me.config.backendurl)
		{
			return me.config.backendurl;
		}
		return null;
	},

	/**
	 * 销毁 
	 */
	destroy : function(){
		var me = this;
		$.getIBizApp().unRegSRFView(me);
		me.config = null;
		arguments.callee.$.destroy.call(this);
	},

	/**
	 * 刷新
	 */
	refresh : function(){
		var me = this;
		me.onRefresh();
	},
	onRefresh: function(){
		
    },
    /**
	 * 刷新子项
	 */
    refreshItem:function(name){
    	var me=this;
    	var item = me.getItem(name);
    	if(item ){
    		if($.isFunction(item.refresh)){
    			item.refresh();
    			return;
    		}
    		if($.isFunction(item.reload)){
    			item.reload();
    			return;
    		}
    	}
    },
	/**
	 * 设置父数据
	 */
	setParentData : function(data){
		var me=this;
		me.parentData = data;
		me.onSetParentData();
		me.reloadUpdatePanels();
	},
	onSetParentData: function () {
		
    },
	/**
	 * 获取父数据
	 */
	getParentData : function(){
		var me = this;
		return me.parentData;
	},

	/**
	 * 获取父模式
	 */
	getParentMode : function(){
		var me = this;
		return me.parentMode;
	},
	/**
	 * 获取引用数据
	 */
	getReferData : function(){
		var me = this;
		return me.config.referData;
	},
	/**
	 * 获取引用数据
	 */
	getViewParam : function(){
		var me = this;
		return me.viewparam;
	},
	renderCodeList_Normal:function(codeListId,value,emtpytext){
    	var codelist = this.getCodeList(codeListId);
    	var item=codelist.getItemByValue(value);
    	if(item==null){
    		return emtpytext;
    	}
    	return this.getCodeItemText(item);
    },
    renderCodeList_NumOr:function(codeListId,value,emtpytext,textSeparator){
    	if(!textSeparator||textSeparator=='')
    		textSeparator = '、';
    	var codelist = this.getCodeList(codeListId);
    	if(value==null){
    		return emtpytext ;
    	}
    	var nValue = parseInt(value);
    	var strTextOr = '' ;
    	for(var i = 0 ; i < codelist.datas.length;i++){
    		var item = codelist.datas[i];
    		var codevalue = item.value;
    		if((parseInt(codevalue)&nValue)>0){
    			if(strTextOr.length >0 )
    				strTextOr += (textSeparator);
    			strTextOr += this.getCodeItemText(item);
    		}
    	}
    	
    	return strTextOr;
    },
    renderCodeList_StrOr:function(codeListId,value,emtpytext,textSeparator,valueSeparator){
    	if(!textSeparator||textSeparator=='')
    		textSeparator = '、';
    	if(value==null){
    		return emtpytext ;
    	}
    	var strTextOr = '' ;
    	var codelist = this.getCodeList(codeListId);
    	var arrayValue = new Array();   
    	arrayValue = value.split(valueSeparator);
    	for (i=0;i<arrayValue.length ;i++ )   
        {
    		var strText = '' ;
        	strText = this.renderCodeList_Normal(codeListId,arrayValue[i],emtpytext);
        	if(strTextOr.length >0 )
				strTextOr += (textSeparator);
        	strTextOr +=  strText;
    	}
    	
    	return strTextOr;
    }
    ,getCodeItemText:function(item){
    	var color = item.color;
    	var textCls = item.textcls;
    	var iconCls = item.iconcls;
    	var realText = item.text;
    	var ret = '';
    	if(iconCls)
    	{
    		ret = ('<i class="'+iconCls+'"></i>');
    	}
    	if(textCls || color)
    	{
    		ret += '<span';
    		if(textCls)
    		{
    			ret += (' class="'+textCls +'"');
    		}
    		if(color)
    		{
    			ret += (' style="color:'+color +'"');
    		}
    		ret += '>';
    		ret += realText;
    		ret += '</span>';
    	}
    	else
    	{
    		ret += realText;
    	}
    		
    	return ret;
    }
    ,hasHtmlElement:function(id){
    	if($('#'+this.getCId2()+id).length>0)
    		return true;
    	else
    		return false;
    },
    initViewLogic:function(){
		var me=this;
    	me.onPrepareViewLogics();
    	for (var A in me.viewLogics) {
            var logic = me.viewLogics[A];
            logic.init();
    	}
	},
	onPrepareViewLogics:function(){
		
	},
    regViewLogic: function(logic){
    	var me=this;
    	me.viewLogics[logic.getTag()] = logic;
    },
    getViewLogic: function(tag){
    	var me=this;
    	return me.viewLogics[tag];
    },
    invokeCtrl:function(ctrlid,command,arg){
    	var me=this;
    	if(!ctrlid || ctrlid==''){
    		me.invoke(command,arg);
    	}
    	else{
    		var ctrl=me.getItem(ctrlid);
    		if(ctrl){
    			if($.isFunction(ctrl.invoke)){
    				ctrl.invoke(command,arg);
    			}
    		}
    	}
    },
    /**
	 * 注册界面更新面板
	 */
	regUpdatePanel:function(updatepanel){
		var me = this;
		if(!me.updatepanels){
			me.updatepanels = {};
		}
		me.updatepanels[updatepanel.name] = updatepanel;
		me.registerItem(updatepanel.name,updatepanel);
	},
	/**
	 * 获取界面更新面板
	 */
	getUpdatePanel:function(updatepanelId){
		var me = this;
		if(me.updatepanels){
			return me.updatepanels[updatepanelId];
		}
		return null;
	}
	/**
	 * 刷新全部界面更新面板
	 */
	,reloadUpdatePanels:function()
	{
		var me = this;
		if(!me.isInited())
			return;
		if(me.updatepanels){
			var params = {};
			me.onFillUpdatePanelParam(params);
			$.each(me.updatepanels,function(idx,item){
				if(item){
					item.reload(params);
				}
			});
		}
		var pController = me.getPController();
		if(pController){
			pController.reloadUpdatePanels();
		}
	},
	createUpdatePanel:function(config){
		return IBiz.createUpdatePanel(config);
	}
	/**
	 * 填充更新面板调用参数
	 */
	,onFillUpdatePanelParam:function(params){
		var me=this;
		if (me.viewparam){
        	$.extend(params,me.viewparam);
        }
		if (me.getParentMode()) {
	       	$.extend(params, me.getParentMode());
		 }
        if (me.getParentData()) {
        	$.extend(params, me.getParentData());
        }
	}
});

/*****************事件声明************************/
/**
 * 控制器初始化完成
 */
ViewControllerBase.INITED = 'INITED';