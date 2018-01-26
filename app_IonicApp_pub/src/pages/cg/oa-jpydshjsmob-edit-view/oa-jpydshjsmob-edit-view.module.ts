import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_JPYDSHJSMobEditView } from './oa-jpydshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_JPYDSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_JPYDSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_JPYDSHJSMobEditViewModule {}