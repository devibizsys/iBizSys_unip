/**
 * 分页控件
 */	
var IBizExpTab =  IBizTab.extend({
	setActiveSubController:function(subController)
	{
		var me=this;
		me.activeSubController = subController;
		if(me.activeSubController != null){
			me.activeSubController.setSize(me.getWidth(),me.getHeight());
		}
	}
	,setSize:function(width,height){
		arguments.callee.$.setSize.call(this,width,height);
		var me = this;
		if(me.activeSubController != null){
			me.activeSubController.setSize(width,height);
		}
	}
});
/*****************事件声明************************/
