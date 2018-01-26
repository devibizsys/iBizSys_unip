import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CHRYCKCHRYMobEditView } from './oa-chryckchrymob-edit-view';




@NgModule({
  declarations: [
    OA_CHRYCKCHRYMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CHRYCKCHRYMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CHRYCKCHRYMobEditViewModule {}