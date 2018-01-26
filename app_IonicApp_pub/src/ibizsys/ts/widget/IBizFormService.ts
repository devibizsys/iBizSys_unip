import { IBizService } from './IBizService';

export class IBizFormService extends IBizService {
    /**
     * 临时简易脏检查,true为表单值改变了但未保存。false为值未改变可推出。
     * 
     * @type {boolean}
     * @memberof IBizFormService
     */
    public isDirty: boolean = false;

    public $timeOut: any;
    public $editor: any = {};
    public $data: any = {};
    public $state: any = {};
    public $config: any = {};
    public $dataAccAction: any = {};
    public $item: any = {};
    public ignoreUFI: boolean;
    public ignoreformfieldchange: boolean;
    public ignoreFieldValueChange: boolean;
    public formDirty: boolean;

    constructor(opt) {
        super(opt);
        this.init();
    }

    public init(): void {
        this.onInit();
    }

    /**
     * 初始化多项数据部件
     * 
     * @memberof IBizFormService
     */
    public onInit(): void {
        this.regItems();
    }

    /**
     * 获取表单数据
     * 
     * @returns {*} 
     * @memberof IBizFormService
     */
    public getData(): any {
        return this.$data;
    }

    /**
     * 加载
     * 
     * @param {*} [arg={}] 参数
     * @returns {void} 
     * @memberof IBizFormService
     */
    public autoLoad(arg: any = {}): void {
        var me = this;
        if (arg.srfkey != undefined && arg.srfkey != '') {
            me.load(arg);
            return;
        }
        if (arg.srfkeys != undefined && arg.srfkeys != '') {
            arg.srfkey = arg.srfkeys;
            me.load(arg);
            return;
        }
        me.loadDraft(arg);
    }

