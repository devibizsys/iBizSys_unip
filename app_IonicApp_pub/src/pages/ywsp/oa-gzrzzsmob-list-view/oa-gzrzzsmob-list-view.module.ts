import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_GZRZZSMobListView } from './oa-gzrzzsmob-list-view';




@NgModule({
  declarations: [
    OA_GZRZZSMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_GZRZZSMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_GZRZZSMobListViewModule {}