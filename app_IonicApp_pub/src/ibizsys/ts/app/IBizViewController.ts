import { IBizObject } from '../widget/IBizObject';
import { HttpProvider } from '../providers/http';
import { IBizUICounter } from '../entity/IBizUICounter';
import { IBizUtil } from '../utils/IBizUtil';
import { NavController, NavParams, LoadingController, Loading, ToastController, Toast, ModalController, AlertController, Alert, ActionSheetController } from 'ionic-angular';
import { OnChanges, OnInit, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy, SimpleChanges, Input } from '@angular/core';

export class IBizViewController extends IBizObject implements OnChanges, OnInit, DoCheck, AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {
	@Input()
	parentMode: any;
	@Input()
	set parentData(val) {
		this.$parentData = val;
	}
	/**
	 * 在以下几个angular的生命周期函数中,绝对不可以有复杂的逻辑处理。
	 * (OnChanges,DoCheck,AfterContentChecked,AfterViewChecked)
	 */
	public $loadingCtrl: LoadingController;
	public $toastCtrl: ToastController;
	public $alertCtrl: AlertController;
	public $loading: Loading;
	public $http: HttpProvider;
	public $url: string;
	public $navCtrl: NavController;
	public $navParams: NavParams;
	public $modalCtrl: ModalController;
	public $actionSheetCtrl: ActionSheetController;
	public $controls: any = {};
	public $uiaction: any = {};
	public $uicounters: any = {};
	public $viewParam: any = {};
	public $uiactions: any = {};
	public $result: any = {};
	public $callback: any;
	public $parentData: any;
	public $parentMode: any;
	public $appFuncs: any = {};
	public $isRootView: boolean = false;//当前视图是否为顶级页
	
    public IBizUtil: IBizUtil;

