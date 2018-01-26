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
        this.regItem({'name': 'oa_ybhysqname', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'hysj', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'oa_hysname', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'hynr', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'hyyq', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'bz', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'tzzrs', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'wchrs', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'ycdrs', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'ychrs', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'yqjrs', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createdate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updateman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updatedate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'oa_ybhysqid', 'visible': true, 'allowEmpty': false});
    }
}
