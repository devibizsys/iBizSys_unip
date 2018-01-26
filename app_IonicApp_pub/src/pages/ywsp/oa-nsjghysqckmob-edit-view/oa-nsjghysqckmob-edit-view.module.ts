import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_NSJGHYSQCKMobEditView } from './oa-nsjghysqckmob-edit-view';




@NgModule({
  declarations: [
    OA_NSJGHYSQCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_NSJGHYSQCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_NSJGHYSQCKMobEditViewModule {}