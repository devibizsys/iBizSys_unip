<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-23 14:24:38
        String strPartUrl = request.getParameter("parturl");
  	String strController = request.getParameter("controller");
	String strCtrlId = request.getParameter("ctrlid");
	String strCId = request.getParameter("cid");
	String strEmbed = request.getParameter("embed");
	boolean bEmbedMode = (strEmbed.compareTo("true")==0);
	pageContext.setAttribute("cid",strCId);
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ibiz5" uri="http://www.ibizsys.cn/tags"%>
<c:set var="ctx" value="${pageContext.request.contextPath}/app" />
<c:set var="ctx2" value="${pageContext.request.contextPath}/app" />
<%@include file="userroledatadetaileditview_userpart.jsp"%>
<% if(strCtrlId.compareTo("toolbar")==0){ %>
 <div id="<%=strCId%>toolbar">
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message>"  data-ibiz-tag="SaveAndExit" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-saveandclose"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.CLOSE" text="关闭"></ibiz5:message>"  data-ibiz-tag="Exit" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-sign-out"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.CLOSE" text="关闭"></ibiz5:message></span>  </button>  
</div>
<% return;} %>
<% if(strCtrlId.compareTo("form")==0){ %>
 <div id="<%=strCId%>form" class="form-horizontal">
   <div class="col-md-12  form-body">
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>M12"><INPUT type="hidden" name="srforikey" id="<%=strCId%>M11"><INPUT type="hidden" name="srfkey" id="<%=strCId%>M10"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>Mf"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>Me"><INPUT type="hidden" name="srfuf" id="<%=strCId%>Md"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>Mc"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>Mb"><INPUT type="hidden" name="userroledataid" id="<%=strCId%>M5"><INPUT type="hidden" name="userroledatadetailid" id="<%=strCId%>M9"><INPUT type="hidden" name="querymodelid" id="<%=strCId%>Ma">
<div class="tab_title"><a href="#<%=strCId%>form_formpage1_tab">基本信息</a></div>
  <div id="<%=strCId%>M4" name="grouppanel1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel1_text"  style="height:40px;" ><h5>数据对象能力明细</h5></div>
</div>
<div id="<%=strCId%>M4_gd" >
<div id='<%=strCId%>M6__fi' style="" class="ibiz-form-formitem  col-sm-6 col-md-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M6__lb' class="control-label" style="width:130px;"  >查询模型</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M6_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="querymodelname" id="<%=strCId%>M6" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M7__fi' style="" class="ibiz-form-formitem  col-sm-6 col-md-6 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M7__lb' class="control-label" style="width:130px;"  >排除数据范围</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M7_c" style="width:100px;" ><SELECT id="<%=strCId%>M7" name="isexclude" class="form-control ibiz-field-dropdownlist"></SELECT></div>
	</div>
</div>
<div id='<%=strCId%>M8__fi' style="" class="ibiz-form-formitem  col-sm-12 col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M8__lb' class="control-label" style="width:130px;"  >备注</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M8_c" style="height:200px;" class="ibiz-field-textbox-container"><input id="<%=strCId%>M8" name="memo" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
</div>
</fieldset>
</div>
  
</div>
</div>
<% return;} %>
