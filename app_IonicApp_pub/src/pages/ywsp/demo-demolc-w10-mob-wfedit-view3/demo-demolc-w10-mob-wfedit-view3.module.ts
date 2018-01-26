import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { demoDEMOLC_W10_MobWFEditView3 } from './demo-demolc-w10-mob-wfedit-view3';




@NgModule({
  declarations: [
    demoDEMOLC_W10_MobWFEditView3,
  ],
  imports: [
    IonicPageModule.forChild(demoDEMOLC_W10_MobWFEditView3),
    IBizSysModule,
    UserModule,
  ],
})
export class demoDEMOLC_W10_MobWFEditView3Module {}