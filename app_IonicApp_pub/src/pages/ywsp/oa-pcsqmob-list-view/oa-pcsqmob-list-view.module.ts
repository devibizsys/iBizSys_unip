import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_PCSQMobListView } from './oa-pcsqmob-list-view';




@NgModule({
  declarations: [
    OA_PCSQMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_PCSQMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_PCSQMobListViewModule {}