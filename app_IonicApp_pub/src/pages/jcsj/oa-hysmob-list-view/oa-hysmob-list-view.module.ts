import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_HYSMobListView } from './oa-hysmob-list-view';




@NgModule({
  declarations: [
    OA_HYSMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_HYSMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_HYSMobListViewModule {}