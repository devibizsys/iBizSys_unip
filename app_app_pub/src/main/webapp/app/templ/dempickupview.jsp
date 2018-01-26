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
<body style="background-color:#fff">
<%}%>
<!-- BEGIN CONTENT -->
<div class="ibiz-fill ibiz-layout" style="padding:10px;">
	<div class="ibiz-layout" data-ibiz-layout="region:'center'">
		<div id="<%=strCId%>resultbar" data-ibiz-layout="region:'east',width:'260'" class="input-group ibiz-layout" style="float: right; width:260px; ">
			<div data-ibiz-layout="region:'west',width:'40'">
				<div  class="input-group-addon btn-group-vertical" style="border-color:transparent;background:transparent;position:absolute;top:50%; height:180px; margin-top:-90px;">
					<a href="javascript:void(0)" title="选中" class="ibiz-id-right btn btn-icon-only">
						<i class="fa fa-angle-right"  style="font-size: 26px;font-weight: bold;"></i>
					</a>
					<a href="javascript:void(0)" title="取消" class="ibiz-id-left btn btn-icon-only">
						<i class="fa fa-angle-left" style="font-size: 26px;font-weight: bold;"></i>
					</a>
					
					<a href="javascript:void(0)" title="全部选中" class="ibiz-id-rightall btn btn-icon-only">
						<i class="fa fa-angle-double-right" style="font-size: 26px;font-weight: bold;" ></i>
					</a>
					
					<a href="javascript:void(0)" title="全部取消" class="ibiz-id-leftall btn btn-icon-only">
						<i class="fa fa-angle-double-left" style="font-size: 26px;font-weight: bold;"></i>
					</a>
				</div>
			</div>
			<select data-ibiz-layout="region:'center'" class="ibiz-id-select ibiz-ctrl-border" multiple=""></select>
		</div>
		<div class="ibiz-layout" data-ibiz-layout="region:'center'" style="padding-left:5px;">
				<div style="overflow:hidden;" data-ibiz-layout="region:'center'" data-ibiz-layout-item="<%=strCId%>pvpanel">
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
     <div class=" ibiz-pickupview-action" data-ibiz-layout="region:'south', height: '60'">
		<div style="float:right;padding:10px;">
				<button id="<%=strCId%>okbtn"  class="btn blue">确定</button>
				<button id="<%=strCId%>cancelbtn"  class="btn default">取消</button>
		</div>
	</div> 
</div>
<!-- END CONTENT -->
