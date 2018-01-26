import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { worklog } from './worklog';




@NgModule({
  declarations: [
    worklog,
  ],
  imports: [
    IonicPageModule.forChild(worklog),
    IBizSysModule,
    UserModule,
  ],
})
export class worklogModule {}