import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZCKMobListView } from './oa-gzrzckmob-list-view';




@NgModule({
  declarations: [
    OA_GZRZCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_GZRZCKMobListViewModule {}