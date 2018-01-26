/**
 * 选择视图控制器对象
 */
var MPickupView2ControllerBase = MPickupViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
	
		me.treeexpbar = new IBizTreeExpBar({id:this.getCId2()+'treeexpbar',ctrler:this,pvpanel : me.getPickupViewPanel()});
		
		me.resultbar = new IBizMPickupResult({id:this.getCId2()+'resultbar',ctrler:this});
		//注册事件
		me.resultbar.on(IBizMPickupResult.SELECTIONCHANGE,me.onMultiSelectionChange,me);
	},
	
	getTreeExpBar:function(){
		return this.treeexpbar;
	}
});













