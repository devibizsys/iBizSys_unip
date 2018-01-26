<%@page contentType="text/html;charset=UTF-8"%>
<%@include file="templ_header.jsp"%>
<%
	boolean bEnableExpTreeCat = vc.getAttribute("UI.ENABLEEXPTREECAT",false);
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
<div class="ibiz-page-content ibiz-layout <%if (!bEmbedMode) {%>ibiz-fill<%} %>" id="<%=strCId%>" style='padding:5px 5px 0px 5px;'>
	<div data-ibiz-layout="region:'north', height: '50'" >
		<div id="<%=strCId%>caption" class="caption ibiz-id-caption" style="height:40px;padding:10px;border-bottom:1px solid #e5e5e5;">
				<i class="ibiz-id-icon icon-equalizer font-red-sunglo"></i>
				<span class="ibiz-id-title caption-subject font-red-sunglo bold uppercase" style="font-size:20px;"><%=vc.getCaption(true)%>&nbsp;&nbsp;&nbsp;</span>
				<span class="ibiz-id-content caption-helper" style="font-size:16px;"><%=vc.getSubCaption(true)%></span>
		</div>
	</div>                                                              

	<div class="ibiz-layout" data-ibiz-layout="region:'center'" >
		<div class="ibiz-ctrl-border" data-ibiz-layout="region:'west',width:'230'" data-ibiz-layout-item="treeexpbar" style='float: left; width:230px;'>
				<div id="<%=strCId%>treeexpbar"  class="ibiz-layout" data-ibiz-layout="region:'center'" >
					<%if(bEnableExpTreeCat){%> 
					<div data-ibiz-layout="region:'north',height:'40'" style='padding:2px;'>
						<select id="<%=strCId%>treeexpbar_cat" style='width:220px;' class='form-control'></select>
					</div>
					<%} %>
					<div  data-ibiz-layout="region:'center',width:'230'" data-ibiz-layout-item="treeexpbar_tree" style='width:230px;'>
						<div id="<%=strCId%>treeexpbar_tree">
						</div>
					</div>
				</div>
		</div>
		<div class="ibiz-layout" data-ibiz-layout="region:'center'" style="padding-left:5px;">
			<iframe id="<%=strCId%>expframe"  data-ibiz-layout="region:'center'" src="" style="border:0;frameborder:0;scrolling: no;" frameborder="no" 
				border="0" 
				marginwidth="0" 
				marginheight="0" 
				scrolling="no" 
				allowtransparency="yes"></iframe>
		</div>
	</div>
</div>
<!-- END CONTENT -->