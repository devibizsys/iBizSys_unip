import { IBizFormService } from './IBizFormService';

export class IBizEditFormService extends IBizFormService {
    constructor(opt) {
        super(opt);
    }

    /**
     * 保存表单数据
     * 
     * @param {*} [params={}] 
     * @returns {void} 
     * @memberof IBizEditFormService
     */
    public save2(params: any = {}): void {
        // if(IBizApp_Data)
        // 	arg.srfappdata=IBizApp_Data;
        let data = this.getData();
        Object.assign(params, data);

        if (data.srfuf == "1") {
            Object.assign(params, { srfaction: 'update' });
        } else {
            Object.assign(params, { srfaction: 'create' });
        }

        //获取所有Disabled数据
        //let disablevalues = {};
        // $.each(this.fieldMap,function (name,item) {
        //     if (item.isDisabled()) {
        //         if (disablevalues[item.name] == undefined) {
        //         	disablevalues[item.name] = item.getValue();
        //         }
        //     }
        // });
        //Object.assign(arg, disablevalues);
        Object.assign(params, { srfctrlid: this.getName() });

        params.srfcancel = false;
        this.fire(this.$staticVariables.FORMBEFORESAVE, params);
        if (params.srfcancel == true) {
            return;
        }
        delete params.srfcancel;

        this.ignoreUFI = true;
        this.ignoreformfieldchange = true;

        this.fillPostParams(params);
        this.mask();
        this.post(params)
            .subscribe(
            response => {
                this.unmask();
                if (!response.data || response.ret != 0) {
                    if (response.data && response.data.error) {
                        //me.fillError(cbarg.data.error);
                    }
                    if (response.errorMessage) {
                        this.showToast(response.errorMessage);
                    }
                    this.ignoreUFI = false;
                    this.ignoreformfieldchange = false;
                    return;
                }
                this.showToast('保存成功');
                this.$data = response.data;
                this.fire(this.$staticVariables.FORMSAVED, response);
                this.initDirtyCheckState();//初始化脏检查状态
            },
            error => {
                this.unmask();
                console.log(error);
            }
            );
    }

    /**
     * 保存
     * 
     * @memberof IBizEditFormService
     */
    public onSaved(): void {

    }

    /**
     * 加载表单数据
     * 
     * @memberof IBizEditFormService
     */
    public reload(): void {
        let me = this;
        let field = me.findField('srfkey');
        let loadarg: any = {};
        if (field) {
            loadarg.srfkey = field.value;
            if (loadarg.srfkey.indexOf('SRFTEMPKEY:') == 0) {
                field = me.findField('srforikey');
                if (field) {
                    loadarg.srfkey = field.value;
                }
            }
        }
        if (this.$data.srfkey) {
            loadarg.srfkey = this.$data.srfkey;
            if (loadarg.srfkey.indexOf('SRFTEMPKEY:') == 0) {
                if (me.$data.srforikey) {
                    loadarg.srfkey = me.$data.srforikey;
                }
            }
        }
        me.autoLoad(loadarg);
    }

    /**
     * 删除数据
     * 
     * @param {any} arg 
     * @returns {void} 
     * @memberof IBizEditFormService
     */
    public remove(arg): void {
        if (!arg)
            arg = {};
        // if(IBizApp_Data)
        // 	arg.srfappdata=IBizApp_Data;
        if (!arg.srfkey) {
            if (this.findField('srfkey')) {
                arg.srfkey = this.findField('srfkey');
            }
            if (this.$data.srfkey) {
                arg.srfkey = this.$data.srfkey;
            }
        }

        if (arg.srfkey == undefined || arg.srfkey == null || arg.srfkey == '') {
            this.showToast('删除错误,当前表单未加载数据！');
            return;
        }
        Object.assign(arg, { srfaction: 'remove' });
        this.ignoreUFI = true;
    }

    /**
     * 工作流启动
     * 
     * @param {any} arg 
     * @returns {void} 
     * @memberof IBizEditFormService
     */
    public wfstart(arg): void {
        let me = this;
        if (!arg)
            arg = {};
        // if(IBizApp_Data)
        // 	arg.srfappdata=IBizApp_Data;
        if (!arg.srfkey) {
            if (me.findField('srfkey')) {
                arg.srfkey = me.findField('srfkey');
            }
            if (me.findField('srfkey')) {
                let v = me.findField('srfkey');
                if (v && v != '') {
                    arg.srfkey = v;
                }
            }
            if (this.$data.srfkey) {
                arg.srfkey = this.$data.srfkey;
                if (arg.srfkey.indexOf('SRFTEMPKEY:') == 0) {
                    if (me.$data.srforikey) {
                        arg.srfkey = me.$data.srforikey;
                    }
                }
            }
        }
        if (arg.srfkey == undefined || arg.srfkey == null || arg.srfkey == '') {
            this.showToast('启动流程错误,当前表单未加载!');
            return;
        }
        Object.assign(arg, me.$data);
        Object.assign(arg, { srfaction: 'wfstart', srfctrlid: me.getName() });
        me.ignoreUFI = true;
        me.ignoreformfieldchange = true;

        this.fillPostParams(arg);
        this.post(arg)
            .subscribe(
            response => {
                if (!response.data || response.ret != 0) {
                    if (response.data && response.data.error) {
                        //me.fillError(cbarg.data.error);
                    }
                    if (response.errorMessage) {
                        me.getViewController().showToast(response.errorMessage);
                    }
                    me.ignoreUFI = false;
                    me.ignoreformfieldchange = false;
                    return;
                }
                me.$data = response.data;
                me.formDirty = false;
                me.setFieldAsyncConfig(response.config);
                me.setFieldState(response.state);
                me.setDataAccAction(response.dataaccaction);
                me.fillForm(response.data);
                me.formDirty = false;
                me.fire(me.$staticVariables.FORMWFSTARTED, response.data);
                me.fire(me.$staticVariables.FORMFIELDCHANGED, response.data);
                me.fire(me.$staticVariables.FORMLOADED, response.data);
                me.ignoreUFI = false;
                me.ignoreformfieldchange = false;
                this.initDirtyCheckState();//初始化脏检查状态
            },
            error => {
                me.getViewController().showToast(error);
                me.ignoreUFI = false;
                me.ignoreformfieldchange = false;
            }
            );
    }

