import { Component, ViewChild, ElementRef, forwardRef } from '@angular/core';
import { FileUploader, FileItem, ParsedResponseHeaders } from 'ng2-file-upload';
import { NavController, NavParams, AlertController, LoadingController, Loading, Alert } from 'ionic-angular';
import { NG_VALUE_ACCESSOR, ControlValueAccessor } from '@angular/forms';

@Component({
	selector: 'image-upload',
	templateUrl: 'image-upload.html',
	providers: [
		{
			provide: NG_VALUE_ACCESSOR,
			useExisting: forwardRef(() => ImageUploadComponent),
			multi: true
		}
	]
})
export class ImageUploadComponent implements ControlValueAccessor {

	private onTouchedCallback: () => void = function () { };
	private onChangeCallback: (_: any) => void = function () { };

	public uploader: FileUploader;
	public files: any[] = [];
	public loading: Loading;

	@ViewChild('fileUpload')
	fileUpload: ElementRef;

	constructor(public navCtrl: NavController, public navParams: NavParams, public alertCtrl: AlertController, public loadingCtrl: LoadingController) {
		this.uploader = new FileUploader({ url: "fieldUpload/uploadfile.jsp", autoUpload: true });
		this.uploader.onSuccessItem = this.successItem.bind(this);
		if (navParams.get('params')) {
			let params: any = navParams.get('params');
			if (params.fileList) {
				this.files = params.fileList;
			}
		}
	}

	fileSelect(): any {
		this.fileUpload.nativeElement.click();
	}

	fileChange(): void {
		this.loading = this.loadingCtrl.create({
			content: '图片加载中...',
			dismissOnPageChange: false //页面变化的时候关闭提示
		});
		this.loading.present();
	}

	deleteFile(id: string, index: number): void {
		let alert: Alert = this.alertCtrl.create({
			title: '确认删除',
			message: '确认删除图片吗?',
			buttons: [
				{
					text: '取消'
				},
				{
					text: '确认',
					handler: () => {
						if (this.files[index] && Object.is(this.files[index].id, id)) {
							this.files.splice(index, 1);
							this.onChangeCallback(JSON.stringify(this.files));
						}
					}
				}
			]
		});
		alert.present();
	}

	successItem(item: FileItem, response: string, status: number, headers: ParsedResponseHeaders): any {
		let res: any = JSON.parse(response);
		if (res && res.ret == 0) {
			if (res.success === true) {
				this.files.push(...res.files);
			}
		}
		if (this.loading) {
			this.loading.dismiss();
		}
		this.onChangeCallback(JSON.stringify(this.files));
	}

	writeValue(value: any): void {
		if (value) {
			try {
				this.files = JSON.parse(value);
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
