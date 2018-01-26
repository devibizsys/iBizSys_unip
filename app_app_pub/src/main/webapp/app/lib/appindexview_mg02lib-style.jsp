<%@page contentType="text/html;charset=UTF-8"%>
<%
String strMainMenuAlign = p.getViewController().getAttribute("UI.MAINMENUALIGN","LEFT");
%>
<% if(strMainMenuAlign.compareTo("TOP")==0){ %>
<link href='${ctx}/assets/metronic/4.1.0/layout3/css/layout.css' rel='stylesheet' type='text/css' />
<link href='${ctx}/assets/metronic/4.1.0/layout3/css/themes/default.css' rel='stylesheet' type='text/css' />
<%} %>