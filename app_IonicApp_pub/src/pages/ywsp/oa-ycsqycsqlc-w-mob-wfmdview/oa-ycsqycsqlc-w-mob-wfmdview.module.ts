import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YCSQYCSQLC_W_MobWFMDView } from './oa-ycsqycsqlc-w-mob-wfmdview';




@NgModule({
  declarations: [
    OA_YCSQYCSQLC_W_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YCSQYCSQLC_W_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YCSQYCSQLC_W_MobWFMDViewModule {}