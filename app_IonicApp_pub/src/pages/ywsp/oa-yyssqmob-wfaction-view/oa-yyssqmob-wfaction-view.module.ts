import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YYSSQMobWFActionView } from './oa-yyssqmob-wfaction-view';




@NgModule({
  declarations: [
    OA_YYSSQMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YYSSQMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YYSSQMobWFActionViewModule {}