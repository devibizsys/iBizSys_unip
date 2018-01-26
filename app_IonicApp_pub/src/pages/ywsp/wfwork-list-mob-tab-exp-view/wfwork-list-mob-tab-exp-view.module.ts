import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { WFWorkListMobTabExpView } from './wfwork-list-mob-tab-exp-view';


import { WFWorkListDSPMobMDView9Module } from '../../ywsp/wfwork-list-dspmob-mdview9/wfwork-list-dspmob-mdview9.module';
import { WFWorkListYSPMobMDView9Module } from '../../ywsp/wfwork-list-yspmob-mdview9/wfwork-list-yspmob-mdview9.module';


@NgModule({
  declarations: [
    WFWorkListMobTabExpView,
  ],
  imports: [
    IonicPageModule.forChild(WFWorkListMobTabExpView),
    IBizSysModule,
    UserModule,
    WFWorkListDSPMobMDView9Module,
    WFWorkListYSPMobMDView9Module,
  ],
})
export class WFWorkListMobTabExpViewModule {}