/**
 * 多数据视图控制器对象
 */
var MDViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		if(config.autoLayout==undefined)
		{
			if(config.pcontroller)
			{
				config.autoLayout  = config.pcontroller.isAutoLayout();
			}
			else
				config.autoLayout = true;
		}
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.currentDataKey = null;
		me.multiSelect = config.multiselect;
		if(me.multiSelect==undefined){
			me.multiSelect=true;
		}
		me.isInGridRowEdit = false;
	},
	/**
	 * 初始化
	 */
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		me.parentDataChanged = false;
		
		var mdctrl = this.getMDCtrl();
		if (mdctrl) {
			mdctrl.on(IBizDataGrid.SELECTIONCHANGE, function(sender, args, e) {
				me.onSelectionChange(sender, args);
			}, me);
			mdctrl.on(IBizDataGrid.BEFORELOAD, function(sender, args, e) {
				me.onStoreBeforeLoad(sender, args,e);
			}, me);
			mdctrl.on(IBizDataGrid.LOADED, function(sender, args, e) {
				me.onStoreLoad(sender, args,e);
			}, me);
			mdctrl.on(IBizDataGrid.CHANGEEDITSTATE,function(sender, args, e){
				me.onGridRowEditChange(sender, args,e);
			},me);
		}
		if (me.getParentMode()) {
			me.doHideParentColumns(me.getParentMode());
		}	
		if(me.searchform){
			me.searchform.init();
			if(me.config.loaddefault != undefined && me.config.loaddefault)
				me.searchform.autoLoad(me.viewparam);
			if(me.hasQuickSearch() == true){
				me.searchform.close();
			}
			else
				{
					me.searchform.open();
				}
		}
		me.doLayout();
	},
	onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;
		
		//初始化快速搜索
		if(me.hasHtmlElement('searchcond'))
		{
			me.bQuickSearch = true;
			me.quickSearch = $('#'+this.getCId2()+'searchcond');
		}
		if(me.quickSearch){
			me.quickSearch.keyup(function() {
	            if (event.keyCode == "13") {
	            	me.onSearchFormSearched();
	            }
	        });
		}
		
		me.quickSearchBtn = $('#'+this.getCId2()+'searchbutton');
		if(me.quickSearchBtn){
			me.quickSearchBtn.click(function(e){
				me.onSearchFormSearched();
			});
		}
		me.moreSearchBtn = $('#'+this.getCId2()+'moresearchbutton');
		if(me.moreSearchBtn){
			me.moreSearchBtn.click(function(e){
				if(me.searchform){
					if(me.searchform.isOpen() == true){
						me.searchform.close();
					}else{
						me.searchform.open();
					}
					me.doLayout();
				}
			});
		}
		
		//初始化搜索面板
		if(me.hasHtmlElement('searchform')){
			var dataurl = me.getBackendUrl()+'srfctrlid=searchform&SRFSUBAPP='+me.subapp+'&';
			var sfCfg = $.extend({id:this.getCId2()+'searchform',url:dataurl,ctrler: me},me.config.ctrls.searchForm);
			me.searchform = me.createSearchForm(sfCfg);
			me.registerItem('searchform',me.searchform);
			me.searchform.on(IBizSearchForm.FORMSEARCHED, function(sender, args, e) {
				me.onSearchFormSearched();
			}, me);
			me.searchform.on(IBizSearchForm.FORMRESETED, function(sender, args, e) {
				me.onSearchFormReseted();
			}, me);
			me.searchform.on(IBizForm.FORMFIELDCHANGED, function(sender, args, e) {
				var fieldname = '';
				if (sender != null) fieldname = sender.getName();
				if (!args) args = {};
				me.onSearchFormFieldChanged(fieldname, sender, args.newvalue, args.oldvalue);
			}, me);
		}
	},
	createSearchForm:function(config){
		return IBiz.createSearchForm(config);
	},
	hasQuickSearch:function(){
		var me = this;
		return me.bQuickSearch;
	},
	/**
	 * 获取搜索表单对象
	 */
	getSearchForm:function(){
		return this.searchform;
	},
	
	getAllData:function(){
		var me = this;
		if(me.getMDCtrl()){
			return me.getMDCtrl().getAllData();
		}
		return [];
	},
	/**
	 * 搜索表单属性值发生变化
	 */
	onSearchFormFieldChanged: function(fieldname, field, value) {
		var me = this;
	},
	/**
	 * 搜索表单重置
	 */
	onSearchFormReseted:function(){
		
	},
	/**
	 * 数据加载之前
	 */
	onStoreBeforeLoad: function(sender, args, e) {
		var me = this;
        var fetchParam = {};
        if (me.viewparam){
        	$.extend(fetchParam,me.viewparam);
        }
        if (me.getParentMode()) {
        	$.extend(fetchParam, me.getParentMode());
        }
        if (me.getParentData()) {
        	$.extend(fetchParam, me.getParentData());
        }
        if ((me.getSearchCond() && me.searchform.isOpen()) || !me.hasQuickSearch()) {
        	$.extend(fetchParam, me.getSearchCond());
        }
        //是否有自定义查询
        if (me.searchform && me.searchform.isCustomSearch()) {
        	$.extend(fetchParam, me.searchform.getCustomSearchVal());
        }
        //获取快速搜索里的搜索参数
        if(me.hasQuickSearch() && me.quickSearch){
        	args['search'] = me.quickSearch.val();
        }
        $.extend(args, fetchParam,{ srfaction: 'fetch',SRFSUBAPP:me.subapp });
	},
	/**
	 * 数据加载之前
	 */
	onStoreLoad: function(sender, args, e) {
		var me = this;
    	var lastActive=null;
    	if(me.currentDataKey!=null && me.currentDataKey!='' && args && args.items){
    		
    		$.each(args.items,function(index,record){
    			if(record.srfkey == me.currentDataKey){
    				lastActive = record;
    				return false;
    			}
    		});
    	}
    	if(lastActive){
    		me.getMDCtrl().setSelection(lastActive);
    		me.calcToolbarItemState(true,lastActive.srfdataaccaction);
    	}else{
    		me.currentDataKey = null;
    		me.fireEvent(MDViewControllerBase.SELECTIONCHANGE, me, []);
    		me.calcToolbarItemState(false);
    	}
    	me.parentDataChanged = false;
    	
    	me.reloadUICounters();
	},
	/**
	 * 数据被激活<最典型的情况就是行双击>
	 * @param record 记录
	 * @param e 事件
	 */
	onDataActivated: function(record, e) {
		var me = this;
		if (!record || !record.srfkey){
			return;
		} 
		me.fireEvent(MDViewControllerBase.DATAACTIVATED, me, [record]);
		me.currentDataKey = record.srfkey;
		
		me.calcToolbarItemState(true,record.srfdataaccaction);
		me.onEditData({data: record});
	},
	/**
	 * 行选择变化
	 * @param sender 来源
	 * @param selected 选中数据
	 */
	onSelectionChange: function(sender, selected) {
		var me = this;
		if (selected == null || selected.length == 0){
			me.currentDataKey = null;
		}else{
			me.currentDataKey = selected[0].srfkey;
		}
		me.fireEvent(MDViewControllerBase.SELECTIONCHANGE, me, selected);
		me.calcToolbarItemState(me.currentDataKey != null,(me.currentDataKey != null)?selected[0].srfdataaccaction:null);
	},
	/**
	 * 改变工具栏启用编辑按钮信息
	 */
	onGridRowEditChange: function(sender, args,e){
		var me = this;
		var editButton = null;
		var submitButton = null;
		if (this.toolbar && this.toolbar.items) {
			$.each(this.toolbar.items, function(index, ele) {
				if(ele.attr("data-ibiz-tag")=="NewRow")
					submitButton = ele;
				if(ele.attr("data-ibiz-tag")=="ToggleRowEdit")
					editButton = ele;
			});
		}
		me.isInGridRowEdit=args.state;
		if(editButton){
			if(!args.state){
				editButton.find("span").html($IGM('MDVIEWCONTROLLER.ONGRIDROWEDITCHANGE.ENABLE','启用编辑'));
			}else{
				editButton.find("span").html($IGM('MDVIEWCONTROLLER.ONGRIDROWEDITCHANGE.ENABLE2','关闭编辑'));
			}
		}
		if(submitButton)
			submitButton[0].disabled = !args.state;
	},
	/**
	 * 计算工具栏项状态-<例如 根据是否有选中数据,设置 工具栏按钮是否可点击>
	 * 
	 * @param hasdata
	 *            是否有数据
	 */
	calcToolbarItemState : function(hasdata,dataaccaction) {
		var me = this;
		arguments.callee.$.calcToolbarItemState.call(this,hasdata,dataaccaction);
		if (this.toolbar && this.toolbar.items) {
			$.each(this.toolbar.items, function(index, ele) {
				if(ele.attr("data-ibiz-tag")=="NewRow"){
					if(me.isInGridRowEdit){
						ele[0].disabled = false;
					}else{
						ele[0].disabled = true;
					}
				}
			});
		}
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
	/**
	 * 新建数据
	 */
	onNewData: function() {
		var me = this;
		var loadParam = {};
		if (me.getViewParam()) {
			$.extend(loadParam, me.getViewParam());
		}
		if (me.getParentMode()) {
			$.extend(loadParam, me.getParentMode());
		}
		if (me.getParentData()) {
			$.extend(loadParam, me.getParentData());
		}
		if(me.isInGridRowEdit){
			me.doNewRow(loadParam);
			return;
		}
		if (me.isEnableBatchAdd()) {
			me.doNewDataBatch(loadParam);
			return;
		}
		if (me.doNewDataWizard(loadParam)) {
			return;
		}
		me.doNewDataNormal(loadParam);
	},

	/**
	 * 批量新建
	 */
	doNewDataBatch: function(arg) {
		var me = this;
		var mpickupview = me.getMPickupView(arg);
		if (mpickupview){
			var win = $.getIBizApp().createWindow({});
			var viewparam = {};
			$.extend(viewparam, mpickupview.viewparam);
			if(!viewparam.srfreferdata){
				if(viewparam.srfparentdata)
				{
					viewparam.srfreferdata = viewparam.srfparentdata;
					delete viewparam.srfparentdata;
				}
			}
			viewparam['windowid'] = win.getId();
			viewparam['openerid'] = me.getId();
			win.title = mpickupview.title;
			win.scope = me;
			win.height = mpickupview.height?mpickupview.height:0;
			win.width = mpickupview.width?mpickupview.width:0;
			win.url = $.getIBizApp().parseURL2(mpickupview.subapp,mpickupview.viewurl,{windowid:win.getId(),openerid:me.getId()});
			win.viewparam = viewparam;
			win.callback =  me.onMPickupWindowClose;

			if(mpickupview.modal){
				 win.openModal(window);
			}else{
				 win.openInNewWindow(window);
			}
            
	        return true;
		}
		return false;
	},
	/**
	 * 批量新建关闭
	 */
	onMPickupWindowClose: function(win) {
		var me = win.scope;
		var loadParam = win.userData;
		var dialogResult = win.dialogResult;
		if (!dialogResult) return;
		if (dialogResult == 'ok') {
			var selectedDatas = win.selectedDatas;
			if (!selectedDatas) {
				return;
			}
			me.addDataBatch(selectedDatas);
		}
		return;
	},
	/**
	 * 批量添加数据
	 */
	addDataBatch: function(selectedDatas) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.ADDDATABATCH.INFO','[addDataBatch]方法必须重写！'),2);
	},
	/**
	 * 向导新建数据
	 */
	doNewDataWizard: function(arg) {
		var me = this;
		var wizardview = me.getNewDataWizardView(arg);
		if (wizardview != null) {
			var win = $.getIBizApp().createWindow({});
			var viewparam = {};
			viewparam['windowid'] = win.getId();
			viewparam['openerid'] = me.getId();
			win.title = wizardview.title;
			win.scope = me;
			win.height = wizardview.height?wizardview.height:0;
			win.width = wizardview.width?wizardview.width:0;
			win.url = $.getIBizApp().parseURL2(wizardview.subapp,wizardview.viewurl,{windowid:win.getId(),openerid:me.getId()});
			win.viewparam = viewparam;
			win.callback =  me.onNewDataWizardWindowClose;
            if(wizardview.modal){
   			 	win.openModal(window);
	   		}else{
	   			win.openInNewWindow(window);
	   		}
	        return true;
		}

		return false;
	},
	/**
	 * 向导新建数据窗口关闭
	 */
	onNewDataWizardWindowClose: function(win, eOpts) {
		var me = win.scope;
		var loadParam = {};//win.userData;
		var dialogResult = win.dialogResult;
		if (!dialogResult) return;
		if (dialogResult == 'ok') {
			var selectedData = win.selectedData;
			if (selectedData) {
				var newMode = selectedData.srfkey;
				loadParam.srfnewmode = newMode;
				var view = me.getNewDataView(loadParam);
				if (view == null){
					return;
				}
				me.openDataView(view);
			}
		}
		return;
	},
	/**
	 * 常规新建数据
	 */
	doNewDataNormal: function(arg) {
		var me = this;
		var view = me.getNewDataView(arg);
		if (view == null){
			return false;
		}
		return me.openDataView(view);
	},
	/**
	 * 编辑数据
	 */
	onEditData: function(arg) {
		var me = this;
		var loadParam = {};
		if (me.getViewParam()) {
			$.extend(loadParam, me.getViewParam());
		}
		if (this.getParentMode()) {
			$.extend(loadParam, me.getParentMode());
		}
		if (this.getParentData()) {
			$.extend(loadParam, me.getParentData());
		}
		if (arg.srfcopymode) {
			$.extend(loadParam, {
				srfsourcekey: arg.data.srfkey
			});
		} else {
			$.extend(loadParam, {srfkey: arg.data.srfkey});
		}
		
		var editMode = me.getEditMode(arg.data);
		if (editMode) {
			loadParam.srfeditmode = editMode;
		}
		if(arg.data.srfmstag){
			loadParam.srfeditmode2 = arg.data.srfmstag;
		}
		
		loadParam.openerid = me.getId();
		me.doEditDataNormal(loadParam);
	},
	/**
	 * 执行常规编辑数据
	 */
	doEditDataNormal: function(arg) {
		var me = this;
		var view = me.getEditDataView(arg);
		if (view == null) {
			return false;
		}
		return me.openDataView(view);
	},
	/**
	 * 打开数据视图
	 */
	openDataView: function(view) {
		var me = this;
		var openMode = view.openMode;
		if (openMode != undefined) {
			if (openMode == 'POPUPMODAL') {
				view.modal = true;
			} else if (openMode == 'POPUP') {
				view.modal = true;
			} else if (openMode == '' || openMode == 'INDEXVIEWTAB') {
				view.modal = false;
			}
		}
		if (me.isShowModal()) {
			view.modal = true;
		}
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = view.viewparam;
		if(!viewparam){
			viewparam = {};
		}
		viewparam['windowid'] = win.getId();
		viewparam['openerid'] = me.getId();
		win.title = view.title;
		win.scope = me;
		win.height = view.height?view.height:0;
		win.width = view.width?view.width:0;
		win.url = $.getIBizApp().parseURL2(view.subapp,view.viewurl,{windowid:win.getId(),openerid:me.getId()});
		win.viewparam = viewparam;
		if(view.modal){
			 win.openModal(window);
		}else{
			 win.openInNewWindow(window);
		}
       
        
        return true;
	},
	/**
	 * 获取编辑模式
	 */
	getEditMode: function(data) {
		return data.srfdatatype;
	},
	/**
	 * 获取编辑视图
	 */
	getEditDataView: function(arg) {
		return null;
	},
	/**
	 * 获取新建视图
	 */
	getNewDataView: function(arg) {
		return null;
	},
	/**
	 * 获取新建向导视图
	 */
	getNewDataWizardView: function(arg) {
		return null;
	},
	/**
	 * 获取多选视图
	 */
	getMPickupView: function(arg) {
		return null;
	},
	/**
	 * 获取多数据对象
	 */
	getMDCtrl: function() {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.GETMDCTRL.INFO','[getMDCtrl]方法必须重写！'),2);
	},
	isLoadDefault: function() {
		return true;
	},
	isEnableBatchAdd: function() {
		return false;
	},
	isBatchAddOnly: function() {
		return false;
	},
	onRefresh: function() {
		arguments.callee.$.onRefresh.call(this);
		var me = this;
		if (me.getMDCtrl()) {
			me.getMDCtrl().load();
		}
	},
	onSetParentData: function() {
		arguments.callee.$.onSetParentData.call(this);
		this.parentDataChanged = true;
	},
	getSearchCond: function() {
		if (this.getSearchForm()) {
			return this.getSearchForm().getValues();
		}
		return null;
	},
	onSearchFormSearched: function() {
		if (this.getMDCtrl()) {
			this.getMDCtrl().load();
		}
	},
	onSearchFormReseted: function() {
		if (this.getMDCtrl()) {
			this.getMDCtrl().load();
		}
	},
	doDEUIAction: function(uiaction,params) {
		var me = this;
		if (uiaction.tag == 'Help') {
			me.doHelp(params);
			return;
		}
		if (uiaction.tag == 'Edit') {
			me.doEdit(params);
			return;
		}
		if (uiaction.tag == 'View') {
			me.doView(params);
			return;
		}
		if (uiaction.tag == 'Print') {
			
			me.doPrint(params);
			return;
		}
		if (uiaction.tag == 'ExportExcel') {
			me.doExportExcel(params);
			return;
		}
		if (uiaction.tag == 'ExportModel') {
			me.doExportModel(params);
			return;
		}
		if (uiaction.tag == 'Copy') {
			me.doCopy(params);
			return;
		}
		if (uiaction.tag == 'Remove') {
			me.doRemove(params);
			return;
		}
		if (uiaction.tag == 'Import') {
			me.doImport(params);
			return;
		}
		if (uiaction.tag == 'Refresh') {
			me.doRefresh(params);
			return;
		}
		if (uiaction.tag == 'NewRow') {
			me.doCheck(params);
			return;
		}
		if (uiaction.tag == 'New') {
			me.doNew(params);
			return;
		}
		if (uiaction.tag == 'ToggleRowEdit') {
			me.doToggleRowEdit(params);
			return;
		}
		arguments.callee.$.doDEUIAction.call(me, uiaction,params);
	},
	doToggleRowEdit: function(params) {
		var me = this;
		if(me.getMDCtrl() && typeof(me.getMDCtrl().isOpenEdit) == 'function')
			me.getMDCtrl().isOpenEdit(params);
	},
	doNewRow: function(params) {
		var me = this;
		if(me.getMDCtrl() && typeof(me.getMDCtrl().newRowAjax) == 'function')
			me.getMDCtrl().newRowAjax(params);
	},
	doCheck: function(params){
		var me = this;
		if(me.getMDCtrl() && typeof(me.getMDCtrl().quitEdit) == 'function')
			me.getMDCtrl().quitEdit();
	},
	doHelp: function() {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOHELP.INFO','帮助操作'),0);
	},
	/*编辑操作*/
	doEdit: function(params) {
		var me = this;
		//获取要编辑的数据集合
		if(params && params.srfkey){
			if($.isFunction(me.getMDCtrl().findItem)){
				params = me.getMDCtrl().findItem('srfkey',params.srfkey);
			}
			var arg = {data: params};
			me.onEditData(arg);
			return;
		}
		var selectedData = me.getMDCtrl().getSelection();
		if (selectedData == null || selectedData.length == 0) return;

		var arg = {
			data: selectedData[0]
		};
		me.onEditData(arg);
	},
	/*查看操作*/
	doView: function(params) {
		this.doEdit(params);
	},
	/*打印操作*/
	doPrint: function() {
		var me=this;
		var arg={};
		var bSingle=true;
		var selectedData = me.getMDCtrl().getSelection();
		if (!(selectedData == null || selectedData.length == 0)) {
			var keys = '';
			if(bSingle){
				keys = selectedData[0].srfkey;
			}else{
				$.each(selectedData,function(index,item){
					var key = item.srfkey;
					if (keys != '') keys += ';';
					keys += key;
				});
			}
			arg.srfkeys = keys;
		}
		else
			return;
		me.onPrintData(arg);
	},
	/*导出操作（Excel）*/
	doExportExcel: function(params) {
		if(params.itemtag == ''){
			
		}
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOEXPORTEXCEL.INFO','导出操作（Excel）'),0);
	},
	/*导出数据模型*/
	doExportModel: function(params) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOEXPORTMODEL.INFO','导出数据模型'),0);
	},
	/*拷贝操作*/
	doCopy: function(params) {
		var me = this;
		//获取要拷贝的数据集合
		var selectedData = me.getMDCtrl().getSelection();
		if (selectedData == null || selectedData.length == 0) return;

		var arg = {
			data: selectedData[0],
			srfcopymode: true
		};
		me.onEditData(arg);
	},
	/*删除操作*/
	doRemove: function(params) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOREMOVE.INFO','删除操作'),0);
	},
	/*数据导入栏*/
	doImport: function(params) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOIMPORT.INFO','数据导入栏'),0);
	},
	/*刷新操作*/
	doRefresh: function(params) {
		this.refresh();
	},
	/*新建操作*/
	doNew: function(params) {
		var me = this;
		me.onNewData(params);
	},
	doWFUIAction: function(uiaction,params) {
		var me = this;
		if (uiaction.actionmode == 'WFBACKEND') {
			var selectedData = me.getMDCtrl().getSelection();
			if (selectedData == null || selectedData.length == 0){
				return;
			}

			var keys = '';
			$.each(selectedData,function(index,item){
				var key = item.srfkey;
				if (keys != '') keys += ';';
				keys += key;
			});
			
			me.getMDCtrl().wfsubmit({srfwfiatag: uiaction.tag,srfkeys:keys});
			return;
		}
		arguments.callee.$.doWFUIAction.call(this,uiaction,params);
	},
	onWFUIFrontWindowClosed:function(win,data){
		var me = this;
		me.load();
	},
	
	/**
	 * 获取UI操作参数
	 */
	getFrontUIActionParam: function(uiaction,params) {
		var me = this;
		var arg = arguments.callee.$.getFrontUIActionParam.call(this, uiaction);
		if (me.getParentMode()) {
			$.extend(arg, me.getParentMode());
		}
		if (me.getParentData()) {
			$.extend(arg, this.getParentData());
		}
		var target = 'NONE';
		if (uiaction.actiontarget) {
			target = uiaction.actiontarget;
		}
		if (target != 'NONE'){
			var selectedData = me.getMDCtrl().getSelection();
			if (!(selectedData == null || selectedData.length == 0)) {
				if(target == 'SINGLEKEY'){
					arg.srfkeys = selectedData[0].srfkey;
				}else if(target == 'SINGLEDATA'){
					$.extend(arg, selectedData[0]);
				}else if(target == 'MULTIKEY'){
					var keys = '';
					$.each(selectedData,function(index,item){
						var key = item.srfkey;
						if (keys != '') 
							keys += ';';
						keys += key;
					});
					arg.srfkeys = keys;
				}
			}
		}
		return arg;
	},
	getBackendUIActionParam: function(uiaction,params) {
		var me = this;
		var arg = {};
		if (me.getParentMode()) {
			$.extend(arg, me.getParentMode());
		}
		if (me.getParentData()) {
			$.extend(arg, this.getParentData());
		}
		var bSingle = false;
		if (uiaction.actiontarget == 'SINGLEKEY') {
			bSingle = true;
		}
		var selectedData = me.getMDCtrl().getSelection();
		if (!(selectedData == null || selectedData.length == 0)) {
			var keys = '';
			if(bSingle){
				keys = selectedData[0].srfkey;
			}else{
				$.each(selectedData,function(index,item){
					var key = item.srfkey;
					if (keys != '') keys += ';';
					keys += key;
				});
			}
			arg.srfkeys = keys;
		}
		return arg;
	},
	/*移动记录*/
	moveRecord: function(target) {
		var me = this;
		var store = me.getMDCtrl().getStore();
		if (!store.isLoaded()) return null;
		var nCount = store.getCount();
		var nIndex = 0;
		var nLastIndex = -1;
		var selectedData = me.getMDCtrl().getSelection();
		if (!(selectedData == null || selectedData.length == 0)) {
			nIndex = store.indexOf(selectedData[0]);
			nLastIndex = nIndex;
		}
		if (typeof target == 'string') {
			if (target == 'first') nIndex = 0;
			else if (target == 'prev') nIndex -= 1;
			else if (target == 'next') nIndex += 1;
			else if (target == 'last') nIndex = nCount - 1;
		}
		if (nIndex < 0 || nIndex >= nCount) return null;
		if (nIndex == nLastIndex) return null;
		var record = store.getAt(nIndex);
		me.getMDCtrl().setSelection(record);
		return record;
	},
	doBackendUIAction: function(arg) {
		var me = this;
		me.getMDCtrl().doUIAction(arg);
	},
	/*隐藏关系列*/
    doHideParentColumns: function (parentMode) {
    },
    onPrintData:function(arg){
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
	},
	isEnableMultiSelect:function(){
    	return this.multiSelect;
    },
    setEnableMultiSelect:function(multiSelect){
    	this.multiSelect = multiSelect;
    }
});
/*****************事件声明************************/
/**
 * 数据激活<例如：表格行双击>
 */
MDViewControllerBase.DATAACTIVATED = 'DATAACTIVATED';
/**
 * 数据选择变化
 */
MDViewControllerBase.SELECTIONCHANGE = 'SELECTIONCHANGE';
