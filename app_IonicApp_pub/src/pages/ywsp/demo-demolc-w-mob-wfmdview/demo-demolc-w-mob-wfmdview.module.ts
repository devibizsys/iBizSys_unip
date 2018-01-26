import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { demoDEMOLC_W_MobWFMDView } from './demo-demolc-w-mob-wfmdview';




@NgModule({
  declarations: [
    demoDEMOLC_W_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(demoDEMOLC_W_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class demoDEMOLC_W_MobWFMDViewModule {}