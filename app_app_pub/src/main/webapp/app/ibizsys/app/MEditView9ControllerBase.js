/**
 * 多数据视图控制器对象
 */
var MEditView9ControllerBase = MDViewControllerBase.extend({
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
		if(me.hasHtmlElement('meditviewpanel')){
			var dataurl = me.config.backendurl+'srfctrlid=meditviewpanel&SRFSUBAPP='+me.subapp+'&';
			var dgCfg = $.extend({id:this.getCId2()+'meditviewpanel',url:dataurl,appctx:me.config.appctx,viewctrler:me});
			
			var panelStyle='TAB_TOP';
			if(me.config.ctrls && me.config.ctrls.meditviewpanel && me.config.ctrls.meditviewpanel.panelStyle)
				panelStyle=me.config.ctrls.meditviewpanel.panelStyle;
			
			if(panelStyle=='TAB_TOP')
				me.panel = new IBizMultiEditViewTabPanel(dgCfg);
			else if(panelStyle=='ROW')
				me.panel = new IBizMultiEditViewRowPanel(dgCfg);
			else
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MEDITVIEW9CONTROLLER.ONINIT.INFO','样式['+panelStyle+']嵌入式多编辑视图不支持！',[panelStyle]),2);
			
			if(me.panel){
				//注册选项页获取编辑视图控制器事件
				me.panel.on(IBizMultiEditViewPanel.FINDEDITVIEWCONTROLLER,function(sender,args,e){
					var me = e.data;
					me.onFindEditViewController(args);
				},me);
				
				me.registerItem('meditviewpanel',me.panel);
			}
		}
//		me.doLayout();
	},	
	/**
	 * 获取签入视图控制对象
	 */
	onFindEditViewController:function(args){
		var me = this;
		if(me.panel){
			var ctrler = me.createEditViewController(args);
			if(ctrler)
				me.panel.addEditViewCtrler(ctrler);
			else
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MEDITVIEW9CONTROLLER.ONFINDEDITVIEWCONTROLLER.INFO','未指定嵌入式视图控制器!'),2);

		}
	},
	/**
	 * 获取多项数据控件对象
	 */
	getMDCtrl: function() {
		return null;
	},
	onRefresh: function() {
		arguments.callee.$.onRefresh.call(this);
		var me = this;
		if (me.panel) {
			me.panel.refresh();
		}
	},
	/*
	 * 判断子数据是否需要保存，需要保存返回false，否则返回true
	 */
	saveDRData:function(){
		var me=this;
		
		if(me.panel && me.panel.isDirty()){
			me.panel.doSave();
			return false
		}
		return true;
	},
	onDRDataSaved:function(){
		me=this;
		me.fireEvent( 'DRDATASAVED', me,{});
	},
	createEditViewController:function(args){
		null; 
	}
});