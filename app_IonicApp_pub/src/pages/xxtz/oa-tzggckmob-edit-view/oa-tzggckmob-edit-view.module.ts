import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_TZGGCKMobEditView } from './oa-tzggckmob-edit-view';




@NgModule({
  declarations: [
    OA_TZGGCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_TZGGCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_TZGGCKMobEditViewModule {}