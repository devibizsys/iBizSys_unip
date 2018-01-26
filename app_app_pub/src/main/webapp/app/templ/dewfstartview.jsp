<%@page contentType="text/html;charset=UTF-8"%>
<%@include file="templ_header.jsp"%>
<%
	boolean bShowDataInfoBar = vc.getAttribute("UI.SHOWDATAINFOBAR",false);
%>
<%if (!bEmbedMode) {%>
<title><%=vc.getTitle(true)%></title>
<style>
html,body{ 
margin:0px; 
} 
</style>
</head>
<body class="" style="background-color:#fff">
<%}%>
<!-- BEGIN CONTENT -->
<div style='padding:5px;'>
	<%if(bShowDataInfoBar){ %>
	<div data-ibiz-layout="region:'north', height: '50'" style='height:50px;' >
		<!-- BEGIN PAGE HEADER-->
		<div id="<%=strCId%>caption" class="caption ibiz-id-caption" style="height:40px;padding:10px;border-bottom:1px solid #e5e5e5;">
				<i class="ibiz-id-icon icon-equalizer font-red-sunglo"></i>
				<span class="ibiz-id-title caption-subject font-red-sunglo bold uppercase" style="font-size:20px;"><%=vc.getCaption(true)%>&nbsp;&nbsp;&nbsp;</span>
				<span class="ibiz-id-content caption-helper" style="font-size:16px;"></span>
		</div>
		<!-- END PAGE HEADER-->
	</div> 
	<%}%>
	<div >
		<!-- BEGIN FORM-->
          <jsp:include page="<%=strPartUrl%>" flush="true" >
			<jsp:param name="controller" value="<%=strController %>"/>
			<jsp:param name="cid" value="<%=strCId%>"/>
			<jsp:param name="embed" value="<%=strEmbed%>"/>
			<jsp:param name="ctrlid" value="form"/>
		</jsp:include>           
		<!-- END FORM-->
          	<div  class="form-actions" style="float:right;padding:10px;padding-top:5px;" >
				<div style="float:right">
					<button id="<%=strCId%>okbtn"  class="btn blue">确定</button>
					<button id="<%=strCId%>cancelbtn"  class="btn default">取消</button>
				</div> 
			</div>     
	</div>
</div>