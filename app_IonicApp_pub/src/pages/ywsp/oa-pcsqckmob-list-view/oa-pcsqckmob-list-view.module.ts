import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_PCSQCKMobListView } from './oa-pcsqckmob-list-view';




@NgModule({
  declarations: [
    OA_PCSQCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_PCSQCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_PCSQCKMobListViewModule {}