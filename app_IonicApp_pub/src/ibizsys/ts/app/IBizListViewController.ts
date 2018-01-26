import { IBizMDViewController } from './IBizMDViewController';

export class IBizListViewController extends IBizMDViewController {

    constructor(opt) {
        super(opt);
    }

    /**
     * 获取列表Service
     * 
     * @returns {*} 
     * @memberof IBizListViewController
     */
    public getMDCtrl(): any {
        let mdCtrl = this.getControl('list');
        if (!mdCtrl) {
            mdCtrl = this.getControl('mdctrl');
        }
        if (mdCtrl) {
            return mdCtrl;
        }
        return super.getMDCtrl();
    }

    /**
     * 删除已选中的数据前
     * 
     * @param {*} [params={}] 
     * @returns 
     * @memberof IBizListViewController
     */
    public doRemove(params: any = {}) {
        let me = this;
        let selectedDatas = this.getMDCtrl().getSelection();
        if(selectedDatas == null || selectedDatas.length == 0) {
            return;
        }
        this.confirm('删除', '确认删除已选中的'+selectedDatas.length+'条数据,删除后不可恢复?', () => {
            me.removeData();
        });
    }
    
    /**
     * 删除已选中的数据
     * 
     * @param {*} [arg={}] 
     * @returns {void} 
     * @memberof IBizListViewController
     */
    public removeData(arg: any = {}): void {
        if (this.getParentMode()) {
            Object.assign(arg, this.getParentMode());
        }

        if (this.getParentData()) {
            Object.assign(arg, this.getParentData());
        }

        if(!arg.srfkeys){
            //获取要删除的数据集合
            let selectedDatas = this.getMDCtrl().getSelection();
            if(selectedDatas == null || selectedDatas.length == 0){
                return;
            }
            let keys = '';
            selectedDatas.forEach((element) => {
                let key = element.srfkey;
                if(keys != '') {
                    keys += ';';
                }
                keys += key;
            });
            arg.srfkeys = keys;
        }
        this.getMDCtrl().remove(arg);
    }
}