import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CCSQMobWFActionView } from './oa-ccsqmob-wfaction-view';




@NgModule({
  declarations: [
    OA_CCSQMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CCSQMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CCSQMobWFActionViewModule {}