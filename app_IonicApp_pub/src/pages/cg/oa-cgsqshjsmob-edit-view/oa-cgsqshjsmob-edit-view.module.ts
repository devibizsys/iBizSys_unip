import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CGSQSHJSMobEditView } from './oa-cgsqshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_CGSQSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CGSQSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CGSQSHJSMobEditViewModule {}