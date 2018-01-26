import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_JPYDMobListView } from './oa-jpydmob-list-view';




@NgModule({
  declarations: [
    OA_JPYDMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_JPYDMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_JPYDMobListViewModule {}