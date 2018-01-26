import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CPMJSQCKMobEditView } from './oa-cpmjsqckmob-edit-view';




@NgModule({
  declarations: [
    OA_CPMJSQCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CPMJSQCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CPMJSQCKMobEditViewModule {}