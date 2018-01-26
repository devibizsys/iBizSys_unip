import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YBHYSQMobWFStartView } from './oa-ybhysqmob-wfstart-view';




@NgModule({
  declarations: [
    OA_YBHYSQMobWFStartView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YBHYSQMobWFStartView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YBHYSQMobWFStartViewModule {}