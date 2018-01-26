import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_BGYPSQSHJSMobEditView } from './oa-bgypsqshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_BGYPSQSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_BGYPSQSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_BGYPSQSHJSMobEditViewModule {}