import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_NSJGHYSQMobEditView } from './oa-nsjghysqmob-edit-view';




@NgModule({
  declarations: [
    OA_NSJGHYSQMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_NSJGHYSQMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_NSJGHYSQMobEditViewModule {}