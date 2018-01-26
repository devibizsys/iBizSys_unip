import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YBHYSQMobWFActionView } from './oa-ybhysqmob-wfaction-view';




@NgModule({
  declarations: [
    OA_YBHYSQMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YBHYSQMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YBHYSQMobWFActionViewModule {}