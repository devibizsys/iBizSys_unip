import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_SBWXCKMobListView } from './oa-sbwxckmob-list-view';




@NgModule({
  declarations: [
    OA_SBWXCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_SBWXCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_SBWXCKMobListViewModule {}