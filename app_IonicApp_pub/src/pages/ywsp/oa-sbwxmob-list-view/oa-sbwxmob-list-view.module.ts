import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_SBWXMobListView } from './oa-sbwxmob-list-view';




@NgModule({
  declarations: [
    OA_SBWXMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_SBWXMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_SBWXMobListViewModule {}