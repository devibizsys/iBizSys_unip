import { Component, forwardRef, Input } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { ControlValueAccessor } from '@angular/forms/src/directives';
import { NG_VALUE_ACCESSOR } from '@angular/forms';

@Component({
  selector: 'mpicker',
  templateUrl: 'mpicker.html',
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => MPickerComponent),
      multi: true
    }
  ]
})
export class MPickerComponent implements ControlValueAccessor {

  /**
   * 表单的service
   */
  @Input()
  formService: any;
  @Input()
  valueItem: string;
  /**
   * 需要打开的视图名称
   */
  @Input()
  pickupView: any;

  content: any[] = [];

  private innerValue: any = [];
  private onTouchedCallback: () => void = function () { };
  private onChangeCallback: (_: any) => void = function () { };

  constructor(public navCtrl: NavController,
    public navParams: NavParams) {

  }

  openPickView() {
    let me = this;
    let params: any = {};
    let pickupView = JSON.parse(this.pickupView);
    params.currentValue = this.innerValue;
    this.formService.$component.openModal({ 'className': pickupView.view, 'viewParam': params }, function (result) {
      if (Object.is(result.ret, 'OK')) {
        if (result.selectedData) {
          throw new Error('单选，请使用pickup');
        } else if (result.selectedDatas) {
          me.content = [];
          let values: any = [];
          result.selectedDatas.forEach(element => {
            if(element.checked){
              let item = { 'srfkey': element.srfkey, 'srfmajortext': element.srfmajortext };
              me.content.push(item);
              values.push(item);
            }
          });
          me.onChangeCallback(JSON.stringify(values));
          me.innerValue = values;
        }
      }
    });
  }

  deleteSelected(index: number, srfkey: string) {
    if(Object.is(this.content[index].srfkey, srfkey)){
      this.content.splice(index,1);
    }
    this.innerValue = this.content;
    this.onChangeCallback(JSON.stringify(this.content));
  }

  writeValue(value: any): void {
    if (value) {
      this.content = [];
      try {
        value.forEach(element => {
          this.content.push(element);
        });
        this.innerValue = value;
        this.onChangeCallback(JSON.stringify(value));
      } catch (error) {
        throw new Error('多数据选择数据格式错误，无法解析');
      }
    }
  }

  registerOnChange(fn: any): void {
    this.onChangeCallback = fn;
  }

  registerOnTouched(fn: any): void {
    this.onTouchedCallback = fn;
  }

}
