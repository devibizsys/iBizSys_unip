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
        this.regItem({'name': 'demoname', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'bkbjdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'wbkdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'dhwbkdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'sjdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'dxlbdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'xllbdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'xxklbdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'tpdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'tplbdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'wjdemo', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createdate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updateman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updatedate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'demoid', 'visible': true, 'allowEmpty': false});
    }
}
