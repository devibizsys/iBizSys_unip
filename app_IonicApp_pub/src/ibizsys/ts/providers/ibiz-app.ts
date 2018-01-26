import { HttpProvider } from "./http";

/**
 * App级对象
 * 
 * @export
 * @class IBizAppProvider
 */
export class IBizAppProvider {
    public imagePath: string = './assets/images/';
    public wechat: any;

    constructor(private http: HttpProvider) {
        this.init();
    }

    public getHttp(): HttpProvider {
        return this.http;
    }

    public init(): void {
        let wechatloginkey = this.getQueryString('wechatloginkey');
        if (window['jWeixin'] && wechatloginkey) {
            this.wechat = window['jWeixin'];
            this.http.post('/wechat/jsticket.do', { 'srfloginkey': wechatloginkey })
                .subscribe(
                res => {
                    if (res.ret === 0 && res.obj) {
                        this.initWechat(res.obj);
                    }
                },
                error => {
                    alert('微信Js加载失败：' + JSON.stringify(error));
                }
                );
        }
    }
    /**
     * 初始化微信js-sdk
     * 
     * @memberof IBizAppProvider
     */
    public initWechat(config: any): void {
        let me = this;
        if (this.wechat) {
            //需要调用的api接口
            let jsApiList = "onMenuShareAppMessage," +
                "onMenuShareWechat," +
                "startRecord," +
                "stopRecord," +
                "onVoiceRecordEnd," +
                "playVoice," +
                "pauseVoice," +
                "stopVoice," +
                "onVoicePlayEnd," +
                "uploadVoice," +
                "downloadVoice," +
                "chooseImage," +
                "previewImage," +
                "uploadImage," +
                "downloadImage," +
                "previewFile," +
                "getNetworkType," +
                "openLocation," +
                "getLocation," +
                "onHistoryBack," +
                "hideOptionMenu," +
                "showOptionMenu," +
                "hideMenuItems," +
                "showMenuItems," +
                "hideAllNonBaseMenuItem," +
                "showAllNonBaseMenuItem," +
                "closeWindow," +
                "scanQRCode," +
                "selectEnterpriseContact," +
                "openEnterpriseChat," +
                "chooseInvoice";
            Object.assign(config, { 'beta': true, 'debug': true, 'jsApiList': jsApiList.split(',') });
            this.wechat.config(config);
            this.wechat.ready(() => {
                // config信息验证后会执行ready方法，所有接口调用都必须在config接口获得结果之后，config是一个客户端的异步操作，所以如果需要在页面加载时就调用相关接口，则须把相关接口放在ready函数中调用来确保正确执行。对于用户触发时才调用的接口，则可以直接调用，不需要放在ready函数中。
                me.getImage();
            });
            this.wechat.error((res) => {
                alert('微信信息注册失败：' + JSON.stringify(res));
            });
        }
    }
    /**
     * 获取url中的参数
     * 
     * @param {string} name 参数名称
     * @returns {string} 
     * @memberof IBizAppProvider
     */
    public getQueryString(name: string): string {
        let reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        let r = window.location.search.substr(1).match(reg);
        if (r != null) {
            return decodeURI(r[2]);
        }
        return null;
    }
    /**
     * 返回微信js-sdk对象
     * 
     * @returns {any} 微信对象
     * @memberof IBizAppProvider
     */
    public getWechat(): any {
        return this.wechat;
    }

    /**
     * 设置是否允许关闭App
     * 
     * @param {boolean} judge 
     * @memberof IBizAppProvider
     */
    public isCloseApp(judge: boolean): void {
        if (window['appBridge']) {
            window['appBridge'].isBackKeyDown(judge);
        }
    }

    /**
     * 微信获取照片
     * 
     * @returns {*} 
     * @memberof IBizAppProvider
     */
    public getImage(): any {
        if (this.wechat) {
            this.wechat.chooseImage({
                count: 5, // 默认9
                sizeType: ['original', 'compressed'], // 可以指定是原图还是压缩图，默认二者都有
                sourceType: ['album', 'camera'], // 可以指定来源是相册还是相机，默认二者都有
                success: function (res) {
                    var localIds = res.localIds; // 返回选定照片的本地ID列表，localId可以作为img标签的src属性显示图片
                    alert('微信选取的照片的ID=' + localIds);
                }
            });
        }
    }

}