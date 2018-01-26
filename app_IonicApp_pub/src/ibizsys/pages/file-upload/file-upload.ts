import { Component, ViewChild, ElementRef } from '@angular/core';
import { NavController, NavParams, AlertController } from 'ionic-angular';
import { FileUploader, FileItem, ParsedResponseHeaders } from 'ng2-file-upload';
import { IBizViewController } from '../../ts/app/IBizViewController';

@Component({
	selector: 'page-file-upload',
	templateUrl: 'file-upload.html',
})
export class FileUploadPage extends IBizViewController{
	public uploader: FileUploader;
	public files: any[] = [];

	@ViewChild('fileUpload')
	fileUpload: ElementRef;

	constructor(public navCtrl: NavController, public navParams: NavParams, public alertCtrl: AlertController) {
		super({
			'navCtrl': navCtrl,
			'navParams': navParams,
			'alertCtrl': alertCtrl
		});
		this.uploader = new FileUploader({ url: "fieldUpload/uploadfile.jsp" });
		this.uploader.onSuccessItem = this.successItem.bind(this);
		this.uploader.onAfterAddingFile = this.afterAddFile;
		this.uploader.onBuildItemForm = this.buildItemForm;
		if(navParams.get('params')){
			let params: any = navParams.get('params');
			if(params.fileList){
				this.files = params.fileList;
			}
		}
	}

	fileSelect(): any{
		this.fileUpload.nativeElement.click();
	}

	deleteFile(index: number, item: any): void {
		this.confirm('删除','确认删除['+item.name+']吗？',() => {
			if(Object.is(this.files[index].id, item.id)){
				this.files.splice(index, 1);
			}
		});
	}

	deleteAllFile(): void {
		this.confirm('删除','确认删除全部吗？',() => {
			this.files = [];
		});
	}

	buildItemForm(fileItem: FileItem, form: any): any {
		console.log('点击上传按钮之后');
	}

	afterAddFile(fileItem: FileItem): any {
		console.log('选择文件之后');
	}
	
	successItem(item: FileItem, response: string, status: number, headers: ParsedResponseHeaders): any {
		let res: any = JSON.parse(response);
		if(res && res.ret == 0) {
			if(res.success === true){
				this.files.push(...res.files);
			}
		}
	}

	closeView(): void {
		this.setResult({'fileList': this.files});
		super.closeView();
	}
}
