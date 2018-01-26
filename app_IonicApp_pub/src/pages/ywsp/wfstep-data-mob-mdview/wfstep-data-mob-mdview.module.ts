import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { WFStepDataMobMDView } from './wfstep-data-mob-mdview';




@NgModule({
  declarations: [
    WFStepDataMobMDView,
  ],
  imports: [
    IonicPageModule.forChild(WFStepDataMobMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class WFStepDataMobMDViewModule {}