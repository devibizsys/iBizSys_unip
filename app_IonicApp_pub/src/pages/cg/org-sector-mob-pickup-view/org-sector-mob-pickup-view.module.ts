import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OrgSectorMobPickupView } from './org-sector-mob-pickup-view';

import { OrgSectorMobPickupListViewModule } from '../../cg/org-sector-mob-pickup-list-view/org-sector-mob-pickup-list-view.module';



@NgModule({
  declarations: [
    OrgSectorMobPickupView,
  ],
  imports: [
    IonicPageModule.forChild(OrgSectorMobPickupView),
    IBizSysModule,
    UserModule,
    OrgSectorMobPickupListViewModule,
  ],
})
export class OrgSectorMobPickupViewModule {}