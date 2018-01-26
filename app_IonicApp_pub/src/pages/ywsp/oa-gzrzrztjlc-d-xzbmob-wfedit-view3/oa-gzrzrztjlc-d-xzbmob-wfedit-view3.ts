import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, LoadingController, ToastController, ModalController, AlertController, ActionSheetController  } from 'ionic-angular';
import { Storage } from '@ionic/storage';
import { HttpProvider } from '../../../ibizsys/ts/providers/http';
import { IBizStaticVariablesProvider } from '../../../ibizsys/ts/providers/ibiz-static-variables';
import { OA_GZRZRZTJLC_D_XZBMobWFEditView3Base } from './oa-gzrzrztjlc-d-xzbmob-wfedit-view3.base';

@IonicPage({
  priority: 'off'
})
@Component({
  selector: 'oa-gzrzrztjlc-d-xzbmob-wfedit-view3',
  templateUrl: 'oa-gzrzrztjlc-d-xzbmob-wfedit-view3.html',
})

export class OA_GZRZRZTJLC_D_XZBMobWFEditView3 extends OA_GZRZRZTJLC_D_XZBMobWFEditView3Base {

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