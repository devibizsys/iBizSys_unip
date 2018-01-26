import { IBizMainViewController } from './IBizMainViewController';

export class IBizMDViewController extends IBizMainViewController {
    public $currentDataKey: string;
    public $searchValue: string;
    public $searchTime: any;

    constructor(opt) {
        super(opt);
    }

    /**
     * 页面加载数据前
     * 
     * @memberof IBizMDViewController
     */
    public onLoad(): void {
        let me = this;
        if (this.getSearchForm()) {
            this.getSearchForm().autoLoad(this.getViewParam());
            this.getSearchForm().on(this.$staticVariables.LOADED, () => {
                me.load(me.getViewParam());
            });
        } else {
            this.load(this.getViewParam());
        }
    }

    /**
     * 加载数据
     * 
     * @param {*} [opt={}] 
     * @memberof IBizMDViewController
     */
    public load(opt: any = {}): void {
        if (this.getMDCtrl()) {
            this.getMDCtrl().load(opt);
        }
    }

    /**
     * 注册事件
     * 
     * @memberof IBizMDViewController
     */
    public onInitComponents(): void {
        let me = this;
        let mdctrl = this.getMDCtrl();
        if (mdctrl) {
            mdctrl.on(me.$staticVariables.SELECTIONCHANGE, (item) => {
                me.onSelectionChange(item);
            });
            mdctrl.on(me.$staticVariables.BEFORELOAD, (opt) => {
                me.onBeforeLoad(opt);
            });
            mdctrl.on(me.$staticVariables.LOADED, (opt) => {
                // me.onStoreLoad(opt);
            });
            mdctrl.on(me.$staticVariables.CHANGEEDITSTATE, (opt) => {
                // me.onGridRowEditChange(opt);
            });
            mdctrl.on(me.$staticVariables.BEFORREMOVE, (opt) => {
                console.log('删除数据前的通知');
            })
        }
        let searchform = this.getSearchForm();
        if (searchform) {
            searchform.on(me.$staticVariables.FORMSEARCHED, (opt) => {
                me.searchFormSearch(opt);
            });
            searchform.on(me.$staticVariables.FORMRESETED, (opt) => {
                console.log('搜索表单重置了');
            });
        }
    }

    /**
     * 加载数据之前
     * 
     * @param {any} opt 
     * @memberof IBizMDViewController
     */
    public onBeforeLoad(opt): void {
        let fetchParam = {};
        if (this.getViewParam()) {
            Object.assign(fetchParam, this.getViewParam());
        }
        if (this.getParentMode()) {
            Object.assign(fetchParam, this.getParentMode());
        }
        if (this.getParentData()) {
            Object.assign(fetchParam, this.getParentData());
        }
        // if ((this.getSearchCond() && this.searchform.isOpen()) || !this.hasQuickSearch()) {
        // 	Object.assign(fetchParam, this.getSearchCond());
        // }
        // //是否有自定义查询
        // if (this.searchform && this.searchform.isCustomSearch()) {
        // 	Object.assign(fetchParam, this.searchform.getCustomSearchVal());
        // }
        //获取快速搜索里的搜索参数
        if (this.isEnableQuickSearch() && this.$searchValue != undefined) {
            Object.assign(fetchParam, { 'query': this.$searchValue });
        }
        Object.assign(opt, fetchParam);
    }

    /**
     * 选中数据触发
     * 
     * @param {any} selection 
     * @memberof IBizMDViewController
     */
    public onSelectionChange(selection): void {
        if (selection && selection.length > 0) {
            this.onDataActivated(selection[0])
        }
    }

    public onDataActivated(record): void {
        if (!record || !record.srfkey) {
            return;
        }
        // this.fireEvent(MDViewControllerBase.DATAACTIVATED, me, [record]);
        this.$currentDataKey = record.srfkey;

        //this.calcToolbarItemState(true,record.srfdataaccaction);
        this.onEditData({ data: record });
    }

