import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YBHYSQSHJSMobEditView } from './oa-ybhysqshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_YBHYSQSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YBHYSQSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YBHYSQSHJSMobEditViewModule {}