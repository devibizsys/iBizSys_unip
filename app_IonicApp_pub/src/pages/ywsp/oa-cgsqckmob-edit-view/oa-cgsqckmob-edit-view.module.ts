import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CGSQCKMobEditView } from './oa-cgsqckmob-edit-view';




@NgModule({
  declarations: [
    OA_CGSQCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CGSQCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CGSQCKMobEditViewModule {}