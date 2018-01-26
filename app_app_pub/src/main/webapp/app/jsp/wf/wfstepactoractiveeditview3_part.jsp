<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-23 14:20:03
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
<%@include file="wfstepactoractiveeditview3_userpart.jsp"%>
<% if(strCtrlId.compareTo("toolbar")==0){ %>
 <div id="<%=strCId%>toolbar">
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message>"  data-ibiz-tag="SaveAndExit" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-saveandclose"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.CLOSE" text="关闭"></ibiz5:message>"  data-ibiz-tag="Exit" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-sign-out"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.CLOSE" text="关闭"></ibiz5:message></span>  </button>  
</div>
<% return;} %>
<% if(strCtrlId.compareTo("form")==0){ %>
 <div id="<%=strCId%>form" class="form-horizontal">
   <div class="col-md-12  form-body">
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>M16"><INPUT type="hidden" name="srforikey" id="<%=strCId%>M15"><INPUT type="hidden" name="srfkey" id="<%=strCId%>M14"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>M13"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>M12"><INPUT type="hidden" name="srfuf" id="<%=strCId%>M11"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>M10"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>Mf"><INPUT type="hidden" name="isfinish" id="<%=strCId%>M9"><INPUT type="hidden" name="wfstepactorid" id="<%=strCId%>Me">
<div class="tab_title"><a href="#<%=strCId%>form_formpage1_tab">基本信息</a></div>
  <div id="<%=strCId%>M5" name="grouppanel1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel1_text"  style="height:40px;" ><h5>流程操作者</h5></div>
</div>
<div id="<%=strCId%>M5_gd" >
<div id='<%=strCId%>M6__fi' style="" class="ibiz-form-formitem  col-sm-6 col-md-6 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M6__lb' class="control-label" style="width:130px;"  >操作者</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M6_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="wfstepactorname" id="<%=strCId%>M6"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M7__fi' style="" class="ibiz-form-formitem  col-sm-6 col-md-6 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M7__lb' class="control-label" style="width:130px;"  >查看时间</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M7_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="firstreadtime" id="<%=strCId%>M7"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M8__fi' style="" class="ibiz-form-formitem  col-sm-6 col-md-6 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M8__lb' class="control-label" style="width:130px;"  >是否完成</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M8_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="isfinish1" id="<%=strCId%>M8"  >
</div>
	</div>
</div>
<div id='<%=strCId%>Ma__fi' style="" class="ibiz-form-formitem  col-sm-6 col-md-6 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Ma__lb' class="control-label" style="width:130px;"  >完成时间</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>Ma_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="finishdate" id="<%=strCId%>Ma"  >
</div>
	</div>
</div>
</div>
</fieldset>
</div>
<div id="<%=strCId%>Mb" name="grouppanel2" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel2_text"  style="height:40px;" ><h5>催办信息</h5></div>
</div>
<div id="<%=strCId%>Mb_gd" >
<div id='<%=strCId%>Mc__fi' style="" class="ibiz-form-formitem  col-md-6 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mc__lb' class="control-label" style="width:130px;"  >督促次数</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>Mc_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="remindercount" id="<%=strCId%>Mc"  >
</div>
	</div>
</div>
<div id='<%=strCId%>Md__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="0">
	<div style="margin-left:10px;" >
		<div id="<%=strCId%>Md_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Md" name="remindmemo"  type="text"  class="form-control" ></textarea>
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
</div>
</fieldset>
</div>
  
</div>
</div>
<% return;} %>
<% if(strCtrlId.compareTo("drtab_header")==0){ %>
<ul class="nav nav-tabs" id="<%=strCId%>drtab" >
<li class="active"><a href="#<%=strCId%>drtab_form" data-toggle="tab">工作流步骤操作者</a></li>
<li id="<%=strCId%>drtab_h_DRITEM1"><a href="#<%=strCId%>drtab_DRITEM1" data-toggle="tab">催办历史</a></li>
</ul>
<% return;} %>
<% if(strCtrlId.compareTo("drtab_content")==0){ %>
<div class="tab-pane " id="<%=strCId%>drtab_DRITEM1"></div>
<% return;} %>
