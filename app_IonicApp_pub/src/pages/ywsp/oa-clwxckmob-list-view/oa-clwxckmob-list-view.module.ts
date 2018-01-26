import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CLWXCKMobListView } from './oa-clwxckmob-list-view';




@NgModule({
  declarations: [
    OA_CLWXCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CLWXCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CLWXCKMobListViewModule {}