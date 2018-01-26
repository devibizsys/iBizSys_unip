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
        this.regItem({'name': 'orguserid', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'orgusername', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'orgsectorid', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'orgsectorname', 'visible': true, 'allowEmpty': true});
        this.regItem({'name': 'sl', 'visible': true, 'allowEmpty': true});
        this.regItem({'name': 'jg', 'visible': true, 'allowEmpty': true});
        this.regItem({'name': 'cglx', 'visible': true, 'allowEmpty': true});
        this.regItem({'name': 'zffs', 'visible': true, 'allowEmpty': true});
        this.regItem({'name': 'gg', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'sqsy', 'visible': true, 'allowEmpty': true});
        this.regItem({'name': 'bz', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'createdate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updateman', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'updatedate', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'oa_cgsqid', 'visible': true, 'allowEmpty': false});
    }
}
