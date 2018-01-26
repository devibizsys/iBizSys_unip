<%@page contentType="text/html;charset=UTF-8"%>
<%@include file="templ_header.jsp"%>
<% net.ibizsys.paas.web.jquery.util.PortalViewHelper pvHelper =  net.ibizsys.paas.web.jquery.util.PortalViewHelper.getInstance(vc,bEmbedMode); %>
<%if (!bEmbedMode) {%>
<title><%=vc.getTitle(true)%></title>
 <link rel="stylesheet" type="text/css" href="../../apputil/style/common/set.css"/>
 <link rel="stylesheet" type="text/css" href="../../apputil/style/plugin/chosen.css"/>
 <link rel="stylesheet" type="text/css" href="../../apputil/style/page/index.css"/>
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
.portlet.light {
  padding: 5px 5px 5px 5px;
  background-color: #fff;
}

/* Basic portlet */
.portlet {
  margin-bottom: 5px;
  padding: 0px;
}

</style>
</head>
<body class="page-header-fixed page-quick-sidebar-over-content page-sidebar-closed-hide-logo page-container-bg-solid" style="background-color:#fff;">
<%}%>
<!-- BEGIN CONTENT -->
 <script src="../../apputil/portal_part.js"></script>
<div class="ibiz-page-content  bg-inverse" >
		<div   style="width:1000px;margin:0 auto;">
			<div class="row">
				<!-- 输出左侧 -->
				<%if(pvHelper.getLeftColCount()>0){ %>
				<div class="col-md-<%=pvHelper.getLeftColCount()%> " style="padding-right:5px;" >
					<%for(String strCtrlId:pvHelper.getLeftColCtrls()){ %>		
					<div class="row">
						<!-- 数据看板 ：开始-->
						<jsp:include page="<%=strPartUrl%>" flush="true" >
							<jsp:param name="parturl" value="<%=strPartUrl%>"/>
							<jsp:param name="controller" value="<%=strController %>"/>
							<jsp:param name="cid" value="<%=strCId%>"/>
							<jsp:param name="embed" value="<%=strEmbed%>"/>
							<jsp:param name="ctrlid" value="<%=strCtrlId%>"/>
						</jsp:include>     
						<!-- 数据看板：结束 -->
					</div>
					<%} %>
				</div>
				<%} %>
				<!-- 输出中间 -->
				<%if(pvHelper.getCenterColCount()>0){ %>
				<div class="col-md-<%=pvHelper.getCenterColCount()%>" style="padding-left:5px;">
					<%for(String strCtrlId:pvHelper.getCenterColCtrls()){ %>		
					<div class="row">
						<!-- 数据看板 ：开始-->
						<jsp:include page="<%=strPartUrl%>" flush="true" >
							<jsp:param name="parturl" value="<%=strPartUrl%>"/>
							<jsp:param name="controller" value="<%=strController %>"/>
							<jsp:param name="cid" value="<%=strCId%>"/>
							<jsp:param name="embed" value="<%=strEmbed%>"/>
							<jsp:param name="ctrlid" value="<%=strCtrlId%>"/>
						</jsp:include>     
						<!-- 数据看板：结束 -->
					</div>
					<%} %>
				</div>
				<%} %>
				<!-- 输出右侧-->
				<%if(pvHelper.getRightColCount()>0){ %>
				<div class="col-md-<%=pvHelper.getRightColCount()%>">
					<%for(String strCtrlId:pvHelper.getRightColCtrls()){ %>		
					<div class="row">
						<!-- 数据看板 ：开始-->
						<jsp:include page="<%=strPartUrl%>" flush="true" >
							<jsp:param name="parturl" value="<%=strPartUrl%>"/>
							<jsp:param name="controller" value="<%=strController %>"/>
							<jsp:param name="cid" value="<%=strCId%>"/>
							<jsp:param name="embed" value="<%=strEmbed%>"/>
							<jsp:param name="ctrlid" value="<%=strCtrlId%>"/>
						</jsp:include>     
						<!-- 数据看板：结束 -->
					</div>
					<%} %>
				</div>
				<%} %>
			</div>
		</div>
	</div>
<!-- END CONTENT -->