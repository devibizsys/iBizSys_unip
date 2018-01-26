import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OrgUserMobPickupTreeView } from './org-user-mob-pickup-tree-view';

@NgModule({
  declarations: [
    OrgUserMobPickupTreeView,
  ],
  imports: [
    IonicPageModule.forChild(OrgUserMobPickupTreeView),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OrgUserMobPickupTreeView,
  ]
})
export class OrgUserMobPickupTreeViewModule {}