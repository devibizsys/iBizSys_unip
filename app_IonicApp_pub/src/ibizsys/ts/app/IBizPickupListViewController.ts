import { IBizListViewController } from './IBizListViewController';
import { Input, Output, EventEmitter } from '@angular/core';
import { ControlValueAccessor } from '@angular/forms/src/directives';

export class IBizPickupListViewController extends IBizListViewController implements ControlValueAccessor {
    @Input()
    multiselect: boolean;
    @Input()
    currentValue: any;
    @Input()
    set deleteData(val: any[]) {
        if(val && this.isFunction(val.forEach)) {
            val.forEach( item => {
                this.cancelChecked(item);
            });
        }
    }
    @Output()
    selectChange: EventEmitter<any> = new EventEmitter();

    public $seletedDatas: any = [];
    private $innerValue: any = [];
    public onTouchedCallback: () => void = function () { };
    public onChangeCallback: (_: any) => void = function () { };

    public isCancelChecked: boolean = true;

    constructor(opt) {
        super(opt);
    }

    /**
     * 去掉选中状态
     * 
     * @memberof IBizPickupListViewController
     */
    cancelChecked(item: any): void {
        let mdctrl = this.getMDCtrl();
        if(mdctrl && this.isFunction(mdctrl.cancelChecked)){
            mdctrl.cancelChecked(item);
        }
    }

    getInnerValue(): any {
        return this.$innerValue;
    }

    /**
     * 获取父数据
     * 
     * @returns {string[]} 
     * @memberof IBizPickupTreeViewController
     */
    public getCurrentValue(): string[]{
        if(this.currentValue)
        return this.currentValue;
    }

    writeValue(value: any): void {
        if (value) {
            this.$innerValue = value;
        }
    }

    registerOnChange(fn: any): void {
        this.onChangeCallback = fn;
    }

    registerOnTouched(fn: any): void {
        this.onTouchedCallback = fn;
    }

    /**
     * 单选时选中操作
     * 
     * @param {any} item 
     * @memberof IBizPickupListViewController
     */
    selectedChange(item) {
        let result: any = {};
        result.selectedData = item;
        this.onChangeCallback(result);
        this.selectChange.emit();
    }

    /**
     * 多选时选中操作
     * 
     * @param {*} item 
     * @memberof IBizPickupListViewController
     */
    selectedChanges(item: any) {
        if(this.isCancelChecked){
            this.selectChange.emit(item);
        } else {
            this.isCancelChecked = true;
        }
    }
}