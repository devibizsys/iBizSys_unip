import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_SBWXCKMobEditView } from './oa-sbwxckmob-edit-view';




@NgModule({
  declarations: [
    OA_SBWXCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_SBWXCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_SBWXCKMobEditViewModule {}