import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZZSMobEditView } from './oa-gzrzzsmob-edit-view';




@NgModule({
  declarations: [
    OA_GZRZZSMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZZSMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_GZRZZSMobEditViewModule {}