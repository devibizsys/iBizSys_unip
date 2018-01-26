import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_CHRYMobEditView } from './oa-chrymob-edit-view';




@NgModule({
  declarations: [
    OA_CHRYMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_CHRYMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_CHRYMobEditViewModule {}