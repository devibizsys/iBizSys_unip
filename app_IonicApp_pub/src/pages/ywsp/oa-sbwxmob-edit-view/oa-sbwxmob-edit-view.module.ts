import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_SBWXMobEditView } from './oa-sbwxmob-edit-view';




@NgModule({
  declarations: [
    OA_SBWXMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_SBWXMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_SBWXMobEditViewModule {}