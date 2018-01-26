import { EventEmitter } from 'events';
import { Storage } from '@ionic/storage';
import { IBizStaticVariablesProvider } from '../providers/ibiz-static-variables';
import { IBizAppProvider } from '../providers/ibiz-app';

export abstract class IBizObject {
    public $emitter: EventEmitter;
    public $storage: Storage;
    public $staticVariables: IBizStaticVariablesProvider;
    public $IBizApp: IBizAppProvider = window['$IBizApp'];

    constructor(opt) {
        this.$emitter = new EventEmitter();
        if(opt.component){
            this.$storage = opt.component.storage;
            this.$staticVariables = opt.component.staticVal;
        } else {
            this.$storage = opt.storage;
            this.$staticVariables = opt.staticVal;
        }
    }

    /**
     * 触发事件
     * 
     * @param {string} eventName 事件名
     * @param {*} [datas={}] 数据
     * @memberof IBizObject
     */
    public fire(eventName: string, datas: any = {}): void {
        this.$emitter.emit(eventName, datas);
    };

    /**
     * 注册事件
     * 
     * @param {string} eventName 事件名
     * @param {*} func 回调函数
     * @memberof IBizObject
     */
    public on(eventName: string, func: any): void {
        this.$emitter.on(eventName, func);
    };
}