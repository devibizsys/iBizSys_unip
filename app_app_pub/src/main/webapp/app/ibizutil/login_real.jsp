<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="utilheader.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8"/>
<title>系统登录</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>
<meta http-equiv="Content-type" content="text/html; charset=utf-8">
<meta content="" name="description"/>
<meta content="" name="author"/>
<link href="https://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
body {
  background-color: #364150;
}
.content{
	/* opacity:0.6;
	filter:alpha(opacity=60); */
	background:#eceef1;         
	width: 400px;  
    margin: 40px auto 10px auto ;
    padding-top: 10px;
    padding-right:30px;
    padding-bottom:10px !important;
    padding-left:30px;
    overflow: show;
    position: relative;
}
.form-title{
	padding-left: 27px;
}
.login .content{
	border-radius: 7px !important;
}
input,button{
	border-radius: 4px !important;
}
.reset{
	margin-left: 60px !important;
}
.login-options{
	padding-top:0px !important;
	margin-bottom:20px;
}
</style>
</head>
<body class="login">
<div class="menu-toggler sidebar-toggler"></div>
<!-- END SIDEBAR TOGGLER BUTTON -->
<!-- BEGIN LOGO -->
<div class="logo">

</div>
<!-- BEGIN LOGIN -->
<div class="content">
	<form class="login-form" action="" method="post">
		<h3 class="form-title" style="letter-spacing:30px; text-align:center;">登录</h3>
		<!-- 提示信息 -->
		<div style="text-align:center; margin-bottom:15px; margin-top:5px;">
			<span id="request-answer" style="color:red; font-size:13px;font-weight:bold;"></span>
		</div>
		<div class="form-group">
			<input class="form-control form-control-solid placeholder-no-fix" type="text" autocomplete="off" placeholder="用户名" name="tbx_LoginName" id="tbx_LoginName"/>
		</div>
		<div class="form-group">
			<input class="form-control form-control-solid placeholder-no-fix" type="password" autocomplete="off" placeholder="密码" name="tbx_LoginPassword" id="tbx_LoginPassword"/>
		</div>
		<!-- 显示后台返回的提示信息 -->
		<div class="form-group" style="text-align:center;">
			<button type="button" class="btn btn-success uppercase login1" >&nbsp;&nbsp;&nbsp;登&nbsp;&nbsp;&nbsp;录&nbsp;&nbsp;&nbsp;</button>
			<button type="button" class="btn btn-success uppercase reset" >&nbsp;&nbsp;&nbsp;重&nbsp;&nbsp;&nbsp;置&nbsp;&nbsp;&nbsp;</button>
		</div>
		<div class="form-group">
			<p class="bg-info" style="padding:5px; border-radius:5px;">温馨提示:如第一次进入系统需要初始化管理员用户，请点击下面按钮进行初始化，才可以正常登录</p>
			<button type="button" class="btn btn-sm btn-info" onClick="initsystem()" style="width:100%;">初始化</button>
		</div>
	</form>
</div>
<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="resource/login.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->
<script type="text/javascript">
var loginUrl = "${ctx}/ibizutil/login.do";
var indexUrl = "${ctx}/index.html";
jQuery(document).ready(function() {     
	loginInit();
});


	var initsystem = function(){
		window.open("initsystemenv.jsp"); 
	}

</script>
</body>
</html>