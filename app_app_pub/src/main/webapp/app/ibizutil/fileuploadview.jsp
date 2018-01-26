<%@page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="page1" scope="page" class="net.ibizsys.paas.web.Page" />
<% if(!page1.init(pageContext)) return;%>
<%@ taglib prefix="ibiz5" uri="http://www.ibizsys.cn/tags"%>
<%@include file="utilheader.jsp"%>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
<!-- Force latest IE rendering engine or ChromeFrame if installed -->
<!--[if IE]>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<![endif]-->
<meta charset="utf-8">
<title>jQuery File Upload Demo</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap styles -->
<link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="${ctx}/assets/jquery-file-upload/blueimp-gallery/blueimp-gallery.min.css">
<link rel="stylesheet" href="${ctx}/assets/jquery-file-upload/css/jquery.fileupload.css">
<link rel="stylesheet" href="${ctx}/assets/jquery-file-upload/css/jquery.fileupload-ui.css">
</head>
<body>
<div class="container">
    <h1></h1>
    <h2 class="lead"></h2>
    <form id="fileupload" method="POST" enctype="multipart/form-data">
        <table role="presentation" class="table table-striped"><tbody class="files"></tbody></table>
        <div class="row fileupload-buttonbar">
            <div class="col-lg-7">
                <span class="btn btn-success fileinput-button">
                    <i class="glyphicon glyphicon-plus"></i>
                    <span><ibiz5:message code="CONTROL.UPLOADER.UPLOAD.TEXT" text="添加文件"></ibiz5:message></span>
                    <input type="file" name="files[]" multiple>
                </span>
                <button id="okbtn" class="btn btn-primary start">
                    <i class="glyphicon glyphicon-upload"></i>
                    <span><ibiz5:message code="CONTROL.UPLOADER.OK.TEXT" text="确定"></ibiz5:message></span>
                </button>
                <button id="cancelbtn"  class="btn btn-warning cancel">
                    <i class="glyphicon glyphicon-ban-circle"></i>
                    <span><ibiz5:message code="CONTROL.UPLOADER.CANCEL.TEXT" text="取消"></ibiz5:message></span>
                </button>
                <span class="fileupload-process"></span>
            </div>
            <div class="col-lg-5 fileupload-progress fade">
                <div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100">
                    <div class="progress-bar progress-bar-success" style="width:0%;"></div>
                </div>
                <div class="progress-extended">&nbsp;</div>
            </div>
        </div>
    </form>
</div>
<script id="template-upload" type="text/x-tmpl">
{% for (var i=0, file; file=o.files[i]; i++) { %}
    <tr class="template-upload fade">
        <td>
            <span class="preview"></span>
        </td>
        <td>
            <p class="name">{%=file.name%}</p>
            <strong class="error text-danger"></strong>
        </td>
        <td>
            <p class="size">上传中...</p>
            <div class="progress progress-striped active" role="progressbar" aria-valuemin="0" aria-valuemax="100" aria-valuenow="0"><div class="progress-bar progress-bar-success" style="width:0%;"></div></div>
        </td>
        <td>
            {% if (!i && !o.options.autoUpload) { %}
                <button class="btn btn-primary start" disabled>
                    <i class="glyphicon glyphicon-upload"></i>
                    <span>上传</span>
                </button>
            {% } %}
            {% if (!i) { %}
                <button class="btn btn-warning cancel">
                    <i class="glyphicon glyphicon-ban-circle"></i>
                    <span>取消</span>
                </button>
            {% } %}
        </td>
    </tr>
{% } %}
</script>
<!-- The template to display files available for download -->
<script id="template-download" type="text/x-tmpl">
{% for (var i=0, file; file=o.files[i]; i++) { %}
    <tr class="template-download fade">
        <td>
            <span class="preview">
                {% if (file.thumbnailUrl) { %}
                    <a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" data-gallery><img src="{%=file.thumbnailUrl%}"></a>
                {% } %}
            </span>
        </td>
        <td>
            <p class="name">
                {% if (file.url) { %}
                    <a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" {%=file.thumbnailUrl?'data-gallery':''%}>{%=file.name%}</a>
                {% } else { %}
                    <span>{%=file.name%}</span>
                {% } %}
            </p>
            {% if (file.error) { %}
                <div><span class="label label-danger">Error</span> {%=file.error%}</div>
            {% } %}
        </td>
        <td>
            <span class="size">{%=o.formatFileSize(file.size)%}</span>
        </td>
        <td>
            {% if (file.deleteUrl) { %}
                <button class="btn btn-danger delete" data-type="{%=file.deleteType%}" data-url="{%=file.deleteUrl%}"{% if (file.deleteWithCredentials) { %} data-xhr-fields='{"withCredentials":true}'{% } %}>
                    <i class="glyphicon glyphicon-trash"></i>
                    <span>删除</span>
                </button>
                <input type="checkbox" name="delete" value="1" class="toggle">
            {% } else { %}
                <button name="{%=file.id%}" class="btn btn-warning cancel">
                    <i class="glyphicon glyphicon-ban-circle"></i>
                    <span>删除</span>
                </button>
            {% } %}
        </td>
    </tr>
{% } %}
</script>
<%@include file="../lib/lib-common-script.jsp"%>

<script src='${ctx}/assets/jquery-file-upload/js/vendor/jquery.ui.widget.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/vendor/tmpl.min.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/vendor/load-image.min.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/vendor/canvas-to-blob.min.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/blueimp-gallery/jquery.blueimp-gallery.min.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/jquery.iframe-transport.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/jquery.fileupload.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/jquery.fileupload-process.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/jquery.fileupload-image.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/jquery.fileupload-audio.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/jquery.fileupload-video.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/jquery.fileupload-validate.js' type='text/javascript'></script>
<script src='${ctx}/assets/jquery-file-upload/js/jquery.fileupload-ui.js' type='text/javascript'></script>
<script>
jQuery(document).ready(function() {
	var fileMap = {};
	
	var pagectx = new IBizPageContext();
	var winId = pagectx.getParamValue('windowid');
	var win = $.getIBizApp().findWindow(winId);
	
	$('#okbtn').click(function(){
		if(win){
			var files = [];
			$.each(fileMap,function(key,val){
				if(val){
					files.push(val);
				}
			});
			win.files = files;
			win.close(window);
		}
	});
	$('#cancelbtn').click(function(){
		if(win){
			win.close(window);
		}
	});
	
	$('#fileupload').fileupload({
	    url: '${ctx}/ibizutil/uploadfile.jsp',
	    autoUpload: true,
	    failed: function (e, data) {  
	    	var fileid = $(data.context.context).prop("name");
	    	fileMap[fileid] = null;
	    },
	    finished: function (e, data) {  
	    	if(e.type == 'fileuploadfinished'){
	    		if(data.result && data.result.files){
	    			$.each(data.result.files,function(index,file){
	    				if(file){
	    					fileMap[file.id] = file;
	    				}
	    			});
	    		}
	    	}
	    }
	});
});



</script>






</body>
</html>