    /**
     * 
     * 
     * @param {*} [opt={}] 
     * @memberof IBizFormService
     */
    public load(opt: any = {}): void {
        //触发BEFORELOAD
        this.fire(this.$staticVariables.BEFORELOAD, opt);

        // if (IBizApp_Data)
        //     opt.srfappdata = IBizApp_Data;

        //这里可能需要深拷贝，方法后期需要更改
        var params: any = {};
        Object.assign(params, opt);

        Object.assign(params, { srfaction: 'load', srfctrlid: this.getName() });

        delete params.successcb;
        delete params.errorcb;
        this.mask();
        this.fillPostParams(params);
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
                this.ignoreUFI = true;
                this.ignoreFieldValueChange = true;

                this.fillForm(response.data);
                this.setFieldAsyncConfig(response.config);
                this.setFieldState(response.state);
                this.setDataAccAction(response.dataaccaction);
                this.fire(this.$staticVariables.LOADED, '');

                // var data = cbarg;

                //this.resetError();
                this.formDirty = false;

                this.ignoreFieldValueChange = false;
                this.ignoreUFI = false;

                this.onLoaded();

                // if (opt.successcb) {
                //     opt.successcb(cbarg);
                // }
                this.initDirtyCheckState();//初始化脏检查状态
            },
            error => {
                this.unmask();
                console.log(error);
            }
            );
    }

    /**
     * 加载默认数据
     * 
     * @param {*} [arg={}] 
     * @memberof IBizFormService
     */
    public loadDraft(arg: any = {}): void {
        let opt: any = {};
        Object.assign(opt, arg);
        //触发BEFORELOAD
        this.fire(this.$staticVariables.BEFORELOAD, opt);

        // if (IBizApp_Data)
        //     opt.srfappdata = IBizApp_Data;

        if (!opt.srfsourcekey || opt.srfsourcekey == '') {
            Object.assign(opt, { srfaction: 'loaddraft', srfctrlid: this.getName() });
        } else {
            Object.assign(opt, { srfaction: 'loaddraftfrom', srfctrlid: this.getName() });
        }
        //这里可能需要深拷贝，方法后期需要更改
        let params: any = {};
        Object.assign(params, opt);
        delete params.successcb;
        delete params.errorcb;
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
                if (response.config) {
                    this.$config = response.config;
                }
                this.ignoreUFI = true;
                this.ignoreFieldValueChange = true;

                this.fillForm(response.data);
                this.setFieldAsyncConfig(response.config);
                this.setFieldState(response.state);
                this.setDataAccAction(response.dataaccaction);
                this.fire(this.$staticVariables.LOADED, '');

                // let data = cbarg;

                // me.resetError();
                this.formDirty = false;

                this.ignoreFieldValueChange = false;
                this.ignoreUFI = false;

                this.onLoaded();

                // if (opt.successcb) {
                //     opt.successcb(cbarg);
                // }
                this.initDirtyCheckState();//初始化脏检查状态
            },
            error => {
                this.unmask();
                console.log(error);
            }
            );
    }

    /**
     * 加载草稿完成触发
     * 
     * @memberof IBizFormService
     */
    public onDraftLoaded(): void {

    }

    /**
     * 加载数据完成时触发
     * 
     * @memberof IBizFormService
     */
    public onLoaded(): void {

    }

    /**
     * 设置属性异步配置
     * 
     * @param {any} config 配置
     * @returns {void} 
     * @memberof IBizFormService
     */
    public setFieldAsyncConfig(config): void {
        if (config == undefined || config == null) {
            return;
        }
        this.$config = config;
        for (let name in config) {
            let value = config[name];
            let item = this.$item[name];
            if (item) {
                item.config = value;
            }
            else {
                console.log('无效表单成员==>' + name);
            }
            if (this.$editor[name] && this.$editor[name].setAsyncConfig) {
                this.$editor[name].setAsyncConfig(value);
            }
        }
    }

    /**
     * 设置数据访问权限
     * 
     * @param {any} dataaccaction 权限
     * @memberof IBizFormService
     */
    public setDataAccAction(dataaccaction): void {
        this.$dataAccAction = dataaccaction;
        this.fire(this.$staticVariables.DATAACCACTIONCHANGED, dataaccaction);
    }

    /**
     * 表单项是否允许空输入
     * 
     * @param {string} name 表单项名称
     * @param {boolean} allowEmpty 逻辑值
     * @memberof IBizFormService
     */
    public setFieldAllowBlank(name: string, allowEmpty: boolean): void {
        let formIitem = this.$item[name];
        formIitem.allowEmpty = !allowEmpty;
    }

    /**
     * 表单项是否允许输入
     * 
     * @param {string} name 表单项名称
     * @param {boolean} disabled 逻辑值
     * @memberof IBizFormService
     */
    public setFieldDisabled(name: string, disabled: boolean): void {
        let formIitem = this.$item[name];
        formIitem.disabled = !disabled;
    }

    /**
     * 设置属性状态
     * 
     * @param {any} state 状态
     * @returns {void} 
     * @memberof IBizFormService
     */
    public setFieldState(state): void {
        if (state == undefined || state == null) {
            return;
        }
        this.$state = state;
        for (let name in state) {
            let value = state[name];
            let disabled = ((value & 1) == 0);
            if (this.$item[name]) {
                this.$item[name].disabled = disabled;
            } else {
                console.log('无效表单成员==>' + name);
            }
        }
    }

    /**
     * 填充表单
     * 
     * @param {any} data 数据
     * @returns {void} 
     * @memberof IBizFormService
     */
    public fillForm(data): void {
        if (!data) {
            return;
        }
        for (let key in data) {
            let val = data[key];
            this.setFieldValue(key, val);
        }
        this.$data = data;
    }

    /**
     * 注册表单成员
     * 
     * @param {*} _item 项目
     * @memberof IBizFormService
     */
    public regItem(_item: any): void {
        let name = _item.name;
        if (name) {
            this.$item[name] = _item;
            // _item.form = this;
        }
    };

    /**
     * 注册所有表单成员
     * 
     * @memberof IBizFormService
     */
    public regItems(): void {

    }

    /**
     * 设置当前字段是否可见
     * 
     * @param {string} name 字段名
     * @param {boolean} visible 是否可见(true为可见,false为不可见)
     * @memberof IBizFormService
     */
    public setItemVisible(name: string, visible: boolean): void {
        if (this.$item[name]) {
            this.$item[name].visible = visible;
        }
    }

    /**
     * 注销表单成员
     * 
     * @param {string} name 项目名称
     * @memberof IBizFormService
     */
    public unregItem(name: string): void {
        delete this.$data[name];
    }

    /**
     * 注册表单编辑器
     * 
     * @param {any} editorOpts 项目
     * @memberof IBizFormService
     */
    public regEditor(editorOpts): void {
        let name = editorOpts.name;
        if (name) {
            this.$editor[name] = editorOpts;
        }
    }

    /**
     * 注销表单编辑器
     * 
     * @param {any} name 项目名称
     * @memberof IBizFormService
     */
    public unregEditor(name): void {
        delete this.$editor[name];
    }

    /**
     * 字段值发生变化
     * 
     * @param {any} item 项名称
     * @param {any} newVal 新值
     * @param {any} oldVal 旧值
     * @memberof IBizFormService
     */
    public onFieldValueChanged(item, newVal, oldVal): void {
        let me = this;
        if (me.$editor && me.$editor[item]) {
            me.$editor[item].onValueChanged(newVal, oldVal);
        }
        if (!me.ignoreFieldValueChange) {
            me.fire(this.$staticVariables.FIELDVALUECHANGED, item);
        }
    }

    /**
     * 字段禁用状态发生变化
     * 
     * @param {any} item 项名称
     * @param {any} newVal 新值
     * @param {any} oldVal 旧值
     * @memberof IBizFormService
     */
    public onFieldDisabledChanged(item, newVal, oldVal): void {
        let me = this;
        if (me.$editor && me.$editor[item]) {
            me.$editor[item].onDisabledChanged(newVal);
        }
    }

    /**
     * 设置表单内容区是否可以见
     * 
     * @param {string} name 表单项或分组名称
     * @param {boolean} visibled 是否可见
     * @memberof IBizFormService
     */
    public setPanelVisible(name: string, visibled: boolean): void {
        this.$item[name].visible = visibled;
    }

    /**
     * 
     * 
     * @param {any} mode 
     * @memberof IBizFormService
     */
    public updateFormItems(mode): void {
        let me = this;
        let params: any = {};
        let data = me.getData();

        me.fire(this.$staticVariables.UPDATEFORMITEMBEFORE, data);

        params.srfufimode = mode;
        params.srfaction = "updateformitem";
        params.srfactivedata = JSON.parse(data);

        this.post(params)
            .subscribe(
            res => {
                if (res.ret == 0) {
                    // me.fire(this.$staticVariables.UPDATEFORMITEM, res.data);
                    me.fillForm(res.data);
                } else {
                    this.showToast(res.errorMessage);
                }
            },
            error => {

            }
            );
    }

    /**
     * 
     * 
     * @param {any} action 
     * @returns {*} 
     * @memberof IBizFormService
     */
    public getActionErrorInfo(action): any {
        if (action.failureType === 'CONNECT_FAILURE') {
            return 'Status:' + action.response.status + ': ' + action.response.statusText;
        }
        if (action.failureType === 'SERVER_INVALID') {
            let msg = action.errorMessage;
            if (action.error && action.error.items) {
                // $.each(action.error.items, function (index, item) {
                //     if (index >= 5) {
                //         msg += ("<BR>...... ");
                //         return false;
                //     }
                //     if (item.info && item.info != '') {
                //         msg += ("<BR>" + item.info);
                //     }
                // });
            }
            return msg;
        }
        if (action.failureType === 'CLIENT_INVALID') {
            return "";
        }
        if (action.failureType === 'LOAD_FAILURE') {
            return "";
        }
    }

    /**
     * 控件卸载调用
     * 
     * @returns {*} 
     * @memberof IBizFormService
     */
    public onDestroy(): any {
        // let me = this;
        // me.closeDataProxy();
        // IBizControl2.prototype.onDestroy.call(me);
    }

    /**
     * 关闭数据对象
     * 
     * @returns {*} 
     * @memberof IBizFormService
     */
    public closeDataProxy(): any {
        // let me = this;
        // if (me.dataProxy) {
        //     me.dataProxy.destroy();
        //     me.dataProxy = null;
        // }
    }

    /**
     * 获取表单类型
     * 
     * @returns {string} 
     * @memberof IBizFormService
     */
    public getFormType(): string {
        return 'FORM';
    }

    /**
     * 获取指定字段内容
     * 
     * @param {string} name 字段名
     * @returns {*} 
     * @memberof IBizFormService
     */
    public findField(name: string): any {
        return this.$item[name];
    }

    /**
     * 根据字段名称获取表单值
     * 
     * @param {string} name 字段名
     * @returns {*} 
     * @memberof IBizFormService
     */
    public getFieldValue(name: string): any {
        return this.$data[name];
    }

    /**
     * 设置表单字段值
     * 
     * @param {string} field 字段名称
     * @param {string} value 字段值
     * @memberof IBizFormService
     */
    public setFieldValue(field: string, value: string): void {
        if (this.$item[field]) {
            this.$item[field].value = value;
        }
    }

    /**
     * 表单项变化触发事件
     * 
     * @param {any} $event 
     * @param {string} fieldname 
     * @memberof IBizEditViewController
     */
    public fieldChange($event, fieldname: string, field: any): void {
        if (this.$timeOut) {
            clearTimeout(this.$timeOut);
            this.$timeOut = undefined;
        }
        this.$timeOut = setTimeout(() => {
            if (this.$item[fieldname]) {
                let params: any = {};
                params.name = fieldname;
                params.value = $event;
                params.field = field;
                this.fire(this.$staticVariables.FIELDVALUECHANGED, params);
                this.$item[fieldname].value = $event;
            }
        }, 1000);
        //设置脏检查，值为改变过。
        this.isDirty = true;
    }

    /**
     * 重置表单
     * 
     * @memberof IBizFormService
     */
    public reset(): void {
        this.autoLoad();
    }

    /**
     * 获取脏检查状态
     * 
     * @returns {boolean} 
     * @memberof IBizFormService
     */
    public getIsDirty(): boolean {
        return this.isDirty;
    }
    
    /**
     * 初始化脏检查状态
     * 
     * @memberof IBizFormService
     */
    public initDirtyCheckState(): void {
        this.isDirty = false;
    }
}