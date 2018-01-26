import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CLMobPickupView } from './oa-clmob-pickup-view';

import { OA_CLMobPickupListViewModule } from '../../jcsj/oa-clmob-pickup-list-view/oa-clmob-pickup-list-view.module';



@NgModule({
  declarations: [
    OA_CLMobPickupView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CLMobPickupView),
    IBizSysModule,
    UserModule,
    OA_CLMobPickupListViewModule,
  ],
})
export class OA_CLMobPickupViewModule {}