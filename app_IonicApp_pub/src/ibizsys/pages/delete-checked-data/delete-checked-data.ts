import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ModalController, LoadingController, ToastController, AlertController, ActionSheetController } from 'ionic-angular';
import { IBizListViewController } from '../../ts/app/IBizListViewController';
import { HttpProvider } from '../../ts/providers/http';
import { IBizStaticVariablesProvider } from '../../ts/providers/ibiz-static-variables';

@IonicPage({
  priority: 'off'
})
@Component({
  selector: 'page-delete-checked-data',
  templateUrl: 'delete-checked-data.html',
})
export class DeleteCheckedDataPage extends IBizListViewController {
  public items: any[] = [];
  private deleteItems: any[] = [];

  constructor(private navCtrl: NavController,
    private navParams: NavParams,
    private modalCtrl: ModalController,
    private http: HttpProvider,
    private loadingCtrl: LoadingController,
    private toastCtrl: ToastController,
    private alertCtrl: AlertController,
    private actionSheetCtrl: ActionSheetController,
    private staticVal: IBizStaticVariablesProvider) {
    super({
      'modalCtrl': modalCtrl,
      'actionSheetCtrl': actionSheetCtrl,
      'loadingCtrl': loadingCtrl,
      'toastCtrl': toastCtrl,
      'alertCtrl': alertCtrl,
      'staticVal': staticVal,
      'navCtrl': navCtrl,
      'navParams': navParams,
      'http': http,
    });
  }

  ngOnInit(): void {
    super.ngOnInit();
    let viewParam: any = this.getViewParam();
    if (viewParam.values) {
      this.items = viewParam.values;
    }
  }

  deleteItem(item: any, index: number): void {
    if (Object.is(item.srfkey, this.items[index].srfkey)) {
      this.items.splice(index, 1);
      this.deleteItems.push(item);
    }
    this.setResult({ 'values': this.items, 'deleteValues': this.deleteItems });
  }

}
