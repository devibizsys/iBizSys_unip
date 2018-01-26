import { ViewChild } from '@angular/core';
import { IBizWFEditViewController } from '../../../ibizsys/ts/app/IBizWFEditViewController';
import { IBizDRTabService } from '../../../ibizsys/ts/widget/IBizDRTabService';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	formService,
 } from './oa-clwxclwxlc-d-mob-wfedit-view3.service';

export class OA_CLWXCLWXLC_D_MobWFEditView3Base extends IBizWFEditViewController {

  drtab: IBizDRTabService;
  form: formService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_CLWXCLWXLC_D_MobWFEditView3.do' }));
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
        let uiaction_0 = {"type":"DEUIACTION","tag":"SaveAndStart"
        };
        super.regUIAction(uiaction_0);
        let uiaction_1 = {"type":"DEUIACTION","tag":"CKJL","actiontarget":"NONE"
            ,"actionmode":"FRONT"
            ,"fronttype":"WIZARD"
,"frontview":{"className":"OA_CLWXCKMobListView","title":"车辆维修查看",openMode:''}
        };
        super.regUIAction(uiaction_1);
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