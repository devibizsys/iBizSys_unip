import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CPMJSQMobEditView } from './oa-cpmjsqmob-edit-view';




@NgModule({
  declarations: [
    OA_CPMJSQMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CPMJSQMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CPMJSQMobEditViewModule {}