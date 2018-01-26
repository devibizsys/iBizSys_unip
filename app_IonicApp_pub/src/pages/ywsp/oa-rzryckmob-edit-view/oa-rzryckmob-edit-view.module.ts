import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_RZRYCKMobEditView } from './oa-rzryckmob-edit-view';




@NgModule({
  declarations: [
    OA_RZRYCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_RZRYCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_RZRYCKMobEditViewModule {}