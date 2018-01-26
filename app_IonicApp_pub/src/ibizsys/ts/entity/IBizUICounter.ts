import { HttpProvider } from '../providers/http';
import { IBizViewController } from '../app/IBizViewController';

export class IBizUICounter{
    public $name: string;//计数器名称
    public $timer: any;//定时器时间
    public $timerTag: any;//定时器
    public $tag: any;//当前计数器标识
    public $initialConfig: any;//定时器配置
    public $counterId: any;//计数器id
    public $counterParam: any = {};//计数器参数
    public $viewCtrl: IBizViewController;//视图控制器
    public $http: HttpProvider;
    public $lastReloadArg: any = {};
    public $result: any;
    public $data: any;

    constructor(config) {
        this.$initialConfig = config;
        this.$viewCtrl = this.$initialConfig.viewCtrl;
		this.$counterId = this.$initialConfig.counterId;
        this.$tag = this.$initialConfig.tag;
        this.$name = this.$initialConfig.name;
        Object.assign(this.$counterParam, this.$initialConfig.counterParam);
        if(this.$viewCtrl){
            this.$http = this.$viewCtrl.$http;
        }
        this.$timer = this.$initialConfig.timer;
		if(this.$timer >1000){
			this.$timerTag = setInterval(() =>{
                this.reload();
            },this.$timer);
		}
		this.reload();
    }
    
    /**
     * 刷新计数器
     * 
     * @param {*} [arg={}] 
     * @memberof IBizUICounter
     */
    public reload(arg: any = {}): void {
        let params = {};
        Object.assign(this.$lastReloadArg, arg);
        Object.assign(params, this.$lastReloadArg);
		// if(IBizApp_Data)
		// 	params.srfappdata=IBizApp_Data;
		params['srfcounterid'] = this.$counterId;
		params['srfaction'] = 'FETCH';
        if(this.$counterParam) {
            params['srfcounterparam'] = JSON.stringify(this.$counterParam);
        }
		if(this.$http){
            this.fillPostParams(params);
            this.$http.post(this.getBackendUrl(), params)
            .subscribe(
                res => {
                    if(res.ret == 0) {
                        this.setData(res);
                    } else {
                        console.log('加载系统计数器失败');
                    }
                },
                error => {
                    console.log('加载计数器异常');
                }
            );
        }
    }

    public setData(result: any): void {
        this.$result = result;
        this.$data = result.data;
        this.$viewCtrl.fire(this.$viewCtrl.$staticVariables.COUNTERCHANGE, this.$data);
    }

    public getResult(): any {
        return this.$result;
    }

    public getData(): any {
        return this.$data;
    }

    /**
     * 关闭计数器
     * 
     * @memberof IBizUICounter
     */
    public close(): void {
        if (this.$timerTag != undefined) {
            clearInterval(this.$timerTag);
            delete this.$timerTag;
        }
    }

    public getBackendUrl(): string {
        if(this.$viewCtrl){
            return this.$viewCtrl.getBackendUrl();
        }
        return '';
    }

    /**
	 * 请求前加入用户信息必要参数
	 * 
	 * @param {any} params 
	 * @memberof IBizViewController
	 */
	public fillPostParams(params): void {
		Object.assign(params, { 'srfloginkey': this.getLoginKey() });
		//适配android壳程序,获取壳程序中的用户信息
		if (window['appBridge'] && this.isFunction(window['appBridge'].getAccount)) {
			Object.assign(params, { 'userinfo': window['appBridge'].getAccount() })
		}
    }
    
    /**
	 * 获取用户id
	 * 
	 * @returns {string} 
	 * @memberof IBizViewController
	 */
	public getLoginKey(): string {
		return window.localStorage.getItem('srfloginkey');
    }
    
    /**
	 * 判断是否为一个方法
	 * 
	 * @param {*} func 方法
	 * @returns {boolean} 
	 * @memberof IBizViewController
	 */
	public isFunction(func: any): boolean {
		if (typeof func === 'function') {
			return true;
		}
		return false;
	}

}