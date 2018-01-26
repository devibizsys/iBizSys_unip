import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { WFWorkListYSPMobMDView9 } from './wfwork-list-yspmob-mdview9';

@NgModule({
  declarations: [
    WFWorkListYSPMobMDView9,
  ],
  imports: [
    IonicPageModule.forChild(WFWorkListYSPMobMDView9),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    WFWorkListYSPMobMDView9,
  ]
})
export class WFWorkListYSPMobMDView9Module {}