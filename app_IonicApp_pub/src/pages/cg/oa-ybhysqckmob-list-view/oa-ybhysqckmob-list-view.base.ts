import { IBizListViewController } from '../../../ibizsys/ts/app/IBizListViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	mdctrlService,
 } from './oa-ybhysqckmob-list-view.service';

export class OA_YBHYSQCKMobListViewBase extends IBizListViewController {

    mdctrl: mdctrlService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/cg/OA_YBHYSQCKMobListView.do' }));
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
            className:'OA_YBHYSQCKMobEditView',
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
	      return { openMode:'', className:'OA_YBHYSQCKMobEditView', viewParam:params };
      }
    }
    



  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}