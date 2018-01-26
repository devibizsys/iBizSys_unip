import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZMobListView } from './oa-gzrzmob-list-view';




@NgModule({
  declarations: [
    OA_GZRZMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_GZRZMobListViewModule {}