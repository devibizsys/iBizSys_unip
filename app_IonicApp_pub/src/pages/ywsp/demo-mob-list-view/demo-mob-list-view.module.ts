import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { demoMobListView } from './demo-mob-list-view';




@NgModule({
  declarations: [
    demoMobListView,
  ],
  imports: [
    IonicPageModule.forChild(demoMobListView),
    IBizSysModule,
    UserModule,
  ],
})
export class demoMobListViewModule {}