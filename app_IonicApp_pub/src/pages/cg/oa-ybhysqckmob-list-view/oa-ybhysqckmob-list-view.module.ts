import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YBHYSQCKMobListView } from './oa-ybhysqckmob-list-view';




@NgModule({
  declarations: [
    OA_YBHYSQCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YBHYSQCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YBHYSQCKMobListViewModule {}