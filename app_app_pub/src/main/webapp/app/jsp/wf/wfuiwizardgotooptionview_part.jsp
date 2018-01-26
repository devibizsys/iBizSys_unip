<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-23 14:20:15
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
<%@include file="wfuiwizardgotooptionview_userpart.jsp"%>
<% if(strCtrlId.compareTo("form")==0){ %>
 <div id="<%=strCId%>form" class="form-horizontal">
   <div class="col-md-12  form-body">
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>M10"><INPUT type="hidden" name="srforikey" id="<%=strCId%>Mf"><INPUT type="hidden" name="srfkey" id="<%=strCId%>Me"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>Md"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>Mc"><INPUT type="hidden" name="srfuf" id="<%=strCId%>Mb"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>Ma"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>M9"><INPUT type="hidden" name="actionmode" id="<%=strCId%>M5"><INPUT type="hidden" name="actionparam" id="<%=strCId%>M7"><INPUT type="hidden" name="wfuiwizardid" id="<%=strCId%>M8">
<div class="tab_title"><a href="#<%=strCId%>form_formpage1_tab">基本信息</a></div>
  <div id="<%=strCId%>M3" name="group1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group1_text"  style="height:40px;" ><h5>工作流跳转操作向导信息</h5></div>
</div>
<div id="<%=strCId%>M3_gd" >
<div id='<%=strCId%>M4__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div style="margin-left:10px;" >
		<div id="<%=strCId%>M4_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>M4" name="datainfo"  type="text"  class="form-control" ></textarea>
<div class="input-group-btn ibiz-id-dropdown">
	<button type="button" class="btn default dropdown-toggle"
		data-toggle="dropdown">
		<i class="fa fa-angle-down"></i>
		</button>
	<ul class="ibiz-id-dropdownmenu dropdown-menu pull-right">
	</ul>
</div>
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M6__fi' style="" class="ibiz-form-formitem  col-md-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M6__lb' class="control-label" style="width:130px;"  >调整步骤值</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M6_c" style="" ><SELECT id="<%=strCId%>M6" name="wfstepvalue" class="form-control ibiz-field-dropdownlist"></SELECT></div>
	</div>
</div>
</div>
</fieldset>
</div>
  
</div>
</div>
<% return;} %>
