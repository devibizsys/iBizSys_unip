import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_STWMDGSTWMDGLC_W20_MobWFEditView3 } from './oa-stwmdgstwmdglc-w20-mob-wfedit-view3';



import { WFStepDataMobMDView9Module } from '../../ywsp/wfstep-data-mob-mdview9/wfstep-data-mob-mdview9.module';

@NgModule({
  declarations: [
    OA_STWMDGSTWMDGLC_W20_MobWFEditView3,
  ],
  imports: [
    IonicPageModule.forChild(OA_STWMDGSTWMDGLC_W20_MobWFEditView3),
    IBizSysModule,
    UserModule,
    WFStepDataMobMDView9Module,
  ],
})
export class OA_STWMDGSTWMDGLC_W20_MobWFEditView3Module {}