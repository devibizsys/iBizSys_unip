<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-23 14:21:44
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
<%@include file="ppmodelusereditview_userpart.jsp"%>
<% if(strCtrlId.compareTo("toolbar")==0){ %>
 <div id="<%=strCId%>toolbar">
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message>"  data-ibiz-tag="SaveAndExit" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-saveandclose"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.CLOSE" text="关闭"></ibiz5:message>"  data-ibiz-tag="Exit" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-sign-out"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.CLOSE" text="关闭"></ibiz5:message></span>  </button>  
</div>
<% return;} %>
<% if(strCtrlId.compareTo("form")==0){ %>
 <div id="<%=strCId%>form" class="form-horizontal">
   <div class="col-md-12  form-body">
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>M28"><INPUT type="hidden" name="srforikey" id="<%=strCId%>M27"><INPUT type="hidden" name="srfkey" id="<%=strCId%>M26"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>M25"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>M24"><INPUT type="hidden" name="srfuf" id="<%=strCId%>M23"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>M22"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>M21"><INPUT type="hidden" name="portalpageid" id="<%=strCId%>M5"><INPUT type="hidden" name="r1pvpartid" id="<%=strCId%>M14"><INPUT type="hidden" name="l3pvpartid" id="<%=strCId%>M15"><INPUT type="hidden" name="r2pvpartid" id="<%=strCId%>M16"><INPUT type="hidden" name="c2pvpartid" id="<%=strCId%>M17"><INPUT type="hidden" name="c4pvpartid" id="<%=strCId%>M18"><INPUT type="hidden" name="r3pvpartid" id="<%=strCId%>M19"><INPUT type="hidden" name="c1pvpartid" id="<%=strCId%>M1a"><INPUT type="hidden" name="l2pvpartid" id="<%=strCId%>M1b"><INPUT type="hidden" name="c3pvpartid" id="<%=strCId%>M1c"><INPUT type="hidden" name="ppmodelid" id="<%=strCId%>M1d"><INPUT type="hidden" name="r4pvpartid" id="<%=strCId%>M1e"><INPUT type="hidden" name="l4pvpartid" id="<%=strCId%>M1f"><INPUT type="hidden" name="l1pvpartid" id="<%=strCId%>M20">
<div class="tab_title"><a href="#<%=strCId%>form_formpage1_tab">基本信息</a></div>
  <div id="<%=strCId%>M4" name="group1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group1_text"  style="height:40px;" ><h5>门户页面模型基本信息</h5></div>
</div>
<div id="<%=strCId%>M4_gd" >
<div id='<%=strCId%>M6__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M6__lb' class="control-label" style="width:130px;"  >页面布局</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M6_c" style="" ><SELECT id="<%=strCId%>M6" name="ppmodel" class="form-control ibiz-field-dropdownlist"></SELECT></div>
	</div>
</div>
</div>
</fieldset>
</div>
<div id="<%=strCId%>M7" name="grouppanel1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel1_text"  style="height:40px;" ><h5>部件位置</h5></div>
</div>
<div id="<%=strCId%>M7_gd" >
<div id='<%=strCId%>M8__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M8__lb' class="control-label" style="width:130px;"  >左侧部件1</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M8_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="l1pvpartname" id="<%=strCId%>M8" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M9__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M9__lb' class="control-label" style="width:130px;"  >中间部件1</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M9_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="c1pvpartname" id="<%=strCId%>M9" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Ma__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Ma__lb' class="control-label" style="width:130px;"  >右侧部件1</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>Ma_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="r1pvpartname" id="<%=strCId%>Ma" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Mb__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mb__lb' class="control-label" style="width:130px;"  >左侧部件2</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>Mb_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="l2pvpartname" id="<%=strCId%>Mb" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Mc__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mc__lb' class="control-label" style="width:130px;"  >中间部件2</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>Mc_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="c2pvpartname" id="<%=strCId%>Mc" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Md__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Md__lb' class="control-label" style="width:130px;"  >右侧部件2</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>Md_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="r2pvpartname" id="<%=strCId%>Md" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Me__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Me__lb' class="control-label" style="width:130px;"  >左侧部件3</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>Me_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="l3pvpartname" id="<%=strCId%>Me" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Mf__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mf__lb' class="control-label" style="width:130px;"  >中间部件3</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>Mf_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="c3pvpartname" id="<%=strCId%>Mf" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M10__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M10__lb' class="control-label" style="width:130px;"  >右侧部件3</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M10_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="r3pvpartname" id="<%=strCId%>M10" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M11__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M11__lb' class="control-label" style="width:130px;"  >左侧部件4</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M11_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="l4pvpartname" id="<%=strCId%>M11" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M12__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M12__lb' class="control-label" style="width:130px;"  >中间部件4</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M12_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="c4pvpartname" id="<%=strCId%>M12" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M13__fi' style="" class="ibiz-form-formitem  col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M13__lb' class="control-label" style="width:130px;"  >右侧部件4</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M13_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="r4pvpartname" id="<%=strCId%>M13" autocomplete="off" />
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
