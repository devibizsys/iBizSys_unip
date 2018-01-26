import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CLWXMobEditView } from './oa-clwxmob-edit-view';




@NgModule({
  declarations: [
    OA_CLWXMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CLWXMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CLWXMobEditViewModule {}