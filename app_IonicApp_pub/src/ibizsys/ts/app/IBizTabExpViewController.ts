import { IBizMainViewController } from './IBizMainViewController';

export class IBizTabExpViewController extends IBizMainViewController {

    constructor(opt) {
        super(opt);
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
            this.getControl('tab').getActiveTabView().onRefresh();
        }, 300);
    }

    /**
     * 上拉加载触发事件
     * 
     * @param {any} event 
     * @memberof IBizMDViewController
     */
    public doInfinite(event): void {
        setTimeout(() => {
            event.complete();
            this.getControl('tab').getActiveTabView().loadNext({});
        }, 300);
    }

}