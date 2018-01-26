import { IBizEditFormService } from '../../../ibizsys/ts/widget/IBizEditFormService'

export class formService extends IBizEditFormService {
    constructor(opt){
        super(opt);
    }

    public regItems(): void {
        this.regItem({'name': 'srfupdatedate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srforikey', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srfkey', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srfmajortext', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srftempmode', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srfuf', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srfdeid', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srfsourcekey', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srfusername', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srfobj', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srfobj2', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'srfobj3', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'orguserid', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'oa_qxjid', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'qxjlx', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'sc', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'kssj', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'jssj', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'cjgzsj', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'qxjsy', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createdate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updateman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updatedate', 'visible': true, 'allowEmpty': false});
    }
}
