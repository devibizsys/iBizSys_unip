import { IBizPickupTreeViewController } from '../../../ibizsys/ts/app/IBizPickupTreeViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

import {
	treeService,
 } from './org-user-mob-pickup-tree-view.service';

export class OrgUserMobPickupTreeViewBase extends IBizPickupTreeViewController {

    tree: treeService;

  constructor(opt) {
    super(Object.assign(opt, { 'url': '/IonicApp/cg/OrgUserMobPickupTreeView.do' }));
  }

  ngOnInit(): void {
    this.tree = new treeService({ 'name': 'tree', 'component': this, 'url': this.getBackendUrl() });
    this.regControl('tree', this.tree);
    super.ngOnInit();
  }

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}