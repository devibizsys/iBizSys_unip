<%@page contentType="text/html;charset=UTF-8"%>
<%@include file="templ_header.jsp"%>
<%
if (!bEmbedMode)
{
%>
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
	<!-- BEGIN PVPANEL-->
	<div class="ibiz-layout" data-ibiz-layout="region:'center'">
		<div class="ibiz-ctrl-border ibiz-layout" data-ibiz-layout="region:'west',width:'230'" data-ibiz-layout-item="treeexpbar" style='float: left; width:230px;'>
				<div id="<%=strCId%>treeexpbar"  class="ibiz-layout" data-ibiz-layout="region:'center'" >
					<!-- 
					<div data-ibiz-layout="region:'north',height:'30'" style='padding:2px;'>
						<select style='width:100%;'></select>
					</div>
					 -->
					<div  data-ibiz-layout="region:'center',width:'230'" data-ibiz-layout-item="treeexpbar_tree" style='width:230px;'>
						<div id="<%=strCId%>treeexpbar_tree">
						</div>
					</div>
				</div>
		</div>
		<div class="ibiz-layout" data-ibiz-layout="region:'center'" style="padding-left:5px;">
			<div style="overflow:hidden;" data-ibiz-layout="region:'center'" data-ibiz-layout-item="pvpanel">
				<!-- 导航视图 ：开始-->
				<jsp:include page="<%=strPartUrl%>" flush="true" >
					<jsp:param name="controller" value="<%=strController %>"/>
					<jsp:param name="cid" value="<%=strCId%>"/>
					<jsp:param name="embed" value="<%=strEmbed%>"/>
					<jsp:param name="ctrlid" value="pvpanel"/>
				</jsp:include>    
				<!-- 导航视图：结束 -->
			</div>
		</div>
	</div>
	<!-- END PVPANEL-->
     <div class=" ibiz-pickupview-action" data-ibiz-layout="region:'south', height: '60'" >
		<div style="float:right;padding:10px;">
				<button id="<%=strCId%>okbtn"  class="btn blue">确定</button>
				<button id="<%=strCId%>cancelbtn"  class="btn default">取消</button>
		</div>
	</div> 
</div>
<!-- END CONTENT -->