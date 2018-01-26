/**
 * 计数器
 */
var IBizCounter = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		me.counterid = me.config.counterid;
		me.tag = me.config.tag;
		me.counterparam = JSON.stringify(me.config.counterparam);
		me.timer = me.config.timer;
		me.url = me.getController().getBackendUrl();
		if(me.timer >1000){
			setInterval(function(){me.reload();},me.timer);
		}
		me.reload();
	},
	/*
	 *  刷新计数器
	 */
	reload:function(){
		var me = this;
		var params = {};
		params['srfcounterid'] = me.counterid;
		params['srfaction'] = 'FETCH';
		params['srfcounterparam'] = me.counterparam;
		IBiz.ajax({url:me.url,
			params:params,
			method:'POST',
			dataType:'json',
			success:function(data){
				if(data.ret == 0){
					me.setData(data);
				}else{
					console.log('加载计数数据异常.'+data.info);
				}
			},
			failure:function(e){
				
			}	
		});	
	},
	setData:function(data){
		var me = this;
		me.result = data;
		me.data = data.data;
		me.fireEvent(IBizCounter.COUNTERCHANGED, me, me.data);
	},
	getResult:function(){
		var me = this;
		return me.result;
	},
	getData:function(){
		var me = this;
		return me.data;
	}
});
/*****************事件声明************************/
/**
 * 计数发生变化
 */
IBizCounter.COUNTERCHANGED="COUNTERCHANGED"