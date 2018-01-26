import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_STWMDGCKMobListView } from './oa-stwmdgckmob-list-view';




@NgModule({
  declarations: [
    OA_STWMDGCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_STWMDGCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_STWMDGCKMobListViewModule {}