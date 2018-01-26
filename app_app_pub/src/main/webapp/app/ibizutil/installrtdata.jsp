<%@page contentType="text/html;charset=UTF-8"%><jsp:useBean id="p" scope="page" class="net.ibizsys.paas.web.util.InstallRTDataPage" /><% p.init(pageContext);%>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
<!-- Force latest IE rendering engine or ChromeFrame if installed -->
<!--[if IE]>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<![endif]-->
<meta charset="utf-8">
<title>安装运行数据</title>
</head>
<body>
<%=p.outputInstallInfo()%>
</body>
</html>