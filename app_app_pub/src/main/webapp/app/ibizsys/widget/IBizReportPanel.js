/**
 * 报表框架
 */
var IBizReportPanel = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
	},
	buildReport:function(ec){
		var me=this;
		
		var params={};
		me.fireEvent(IBizReportPanel.BEFORELOAD,me,params);
		
		delete params['srfaction'];
		params['srfreportid']=me.config.reportid;
		var repframe = $('#'+this.getId());
		if(repframe[0])
		{
			var viewurl=me.config.reporturl;
			if(!viewurl||viewurl==''){
				viewurl = BASEURL+'/ibizutil/report.pdf';
			}
			else
			{
				viewurl = BASEURL+viewurl;
			}
			viewurl = viewurl + (viewurl.indexOf('?')==-1?'?':'&') + $.param(params);
			repframe.attr('src', viewurl);  
		}
			
	},
	load:function()
	{
		var me=this;
		me.buildReport();
	}
	,setSize:function(width,height){
		var me = this;
		var chart=$('#'+this.getId());
		chart.height(height);
	}
//	,getChart:function(){
//		var me=this;
//		return me.chart;
//	}
});

/*****************事件声明************************/
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizReportPanel.BEFORELOAD = 'BEFORELOAD';

/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizReportPanel.LOADED = 'LOADED';

