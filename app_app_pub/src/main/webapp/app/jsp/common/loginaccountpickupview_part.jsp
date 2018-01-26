<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-23 14:23:15
        String strPartUrl = request.getParameter("parturl");
  	String strController = request.getParameter("controller");
	String strCtrlId = request.getParameter("ctrlid");
	String strCId = request.getParameter("cid");
	String strEmbed = request.getParameter("embed");
	boolean bEmbedMode = (strEmbed.compareTo("true")==0);
	pageContext.setAttribute("cid",strCId);
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ibiz5" uri="http://www.ibizsys.cn/tags"%>
<c:set var="ctx" value="${pageContext.request.contextPath}/app" />
<c:set var="ctx2" value="${pageContext.request.contextPath}/app" />
<%@include file="loginaccountpickupview_userpart.jsp"%>
<% if(strCtrlId.compareTo("pvpanel")==0){ %>
<ul class="nav nav-tabs" id="<%=strCId%>pvpanel" style="display:none;">
	<li class="active"><a href="#<%=strCId%>pvpanel_pickupviewpanel" data-toggle="tab"></a></li>
	</ul>
 	<div class="tab-content" style="margin:10px">
		<div class="tab-pane active" id="<%=strCId%>pvpanel_pickupviewpanel"></div>
	</div>
<% return;} %>