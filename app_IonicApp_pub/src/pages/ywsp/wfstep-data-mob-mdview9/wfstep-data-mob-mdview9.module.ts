import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { WFStepDataMobMDView9 } from './wfstep-data-mob-mdview9';

@NgModule({
  declarations: [
    WFStepDataMobMDView9,
  ],
  imports: [
    IonicPageModule.forChild(WFStepDataMobMDView9),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    WFStepDataMobMDView9,
  ]
})
export class WFStepDataMobMDView9Module {}