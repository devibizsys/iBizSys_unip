import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_BGYPSQMobListView } from './oa-bgypsqmob-list-view';




@NgModule({
  declarations: [
    OA_BGYPSQMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_BGYPSQMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_BGYPSQMobListViewModule {}