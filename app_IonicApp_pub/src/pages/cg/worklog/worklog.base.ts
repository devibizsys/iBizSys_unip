import { IBizPortalViewController } from '../../../ibizsys/ts/app/IBizPortalViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
 } from './worklog.service';

export class worklogBase extends IBizPortalViewController {


  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/cg/worklog.do' }));
  }

  ngOnInit(): void {
    super.ngOnInit();
  }

  regUIActions(config){
    }

  regAppFuncs(): void {
    this.regAppFunc({funcid:'6EFD2D37-FCB9-42AB-9DDB-47666730DBE8',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_GZRZMobListView',viewParams:{}});
    this.regAppFunc({funcid:'A04EB425-A4A3-4527-BD11-9D461A1E3593',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_GZRZRZTJLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'2E649846-2AD3-4770-A564-2014699764C9',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_GZRZRZTJLC_D_XZBMobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'28B7C95F-45AD-4EC7-B48F-D74CB0CA4091',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_GZRZRZTJLC_D_XYBMobWFEditView3',viewParams:{}});
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}