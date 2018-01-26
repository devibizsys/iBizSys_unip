import { IBizService } from './IBizService'

export class IBizTabService extends IBizService {
    public $tabViewService: any = {};
    public $activeViewCtrl: any;

    constructor(props) {
        super(props)
    }

    /**
     * 刷新数据
     * 
     * @memberof IBizTabService
     */
    public refresh(): void {
        this.onRefresh();
    }

    /**
     * 
     * 
     * @memberof IBizTabService
     */
    public onRefresh(): void {

    }

    /**
     * tab标签变更
     * 
     * @memberof IBizTabService
     */
    public tabChange(): void {
        if(this.getActiveTabView()){
            this.getActiveTabView().onLoad();
        }
    }

    /**
     * 注册tab标签内页面的Service
     * 
     * @param {string} name 
     * @param {*} tabviewService 
     * @memberof IBizTabService
     */
    public regTabViewService(name: string, tabviewService: any): void {
        this.$tabViewService[name] = tabviewService;
    }

    /**
     * 获取指定标签页
     * 
     * @param {string} name 标签页名称
     * @returns {*} 
     * @memberof IBizTabService
     */
    public getTabViewService(name: string): any {
        if(this.$tabViewService[name])
        return this.$tabViewService[name];
    }

    /**
     * 设置当前激活的标签页
     * 
     * @param {*} service 
     * @returns {*} 
     * @memberof IBizTabService
     */
    public setActiveTabView(service: any): any {
        this.$activeViewCtrl = service;
    }

    /**
     * 获取当前激活的标签页
     * 
     * @returns {*} 
     * @memberof IBizTabService
     */
    public getActiveTabView(): any {
        return this.$activeViewCtrl;
    }

}