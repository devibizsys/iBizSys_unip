<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="utilheader.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
		<title>正在跳转到登录界面...</title>
	</head>
	<body>
	</body>
	<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<SCRIPT type="text/javascript" LANGUAGE='javascript'>
	var wmfwzx = '${ctx}/ibizutil/login_real.jsp';
	if(navigator.userAgent.indexOf('WebKit')>0){
		window.onerror = errorhandler();
	}else {
		window.onerror = errorhandler;
	}
	function errorhandler(message, uri, line) { 
	    window.location.href=wmfwzx;
	    return true; 
	}; 
	$(document).ready(function(){ 
		var url = '<%=request.getParameter("DIRECT")%>';
		 if(url!=null && url=='TRUE')
		 {
			 window.location.href='${ctx}/index2.html';
		 }
		 else
		 {
			/*  var A = window.opener;
			 if(A)
			 {
				 if(A.closed)
				 {
					 A = window.top;
					 if(A&&!A.closed)
					 {
						 A.location.href=wmfwzx;
						 window.close();
					 }
					 else
					 {
						 window.location.href=wmfwzx;
					 }	 
				 }
				 else
				 {
					A.location.href=wmfwzx;
				 	window.close();
				 }
			 }
			 else
			 { */
				 if(window.top)
				 {
					 if(window.top==window)
					 {
						 window.location.href=wmfwzx;
					 }
					 else
						 window.top.location.href=wmfwzx;
				 }
				 else
				 {
					 window.location.href=wmfwzx;
				 }
			 //}
	  	}
	});
</SCRIPT>
</html>