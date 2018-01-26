import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_TZGGCKMobListView } from './oa-tzggckmob-list-view';




@NgModule({
  declarations: [
    OA_TZGGCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_TZGGCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_TZGGCKMobListViewModule {}