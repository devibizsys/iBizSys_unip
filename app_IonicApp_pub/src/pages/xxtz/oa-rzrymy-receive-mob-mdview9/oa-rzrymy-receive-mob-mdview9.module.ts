import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_RZRYMyReceiveMobMDView9 } from './oa-rzrymy-receive-mob-mdview9';

@NgModule({
  declarations: [
    OA_RZRYMyReceiveMobMDView9,
  ],
  imports: [
    IonicPageModule.forChild(OA_RZRYMyReceiveMobMDView9),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OA_RZRYMyReceiveMobMDView9,
  ]
})
export class OA_RZRYMyReceiveMobMDView9Module {}