import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_JPYDJPYDLC_W_MobWFMDView } from './oa-jpydjpydlc-w-mob-wfmdview';




@NgModule({
  declarations: [
    OA_JPYDJPYDLC_W_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_JPYDJPYDLC_W_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_JPYDJPYDLC_W_MobWFMDViewModule {}