import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_QXJQXJLC_D_MobWFMDView } from './oa-qxjqxjlc-d-mob-wfmdview';




@NgModule({
  declarations: [
    OA_QXJQXJLC_D_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_QXJQXJLC_D_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_QXJQXJLC_D_MobWFMDViewModule {}