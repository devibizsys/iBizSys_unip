import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_NSJGHYSQMobWFActionView } from './oa-nsjghysqmob-wfaction-view';




@NgModule({
  declarations: [
    OA_NSJGHYSQMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_NSJGHYSQMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_NSJGHYSQMobWFActionViewModule {}