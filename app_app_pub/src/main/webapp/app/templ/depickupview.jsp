<%@page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="ibiz5" uri="http://www.ibizsys.cn/tags"%>
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
<body style="background-color: #fff;">
<%}%>
<!-- BEGIN CONTENT -->
<div class="ibiz-fill ibiz-layout" style="padding:10px;">
	<div class="ibiz-layout" data-ibiz-layout="region:'center'" style="padding-left:5px;"  data-ibiz-layout-item="pvpanel">
		<jsp:include page="<%=strPartUrl%>" flush="true" >
			<jsp:param name="controller" value="<%=strController %>"/>
			<jsp:param name="cid" value="<%=strCId%>"/>
			<jsp:param name="embed" value="<%=strEmbed%>"/>
			<jsp:param name="ctrlid" value="pvpanel"/>
		</jsp:include>       
	</div>
     <div class=" ibiz-pickupview-action" data-ibiz-layout="region:'south', height: '60'" >
		<div style="float:right;padding:10px;">
				<button id="<%=strCId%>okbtn"  class="btn blue"><ibiz5:message code="PAGE.COMMON.PICKUPVIEW.OKBTN.TEXT" text="确定"></ibiz5:message></button>
				<button id="<%=strCId%>cancelbtn"  class="btn default"><ibiz5:message code="PAGE.COMMON.PICKUPVIEW.CANCELBTN.TEXT" text="取消"></ibiz5:message></button>
		</div>
	</div> 
</div>
<!-- END CONTENT -->
