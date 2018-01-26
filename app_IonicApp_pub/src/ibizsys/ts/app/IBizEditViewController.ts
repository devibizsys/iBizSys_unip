import { IBizMainViewController } from './IBizMainViewController';


export class IBizEditViewController extends IBizMainViewController {
    public form: any;
    public afterformsaveaction: string;
    public lastwfuiaction: any;
    public lastwfuaparam: any;

    constructor(opt) {
        super(opt);
    }

    /**
     * 加载数据
     * 
     * @memberof IBizEditViewController
     */
    public onLoad(): void {
        if (this.getEditForm()) {
            this.getEditForm().autoLoad(this.getViewParam());
        }
    }

    /**
     * 注册事件
     * 
     * @returns {void} 
     * @memberof IBizEditViewController
     */
    public onInitComponents(): void {
        let me = this;
        let editForm = this.getEditForm();
        if (!editForm) {
            return;
        }
        editForm.on(this.$staticVariables.FORMSAVED, (params) => {
            me.onFormSaved(params);
        });
        //默认数据加载事件
        editForm.on(me.$staticVariables.LOADED, (params) => {
            me.onEditFormLoaded(params);
        });
        editForm.on(me.$staticVariables.FIELDVALUECHANGED, (params) => {
            me.onFieldValueChanged(params.name, params.value, params.field);
        });
        editForm.on(this.$staticVariables.DATAACCACTIONCHANGE, (params) => {
            me.onDataAccActionChange(params);
        });
        editForm.on(this.$staticVariables.SAVED, (params) => {
            me.onEditFormSaved(params);
        });
        //删除后触发
        editForm.on(this.$staticVariables.FORMREMOVED, (params) => {
            me.onEditFormRemoved(params);
        });
        // //工作流启动后触发
        editForm.on(this.$staticVariables.FORMWFSTARTED, (params) => {
            me.onFormWFStarted();
        });
        // //工作流交互操作后触发
        editForm.on(this.$staticVariables.FORMWFSUBMITTED, (params) => {
            me.onFormWFSubmitted();
        });
        //编辑表单自定义实体界面行为执行完毕
        editForm.on(this.$staticVariables.UIACTIONFINISHED, (params) => {
            if (params.reloadData) {
                me.refreshReferView();
            }
            if (params.closeEditview){
                me.closeView();
            }
        });
    }

    /**
     * 获取编辑表单Service
     * 
     * @returns {any} 
     * @memberof IBizEditViewController
     */
    public getEditForm(): any {
        return this.getControl('form');
    }

    /**
     * 获取表单Service
     * 
     * @returns {*} 
     * @memberof IBizEditViewController
     */
    public getForm(): any {
        return this.getEditForm();
    }

    /**
     * 获取当前编辑的数据
     * 
     * @returns {*} 
     * @memberof IBizEditViewController
     */
    public getEditData(): any {
        return this.getEditForm().getData();
    }

    /**
     * 表单权限发生变化
     * 
     * @param {any} dataaccaction 
     * @memberof IBizEditViewController
     */
    public onDataAccActionChange(dataaccaction): void {
        // if(this.getToolbar())
        // 	this.getToolbar().updateAccAction(dataaccaction);
        // if(this.mintoolbar)
        // 	this.mintoolbar.updateAccAction(dataaccaction);
        // if(this.floattoolbar)
        // 	this.floattoolbar.updateAccAction(dataaccaction);
    }
    public onSetParentData(): void {
        // if(this.isInited() == true){
        // 	if(this.parentData){
        // 		let params = $.extend(this.viewparam,this.parentData);
        // 		this.form.autoLoad(params);
        // 	}
        // }	
    }
	
    /**
     * 获取数据信息区对象
     * 
     * @returns {*} 
     * @memberof IBizEditViewController
     */
    public getDataInfoBar(): any {
        // return this.datainfobar;
    }
	
