import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { WFStepDataMyTimeLineMobMDView } from './wfstep-data-my-time-line-mob-mdview';




@NgModule({
  declarations: [
    WFStepDataMyTimeLineMobMDView,
  ],
  imports: [
    IonicPageModule.forChild(WFStepDataMyTimeLineMobMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class WFStepDataMyTimeLineMobMDViewModule {}