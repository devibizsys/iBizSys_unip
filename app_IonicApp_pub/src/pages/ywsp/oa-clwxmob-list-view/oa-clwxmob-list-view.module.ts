import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CLWXMobListView } from './oa-clwxmob-list-view';




@NgModule({
  declarations: [
    OA_CLWXMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CLWXMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CLWXMobListViewModule {}