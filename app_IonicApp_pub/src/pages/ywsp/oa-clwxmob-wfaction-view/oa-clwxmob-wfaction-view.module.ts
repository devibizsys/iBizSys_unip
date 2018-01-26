import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CLWXMobWFActionView } from './oa-clwxmob-wfaction-view';




@NgModule({
  declarations: [
    OA_CLWXMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CLWXMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CLWXMobWFActionViewModule {}