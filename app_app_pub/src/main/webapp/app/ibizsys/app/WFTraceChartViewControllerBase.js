/**
 * 工作流流程图页面
 */
var WFTraceChartViewControllerBase = MDViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	/**
	 * 初始化
	 */
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		if(!me.searchform){
			me.wftimeline.load();
		}
	},
	/**
	 * 执行初始化
	 */
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		var dataurl = me.config.backendurl+'srfctrlid=grid&SRFSUBAPP='+me.subapp+'&';
		me.wftimeline = new IBizWFTimeline({id:this.getCId2()+'wftimeline',url:dataurl});
		
		me.chartFrame = $('#'+this.getCId2()+'chatframe');
		me.chartFrame.load(function(){   
	        me.onChartFrameLoaded(); 
	    });  
		
		var url = BASEURL + "/ibizutil/wftracechartview.jsp?"+$.param(me.parentData);
		me.chartFrame.attr("src",url); 
	},
	getframeHeight:function(){
		var me = this;
		if(me.chartFrame){
			return me.chartFrame.height();
		}
		return 0;
	},
	onChartFrameLoaded:function(){
		var me = this;
		me.chartobj = me.chartFrame[0].contentWindow;
		if(me.chartobj){
			me.chartobj.init(this);
		}
	},
	onChartClickItem:function(item)
	{
		var me = this;
		if(me.wftimeline){
			me.wftimeline.selectItem(item);
		}
	},
	/**
	 * 获取多项数据控件对象
	 */
	getMDCtrl: function() {
		return this.getGrid();
	},
	getGrid:function(){
		return this.wftimeline;
	}
});