import { Observable } from 'rxjs/Rx';
import { IBizObject } from './IBizObject';
import { HttpProvider } from '../providers/http';

export class IBizService extends IBizObject {
    public $http: HttpProvider;
    public $name: string;
    public $url: string;
    public $component: any;

    constructor(opt) {
        super(opt);
        this.$component = opt.component;
        this.$http = this.$component.http;
        this.$url = opt.url;
        this.$name = opt.name;
    }

    public onInit(): void {
        
    }

    public setName(name): void {
        this.$name = name;
    }

    /**
     * 获取部件名称
     * 
     * @returns {String}
     * @memberof IBizService
     */
    public getName(): string {
        return this.$name;
    };
    
    /**
     * 设置当前视图控制器
     * 
     * @param {any} viewController 
     * @memberof IBizService
     */
    public setViewController(viewController): void {
        this.$component = viewController;
    }

    /**
     * 获取当前视图控制器
     * 
     * @returns {*} 
     * @memberof IBizService
     */
    public getViewController(): any {
        if (this.$component)
            return this.$component;
        return undefined;
    }

    /**
     * 设置请求地址
     * 
     * @param {any} backendUrl 
     * @memberof IBizService
     */
    public setBackendUrl(backendUrl): void {
        this.$url = backendUrl;
    }
    
    /**
     * 获取请求地址
     * 
     * @returns {*} 
     * @memberof IBizService
     */
    public getBackendUrl(): any {
        if (this.$url)
            return this.$url;
        if (this.getViewController())
            return this.getViewController().getBackendUrl();
        return undefined;
    }

    /**
     * 显示Loading动画
     * 
     * @memberof IBizService
     */
    public mask(): void {
        this.getViewController().mask();
    }

    /**
     * 隐藏Loading动画
     * 
     * @memberof IBizService
     */
    public unmask(): void {
        this.getViewController().unmask();
    }

    /**
     * 添加请求携带参数
     * 
     * @param {*} opt 
     * @memberof IBizService
     */
    public fillPostParams(opt: any): void {
        this.getViewController().fillPostParams(opt);
    }

    /**
     * 显示吐司框
     * 
     * @param {string} content 
     * @memberof IBizService
     */
    public showToast(content: string): void {
        this.getViewController().showToast(content);
    }

    /**
     * 打开视图
     * 
     * @param {*} opt 
     * @memberof IBizService
     */
    public openView(opt: any, func?: any): void {
        this.getViewController().openView(opt, func);
    }

    /**
     * 确认对话框
     * 
     * @param {string} title 标题
     * @param {string} message 消息
     * @param {*} successFunc 成功后回调
     * @param {*} [cancelFunc] 取消后回调
     * @param {string} [successBtnText] 设置确认按钮文本值
     * @param {string} [cancelBtnText] 设置取消按钮文本值
     * @memberof IBizService
     */
    public confirm(title: string, message: string, successFunc: any, cancelFunc?: any, successBtnText?: string, cancelBtnText?: string): void {
        this.getViewController().confirm(title, message, successFunc, cancelFunc, successBtnText, cancelBtnText);
    }

    /**
     * 
     * 
     * @returns {any[]} 
     * @memberof IBizService
     */
    public getCurrentValue(): any[] {
        return this.getViewController().getCurrentValue();
    }

    /**
     * 发送post请求
     * 
     * @param {*} opt 请求参数
     * @param {*} successFunc 成功回调
     * @param {*} errorFunc 失败回掉
     * @memberof IBizService
     */
    public postUrl(url: string, opt: any): Observable<any> {
        return this.$http.post(url, opt)
        .filter(
            res => {
                if(res.ret === 2 && !res.success) {
                    this.showToast('当前用户已失效，请重新登录');
                    window.localStorage.removeItem('srfloginkey');
                    return false;
                } 
                return true;
            }
        );
    }

    /**
     * 发送post请求不需要携带url
     * 
     * @param {*} opt 请求参数
     * @param {*} successFunc 成功回调
     * @param {*} errorFunc 失败回掉
     * @memberof IBizService
     */
    public post(opt: any): Observable<any> {
        return this.$http.post(this.$url, opt)
        .filter(
            res => {
                if(res.ret === 2 && !res.success && Object.is(res.errorMessage, '访问被拒绝，用户身份无效，需要重新登录')) {
                    window.localStorage.removeItem('srfloginkey');
                }
                return true;
            }
        );
    }
    
}