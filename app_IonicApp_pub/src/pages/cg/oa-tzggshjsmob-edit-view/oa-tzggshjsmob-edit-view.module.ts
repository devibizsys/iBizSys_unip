import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_TZGGSHJSMobEditView } from './oa-tzggshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_TZGGSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_TZGGSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_TZGGSHJSMobEditViewModule {}