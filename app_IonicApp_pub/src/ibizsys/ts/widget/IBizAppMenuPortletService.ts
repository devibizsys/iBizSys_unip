import { IBizService } from '../../ts/widget/IBizService';

export class IBizAppMenuPortletService extends IBizService {
    public $appfunc: any = {};
    public $items: string[] = [];
    public $selection: string[] = [];
    public $enableMulit: boolean = false;

    constructor(props) {
        super(props);
    }

    /**
     * 
     * 
     * @param {any} id 
     * @memberof IBizAppMenuPortletService
     */
    public clickButton(id): void {
        let appfunc = this.$appfunc[id];
        if (appfunc) {
            this.execAppFunc(appfunc);
        }
    }

    /**
     * 
     * 
     * @param {any} func 
     * @memberof IBizAppMenuPortletService
     */
    public execAppFunc(func): void {
        if (func.functype == 'SUBAPPVIEW' && func.subapp) {
            //url = $.getIBizApp().parseURL(WEBROOTURL+'/'+func.subapp,func.viewurl,{});
        } else if (func.functype == 'OPENHTMLPAGE' && func.htmlPageUrl) {
            //let url = func.htmlPageUrl;
        } else if (func.functype == 'JAVASCRIPT' && func.jsCode) {
            try {
                eval(func.jsCode);
            }
            catch (e) { }
        } else if (func.functype == 'PDTAPPFUNC' && func.pdtAppFuncId) {

        } else if (func.functype == 'CUSTOM') {

        } else {
            let className = func.viewurl;
            this.openView({"className":className});
        }
    }

    /**
     * 加载数据
     * 
     * @param {any} [opt={}] 
     * @memberof IBizAppMenuPortletService
     */
    public load(opt = {}): void {
        let params: any = {};
        Object.assign(params, opt);
        this.fillPostParams(params);
        Object.assign(params, {'srfctrlid':this.getName()+'_appmenu', 'srfaction': 'fetch'});
        this.post(params).subscribe(response => this.loadAfter(response));
    }

    /**
     * 加载数据之前调用
     * 
     * @param {any} items 
     * @memberof IBizAppMenuPortletService
     */
    public loadAfter(items): void {

    }

    /**
     * 注册应用功能
     * 
     * @param {any} appfunc 
     * @memberof IBizAppMenuPortletService
     */
    public regAppFunc(appfunc): void {
        let me = this;
        if (!me.$appfunc) {
            me.$appfunc = {};
        }
        me.$appfunc[appfunc.funcid] = appfunc;
    }

}