import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YYSSQYYSSQ_W_MobWFMDView } from './oa-yyssqyyssq-w-mob-wfmdview';




@NgModule({
  declarations: [
    OA_YYSSQYYSSQ_W_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YYSSQYYSSQ_W_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YYSSQYYSSQ_W_MobWFMDViewModule {}