import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_TZGGRYMobEditView } from './oa-tzggrymob-edit-view';




@NgModule({
  declarations: [
    OA_TZGGRYMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_TZGGRYMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_TZGGRYMobEditViewModule {}