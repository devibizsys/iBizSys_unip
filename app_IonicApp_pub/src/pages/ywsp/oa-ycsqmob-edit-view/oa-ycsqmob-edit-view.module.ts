import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YCSQMobEditView } from './oa-ycsqmob-edit-view';




@NgModule({
  declarations: [
    OA_YCSQMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YCSQMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YCSQMobEditViewModule {}