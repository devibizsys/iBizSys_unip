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
        this.regItem({'name': 'orgsectorname', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'mdd', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'zw', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'je', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'sfzhm', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'jbrname', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'cfsj', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'fcsj', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'sqsy', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'fj', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createdate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updateman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updatedate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'oa_jpydid', 'visible': true, 'allowEmpty': false});
    }
}
