import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_ZSKMobListView } from './oa-zskmob-list-view';




@NgModule({
  declarations: [
    OA_ZSKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_ZSKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_ZSKMobListViewModule {}