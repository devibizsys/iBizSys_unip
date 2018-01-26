import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YYSSQMobEditView } from './oa-yyssqmob-edit-view';




@NgModule({
  declarations: [
    OA_YYSSQMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YYSSQMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YYSSQMobEditViewModule {}