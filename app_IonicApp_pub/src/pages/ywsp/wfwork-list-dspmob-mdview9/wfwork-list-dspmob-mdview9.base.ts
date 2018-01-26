import { IBizListViewController } from '../../../ibizsys/ts/app/IBizListViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	mdctrlService,
	searchformService,
 } from './wfwork-list-dspmob-mdview9.service';

export class WFWorkListDSPMobMDView9Base extends IBizListViewController {

    mdctrl: mdctrlService;
    searchform: searchformService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/WFWorkListDSPMobMDView9.do' }));
  }

  ngOnInit(): void {
    this.mdctrl = new mdctrlService({ 'name': 'mdctrl', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('mdctrl', this.mdctrl);
    this.searchform = new searchformService({ 'name': 'searchform', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('searchform', this.searchform);
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
      if(true){
	      return { openMode:'', redirect: true, redirectUrl: '/IonicApp/ywsp/WFWorkListRedirectView.do', viewParam:params };
      }
    }
    



  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}