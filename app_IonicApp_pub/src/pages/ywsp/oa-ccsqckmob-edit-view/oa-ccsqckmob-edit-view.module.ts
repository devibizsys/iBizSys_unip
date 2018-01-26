import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CCSQCKMobEditView } from './oa-ccsqckmob-edit-view';




@NgModule({
  declarations: [
    OA_CCSQCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CCSQCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CCSQCKMobEditViewModule {}