    /**
     * 
     * 
     * @param {any} arg 
     * @memberof IBizMDViewController
     */
    public onEditData(arg): void {
        let loadParam: any = {};
        if (this.getViewParam()) {
            Object.assign(loadParam, this.getViewParam());
        }
        if (this.getParentMode()) {
            Object.assign(loadParam, this.getParentMode());
        }
        if (this.getParentData()) {
            Object.assign(loadParam, this.getParentData());
        }
        if (arg.srfcopymode) {
            Object.assign(loadParam, {
                srfsourcekey: arg.data.srfkey
            });
        } else {
            Object.assign(loadParam, { srfkey: arg.data.srfkey });
        }

        let editMode = this.getEditMode(arg.data);
        if (editMode) {
            loadParam.srfeditmode = editMode;
        }
        if (arg.data.srfmstag) {
            loadParam.srfeditmode2 = arg.data.srfmstag;
        }

        loadParam.openerid = this.getId();
        this.doEditDataNormal(loadParam);
    }

    /**
     * 执行常规编辑数据
     * 
     * @param {any} arg 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public doEditDataNormal(arg): any {
        let view = this.getEditDataView(arg);
        if (view == null) {
            return false;
        }
        return this.openDataView(view);
    }

    /**
     * 打开数据视图
     * 
     * @param {any} view 
     * @memberof IBizMDViewController
     */
    public openDataView(view): void {
        if (view.redirect) {
            if (view.redirectUrl) {
                this.redirectOpenView(view);
            }
        } else {
            this.openView(view);
        }
    }

    /**
     * 获取编辑模式
     * 
     * @param {any} data 
     * @returns {string} 
     * @memberof IBizMDViewController
     */
    public getEditMode(data): string {
        return data.srfdatatype;
    }

    /**
     * 获取编辑视图
     * 
     * @param {any} arg 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public getEditDataView(arg): any {
        return null;
    }

    /**
     * 获取新建视图
     * 
     * @param {any} arg 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public getNewDataView(arg): any {
        return null;
    }

    /**
     * 获取新建向导视图
     * 
     * @param {any} arg 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public getNewDataWizardView(arg): any {
        return null;
    }

    /**
     * 获取多选视图
     * 
     * @param {any} arg 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public getMPickupView(arg): any {
        return null;
    }

    /**
     * 获取多数据对象
     * 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public getMDCtrl(): any {

    }

    /**
     * 是否默认加载数据
     * 
     * @returns {boolean} 
     * @memberof IBizMDViewController
     */
    public isLoadDefault(): boolean {
        return true;
    }

    /**
     * 是否允许批量添加
     * 
     * @returns {boolean} 
     * @memberof IBizMDViewController
     */
    public isEnableBatchAdd(): boolean {
        return false;
    }

    /**
     * 
     * 
     * @returns {boolean} 
     * @memberof IBizMDViewController
     */
    public isBatchAddOnly(): boolean {
        return false;
    }

    /**
     * 
     * 
     * @returns {string} 
     * @memberof IBizMDViewController
     */
    public getId(): string {
        return '';
    }

    /**
     * 执行界面行为
     * 
     * @param {*} [uiaction={}] 行为
     * @param {any} [params={}] 参数
     * @returns 
     * @memberof IBizMDViewController
     */
    public doDEUIAction(uiaction: any = {}, params = {}) {
        if (uiaction.tag == 'Help') {
            this.doHelp();
            return;
        }
        if (uiaction.tag == 'Edit') {
            this.doEdit(params);
            return;
        }
        if (uiaction.tag == 'View') {
            this.doView(params);
            return;
        }
        if (uiaction.tag == 'Print') {
            this.doPrint(params);
            return;
        }
        if (uiaction.tag == 'ExportExcel') {
            this.doExportExcel(params);
            return;
        }
        if (uiaction.tag == 'ExportModel') {
            this.doExportModel(params);
            return;
        }
        if (uiaction.tag == 'Copy') {
            this.doCopy(params);
            return;
        }
        if (uiaction.tag == 'Remove') {
            this.doRemove(params);
            return;
        }
        if (uiaction.tag == 'Import') {
            this.doImport(params);
            return;
        }
        if (uiaction.tag == 'Refresh') {
            this.doRefresh(params);
            return;
        }
        if (uiaction.tag == 'NewRow') {
            this.doCheck(params);
            return;
        }
        if (uiaction.tag == 'New') {
            this.doNew(params);
            return;
        }
        if (uiaction.tag == 'ToggleRowEdit') {
            this.doToggleRowEdit(params);
            return;
        }
        super.doDEUIAction(uiaction, params);
    }

