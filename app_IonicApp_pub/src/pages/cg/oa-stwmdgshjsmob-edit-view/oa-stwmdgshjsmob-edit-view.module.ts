import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_STWMDGSHJSMobEditView } from './oa-stwmdgshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_STWMDGSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_STWMDGSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_STWMDGSHJSMobEditViewModule {}