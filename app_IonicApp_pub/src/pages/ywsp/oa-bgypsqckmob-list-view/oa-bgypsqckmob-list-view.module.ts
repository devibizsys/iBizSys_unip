import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_BGYPSQCKMobListView } from './oa-bgypsqckmob-list-view';




@NgModule({
  declarations: [
    OA_BGYPSQCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_BGYPSQCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_BGYPSQCKMobListViewModule {}