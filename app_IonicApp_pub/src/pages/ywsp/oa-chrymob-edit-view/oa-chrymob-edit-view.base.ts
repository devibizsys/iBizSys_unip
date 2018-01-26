import { IBizEditViewController } from '../../../ibizsys/ts/app/IBizEditViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	formService,
 } from './oa-chrymob-edit-view.service';

export class OA_CHRYMobEditViewBase extends IBizEditViewController {

    form: formService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_CHRYMobEditView.do' }));
  }

  ngOnInit(): void {
    this.form = new formService({ 'name': 'form', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('form', this.form);
    super.ngOnInit();
  }

  regUIActions(config){
        let uiaction_0 = {"type":"DEUIACTION","tag":"MobCH","actiontarget":"SINGLEKEY"
            ,"actionmode":"BACKEND"
            ,"timeout":60000
        };
        super.regUIAction(uiaction_0);
        let uiaction_1 = {"type":"DEUIACTION","tag":"MobQJ","actiontarget":"SINGLEKEY"
            ,"actionmode":"FRONT"
            ,"fronttype":"WIZARD"
,"frontview":{"className":"OA_CHRYRedirectView2","title":"参会人员数据重定向视图",openMode:'',redirectview:true,backendurl:"/IonicApp/cg/OA_CHRYRedirectView2.do"}
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