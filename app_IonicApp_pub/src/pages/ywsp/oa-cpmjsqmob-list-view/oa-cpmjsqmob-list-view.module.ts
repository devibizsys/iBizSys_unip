import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CPMJSQMobListView } from './oa-cpmjsqmob-list-view';




@NgModule({
  declarations: [
    OA_CPMJSQMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CPMJSQMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CPMJSQMobListViewModule {}