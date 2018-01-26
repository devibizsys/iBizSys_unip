import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YBHYSQMobPickupListView } from './oa-ybhysqmob-pickup-list-view';

@NgModule({
  declarations: [
    OA_YBHYSQMobPickupListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YBHYSQMobPickupListView),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OA_YBHYSQMobPickupListView,
  ]
})
export class OA_YBHYSQMobPickupListViewModule {}