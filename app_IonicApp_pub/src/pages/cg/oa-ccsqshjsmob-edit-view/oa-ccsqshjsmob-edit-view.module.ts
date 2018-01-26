import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CCSQSHJSMobEditView } from './oa-ccsqshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_CCSQSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CCSQSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CCSQSHJSMobEditViewModule {}