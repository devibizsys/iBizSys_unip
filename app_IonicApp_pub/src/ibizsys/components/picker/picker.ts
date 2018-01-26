import { Component, forwardRef, Input } from '@angular/core';
import { NavController, NavParams } from 'ionic-angular';
import { ControlValueAccessor } from '@angular/forms/src/directives';
import { NG_VALUE_ACCESSOR } from '@angular/forms';

@Component({
  selector: 'picker',
  templateUrl: 'picker.html',
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => PickerComponent),
      multi: true
    }
  ]
})
export class PickerComponent implements ControlValueAccessor {

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

  private innerValue: string = '';
  private onTouchedCallback: () => void = function () { };
  private onChangeCallback: (_: any) => void = function () { };

  constructor(public navCtrl: NavController,
    public navParams: NavParams) {
      
  }

  openPickView(){
    let me = this;
    let params: any = {};
    let pickupView = JSON.parse(this.pickupView);
    params.currentValue = me.formService.$data[me.valueItem];
    this.formService.$component.openModal({'className':pickupView.view,'viewParam':params},function (result){
      if(Object.is(result.ret,'OK')){
        if(result.selectedData){
          me.content = result.selectedData.srfmajortext;
          me.onChangeCallback(result.selectedData.srfmajortext);
          me.formService.$data[me.valueItem] = result.selectedData.srfkey;
        } else if(result.selectedDatas){
          throw new Error('多数据选择，请使用mpickup');
        }
      }
    });
  }


  clear(): void {
    this.content = '';
    this.formService.$data[this.valueItem] = '';
  }

  get content() {
    return this.innerValue;
  }

  set content(value: string) {
    if (value !== this.innerValue) {
      this.innerValue = value;
      this.onChangeCallback(value);
    }
  }

  writeValue(value: any): void {
    if (value) {
      this.innerValue = value;
    }
  }

  registerOnChange(fn: any): void {
    this.onChangeCallback = fn;
  }

  registerOnTouched(fn: any): void {
    this.onTouchedCallback = fn;
  }

}
