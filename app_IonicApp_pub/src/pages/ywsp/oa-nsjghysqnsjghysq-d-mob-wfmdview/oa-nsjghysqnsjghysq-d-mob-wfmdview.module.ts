import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_NSJGHYSQNSJGHYSQ_D_MobWFMDView } from './oa-nsjghysqnsjghysq-d-mob-wfmdview';




@NgModule({
  declarations: [
    OA_NSJGHYSQNSJGHYSQ_D_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_NSJGHYSQNSJGHYSQ_D_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_NSJGHYSQNSJGHYSQ_D_MobWFMDViewModule {}