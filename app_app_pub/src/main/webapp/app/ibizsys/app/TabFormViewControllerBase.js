/**
 * 分页表单多数据视图控制器对象
 */
var TabFormViewControllerBase = MDViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	/**
	 * 初始化
	 */
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		
	},
	/**
	 * 执行初始化
	 */
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		
	$Ajax(me.getBackendUrl()+'&srfctrlid=grid');
//		
//		
//		if(me.hasHtmlElement('grid')){
//			var dataurl = me.config.backendurl+'srfctrlid=grid&SRFSUBAPP='+me.subapp+'&';
//			//初始化主表格
//			var dgCfg = $.extend({id:this.getCId2()+'grid',url:dataurl},me.config.ctrls.grid);
//			dgCfg.multiselect=me.isEnableMultiSelect();
//			me.datagrid = me.createGrid(dgCfg);
//			me.datagrid.on(IBizDataGrid.ROWDBLCLICK, function(sender,args,e){
//				var me = e.data;
//	    		me.onDataActivated(args,e);
//	        }, me);	
//			me.registerItem('grid',me.datagrid);
//		}
//		me.doLayout();
	},
//	createGrid:function(config){
//		return IBiz.createGrid(config);
//	},
	setSize:function(width,height){
		arguments.callee.$.setSize.call(this,width,height);
	},
	/**
	 * 获取多项数据控件对象
	 */
	getMDCtrl: function() {
		return null;
	},
	/*
	 * 判断子数据是否需要保存，如果需要，返回false，否则返回true
	 */
	saveDRData:function(){
		//
		//
		var me=this;
		//me.fireEvent( 'DRDATASAVED', me,{});
		return false;
	},
	getNewDataView:function(){
		return {};
	},
	getEditDataView:function(){
		return {};
	}
});

