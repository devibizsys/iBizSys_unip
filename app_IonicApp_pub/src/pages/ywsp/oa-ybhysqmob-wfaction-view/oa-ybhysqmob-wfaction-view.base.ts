import { IBizWFActionViewController } from '../../../ibizsys/ts/app/IBizWFActionViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	formService,
 } from './oa-ybhysqmob-wfaction-view.service';

export class OA_YBHYSQMobWFActionViewBase extends IBizWFActionViewController {

    form: formService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_YBHYSQMobWFActionView.do' }));
  }

  ngOnInit(): void {
    this.form = new formService({ 'name': 'form', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('form', this.form);
    super.ngOnInit();
  }

  regUIActions(config){
        let uiaction_0 = {"type":"DEUIACTION","tag":"Save"
        };
        super.regUIAction(uiaction_0);
    }

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}