    /**
     * 工作流操作
     * 
     * @param {any} arg 
     * @returns {void} 
     * @memberof IBizEditFormService
     */
    public wfsubmit(arg): void {
        let me = this;
        if (!arg)
            arg = {};
        // if(IBizApp_Data)
        // 	arg.srfappdata=IBizApp_Data;

        Object.assign(arg, me.$data);
        Object.assign(arg, { srfaction: 'wfsubmit', srfctrlid: me.getName() });

        if (!arg.srfkey) {
            if (me.findField('srfkey')) {
                arg.srfkey = me.findField('srfkey');
            }
        }
        if (!arg.srfkey) {
            if (this.$data.srfkey) {
                arg.srfkey = this.$data.srfkey;
                if (arg.srfkey.indexOf('SRFTEMPKEY:') == 0) {
                    if (me.$data.srforikey) {
                        arg.srfkey = me.$data.srforikey;
                    }
                }
            }
        }
        if (arg.srfkey == undefined || arg.srfkey == null || arg.srfkey == '') {
            this.showToast('提交流程错误,当前表单未加载!');
            return;
        }

        me.ignoreUFI = true;
        me.ignoreformfieldchange = true;

        this.fillPostParams(arg);
        this.post(arg)
            .subscribe(
            response => {
                if (!response.data || response.ret != 0) {
                    if (response.data && response.data.error) {
                        //me.fillError(cbarg.data.error);
                    }
                    if (response.errorMessage) {
                        me.getViewController().showToast(response.errorMessage);
                    }
                    me.ignoreUFI = false;
                    me.ignoreformfieldchange = false;
                    return;
                }
                me.$data = response.data;
                me.setFieldAsyncConfig(response.config);
                me.setFieldState(response.state);
                me.setDataAccAction(response.dataaccaction);
                me.fillForm(response.data);
                me.formDirty = false;
                me.fire(this.$staticVariables.FORMLOADED, response.data);
                me.fire(this.$staticVariables.FORMWFSUBMITTED, response.data);
                me.ignoreUFI = false;
                me.ignoreformfieldchange = false;
                me.fire(this.$staticVariables.FORMFIELDCHANGED, response.data);
                this.initDirtyCheckState();//初始化脏检查状态
            },
            error => {
                me.getViewController().showToast(error);
                me.ignoreUFI = false;
                me.ignoreformfieldchange = false;
            }
            );
    }

    /**
     * 界面行为
     * 
     * @param {*} [arg={}] 
     * @memberof IBizEditFormService
     */
    public doUIAction(arg: any = {}): void {
        let params: any = {};
        Object.assign(params, { 'srfaction': 'uiaction', 'srfctrlid': this.$name });
        Object.assign(params, arg);
        // if (IBizApp_Data) {
        //     arg.srfappdata = IBizApp_Data;
        // }
        this.fillPostParams(params);
        this.mask();
        this.post(params)
            .subscribe(
            response => {
                this.unmask();
                //IBiz.endload(me.loadingTag);
                if (response.ret == 0) {
                    //IBiz.processResultBefore(data);
                    this.fire(this.$staticVariables.UIACTIONFINISHED, response);
                    if (response.reloadData) {
                        this.reload();
                    }
                    if (response.info && response.info != '') {
                        this.showToast(response.info);
                    }
                    //IBiz.processResult(data);
                    this.initDirtyCheckState();//初始化脏检查状态
                } else {
                    this.showToast('界面操作错误信息:'+response.errorMessage);
                }
            },
            errpr => {
                this.unmask();
                this.showToast('界面操作错误信息,执行请求异常!');
                //IBiz.endload(me.loadingTag);
            }
            );
    }

    /**
     * 获取当前表单类型
     * 
     * @returns {string} 
     * @memberof IBizEditFormService
     */
    public getFormType(): string {
        return 'EDITFORM';
    }
}