    /**
     * 打印
     * 
     * @param {any} params 
     * @memberof IBizMDViewController
     */
    public doPrint(params): void {

    }

    /**
     * 导出excel
     * 
     * @param {any} params 
     * @memberof IBizMDViewController
     */
    public doExportExcel(params): void {

    }

    /**
     * 导出模型
     * 
     * @param {any} params 
     * @memberof IBizMDViewController
     */
    public doExportModel(params): void {

    }

    public doImport(params): void {

    }

    public doCheck(params): void {

    }

    public doToggleRowEdit(params): void {

    }

    public doHelp() {
        this.showToast('帮助操作');
    }

    /**
     * 编辑操作
     * 
     * @param {any} params 
     * @returns {void} 
     * @memberof IBizMDViewController
     */
    public doEdit(params): void {
        //获取要编辑的数据集合
        if (params && params.srfkey) {
            // if ($.isFunction(this.getMDCtrl().findItem)) {
            //     params = this.getMDCtrl().findItem('srfkey', params.srfkey);
            // }
            let arg = { data: params };
            this.onEditData(arg);
            return;
        }
        let selectedData = this.getMDCtrl().getSelection();
        if (selectedData == null || selectedData.length == 0) return;

        let arg = {
            data: selectedData[0]
        };
        this.onEditData(arg);
    }

    /**
     * 查看操作
     * 
     * @param {any} params 
     * @memberof IBizMDViewController
     */
    public doView(params): void {
        this.doEdit(params);
    }

    /**
     * 拷贝操作
     * 
     * @param {any} params 
     * @returns {void} 
     * @memberof IBizMDViewController
     */
    public doCopy(params): void {
        //获取要拷贝的数据集合
        let selectedData = this.getMDCtrl().getSelection();
        if (selectedData == null || selectedData.length == 0) return;

        let arg = {
            data: selectedData[0],
            srfcopymode: true
        };
        this.onEditData(arg);
    }

    /**
     * 删除操作
     * 
     * @param {any} params 
     * @memberof IBizMDViewController
     */
    public doRemove(params): void {
        this.showToast('删除操作!');
    }

    /**
     * 刷新操作
     * 
     * @param {any} params 
     * @memberof IBizMDViewController
     */
    public doRefresh(params): void {
        this.refresh();
    }

    /**
     * 新建操作
     * 
     * @param {any} params 
     * @memberof IBizMDViewController
     */
    public doNew(params): void {
        this.onNewData(params);
    }

    /**
     * 执行工作流界面行为
     * 
     * @param {any} uiaction 
     * @param {any} params 
     * @returns {void} 
     * @memberof IBizMDViewController
     */
    public doWFUIAction(uiaction, params): void {
        if (uiaction.actionmode == 'WFBACKEND') {
            let selectedData = this.getMDCtrl().getSelection();
            if (selectedData == null || selectedData.length == 0) {
                return;
            }

            let keys = '';
            // $.each(selectedData, function (index, item) {
            //     let key = item.srfkey;
            //     if (keys != '') keys += ';';
            //     keys += key;
            // });

            this.getMDCtrl().wfsubmit({ srfwfiatag: uiaction.tag, srfkeys: keys });
            return;
        }
        //super.doWFUIAction(uiaction, params);
    }

    /**
     * 
     * 
     * @param {any} result 
     * @memberof IBizMDViewController
     */
    public onWFUIFrontWindowClosed(result): void {
        super.onWFUIFrontWindowClosed(result);
    }

