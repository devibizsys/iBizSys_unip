<%@page contentType="text/html;charset=UTF-8"%>
<%
	boolean bEnableQuickSearch = vc.getAttribute("UI.ENABLEQUICKSEARCH",false);
	boolean bEnableSearch = vc.getAttribute("UI.ENABLESEARCH",false);
	boolean bHasToolbar = vc.getAttribute("UI.CTRL.TOOLBAR",false);
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
		<%if(bHasToolbar || bEnableQuickSearch) {%>
		<div style="font: 0px/0px sans-serif;clear: both;display: block;"> 
			<div class="col-md-9" style="padding-left: 2px;">
			<%if(bHasToolbar){ %>
			<!-- 工具栏 -->
				<jsp:include page="<%=strPartUrl%>" flush="true" >
					<jsp:param name="controller" value="<%=strController %>"/>
					<jsp:param name="cid" value="<%=strCId%>"/>
					<jsp:param name="embed" value="<%=strEmbed%>"/>
					<jsp:param name="ctrlid" value="toolbar"/>
				</jsp:include>
			<%} %>
			</div>
			<%if(bEnableQuickSearch){ %>
			<!-- 搜索栏  -->
			<div class="col-md-3 " style="padding-right: 15px;" >
				<div class="input-group input-medium pull-right">
					<input id="<%=strCId%>searchcond" type="text" class="form-control">
					<span class="input-group-btn" style="padding-right:8px">
						<button id="<%=strCId%>searchbutton" type="submit" class="btn green"><i class="fa fa-search"></i></button>
					</span>
					<%if(bEnableSearch){ %>
					<span class="input-group-btn">
						<button id="<%=strCId%>moresearchbutton" type="submit" class="btn">更多</button>
					</span>
					<%} %>					
				</div>
			</div>
			<%} %>
		</div>
		<%} %>
		<!--搜索面板-->
		<div style="clear: both;display: block;padding-top:4px;padding-left:0px;" class="col-md-12 ">
			<jsp:include page="<%=strPartUrl%>" flush="true" >
				<jsp:param name="controller" value="<%=strController %>"/>
				<jsp:param name="cid" value="<%=strCId%>"/>
				<jsp:param name="embed" value="<%=strEmbed%>"/>
				<jsp:param name="ctrlid" value="searchform"/>
			</jsp:include>
		</div>
		<!-- 表格-->
		<div >
			<jsp:include page="<%=strPartUrl%>" flush="true" >
				<jsp:param name="controller" value="<%=strController %>"/>
				<jsp:param name="cid" value="<%=strCId%>"/>
				<jsp:param name="embed" value="<%=strEmbed%>"/>
				<jsp:param name="ctrlid" value="dataview"/>
			</jsp:include>
		</div>
		<!--  -->
		
		<!-- END PAGE CONTENT-->
	</div>
</div>
<!-- END CONTENT -->