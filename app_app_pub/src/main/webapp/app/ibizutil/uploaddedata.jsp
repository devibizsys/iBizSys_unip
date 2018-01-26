<%@page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="page1" scope="page" class="net.ibizsys.paas.web.util.UploadDEDataSavePageEx" />
<% if(!page1.init(pageContext)) return;%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN" >
<html>
<head>
<title>数据处理结果</title>
<base target="_self">
<link href="resource/css/default/common.css" type="text/css"	rel="stylesheet">
</head>
<body style='background-color:#ffffff;overflow:hidden;padding:2px;'>
<div id='center' class='x-panel-body-noheader x-panel-body' style='overflow:auto;' >
<table  width='100%' border='0' cellspacing='0' cellpadding='0'>
	<tr>
		<td >
			<span class='sx-normaltext'>数据处理结果：</span>
		</td>
	</tr>
	<tr>
		<td>
			<div style='overflow:auto;height:480px;'>
				<span class='sx-normaltext'>
					<%=page1.outputProcessInfo() %>
				</span>
			</div>
		</td>
	</tr>
	<tr>
		<td >
			<span class='sx-normaltext'><%=page1.outputErrorFileLink() %></span>
		</td>
	</tr>
</table>
</div>
</html>
