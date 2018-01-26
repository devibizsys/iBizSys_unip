import { IBizListViewController } from '../../../ibizsys/ts/app/IBizListViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	mdctrlService,
 } from './oa-tzggwdmob-mdview9.service';

export class OA_TZGGWDMobMDView9Base extends IBizListViewController {

    mdctrl: mdctrlService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/xxtz/OA_TZGGWDMobMDView9.do' }));
  }

  ngOnInit(): void {
    this.mdctrl = new mdctrlService({ 'name': 'mdctrl', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('mdctrl', this.mdctrl);
    super.ngOnInit();
  }

  regUIActions(config){
    }


    public getNewDataView(params: any = {}): any {
       let newmode = params.srfnewmode;
       if(!newmode) {
            newmode='';
       }
      if(true){
      	let view={
            openMode:'',
            className:'OA_TZGGSHJSMobEditView',
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
	      return { openMode:'', className:'OA_TZGGSHJSMobEditView', viewParam:params };
      }
    }
    



  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}