import { Component } from '@angular/core';
import { NavController, NavParams, LoadingController, ToastController } from 'ionic-angular';
import { HttpProvider } from '../../ts/providers/http';
import { IBizStaticVariablesProvider } from '../../ts/providers/ibiz-static-variables';
import { IBizFormService } from '../../ts/widget/IBizFormService';
import { IBizMainViewController } from '../../ts/app/IBizMainViewController';
import { Storage } from '@ionic/storage';

@Component({
  selector: 'page-login',
  templateUrl: 'login.html',
})
export class LoginPage extends IBizMainViewController {
  username: string = 'ibzadmin';
  password: string = '123456';
  formService: IBizFormService;

  constructor(public navCtrl: NavController,
    public navParams: NavParams,
    public http: HttpProvider,
    public loadingCtrl: LoadingController,
    public toastCtrl: ToastController,
    public staticVal: IBizStaticVariablesProvider,
    public storage: Storage
  ) {
    super({
      'storage': storage,
      'loadingCtrl': loadingCtrl,
      'toastCtrl': toastCtrl,
      'staticVal': staticVal,
      'navCtrl': navCtrl,
      'navParams': navParams
    });
    this.formService = new IBizFormService({ 'component': this });
  }

  login() {
    let loader = this.showLoading("登录中");
    this.formService.$http.post("/api/login", { "username": this.username, "password": this.password })
      .subscribe(
      response => {
        loader.dismiss();
        if (response.ret == 0) {
          window.localStorage.setItem("srfloginkey", response.data.loginkey);
          this.showToast("登录成功！");
          this.$navCtrl.pop();
        } else {
          this.showToast(response.info);
        }
      },
      error => {
        loader.dismiss();
        this.showToast("请求失败！");
      }
      );
  }

  closeModal() {
    this.$navCtrl.pop();
  }

}
