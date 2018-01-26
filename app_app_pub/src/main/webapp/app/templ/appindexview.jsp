<%@page contentType="text/html;charset=UTF-8"%>
<%@ page import="net.ibizsys.paas.web.WebContext" language="java"%>
<%@include file="templ_header.jsp"%>
<%
	String strIndexViewIcon = vc.getAttribute("UI.APPICONPATH","");
	String strIndexViewIcon2 = vc.getAttribute("UI.APPICONPATH2","");
	String strMainMenuAlign = vc.getAttribute("UI.MAINMENUALIGN","LEFT");
%>
<title><%=vc.getTitle(true)%></title>
<style>
/* body{
	overflow-y: hidden;
}
.ibiz-id-mainmenu{ 
 	overflow-y: auto; 
 	overflow-x: hidden;
 } 
 .ibiz-id-mainmenu::-webkit-scrollbar-thumb{ 
	background-color: #dddddd; 
 } 
 .ibiz-id-mainmenu::-webkit-scrollbar{ 
 	width: 4px; 
 }   */
</style>
</head>
<% if((strMainMenuAlign.compareTo("LEFT")==0)||(strMainMenuAlign.compareTo("")==0)){ %>
<%@include file="templ_appindexview_left.jsp"%>
<%return ;} %>
<% if(strMainMenuAlign.compareTo("TOP")==0){ %>
<%@include file="templ_appindexview_top.jsp"%>
<%return ;} %>