	constructor(opt) {
		super(opt);
		this.$navCtrl = opt.navCtrl;
		this.$navParams = opt.navParams;
		this.$modalCtrl = opt.modalCtrl;
		this.$actionSheetCtrl = opt.actionSheetCtrl;
		this.$loadingCtrl = opt.loadingCtrl;
		this.$toastCtrl = opt.toastCtrl;
		this.$alertCtrl = opt.alertCtrl;
		this.$http = opt.http;
		this.$url = opt.url;
		
		this.IBizUtil = new IBizUtil();

		if(this.$navCtrl && this.isFunction(this.$navCtrl.getViews) && Object.is(this.$navCtrl.getViews().length, 0)) {
			this.$isRootView = true;
		}
	}
	//angular生命周期start
	/**
	 * 是父组件在初始化或更改子组件中的输入属性时调用，首次调用一定发生在ngOnInit钩子之前
	 * 
	 * @param {SimpleChanges} changes 
	 * @memberof IBizViewController
	 */
	ngOnChanges(changes: SimpleChanges): void {

	}
	/**
	 * 在ngOnChanges钩子之后执行，如果组件的某些初始化依赖输入属性，那么依赖输入属性的初始化一定要放在ngOnInit中执行
	 * 
	 * @memberof IBizViewController
	 */
	ngOnInit(): void {
		this.onInit();
		this.onInitComponents();
	}
	/**
	 * 在Angular的变更检测周期中被调用的。Angualr的变更检测机制会频繁的调用这个钩子，所以如果要在这个钩子中实现业务，一定要判断。而且不要实现复杂的业务逻辑
	 * 
	 * @memberof IBizViewController
	 */
	ngDoCheck(): void {

	}
	/**
	 * 在投影组装的时候被调用,ngAfterContentInit只被调用一次,可以修改模板中呈现的值,优先调用子组件的，子组件调用完毕后才会调用父组件的
	 * 
	 * @memberof IBizViewController
	 */
	ngAfterContentInit(): void {

	}
	/**
	 * 在投影组装的时候被调用,ngAfterContentChecked在每次的Angular变更检测完毕后触发,可以修改模板中呈现的值,优先调用子组件的，子组件调用完毕后才会调用父组件的
	 * 
	 * @memberof IBizViewController
	 */
	ngAfterContentChecked(): void {

	}
	/**
	 * 在组件的模板都被组装完成之后才会被调用,ngAfterViewInit只会调用一次,不可以修改模板中呈现的变量值
	 * Angular不允许在视图组装完毕后更改模板中的值，但是可以设置一个定时器间接实现此功能，优先调用子组件的，子组件调用完毕后才会调用父组件的
	 * 
	 * @memberof IBizViewController
	 */
	ngAfterViewInit(): void {

	}
	/**
	 * 在组件的模板都被组装完成之后才会被调用,ngAfterViewChecked在每次的Angular变更检测完毕后触发，在这两个钩子当中不可以修改模板中呈现的变量值
	 * Angular不允许在视图组装完毕后更改模板中的值，但是可以设置一个定时器间接实现此功能，优先调用子组件的，子组件调用完毕后才会调用父组件的
	 * 
	 * @memberof IBizViewController
	 */
	ngAfterViewChecked(): void {

	}
	/**
	 * 在组件被销毁的时候调用。
	 * 
	 * @memberof IBizViewController
	 */
	ngOnDestroy(): void {

	}
	//angular生命周期end
	//ionic生命周期start
	/**
	 * 在加载页时运行。此事件仅在创建的每个页面上发生一次。如果页离开但被缓存，则此事件将不会在随后的查看中再次触发。
	 * 
	 * @memberof IBizViewController
	 */
	public ionViewDidLoad(): void {

	}
	/**
	 * 当页面即将进入并成为活动页时运行。
	 * 
	 * @memberof IBizViewController
	 */
	public ionViewWillEnter(): void {

	}
	/**
	 * 当页面完全输入并且现在是活动页时运行。无论是第一次加载还是缓存的页面，此事件都将触发。
	 * 
	 * @memberof IBizViewController
	 */
	public ionViewDidEnter(): void {
		this.$IBizApp.isCloseApp(this.$isRootView);
		this.loadViewParams();
		window['IonicView'] = this;
	}
	/**
	 * 当页即将离开而不再是活动页时运行。
	 * 
	 * @memberof IBizViewController
	 */
	public ionViewWillLeave(): void {

	}
	/**
	 * 当页已离开且不再是活动页时运行。
	 * 
	 * @memberof IBizViewController
	 */
	public ionViewDidLeave(): void {

	}
	/**
	 * 当页即将被销毁并删除其元素时运行。
	 * 
	 * @memberof IBizViewController
	 */
	public ionViewWillUnload(): void {

	}
	/**
	 * 在视图进入之前运行。这可以用作身份验证视图中的一种“保护”，在此视图输入之前需要检查权限。
	 * 
	 * @returns {(void | boolean)} 
	 * @memberof IBizViewController
	 */
	public ionViewCanEnter(): void | boolean {

	}
	/**
	 * 在视图离开之前运行。这可以用作经过身份验证的视图中的一种“保护”，在视图离开之前，您需要检查该视图的权限。
	 * 
	 * @returns {(void | boolean)} 
	 * @memberof IBizViewController
	 */
	public ionViewCanLeave(): void | boolean {

	}
	//ionic生命周期end

	/**
	 * 通用loading组件
	 * 
	 * @protected
	 * @param {LoadingController} loadingCtrl 
	 * @param {string} message 
	 * @returns 
	 * @memberof BaseUI
	 */
	public showLoading(message: string): Loading {
		if (!this.$loadingCtrl) {
			return;
		}
		let loader = this.$loadingCtrl.create({
			content: message,
			dismissOnPageChange: false //页面变化的时候关闭提示
		});
		loader.present();
		return loader;
	}

