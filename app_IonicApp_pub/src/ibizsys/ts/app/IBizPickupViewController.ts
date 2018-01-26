import { IBizMainViewController } from './IBizMainViewController';

export class IBizPickupViewController extends IBizMainViewController {
    public $value: any;
    public $currentValue: string;

    constructor(opt) {
        super(opt);
        if (this.$navParams.get('params')) {
            let params = this.$navParams.get('params');
            if (params.currentValue) {
                this.$currentValue = params.currentValue;
            }
        }
    }

    /**
     * 
     * 
     * @param {any} params 
     * @returns {void} 
     * @memberof IBizPickupViewController
     */
    onClickTBItem(params): void {
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
     * 设置回调数据，并关闭当前视图
     * 
     * @memberof IBizPickupViewController
     */
    closeView() {
        this.setResult(this.$value);
        super.closeView();
    }
}