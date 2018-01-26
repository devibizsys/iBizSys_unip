import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_PCSQMobEditView } from './oa-pcsqmob-edit-view';




@NgModule({
  declarations: [
    OA_PCSQMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_PCSQMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_PCSQMobEditViewModule {}