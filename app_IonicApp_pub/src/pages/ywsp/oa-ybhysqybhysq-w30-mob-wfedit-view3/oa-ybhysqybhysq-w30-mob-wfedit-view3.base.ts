import { ViewChild } from '@angular/core';
import { IBizWFEditViewController } from '../../../ibizsys/ts/app/IBizWFEditViewController';
import { IBizDRTabService } from '../../../ibizsys/ts/widget/IBizDRTabService';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	formService,
 } from './oa-ybhysqybhysq-w30-mob-wfedit-view3.service';

export class OA_YBHYSQYBHYSQ_W30_MobWFEditView3Base extends IBizWFEditViewController {

  drtab: IBizDRTabService;
  form: formService;
  @ViewChild('dritem1') dritem1;
  @ViewChild('dritem4') dritem4;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_YBHYSQYBHYSQ_W30_MobWFEditView3.do' }));
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
      if (Object.is(name, 'dritem1')) {
        this.drtab.setActiveTabView(this.dritem1);
      }
      if (Object.is(name, 'dritem4')) {
        this.drtab.setActiveTabView(this.dritem4);
      }
      //this.drtab.onTabSelectionChange();
    }, 1);
  }

  regUIActions(config){
        let uiaction_0 = {"type":"WFUIACTION","tag":"AC3020","actiontarget":"MULTIKEY"
            ,"actionmode":"WFFRONT"
            ,"fronttype":"WIZARD"
,"frontview":{"className":"OA_YBHYSQSHYJMobWFActionView","viewParam":{"srfwfiatag":"AC3020","srfwfstep":"30"},"title":"会议申请",openMode:'POPUPMODAL'}
        };
        super.regUIAction(uiaction_0);
        let uiaction_1 = {"type":"WFUIACTION","tag":"AC3010","actiontarget":"MULTIKEY"
            ,"actionmode":"WFBACKEND"
            ,"timeout":60000
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