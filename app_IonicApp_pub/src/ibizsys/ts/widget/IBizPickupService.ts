import { IBizListService } from '../../../ibizsys/ts/widget/IBizListService'

export class IBizPickupService extends IBizListService {
    constructor(opt) {
        super(opt);
    }

    public onInit(): void {
        super.onInit();
        this.load();
    }

    /**
     * 加载数据
     * 
     * @param {any} [opt={}] 
     * @returns {void} 
     * @memberof IBizPickupService
     */
    public load(opt = {}): void {
        if (this.$loading) {
            return;
        }
        Object.assign(opt, { 'srfctrlid': this.$name, 'srfaction': 'fetch' });

        let me = this;
        //设置为正在加载，使load方法在加载中时不可用。
        this.$loading = true;
        //发送加载数据前事件
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
                    return;
                }
                me.formattedData(response.items);
                me.$loading = false;
            },
            error => {
                me.$loading = false;
                this.unmask();
                this.showToast('数据加载失败,请检查网络连接或投诉');
            }
            );
        //super.load(opt);
    }

    /**
     * 格式化加载的数据
     * 
     * @param {any} items 
     * @memberof IBizPickupService
     */
    public formattedData(items): void {
        if (items) {
            if (!this.$component.multiselect) {
                for (let i: number = 0; i < items.length; i++) {
                    if (Object.is(this.getCurrentValue(), items[i].srfkey)) {
                        items[i]['checked'] = true;
                        continue;
                    }
                    items[i]['checked'] = false;
                }
                this.$items = items;
            } else {
                for (let i: number = 0; i < items.length; i++) {
                    let judge = false;
                    if (this.getCurrentValue()) {
                        let currentValue = this.getCurrentValue();
                        currentValue.forEach(element => {
                            if (Object.is(element.srfkey, items[i].srfkey)) {
                                judge = true;
                            }
                        });
                        items[i]['checked'] = judge;
                    }
                }
                this.$items = items;
            }
        }
    }

    public cancelChecked(item: any): void {
        if(item) {
            this.$items.forEach((element) => {
                if(Object.is(element.srfkey, item.srfkey)){
                    element.checked = false;
                    return;
                }
            });
        }
    }
}
