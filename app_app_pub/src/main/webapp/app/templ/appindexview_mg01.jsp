<%@page contentType="text/html;charset=UTF-8"%>
<%@ page import="net.ibizsys.paas.web.WebContext" language="java"%>
<%@include file="templ_header.jsp"%>
<%
	String strIndexViewIcon = vc.getAttribute("UI.APPICONPATH","");
	String strIndexViewIcon2 = vc.getAttribute("UI.APPICONPATH2","");
	String strMainMenuAlign = vc.getAttribute("UI.MAINMENUALIGN","LEFT");
%>
<title><%=vc.getTitle(true)%></title>
<link rel="stylesheet" type="text/css" href="../../apputil/style/common/set.css"/>
<link rel="stylesheet" type="text/css" href="../../apputil/style/plugin/chosen.css"/>
<link rel="stylesheet" type="text/css" href="../../apputil/style/page/index.css"/>
<style>
.page-header .page-header-menu .hor-menu .navbar-nav > li > a {
  font-size: 14px;
  font-weight: bold;
  padding: 8px 18px 7px 18px;
}
.page-header .page-header-menu {height:35px;}
</style>
</head>
<% if((strMainMenuAlign.compareTo("LEFT")==0)||(strMainMenuAlign.compareTo("")==0)){ %>
<%@include file="templ_appindexview_left.jsp"%>
<%return ;} %>
<% if(strMainMenuAlign.compareTo("TOP")==0){ %>
<%@include file="templ_appindexview_top_mg01.jsp"%>
<%return ;} %>