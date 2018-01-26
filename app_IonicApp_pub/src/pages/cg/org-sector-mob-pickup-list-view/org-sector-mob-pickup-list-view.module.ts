import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OrgSectorMobPickupListView } from './org-sector-mob-pickup-list-view';

@NgModule({
  declarations: [
    OrgSectorMobPickupListView,
  ],
  imports: [
    IonicPageModule.forChild(OrgSectorMobPickupListView),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OrgSectorMobPickupListView,
  ]
})
export class OrgSectorMobPickupListViewModule {}