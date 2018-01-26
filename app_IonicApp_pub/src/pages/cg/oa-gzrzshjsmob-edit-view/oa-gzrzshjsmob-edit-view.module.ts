import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZSHJSMobEditView } from './oa-gzrzshjsmob-edit-view';




@NgModule({
  declarations: [
    OA_GZRZSHJSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZSHJSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_GZRZSHJSMobEditViewModule {}