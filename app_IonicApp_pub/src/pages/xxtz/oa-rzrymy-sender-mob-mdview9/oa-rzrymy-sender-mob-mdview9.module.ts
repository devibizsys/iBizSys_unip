import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_RZRYMySenderMobMDView9 } from './oa-rzrymy-sender-mob-mdview9';

@NgModule({
  declarations: [
    OA_RZRYMySenderMobMDView9,
  ],
  imports: [
    IonicPageModule.forChild(OA_RZRYMySenderMobMDView9),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OA_RZRYMySenderMobMDView9,
  ]
})
export class OA_RZRYMySenderMobMDView9Module {}