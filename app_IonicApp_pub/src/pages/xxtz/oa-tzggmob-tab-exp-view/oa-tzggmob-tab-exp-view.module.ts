import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_TZGGMobTabExpView } from './oa-tzggmob-tab-exp-view';


import { OA_TZGGWDMobMDView9Module } from '../../xxtz/oa-tzggwdmob-mdview9/oa-tzggwdmob-mdview9.module';
import { OA_TZGGYDMobMDView9Module } from '../../xxtz/oa-tzggydmob-mdview9/oa-tzggydmob-mdview9.module';


@NgModule({
  declarations: [
    OA_TZGGMobTabExpView,
  ],
  imports: [
    IonicPageModule.forChild(OA_TZGGMobTabExpView),
    IBizSysModule,
    UserModule,
    OA_TZGGWDMobMDView9Module,
    OA_TZGGYDMobMDView9Module,
  ],
})
export class OA_TZGGMobTabExpViewModule {}