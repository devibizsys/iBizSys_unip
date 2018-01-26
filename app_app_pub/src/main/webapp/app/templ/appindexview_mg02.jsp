<%@page contentType="text/html;charset=UTF-8"%>
<%@ page import="net.ibizsys.paas.web.WebContext" language="java"%>
<%@include file="templ_header.jsp"%>
<%
	String strIndexViewIcon = vc.getAttribute("UI.APPICONPATH","");
	String strIndexViewIcon2 = vc.getAttribute("UI.APPICONPATH2","");
	String strMainMenuAlign = vc.getAttribute("UI.MAINMENUALIGN","LEFT");
%>
<title><%=vc.getTitle(true)%></title>
<% if(strMainMenuAlign.compareTo("TOP")==0){ %>
<link rel="stylesheet" type="text/css" href="../../apputil/style/common/set.css"/>
<link rel="stylesheet" type="text/css" href="../../apputil/style/plugin/chosen.css"/>
<link rel="stylesheet" type="text/css" href="../../apputil/style/page/index.css"/>
<%}%>
<% if((strMainMenuAlign.compareTo("LEFT")==0)||(strMainMenuAlign.compareTo("")==0)){ %>
<link rel="stylesheet" type="text/css" href="../../apputil/style/common/set.css"/>
<link rel="stylesheet" type="text/css" href="../../apputil/style/page/back.css"/>
<%}%>
<style>
<% if(strMainMenuAlign.compareTo("TOP")==0){ %>
.page-header .page-header-menu .hor-menu .navbar-nav > li > a {
  font-size: 14px;
  font-weight: bold;
  padding: 8px 18px 7px 18px;
}
.page-header .page-header-menu {height:35px;}
<%}%>
<% if((strMainMenuAlign.compareTo("LEFT")==0)||(strMainMenuAlign.compareTo("")==0)){ %>
.page-header.navbar {
    background-color: #e1f0fc;
}
.page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover, .page-sidebar {
    background-color: #e1f0fc;
}
.page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu .sub-menu > li:hover > a, .page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu .sub-menu > li.open > a, .page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu .sub-menu > li.active > a, .page-sidebar .page-sidebar-menu .sub-menu > li:hover > a, .page-sidebar .page-sidebar-menu .sub-menu > li.open > a, .page-sidebar .page-sidebar-menu .sub-menu > li.active > a {
    background: #e0e0e0 !important;
}
.page-sidebar .page-sidebar-menu > li > a {
    border-top: 1px #ccc solid;
}
.page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .sidebar-search .input-group .form-control, .page-sidebar .sidebar-search .input-group .form-control {
    background-color: transparent;
    color: #4e5c6f;
}
.page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .sidebar-search .input-group, .page-sidebar .sidebar-search .input-group {
    border-bottom: 1px #e0e0e0 solid;
}
.page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu > li:hover > a, .page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu > li.open > a, .page-sidebar .page-sidebar-menu > li:hover > a, .page-sidebar .page-sidebar-menu > li.open > a {
    background: #e1f0fc;
    color: #666;
}
.page-sidebar .page-sidebar-menu .sub-menu, .page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu .sub-menu {
    list-style: none;
    display: none;
    padding: 0;
    margin: 0px 0px 0px 0px;
    background-color: #f1f3fa;
}
.page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu > li > a, .page-sidebar .page-sidebar-menu > li > a {
    border-top: 1px #e0e0e0 solid;
    color: #666;
}
.page-sidebar .page-sidebar-menu .sub-menu li, .page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu .sub-menu li {
    background: none;
    margin: 0px;
    padding: 0px;
    margin-top: 1px !important;
    width:100%;
}
.page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu .sub-menu > li > a, .page-sidebar .page-sidebar-menu .sub-menu > li > a {
    color: #666;
}
.page-sidebar-closed .page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .page-sidebar-menu:hover .sub-menu, .page-sidebar-closed
.page-sidebar .page-sidebar-menu:hover .sub-menu {
  background-color: #F1F3FA;
}
.page-sidebar .page-sidebar-menu > li .sub-menu {
    background-color: #F1F3FA !important;
}
.page-sidebar .page-sidebar-menu .sidebar-search input {
    background-color: transparent !important;
}
span {
    font-family: '微软雅黑', Arial, sans-serif;
    font-size: 16px;
}
.page-sidebar-closed.page-sidebar-fixed .page-sidebar:hover .sidebar-toggler, .page-sidebar .sidebar-toggler {
    background: url(../../apputil/images/icon.png);
    width: 18px;
    height: 18px;
    background-position: -173px -185px;
}

body {
    background-color: #f2f2f2;
}
<%}%>
</style>
</head>
<% if((strMainMenuAlign.compareTo("LEFT")==0)||(strMainMenuAlign.compareTo("")==0)){ %>
<%@include file="templ_appindexview_left_mg02.jsp"%>
<%return ;} %>
<% if(strMainMenuAlign.compareTo("TOP")==0){ %>
<%@include file="templ_appindexview_top.jsp"%>
<%return ;} %>