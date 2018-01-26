import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_PCSQCKMobEditView } from './oa-pcsqckmob-edit-view';




@NgModule({
  declarations: [
    OA_PCSQCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_PCSQCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_PCSQCKMobEditViewModule {}