/**
 * 数据关系区
 */
var IBizDRBar = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		//构建对象
		 $('#'+config.id).jstree({
		    'core' : {
		    	'multiple' : false,
		        'data' : {
		        	'url' : config.url,
		           'data' : function (node) {
		                return { 'id' : node.id, srfaction: 'fetch',srfappdata:IBizApp_Data,srfrender:'JSTREE' };
		            }
		        }
		    }
		 });
		 $('#'+config.id).on('changed.jstree', this,function (e, data) {
			    var i, j, r = [];
			    for(i = 0, j = data.selected.length; i < j; i++) {
			      r.push(data.instance.get_node(data.selected[i]));
			    }
			    e.data.onSelectionChange(data.instance,r,e);
			  });
	}
	,parentData:null
	,getDRTab:function()
	{
		return this.config.tabctrl;
	}
	,onSelectionChange:function(tree,records,eOpts){
		
		var me=this;
		if(records==null||records.length==0)
			return;
		
		var record=records[0];
		var dritem = record.original.dritem;
		if(dritem==null)
			return;
		
		var controller = me.getController();
		var layoutcard = me.getDRTab();
//		//判断有误对象
		if(record.id=='form')
		{
			layoutcard.setActiveItem(0);
			/*if (Ext.isFunction(controller.showCommandBar)){
				controller.showCommandBar(true);
			}*/
			return;
		}
	
		if(dritem.viewid == undefined || dritem.viewid=='')
			return;
		
		var parentKey='';
		if(me.parentData){
			parentKey = me.parentData.srfparentkey;
		}
		if(!parentKey || parentKey=='')
		{
			layoutcard.setActiveItem(0);
			IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDRBAR.ONSELECTIONCHANGE.INFO','请先建立主数据'),0);
			return;
		}
		
		var parentData = {};
		var viewParam = dritem.viewparam;
		if(!viewParam)
			return;
		if(true)
		{
			$.extend(parentData, viewParam);
			$.extend(parentData, me.parentData);
		}
		
		var viewItem = controller.getDRItemView(dritem);
		if(viewItem==null)
			return ;
		
		var itemid=layoutcard.id + '_'+ dritem.viewid.replace(new RegExp(':','g'),'_');
		layoutcard.setActiveItem(itemid);
		
		var subController = controller.getController(controller.getCId2()+viewItem.embedviewid);
		if(!subController.isInited())
		{
			subController.asyncInit({parentMode:viewParam,parentData:parentData,renderTo:itemid,subApp:viewItem.subapp,autoLayout:false});
			return;
		}
		
		subController.setParentData(parentData);
		subController.refresh();
		
	}
	
	,setParentData:function(pd){
		this.parentData=pd;
	}

});