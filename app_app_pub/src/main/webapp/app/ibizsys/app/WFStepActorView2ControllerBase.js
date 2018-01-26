/**
 * 工作流流程图页面
 */
var WFStepActorView2ControllerBase = MDViewControllerBase.extend({
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
			me.wftimeline2.load();
		}
	},
	/**
	 * 执行初始化
	 */
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		var dataurl = me.config.backendurl+'srfctrlid=grid&SRFSUBAPP='+me.subapp+'&';
		me.wftimeline = new IBizWFStepActor({id:this.getCId2()+'wficonview',url:dataurl});
		me.wftimeline.on(IBizWFStepActor.ROWDBLCLICK, function(sender,args,e){
			var me = e.data;
    		me.onDataActivated(args[0],e);
        }, me);	
		
		dataurl = me.config.backendurl+'srfctrlid=grid2&SRFSUBAPP='+me.subapp+'&';
		me.wftimeline2 = new IBizWFTimeline({id:this.getCId2()+'wftimeline',url:dataurl});
		
		
		me.wftimeline2.on(IBizDataGrid.BEFORELOAD, function(sender, args, e) {
			me.onStoreBeforeLoad(sender, args,e);
		}, me);
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
	/*onDataActivated:function(item,args){
		alert(args);
	}*/
});