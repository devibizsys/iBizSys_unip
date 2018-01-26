import { ViewChild } from '@angular/core';
import { IBizWFEditViewController } from '../../../ibizsys/ts/app/IBizWFEditViewController';
import { IBizDRTabService } from '../../../ibizsys/ts/widget/IBizDRTabService';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	formService,
 } from './demo-demolc-w10-mob-wfedit-view3.service';

export class demoDEMOLC_W10_MobWFEditView3Base extends IBizWFEditViewController {

  drtab: IBizDRTabService;
  form: formService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/demoDEMOLC_W10_MobWFEditView3.do' }));
  }

  ngOnInit(): void {
    this.drtab = new IBizDRTabService({ 'component': this });
    this.regControl('drtab', this.drtab);
    this.form = new formService({ 'name': 'form', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('form', this.form);
    super.ngOnInit();
  }

  segmentChanged(event) {
    let name = event.value;
    if(Object.is(name, 'form')){
      return;
    }
    //this.drtab.setParentData(this.getEditData());
    setTimeout(() => {
      //this.drtab.onTabSelectionChange();
    }, 1);
  }

  regUIActions(config){
        let uiaction_0 = {"type":"WFUIACTION","tag":"AC1010","actiontarget":"MULTIKEY"
            ,"actionmode":"WFBACKEND"
            ,"timeout":60000
        };
        super.regUIAction(uiaction_0);
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