    /**
     * 表单保存完成触发事件
     * 
     * @param {any} result 
     * @returns {void} 
     * @memberof IBizEditViewController
     */
    public onFormSaved(result): void {
        if (this.afterformsaveaction == 'exit') {
            this.closeView();
            return;
        }
        if (this.afterformsaveaction == 'new') {
            let arg = this.getViewParam();
            if (arg == null || arg == undefined) arg = {};
            this.getForm().loadDraft(arg);
            return;
        }

        if (this.afterformsaveaction == 'dowfuiaction') {
            this.afterformsaveaction = 'dowfuiactionok';
            this.doWFUIAction(this.lastwfuiaction, this.lastwfuaparam);
            return;
        }

        if (this.afterformsaveaction == 'startwf') {
            this.startWF(result);
        }
        else {
            //判断是否已经出现过提示
            if (!result || !result.info) {
                //IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'),$IGM('EDITVIEWCONTROLLER.ONFORMSAVED.INFO','数据保存成功！'),1);
            }
        }
        this.updateViewInfo();
    }

    /**
     * 
     * 
     * @memberof IBizEditViewController
     */
    public onFormLoaded(): void {
        this.updateViewInfo();
    }

    /**
     * 工作流启动页操作完成，刷新父页面并关闭当前窗口
     * 
     * @memberof IBizEditViewController
     */
    public onFormWFStarted(): void {
        this.refreshReferView();
        this.closeView();
    }

    /**
     * 工作流提交操作完成，刷新父页面并关闭当前窗口
     * 
     * @memberof IBizEditViewController
     */
    public onFormWFSubmitted(): void {
        this.refreshReferView();
        this.closeView();
    }

    /**
     * 更新视图参数
     * 
     * @memberof IBizEditViewController
     */
    public updateViewInfo(): void {
        // let newdata = false;
        // let field = this.getForm().findField('srfuf');
        // if (field != null) {
        // 	newdata = field.getValue() != '1';
        // }
        // let dataAccAction = this.getForm().getDataAccAction();
        // this.calcToolbarItemState(!newdata, dataAccAction);
        // if (newdata) {
        // 	this.setCaption('&lt;'+$IGM('EDITVIEWCONTROLLER.UPDATEVIEWINFO.CONTENT','新建')+'&gt;');
        // 	if (this.getDataInfoBar()) {
        // 		this.getDataInfoBar().setCurrentData({
        // 			srfkey: '',
        // 			srfmajortext: '&lt;'+$IGM('EDITVIEWCONTROLLER.UPDATEVIEWINFO.CONTENT','新建')+'&gt;'
        // 		});
        // 	}
        // } else {
        // 	field = this.getForm().findField('srfmajortext');
        // 	if (field != null) {
        // 		let value = field.getValue();
        // 		this.setCaption(value);
        // 		if (this.getDataInfoBar()) {
        // 			field = this.getForm().findField('srfkey');
        // 			keyvalue = field.getValue();
        // 			this.getDataInfoBar().setCurrentData({
        // 				srfkey: keyvalue,
        // 				srfmajortext: value
        // 			});
        // 		}
        // 	}
        // }
    }

    /**
     * 控制父页面刷新
     * 
     * @memberof IBizEditViewController
     */
    public refreshReferView(): void {
		
	}

    /**
     * 默认数据加载事件回调
     * 
     * @param {any} params 
     * @memberof IBizEditViewController
     */
    public onEditFormLoaded(params): void {

    }

    /**
     * 表单删除后触发
     * 
     * @param {any} params 
     * @memberof IBizEditViewController
     */
    public onEditFormRemoved(params): void {

    }

    /**
     * 表单删除后触发，关闭视图
     * 
     * @memberof IBizEditViewController
     */
    public onFormRemoved(): void {
        this.closeView();
    }

    /**
     * 表单项发生变化触发方法
     * 
     * @param {any} fieldname 字段名称
     * @param {any} value 字段值
     * @memberof IBizEditViewController
     */
    public onFormFieldChanged(fieldname, value): void {

    }

