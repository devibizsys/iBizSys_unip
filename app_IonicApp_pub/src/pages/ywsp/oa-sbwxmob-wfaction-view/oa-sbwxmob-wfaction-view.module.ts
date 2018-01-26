import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_SBWXMobWFActionView } from './oa-sbwxmob-wfaction-view';




@NgModule({
  declarations: [
    OA_SBWXMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_SBWXMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_SBWXMobWFActionViewModule {}