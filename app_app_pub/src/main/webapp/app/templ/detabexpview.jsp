<%@page contentType="text/html;charset=UTF-8"%>
<%@include file="templ_header.jsp"%>
<%if (!bEmbedMode) {%>
<title><%=vc.getTitle(true)%></title>
<style>
.page-content-wrapper .page-content {
    margin-left: 0px;
    margin-top: 0px;
    min-height: 600px;
	padding: 0px 0px 0px 0px;
}
.page-container-bg-solid .page-content {
    background: #F7F7F7;
}
</style>
</head>
<body class="page-header-fixed page-quick-sidebar-over-content page-sidebar-closed-hide-logo page-container-bg-solid" style="background-color:#fff">
<%}%>
<!-- BEGIN CONTENT -->
<div class="">
	<div class="ibiz-page-content">
		<div class="portlet light bg-inverse">
			<div class="portlet-title">
				<div class="caption">
					<i class="icon-equalizer font-red-sunglo"></i>
					<span class="caption-subject font-red-sunglo bold uppercase"><%=vc.getCaption()%></span>
					<span class="caption-helper"></span>
				</div>
				<div class="actions">
					
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<!-- 导航视图 ：开始-->
					<jsp:include page="<%=strPartUrl%>" flush="true" >
						<jsp:param name="controller" value="<%=strController %>"/>
						<jsp:param name="cid" value="<%=strCId%>"/>
						<jsp:param name="embed" value="<%=strEmbed%>"/>
						<jsp:param name="ctrlid" value="exptab"/>
					</jsp:include>     
					<!-- 导航视图：结束 -->
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END CONTENT -->