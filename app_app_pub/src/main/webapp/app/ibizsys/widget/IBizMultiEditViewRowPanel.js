/**
 * 多编辑视图面板部件
 */
var IBizMultiEditViewRowPanel = IBizMultiEditViewPanel.extend({
	header:{},//选项页头
	content:{},//选项页内容
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
	},
	//添加基础面板
	createMainPanel:function(){
		var me=this;
		if(me.mainPanel){
			var contentId=me.getId()+'_header';
			var btnId=me.getId()+'_content';
			var mainPanelHtml = '<table class="table table-bordered" id="'+contentId+'"></table>';
			if(!me.isReadOnly){
				mainPanelHtml += '<div id="'+btnId+'"></div>';
			}
			me.mainPanel.append(mainPanelHtml);

			me.tabContent=$('#'+contentId);
			
			if(!me.isReadOnly){
				me.tabBtn=$('#'+btnId);
			}
		}
	},
	/**
	 * 添加选项页div及注册新建操作
	 */
	addNewItemDiv:function(){
		var me=this;
		
		var newId=me.getId()+'_new';
		me.tabBtn.append(
				'<button class="btn btn-success ibiz-toolbar-item"'+
				'  data-ibiz-tag="New" id ="'+newId+'" style="Float: right;">'+$IGM('IBIZMULTIEDITVIEWPANEL.ADDNEWITEMDIV.BUTTON','新建')+'</button>'
				);
		
		me.newTab=$('#'+newId);
		
		var sender = me;
		me.newTab.on('click',sender,function(e) {
			var params = {};
			params['tag'] = $(this).attr('data-ibiz-tag');
			var regItem = e.data;
			if(regItem){
				regItem.tabItemClick(params, e);
			}
		});
		
		var uiaction = {"type":"Add","tag":"New"};
		me.regUIAction(uiaction);
	},
	/**
	 * 添加div及注册删除操作
	 * params.srfmajortext	主信息内容
	 * params.active		是否激活显示
	 */
	addItemDiv:function(params){
		var me=this;
		me.subindex++;
		
		var panelId = me.getId()+'_'+me.subindex;
		
		var headTag=panelId+"_head";
		var removeTag=panelId+"_remove";
		
		var divHtml = '<tr><td id="'+panelId+'"></td>';
		if(!me.isReadOnly){
			divHtml += '<td><div style="float: right;"><span class="btn btn-priamry" data-ibiz-tag="'+removeTag+'" id="'+removeTag+'"><i class="fa fa-times"></i></span></div></td></tr>';
		}
		divHtml += '</tr>';
		me.tabContent.append(divHtml);
		
		if(!me.isReadOnly){
			//删除事件绑定
			var sender = me;
			$('#'+removeTag).on('click',sender,function(e) {
				if(!params)
					params = {};
				params['tag'] = $(this).attr('data-ibiz-tag');
				var regItem = e.data;
				if(regItem){
					regItem.tabItemClick(params, e);
				}
			});
			me.regRemoveUIAction({panelId:panelId,tag:removeTag});
		}

		return panelId;
	},
	/**
	 * 控件刷新
	 */
	onRefresh:function(){
		var me=this;
		if(me.tabContent)
			me.tabContent.empty();
		if(me.tabBtn)
		me.tabBtn.empty();
	},
	/**
	 * 选项页编辑视图保存成功
	 */
	onEditViewSaved:function(controller,data){
		arguments.callee.$.onEditViewSaved.call(this,controller,data);
		
		var majorText='';
		var field = controller.getForm().findField('srfmajortext');
		if (field) {
			majorText = field.getValue();
		}
		if(majorText){
			var panelId=controller.config.containerid;
			$('#'+panelId+'_caption').text(majorText);			
		}
	},	
	/**
	 * 选项页编辑视图保存错误
	 */
	onEditViewSaveError:function(controller,data){
		arguments.callee.$.onEditViewSaveError.call(this,controller,data);
		
		var me = this;
		//选中错误面板(暂无)
		var panelId=controller.config.containerid;
		if(!me.errorTabId || panelId<me.errorTabId){
			$('#'+panelId+'_a').click();
		}
	},
	onRemove:function(panelId){
		//删除内容
		$("#"+panelId).parent().remove();
	}
		
});
