import { IBizPickupViewController } from '../../../ibizsys/ts/app/IBizPickupViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	pickupviewpanelService,
 } from './oa-clmob-pickup-view.service';

export class OA_CLMobPickupViewBase extends IBizPickupViewController {

    pickupviewpanel: pickupviewpanelService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/jcsj/OA_CLMobPickupView.do' }));
  }

  ngOnInit(): void {
    this.pickupviewpanel = new pickupviewpanelService({ 'name': 'pickupviewpanel', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('pickupviewpanel', this.pickupviewpanel);
    super.ngOnInit();
  }

  regUIActions(config){
    }

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}