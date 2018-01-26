import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OrgUserTreeMobMPickupView } from './org-user-tree-mob-mpickup-view';

import { OrgUserMobPickupTreeViewModule } from '../../cg/org-user-mob-pickup-tree-view/org-user-mob-pickup-tree-view.module';



@NgModule({
  declarations: [
    OrgUserTreeMobMPickupView,
  ],
  imports: [
    IonicPageModule.forChild(OrgUserTreeMobMPickupView),
    IBizSysModule,
    UserModule,
    OrgUserMobPickupTreeViewModule,
  ],
})
export class OrgUserTreeMobMPickupViewModule {}