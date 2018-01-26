import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZMyReceiveMobMDView9 } from './oa-gzrzmy-receive-mob-mdview9';

@NgModule({
  declarations: [
    OA_GZRZMyReceiveMobMDView9,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZMyReceiveMobMDView9),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OA_GZRZMyReceiveMobMDView9,
  ]
})
export class OA_GZRZMyReceiveMobMDView9Module {}