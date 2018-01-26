/**
 * 多编辑视图面板部件
 */
var IBizMultiEditViewTabPanel = IBizMultiEditViewPanel.extend({
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
			var headerId=me.getId()+'_header';
			var contentId=me.getId()+'_content';
			me.mainPanel.append(
				'<ul class="nav nav-tabs " id="'+headerId+'"> </ul>'+
				'<div class="tab-content" id="'+contentId+'"> </div>'
			);

			me.header=$('#'+headerId);
			me.content=$('#'+contentId);
		}
	},
	/**
	 * 添加选项页div及注册新建操作
	 */
	addNewItemDiv:function(){
		var me=this;
		
		var newId=me.getId()+'_new';
		me.header.append(
				'<li> '+
				'	<button id ="'+newId+'" class="btn btn-priamry" data-ibiz-tag="New"'+
				'		style="margin-top: 9px;margin-left: 16px;">'+$IGM('IBIZMULTIEDITVIEWPANEL.ADDNEWITEMDIV.BUTTON','新建')+'<i class="fa fa-plus"></i></button>	'+
				'</li> '
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
		var tabHeadText=$IGM('IBIZMULTIEDITVIEWPANEL.ADDITEMDIV.TITLE','基本信息');
		if(params && params.srfmajortext)
			tabHeadText=params.srfmajortext;
		
		var panelId = me.getId()+'_'+me.subindex;
		
		var headTag=panelId+"_head";
		var removeTag=panelId+"_remove";
		
		var divHeadHtml = '<li class="" id="'+headTag+'"><a id="'+panelId+'_a" href="#'+panelId+'" data-toggle="tab">';
		divHeadHtml += '	<span id="'+panelId+'_caption">'+tabHeadText+'</span>';
		if(!me.isReadOnly){
			divHeadHtml += '	<sub style="bottom: 1.4em;">';
			divHeadHtml += '		<span class="btn" style="padding:0px;" data-ibiz-tag="'+removeTag+'" id="'+removeTag+'">';
			divHeadHtml += '			<i class="fa fa-times"></i>';
			divHeadHtml += '		</span>';
			divHeadHtml += '	</sub></a>';
		}
		divHeadHtml += '</li>';
	    me.newTab.parent().before(divHeadHtml);
	
		var div = '<div class="tab-pane row" id="'+panelId+'"></div>';
		me.content.append(div);
		
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
		
		//设置选中状态
		if(params && params.active){
			$('#'+panelId+'_a').click();
		}

		return panelId;
	},
	/**
	 * 控件刷新
	 */
	onRefresh:function(){
		var me = this;
		if(me.header)
			me.header.empty();
		if(me.content)
			me.content.empty();
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
		//选中错误面板
		var panelId=controller.config.containerid;
		if(!me.errorTabId || panelId<me.errorTabId){
			$('#'+panelId+'_a').click();
		}
	},
	onRemove:function(panelId){
		//删除项为选中时，需要查找设置选中项（紧前项或紧后选项卡，如果无则不设置）
		var tabHead=$("#"+panelId+"_head");
		if(tabHead){
			if(tabHead.attr('class')=='active'){
				var nextTab = tabHead.prev();
				if(nextTab.length==0)
					nextTab=tabHead.next();
				if(nextTab.length>0)
					nextTab.find("a").click();
			}
		}
		$("#"+panelId+"_head").remove(); 
		$("#"+panelId).remove();
	}
		
});
