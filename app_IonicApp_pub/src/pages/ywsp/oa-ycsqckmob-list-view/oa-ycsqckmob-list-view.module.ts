import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YCSQCKMobListView } from './oa-ycsqckmob-list-view';




@NgModule({
  declarations: [
    OA_YCSQCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YCSQCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YCSQCKMobListViewModule {}