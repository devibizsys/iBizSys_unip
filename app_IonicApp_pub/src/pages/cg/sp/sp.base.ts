import { IBizPortalViewController } from '../../../ibizsys/ts/app/IBizPortalViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
 } from './sp.service';

export class spBase extends IBizPortalViewController {


  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/cg/sp.do' }));
  }

  ngOnInit(): void {
    super.ngOnInit();
  }

  regUIActions(config){
    }

  regAppFuncs(): void {
    this.regAppFunc({funcid:'EC364687-85F2-4EC2-89D4-B1514B8DD054',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_YYSSQYYSSQ_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'47946B24-CA52-4A37-907F-BF5B654B0EF5',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_CPMJSQCPMJSQLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'E667A3F6-7981-4A5A-BD6C-A4BBFB210F85',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_YBHYSQYBHYSQ_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'D20470AC-416F-42DD-BE9C-D3BA778CC316',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_STWMDGSTWMDGLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'2245B46F-9BC4-42E2-97B5-0B870D85AE4E',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'WFWorkListMyWFMobListView',viewParams:{}});
    this.regAppFunc({funcid:'04FA39A2-9BAC-4D41-8661-525D018E97EA',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_XMJDMobListView',viewParams:{}});
    this.regAppFunc({funcid:'FF86FEDE-1856-40E0-A0E2-7EBBAEB92607',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_BGYPSQBGYPSQLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'A5007D6A-EBDB-4DBC-A40E-571419BE612F',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_HYSMobListView',viewParams:{}});
    this.regAppFunc({funcid:'60B7E099-8AD3-41E3-9A06-46AFC7EA79D8',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_CCSQCCSQLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'71DB2044-B5DE-45E3-AC94-49C536BDB057',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_QXJQXJLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'9E984A04-E6A2-416D-91D4-4B9A9CE1FF59',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_RZRYCKMobListView',viewParams:{}});
    this.regAppFunc({funcid:'DBCCDA6A-F560-4D71-B8CF-69F3094673C7',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_YCSQYCSQLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'3552FC7B-8D12-4499-A40C-0D84741A10A2',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_JPYDJPYDLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'2438D816-D5AF-47D6-8F5F-7B9738783A61',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_PCSQPCSQLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'6221BC70-1140-4A78-90B7-88B1FD5B56F8',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_SBWXSBWXLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'2CA4FBA5-DFC5-45F7-9C29-942357225FC7',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_CGSQCGSQLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'60D6ACC9-51C3-4EE6-80A9-2E66E616EA72',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'OA_CLWXCLWXLC_D_MobWFEditView3',viewParams:{}});
    this.regAppFunc({funcid:'C62787B2-7F7D-4D43-BF61-7683327492D8',functype:'APPVIEW',openmode:'INDEXVIEWTAB',className:'WFWorkListMobTabExpView',viewParams:{}});
    super.regAppFuncs();
  }

  regUICounters() : void {
    this.regUICounter(new IBizUICounter({'viewCtrl': this, 'name': 'MobCount', 'counterId': 'A2788F84-01B1-442F-BA42-9D0A6440A443', 'tag': 'f5cc0c2f36ac1ce27103c0c375f52bbb', 'counterParam': {}, 'timer': '10000'}));
  }
}