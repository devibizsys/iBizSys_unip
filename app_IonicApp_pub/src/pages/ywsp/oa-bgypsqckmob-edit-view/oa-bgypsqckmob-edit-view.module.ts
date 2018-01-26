import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_BGYPSQCKMobEditView } from './oa-bgypsqckmob-edit-view';




@NgModule({
  declarations: [
    OA_BGYPSQCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_BGYPSQCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_BGYPSQCKMobEditViewModule {}