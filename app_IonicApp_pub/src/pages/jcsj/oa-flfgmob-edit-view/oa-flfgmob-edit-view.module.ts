import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_FLFGMobEditView } from './oa-flfgmob-edit-view';




@NgModule({
  declarations: [
    OA_FLFGMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_FLFGMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_FLFGMobEditViewModule {}