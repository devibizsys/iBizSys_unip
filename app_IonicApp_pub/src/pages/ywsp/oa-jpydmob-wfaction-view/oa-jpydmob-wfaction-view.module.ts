import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_JPYDMobWFActionView } from './oa-jpydmob-wfaction-view';




@NgModule({
  declarations: [
    OA_JPYDMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_JPYDMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_JPYDMobWFActionViewModule {}