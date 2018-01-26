import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { demoDEMOLC_D_MobWFMDView } from './demo-demolc-d-mob-wfmdview';




@NgModule({
  declarations: [
    demoDEMOLC_D_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(demoDEMOLC_D_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class demoDEMOLC_D_MobWFMDViewModule {}