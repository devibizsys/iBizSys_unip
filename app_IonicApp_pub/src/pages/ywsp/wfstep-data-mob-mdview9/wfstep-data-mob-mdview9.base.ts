import { IBizListViewController } from '../../../ibizsys/ts/app/IBizListViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	mdctrlService,
 } from './wfstep-data-mob-mdview9.service';

export class WFStepDataMobMDView9Base extends IBizListViewController {

    mdctrl: mdctrlService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/WFStepDataMobMDView9.do' }));
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
    }

    public getEditDataView(params: any = {}): any {
       let list = [params.srfeditmode2,params.srfeditmode];
       for(let i=0;i<2;i++){
          let editmode=list[i];
          if(!editmode)
             continue;
      }
    }
    



  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}