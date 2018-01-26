import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_RZRYCKMobListView } from './oa-rzryckmob-list-view';




@NgModule({
  declarations: [
    OA_RZRYCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_RZRYCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_RZRYCKMobListViewModule {}