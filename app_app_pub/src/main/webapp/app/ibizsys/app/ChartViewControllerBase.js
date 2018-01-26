/**
 * 数据图表视图控制器对象
 */
var ChartViewControllerBase = SearchViewControllerBase.extend({
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
			me.getChart().load();
		}
	},
	/**
	 * 执行初始化
	 */
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;

		if(me.hasHtmlElement('chart')){
			var dataurl = me.config.backendurl+'srfctrlid=chart&SRFSUBAPP='+me.subapp+'&';
			//初始化图表
			var dgCfg = $.extend({id:this.getCId2()+'chart',url:dataurl},me.config.ctrls.chart);
			me.chart = me.createChart(dgCfg);
			me.chart.on(IBizChart.LOADED, function(sender, args, e) {
				me.onStoreLoad(sender, args,e);
			}, me);
			me.chart.on(IBizChart.BEFORELOAD, function(sender, args, e) {
				me.onStoreBeforeLoad(sender, args,e);
			}, me);
			me.chart.on(IBizChart.DBLCLICK, function(sender,args,e){
				var me = e.data;
	    		me.onDataActivated(args,e);
	        }, me);	
			me.registerItem('chart',me.chart);
		}
		me.doLayout();
	},
	createChart:function(config){
		return new IBizChart(config);
	},
	setSize:function(width,height){
		arguments.callee.$.setSize.call(this,width,height);
	},
	getChart:function(){
		return this.chart;
	},
	onSearchFormSearched: function() {
		if (this.getChart()) {
			this.getChart().load();
		}
	},
	onSearchFormReseted: function() {
		if (this.getChart()) {
			this.getChart().load();
		}
	}
	,onRefresh: function() {
		arguments.callee.$.onRefresh.call(this);
		var me = this;
		if (me.getChart()) {
			me.getChart().load();
		}
	}
	
});