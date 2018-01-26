import { IBizListService } from '../../../ibizsys/ts/widget/IBizListService'
import { IBizSearchFormService } from '../../../ibizsys/ts/widget/IBizSearchFormService'

export class mdctrlService extends IBizListService {
    constructor(opt){
        super(opt);
    }
}
export class searchformService extends IBizSearchFormService {
    constructor(opt){
        super(opt);
    }

    public regSearchItems(): void {
    }

    public regItems(): void {
        this.regItem({'name': 'n_oa_xmjdname_like', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'n_xmmc_like', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'n_createdate_ltandeq', 'visible': true, 'allowEmpty': false});
        this.regItem({'name': 'n_createdate_gtandeq', 'visible': true, 'allowEmpty': false});
    }
}
