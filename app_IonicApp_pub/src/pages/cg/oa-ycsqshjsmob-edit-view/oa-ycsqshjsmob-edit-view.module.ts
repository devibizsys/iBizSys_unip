import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YCSQSHJSMobEditView } from './oa-ycsqshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_YCSQSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YCSQSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YCSQSHJSMobEditViewModule {}