    /**
     * 实体界面行为
     * 
     * @param {any} uiaction 
     * @param {any} params 
     * @returns {void} 
     * @memberof IBizEditViewController
     */
    public doDEUIAction(uiaction, params): void {
        if (uiaction.tag == 'Help') {
            this.doHelp();
            return;
        }
        if (uiaction.tag == 'SaveAndStart') {
            this.doSaveAndStart();
            return;
        }
        if (uiaction.tag == 'SaveAndExit') {
            this.doSaveAndExit();
            return;
        }
        if (uiaction.tag == 'SaveAndNew') {
            this.doSaveAndNew();
            return;
        }
        if (uiaction.tag == 'Save') {
            this.doSave();
            return;
        }
        if (uiaction.tag == 'Print') {
            this.doPrint();
            return;
        }
        if (uiaction.tag == 'Copy') {
            this.doCopy();
            return;
        }
        if (uiaction.tag == 'RemoveAndExit') {
            this.doRemoveAndExit();
            return;
        }
        if (uiaction.tag == 'Refresh') {
            this.doRefresh();
            return;
        }
        if (uiaction.tag == 'New') {
            this.doNew();
            return;
        }
        if (uiaction.tag == 'FirstRecord') {
            this.doMoveToRecord('first');
            return;
        }
        if (uiaction.tag == 'PrevRecord') {
            this.doMoveToRecord('prev');
            return;
        }
        if (uiaction.tag == 'NextRecord') {
            this.doMoveToRecord('next');
            return;
        }
        if (uiaction.tag == 'LastRecord') {
            this.doMoveToRecord('last');
            return;
        }
        if (uiaction.tag == 'Exit' || uiaction.tag == 'Close') {
            this.doExit();
            return;
        }
        super.doDEUIAction(uiaction, params);
    }
    /**
     * 帮助
     * 
     * @memberof IBizEditViewController
     */
    public doHelp(): void {
        //IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'),$IGM('EDITVIEWCONTROLLER.DOHELP.INFO','编辑界面_帮助操作！'),5);
    }

    /**
     * 保存并开始执行工作流
     * 
     * @memberof IBizEditViewController
     */
    public doSaveAndStart(): void {
        this.afterformsaveaction = 'startwf';
        this.saveData();
    }

    /**
     * 保存并退出
     * 
     * @memberof IBizEditViewController
     */
    public doSaveAndExit(): void {
        this.afterformsaveaction = 'exit';
        this.saveData({});
    }

    /**
     * 保存并新建
     * 
     * @memberof IBizEditViewController
     */
    public doSaveAndNew(): void {
        this.afterformsaveaction = 'new';
        this.saveData({});
    }

    /**
     * 保存
     * 
     * @memberof IBizEditViewController
     */
    public doSave(): void {
        this.afterformsaveaction = '';
        this.saveData({});
    }

    /**
     * 打印
     * 
     * @memberof IBizEditViewController
     */
    public doPrint(): void {
        this.alert('提示', '编辑界面_打印操作');
        // let arg = {};
        // arg.srfkey = '';
        // let field = this.getForm().findField('srforikey');
        // if (field) {
        // 	arg.srfkey = field.getValue();
        // }
        // if (arg.srfkey == undefined || arg.srfkey == '') {
        // 	field = this.getForm().findField('srfkey');
        // 	if (field) {
        // 		arg.srfkey = field.getValue();
        // 	}
        // }
        // if(arg.srfkey=='')
        // 	return;
        // this.onPrintData(arg);
    }

