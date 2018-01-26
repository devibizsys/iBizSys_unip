import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YCSQYCSQLC_D_MobWFMDView } from './oa-ycsqycsqlc-d-mob-wfmdview';




@NgModule({
  declarations: [
    OA_YCSQYCSQLC_D_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YCSQYCSQLC_D_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YCSQYCSQLC_D_MobWFMDViewModule {}