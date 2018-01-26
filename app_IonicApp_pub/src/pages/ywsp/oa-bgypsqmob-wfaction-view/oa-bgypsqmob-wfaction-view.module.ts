import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_BGYPSQMobWFActionView } from './oa-bgypsqmob-wfaction-view';




@NgModule({
  declarations: [
    OA_BGYPSQMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_BGYPSQMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_BGYPSQMobWFActionViewModule {}