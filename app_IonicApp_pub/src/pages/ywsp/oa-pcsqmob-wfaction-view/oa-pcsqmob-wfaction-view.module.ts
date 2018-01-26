import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_PCSQMobWFActionView } from './oa-pcsqmob-wfaction-view';




@NgModule({
  declarations: [
    OA_PCSQMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_PCSQMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_PCSQMobWFActionViewModule {}