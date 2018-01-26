import { IBizMDService } from './IBizMDService';

export class IBizTreeService extends IBizMDService {
    public $trunks: any[] = [];
    public $leafy: any[] = [];

    constructor(opt) {
        super(opt);
    }

    /**
     * 加载页面数据
     * 
     * @param {*} [opt={}] 
     * @returns {void} 
     * @memberof IBizTreeService
     */
    public load(opt: any = {}): void {
        if (this.$loading) {
            return;
        }
        if (!opt) {
            opt = {};
        }
        let params = {};
        if (opt.id) {
            Object.assign(params, { 'srfnodeid': opt.id });
        }
        Object.assign(params, { 'srfctrlid': this.$name, 'srfaction': 'fetch' });
        let me = this;
        //目前写死需要loading,后期需要参数，指示是否需要loading
        this.$loading = true;
        //发送加载数据前事件
        this.fire(this.$staticVariables.BEFORELOAD, params);
        this.mask();
        this.fillPostParams(params);
        this.post(params)
            .subscribe(
                response => {
                    this.unmask();
                    me.$loading = false;
                    let items = response.items;
                    me.$trunks = [];
                    me.$leafy = [];
                    if (items) {
                        let selectedDatas: any[] = this.getCurrentValue();
                        items.forEach(element => {
                            if(selectedDatas){
                                element.checked = selectedDatas.find( (value: any, index, arr) => {
                                    return Object.is(element.srfkey, value.srfkey);
                                });
                            }
                            if (!element.leaf) {
                                me.$trunks.push(element);
                            } else {
                                me.$leafy.push(element);
                            }
                        });
                    }
                },
                error => {
                    this.unmask();
                    this.showToast('数据加载失败');
                    me.$loading = false;
                }
            );
    }

    /**
     * 取消某数据选中状态
     * 
     * @param {*} item 
     * @memberof IBizTreeService
     */
    public cancelChecked(item: any): void {
        if(!item.leaf) {
            this.$trunks.forEach((element) => {
                if(Object.is(element.srfkey, item.srfkey)) {
                    element.checked = false;
                    return;
                }
            });
        } else {
            this.$leafy.forEach((element) => {
                if(Object.is(element.srfkey, item.srfkey)) {
                    element.checked = false;
                    return;
                }
            });
        }
    }
}