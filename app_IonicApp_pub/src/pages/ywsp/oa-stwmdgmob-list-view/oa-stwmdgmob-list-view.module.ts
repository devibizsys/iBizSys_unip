import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_STWMDGMobListView } from './oa-stwmdgmob-list-view';




@NgModule({
  declarations: [
    OA_STWMDGMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_STWMDGMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_STWMDGMobListViewModule {}