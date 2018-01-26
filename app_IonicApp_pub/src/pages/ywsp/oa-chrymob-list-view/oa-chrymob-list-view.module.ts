import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CHRYMobListView } from './oa-chrymob-list-view';




@NgModule({
  declarations: [
    OA_CHRYMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CHRYMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CHRYMobListViewModule {}