import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_HYSMobPickupView } from './oa-hysmob-pickup-view';

import { OA_HYSMobPickupListViewModule } from '../../jcsj/oa-hysmob-pickup-list-view/oa-hysmob-pickup-list-view.module';



@NgModule({
  declarations: [
    OA_HYSMobPickupView,
  ],
  imports: [
    IonicPageModule.forChild(OA_HYSMobPickupView),
    IBizSysModule,
    UserModule,
    OA_HYSMobPickupListViewModule,
  ],
})
export class OA_HYSMobPickupViewModule {}