import { Component } from '@angular/core';
import { Platform, Loading, LoadingController, ModalController } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { HttpProvider } from '../ibizsys/ts/providers/http';
import { IBizAppProvider } from '../ibizsys/ts/providers/ibiz-app';
import { LoginPage } from '../ibizsys/pages/login/login';
import { index } from '../pages/cg/index/index';

@Component({
  template: `<ion-nav [root]="rootPage"></ion-nav>`
})
export class MyApp {
  private loading: Loading;
  private srfkey: string;
  private srfdeid: string;
  private srfloginkey: string;
  private userinfo: string;
  private className: string;
  private message: string = '您点击的工作不存在或已完成';

  rootPage: any;

  constructor(platform: Platform,
    statusBar: StatusBar,
    splashScreen: SplashScreen,
    public http: HttpProvider,
    private modalCtrl: ModalController,
    public loadingCtrl: LoadingController) {

    this.init();
    platform.ready().then(() => {
      statusBar.styleDefault();
      splashScreen.hide();
    });
  }

  public init(): void {
    window['$IBizApp'] = new IBizAppProvider(this.http);

    this.http.post("/api/login", { "username": 'ibzadmin', "password": '123456' })
      .subscribe(response => {
          window.localStorage.setItem("srfloginkey", response.data.loginkey);
        });

    this.rootPage = index;
  }
}