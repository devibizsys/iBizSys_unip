import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CLMobPickupListView } from './oa-clmob-pickup-list-view';

@NgModule({
  declarations: [
    OA_CLMobPickupListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CLMobPickupListView),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OA_CLMobPickupListView,
  ]
})
export class OA_CLMobPickupListViewModule {}