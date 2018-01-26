import { IBizFormService } from './IBizFormService';

export class IBizSearchFormService extends IBizFormService {
    public bResetting: boolean;
    public $searchMore: boolean = false;
    public $searchItem: any = {};
    public activeValue: any;

    constructor(opt) {
        super(opt);
        this.regSearchItems();
    }

    public getFormType(): string {
        return 'SEARCHFORM';
    }

    public toggleSearchMore(): void {
        this.$searchMore = !this.$searchMore;
    }

    /**
     * 快捷搜索，点击一次设置值，再次点击时当字段中有值时并与传入值相等清空当前字段值
     * 
     * @param {string} fieldname 字段名称
     * @param {*} value 字段值
     * @memberof IBizSearchFormService
     */
    public quickSearch(fieldname: string, value: any): void {
        if(value){
            this.activeValue = value;
            if (!Object.is(this.$searchItem[fieldname], '') && Object.is(this.$searchItem[fieldname], value)) {
                this.$searchItem[fieldname] = '';
                value = '';
            } else {
                this.$searchItem[fieldname] = value;
            }
            this.$data[fieldname] = value;
            this.fieldChange(value, fieldname, this.$item[fieldname]);
        }
    }

    public onSearch(): void {
        this.fire(this.$staticVariables.FORMSEARCHED);
    }

    public onSearchClick(): void {
        this.search();
    }

    public onResetClick(): void {
        this.reset();
        this.fire(this.$staticVariables.FORMRESETED);
    }
    /**
     * 
     * 
     * @param {*} [arg={}] 
     * @memberof IBizSearchFormService
     */
    public search(arg: any = {}): void {
        Object.assign(arg, { srfaction: 'search' });
        Object.assign(arg, this.getData());
        this.post(arg)
            .subscribe(
                response => {
                    this.fire(this.$staticVariables.FORMSEARCHED);
                    this.toggleSearchMore();
                },
                error => {
                    console.log('表单搜索失败!');
                }
            );
    }

    /**
     * 字段值改变触发
     * 
     * @param {any} $event 字段变化后的值
     * @param {string} fieldname 字段名称
     * @param {*} field 
     * @memberof IBizSearchFormService
     */
    public fieldChange($event, fieldname: string, field: any): void {
        if (this.$searchItem[fieldname] || Object.is(this.$searchItem[fieldname], '')) {
            if ($event) {
                this.$searchItem[fieldname] = $event;
            }
            this.fire(this.$staticVariables.FORMSEARCHED);
        }
        super.fieldChange($event, fieldname, field);
    }

    public regSearchItems(): void {

    }

    /**
     * 注册搜索表单项
     * 
     * @param {*} _searchItem 
     * @memberof IBizSearchFormService
     */
    public regSearchItem(_searchItem: any): void {
        let name = _searchItem.name;
        if (name) {
            this.$searchItem[_searchItem.name] = '';
        }
    }

    /**
     * 搜索表单,不显示loading框。
     * 
     * @memberof IBizSearchFormService
     */
    public mask(): void {

    }

}