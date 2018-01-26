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
<body class="<%if (!bEmbedMode) {%>ibiz-body-fill<%} %>" style="background-color:#fff">
<%if(bShowDataInfoBar&&bShowTopToolbar){ %>
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
<div style='padding:5px;'>
	<%if(bShowDataInfoBar){ %>
	<div data-ibiz-layout="region:'north', height: '50'" style='height:50px;' >
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
		<%}%>
		<!-- END STYLE CUSTOMIZER -->
		<!-- BEGIN PAGE HEADER-->
		<div id="<%=strCId%>caption" class="caption ibiz-id-caption" style="height:40px;padding:10px;border-bottom:1px solid #e5e5e5;">
				<i class="ibiz-id-icon icon-equalizer font-red-sunglo"></i>
				<span class="ibiz-id-title caption-subject font-red-sunglo bold uppercase" style="font-size:20px;"><%=vc.getCaption(true)%>&nbsp;&nbsp;&nbsp;</span>
				<span class="ibiz-id-content caption-helper" style="font-size:16px;"></span>
		</div>
		<!-- END PAGE HEADER-->
	</div> 
	<%}%>
	<div class="col-md-12">
			<jsp:include page="<%=strPartUrl%>" flush="true" >
				<jsp:param name="controller" value="<%=strController %>"/>
				<jsp:param name="cid" value="<%=strCId%>"/>
				<jsp:param name="embed" value="<%=strEmbed%>"/>
				<jsp:param name="ctrlid" value="drtab_header"/>
			</jsp:include>     
			<div class="tab-content" >
				<div class="tab-pane active" id="<%=strCId%>drtab_form">
					<!-- BEGIN FORM-->
          			<jsp:include page="<%=strPartUrl%>" flush="true" >
						<jsp:param name="controller" value="<%=strController %>"/>
						<jsp:param name="cid" value="<%=strCId%>"/>
						<jsp:param name="embed" value="<%=strEmbed%>"/>
						<jsp:param name="ctrlid" value="form"/>
					</jsp:include>     
					<!-- END FORM-->
             		<div  class="form-actions" style="position: fixed;top: 5px;right: 10px;z-index: 233;" >
								<jsp:include page="<%=strPartUrl%>" flush="true" >
									<jsp:param name="controller" value="<%=strController %>"/>
									<jsp:param name="cid" value="<%=strCId%>"/>
									<jsp:param name="embed" value="<%=strEmbed%>"/>
									<jsp:param name="ctrlid" value="toolbar"/>
								</jsp:include>     
					</div>
				</div>
				<jsp:include page="<%=strPartUrl%>" flush="true" >
					<jsp:param name="controller" value="<%=strController %>"/>
					<jsp:param name="cid" value="<%=strCId%>"/>
					<jsp:param name="embed" value="<%=strEmbed%>"/>
					<jsp:param name="ctrlid" value="drtab_content"/>
				</jsp:include>     
		    </div>
	</div>
</div>
<!-- END CONTENT -->