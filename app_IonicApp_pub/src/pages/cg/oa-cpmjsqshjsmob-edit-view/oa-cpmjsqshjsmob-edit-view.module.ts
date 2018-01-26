import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CPMJSQSHJSMobEditView } from './oa-cpmjsqshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_CPMJSQSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CPMJSQSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CPMJSQSHJSMobEditViewModule {}