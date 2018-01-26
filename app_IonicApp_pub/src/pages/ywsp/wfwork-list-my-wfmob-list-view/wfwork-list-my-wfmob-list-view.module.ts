import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { WFWorkListMyWFMobListView } from './wfwork-list-my-wfmob-list-view';




@NgModule({
  declarations: [
    WFWorkListMyWFMobListView,
  ],
  imports: [
    IonicPageModule.forChild(WFWorkListMyWFMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class WFWorkListMyWFMobListViewModule {}