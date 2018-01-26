import { Component, Input, Output, EventEmitter } from '@angular/core';
import { HttpProvider } from '../../../ibizsys/ts/providers/http';
import { GroupMenuPortlet } from './group-menu-portlet.service';
import { IBizViewController } from '../../ts/app/IBizViewController';
import { IBizUICounter } from '../../ts/entity/IBizUICounter';

@Component({
  selector: 'group-menu-portlet',
  templateUrl: 'group-menu-portlet.html'
})
export class GroupMenuPortletComponent extends IBizViewController {

  menu: GroupMenuPortlet;

  public imagePath: string = this.$IBizApp.imagePath;

  @Input()
  counter: IBizUICounter;
  @Input()
  name: string;
  @Input()
  url: string;
  @Output()
  menuClick: EventEmitter<any> = new EventEmitter();

  constructor(public http: HttpProvider) {
    super({});
    this.menu = new GroupMenuPortlet({ 'component': this });
  }

  ngOnInit(): void {
    this.menu.$url = this.url;
    this.menu.$name = this.name;
    this.menu.load();
  }

  menuTap(appFuncId: string) {
    this.menuClick.emit(appFuncId);
  }

  public isCounter(item: any): boolean {
    if(this.counter && item.counterid && this.counter.getData() && this.counter.getData()[item.counterid]) {
      return true;
    }
    return false;
  }
}
