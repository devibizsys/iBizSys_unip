<%@page contentType="text/html;charset=UTF-8"%>
<%
	boolean bEnableQuickSearch = vc.getAttribute("UI.ENABLEQUICKSEARCH",false);
	boolean bEnableSearch = vc.getAttribute("UI.ENABLESEARCH",false);
	boolean bHasToolbar = vc.getAttribute("UI.CTRL.TOOLBAR",false);
%>
<%if (!bEmbedMode) {%>
<title><%=vc.getTitle(true)%></title>
<style>
html,body{ 
margin:0px; 
 
} 
</style>
</head>
<body  style="background-color:#fff"   >
<%}%>
<!-- BEGIN CONTENT -->
<div   id="<%=strCId%>" style='<%if (!bEmbedMode && !bIFChild) {%>padding:5px 5px 0px 5px;<%}%>'>
	<div   >
		<jsp:include page="<%=strPartUrl%>" flush="true" >
			<jsp:param name="controller" value="<%=strController %>"/>
			<jsp:param name="cid" value="<%=strCId%>"/>
			<jsp:param name="embed" value="<%=strEmbed%>"/>
			<jsp:param name="ctrlid" value="meditviewpanel"/>
		</jsp:include>
	</div>
</div>