import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CPMJSQMobWFActionView } from './oa-cpmjsqmob-wfaction-view';




@NgModule({
  declarations: [
    OA_CPMJSQMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CPMJSQMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CPMJSQMobWFActionViewModule {}