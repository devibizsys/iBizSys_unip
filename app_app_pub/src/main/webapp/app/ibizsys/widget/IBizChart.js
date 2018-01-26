/**
 * 图表
 */
var IBizChart = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		me.chart = echarts.init(document.getElementById(this.getId()));
		me.chart.on('click',function(params){
			me.fireEvent(IBizChart.CLICK,me,params);
		});
		me.chart.on('dblclick',function(params){
			me.fireEvent(IBizChart.DBLCLICK,me,params);
		});
	},
	buildChart:function(ec){
		var me=this;
		
		var params={};
		me.fireEvent(IBizChart.BEFORELOAD,me,params);
		params.srfrender='ECHARTS3';
		params.srfaction = 'FETCH';
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			success:function(data){
				IBiz.endload(me.loadingTag);
				if(data.ret == 0){
					//呼出事件
					setTimeout(function(){
						me.fireEvent(IBizChart.LOADED,me,data);
			        }, 1);
					me.renderData(data);
					
				}else{
					IBiz.alert($IGM('IBIZCHART.BUILDCHART.TITLE','加载失败'),$IGM('IBIZCHART.BUILDCHART.INFO','加载数据失败,'+data.info,[data.info]),2);
				}	
			},failure:function(data){
				IBiz.endload(me.loadingTag);
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZCHART.AJAX.INFO','执行请求发生异常'),2);
			}
		});
	},
	load:function()
	{
		var me=this;
		me.buildChart();
	},
	renderData:function(data){
		var me = this;
		var opt = null;
		if(me.config.render){
			opt = me.config.render(data.items,data,me);
		}
		else
		{
			opt = {};
			if(me.config.baseopt)
				$.extend(opt, me.config.baseopt);
			if(data.data)
				$.extend(opt, data.data);
		}
		me.chart.setOption(opt,true);
	}
	,setSize:function(width,height){
		var me = this;
		var chart=$('#'+this.getId());
		chart.height(height);
		me.chart.resize();
	}
	,getChart:function(){
		var me=this;
		return me.chart;
	}
});

/*****************事件声明************************/
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizChart.BEFORELOAD = 'BEFORELOAD';

/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizChart.LOADED = 'LOADED';


/**
 * 双击
 */
IBizChart.DBLCLICK = 'DBLCLICK';



/**
 * 单击
 */
IBizChart.CLICK = 'CLICK';