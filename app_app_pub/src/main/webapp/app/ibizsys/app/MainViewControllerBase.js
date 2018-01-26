/*主视图控制器对象*/
var MainViewControllerBase = ViewControllerBase.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		this.config = $.extend({}, this.config, config);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
		this.caption = null;
		this.calcToolbarItemState(false);
	},
	onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;
		//初始化工具栏
		if(me.hasHtmlElement('toolbar')){
			me.toolbar = me.createToolbar({id:this.getCId2()+'toolbar',ctrler: me});
			me.toolbar.on(IBizToolbar.ITEMCLICK,function(sender,args,e){
				var me = e.data;
				me.onClickTBItem(args);
			},me);
		}
	},
	createToolbar:function(config){
		return IBiz.createToolbar(config);
	},
	/**
	 * 点击按钮
	 * @param tag 事件源
	 */
	onClickTBItem : function(params) {
		var me = this;
		var uiaction = me.getUIAction(params.tag);
		me.doUIAction(uiaction, params);
	},
	doUIAction : function(uiaction, params) {
		var me = this;
		if(uiaction && (typeof uiaction == 'string')){
			uiaction =me.getUIAction(uiaction);
		}
		if (uiaction) {
			if (uiaction.type == 'DEUIACTION') {
				me.doDEUIAction(uiaction, params);
				return;
			}
			if (uiaction.type == 'WFUIACTION') {
				me.doWFUIAction(uiaction, params);
				return;
			}
		}
	},
	/**
	 * 获取前台行为参数
	 * 
	 * @param uiaction
	 *            行为
	 */
	getFrontUIActionParam : function(uiaction,params) {
		var me = this;
		var arg = {};
		if(uiaction.refreshview){
			arg.callback=function(win){
				me.refresh();
			}
		}
		return arg;
	},

	/**
	 * 获取后台行为参数
	 * 
	 * @param uiaction
	 *            行为
	 */
	getBackendUIActionParam : function(uiaction,params) {
		return {};
	},
	/**
	 * 打开界面行为视图
	 * @param uiaction 行为
	 */
	openUIActionView:function(frontview,viewparam)
	{
		var me = this;
		var callback;
		if(viewparam && viewparam.callback){
			callback = viewparam.callback;
			delete viewparam.callback;
		}
		var win = $.getIBizApp().createWindow({});
		win.scope = me;
		win.title = frontview.title;
		win.height = frontview.height ? frontview.height: 0;
		win.width = frontview.width ? frontview.width: 0;
		win.url = $.getIBizApp().parseURL2(	frontview.subapp,frontview.viewurl, {windowid : win.getId(),openerid : me.getId()});
		win.viewparam = viewparam;
		win.callback = function(win) {
			if(callback && typeof(callback) == 'function'){
				callback({win:win});
			}
		}
		
		var modal=false;
		if(frontview.openMode=='POPUPMODAL')
		{
			modal = true;
		}
		if(modal){
			win.openModal(window);
		} else {
			win.openInNewWindow(window);
		}
	},
	/**
	 * 执行实体行为
	 * @param uiaction 行为
	 */
	doDEUIAction : function(uiaction, params) {
		var me = this;
		if (uiaction.actionmode == 'FRONT') {
			if ((uiaction.fronttype == 'WIZARD')||(uiaction.fronttype == 'SHOWPAGE')) {
				var viewparam = me.getFrontUIActionParam(uiaction,params);
				if (!viewparam) {
					viewparam = {};
				}
				var frontview=uiaction.frontview;
				if(frontview.redirectview)
				{
					var param={};
					param['srfviewparam'] = JSON.stringify(viewparam);
					param['srfaction'] = 'GETRDVIEW';
					//远程请求
					IBiz.ajax({
						url: me.getAppCtx()+frontview.backendurl,
						params: param,
						method: 'POST',
						dataType: 'json',
						success: function(data) {
							if (data.ret == 0) {
								if(data.rdview)
									me.openUIActionView(data.rdview,viewparam);
								else
								{
									IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MAINVIEWCONTROLLER.DODEUIACTION.INFO','无法打开视图,'+data.info,[data.info]),1);
								}
							} else {
								IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MAINVIEWCONTROLLER.DODEUIACTION.INFO','无法打开视图,'+data.info,[data.info]),2);
							}
						},
						failure: function(e) {
							IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MAINVIEWCONTROLLER.AJAX.INFO','获取打开视图失败,请求异常'),2);
						}
					});
					return;
				}
				me.openUIActionView(frontview,viewparam);
				return;
			}

			if (uiaction.fronttype == 'OPENHTMLPAGE') {
				var url = $.getIBizApp().parseURL2(null,uiaction.htmlpageurl, me.getFrontUIActionParam(uiaction,params));
				window.open(url, '_blank');
				return;
			}
		}

		if (uiaction.actionmode == 'BACKEND') {
			var param = me.getBackendUIActionParam(uiaction,params);
			if (param == null)
				return;
			param.srfuiactionid = uiaction.tag;
			if (uiaction.confirmmsg) {
				IBiz.confirm(uiaction.confirmmsg, function(result) {
					if (result) {
						me.doBackendUIAction(param);
					}
				});
			} else {
				me.doBackendUIAction(param);
			}
			return;
		}
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误'),$IGM('MAINVIEWCONTROLLER.DODEUIACTION.INFO2','未处理的实体行为['+uiaction.tag+']',[uiaction.tag]), 2);
	},
	/**
	 * 执行工作流行为
	 * @param uiaction 行为
	 */
	doWFUIAction : function(uiaction, params) {
		var me = this;
		if (uiaction.actionmode == 'WFFRONT') {
			if ((uiaction.fronttype == 'WIZARD')||(uiaction.fronttype == 'SHOWPAGE')) {
				var win = $.getIBizApp().createWindow({});

				var viewparam = me.getFrontUIActionParam(uiaction,params);

				if (!viewparam) {
					viewparam = {};
				}
				viewparam['windowid'] = win.getId();
				viewparam['openerid'] = me.getId();

				$.extend(viewparam, uiaction.frontview.viewparam);
				win.scope = me;
				win.title = uiaction.frontview.title;
				win.height = uiaction.frontview.height ? uiaction.frontview.height
						: 0;
				win.width = uiaction.frontview.width ? uiaction.frontview.width
						: 0;
				win.url = $.getIBizApp().parseURL2(
						uiaction.frontview.subapp,
						uiaction.frontview.viewurl, {
							windowid : win.getId(),
							openerid : me.getId()
						});
				win.viewparam = viewparam;
				win.callback  = function(win){
					me.onWFUIFrontWindowClosed(win);
				};

				if (true) {// uiaction.frontview.modal){
					win.openModal(window);
				} else {
					win.openInNewWindow(window);
				}
				return;
			}
		}
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误'),$IGM('MAINVIEWCONTROLLER.DOWFUIACTION.INFO','未处理的实体工作流行为['+uiaction.tag+']',[uiaction.tag]), 2);
	},
	onWFUIFrontWindowClosed : function(win, data) {

	},
	/**
	 * 执行后台行为
	 * 
	 * @param uiaction
	 *            行为
	 */
	doBackendUIAction : function(uiaction) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误'),$IGM('MAINVIEWCONTROLLER.DOBACKENDUIACTION.INFO','未处理的后台界面行为['+uiaction.tag+']',[uiaction.tag]), 2);
	},

	/**
	 * 是否-模式框显示
	 */
	isShowModal : function() {
		return false;
	},

	/**
	 * 关闭窗口
	 */
	closeWindow : function() {
		var me = this;
		var win = me.getWindow();
		if (win) {
			win.close(window);
		}
		else
			{
				window.close();
			}
	},
	
	getWindow:function(){
		var me=this;
		try
		{
			if(me.window)
			{
				var curwindow = $.getIBizApp().findWindow(me.window.getId());
				if(curwindow!=me.window)
				{
					 me.window = null;
				}
			}
		}
		catch(e)
		{
			 me.window = null;
		}
		return me.window;
	},
	/**
	 * 获取标题
	 */
	getCaption : function() {
		return this.caption;
	},

	/**
	 * 设置标题
	 * 
	 * @param caption
	 *            标题
	 */
	setCaption : function(caption) {
		if (this.caption != caption) {
			this.caption = caption;
			this.fireEvent(MainViewControllerBase.CAPTIONCHANGED, this,
					this.caption);
		}
	},

	/**
	 * 获取工具栏
	 */
	getToolbar : function() {
		return this.toolbar;
	},

	/**
	 * 计算工具栏项状态-<例如 根据是否有选中数据,设置 工具栏按钮是否可点击>
	 * 
	 * @param hasdata
	 *            是否有数据
	 */
	calcToolbarItemState : function(hasdata,dataaccaction) {
		if (this.toolbar && this.toolbar.items) {
			$.each(this.toolbar.items, function(index, ele) {
				var target = ele.attr('data-ibiz-target');
				if (target == 'SINGLEKEY' || target == 'MULTIKEY') {
					ele.prop('disabled', !hasdata);
				}
			});
			this.toolbar.updateAccAction(dataaccaction);
		}
	},
	/**
	 * 获取引用视图	
	 */
	getReferView : function() {
		var me = this;
		if (me.pageparams && me.pageparams.openerid) {
			return $.getIBizApp().getSRFView(me.pageparams.openerid);
		}
		return null;
	}
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
MainViewControllerBase.CAPTIONCHANGED = 'CAPTIONCHANGED';
