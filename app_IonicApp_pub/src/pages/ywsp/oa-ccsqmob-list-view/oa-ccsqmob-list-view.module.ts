import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CCSQMobListView } from './oa-ccsqmob-list-view';




@NgModule({
  declarations: [
    OA_CCSQMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CCSQMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CCSQMobListViewModule {}