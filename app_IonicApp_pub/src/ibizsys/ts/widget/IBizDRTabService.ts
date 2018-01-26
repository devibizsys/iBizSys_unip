import { IBizTabService } from './IBizTabService'

export class IBizDRTabService extends IBizTabService {
	public $parentData: any;

	constructor(props) {
		super(props)
	}

	/**
	 * tab页签选中改变触发
	 * 
	 * @memberof IBizDRTabService
	 */
	onTabSelectionChange() {
		let viewControl = this.getActiveTabView();
		if (viewControl) {
			if (this.$parentData) {
				let opt = { 'srfparentdeid': this.$parentData.srfdeid, 'srfparentkey': this.$parentData.srfkey };
				let parentMode = viewControl.getParentMode();
				if(parentMode) {
					Object.assign(opt, parentMode);
				}
				viewControl.load(opt);
			} else {
				this.showToast('请先建立父数据');
			}
		}
	}

	/**
	 * 设置父数据
	 * 
	 * @param {any} data 
	 * @memberof IBizDRTabService
	 */
	setParentData(data) {
		this.$parentData = data;
	}
}