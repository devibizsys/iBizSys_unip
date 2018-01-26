import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_NSJGHYSQSHJSMobEditView } from './oa-nsjghysqshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_NSJGHYSQSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_NSJGHYSQSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_NSJGHYSQSHJSMobEditViewModule {}