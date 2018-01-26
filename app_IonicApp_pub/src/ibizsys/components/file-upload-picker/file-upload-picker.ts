import { Component, forwardRef } from '@angular/core';
import { ModalController, NavParams } from 'ionic-angular';
import { ControlValueAccessor } from '@angular/forms/src/directives';
import { NG_VALUE_ACCESSOR } from '@angular/forms';

import { FileUploadPage } from '../../pages/file-upload/file-upload';

@Component({
  selector: 'file-upload-picker',
  templateUrl: 'file-upload-picker.html',
  providers: [
    {
      provide: NG_VALUE_ACCESSOR,
      useExisting: forwardRef(() => FileUploadPickerComponent),
      multi: true
    }
  ]
})
export class FileUploadPickerComponent implements ControlValueAccessor {
  private selectedFileList: any[] = [];

  private onTouchedCallback: () => void = function () { };
  private onChangeCallback: (_: any) => void = function () { };

  constructor(public modalCtrl: ModalController,
    public navParams: NavParams) {

  }

  openPickView() {
    let me = this;
    let viewParams: any = {};
    viewParams.params = {'fileList': this.selectedFileList};
    viewParams.callback = (result) => {
      if(Object.is(result.ret, 'OK')){
        me.selectedFileList = result.fileList;
      }
    };
		let modal = this.modalCtrl.create(FileUploadPage, viewParams);
		modal.present();
  }

  deleteSelected(item: any) {
    for(let i: number = 0; i<this.selectedFileList.length ; i++){
      if(Object.is(this.selectedFileList[i].id, item.id)){
        this.selectedFileList.splice(i,1);
      }
    }
    this.onChangeCallback(JSON.stringify(this.selectedFileList));
  }

  writeValue(value: any): void {
    if(value) {
      try {
        this.selectedFileList = JSON.parse(value);
      } catch (error) {
        
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
