import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { sp } from './sp';




@NgModule({
  declarations: [
    sp,
  ],
  imports: [
    IonicPageModule.forChild(sp),
    IBizSysModule,
    UserModule,
  ],
})
export class spModule {}