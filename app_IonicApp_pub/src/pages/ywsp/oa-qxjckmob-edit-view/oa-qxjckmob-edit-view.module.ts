import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_QXJCKMobEditView } from './oa-qxjckmob-edit-view';




@NgModule({
  declarations: [
    OA_QXJCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_QXJCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_QXJCKMobEditViewModule {}