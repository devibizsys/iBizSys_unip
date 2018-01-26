<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2018-01-20 19:13:49
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
<%@include file="potal_userpart.jsp"%>
<% if(strCtrlId.compareTo("dashboard")==0){ %>
 <div id="<%=strCId%>dashboard">
<div class="col-md-12">
<div class=" col-xs-6 col-sm-6 col-md-6 col-lg-6" id="<%=strCId%>db_myworklist">
    <!-- BEGIN PORTLET-->
   <div class="portlet light ">
		<div class="portlet-title">
			<div class="caption">
				<i class="icon-bar-chart font-green-sharp hide"></i>
				<span class="caption-subject font-green-sharp uppercase">我的待办工作</span>
				<span class="caption-helper"></span>
                                <a href="#" class="<%=strCId%>more_list">更多>></a>
			</div>
	         </div>
	<div class="portlet-body">
		<div id="<%=strCId%>db_myworklist_loading">
		</div>
		<div id="<%=strCId%>db_myworklist_content" >
			<div id="<%=strCId%>db_myworklist_list" class="scroller" style="height: 300px;" data-always-visible="1" data-rail-visible="0">
			</div>
		</div>
	</div>
	</div>
	<!-- END PORTLET-->
</div>
<div class=" col-xs-6 col-sm-6 col-md-6 col-lg-6" id="<%=strCId%>db_tzgg">
    <!-- BEGIN PORTLET-->
   <div class="portlet light ">
		<div class="portlet-title">
			<div class="caption">
				<i class="icon-bar-chart font-green-sharp hide"></i>
				<span class="caption-subject font-green-sharp uppercase">通知公告</span>
				<span class="caption-helper"></span>
                                <a href="#" class="<%=strCId%>more_list">更多>></a>
			</div>
	         </div>
	<div class="portlet-body">
		<div id="<%=strCId%>db_tzgg_loading">
		</div>
		<div id="<%=strCId%>db_tzgg_content" >
			<div id="<%=strCId%>db_tzgg_list" class="scroller" style="height: 300px;" data-always-visible="1" data-rail-visible="0">
			</div>
		</div>
	</div>
	</div>
	<!-- END PORTLET-->
</div>
<div class=" col-xs-6 col-sm-6 col-md-6 col-lg-6" id="<%=strCId%>db_qxjtb">
    <!-- BEGIN PORTLET-->
   <div class="portlet light ">
		<div class="portlet-title">
			<div class="caption">
				<i class="icon-bar-chart font-green-sharp hide"></i>
				<span class="caption-subject font-green-sharp uppercase">请休假次数排行榜</span>
				<span class="caption-helper"></span>
			</div>
	         </div>
	<div class="portlet-body">
		<div id="<%=strCId%>db_qxjtb_loading">
		</div>
		<div id="<%=strCId%>db_qxjtb_content" >
			<div id="<%=strCId%>db_qxjtb_chart" class="chart" style="height: 300px;">
			</div>
		</div>
	</div>
	</div>
	<!-- END PORTLET-->
</div>
<div class=" col-xs-6 col-sm-6 col-md-6 col-lg-6" id="<%=strCId%>db_ccsqtb">
    <!-- BEGIN PORTLET-->
   <div class="portlet light ">
		<div class="portlet-title">
			<div class="caption">
				<i class="icon-bar-chart font-green-sharp hide"></i>
				<span class="caption-subject font-green-sharp uppercase">出差天数排行榜</span>
				<span class="caption-helper"></span>
			</div>
	         </div>
	<div class="portlet-body">
		<div id="<%=strCId%>db_ccsqtb_loading">
		</div>
		<div id="<%=strCId%>db_ccsqtb_content" >
			<div id="<%=strCId%>db_ccsqtb_chart" class="chart" style="height: 300px;">
			</div>
		</div>
	</div>
	</div>
	<!-- END PORTLET-->
</div>
</div>
</div>
<% return;} %>