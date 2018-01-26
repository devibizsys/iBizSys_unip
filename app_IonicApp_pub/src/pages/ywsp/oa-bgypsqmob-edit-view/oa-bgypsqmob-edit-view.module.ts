import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_BGYPSQMobEditView } from './oa-bgypsqmob-edit-view';




@NgModule({
  declarations: [
    OA_BGYPSQMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_BGYPSQMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_BGYPSQMobEditViewModule {}