import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YYSSQYYSSQ_D_MobWFMDView } from './oa-yyssqyyssq-d-mob-wfmdview';




@NgModule({
  declarations: [
    OA_YYSSQYYSSQ_D_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YYSSQYYSSQ_D_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YYSSQYYSSQ_D_MobWFMDViewModule {}