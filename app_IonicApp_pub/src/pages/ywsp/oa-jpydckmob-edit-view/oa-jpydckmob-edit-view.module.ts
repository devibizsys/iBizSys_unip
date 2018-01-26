import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_JPYDCKMobEditView } from './oa-jpydckmob-edit-view';




@NgModule({
  declarations: [
    OA_JPYDCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_JPYDCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_JPYDCKMobEditViewModule {}