import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_ZSKMobEditView } from './oa-zskmob-edit-view';




@NgModule({
  declarations: [
    OA_ZSKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_ZSKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_ZSKMobEditViewModule {}