    /**
     * 获取UI操作参数
     * 
     * @param {any} uiaction 
     * @param {any} params 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public getFrontUIActionParam(uiaction, params): any {
        let arg: any = super.getFrontUIActionParam(uiaction, params);
        if (this.getParentMode()) {
            Object.assign(arg, this.getParentMode());
        }
        if (this.getParentData()) {
            Object.assign(arg, this.getParentData());
        }
        let target = 'NONE';
        if (uiaction.actiontarget) {
            target = uiaction.actiontarget;
        }
        if (target != 'NONE') {
            let selectedData = this.getMDCtrl().getSelection();
            if (!(selectedData == null || selectedData.length == 0)) {
                if (target == 'SINGLEKEY') {
                    arg.srfkeys = selectedData[0].srfkey;
                } else if (target == 'SINGLEDATA') {
                    Object.assign(arg, selectedData[0]);
                } else if (target == 'MULTIKEY') {
                    let keys = '';
                    selectedData.forEach((item) => {
                        let key = item.srfkey;
                        if (keys != '') {
                            keys += ';';
                        }
                        keys += key;
                    });
                    arg.srfkeys = keys;
                }
            }
        }
        return arg;
    }

    /**
     * 
     * 
     * @param {any} uiaction 
     * @param {any} params 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public getBackendUIActionParam(uiaction, params): any {
        let arg: any = {};
        if (this.getParentMode()) {
            Object.assign(arg, this.getParentMode());
        }
        if (this.getParentData()) {
            Object.assign(arg, this.getParentData());
        }
        let bSingle = false;
        if (uiaction.actiontarget == 'SINGLEKEY') {
            bSingle = true;
        }
        let selectedData = this.getMDCtrl().getSelection();
        if (!(selectedData == null || selectedData.length == 0)) {
            let keys = '';
            if (bSingle) {
                keys = selectedData[0].srfkey;
            } else {
                // $.each(selectedData, function (index, item) {
                //     let key = item.srfkey;
                //     if (keys != '') keys += ';';
                //     keys += key;
                // });
            }
            arg.srfkeys = keys;
        }
        return arg;
    }

    /**
     * 新建数据
     * 
     * @param {any} params 
     * @returns {void} 
     * @memberof IBizMDViewController
     */
    public onNewData(params): void {
        let loadParam = {};
        if (this.getViewParam()) {
            Object.assign(loadParam, this.getViewParam());
        }
        if (this.getParentMode()) {
            Object.assign(loadParam, this.getParentMode());
        }
        if (this.getParentData()) {
            Object.assign(loadParam, this.getParentData());
        }
        if (this.isEnableBatchAdd()) {
            this.doNewDataBatch(loadParam);
            return;
        }
        if (this.doNewDataWizard(loadParam)) {
            return;
        }
        this.doNewDataNormal(loadParam);
    }

    /**
     * 批量新建
     * 
     * @param {any} arg 
     * @returns {boolean} 
     * @memberof IBizMDViewController
     */
    public doNewDataBatch(arg): boolean {
        // let mpickupview = this.getMPickupView(arg);
        // if (mpickupview){
        // 	let win = $.getIBizApp().createWindow({});
        // 	let viewparam = {};
        // 	$.extend(viewparam, mpickupview.viewparam);
        // 	if(!viewparam.srfreferdata){
        // 		if(viewparam.srfparentdata)
        // 		{
        // 			viewparam.srfreferdata = viewparam.srfparentdata;
        // 			delete viewparam.srfparentdata;
        // 		}
        // 	}
        // 	viewparam['windowid'] = win.getId();
        // 	viewparam['openerid'] = this.getId();
        // 	win.title = mpickupview.title;
        // 	win.scope = me;
        // 	win.height = mpickupview.height?mpickupview.height:0;
        // 	win.width = mpickupview.width?mpickupview.width:0;
        // 	win.url = $.getIBizApp().parseURL2(mpickupview.subapp,mpickupview.viewurl,{windowid:win.getId(),openerid:this.getId()});
        // 	win.viewparam = viewparam;
        // 	win.callback =  this.onMPickupWindowClose;

        // 	if(mpickupview.modal){
        // 		 win.openModal(window);
        // 	}else{
        // 		 win.openInNewWindow(window);
        // 	}

        //     return true;
        // }
        return false;
    }

