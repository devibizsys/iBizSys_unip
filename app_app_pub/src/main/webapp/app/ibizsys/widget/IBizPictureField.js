/**
 * 单个图片控件
 */
var IBizPictureField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.uploapath = BASEURL+'/ibizutil/uploadfile.jsp?';
		me.exportpath = BASEURL+'/ibizutil/exportfile.jsp?';
		
		me.field = $('#'+this.getUniqueId());
		me.image = me.field.find('.ibiz-id-image');
		me.uploadbtn = me.field.find('.ibiz-id-upload');
		me.removebtn = me.field.find('.ibiz-id-remove');
		
		if(config.width && config.width>0){
			//me.field.width(config.width);
			me.image.width(config.width-40);
		}
		if(config.height && config.height>0){
			//me.field.height(config.height);
			me.image.height(config.height);
		}
		
		if(me.uploadbtn){
			me.uploadbtn.click(function(){
				me.onUploadBtnClick();
			});
		}
		if(me.removebtn){
			me.removebtn.click(function(){
				me.onRemoveBtnClick();
			});
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		
		if(me.uploadbtn){
			me.uploadbtn.prop("disabled", disabled);
			me.uploadbtn.attr('disabled',disabled);
		}
		if(me.removebtn){
			me.removebtn.prop("disabled", disabled);
			me.removebtn.attr('disabled',disabled);
		}	
	},
	onValueChanged:function(oldVal,newVal){
		arguments.callee.$.onValueChanged.call(this,oldVal,newVal);
		var me = this;
		if(newVal){
			me.image.attr('src',me.exportpath +'fileid='+newVal);
		}else{
			me.image.attr('src','');
		}
	},
	onUploadBtnClick:function(){
		var me = this;
		if(me.isDisabled())
			return;
		
		if(window.ActiveXObject && !$.support.leadingWhitespace)
			//if(true)
		{
			me.openUploadView();
		}
		else
		{
			var file = $('<INPUT type="file" name="files">');
			file.change(function(){
				var filename=file.val();
				if(filename=='')
					return;
				
				$.ajaxFileUpload
		        (
		            {
		                url: me.uploapath, //用于文件上传的服务器端请求地址
		                secureuri: false, //是否需要安全协议，一般设置为false
		                fileElement: file, //文件上传域的ID
		                dataType: 'json', //返回值类型 一般设置为json
		                success: function (data, status)  //服务器成功响应处理函数
		                {
		                	if(data && typeof(data) === 'object'){
		    					if(status != 'success'){
		    						IBiz.alert($IGM('IBIZPICTUREFIELD.ONUPLOADBTNCLICK.TITLE','上传失败'),$IGM('IBIZPICTUREFIELD.ONUPLOADBTNCLICK.INFO','上传文件失败,'+data.message,[data.message]),2);
		    					}else{
		    						me.setValue(data.files[0].id);
		    					}
		    				}else{
		    					IBiz.alert($IGM('IBIZPICTUREFIELD.ONUPLOADBTNCLICK.TITLE','上传失败'),$IGM('IBIZPICTUREFIELD.ONUPLOADBTNCLICK.INFO','上传文件失败,'+data.message,[data.message]),2);
		    				}
		                },
		                error: function (data, status, e)//服务器响应失败处理函数
		                {
		                	IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误'),$IGM('IBIZPICTUREFIELD.AJAX.INFO','执行请求发生异常'),2);
		                }
		            }
		        );
			});
			file.click();
		}
	},
	onRemoveBtnClick:function(){
		var me = this;
		if(me.isDisabled())
			return;
		me.setValue('');
	},
	uploadCallback:function(win){
		var me = win.opener;
		var data = win.files;
		if(data && data.length>0){
			me.setValue(data[0].id);
		}
	},
	openUploadView:function(){
		var me = this;
		var win = $.getIBizApp().createWindow({});
		win.opener = me;
		win.title = $IGM('IBIZPICTUREFIELD.OPENUPLOADVIEW.INFO','上传文件');
		win.height = 500;
		win.width = 600;
		win.url = BASEURL +'/ibizutil/fileuploadview.jsp?'+$.param({windowid:win.getId()});
		win.callback = me.uploadCallback;
        win.openModal(window);
	}	
});	