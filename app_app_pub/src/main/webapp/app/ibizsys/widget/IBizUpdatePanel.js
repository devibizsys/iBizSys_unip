/**
 * 更新面板
 */
var IBizUpdatePanel = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		//me.counterid = me.config.counterid;
		me.name = me.config.name;
		//me.counterparam = name.stringify(me.config.counterparam);
		me.timer = me.config.timer;
		me.url = me.getController().getBackendUrl();
		if(me.timer >1000){
			setInterval(function(){
				var params = {};
				if(me.lastParams){
					$.extend(params,me.lastParams);
				}
				me.reload(params);},me.timer);
		}
		me.reload();
	},
	/*
	 *  刷新更新面板
	 */
	reload:function(params){
		var me = this;
		if(!params)
			params = {};
		
		//备份最后信息
		me.lastParams = null;
		me.lastParams = {};
		$.extend(me.lastParams,params);
		
		
		params['srfctrlid'] = me.name;
		params['srfaction'] = 'FETCH';
		IBiz.ajax({url:me.url,
			params:params,
			method:'POST',
			dataType:'json',
			success:function(data){
				if(data.ret==0){
					$('#'+me.getId()).html(data.content);
				}
				else{
					$('#'+me.getId()).html(data.info);
				}
			},
			failure:function(e){
				$('#'+me.getId()).html($IGM('PANEL.AJAX.INFO','请求发生错误！'));
			}	
		});	
	}
});
