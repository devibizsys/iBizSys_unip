import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CCSQCKMobListView } from './oa-ccsqckmob-list-view';




@NgModule({
  declarations: [
    OA_CCSQCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CCSQCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CCSQCKMobListViewModule {}