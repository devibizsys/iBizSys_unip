import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YCSQYCSQLC_D_MobWFEditView3 } from './oa-ycsqycsqlc-d-mob-wfedit-view3';




@NgModule({
  declarations: [
    OA_YCSQYCSQLC_D_MobWFEditView3,
  ],
  imports: [
    IonicPageModule.forChild(OA_YCSQYCSQLC_D_MobWFEditView3),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YCSQYCSQLC_D_MobWFEditView3Module {}