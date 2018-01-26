import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_NSJGHYSQMobListView } from './oa-nsjghysqmob-list-view';




@NgModule({
  declarations: [
    OA_NSJGHYSQMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_NSJGHYSQMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_NSJGHYSQMobListViewModule {}