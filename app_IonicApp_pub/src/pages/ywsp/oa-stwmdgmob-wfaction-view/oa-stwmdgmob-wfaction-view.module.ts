import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_STWMDGMobWFActionView } from './oa-stwmdgmob-wfaction-view';




@NgModule({
  declarations: [
    OA_STWMDGMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_STWMDGMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_STWMDGMobWFActionViewModule {}