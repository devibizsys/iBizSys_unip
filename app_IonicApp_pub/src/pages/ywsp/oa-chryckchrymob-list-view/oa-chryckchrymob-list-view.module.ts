import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CHRYCKCHRYMobListView } from './oa-chryckchrymob-list-view';




@NgModule({
  declarations: [
    OA_CHRYCKCHRYMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CHRYCKCHRYMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CHRYCKCHRYMobListViewModule {}