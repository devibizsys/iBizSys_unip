<%@page contentType="text/html;charset=UTF-8"%>
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
<div class="ibiz-page-content ibiz-layout <%if (!bEmbedMode) {%>ibiz-fill<%} %>" id="<%=strCId%>" style='<%if (!bEmbedMode) {%>padding:5px 5px 0px 5px;<%}%>'>
<%if (!bEmbedMode) {%>
	<div data-ibiz-layout="region:'north', height: '50'" style="height:50px;">
		<!-- BEGIN PAGE HEADER-->
		<div id="<%=strCId%>caption" class="caption ibiz-id-caption" style="height:40px;padding:10px;border-bottom:1px solid #e5e5e5;">
				<i class="ibiz-id-icon icon-equalizer font-red-sunglo"></i>
				<span class="ibiz-id-title caption-subject font-red-sunglo bold uppercase" style="font-size:20px;"><%=vc.getCaption(true)%>&nbsp;&nbsp;&nbsp;</span>
				<span class="ibiz-id-content caption-helper" style="font-size:16px;"><%=vc.getSubCaption(true)%></span>
		</div>
		<!-- END PAGE HEADER-->
	</div>
	<%}%>
	<!-- 树视图-->
	<div class="ibiz-ctrl-border" data-ibiz-layout="region:'center'" data-ibiz-layout-item="tree">
		<jsp:include page="<%=strPartUrl%>" flush="true" >
				<jsp:param name="controller" value="<%=strController %>"/>
				<jsp:param name="cid" value="<%=strCId%>"/>
				<jsp:param name="embed" value="<%=strEmbed%>"/>
				<jsp:param name="ctrlid" value="tree"/>
		</jsp:include>
	</div>
</div>
<!-- END CONTENT -->