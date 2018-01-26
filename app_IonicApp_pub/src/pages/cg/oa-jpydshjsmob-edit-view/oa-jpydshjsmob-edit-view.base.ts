import { IBizEditViewController } from '../../../ibizsys/ts/app/IBizEditViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	formService,
 } from './oa-jpydshjsmob-edit-view.service';

export class OA_JPYDSHJSMobEditViewBase extends IBizEditViewController {

    form: formService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/cg/OA_JPYDSHJSMobEditView.do' }));
  }

  ngOnInit(): void {
    this.form = new formService({ 'name': 'form', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('form', this.form);
    super.ngOnInit();
  }

  regUIActions(config){
    }

public onFieldValueChanged(fieldname: string, value: any, field: any): void {
   let me=this;
   let form=me.getForm();
}

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}