    /**
     * 通用展示 toast 的组件(在底部)
     * 
     * @protected
     * @param {ToastController} toastCtrl 
     * @param {string} message 
     * @returns {Toast} 
     * @memberof BaseUI
     */
	public showToast(message: string): Toast {
		if (!this.$toastCtrl) {
			return;
		}
		let toast = this.$toastCtrl.create({
			cssClass: "ibiz-alert",
			message: message,
			duration: 3000,//展示时长
			position: 'top'//展示位置
		});
		toast.present();
		return toast;
	}

	/**
	 * 全局alert组件
	 * 
	 * @param {string} title 主标题
	 * @param {string} subTitle 副标题
	 * @returns {Alert} 
	 * @memberof IBizViewController
	 */
	public alert(title: string, subTitle: string): Alert {
		if (!this.$alertCtrl) {
			return;
		}
		let alert = this.$alertCtrl.create({
			title: title,
			subTitle: subTitle,
			buttons: ['OK']
		});
		alert.present();
		return alert;
	}

	/**
	 * 全局确认对话框
	 * 
	 * @param {string} title 标题
	 * @param {string} message 内容
	 * @param {*} successFunc 确认回调
	 * @param {*} [cancelFunc] 取消回调
	 * @param {string} [successBtnText] 确认按钮文本
	 * @param {string} [cancelBtnText] 取消按钮文本
	 * @returns {Alert} 确认对话框对象
	 * @memberof IBizViewController
	 */
	public confirm(title: string, message: string, successFunc: any, cancelFunc?: any, successBtnText?: string, cancelBtnText?: string): Alert {
		if (!this.$alertCtrl) {
			return;
		}
		let alert = this.$alertCtrl.create({
			title: title,
			message: message,
			buttons: [
				{
					text: ((cancelBtnText) ? cancelBtnText : '取消'),
					handler: () => {
						if (this.isFunction(cancelFunc)) {
							cancelFunc();
						}
					}
				},
				{
					text: ((successBtnText) ? successBtnText : '确认'),
					handler: () => {
						if (this.isFunction(successFunc)) {
							successFunc();
						}
					}
				}
			]
		});
		alert.present();
		return alert;
	}
	/**
	 * 展示Loading加载框
	 * 
	 * @returns {void} 
	 * @memberof IBizViewController
	 */
	public mask(): void {
		if (window['isLoading'] === true) {
			return;
		}
		this.$loading = this.showLoading('加载中...');
		window['isLoading'] = true;
	}
	/**
	 * 隐藏Loading加载框
	 * 
	 * @returns {void} 
	 * @memberof IBizViewController
	 */
	public unmask(): void {
		if ((!window['isLoading']) || window['isLoading'] === false) {
			return;
		}
		if (this.$loading && this.$loading != null) {
			this.$loading.dismiss();
			window['isLoading'] = false;
		}
	}
	/**
	 * 控制器初始化
	 * 
	 * @memberof IBizViewController
	 */
	public onInit(): void {
		//注册所有计数器
		this.regUICounters();
		//注册所有界面行为
		this.regUIActions();
		this.regAppFuncs();
		this.loadViewParams();
		this.onLoad();
	}
	/**
	 * 初始化页面事件
	 * 
	 * @memberof IBizViewController
	 */
	public onInitComponents(): void {

	}
	/**
	 * 页面加载数据
	 * 
	 * @memberof IBizViewController
	 */
	public onLoad(): void {

	}
	/**
	 * 加载传递来的视图参数
	 * 
	 * @memberof IBizViewController
	 */
	public loadViewParams(): void {
		if (this.$navParams) {
			if(!this.$navCtrl.parent && !this.$navParams.get('openMode')) {
				let param: any = [];
				param.srfkey = window['srfkey'];
				this.setViewParam(param);
			} else {
				if (this.$navParams.get("params")) {
					this.setViewParam(this.$navParams.get("params"));
				}
			}
			if (this.$navParams.get("callback")) {
				this.setCloseCallback(this.$navParams.get("callback"));
			}
			if (this.$navParams.get("parentData")) {
				this.$parentData = this.$navParams.get("parentData");
			}
		}
		if(this.$parentData) {
			this.addViewParam({ 'srfparentdeid': this.$parentData.srfdeid, 'srfparentkey': this.$parentData.srfkey });
		}
	}
	/**
	 * 判断是否为顶级页
	 * 
	 * @returns {boolean} 
	 * @memberof IBizViewController
	 */
	public isRootView(): boolean {
		return this.$isRootView;
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

	/**
	 * 设置部件service
	 * 
	 * @param {string} name 
	 * @param {*} control 
	 * @memberof IBizViewController
	 */
	public regControl(name: string, control: any): void {
		this.$controls[name] = control;
	}

	/**
	 * 获取部件service
	 * 
	 * @param {string} name 
	 * @returns {*} 
	 * @memberof IBizViewController
	 */
	public getControl(name: string): any {
		return this.$controls[name];
	}

	/**
	 * 开始触发界面行为
	 * 
	 * @param {any} id 
	 * @memberof IBizViewController
	 */
	public clickButton(id): void {
		this.onClickTBItem({ tag: id });
	}

	public onClickTBItem(params): void {

	}

	/**
	 * 注册界面行为
	 * 
	 * @param {any} uiaction 
	 * @memberof IBizViewController
	 */
	public regUIAction(uiaction): void {
		if(uiaction) {
			this.$uiactions[uiaction.tag] = uiaction;
		}
	}

	public regUIActions(uiaction = null): void {
		
	}
	
	/**
	 * 获取界面行为
	 * 
	 * @param {any} uiactionId 
	 * @returns {*} 
	 * @memberof IBizViewController
	 */
	public getUIAction(uiactionId): any {
		if (this.$uiactions) {
			return this.$uiactions[uiactionId];
		}
		return null;
	}

	public regUICounters(): void {

	}

	/**
	 * 注册界面计数器
	 * 
	 * @param {IBizUICounter} uicounter 
	 * @memberof IBizViewController
	 */
	public regUICounter(uicounter: IBizUICounter): void {
		if (!this.$uicounters) {
			this.$uicounters = {};
		}
		this.$uicounters[uicounter.$name] = uicounter;
	}

	/**
	 * 获取界面计数器
	 * 
	 * @param {string} name 
	 * @returns {*} 
	 * @memberof IBizViewController
	 */
	public getUICounter(name: string): any {
		if (this.$uicounters) {
			return this.$uicounters[name];
		}
		return null;
	}

	/**
	 * 刷新全部界面计数器
	 * 
	 * @memberof IBizViewController
	 */
	public reloadUICounters(): void {
		if(this.$uicounters){
			for (let tag in this.$uicounters) {
				let uicounter = this.$uicounters[tag];
				if(uicounter){
					uicounter.reload();
				}
		   }
		}
	}

	/**
	 * 置父数据
	 * 
	 * @param {any} data 
	 * @memberof IBizViewController
	 */
	public setParentData(data): void {
		this.$parentData = data;
		this.onSetParentData();
	}

	public onSetParentData(): void {

	}

	/**
	 * 获取父数据
	 * 
	 * @returns {*} 
	 * @memberof IBizViewController
	 */
	public getParentData(): any {
		return this.$parentData;
	}

	/**
	 * 获取父模式
	 * 
	 * @returns {*} 
	 * @memberof IBizViewController
	 */
	public getParentMode(): any {
		if(!this.$parentMode) {
			if(this.parentMode){
				let parentModeItem = JSON.parse(this.parentMode);
				let mode: any = {};
				for(let key in parentModeItem) {
					mode[key.toLowerCase()] = parentModeItem[key];
				}
				this.$parentMode = mode;
			}
		}
		return this.$parentMode;
	}
	
	/**
	 * 获取引用数据
	 * 
	 * @returns {*} 
	 * @memberof IBizViewController
	 */
	public getReferData(): any {
		// return this.config.referData;
	}
	
	/**
	 * 获取视图参数
	 * 
	 * @returns {*} 
	 * @memberof IBizViewController
	 */
	public getViewParam(): any {
		return this.$viewParam;
	}

	/**
	 * 设置视图参数
	 * 
	 * @param {any} param 
	 * @memberof IBizViewController
	 */
	public setViewParam(param): void {
		this.$viewParam = param;
	}

	/**
	 * 添加视图参数
	 * 
	 * @param {any} param 
	 * @memberof IBizViewController
	 */
	public addViewParam(param): void {
		Object.assign(this.$viewParam, param);
	}
    
	/**
	 * 获取请求地址
	 * 
	 * @returns {string} 
	 * @memberof IBizViewController
	 */
	public getBackendUrl(): string {
		return this.$url;
	}
	
	/**
	 * 设置请求地址
	 * 
	 * @param {any} backendUrl 
	 * @memberof IBizViewController
	 */
	public setBackendUrl(backendUrl): void {
		this.$url = backendUrl;
	}

	/**
	 * 
	 * 
	 * @memberof IBizViewController
	 */
	public refresh(): void {
		this.onRefresh();
	}

	/**
	 * 
	 * 
	 * @memberof IBizViewController
	 */
	public onRefresh(): void {

	}

	/**
	 * 设置页面关闭时，向会回调方法传递的参数
	 * 
	 * @param {{}} result 
	 * @memberof IBizViewController
	 */
	public setResult(result: {}): void {
		this.$result = result;
	}

	public getResult(): {} {
		return this.$result;
	}

	public onChildViewControllerClose(result): void {

	}

	/**
	 * 设置页面关闭时调用的回调方法
	 * 
	 * @param {any} callback 回调方法
	 * @memberof IBizViewController
	 */
	public setCloseCallback(callback): void {
		this.$callback = callback;
	}

	/**
	 * 获取当前页面关闭回调方法
	 * 
	 * @param {any} result 
	 * @memberof IBizViewController
	 */
	public getCloseCallback(result): void {
		if (this.isFunction(this.$callback) && result != null) {
			this.$callback(result);
		}
	}

	/**
	 * 打开modal视图
	 * 
	 * @param {'className':string, 'viewParam': any} view 打开视图的参数
	 * @param {any} [func] 回调函数
	 * @returns {*} 
	 * @memberof IBizViewController
	 */
	public openModal(view: any, func?): any {
		let viewParams: any = {};
		viewParams.openMode = true;
		if (view.viewParam) {
			viewParams.params = view.viewParam;
		}
		if (typeof func === 'function') {
			viewParams.callback = func;
		}
		let modal = this.$modalCtrl.create(view.className, viewParams);
		modal.present();
		return modal;
	}

	/**
	 * 打开视图,关闭后父页面会调用ionViewDidEnter()生命周期钩子。
	 * 
	 * @param {*} view 打开视图的参数
	 * @param {any} [func] 回调函数
	 * @memberof IBizViewController
	 */
	public openView(view: any, func?): void {
		let viewParams: any = {};
		viewParams.openMode = false;
		if (view.viewParam) {
			viewParams.params = view.viewParam;
		}
		viewParams.callback = (res) => {
			if (typeof func === 'function') {
				func(res);
			}
			this.onLoad();
		};
		this.$navCtrl.push(view.className, viewParams);
	}

	/**
	 * 打开重定向视图
	 * 
	 * @param {*} view 打开视图的参数
	 * @param {any} [func] 回调函数
	 * @memberof IBizViewController
	 */
	public redirectOpenView(view: any): void {
		let viewParam: any = {};
		viewParam.srfviewparam = JSON.stringify(view.viewParam);
		Object.assign(viewParam, { 'srfaction': 'GETRDVIEW' });
		this.fillPostParams(viewParam);
		this.mask();
		this.$http.post(view.redirectUrl, viewParam)
			.subscribe(response => {
				this.unmask();
				if (!response.rdview || response.ret != 0) {
					if (response.errorMessage) {
						this.showToast(response.errorMessage);
					}
					return;
				}
				if (response.rdview && response.rdview.className && response.ret == 0) {
					if (response.rdview.srfkey || Object.is(response.rdview.srfkey, '')) {
						view.viewParam.srfkey = response.rdview.srfkey;
						view.viewParam.srfkeys = response.rdview.srfkey;
					}
					if (response.rdview.srfviewparam) {
						Object.assign(view.viewParam, response.rdview.srfviewparam);
					}
					this.openView({ 'className': response.rdview.className, 'viewParam': view.viewParam });
				} else {
					this.showToast('视图信息获取失败,无法打开!');
				}
			},
			error => {
				this.unmask();
				this.showToast('视图信息请求错误,无法打开!');
			});
	}

	/**
	 * 关闭窗口并触发回调
	 * 
	 * @memberof IBizViewController
	 */
	public closeView(): void {
		if (this.$result) {
			this.$result.ret = 'OK';
		}
		this.getCloseCallback(this.$result);
		if(this.isRootView()) {
			let judge = window['AloneWebView'];
			if(judge) {
				window['appBridge'].closeWindow();
			} else {
				this.$navCtrl.pop();
			}
		} else {
			this.$navCtrl.pop();
		}
	}

	/**
	 * 关闭视图,不触发回调
	 * 
	 * @memberof IBizViewController
	 */
	public backView(): void {
		if(this.isRootView()) {
			let judge = window['AloneWebView'];
			if(judge) {
				window['appBridge'].closeWindow();
			} else {
				this.$navCtrl.pop();
			}
		} else {
			this.$navCtrl.pop();
		}
	}

	/**
	 * 请求前加入必要参数
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
	 * 注册应用功能
	 * 
	 * @param {any} appFunc 
	 * @memberof IBizViewController
	 */
	public regAppFunc(appFunc): void {
		if (appFunc)
			this.$appFuncs[appFunc.funcid] = appFunc;
	}

	/**
	 * 获取应用功能
	 * 
	 * @param {any} appFuncId 应用功能id
	 * @returns {*} 
	 * @memberof IBizViewController
	 */
	public getAppFunc(appFuncId): any {
		if (appFuncId)
			return this.$appFuncs[appFuncId];
	}
	
	/**
	 * 在页面初始化的时候,注册应用功能
	 * 
	 * @memberof IBizViewController
	 */
	public regAppFuncs(): void {

	}

	/**
	 * actionSheet工具栏(右上角点击后,底部多个工具栏)
	 * 
	 * @param {*} [params={}] 工具栏参数
	 * @memberof IBizViewController
	 */
	presentActionSheet(params: any = {}): void {
		let me = this;
		let opts: any = params.opts;
		if (this.$actionSheetCtrl) {
			let buttonOpts: any = [];
			if (opts.length > 0) {
				opts.forEach(element => {
					let opt: any = {};
					opt.text = element.text;
					opt.icon = element.icon;
					opt.handler = () => {
						me.clickButton(element.tag);
					};
					opt.cssClass = '';
					opt.role = '';
					buttonOpts.push(opt);
				});
			}
			buttonOpts.push(
				{
					text: '取消',
					role: 'cancel',
					handler: () => {
						console.log('cancel');
					}
				}
			);
			let actionSheet = this.$actionSheetCtrl.create({
				title: (params.title ? params.title : ''),
				subTitle: (params.subTitle ? params.subTitle : ''),
				cssClass: (params.cssClass ? params.cssClass : ''),
				enableBackdropDismiss: true,
				buttons: buttonOpts
			});
			actionSheet.present();
		} else {
			throw new Error('工具栏对象不存在无法展示');
		}
	}

}