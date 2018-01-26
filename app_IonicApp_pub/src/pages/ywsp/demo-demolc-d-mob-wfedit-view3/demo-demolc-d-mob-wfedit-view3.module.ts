import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { demoDEMOLC_D_MobWFEditView3 } from './demo-demolc-d-mob-wfedit-view3';




@NgModule({
  declarations: [
    demoDEMOLC_D_MobWFEditView3,
  ],
  imports: [
    IonicPageModule.forChild(demoDEMOLC_D_MobWFEditView3),
    IBizSysModule,
    UserModule,
  ],
})
export class demoDEMOLC_D_MobWFEditView3Module {}