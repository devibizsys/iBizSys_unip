import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OrgUserMobPickupMDView } from './org-user-mob-pickup-mdview';

@NgModule({
  declarations: [
    OrgUserMobPickupMDView,
  ],
  imports: [
    IonicPageModule.forChild(OrgUserMobPickupMDView),
    IBizSysModule,
    UserModule,
  ],
  exports: [
    OrgUserMobPickupMDView,
  ]
})
export class OrgUserMobPickupMDViewModule {}