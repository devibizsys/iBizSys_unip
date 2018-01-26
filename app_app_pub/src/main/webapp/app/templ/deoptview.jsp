<%@page contentType="text/html;charset=UTF-8"%>
<%@include file="templ_header.jsp"%>
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
