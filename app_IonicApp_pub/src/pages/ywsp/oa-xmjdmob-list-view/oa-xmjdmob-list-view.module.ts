import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_XMJDMobListView } from './oa-xmjdmob-list-view';




@NgModule({
  declarations: [
    OA_XMJDMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_XMJDMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_XMJDMobListViewModule {}