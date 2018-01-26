import {IBizEditViewController} from './IBizEditViewController'

export class IBizEditView3Controller extends IBizEditViewController{
	
    constructor(props){
        super(props);
	}
	
	/**
	 * 刷新分页视图
	 * 
	 * @memberof IBizEditView3Controller
	 */
	public onRefresh(): void{
		this.getDRTab().refresh();
	}

	/**
	 * 更新分页视图参数
	 * 
	 * @memberof IBizEditView3Controller
	 */
	public updateViewInfo(): void{
		let data = this.getEditData();
		if(data){
			this.getDRTab().setParentData(data);
		}
        super.updateViewInfo();
	}
	
	/**
	 * 获取当前drtab控制器
	 * 
	 * @returns {*} 
	 * @memberof IBizEditView3Controller
	 */
	public getDRTab(): any{
		return this.getControl('drtab');
	}
}
