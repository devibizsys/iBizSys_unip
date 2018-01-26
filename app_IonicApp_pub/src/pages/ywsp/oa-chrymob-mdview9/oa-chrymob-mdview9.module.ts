import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CHRYMobMDView9 } from './oa-chrymob-mdview9';

@NgModule({
  declarations: [
    OA_CHRYMobMDView9,
  ],
  imports: [
    IonicPageModule.forChild(OA_CHRYMobMDView9),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OA_CHRYMobMDView9,
  ]
})
export class OA_CHRYMobMDView9Module {}