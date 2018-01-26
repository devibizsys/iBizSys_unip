/**
 * 多数据视图控制器对象
 */
var DataViewControllerBase = MDViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		if(!me.getSearchForm()){
			if(me.getDataView())
				me.getDataView().load();
		}
	},
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		
		if(me.hasHtmlElement('dataview')){
			var dataurl = me.config.backendurl+'srfctrlid=dataview&SRFSUBAPP='+me.subapp+'&';
			//初始化主数据视图
			me.dataview = me.createDataView({id:this.getCId2()+'dataview',columns:me.config.ctrls.dataview.columns,url:dataurl});
			if(me.dataview){
				me.dataview.on(IBizDataView.ROWDBLCLICK, function(sender,args,e){
					var me = e.data;
		    		//me.onDataActivated(me.dataview,args);
		    		me.onDataActivated(args,e);
		        }, me);	
//				me.dataview.on(IBizDataView.SELECTIONCHANGE, function(sender,args,e){
//					var me = e.data;
//		    		me.onSelectionChange(me.dataview,args);
//		        }, me);	
			}
		}
	},
	createDataView:function(arg){
		return IBiz.createDataView(arg);
	},
	getMDCtrl: function() {
		return this.getDataView();
	},
	getDataView:function(){
		return this.dataview;
	}
//	,
//	onDataActivated:function(item,args){
//	},
//	onSelectionChange:function(item,args){
//	}
});