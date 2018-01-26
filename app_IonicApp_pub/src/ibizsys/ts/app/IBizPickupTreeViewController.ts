import { IBizPickupListViewController } from './IBizPickupListViewController';
import { EventEmitter, Output } from '@angular/core';

export class IBizPickupTreeViewController extends IBizPickupListViewController {
    public $treeNodeList: string[] = [];
    public $selectedDatas: string[] = [];
    @Output()
    selectChange: EventEmitter<string> = new EventEmitter();

    constructor(opt) {
        super(opt);
    }

    ngOnInit(): void {
        this.load();
    }

    /**
     * 加载数据
     * 
     * @param {*} [opt={}] 
     * @memberof IBizPickupTreeViewController
     */
    public load(opt: any = {}): void {
        if (this.getTreeCtrl()) {
            this.getTreeCtrl().load(opt);
        }
    }

    /**
     * 去掉指定选中数据
     * 
     * @memberof IBizPickupTreeViewController
     */
    public cancelChecked(item: any): void {
        let treeCtrl = this.getTreeCtrl()
        if(treeCtrl && this.isFunction(treeCtrl.cancelChecked)) {
            treeCtrl.cancelChecked(item);
        }
    }

    /**
     * 树节点选中
     * 
     * @param {any} item 
     * @memberof IBizPickupTreeViewController
     */
    public checkboxChange(item): void {
        this.getTreeCtrl().load(item);
        this.$treeNodeList.push(item);
    }

    /**
     * 节点选中事件
     * 
     * @param {any} item 
     * @memberof IBizPickupTreeViewController
     */
    public selectedChange(item): void {
        if(this.isCancelChecked){
            this.selectChange.emit(item);
        } else {
            this.isCancelChecked = true;
        }
    }

    /**
     * 获取树控件的Service
     * 
     * @returns {*} 
     * @memberof IBizPickupTreeViewController
     */
    public getTreeCtrl(): any {
        return this.getControl('tree');
    }

    /**
     * 
     * 
     * @param {any} item 
     * @param {any} index 
     * @returns {void} 
     * @memberof IBizPickupTreeViewController
     */
    public needTreeChange(item, index): void {
        if (this.$treeNodeList.length <= 0) {
            return;
        }
        if (!item) {
            this.load();
            this.$treeNodeList = [];
        } else {
            if ((index + 1) == this.$treeNodeList.length)
                return;
            this.load(item);
            for (let i = index; i < this.$treeNodeList.length; i++) {
                this.$treeNodeList.pop();
            }
        }
    }

}