<%@page contentType="text/html;charset=UTF-8"%>
<%@include file="templ_header.jsp"%>
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
<div class="ibiz-page-content ibiz-layout <%if (!bEmbedMode) {%>ibiz-fill<%} %>" id="<%=strCId%>" style='padding:5px 5px 0px 5px;'>
	<div data-ibiz-layout="region:'north', height: '50'" >
		<div id="<%=strCId%>caption" class="caption ibiz-id-caption" style="height:40px;padding:10px;border-bottom:1px solid #e5e5e5;">
				<i class="ibiz-id-icon icon-equalizer text-red"></i>
				<span class="ibiz-id-title caption-subject text-red bold" style="font-size:20px;"><%=vc.getCaption(true)%>&nbsp;&nbsp;&nbsp;</span>
				<span class="ibiz-id-content caption-helper" style="font-size:16px;"><%=vc.getSubCaption(true)%></span>
		</div>
	</div>                                                              

	<div class="ibiz-layout" data-ibiz-layout="region:'center'" >
		<div data-ibiz-layout="region:'west',width:'230'" data-ibiz-layout-item="expbar" style='float: left; width:240px;' >
			<div id="<%=strCId%>expbar"></div>
		</div>
		<div class="ibiz-layout" data-ibiz-layout="region:'center'" style="padding-left:5px;">
			<div style="overflow:hidden;height:auto;" data-ibiz-layout="region:'center'" data-ibiz-layout-item="exptab" >
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
<!-- END CONTENT -->