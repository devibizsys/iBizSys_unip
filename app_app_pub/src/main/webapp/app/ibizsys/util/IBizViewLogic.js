/**
 * 视图逻辑
 */
var IBizViewLogic = IBizObject.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
	},
	init:function(){
		var me=this;
		if(me.getTrigger()=='TIMER')
		{
			if(me.getTimer() >1000){
				setInterval(function(){me.execute();},me.getTimer());
			}
			return;
		}
		if(me.getTrigger()=='VIEWEVENT')
		{
			if(me.getEventCtrl()&& me.getEventCtrl()!=''){
				var ctrl=me.getController().getItem(me.getEventCtrl());
				if(ctrl){
					ctrl.on(me.getEventName(),function(sender,args,e){
						var me = e.data;
						me.execute(args);
					},me);
				}
			}
			else
				{
					me.getController().on(me.getEventName(),function(sender,args,e){
						var me = e.data;
						me.execute(args);
					},me);
				}
			
		}
	},
	/*获取触发器类型*/
	getTrigger:function(){
		return this.config.trigger;
	},
	/*获取定时间隔*/
	getTimer:function()
	{
		return this.config.timer;
	},
	execute : function(arg){
		var handler = this.config.handler;
		if(handler && $.isFunction(handler.execute)){
			handler.execute(arg,this);
		}
       // this.config.handler.apply(this.config.scope || Ext.global, arguments);
    },
    getTag:function(){
    	return this.config.tag;
    },
    getController:function(){
    	return this.config.ctrler;
    },
    getEventCtrl:function(){
    	return this.config.eventctrl;
    },
    getEventName:function(){
    	return this.config.eventname;
    }
});