import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { mywork } from './mywork';




@NgModule({
  declarations: [
    mywork,
  ],
  imports: [
    IonicPageModule.forChild(mywork),
    IBizSysModule,
    UserModule,
  ],
})
export class myworkModule {}