import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_PCSQSHJSMobEditView } from './oa-pcsqshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_PCSQSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_PCSQSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_PCSQSHJSMobEditViewModule {}