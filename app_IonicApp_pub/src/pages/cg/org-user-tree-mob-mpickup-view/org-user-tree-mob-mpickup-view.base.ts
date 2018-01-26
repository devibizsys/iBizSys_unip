import { IBizMPickupViewController } from '../../../ibizsys/ts/app/IBizMPickupViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	pickupviewpanelService,
 } from './org-user-tree-mob-mpickup-view.service';

export class OrgUserTreeMobMPickupViewBase extends IBizMPickupViewController {

    pickupviewpanel: pickupviewpanelService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/cg/OrgUserTreeMobMPickupView.do' }));
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