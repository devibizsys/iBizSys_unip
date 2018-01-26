import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CPMJSQCKMobListView } from './oa-cpmjsqckmob-list-view';




@NgModule({
  declarations: [
    OA_CPMJSQCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CPMJSQCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CPMJSQCKMobListViewModule {}