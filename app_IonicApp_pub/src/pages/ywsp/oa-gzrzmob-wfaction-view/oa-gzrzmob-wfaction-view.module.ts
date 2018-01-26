import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZMobWFActionView } from './oa-gzrzmob-wfaction-view';




@NgModule({
  declarations: [
    OA_GZRZMobWFActionView,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZMobWFActionView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_GZRZMobWFActionViewModule {}