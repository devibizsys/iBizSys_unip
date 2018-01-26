import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_JPYDJPYDLC_D_MobWFMDView } from './oa-jpydjpydlc-d-mob-wfmdview';




@NgModule({
  declarations: [
    OA_JPYDJPYDLC_D_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_JPYDJPYDLC_D_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_JPYDJPYDLC_D_MobWFMDViewModule {}