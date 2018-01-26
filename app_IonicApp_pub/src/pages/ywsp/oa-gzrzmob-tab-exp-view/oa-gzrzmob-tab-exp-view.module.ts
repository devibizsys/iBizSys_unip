import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZMobTabExpView } from './oa-gzrzmob-tab-exp-view';


import { OA_RZRYMyReceiveMobMDView9Module } from '../../xxtz/oa-rzrymy-receive-mob-mdview9/oa-rzrymy-receive-mob-mdview9.module';
import { OA_GZRZMySenderMobMDView9Module } from '../../ywsp/oa-gzrzmy-sender-mob-mdview9/oa-gzrzmy-sender-mob-mdview9.module';


@NgModule({
  declarations: [
    OA_GZRZMobTabExpView,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZMobTabExpView),
    IBizSysModule,
    UserModule,
    OA_RZRYMyReceiveMobMDView9Module,
    OA_GZRZMySenderMobMDView9Module,
  ],
})
export class OA_GZRZMobTabExpViewModule {}