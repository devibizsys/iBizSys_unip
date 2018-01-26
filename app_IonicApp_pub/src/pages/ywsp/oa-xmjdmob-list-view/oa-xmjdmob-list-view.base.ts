import { IBizListViewController } from '../../../ibizsys/ts/app/IBizListViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	mdctrlService,
	searchformService,
 } from './oa-xmjdmob-list-view.service';

export class OA_XMJDMobListViewBase extends IBizListViewController {

    mdctrl: mdctrlService;
    searchform: searchformService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_XMJDMobListView.do' }));
  }

  ngOnInit(): void {
    this.mdctrl = new mdctrlService({ 'name': 'mdctrl', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('mdctrl', this.mdctrl);
    this.searchform = new searchformService({ 'name': 'searchform', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('searchform', this.searchform);
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
            className:'OA_XMJDMobEditView',
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
	      return { openMode:'', className:'OA_XMJDMobEditView', viewParam:params };
      }
    }
    



  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}