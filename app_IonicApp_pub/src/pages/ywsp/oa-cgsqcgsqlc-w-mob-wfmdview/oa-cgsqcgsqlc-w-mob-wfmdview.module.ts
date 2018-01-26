import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CGSQCGSQLC_W_MobWFMDView } from './oa-cgsqcgsqlc-w-mob-wfmdview';




@NgModule({
  declarations: [
    OA_CGSQCGSQLC_W_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CGSQCGSQLC_W_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CGSQCGSQLC_W_MobWFMDViewModule {}