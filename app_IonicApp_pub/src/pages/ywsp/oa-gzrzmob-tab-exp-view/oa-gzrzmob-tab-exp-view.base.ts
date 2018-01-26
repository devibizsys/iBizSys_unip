import { ViewChild } from '@angular/core';
import { IBizTabExpViewController } from '../../../ibizsys/ts/app/IBizTabExpViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';
import { IBizTabService } from '../../../ibizsys/ts/widget/IBizTabService';

import {
 } from './oa-gzrzmob-tab-exp-view.service';

export class OA_GZRZMobTabExpViewBase extends IBizTabExpViewController {

  tab: IBizTabService;
	sement: string = 'tab0';
	@ViewChild('tab0') tab0;
	@ViewChild('tab1') tab1;


    constructor(opt) {
        super(Object.assign(opt, { 'url': '/IonicApp/ywsp/OA_GZRZMobTabExpView.do' }));
    this.tab = new IBizTabService({ 'component': this });
    this.regControl('tab', this.tab);	
    setTimeout(() => {
      this.tab.setActiveTabView(this.tab0);
    },1);
  }
  
  segmentChanged(event) {
    let name = event.value;
    setTimeout(() => {
      if (Object.is(name, 'tab0')) {
        this.tab.setActiveTabView(this.tab0);
      }
      if (Object.is(name, 'tab1')) {
        this.tab.setActiveTabView(this.tab1);
      }
      this.tab.tabChange();
    }, 1);
  }

  regAppFuncs(): void {
    super.regAppFuncs();
  }

  regUICounters() : void {
  }
}