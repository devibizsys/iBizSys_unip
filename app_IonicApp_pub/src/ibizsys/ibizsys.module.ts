import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { FileUploadModule } from 'ng2-file-upload';
/**
 * 组件
 */
import { MenuPortletComponent } from './components/menu-portlet/menu-portlet';
import { ListMenuPortletComponent } from './components/list-menu-portlet/list-menu-portlet';
import { GridMenuPortletComponent } from './components/grid-menu-portlet/grid-menu-portlet';
import { GroupMenuPortletComponent } from './components/group-menu-portlet/group-menu-portlet';
import { PickerComponent } from './components/picker/picker';
import { MPickerComponent } from './components/mpicker/mpicker';
import { FileUploadPickerComponent } from './components/file-upload-picker/file-upload-picker';
import { ImageUploadComponent } from './components/image-upload/image-upload';
/**
 * 页面
 */
import { LoginPage } from './pages/login/login';
import { FileUploadPage } from './pages/file-upload/file-upload';

/**
 * 服务
 */
import { HttpProvider } from './ts/providers/http';
import { IBizStaticVariablesProvider } from './ts/providers/ibiz-static-variables';

@NgModule({
	declarations: [
		MenuPortletComponent,
		ListMenuPortletComponent,
		GridMenuPortletComponent,
		GroupMenuPortletComponent,
		PickerComponent,
		MPickerComponent,
		FileUploadPickerComponent,
		ImageUploadComponent,
		LoginPage,
		FileUploadPage,
	],
	imports: [
		IonicPageModule.forChild([
			LoginPage,
			FileUploadPage,
		]),
		FileUploadModule,
	],
	exports: [
		MenuPortletComponent,
		ListMenuPortletComponent,
		GridMenuPortletComponent,
		GroupMenuPortletComponent,
		PickerComponent,
		MPickerComponent,
		FileUploadPickerComponent,
		ImageUploadComponent,
		LoginPage,
		FileUploadPage,
	],
	providers: [
		HttpProvider,
		IBizStaticVariablesProvider,
	]
})
export class IBizSysModule {}
