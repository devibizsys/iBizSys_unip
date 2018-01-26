import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YYSSQCKMobListView } from './oa-yyssqckmob-list-view';




@NgModule({
  declarations: [
    OA_YYSSQCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YYSSQCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YYSSQCKMobListViewModule {}