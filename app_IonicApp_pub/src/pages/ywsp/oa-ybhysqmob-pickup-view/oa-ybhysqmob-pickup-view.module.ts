import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YBHYSQMobPickupView } from './oa-ybhysqmob-pickup-view';

import { OA_YBHYSQMobPickupListViewModule } from '../../ywsp/oa-ybhysqmob-pickup-list-view/oa-ybhysqmob-pickup-list-view.module';



@NgModule({
  declarations: [
    OA_YBHYSQMobPickupView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YBHYSQMobPickupView),
    IBizSysModule,
    UserModule,
    OA_YBHYSQMobPickupListViewModule,
  ],
})
export class OA_YBHYSQMobPickupViewModule {}