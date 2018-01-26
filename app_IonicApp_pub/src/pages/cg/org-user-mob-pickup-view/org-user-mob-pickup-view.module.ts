import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OrgUserMobPickupView } from './org-user-mob-pickup-view';

import { OrgUserMobPickupListViewModule } from '../../cg/org-user-mob-pickup-list-view/org-user-mob-pickup-list-view.module';



@NgModule({
  declarations: [
    OrgUserMobPickupView,
  ],
  imports: [
    IonicPageModule.forChild(OrgUserMobPickupView),
    IBizSysModule,
    UserModule,
    OrgUserMobPickupListViewModule,
  ],
})
export class OrgUserMobPickupViewModule {}