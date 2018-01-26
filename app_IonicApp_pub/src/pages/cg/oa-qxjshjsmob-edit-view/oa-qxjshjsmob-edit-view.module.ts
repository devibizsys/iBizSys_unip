import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_QXJSHJSMobEditView } from './oa-qxjshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_QXJSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_QXJSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_QXJSHJSMobEditViewModule {}