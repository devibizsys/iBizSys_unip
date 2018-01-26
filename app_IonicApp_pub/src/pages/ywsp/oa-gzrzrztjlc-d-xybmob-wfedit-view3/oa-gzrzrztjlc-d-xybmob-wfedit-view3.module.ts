import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZRZTJLC_D_XYBMobWFEditView3 } from './oa-gzrzrztjlc-d-xybmob-wfedit-view3';




@NgModule({
  declarations: [
    OA_GZRZRZTJLC_D_XYBMobWFEditView3,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZRZTJLC_D_XYBMobWFEditView3),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_GZRZRZTJLC_D_XYBMobWFEditView3Module {}