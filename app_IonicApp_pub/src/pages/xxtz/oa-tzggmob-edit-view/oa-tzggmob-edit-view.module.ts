import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_TZGGMobEditView } from './oa-tzggmob-edit-view';




@NgModule({
  declarations: [
    OA_TZGGMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_TZGGMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_TZGGMobEditViewModule {}