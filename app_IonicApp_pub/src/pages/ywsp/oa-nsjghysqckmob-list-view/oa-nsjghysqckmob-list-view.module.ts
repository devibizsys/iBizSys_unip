import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_NSJGHYSQCKMobListView } from './oa-nsjghysqckmob-list-view';




@NgModule({
  declarations: [
    OA_NSJGHYSQCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_NSJGHYSQCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_NSJGHYSQCKMobListViewModule {}