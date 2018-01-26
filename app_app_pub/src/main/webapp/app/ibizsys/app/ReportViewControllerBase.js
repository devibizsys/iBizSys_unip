/**
 * 报表视图控制器对象
 */
var ReportViewControllerBase = SearchViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	/**
	 * 初始化
	 */
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		if(!me.getSearchForm()){
			me.getReportPanel().load();
		}
	},
	/**
	 * 执行初始化
	 */
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;

		var dataurl = me.config.backendurl+'srfctrlid=reportpanel&SRFSUBAPP='+me.subapp+'&';
		//初始化图表
		var dgCfg = $.extend({id:this.getCId2()+'reportpanel',url:dataurl},me.config.ctrls.reportpanel);
		me.reportpanel = new IBizReportPanel(dgCfg);
//		me.reportpanel.on(IBizReportPanel.LOADED, function(sender, args, e) {
//			me.onStoreLoad(sender, args,e);
//		}, me);
		me.reportpanel.on(IBizReportPanel.BEFORELOAD, function(sender, args, e) {
			me.onStoreBeforeLoad(sender, args,e);
		}, me);
		
		me.registerItem('reportpanel',me.reportpanel);
		me.doLayout();
	},
	setSize:function(width,height){
		arguments.callee.$.setSize.call(this,width,height);
	},
	getReportPanel:function(){
		return this.reportpanel;
	},
	onSearchFormSearched: function() {
		if (this.getReportPanel()) {
			this.getReportPanel().load();
		}
	},
	onSearchFormReseted: function() {
		if (this.getReportPanel()) {
			this.getReportPanel().load();
		}
	}
	,onRefresh: function() {
		arguments.callee.$.onRefresh.call(this);
		var me = this;
		if (me.getReportPanel()) {
			me.getReportPanel().load();
		}
	}
	
});