import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_JPYDJPYDLC_D_MobWFEditView3 } from './oa-jpydjpydlc-d-mob-wfedit-view3';




@NgModule({
  declarations: [
    OA_JPYDJPYDLC_D_MobWFEditView3,
  ],
  imports: [
    IonicPageModule.forChild(OA_JPYDJPYDLC_D_MobWFEditView3),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_JPYDJPYDLC_D_MobWFEditView3Module {}