import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CGSQMobWFActionView } from './oa-cgsqmob-wfaction-view';




@NgModule({
  declarations: [
    OA_CGSQMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CGSQMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CGSQMobWFActionViewModule {}