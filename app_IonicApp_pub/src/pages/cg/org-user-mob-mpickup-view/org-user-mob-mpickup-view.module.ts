import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OrgUserMobMPickupView } from './org-user-mob-mpickup-view';

import { OrgUserMobPickupMDViewModule } from '../../cg/org-user-mob-pickup-mdview/org-user-mob-pickup-mdview.module';



@NgModule({
  declarations: [
    OrgUserMobMPickupView,
  ],
  imports: [
    IonicPageModule.forChild(OrgUserMobMPickupView),
    IBizSysModule,
    UserModule,
    OrgUserMobPickupMDViewModule,
  ],
})
export class OrgUserMobMPickupViewModule {}