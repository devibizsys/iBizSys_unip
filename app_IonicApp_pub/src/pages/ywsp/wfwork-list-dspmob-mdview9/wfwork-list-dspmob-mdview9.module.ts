import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { WFWorkListDSPMobMDView9 } from './wfwork-list-dspmob-mdview9';

@NgModule({
  declarations: [
    WFWorkListDSPMobMDView9,
  ],
  imports: [
    IonicPageModule.forChild(WFWorkListDSPMobMDView9),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    WFWorkListDSPMobMDView9,
  ]
})
export class WFWorkListDSPMobMDView9Module {}