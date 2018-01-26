import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { demoMobEditView } from './demo-mob-edit-view';




@NgModule({
  declarations: [
    demoMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(demoMobEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class demoMobEditViewModule {}