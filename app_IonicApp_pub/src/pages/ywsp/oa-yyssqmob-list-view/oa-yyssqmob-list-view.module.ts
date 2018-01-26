import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YYSSQMobListView } from './oa-yyssqmob-list-view';




@NgModule({
  declarations: [
    OA_YYSSQMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YYSSQMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YYSSQMobListViewModule {}