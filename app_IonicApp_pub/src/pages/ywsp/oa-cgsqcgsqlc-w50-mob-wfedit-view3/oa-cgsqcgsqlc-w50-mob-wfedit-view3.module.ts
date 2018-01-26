import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CGSQCGSQLC_W50_MobWFEditView3 } from './oa-cgsqcgsqlc-w50-mob-wfedit-view3';



import { WFStepDataMobMDView9Module } from '../../ywsp/wfstep-data-mob-mdview9/wfstep-data-mob-mdview9.module';

@NgModule({
  declarations: [
    OA_CGSQCGSQLC_W50_MobWFEditView3,
  ],
  imports: [
    IonicPageModule.forChild(OA_CGSQCGSQLC_W50_MobWFEditView3),
    IBizSysModule,
    UserModule,
    WFStepDataMobMDView9Module,
  ],
})
export class OA_CGSQCGSQLC_W50_MobWFEditView3Module {}