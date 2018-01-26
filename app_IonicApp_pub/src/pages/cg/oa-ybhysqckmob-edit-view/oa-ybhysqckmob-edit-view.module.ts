import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { IBizSysModule } from '../../../ibizsys/ibizsys.module';
import { UserModule } from '../../user.module';
import { OA_YBHYSQCKMobEditView } from './oa-ybhysqckmob-edit-view';



import { WFStepDataMobMDView9Module } from '../../ywsp/wfstep-data-mob-mdview9/wfstep-data-mob-mdview9.module';
import { OA_CHRYMobMDView9Module } from '../../ywsp/oa-chrymob-mdview9/oa-chrymob-mdview9.module';

@NgModule({
  declarations: [
    OA_YBHYSQCKMobEditView,
  ],
  imports: [
    IonicPageModule.forChild(OA_YBHYSQCKMobEditView),
    IBizSysModule,
    UserModule,
    WFStepDataMobMDView9Module,
    OA_CHRYMobMDView9Module,
  ],
})
export class OA_YBHYSQCKMobEditViewModule {}