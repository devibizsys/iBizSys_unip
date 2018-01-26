/**
 * 拾取数据视图面板
 */	
var IBizPickupViewPanel =  IBizViewPanel.extend({
	parentData: null,
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		//加载默认视图
		for(var i=0;i<10;i++){
			var viewid='pickupviewpanel'+((i==0)?'':i.toString());
			var viewitem = this.getController().getPickupViewItem({viewid:viewid});
			if(viewitem!=null){
				me.activeViewItem(viewid);
				return;
			}
		}
	},
	setSize:function(width,height){
		var me = this;
		$('#'+me.id+'_pickupviewpanel').width(width);
		$('#'+me.id+'_pickupviewpanel').height(height);
		if(me.activeSubController != null){
			me.activeSubController.setSize(width,height);
		}
	},
	/**
	 * 激活视图
	 */
	activeViewItem:function(viewid)
	{
		var me=this;
		var controller = this.getController();
		var viewitem = controller.getPickupViewItem({viewid:viewid});
		var itemid=this.getId() + '_'+ viewid.replace(new RegExp(':','g'),'_');
		
		me.setActiveItem(itemid);

		var subController = controller.getController(controller.getCId2()+viewitem.embedviewid);
		
		me.activeSubController = subController;
		
		if(!subController.isInited())
		{
			if(controller.getViewParam().srfreferdata)
			{
				subController.getViewParam().srfreferdata = controller.getViewParam().srfreferdata;
			}
			
			if($.isFunction(controller.isEnableMultiSelect) && $.isFunction(subController.setEnableMultiSelect)){
				subController.setEnableMultiSelect(controller.isEnableMultiSelect());
			}

			subController.asyncInit({parentData:me.parentData,renderTo:itemid,referData:controller.getReferData()});
			subController.on(IBizPickupViewPanel.SELECTIONCHANGE, me.onSelectionChange, me);
			subController.on(IBizPickupViewPanel.DATAACTIVATED, me.onDataActivated, me);
			return;
		}
		subController.setParentData(me.parentData);
		subController.refresh();
		
	},
	getAllData:function(){
		var me = this;
		
		if(me.activeSubController){
			return me.activeSubController.getAllData();
		}
		
		return [];
	},
	onSelectionChange: function (item,args,e) {
	    var me = e.data;
	    me.fireEvent(IBizPickupViewPanel.SELECTIONCHANGE, me, args);
	},
	onDataActivated: function (item, args,e) {
		var me = e.data;
	    me.fireEvent(IBizPickupViewPanel.DATAACTIVATED, me, args);
	}, 
	setParentData: function (pd) {
	    var me=this;
		me.parentData = pd;
	    if(me.activeSubController)
	    {
	    	var subController = me.activeSubController;
	    	subController.setParentData(me.parentData);
	    	subController.refresh();
	    }
	    else
	    	{
	    	
	    	}
	}, 
	refreshViewPanel: function () {
	    var me = this;
	    if(me.activeSubController)
	    {
	    	 me.activeSubController.refresh();
	    }	
	}	
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
IBizPickupViewPanel.SELECTIONCHANGE = 'SELECTIONCHANGE';
/**
 * 双击行
 */
IBizPickupViewPanel.DATAACTIVATED = 'DATAACTIVATED';



