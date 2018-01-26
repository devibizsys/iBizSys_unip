import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YYSSQCKMobEditView } from './oa-yyssqckmob-edit-view';




@NgModule({
  declarations: [
    OA_YYSSQCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YYSSQCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YYSSQCKMobEditViewModule {}