import { IBizListViewController } from '../../../ibizsys/ts/app/IBizListViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	mdctrlService,
 } from './oa-pcsqpcsqlc-d-mob-wfmdview.service';

export class OA_PCSQPCSQLC_D_MobWFMDViewBase extends IBizListViewController {

    mdctrl: mdctrlService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_PCSQPCSQLC_D_MobWFMDView.do' }));
  }

  ngOnInit(): void {
    this.mdctrl = new mdctrlService({ 'name': 'mdctrl', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('mdctrl', this.mdctrl);
    super.ngOnInit();
  }

  regUIActions(config){
        let uiaction_0 = {"type":"DEUIACTION","tag":"New"
        };
        super.regUIAction(uiaction_0);
    }


    public getNewDataView(params: any = {}): any {
       let newmode = params.srfnewmode;
       if(!newmode) {
            newmode='';
       }
      if(true){
      	let view={
            openMode:'',
            className:'OA_PCSQMobEditView',
            viewParam:params
      	};
      	return view;
      }
    }

    public getEditDataView(params: any = {}): any {
       let list = [params.srfeditmode2,params.srfeditmode];
       for(let i=0;i<2;i++){
          let editmode=list[i];
          if(!editmode)
             continue;
      }
      if(true){
	      return { openMode:'', className:'OA_PCSQMobEditView', viewParam:params };
      }
    }
    



  getEditMode(data){
    let editMode=super.getEditMode(data);
     return editMode;
      }

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}