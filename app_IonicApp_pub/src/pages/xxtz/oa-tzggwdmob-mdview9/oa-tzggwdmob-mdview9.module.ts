import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_TZGGWDMobMDView9 } from './oa-tzggwdmob-mdview9';

@NgModule({
  declarations: [
    OA_TZGGWDMobMDView9,
  ],
  imports: [
    IonicPageModule.forChild(OA_TZGGWDMobMDView9),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OA_TZGGWDMobMDView9,
  ]
})
export class OA_TZGGWDMobMDView9Module {}