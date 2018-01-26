import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, LoadingController, ToastController, ModalController, AlertController, ActionSheetController  } from 'ionic-angular';
import { Storage } from '@ionic/storage';
import { HttpProvider } from '../../../ibizsys/ts/providers/http';
import { IBizStaticVariablesProvider } from '../../../ibizsys/ts/providers/ibiz-static-variables';
import { OA_JPYDMobListViewBase } from './oa-jpydmob-list-view.base';

@IonicPage({
  priority: 'off'
})
@Component({
  selector: 'oa-jpydmob-list-view',
  templateUrl: 'oa-jpydmob-list-view.html',
})

export class OA_JPYDMobListView extends OA_JPYDMobListViewBase {

  constructor(private navCtrl: NavController,
    private navParams: NavParams,
    private modalCtrl: ModalController,
    private storage: Storage,
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
      'storage': storage,
    });
  }

}