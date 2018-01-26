import { IBizMainViewController } from './IBizMainViewController';

export class IBizMPickupViewController extends IBizMainViewController {
    public $multiselect: boolean = false;
    public $currentValue: any;
    public $values: any[] = [];
    public $deleteData: any = {};

    constructor(opt) {
        super(opt);
        if (this.$navParams.get('params')) {
            let params = this.$navParams.get('params');
            if (params.currentValue) {
                let current: any = [];
                params.currentValue.forEach((e: any) => {
                    current.push({ 'srfkey': e.srfkey, 'srfmajortext': e.srfmajortext, 'checked': true });
                });
                this.$currentValue = current;
                this.$values = current;
            }
        }
    }

    /**
     * 删除节点值
     * 
     * @param {*} item 
     * @memberof IBizMPickupViewController
     */
    public deleteCheckedData(): void {
        if (this.$values.length > 0) {
            let items: any [] = [...this.$values];
            this.openModal({ 'className': 'DeleteCheckedDataPage', 'viewParam': { 'values': items } }, (result) => {
                let values: any[] = result.values;
                let deleteValues: any[] = result.deleteValues;
                if(values) {
                    this.$deleteData = deleteValues;
                    this.$values = values;
                    this.$currentValue = values;
                }
            });
        }
    }

    /**
     * 节点改变触发
     * 
     * @param {any} $event 节点的值
     * @memberof IBizMPickupViewController
     */
    public nodeChange($event): void {
        let i: number;
        if (this.$values.find((value: any, index, arr) => {
            let judge = Object.is(value.srfkey, $event.srfkey);
            if (judge) {
                i = index;
                return true;
            }
        })) {
            this.$values.splice(i, 1);
        } else {
            if($event.checked){
                this.$values.push($event);
            }
        }
    }

    /**
     * 
     * 
     * @param {any} params 
     * @returns {void} 
     * @memberof IBizMPickupViewController
     */
    public onClickTBItem(params): void {
        if (params) {
            if (Object.is(params.tag, 'Save')) {
                this.closeView();
                return;
            }
            if (Object.is(params.tag, 'Back')) {
                this.backView();
                return;
            }
        }
        super.onClickTBItem(params);
    }

    /**
     * 关闭当前视图
     * 
     * @memberof IBizMPickupViewController
     */
    public closeView(): void {
        let resultStr: any = {};
        resultStr.ret = 'OK';
        resultStr.selectedDatas = this.$values;
        this.setResult(resultStr);
        super.closeView();
    }
}