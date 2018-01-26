<%@page contentType="text/html;charset=UTF-8"%>
<%
	boolean bShowDataInfoBar = vc.getAttribute("UI.SHOWDATAINFOBAR",false);
	boolean bShowTopToolbar = false;
%>
<%if (!bEmbedMode) {%>
<title><%=vc.getTitle(true)%></title>
<style>
html,body{ 
margin:0px; 
} 
</style>
</head>
<body class="<%if (!bEmbedMode) {%>ibiz-body-fill<%} %>" style="background-color:#f1f1f1;">
<%if(bShowDataInfoBar && bShowTopToolbar){ %>
<div class="scroll-to-top ibiz-float-toolbar" style="display:none;height:50px;">
	<div id="<%=strCId%>floattoolbar" class="actions">
		<a data-ibiz-tag="Save" class="ibiz-toolbar-item btn btn-circle btn-icon-only btn-default" href="javascript:;">
			<i class="icon-cloud-upload"></i>
		</a>
		<a data-ibiz-tag="Print" class="ibiz-toolbar-item btn btn-circle btn-icon-only btn-default" href="javascript:;">
			<i class="icon-wrench"></i>
		</a>
		<a data-ibiz-tag="Remove" class="ibiz-toolbar-item btn btn-circle btn-icon-only btn-default" href="javascript:;">
			<i class="icon-trash"></i>
		</a>
	</div>
</div>
<%}%>
<%}%>
<!-- BEGIN CONTENT -->
<div class="edit_header">
	<%if(bShowDataInfoBar){ %>
	<div data-ibiz-layout="region:'north', height: '45'" style='height:45px;' >
		<!-- BEGIN STYLE CUSTOMIZER -->
		<%if(bShowTopToolbar){ %>
		<div class="theme-panel hidden-xs hidden-sm" style="height:40px;margin:2px;width:130px;">
			<div id="<%=strCId%>mintoolbar" class="actions">
					<a data-ibiz-tag="Save" class="ibiz-toolbar-item btn btn-circle btn-icon-only btn-default" href="javascript:;">
						<i class="icon-cloud-upload"></i>
					</a>
					<a data-ibiz-tag="Print" class="ibiz-toolbar-item btn btn-circle btn-icon-only btn-default" href="javascript:;">
						<i class="icon-wrench"></i>
					</a>
					<a data-ibiz-tag="Remove" class="ibiz-toolbar-item btn btn-circle btn-icon-only btn-default" href="javascript:;">
						<i class="icon-trash"></i>
					</a>
			</div>
		</div>
		<%} %>
		<!-- END STYLE CUSTOMIZER -->
		<!-- BEGIN PAGE HEADER-->
		<div id="<%=strCId%>caption" class="caption ibiz-id-caption" style="height:45px;padding:7px 10px 10px 7px;">
				<i class="fa fa-cubes text-blue"></i>
				<span class="ibiz-id-title caption-subject text-red" style="font-size:20px;margin-left:3px;color:#555 !important;"><%=vc.getCaption(true)%>&nbsp;&nbsp;&nbsp;</span>
				<span class="ibiz-id-content caption-helper" style="font-size:15px;position: absolute;top: 16px;"></span>
		</div>
		<!-- END PAGE HEADER-->
	</div> 
	<%}%>
</div>
<div style="margin-top:50px;"> 
	<!-- BEGIN FORM-->
         <jsp:include page="<%=strPartUrl%>" flush="true" >
		<jsp:param name="controller" value="<%=strController %>"/>
		<jsp:param name="cid" value="<%=strCId%>"/>
		<jsp:param name="embed" value="<%=strEmbed%>"/>
		<jsp:param name="ctrlid" value="form"/>
	</jsp:include>           
	<!-- END FORM-->
    	<div  class="form-actions" style="position: fixed;top: 10px;right: 20px;z-index: 233;" >
			<jsp:include page="<%=strPartUrl%>" flush="true" >
				<jsp:param name="controller" value="<%=strController %>"/>
				<jsp:param name="cid" value="<%=strCId%>"/>
				<jsp:param name="embed" value="<%=strEmbed%>"/>
				<jsp:param name="ctrlid" value="toolbar"/>
			</jsp:include>     
	</div>     
</div>
<!-- END CONTENT -->