    /**
     * 向导新建数据
     * 
     * @param {any} arg 
     * @returns {boolean} 
     * @memberof IBizMDViewController
     */
    public doNewDataWizard(arg): boolean {
        let wizardview = this.getNewDataWizardView(arg);
        if (wizardview != null) {
            if (wizardview.modal) {
                this.openModal(wizardview, (result) => {
                    this.onNewDataWizardWindowClose(result);
                });
            } else {
                this.openView(wizardview, (result) => {
                    this.onNewDataWizardWindowClose(result);
                });
            }
            return true;
        }
        return false;
    }

    /**
     * 向导新建数据窗口关闭
     * 
     * @param {any} result 
     * @returns {void} 
     * @memberof IBizMDViewController
     */
    public onNewDataWizardWindowClose(result): void {
        var loadParam: any = {};
        if (!result) return;
        if (result.ret == 'OK') {
            var selectedData = result.selectedData;
            if (selectedData) {
                var newMode = selectedData.srfkey;
                loadParam.srfnewmode = newMode;
                var view = this.getNewDataView(loadParam);
                if (view == null) {
                    return;
                }
                this.openDataView(view);
            }
        }
        return;
    }

    /**
     * 常规新建数据
     * 
     * @param {any} arg 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public doNewDataNormal(arg): any {
        let view = this.getNewDataView(arg);
        if (view == null) {
            return false;
        }
        return this.openDataView(view);
    }

    /**
     * 刷新数据
     * 
     * @memberof IBizMDViewController
     */
    public onRefresh(): void {
        if (this.getMDCtrl()) {
            this.getMDCtrl().resetStart();
            this.getMDCtrl().load(this.getViewParam());
        }
        super.onRefresh();
    }

    /**
     * 是否启用快捷搜索
     * 
     * @returns {boolean} 
     * @memberof IBizMDViewController
     */
    public isEnableQuickSearch(): boolean {
        return true;
    }

    /**
     * 下拉刷新触发事件
     * 
     * @param {any} event 
     * @memberof IBizMDViewController
     */
    public doRefresher(event): void {
        setTimeout(() => {
            event.complete();
            this.onRefresh();
        }, 300);
    }

    /**
     * 上拉刷新
     * 
     * @param {any} event 
     * @memberof IBizMDViewController
     */
    public doInfinite(event): void {
        setTimeout(() => {
            event.complete();
            this.loadNext();
        }, 300);
    }

    /**
     * 下拉加载
     * 
     * @memberof IBizMDViewController
     */
    public loadNext(): void {
        this.getMDCtrl().loadNext(this.getViewParam());
    }

    /**
     * 是否上拉刷新
     * 
     * @returns {boolean} 
     * @memberof IBizMDViewController
     */
    public isInfinite(): boolean {
        return this.getMDCtrl().isInfinite();
    }

    /**
     * 当搜索栏值变化的时候触发
     * 
     * @param {any} event 
     * @memberof IBizMDViewController
     */
    public onInput(event): void {
        if (this.$searchTime) {
            clearTimeout(this.$searchTime);
        }
        this.$searchTime = setTimeout(() => {
            if (event != '' && event != undefined) {
                this.load({});
            }
        }, 2000);
    }

    /**
     * 搜索栏取消事件
     * 
     * @param {any} event 
     * @memberof IBizMDViewController
     */
    public onCancel(event): void {
        console.log(event);
    }
    /**
     * 获取搜索表单控制器
     * 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public getSearchForm(): any {
        return this.getControl('searchform');
    }
    /**
     * 搜索表单搜索事件
     * 
     * @returns {*} 
     * @memberof IBizMDViewController
     */
    public searchFormSearch(opt: any = {}): void {
        Object.assign(opt, this.getSearchForm().getData());
        this.load(opt);
    }
}