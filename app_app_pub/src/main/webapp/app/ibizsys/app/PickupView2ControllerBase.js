/**
 * 选择视图控制器对象
 */
var PickupView2ControllerBase = PickupViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
	
		me.treeexpbar = new IBizTreeExpBar({id:this.getCId2()+'treeexpbar',name:'treeexpbar',ctrler:this,pvpanel : me.getPickupViewPanel()});
		
		me.registerItem('treeexpbar',me.treeexpbar);
		
		me.doLayout();
	},
	getTreeExpBar:function(){
		return this.treeexpbar;
	},
	setSize:function(width,height){
		arguments.callee.$.setSize.call(this,width,height);
		var me = this;
		me.treeexpbar.setSize(width,height);
	}
});













