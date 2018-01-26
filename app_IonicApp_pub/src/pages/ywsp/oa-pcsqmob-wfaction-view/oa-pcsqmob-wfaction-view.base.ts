import { IBizWFActionViewController } from '../../../ibizsys/ts/app/IBizWFActionViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	formService,
 } from './oa-pcsqmob-wfaction-view.service';

export class OA_PCSQMobWFActionViewBase extends IBizWFActionViewController {

    form: formService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_PCSQMobWFActionView.do' }));
  }

  ngOnInit(): void {
    this.form = new formService({ 'name': 'form', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('form', this.form);
    super.ngOnInit();
  }

  regUIActions(config){
    }

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}