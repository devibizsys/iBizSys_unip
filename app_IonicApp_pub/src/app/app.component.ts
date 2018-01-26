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
    this.srfkey = this.getQueryString('srfkey');
    if(this.srfkey){
      window['srfkey'] = this.srfkey;
    }
    this.srfloginkey = this.getQueryString('srfloginkey');
    if(this.srfloginkey) {
      window.localStorage.setItem('srfloginkey', this.srfloginkey);
    } else {
      this.srfloginkey = this.getQueryString('wechatloginkey');
      if(this.srfloginkey) {
        window.localStorage.setItem('srfloginkey', this.srfloginkey);
      }
    }
    this.className = this.getQueryString('srfclassname');
    if (this.className) {
      this.rootPage = this.className;
    } else {
      this.srfdeid = this.getQueryString('srfdeid');
      this.userinfo = this.getQueryString('userinfo');
      if (this.srfkey && this.srfdeid) {
        this.redirect({ 'srfkey': this.srfkey, 'srfdeid': this.srfdeid });
      } else {
        let srfloginkey = window.localStorage.getItem('srfloginkey');
        if(window['appBridge']) {
          srfloginkey = window['appBridge'].getAccessToken();
          window.localStorage.setItem('srfloginkey', srfloginkey);
        }
        if(!srfloginkey){
          let modal = this.modalCtrl.create(LoginPage);
          modal.onDidDismiss( res => {
            this.rootPage = index;
          });
          modal.present();
        } else {
          this.rootPage = index;
        }
      }
    }
  }

  private getQueryString(name: string): string {
    let reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    let r = window.location.search.substr(1).match(reg);
    if (r != null) {
      return decodeURI(r[2]);
    }
    return null;
  }

  public redirect(params: any): void {
    let viewParam: any = {};
    viewParam.srfviewparam = JSON.stringify(params);
    Object.assign(viewParam, { 'srfaction': 'GETRDVIEW', 'srfloginkey': this.srfloginkey, 'userinfo': this.userinfo });
    this.mask();
    this.http.post('/IonicApp/WFDataRedirectView.do', viewParam)
      .subscribe(response => {
        this.unmask();
        if (!response.rdview || response.ret != 0) {
          if (response.errorMessage) {
            alert(this.message);
          }
          return;
        }
        if (response.rdview && response.rdview.className && response.ret == 0) {
          if (response.rdview.srfkey) {
            params.srfkey = response.rdview.srfkey;
          }
          let viewClass = response.rdview.className;
          if(viewClass) {
            this.rootPage = viewClass;
            window['AloneWebView'] = true;
          }
        } else {
          alert(this.message);
        }
      },
      error => {
        this.unmask();
        alert(this.message);
      });
  }

  private mask(): void {
    if (!this.loadingCtrl) {
      return;
    }
    this.loading = this.loadingCtrl.create({
      content: '页面加载中',
      dismissOnPageChange: false //页面变化的时候关闭提示
    });
    this.loading.present();
  }

  private unmask(): void {
    if (this.loading) {
      this.loading.dismiss();
    }
  }

}