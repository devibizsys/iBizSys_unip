import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YBHYSQYBHYMobEditView } from './oa-ybhysqybhymob-edit-view';




@NgModule({
  declarations: [
    OA_YBHYSQYBHYMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YBHYSQYBHYMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YBHYSQYBHYMobEditViewModule {}