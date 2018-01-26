import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CGSQCKMobListView } from './oa-cgsqckmob-list-view';




@NgModule({
  declarations: [
    OA_CGSQCKMobListView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CGSQCKMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CGSQCKMobListViewModule {}