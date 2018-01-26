import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_QXJMobWFActionView } from './oa-qxjmob-wfaction-view';




@NgModule({
  declarations: [
    OA_QXJMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_QXJMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_QXJMobWFActionViewModule {}