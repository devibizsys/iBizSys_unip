import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CGSQMobEditView } from './oa-cgsqmob-edit-view';




@NgModule({
  declarations: [
    OA_CGSQMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CGSQMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CGSQMobEditViewModule {}