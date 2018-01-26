import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YYSSQSHJSMobEditView } from './oa-yyssqshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_YYSSQSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YYSSQSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YYSSQSHJSMobEditViewModule {}