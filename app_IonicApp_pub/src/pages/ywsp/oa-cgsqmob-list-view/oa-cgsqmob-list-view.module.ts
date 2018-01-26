import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CGSQMobListView } from './oa-cgsqmob-list-view';




@NgModule({
  declarations: [
    OA_CGSQMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CGSQMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CGSQMobListViewModule {}