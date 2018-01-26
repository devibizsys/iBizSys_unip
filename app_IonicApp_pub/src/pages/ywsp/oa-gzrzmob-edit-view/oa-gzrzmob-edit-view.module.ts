import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZMobEditView } from './oa-gzrzmob-edit-view';




@NgModule({
  declarations: [
    OA_GZRZMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_GZRZMobEditViewModule {}