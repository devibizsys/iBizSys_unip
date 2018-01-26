/*门户视图*/
var PortalViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
	}
	,onInit:function(){
		arguments.callee.$.onInit.call(this);
		this.dashboard = new IBizDashboard({ctrler:this,id:this.getCId2()+'dashboard',url:this.getBackendUrl()+'srfctrlid=dashboard&'});
	},
	getDashboard:function(){
		return this.dashboard;
	}
});