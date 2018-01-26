import { IBizPickupListViewController } from '../../../ibizsys/ts/app/IBizPickupListViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	mdctrlService,
 } from './oa-hysmob-pickup-list-view.service';

export class OA_HYSMobPickupListViewBase extends IBizPickupListViewController {

    mdctrl: mdctrlService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/jcsj/OA_HYSMobPickupListView.do' }));
  }

  ngOnInit(): void {
    this.mdctrl = new mdctrlService({ 'name': 'mdctrl', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('mdctrl', this.mdctrl);
    super.ngOnInit();
  }

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}