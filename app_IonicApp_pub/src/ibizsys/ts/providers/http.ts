import { Observable } from "rxjs/Rx";
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

/**
 * Http请求封装类
 * 
 * @export
 * @class HttpProvider
 */
@Injectable()
export class HttpProvider {

  //private ip: string = 'http://172.16.170.150:8085/unip/';
  private ip: string = '..';

  constructor(private http: HttpClient) {

  }

  /**
    * 全局http post方法
    * 
    * @param {string} url 
    * @param {{}} opt 
    * @returns 
    * @memberof IBizService
    */
  public post(url: string, opt: {} = {} , filter?: any): Observable<any> {
    return this.http.post(this.ip + url, this.transformationOpt(opt), {
      headers: new HttpHeaders({
        "Accept": "application/json",
        "Content-Type": "application/x-www-form-urlencoded;charset=UTF-8"
      })
    }).catch(this.handleError);
  }

  /**
   * 全局HTTP get方法。
   * 
   * @private
   * @param {string} url 
   * @returns {Observable<string[]>} 
   * @memberof RestProvider
   */
  public get(url: string): Observable<any> {
    return this.http.get(this.ip + url)
      .catch(this.handleError);
  }

  /**
   * 
   * 
   * @private
   * @param {(HttpResponse | any)} error 
   * @returns 
   * @memberof RestProvider
   */
  private handleError(error: HttpResponse<any> | any) {
    let errMsg: string;
    if (error instanceof HttpResponse) {
      errMsg = '返回值类型不为HttpResponse';
    } else {
      errMsg = error;
    }
    return Observable.throw(errMsg);
  }

  /**
   * 格式化post请求时携带的json字符串。
   * 
   * @private
   * @param {any} opt 
   * @returns 
   * @memberof HttpProvider
   */
  private transformationOpt(opt) {
    let str: string = '';
    for (let name in opt) {
      str += name + "=" + opt[name] + "&";
    }
    return str;
  }

}
