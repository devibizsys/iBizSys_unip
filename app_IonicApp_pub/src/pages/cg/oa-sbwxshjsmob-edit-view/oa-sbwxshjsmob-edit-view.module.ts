import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_SBWXSHJSMobEditView } from './oa-sbwxshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_SBWXSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_SBWXSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_SBWXSHJSMobEditViewModule {}