/**
 * 编辑视图控制器对象
 */
var EditViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this, config);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);

		var me = this;
		me.form.init();
		
		var params = $.extend(me.viewparam,me.parentData);
		me.form.autoLoad(params);
		this.initFloatToolbar();
		
		if(document.getElementById("form_nav")){
			$(".form-body").css("padding-right","186px");
			var group_nabs = $("div.ibiz-form-formgroup");
			var flag = false;
			$("#form_nav").on("click","div", function(e){
				flag = true;
				$("#form_nav").find(".action").removeClass("action");
				$(e.target).addClass("action");
				var top = $(window).scrollTop();
				$("html, body").animate({
					scrollTop: $($(e.target).attr("name")).offset().top-50 }, {duration: 500,easing: "swing"});
				var scrollId = setInterval(function(){
					if($(window).scrollTop() != top){
						top = $(window).scrollTop()
						return ;
					}
					flag = false;
					clearInterval(scrollId);
				},200);
				
			});
			$(window).scroll(function(){
				if(flag)
					return;
				for(var i=group_nabs.length-1;i>=0;i--){
					var top = group_nabs.eq(i).offset().top-50;
					if($(window).scrollTop()>top){
						$("#form_nav").find(".action").removeClass("action");
						$("#form_nav div[name='#"+group_nabs.eq(i).attr("id")+"']").addClass("action");
						break;
					}
				}
			});
		}
		//是否弹出
	},
	addEditMenu: function(){
		
	},
	unloaded:function(){
		//判断表单是否修改了
		var me = this;
		if(me.form.isDirty()){
			return $IGM('EDITVIEWCONTROLLER.UNLOADED.INFO',"表单已经被修改是否关闭");
		}
		return null;
	},
	onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;

		if(me.hasHtmlElement('mintoolbar')){
			me.mintoolbar = me.createToolbar({id:this.getCId2()+'mintoolbar',ctrler: me});
			me.mintoolbar.on(IBizToolbar.ITEMCLICK,function(sender,args,e){
				var me = e.data;
				me.onClickTBItem(args);
			},me);
		}
		if(me.hasHtmlElement('floattoolbar')){
			me.floattoolbar = me.createToolbar({id:this.getCId2()+'floattoolbar',ctrler: me});
			me.floattoolbar.on(IBizToolbar.ITEMCLICK,function(sender,args,e){
				var me = e.data;
				me.onClickTBItem(args);
			},me);
		}
		if(me.hasHtmlElement('caption')){
			me.datainfobar = me.createDataInfoBar({id:this.getCId2()+'caption',ctrler: me});
		}
		if(me.hasHtmlElement('form')){
			var dataurl = me.getBackendUrl()+'srfctrlid=form&SRFSUBAPP='+me.subapp+'&';
			me.form = me.createEditForm({id:this.getCId2()+'form',url:dataurl,ctrler: me});
			me.form.on(IBizForm.FORMSAVED, function(sender, args, e) {
				me.onFormSaved(args);
			}, me);
			me.form.on(IBizForm.FORMLOADED, function(sender, args, e) {
				me.onFormLoaded();
			}, me);
			me.form.on(IBizForm.FORMREMOVED, function(sender, args, e) {
				me.onFormRemoved();
			}, me);
			me.form.on(IBizForm.FORMWFSTARTED, function(sender, args, e) {
				me.onFormWFStarted();
			}, me);
			me.form.on(IBizForm.FORMWFSUBMITTED, function(sender, args, e) {
				me.onFormWFSubmitted();
			}, me);
			me.form.on(IBizEditForm.UIACTIONFINISHED, function(sender, args, e) {
				if(args.reloadData)
					me.refreshReferView();
				if(args.closeEditview)
					me.closeWindow();
			}, me);
			me.form.on(IBizForm.FORMFIELDCHANGED, function(sender, args, e) {
				var fieldname = '';
				if (sender != null) fieldname = sender.getName();
				if (!args) args = {};
				me.onFormFieldChanged(fieldname, sender, args.newvalue, args.oldvalue);
			}, me);
			me.form.on(IBizForm.DATAACCACTIONCHANGE, function(sender, args, e) {
				me.onDataAccActionChange(args);
			}, me);
			me.registerItem('form',me.form);
		}
		me.doLayout();
	},
	createEditForm:function(config){
    	return IBiz.createEditForm(config);
    },
    createDataInfoBar:function(config){
    	return IBiz.createDataInfoBar(config);
    },
	/**
	 * 表单权限发生变化
	 */
	onDataAccActionChange:function(dataaccaction){
		var me = this;
		if(me.getToolbar())
			me.getToolbar().updateAccAction(dataaccaction);
		if(me.mintoolbar)
			me.mintoolbar.updateAccAction(dataaccaction);
		if(me.floattoolbar)
			me.floattoolbar.updateAccAction(dataaccaction);
	},
	onSetParentData: function () {
		var me = this;
		if(me.isInited() == true){
			if(me.parentData){
				var params = $.extend(me.viewparam,me.parentData);
				me.form.autoLoad(params);
			}
		}	
    },
	/**
	 * 获取表单对象
	 */
	getForm:function(){
		return this.form;
	},
	/**
	 * 获取数据信息区对象
	 */
	getDataInfoBar: function() {
		var me = this;
		return me.datainfobar;
	},
	/**
	 * 表单保存完成
	 */
	onFormSaved: function(result) {
		var me = this;
		me.refreshReferView();
		if (me.afterformsaveaction == 'exit') {
			var window = me.getWindow();
			if (window) {
				window.dialogResult = 'ok';
				window.activeData = me.getForm().getValues();
			}
			me.closeWindow();
			return;
		}
		if (me.afterformsaveaction == 'new') {
			var arg = me.getViewParam();
			if (arg == null || arg == undefined) arg = {};
			me.getForm().loadDraft(arg);
			return;
		}
		
		if (me.afterformsaveaction == 'dowfuiaction')
		{
			me.afterformsaveaction = 'dowfuiactionok';
			me.doWFUIAction(me.lastwfuiaction,me.lastwfuaparam);
			return;
		}

		if (me.afterformsaveaction == 'startwf') {
			me.startWF();
		}
		else
		{
			//判断是否已经出现过提示
			if(!result || !result.info){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'),$IGM('EDITVIEWCONTROLLER.ONFORMSAVED.INFO','数据保存成功！'),1);
			}
		}
		me.updateViewInfo();
	},
	onFormLoaded: function() {
		var me = this;
		me.updateViewInfo();
	},
	onFormWFStarted: function() {
		var me = this;
		me.refreshReferView();
		me.closeWindow();
	},
	onFormWFSubmitted: function() {
		var me = this;
		me.refreshReferView();
		me.closeWindow();
	},
	updateViewInfo: function() {
		var me = this;
		var newdata = false;
		var field = me.getForm().findField('srfuf');
		if (field != null) {
			newdata = field.getValue() != '1';
		}
		var dataAccAction = me.getForm().getDataAccAction();
		me.calcToolbarItemState(!newdata, dataAccAction);
		if (newdata) {
			me.setCaption('&lt;'+$IGM('EDITVIEWCONTROLLER.UPDATEVIEWINFO.CONTENT','新建')+'&gt;');
			if (me.getDataInfoBar()) {
				me.getDataInfoBar().setCurrentData({
					srfkey: '',
					srfmajortext: '&lt;'+$IGM('EDITVIEWCONTROLLER.UPDATEVIEWINFO.CONTENT','新建')+'&gt;'
				});
			}
		} else {
			field = me.getForm().findField('srfmajortext');
			if (field != null) {
				var value = field.getValue();
				me.setCaption(value);
				if (me.getDataInfoBar()) {
					field = me.getForm().findField('srfkey');
					keyvalue = field.getValue();
					me.getDataInfoBar().setCurrentData({
						srfkey: keyvalue,
						srfmajortext: value
					});
				}
			}
		}
	},
	onFormRemoved: function() {
		var me = this;
		me.refreshReferView();
		me.closeWindow();
	},
	onFormFieldChanged: function(fieldname, field, value) {
		var me = this;
	},
	doDEUIAction: function(uiaction,params) {
		var me = this;
		if (uiaction.tag == 'Help') {
			me.doHelp();
			return;
		}
		if (uiaction.tag == 'SaveAndStart') {
			me.doSaveAndStart();
			return;
		}
		if (uiaction.tag == 'SaveAndExit') {
			me.doSaveAndExit();
			return;
		}
		if (uiaction.tag == 'SaveAndNew') {
			me.doSaveAndNew();
			return;
		}
		if (uiaction.tag == 'Save') {
			me.doSave();
			return;
		}
		if (uiaction.tag == 'Print') {
			me.doPrint();
			return;
		}
		if (uiaction.tag == 'Copy') {
			me.doCopy();
			return;
		}
		if (uiaction.tag == 'RemoveAndExit') {
			me.doRemoveAndExit();
			return;
		}
		if (uiaction.tag == 'Refresh') {
			me.doRefresh();
			return;
		}
		if (uiaction.tag == 'New') {
			me.doNew();
			return;
		}
		if (uiaction.tag == 'FirstRecord') {
			me.doMoveToRecord('first');
			return;
		}
		if (uiaction.tag == 'PrevRecord') {
			me.doMoveToRecord('prev');
			return;
		}
		if (uiaction.tag == 'NextRecord') {
			me.doMoveToRecord('next');
			return;
		}
		if (uiaction.tag == 'LastRecord') {
			me.doMoveToRecord('last');
			return;
		}
		if (uiaction.tag == 'Exit' || uiaction.tag == 'Close') {
			me.doExit();
			return;
		}
		arguments.callee.$.doDEUIAction.call(this,uiaction,params);
	},	
	doHelp: function() {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'),$IGM('EDITVIEWCONTROLLER.DOHELP.INFO','编辑界面_帮助操作！'),5);
	},
	doSaveAndStart: function() {
		var me = this;
		me.afterformsaveaction = 'startwf';
		me.saveData({});
	},
	doSaveAndExit: function() {
		var me = this;
        me.afterformsaveaction = 'exit';
        var window = me.getWindow();
        if (window) {
            window.dialogResult = 'cancel';
        }
		me.saveData({});
	},
	doSaveAndNew: function() {
		var me = this;
		me.afterformsaveaction = 'new';
		me.saveData({});
	},
	doSave: function() {
		var me = this;
		me.afterformsaveaction = '';
		me.saveData({});
	},
	doPrint: function() {
		var me = this;
		var arg = {};
		arg.srfkey = '';
		var field = me.getForm().findField('srforikey');
		if (field) {
			arg.srfkey = field.getValue();
		}
		if (arg.srfkey == undefined || arg.srfkey == '') {
			field = me.getForm().findField('srfkey');
			if (field) {
				arg.srfkey = field.getValue();
			}
		}
		if(arg.srfkey=='')
			return;
		me.onPrintData(arg);
	},
	doCopy: function() {
		var me = this;
		var arg = {};
		$.extend(arg, me.getViewParam());
		arg.srfkey = '';
		var field = me.getForm().findField('srforikey');
		if (field) {
			arg.srfsourcekey = field.getValue();
		}
		if (arg.srfsourcekey == undefined || arg.srfsourcekey == '') {
			field = me.getForm().findField('srfkey');
			if (field) {
				arg.srfsourcekey = field.getValue();
			}
		}
		if (arg.srfsourcekey == undefined || arg.srfsourcekey == '') {
			IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'),$IGM('EDITVIEWCONTROLLER.DOCOPY.INFO','当前表单未加载数据，不能拷贝'),0);
			return;
		}
		me.getForm().autoLoad(arg);
	},
	doRemoveAndExit: function() {
		var me = this;
		IBiz.confirm($IGM('EDITVIEW9CONTROLLERBASE.DOREMOVEANDEXIT.INFO','确认要删除当前数据，删除操作将不可恢复？'), function(result) {
			if (result) {
				me.removeData();
			}
		});
	},
	doRefresh: function() {
		IBiz.alert('',$IGM('EDITVIEWCONTROLLER.DOREFRESH.INFO','编辑界面_刷新操作！'),0);
	},
	doNew: function() {
		IBiz.alert('',$IGM('EDITVIEWCONTROLLER.DONEW.INFO','编辑界面_新建操作！'),0);
	},
	doExit: function() {
		var me = this;
		me.closeWindow();
	},
	saveData: function(arg) {
		if (!arg) arg = {};
		this.getForm().save2(arg);
	},
	removeData: function(arg) {
		if (!arg) arg = {};
		this.getForm().remove(arg);
	},
	refreshReferView: function() {
		var me = this;
		try
		{
			if (me.pagecontext) {
				var openerid = me.pagecontext.getParamValue('openerid');
				var refreshitem = me.pagecontext.getParamValue('srfrefreshitem');
				var view = $.getIBizApp().getSRFController(openerid);
				if(!view)
				{
					if(window.opener && window.opener.window){
						if($.isFunction(window.opener.window.getController))
						{
							view = window.opener.window.getController();
						}
					}
				}
				if(view)
				{
					if(refreshitem && refreshitem!='')
					{
						if($.isFunction(view.refreshItem))
						{
							view.refreshItem(refreshitem);
						}
					}
					else
					{
						if($.isFunction(view.refresh))
						{
							view.refresh();
						}
					}
					return;
				}
			}
		}
		catch(e)
		{
			
		}
	},
	updateFormItems: function(arg) {
		var me = this;
		this.getForm().updateFormItems(arg);
	},
	showCommandBar: function(bShow) {
		var me = this;
		var toolbar = me.getToolbar();
		if (toolbar && (toolbar.isHidden() == bShow)) {
			if (bShow) {
				toolbar.show();
			} else toolbar.hide();
		}
	},
	doWFUIAction: function(uiaction,params) {
		var me = this;
		if(me.isEnableEditData())
		{
			if(me.afterformsaveaction!='dowfuiactionok')
			{
				me.afterformsaveaction='dowfuiaction';
				me.lastwfuiaction = uiaction;
				me.lastwfuaparam = params;
				me.saveData({});
				return;
			}
			me.afterformsaveaction = '';
			me.lastwfuiaction = null;
			me.lastwfuaparam = null;
		}
		
		if (uiaction.actionmode == 'WFBACKEND') {
			var arg = {
				srfwfiatag: uiaction.tag
			};
			me.getForm().wfsubmit(arg);
			return;
		}
		arguments.callee.$.doWFUIAction.call(this,uiaction,params);
	},
	startWF: function(arg) {
		var me = this;
		var startuiaction = me.getUIAction('WFStartWizard');
		if(startuiaction){
			me.doUIAction(startuiaction,{});
		}
		else
			{
				me.getForm().wfstart(arg);
			}
	},
	doMoveToRecord: function(target) {
		var me = this;
		var referView = me.getReferView();
		if (referView && referView.moveRecord) {
			var record = referView.moveRecord(target);
			if (record) {
				var loadParam = {};
				$.extend(loadParam, {
					srfkey: record.get('srfkey')
				});
				me.getForm().autoLoad(loadParam);
			}
		}
	},
	doBackendUIAction: function(arg) {
		var me = this;
		me.getForm().doUIAction(arg);
	},
	
	/**
	 * 获取前台行为参数
	 * @param uiaction 行为
	 */
	getFrontUIActionParam : function(uiaction){
		var me = this;
		var arg = arguments.callee.$.getFrontUIActionParam.call(this, uiaction);
		if (uiaction.actiontarget == 'SINGLEKEY' || uiaction.actiontarget == 'MULTIKEY') {
			var dataInfo = '';
			var keys = '';
			var field = me.getForm().findField('srforikey');
			if (field) {
				keys = field.getValue();
			}
			if (keys == undefined || keys == '') {
				field = me.getForm().findField('srfkey');
				if (field) {
					keys = field.getValue();
				}
			}
			return $.extend(arg, {srfkeys: keys,srfkey:keys});
		}
		return arg;
	},
	getBackendUIActionParam: function(uiaction) {
		var me = this;
		if (uiaction.actiontarget == 'SINGLEKEY' || uiaction.actiontarget == 'MULTIKEY') {
			var dataInfo = '';
			var keys = '';

			var field = me.getForm().findField('srfkey');
			if (field) {
				keys = field.getValue();
			}
			field = me.getForm().findField('srfmajortext');
			if (field) {
				dataInfo = field.getValue();
			}
			return $.extend( {srfkeys: keys,dataInfo: dataInfo},me.getForm().getValues());
			//return {srfkeys: keys,dataInfo: dataInfo};
		}
		return {};
	},
	/**
	 * 初始化浮动工具栏
	 */
	initFloatToolbar:function () {
        var offset = 60;
        var duration = 300;
        if (navigator.userAgent.match(/iPhone|iPad|iPod/i)) {  // ios supported
            $(window).bind("touchend touchcancel touchleave", function(e){
               if ($(this).scrollTop() > offset) {
                    $('.scroll-to-top').fadeIn(duration);
                } else {
                    $('.scroll-to-top').fadeOut(duration);
                }
            });
        } else {
            $(window).scroll(function() {
                if ($(this).scrollTop() > offset) {
                    $('.scroll-to-top').fadeIn(duration);
                } else {
                    $('.scroll-to-top').fadeOut(duration);
                }
            });
        }
        $('.scroll-to-top').click(function(e) {
            e.preventDefault();
            return false;
        });
    },
	onWFUIFrontWindowClosed : function(win, data) {
		var me=this;
		if (win.dialogResult == 'ok') {
			var window = me.getWindow();
			if (window) {
				window.dialogResult = 'ok';
				window.activeData = me.getForm().getValues();
			}
			me.refreshReferView();
			me.closeWindow();
			return;
		} 
	},
	isEnableNewData:function(){
		return true;
	},
	isEnableEditData:function(){
		return true;
	}
	,isEnableRemoveData:function(){
		return true;
	}, onPrintData:function(arg){
    	var me=this;
    	me.doPrintDataNormal(arg);
    },
    /**
	 * 常规新建数据
	 */
	doPrintDataNormal: function(arg) {
		var me = this;
		var view = me.getPrintDataView(arg);
		if (view == null){
			return false;
		}
		var viewurl=view.viewurl;
		if(!viewurl||viewurl==''){
			viewurl = BASEURL+'/ibizutil/print.pdf';
		}
		else
		{
			viewurl = BASEURL+viewurl;
		}
		viewurl = viewurl + (viewurl.indexOf('?')==-1?'?':'&') + $.param(view.viewparam);
		window.open(viewurl, '_blank');
		return true;
	},
	getPrintDataView:function(arg){
		return null;
	}
});