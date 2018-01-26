import { IBizWFStartViewController } from '../../../ibizsys/ts/app/IBizWFStartViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	formService,
 } from './oa-ybhysqmob-wfstart-view.service';

export class OA_YBHYSQMobWFStartViewBase extends IBizWFStartViewController {

    form: formService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_YBHYSQMobWFStartView.do' }));
  }

  ngOnInit(): void {
    this.form = new formService({ 'name': 'form', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('form', this.form);
    super.ngOnInit();
  }

  regUIActions(config){
        let uiaction_0 = {"type":"DEUIACTION","tag":"OKButton"
        };
        super.regUIAction(uiaction_0);
        let uiaction_1 = {"type":"DEUIACTION","tag":"Back"
        };
        super.regUIAction(uiaction_1);
    }

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}