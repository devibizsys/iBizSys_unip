<%@page contentType="text/html; charset=GBK"%>
<jsp:useBean id="page1" scope="page" class="net.ibizsys.paas.web.util.UploadDEDataViewPage" />
<% if(!page1.init(pageContext)) return;%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN" >
<html>
<head>
<title>上传数据数据文件</title>
<base target="_self">
<link href="resource/css/default/common.css" type="text/css" rel="stylesheet">
<!-- 加载效果css -->
<style type="text/css">
	.main{
		width: 100%;
		height: auto;
		padding-top: 100px;
		position: relative;
		z-index:99999;
		margin:0 auto;
	}
	.loadEffect{
		width: 100px;
		height: 100px;
		position: relative;
		margin: 0 auto;
		margin-top:100px;
	}
	.loadEffect span{
		display: inline-block;
		width: 16px;
		height: 16px;
		border-radius: 50%; /* 圆角边框 */
		background: #545454;
		position: absolute;
		-webkit-animation: load 1.04s ease infinite;  
	}
	/* 动画时长的百分比 */
	@-webkit-keyframes load{
		0%{
			opacity: 1;
		}
		100%{
			opacity: 0.2;
		}
	}
	.loadEffect span:nth-child(1){
		left: 0;
		top: 50%;
		margin-top:-8px;
		-webkit-animation-delay:0.13s; /*等待多少秒，然后开始动画  */
	}
	.loadEffect span:nth-child(2){
		left: 14px;
		top: 14px;
		-webkit-animation-delay:0.26s;
	}
	.loadEffect span:nth-child(3){
		left: 50%;
		top: 0;
		margin-left: -8px;
		-webkit-animation-delay:0.39s;
	}
	.loadEffect span:nth-child(4){
		top: 14px;
		right:14px;
		-webkit-animation-delay:0.52s;
	}
	.loadEffect span:nth-child(5){
		right: 0;
		top: 50%;
		margin-top:-8px;
		-webkit-animation-delay:0.65s;
	}
	.loadEffect span:nth-child(6){
		right: 14px;
		bottom:14px;
		-webkit-animation-delay:0.78s;
	}
	.loadEffect span:nth-child(7){
		bottom: 0;
		left: 50%;
		margin-left: -8px;
		-webkit-animation-delay:0.91s;
	}
	.loadEffect span:nth-child(8){
		bottom: 14px;
		left: 14px;
		-webkit-animation-delay:1.04s;
	}
	.msg{
		text-align:center; 
		margin-top:10px;
	}
</style>
</head>
<body style='background-color:#ffffff;overflow:hidden;padding:2px;' id="body">
	<div id='center' class='x-panel-body-noheader x-panel-body'>
		<form id='uploadform'  method='post' enctype="multipart/form-data" ACTION="<%=page1.outputDataActionPath()%>" >
			<table  width='100%' border='0' cellspacing='0' cellpadding='0'">
				<tr>
					<td colspan='2 '>
						<span class='sx-normaltext'>
							请选择要处理的[<%=page1.outputDELogicName()%>]Excel或Access数据文件。
							注意，Access 数据文件中数据需要存放在TABLE1中。
						</span>
						<a target='_blank' href="<%=page1.outputTemplPath()%>">
							<span class='sx-normaltext'>下载导入数据模板</span>
						</a>
					</td>
				</tr>
				<tr>
					<td style='padding:2px;'>
						<input id='upload' name='upload' type='file' style='width:400px'>
					</td>
					<td width="100">
						<input type="button" value="上传并处理" onclick="formsubmit()">
					</td>
				</tr>
			</table>
		</form>
	</div>
	<!-- 上传文件提示信息显示区域 -->
	<div>
		<div class="main" style="display:none;" id="load">
			<div class="loadEffect">
				<span></span>
				<span></span>
				<span></span>
				<span></span>
				<span></span>
				<span></span>
				<span></span>
				<span></span>
			</div>
			<div class="msg" id="text">
				<span>文件正在上传,请等候...</span>
			</div>
		</div>
	</div> 
	
<script type="text/javascript"> 
	function formsubmit()
	{  
		var strFileURL = document.getElementById('upload').value;
		strFileURL = strFileURL.trim();
		if(strFileURL == '' || strFileURL==null || strFileURL == undefined || strFileURL.length == 0){
			return;
		}
		document.getElementById("load").style.display ="block";//显示
		document.getElementById("center").style ="pointer-events:none;";
		document.getElementById("body").style="background-color:#EAEAEA;"
		//提交
		uploadform.submit();     
	} 
</script> 
</body>
</html>