    /**
     * 拷贝
     * 
     * @memberof IBizEditViewController
     */
    public doCopy(): void {
        this.alert('提示', '编辑界面_拷贝操作');
        // let arg = {};
        // $.extend(arg, this.getViewParam());
        // arg.srfkey = '';
        // let field = this.getForm().findField('srforikey');
        // if (field) {
        // 	arg.srfsourcekey = field.getValue();
        // }
        // if (arg.srfsourcekey == undefined || arg.srfsourcekey == '') {
        // 	field = this.getForm().findField('srfkey');
        // 	if (field) {
        // 		arg.srfsourcekey = field.getValue();
        // 	}
        // }
        // if (arg.srfsourcekey == undefined || arg.srfsourcekey == '') {
        // 	IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'),$IGM('EDITVIEWCONTROLLER.DOCOPY.INFO','当前表单未加载数据，不能拷贝'),0);
        // 	return;
        // }
        // this.getForm().autoLoad(arg);
    }

    /**
     * 删除并关闭
     * 
     * @memberof IBizEditViewController
     */
    public doRemoveAndExit(): void {
        this.confirm('提示', '确认要删除当前数据，删除操作将不可恢复？', (result) => {
            if (result) {
                this.removeData();
            }
        });;
    }

    /**
     * 刷新
     * 
     * @memberof IBizEditViewController
     */
    public doRefresh(): void {
        this.alert('提示', '编辑界面_刷新操作');
    }

    /**
     * 新建
     * 
     * @memberof IBizEditViewController
     */
    public doNew(): void {
        this.alert('提示', '编辑界面_新建操作');
    }

    /**
     * 退出
     * 
     * @memberof IBizEditViewController
     */
    public doExit(): void {
        this.closeView();
    }

    /**
     * 保存数据
     * 
     * @param {any} [arg={}] 保存时传递的数据
     * @memberof IBizEditViewController
     */
    public saveData(arg = {}): void {
        this.getForm().save2(arg);
    }

    /**
     * 删除数据
     * 
     * @param {any} [arg={}] 删除时传递的数据
     * @memberof IBizEditViewController
     */
    public removeData(arg = {}): void {
        this.getForm().remove(arg);
    }

    public updateFormItems(arg): void {
        this.getForm().updateFormItems(arg);
    }

    public showCommandBar(bShow): void {
        // let toolbar = this.getToolbar();
        // if (toolbar && (toolbar.isHidden() == bShow)) {
        //     if (bShow) {
        //         toolbar.show();
        //     } else toolbar.hide();
        // }
    }

    /**
     * 执行工作流界面行为
     * 
     * @param {any} uiaction 
     * @param {any} params 
     * @returns {void} 
     * @memberof IBizEditViewController
     */
    public doWFUIAction(uiaction, params): void {
        if (this.isEnableEditData()) {
            if (this.afterformsaveaction != 'dowfuiactionok') {
                this.afterformsaveaction = 'dowfuiaction';
                this.lastwfuiaction = uiaction;
                this.lastwfuaparam = params;
                this.saveData(params);
                return;
            }
            this.afterformsaveaction = '';
            this.lastwfuiaction = null;
            this.lastwfuaparam = null;
        }

        if (uiaction.actionmode == 'WFBACKEND') {
            let arg = {
                srfwfiatag: uiaction.tag
            };
            this.getForm().wfsubmit(arg);
            return;
        }
        super.doWFUIAction(uiaction, params);
    }

    /**
     * 启动工作流
     * 
     * @param {any} arg 
     * @memberof IBizEditViewController
     */
    public startWF(arg): void {
        let startuiaction = this.getUIAction('WFStartWizard');
        if (startuiaction) {
            this.doUIAction(startuiaction, arg);
        }
        else {
            this.getForm().wfstart(arg);
        }
    }

    public doMoveToRecord(target): void {
        // let referView = this.getReferView();
        // if (referView && referView.moveRecord) {
        //     let record = referView.moveRecord(target);
        //     if (record) {
        //         let loadParam = {};
        //         Object.assign(loadParam, {
        //             srfkey: record.get('srfkey')
        //         });
        //         this.getForm().autoLoad(loadParam);
        //     }
        // }
    }
    
