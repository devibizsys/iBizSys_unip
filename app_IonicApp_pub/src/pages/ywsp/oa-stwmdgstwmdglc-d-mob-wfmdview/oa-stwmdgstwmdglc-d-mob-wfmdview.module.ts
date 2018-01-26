import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_STWMDGSTWMDGLC_D_MobWFMDView } from './oa-stwmdgstwmdglc-d-mob-wfmdview';




@NgModule({
  declarations: [
    OA_STWMDGSTWMDGLC_D_MobWFMDView,
  ],
  imports: [
    IonicPageModule.forChild(OA_STWMDGSTWMDGLC_D_MobWFMDView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_STWMDGSTWMDGLC_D_MobWFMDViewModule {}