import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_HYSMobPickupListView } from './oa-hysmob-pickup-list-view';

@NgModule({
  declarations: [
    OA_HYSMobPickupListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_HYSMobPickupListView),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OA_HYSMobPickupListView,
  ]
})
export class OA_HYSMobPickupListViewModule {}