import { IBizMDService } from './IBizMDService';

export class IBizListService extends IBizMDService {
    public $isOpenMultiselect: boolean = true;
    public $isCheckedAll: boolean = false;
    public $listSelectedDatas: any[] = [];

    constructor(opt) {
        super(opt);
    }

    /**
     * 判断全选按钮是否勾选
     * 
     * @memberof IBizListService
     */
    public isCheckedAllChange(): void {
        if(this.$listSelectedDatas.length === this.$items.length) {
            this.$isCheckedAll = true;
        } else {
            this.$isCheckedAll = false;
        }
    }

    /**
     * 列表多选是否开启改变
     * 
     * @memberof IBizListService
     */
    public isOpenMultiselectChange(): void {
        this.$isOpenMultiselect = !this.$isOpenMultiselect;
    }

    /**
     * 全选触发事件
     * 
     * @memberof IBizListService
     */
    public checkChangeAll(): void {
        this.$items.forEach((item) => {
            item.checked = this.$isCheckedAll;
        });
        this.$listSelectedDatas = [...this.$items];
        this.isCheckedAllChange();
    }

    /**
     * 列表反选
     * 
     * @memberof IBizListService
     */
    public listReverseSelection(): void {
        this.$listSelectedDatas = [];
        this.$items.forEach((item) => {
            if(item.checked) {
                item.checked = false;
            } else {
                item.checked = true;
                this.$listSelectedDatas.push(item);
            }
        });
        this.isCheckedAllChange();
    }

    /**
     * 列表选中触发事件
     * 
     * @memberof IBizListService
     */
    public selectedChange(item: any): void {
        if(item.checked) {
            this.$listSelectedDatas.push(item);
        } else {
            this.$listSelectedDatas.forEach((element, index) => {
                if(Object.is(element.srfkey, item.srfkey)) {
                    this.$listSelectedDatas.splice(index, 1);
                }
            });
        }
        this.isCheckedAllChange();
    }

    /**
     * 删除单条数据
     * 
     * @param {*} item 
     * @memberof IBizListService
     */
    public doRemove(item: any): void {
        if(item) {
            this.confirm('删除', '确认删除该条数据吗?', () => {
                let arg: any = {};
                arg.item = item;
                arg.isRemove = 0;
                this.fire(this.$staticVariables.BEFORREMOVE, arg);
                if(Object.is(arg.isRemove, 1)) {
                    return;
                }
                super.remove({ 'srfkeys': item.srfkey});
            });
        }
    }

    /**
     * 删除所选数据
     * 
     * @memberof IBizListService
     */
    public doRemoveAll(): void {
        if(this.$listSelectedDatas.length > 0){
            this.confirm('删除', '确认删除已选择的数据吗?', () => {
                let arg: any = {};
                arg.selectedDatas = this.$listSelectedDatas;
                arg.isRemove = 0;
                this.fire(this.$staticVariables.BEFORREMOVE, arg);
                if(Object.is(arg.isRemove, 1)) {
                    return;
                }
                let keys: string = '';
                this.$listSelectedDatas.forEach((element) => {
                    let key = element.srfkey;
                    if(!Object.is(keys, '')){
                        keys += ';';
                    }
                    keys += key;
                });
                super.remove({ 'srfkeys': keys});
            });
        } else {
            this.showToast('请先选中数据');
        }
    }
    
    /**
     * 获取已选择的数据
     * 
     * @returns {*} 
     * @memberof IBizListService
     */
    public getSelection(): any {
        return this.$listSelectedDatas;
    }
}