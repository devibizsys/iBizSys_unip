import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_JPYDMobEditView } from './oa-jpydmob-edit-view';




@NgModule({
  declarations: [
    OA_JPYDMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_JPYDMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_JPYDMobEditViewModule {}