import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OrgUserMobPickupListView } from './org-user-mob-pickup-list-view';

@NgModule({
  declarations: [
    OrgUserMobPickupListView,
  ],
  imports: [
    IonicPageModule.forChild(OrgUserMobPickupListView),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OrgUserMobPickupListView,
  ]
})
export class OrgUserMobPickupListViewModule {}