import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_STWMDGCKMobEditView } from './oa-stwmdgckmob-edit-view';




@NgModule({
  declarations: [
    OA_STWMDGCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_STWMDGCKMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_STWMDGCKMobEditViewModule {}