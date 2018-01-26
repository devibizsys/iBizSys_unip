import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZMySenderMobMDView9 } from './oa-gzrzmy-sender-mob-mdview9';

@NgModule({
  declarations: [
    OA_GZRZMySenderMobMDView9,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZMySenderMobMDView9),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OA_GZRZMySenderMobMDView9,
  ]
})
export class OA_GZRZMySenderMobMDView9Module {}