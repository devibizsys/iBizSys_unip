import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YCSQMobWFActionView } from './oa-ycsqmob-wfaction-view';




@NgModule({
  declarations: [
    OA_YCSQMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YCSQMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YCSQMobWFActionViewModule {}