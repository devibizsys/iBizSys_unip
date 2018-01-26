import { IBizService } from './IBizService';

export class IBizMDService extends IBizService {
    public $items: any[] = [];
    public $selection: any[] = [];
    public $enableMulit: boolean = false;
    public $loading: boolean = false;
    //查询开始条数
    public $start: number = 0;
    //每次加载条数
    public $limit: number = 20;
    //总条数
    public $totalrow: number = 0;
    //是否还可下拉加载
    public $infinite: boolean = true;

    constructor(opt) {
        super(opt);
    }

    /**
     * 加载数据
     * 
     * @param {*} [arg={}] 
     * @returns {void} 
     * @memberof IBizMDService
     */
    public load(arg: any = {}): void {
        let opt: any = {};
        Object.assign(opt, arg);
        if (this.$loading) {
            return;
        }
        Object.assign(opt, { 'srfctrlid': this.$name, 'srfaction': 'fetch' });
        if (!opt.start && !opt.limit) {
            Object.assign(opt, { 'start': this.$start, 'limit': this.$limit });
        }
        let me = this;
        //设置为正在加载，使load方法在加载中时不可用。
        this.$loading = true;
        //发送加载数据前事件
        this.fire(this.$staticVariables.BEFORELOAD, opt);
        this.mask();
        this.fillPostParams(opt);
        this.post(opt)
            .subscribe(
            response => {
                this.unmask();
                if (!response.items || response.ret != 0) {
                    if (response.errorMessage) {
                        this.showToast(response.errorMessage);
                    }
                    // me.ignoreUFI = false;
                    // me.ignoreformfieldchange = false;
                    me.$loading = false;
                    return;
                }
                if (Object.is(me.$start, 0)) {
                    me.$items = response.items;
                } else {
                    me.$items.push(...response.items);
                }
                me.$totalrow = response.totalrow;
                me.$loading = false;
            },
            error => {
                me.$loading = false;
                this.unmask();
                this.showToast('数据加载失败,请检查网络连接或投诉');
            }
            );
    }

    /**
     * 下拉加载
     * 
     * @param {any} opt 
     * @memberof IBizMDService
     */
    public loadNext(opt): void {
        if (this.$totalrow > (this.$start + this.$limit)) {
            this.$start += this.$limit;
            this.load(opt);
        } else {
            this.$infinite = false;
        }
    }

    /**
     * 设置选中数据
     * 
     * @param {any} selection 
     * @memberof IBizMDService
     */
    public setSelection(selection): void {
        this.$selection = selection;
        this.fire(this.$staticVariables.SELECTIONCHANGE, this.$selection);
    }

    /**
     * 获取选中数据
     * 
     * @param {any} selection 
     * @returns {*} 
     * @memberof IBizMDService
     */
    public getSelection(selection): any {
        return this.$selection;
    }

    /**
     * 列表项点击
     * 
     * @param {any} item 
     * @returns {void} 
     * @memberof IBizMDService
     */
    public clickItem(item): void {
        if (this.$loading) {
            return;
        }
        this.setSelection([item]);
    }

    /**
     * 
     * 
     * @param {any} item 
     * @memberof IBizMDService
     */
    public activeItem(item): void {

    }

    /**
     * 是否正在加载
     * 
     * @returns {boolean} 
     * @memberof IBizMDService
     */
    public isloading(): boolean {
        return this.$loading;
    }

    /**
     * 重置分页
     * 
     * @memberof IBizMDService
     */
    public resetStart(): void {
        this.$start = 0;
        this.$infinite = true;
    }

    /**
     * 
     * 
     * @returns {boolean} 
     * @memberof IBizMDService
     */
    public isInfinite(): boolean {
        return this.$infinite;
    }

    /**
     * 获取列表中某条数据
     * 
     * @param {string} name 字段
     * @param {string} value 名称
     * @returns {*} 
     * @memberof IBizMDService
     */
    public findItem(name: string, value: string): any {
        let item: any;
        this.$items.forEach((element: any) => {
            if (Object.is(element[name], value)) {
                item = element;
                return;
            }
        })
        return item;
    }

    /**
     * 删除数据
     * 
     * @param {*} [arg={}] 
     * @memberof IBizMDService
     */
    public remove(arg: any = {}): void {
        let params: any = {}
        Object.assign(params, arg);
        Object.assign(params, { 'srfaction': 'remove', 'srfctrlid': this.$name });
        // if (IBizApp_Data) {
        // 	arg.srfappdata = IBizApp_Data;
        // }
        this.fillPostParams(params);
        this.post(params)
            .subscribe(
            response => {
                if (response.ret == 0) {
                    this.load({ 'start': 0, 'limit': this.$start });
                    if (response.info && response.info != '') {
                        this.showToast('删除成功!');
                    }
                    //IBiz.processResult(data);
                } else {
                    this.showToast('删除数据失败,' + response.info);
                }
            },
            error => {
                this.showToast('删除数据失败');
            });
    }
}