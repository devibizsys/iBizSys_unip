import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_QXJCKMobListView } from './oa-qxjckmob-list-view';




@NgModule({
  declarations: [
    OA_QXJCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_QXJCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_QXJCKMobListViewModule {}