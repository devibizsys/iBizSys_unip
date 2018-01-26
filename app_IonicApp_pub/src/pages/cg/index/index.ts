import { Component } from '@angular/core';
import { HttpProvider } from '../../../ibizsys/ts/providers/http';
import { IBizStaticVariablesProvider } from '../../../ibizsys/ts/providers/ibiz-static-variables';
import { LoginPage } from '../../../ibizsys/pages/login/login';
import { IBizViewController } from '../../../ibizsys/ts/app/IBizViewController';
import { IBizUICounter } from '../../../ibizsys/ts/entity/IBizUICounter';

@Component({
  templateUrl: 'index.html'
})
export class index extends IBizViewController {

  tabmenuitem3 = 'mywork';
  tabmenuitem4 = 'sp';
  tabmenuitem5 = 'worklog';

  constructor(http: HttpProvider, staticVal: IBizStaticVariablesProvider) {
    super({'http': http, 'url': '/IonicApp/cg/index.do', 'staticVal': staticVal});
  }

  regUICounters() : void {
    this.regUICounter(new IBizUICounter({'viewCtrl': this, 'name': 'Portal', 'counterId': '2cfc5bba445f0d9908920a83e87ab1c9', 'tag': '956f2c99da31bb9d03e1160e9a90b130', 'counterParam': {}, 'timer': '60000'}));
  }

}