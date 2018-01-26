import { IBizPortalViewController } from '../../../ibizsys/ts/app/IBizPortalViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
 } from './mywork.service';

export class myworkBase extends IBizPortalViewController {


  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/cg/mywork.do' }));
  }

  ngOnInit(): void {
    super.ngOnInit();
  }

  regUIActions(config){
    }

  regAppFuncs(): void {
    this.regAppFunc({funcid:'B45F609D-07EA-49AB-B1E9-66FBADCCFE50',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_TZGGTZGGSQLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'309495F7-3CCA-4F0B-99C8-0CB6D355F127',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_GZRZMobTabExpView',viewParams:{}});
    this.regAppFunc({funcid:'1141D577-8CB3-45D9-A8EF-59D0D4627399',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_ZSKMobListView',viewParams:{}});
    this.regAppFunc({funcid:'FDBF349A-B96F-47E7-9372-A946A2F74D1F',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'worklog',viewParams:{}});
    this.regAppFunc({funcid:'C62787B2-7F7D-4D43-BF61-7683327492D8',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'WFWorkListMobTabExpView',viewParams:{}});
    super.regAppFuncs();
  }

  regUICounters() : void {
    this.regUICounter(new IBizUICounter({'viewCtrl': this, 'name': 'MobCount', 'counterId': 'A2788F84-01B1-442F-BA42-9D0A6440A443', 'tag': 'f5cc0c2f36ac1ce27103c0c375f52bbb', 'counterParam': {}, 'timer': '10000'}));
  }
}