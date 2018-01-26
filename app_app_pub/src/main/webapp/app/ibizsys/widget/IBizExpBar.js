/**
 * 导航栏
 */
var IBizExpBar = IBizControl.extend({
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
			 	var me=e.data;
			    var i, j, r = [];
			    for(i = 0, j = data.selected.length; i < j; i++) {
			      r.push(data.instance.get_node(data.selected[i]));
			    }
			    me.onSelectionChange(data.instance,r,e);
			  });
		
		 $('#'+config.id).on('loaded.jstree', this,function (e, data) {
			   var me=e.data;
			  });
		 
		 
	}
	,parentData:null
	,getExpTab:function()
	{
		return this.config.tabctrl;
	}
	,onSelectionChange:function(tree,records,eOpts){
		
		var me=this;
		if(records==null||records.length==0)
			return;
		
		var record=records[0];
		var expitem = record.original.expitem;
		if(expitem==null)
			return;
		
		var controller = me.getController();
		var layoutcard = me.getExpTab();
	
		if(expitem.viewid == undefined || expitem.viewid=='')
			return;
			
		var parentData = {};
		var viewParam = expitem.viewparam;
		if(!viewParam)
			return;
		if(true)
		{
			$.extend(parentData, viewParam);
			$.extend(parentData, me.parentData);
		}
		
		var viewItem = controller.getExpItemView(expitem);
		if(viewItem==null)
			return ;
		
		var itemid=layoutcard.id + '_'+ expitem.viewid.replace(new RegExp(':','g'),'_');
		layoutcard.setActiveItem(itemid);
		
		var subController = controller.getController(controller.getCId2()+viewItem.embedviewid);
		if(!subController.isInited())
		{
			subController.asyncInit({parentMode:viewParam,parentData:parentData,renderTo:itemid});
			return;
		}
		
		subController.setParentData(parentData);
		subController.refresh();
		
		
//		var item = layoutcard.getComponent(itemid);
//		var bRefresh = true;
//		if(item==null){
//			
//			var viewParam = expitem.viewparam;
//			if(viewParam==null)
//				return;
//			console.log(viewParam);
//			//建立对象
//			var viewItem = controller.getExpItemView(expitem);
//			if(viewItem==null)
//			{
//				Ext.Msg.alert(Ext.String.format('没有配置对应的关系界面，标识值为[{0}]',expitem.viewid));
//				return;
//			}
//			console.log('create '+ viewItem.view );
//			item = Ext.create(viewItem.view, {id:itemid,border:false,parentMode:viewParam,parentData:parentData});
//			layoutcard.add(item);
//			bRefresh = false;
//		}
//		layoutcard.setActiveItem(itemid);
//		if (Ext.isFunction(controller.showCommandBar)){
//			controller.showCommandBar(false);
//		}
//		console.log(item);
//		var childController=item.lookupController();
//		console.log(childController);
//
//		if(bRefresh){
//			childController.setParentData(parentData);
//			childController.refresh();
//		}
	}
	
	,setParentData:function(pd){
		this.parentData=pd;
	}
//	,getContentPanel:function(){
//		var controller = this.lookupController();
//		var layoutcard = controller.lookupReference(this.contentpanel);
//		return layoutcard;
//	},
//	onStoreLoad: function (store, records, successful, eOpts) {
//		  var me=this;
//	      console.log('onStoreLoad ' + (successful ? 'yes' : 'false'));
//	      if (!successful) {
//	    	  Ext.Msg.alert("加载关系视图数据发生错误");
//	       }
//	      else
//	    	  {
//	    	  	me.getRootNode().expand();
//	    	  }
//	},

		
});