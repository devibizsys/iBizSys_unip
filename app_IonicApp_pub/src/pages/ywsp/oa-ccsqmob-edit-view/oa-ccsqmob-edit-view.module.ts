import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CCSQMobEditView } from './oa-ccsqmob-edit-view';




@NgModule({
  declarations: [
    OA_CCSQMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CCSQMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CCSQMobEditViewModule {}