import { Component, Input, Output, EventEmitter } from '@angular/core';
import { HttpProvider } from '../../../ibizsys/ts/providers/http';
import { IBizViewController } from '../../ts/app/IBizViewController';
import { GridMenuPortletService } from './grid-menu-portlet.service';
import { IBizUICounter } from '../../ts/entity/IBizUICounter';

@Component({
  selector: 'grid-menu-portlet',
  templateUrl: 'grid-menu-portlet.html'
})
export class GridMenuPortletComponent extends IBizViewController {

  menu: GridMenuPortletService;

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
    this.menu = new GridMenuPortletService({ 'name': this.name, 'component': this, 'url': this.url });
  }

  ngOnInit(): void {
    this.menu.$url = this.url;
    this.menu.$name = this.name;
    this.menu.load();
  }

  menuTap(appFuncId: string) {
    this.menuClick.emit(appFuncId);
  }
}
