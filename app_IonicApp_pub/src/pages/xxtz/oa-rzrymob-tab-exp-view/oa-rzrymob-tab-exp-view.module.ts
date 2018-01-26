import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_RZRYMobTabExpView } from './oa-rzrymob-tab-exp-view';


import { OA_RZRYMyReceiveMobMDView9Module } from '../../xxtz/oa-rzrymy-receive-mob-mdview9/oa-rzrymy-receive-mob-mdview9.module';
import { OA_RZRYMySenderMobMDView9Module } from '../../xxtz/oa-rzrymy-sender-mob-mdview9/oa-rzrymy-sender-mob-mdview9.module';


@NgModule({
  declarations: [
    OA_RZRYMobTabExpView,
  ],
  imports: [
    IonicPageModule.forChild(OA_RZRYMobTabExpView),
    IBizSysModule,
    UserModule,
    OA_RZRYMyReceiveMobMDView9Module,
    OA_RZRYMySenderMobMDView9Module,
  ],
})
export class OA_RZRYMobTabExpViewModule {}