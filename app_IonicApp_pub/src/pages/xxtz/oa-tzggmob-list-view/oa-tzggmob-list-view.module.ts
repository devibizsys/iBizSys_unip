import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_TZGGMobListView } from './oa-tzggmob-list-view';




@NgModule({
  declarations: [
    OA_TZGGMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_TZGGMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_TZGGMobListViewModule {}