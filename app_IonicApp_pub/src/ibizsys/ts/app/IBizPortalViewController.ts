import { IBizMainViewController } from './IBizMainViewController';

export class IBizPortalViewController extends IBizMainViewController {
    constructor(opt) {
        super(opt);
    }

    /**
     * 按钮点击操作
     * 
     * @param {any} $event 
     * @memberof IBizPortalViewController
     */
    public menuClick($event): void {
        this.openAppFuncView($event);
    }
    
    /**
     * 根据AppFuncId打开指定视图
     * 
     * @param {string} appFuncId 
     * @memberof IBizPortalViewController
     */
    public openAppFuncView(appFuncId: string): void {
        let appfunc: any = this.getAppFunc(appFuncId);
        if(appfunc){
            super.openView(appfunc);
        } else {
            this.showToast('应用功能不存在无法打开');
        }
    }
}