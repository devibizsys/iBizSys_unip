<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="ibiz5" uri="http://www.ibizsys.cn/tags"%>
<%
	boolean bEnableQuickSearch = vc.getAttribute("UI.ENABLEQUICKSEARCH",false);
	boolean bEnableSearch = vc.getAttribute("UI.ENABLESEARCH",false);
	boolean bHasToolbar = vc.getAttribute("UI.CTRL.TOOLBAR",false);
	int bViewMinWidth = vc.getAttribute("MINWIDTH",0);
%>
<%if (!bEmbedMode) {%>
<title><%=vc.getTitle(true)%></title>
<style>
html,body{ 
margin:0px; 
height:100%; 
} 
</style>
</head>
<body  style="background-color:#fff" class="<%if (!bEmbedMode) {%>ibiz-body-fill<%} %>" >
<%}%>
<!-- BEGIN CONTENT -->
<div class="ibiz-page-content ibiz-layout <%if (!bEmbedMode) {%>ibiz-fill<%} %>" id="<%=strCId%>" style='<%if (!bEmbedMode && !bIFChild) {%>padding:5px 5px 0px 5px;<%}%>'>
	<%if (!bEmbedMode && !bIFChild) {%>
	<div data-ibiz-layout="region:'north', height: '50'" style="height:50px;">
		<!-- BEGIN PAGE HEADER-->
		<div id="<%=strCId%>caption" class="caption ibiz-id-caption" style="height:40px;padding:10px;border-bottom:1px solid #e5e5e5;">
				<i class="ibiz-id-icon icon-equalizer text-red"></i>
				<span class="ibiz-id-title caption-subject text-red bold " style="font-size:20px;"><%=vc.getCaption(true)%>&nbsp;&nbsp;&nbsp;</span>
				<span class="ibiz-id-content caption-helper" style="font-size:16px;"><%=vc.getSubCaption(true)%></span>
		</div>
		<!-- END PAGE HEADER-->
	</div>
	<%}%>
	<div class="ibiz-layout" data-ibiz-layout="region:'center'" style='<%if (bViewMinWidth!=0){%>min-width:<%=bViewMinWidth%>px;overflow:auto !important;<%} %>'>
		<%if(bHasToolbar || bEnableQuickSearch) {%>
		<div style="font: 0px/0px sans-serif;clear: both;display: block;" data-ibiz-layout="region:'north',height:'40'"> 
			<div class="col-md-9 col-sm-9 col-xs-9" style="padding-left: 2px;">
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
			<div class="col-md-3 col-sm-3 col-xs-3 " style="padding-right: 15px;" >
				<div class="input-group input-medium pull-right">
					<input id="<%=strCId%>searchcond" type="text" class="form-control">
					<span class="input-group-btn" style="padding-right:8px">
						<button id="<%=strCId%>searchbutton" type="submit" class="btn green"><i class="fa fa-search"></i></button>
					</span>
					<%if(bEnableSearch){ %>
					<span class="input-group-btn">
						<button id="<%=strCId%>moresearchbutton" type="submit" class="btn"><ibiz5:message code="CONTROL.QUICKSEARCH.MORE" text="更多"></ibiz5:message></button>
					</span>
					<%} %>					
				</div>
			</div>
			<%} %>
		</div>
		<%} %>
		<div class="ibiz-layout" data-ibiz-layout="region:'center'">
			<!--搜索面板-->
			<div data-ibiz-layout="region:'north',height:'auto'" data-ibiz-layout-item="searchform">
				<div style="clear: both;display: block;padding-top:4px;padding-left:0px;" class="col-md-12 ">
					<jsp:include page="<%=strPartUrl%>" flush="true" >
						<jsp:param name="controller" value="<%=strController %>"/>
						<jsp:param name="cid" value="<%=strCId%>"/>
						<jsp:param name="embed" value="<%=strEmbed%>"/>
						<jsp:param name="ctrlid" value="searchform"/>
					</jsp:include>
				</div>
			</div>
			<!-- 表格-->
			<div data-ibiz-layout="region:'center'" data-ibiz-layout-item="grid">
				<jsp:include page="<%=strPartUrl%>" flush="true" >
					<jsp:param name="controller" value="<%=strController %>"/>
					<jsp:param name="cid" value="<%=strCId%>"/>
					<jsp:param name="embed" value="<%=strEmbed%>"/>
					<jsp:param name="ctrlid" value="grid"/>
				</jsp:include>
			</div>
		</div>
	</div>
	<!-- END PAGE CONTENT-->
</div>