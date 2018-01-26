import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_STWMDGMobEditView } from './oa-stwmdgmob-edit-view';




@NgModule({
  declarations: [
    OA_STWMDGMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_STWMDGMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_STWMDGMobEditViewModule {}