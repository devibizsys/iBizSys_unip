<%@page contentType="text/html;charset=UTF-8"%>
<%
	boolean bShowDataInfoBar = vc.getAttribute("UI.SHOWDATAINFOBAR",false);
	boolean bShowTopToolbar = false;

	boolean bShowToolBar = vc.getAttribute("UI.CTRL.TOOLBAR",false);
%>
<!-- BEGIN CONTENT -->
<div style='padding:0px;'>
	<div >
		<!-- BEGIN FORM-->
          <jsp:include page="<%=strPartUrl%>" flush="true" >
			<jsp:param name="controller" value="<%=strController %>"/>
			<jsp:param name="cid" value="<%=strCId%>"/>
			<jsp:param name="embed" value="<%=strEmbed%>"/>
			<jsp:param name="ctrlid" value="form"/>
		</jsp:include>           
		<!-- END FORM-->
		<% if(bShowToolBar) {%>
		<div  class="form-actions" style="position: fixed;top: 5px;right: 10px;z-index: 233;" >
				<jsp:include page="<%=strPartUrl%>" flush="true" >
					<jsp:param name="controller" value="<%=strController %>"/>
					<jsp:param name="cid" value="<%=strCId%>"/>
					<jsp:param name="embed" value="<%=strEmbed%>"/>
					<jsp:param name="ctrlid" value="toolbar"/>
				</jsp:include>     
		</div>   
		<%} %>  
	</div>
</div>
<!-- END CONTENT -->