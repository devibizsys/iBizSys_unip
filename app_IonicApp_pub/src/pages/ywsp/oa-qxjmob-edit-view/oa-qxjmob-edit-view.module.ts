import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_QXJMobEditView } from './oa-qxjmob-edit-view';




@NgModule({
  declarations: [
    OA_QXJMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_QXJMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_QXJMobEditViewModule {}