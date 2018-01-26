import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CLWXCKMobEditView } from './oa-clwxckmob-edit-view';




@NgModule({
  declarations: [
    OA_CLWXCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CLWXCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CLWXCKMobEditViewModule {}