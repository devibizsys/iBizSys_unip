import { IBizViewController } from './IBizViewController';

export class IBizMainViewController extends IBizViewController {
	public childView: string;

	constructor(opt) {
		super(opt);
	}

	/**
	 * 点击按钮
	 * 
	 * @param {any} params 事件源
	 * @memberof IBizMainViewController
	 */
	public onClickTBItem(params): void {
		let uiaction = this.getUIAction(params.tag);
		this.doUIAction(uiaction, params);
	}

	/**
	 * 执行界面行为
	 * 
	 * @param {any} uiaction 
	 * @param {any} params 
	 * @returns {void} 
	 * @memberof IBizMainViewController
	 */
	public doUIAction(uiaction, params): void {
		if (uiaction && (typeof uiaction == 'string')) {
			uiaction = this.getUIAction(uiaction);
		}
		if (uiaction) {
			if (uiaction.type == 'DEUIACTION') {
				this.doDEUIAction(uiaction, params);
				return;
			}
			if (uiaction.type == 'WFUIACTION') {
				this.doWFUIAction(uiaction, params);
				return;
			}
		}
		this.showToast('未实现的界面行为：'+params.tag);
	}

	/**
	 * 执行实体行为
	 * 
	 * @param {any} uiaction 行为
	 * @param {any} params 参数
	 * @returns {void} 
	 * @memberof IBizMainViewController
	 */
	public doDEUIAction(uiaction, params): void {
		if(uiaction.tag === "Back"){
			this.backView();
			return;
		}
		if (uiaction.actionmode == 'FRONT') {
			if ((uiaction.fronttype == 'WIZARD') || (uiaction.fronttype == 'SHOWPAGE')) {
				let viewparam = this.getFrontUIActionParam(uiaction, params);
				if (!viewparam) {
					viewparam = {};
				}
				let frontview = uiaction.frontview;
				if (frontview.redirectview) {
					this.redirectOpenView({'redirectUrl': frontview.backendurl, 'viewParam': viewparam});
					return;
				}
				this.openUIActionView(frontview, viewparam);
				return;
			}

			// if (uiaction.fronttype == 'OPENHTMLPAGE') {
			// 	let url = $.getIBizApp().parseURL2(null, uiaction.htmlpageurl, this.getFrontUIActionParam(uiaction, params));
			// 	window.open(url, '_blank');
			// 	return;
			// }
		}

		if (uiaction.actionmode == 'BACKEND') {
			let param: any;
			param = this.getBackendUIActionParam(uiaction, params);
			if (param == null)
				return;
			param.srfuiactionid = uiaction.tag;
			if (uiaction.confirmmsg) {
				this.confirm('提示',uiaction.confirmmsg, (result) => {
					if(result) {
						this.doBackendUIAction(param);
					}
				});
			} else {
				this.doBackendUIAction(param);
			}
			return;
		}
		super.showToast('未处理的实体行为[' + uiaction.tag + ']');
	}

	/**
	 * 执行工作流行为
	 * 
	 * @param {any} uiaction 行为
	 * @param {any} params 参数
	 * @returns {void} 
	 * @memberof IBizMainViewController
	 */
	public doWFUIAction(uiaction, params): void {
		let me = this;
		if (uiaction.actionmode == 'WFFRONT') {
			if ((uiaction.fronttype == 'WIZARD') || (uiaction.fronttype == 'SHOWPAGE')) {
				let className = uiaction.frontview.className;
				let viewparam = this.getFrontUIActionParam(uiaction, params);

				if (!viewparam) {
					viewparam = {};
				}

				Object.assign(viewparam, uiaction.frontview.viewParam);

				this.openModal({'className': className,'viewParam': viewparam}, function (result) {
					me.onWFUIFrontWindowClosed(result);
				});
				return;
			}
		}
		super.showToast('未处理的实体工作流行为[' + uiaction.tag + ']');
	}

	/**
	 * 工作流执行后页面关闭回调
	 * 
	 * @param {any} result 关闭页面时返回的参数
	 * @memberof IBizMainViewController
	 */
	public onChildViewControllerClose(result): void {
		if (this.childView == 'wfactionview') {
			this.onWFUIFrontWindowClosed(result);
		}
	}

	/**
	 * 
	 * 
	 * @param {any} result 
	 * @memberof IBizMainViewController
	 */
	public onWFUIFrontWindowClosed(result): void {

	}
    
	/**
	 * 执行后台行为
	 * 
	 * @param {any} uiaction 行为
	 * @memberof IBizMainViewController
	 */
	public doBackendUIAction(uiaction): void {
		super.showToast('未处理的后台界面行为[' + uiaction.tag + ']');
	}

	/**
	 * 获取前台行为参数
	 * 
	 * @param {any} uiaction 行为
	 * @param {any} params 参数
	 * @returns {*} 
	 * @memberof IBizMainViewController
	 */
	public getFrontUIActionParam(uiaction, params): any {
		let me = this;
		let arg: any = {};
		if (uiaction.refreshview) {
			arg.callback = function (win) {
				me.refresh();
			}
		}
		return arg;
	}

	/**
	 * 获取后台行为参数
	 * 
	 * @param {any} uiaction 行为
	 * @param {any} params 参数
	 * @returns {*} 
	 * @memberof IBizMainViewController
	 */
	public getBackendUIActionParam(uiaction, params): any {
		return {};
	}

	/**
	 * 打开界面行为视图
	 * 
	 * @param {any} frontview 
	 * @param {any} viewparam 
	 * @memberof IBizMainViewController
	 */
	public openUIActionView(frontview, viewparam): void {
		let callback;
		if(viewparam && viewparam.callback){
			callback = viewparam.callback;
			delete viewparam.callback;
		}
		frontview.viewParam = viewparam;
		let modal=false;
		if(frontview.openMode=='POPUPMODAL'){
			modal = true;
		}
		if(modal){
			this.openModal(frontview, callback);
		} else {
			this.openView(frontview, callback);
		}
	}
}