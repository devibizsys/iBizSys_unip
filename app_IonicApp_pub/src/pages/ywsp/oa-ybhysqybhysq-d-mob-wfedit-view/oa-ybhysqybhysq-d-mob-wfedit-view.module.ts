import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YBHYSQYBHYSQ_D_MobWFEditView } from './oa-ybhysqybhysq-d-mob-wfedit-view';




@NgModule({
  declarations: [
    OA_YBHYSQYBHYSQ_D_MobWFEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YBHYSQYBHYSQ_D_MobWFEditView),
    IBizSysModule,
    UserModule,
  ],
})
export class OA_YBHYSQYBHYSQ_D_MobWFEditViewModule {}