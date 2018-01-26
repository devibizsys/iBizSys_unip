<%@page contentType="text/html;charset=UTF-8"%>
<%@include file="templ_header.jsp"%>
<%

%>
<%if (!bEmbedMode) {%>
<title><%=vc.getTitle(true)%></title>
<style>
	.page-content-wrapper .page-content {
    margin-left: 0px;
    margin-top: 0px;
    min-height: 600px;
   /*  padding: 25px 20px 10px 20px; */
   
}
.page-container-bg-solid .page-content {
    background: #fff;
}

.fixed-table-toolbar {
    height: 4px;
    background-color: #fff;
}
</style>
</head>
<body class="page-header-fixed page-quick-sidebar-over-content page-sidebar-closed-hide-logo page-container-bg-solid" style="background-color:#fff">
<%}%>
<!-- BEGIN CONTENT -->
<div class="">
	<div class="ibiz-page-content">
<%if (!bEmbedMode) {%>
		<!-- BEGIN PAGE HEADER-->
		<h3 class="page-title"><%=vc.getCaption(true)%><small>&nbsp;<%=vc.getSubCaption(true)%></small></h3>
		<!-- END PAGE HEADER-->
		<%}%>
		<!-- 表格2 -->
		<div id="<%=strCId%>wftimeline">
			
		</div>
		<!-- 表格-->
		<h3 class="timeline-body-title font-blue-madison" id="<%=strCId%>wficonview_cap"><small>&nbsp;当前处理人</small></h3>
		<div id="<%=strCId%>wficonview">
			
		</div>
		
	</div>
</div>
<!-- END CONTENT -->