    public doBackendUIAction(arg): void {
        this.getForm().doUIAction(arg);
    }

	/**
	 * 获取前台行为参数
	 * @param uiaction 行为
	 */
    public getFrontUIActionParam(uiaction): any {
        let arg = super.getFrontUIActionParam(uiaction, {});
        if (uiaction.actiontarget == 'SINGLEKEY' || uiaction.actiontarget == 'MULTIKEY') {
            //let dataInfo = '';
            let keys = '';
            if (this.getForm().$data.srfkey) {
                keys = this.getForm().$data.srfkey;
            }
            if (keys == undefined || keys == '') {
                if (this.getForm().$data.srfkey) {
                    keys = this.getForm().$data.srfkey;
                }
            }
            return Object.assign(arg, { srfkeys: keys, srfkey: keys });
        }
        return arg;
    }

    public getBackendUIActionParam(uiaction): any {
        if (uiaction.actiontarget == 'SINGLEKEY' || uiaction.actiontarget == 'MULTIKEY') {
            let dataInfo = '';
            let keys = '';

            if (this.getForm().$data.srfkey) {
                keys = this.getForm().$data.srfkey;
            }
            if (this.getForm().$data.srfmajortext) {
                dataInfo = this.getForm().$data.srfmajortext;
            }
            return Object.assign({ srfkeys: keys, dataInfo: dataInfo }, this.getForm().$data);
        }
        return {};
    }

    public onWFUIFrontWindowClosed(result): void {
        if (result)
            if (result.ret == 'OK') {
                this.closeView();
            }
    }
    
    /**
     * 是否启用新建功能
     * 
     * @returns {boolean} 
     * @memberof IBizEditViewController
     */
    public isEnableNewData(): boolean {
        return true;
    }

    /**
     * 是否启用编辑功能
     * 
     * @returns {boolean} 
     * @memberof IBizEditViewController
     */
    public isEnableEditData(): boolean {
        return true;
    }

    /**
     * 是否启用删除功能
     * 
     * @returns {boolean} 
     * @memberof IBizEditViewController
     */
    public isEnableRemoveData(): boolean {
        return true;
    }

    /**
     * 打印数据
     * 
     * @param {any} arg 
     * @memberof IBizEditViewController
     */
    public onPrintData(arg): void {
        this.doPrintDataNormal(arg);
    }

    /**
     * 常规新建数据
     * 
     * @param {any} arg 
     * @returns {boolean} 
     * @memberof IBizEditViewController
     */
    public doPrintDataNormal(arg): boolean {
        // let view = this.getPrintDataView(arg);
        // if (view == null) {
        //     return false;
        // }
        // let viewurl = view.viewurl;
        // if (!viewurl || viewurl == '') {
        //     viewurl = BASEURL + '/ibizutil/print.pdf';
        // }
        // else {
        //     viewurl = BASEURL + viewurl;
        // }
        // viewurl = viewurl + (viewurl.indexOf('?') == -1 ? '?' : '&') + $.param(view.viewparam);
        // window.open(viewurl, '_blank');
        return true;
    }

    public getPrintDataView(arg): any {
        return null;
    }

    /**
     * 表单项值变化事件
     * 
     * @param {string} name 
     * @param {*} value 
     * @returns {*} 
     * @memberof IBizEditViewController
     */
    public onFieldValueChanged(fieldname: string, value: any, field: any): void {

    }

    /**
     * 表单保存完成回调
     * 
     * @param {any} params 
     * @memberof IBizEditViewController
     */
    public onEditFormSaved(params): void {

    }
    /**
     * 重写视图控制器,退出方法。进行表单脏检查。
     * 
     * @memberof IBizEditViewController
     */
    public backView(): void {
        if(this.getForm() && this.getForm().getIsDirty()){
            this.confirm('提示','数据修改后未保存,确认要退出吗?', () => {
                super.backView();
            });
        } else {
            super.backView();
        }
    }

}