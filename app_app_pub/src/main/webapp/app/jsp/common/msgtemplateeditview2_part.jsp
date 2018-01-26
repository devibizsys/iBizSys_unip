<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-23 14:25:29
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
<%@include file="msgtemplateeditview2_userpart.jsp"%>
<% if(strCtrlId.compareTo("toolbar")==0){ %>
 <div id="<%=strCId%>toolbar">
<button title="<ibiz5:message code="TBB.TOOLTIP.*.SAVE" text="保存"></ibiz5:message>"  data-ibiz-tag="Save" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-save"></i>             <span ><ibiz5:message code="TBB.TEXT.*.SAVE" text="保存"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.SAVEANDNEW" text="保存并新建"></ibiz5:message>"  data-ibiz-tag="SaveAndNew" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-saveandnew"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.SAVEANDNEW" text="保存并新建"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message>"  data-ibiz-tag="SaveAndExit" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-saveandclose"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.REMOVEANDCLOSE" text="删除并关闭"></ibiz5:message>"  data-ibiz-tag="RemoveAndExit" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-remove"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.REMOVEANDCLOSE" text="删除并关闭"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.NEW" text="新建"></ibiz5:message>"  data-ibiz-tag="New" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-file-text-o"></i>             <span ><ibiz5:message code="TBB.TEXT.*.NEW" text="新建"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.COPY" text="拷贝"></ibiz5:message>"  data-ibiz-tag="Copy" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-copy"></i>             <span ><ibiz5:message code="TBB.TEXT.*.COPY" text="拷贝"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="第一个记录"  data-ibiz-tag="FirstRecord" data-ibiz-target="SINGLEKEY"  class="btn btn-icon-only  btn-blue  ibiz-toolbar-item" >          <i class="fa fa-fast-backward"></i>               </button>  
<button title="上一个记录"  data-ibiz-tag="PrevRecord" data-ibiz-target="SINGLEKEY"  class="btn btn-icon-only  btn-blue  ibiz-toolbar-item" >          <i class="fa fa-step-backward"></i>               </button>  
<button title="下一个记录"  data-ibiz-tag="NextRecord" data-ibiz-target="SINGLEKEY"  class="btn btn-icon-only  btn-blue  ibiz-toolbar-item" >          <i class="fa fa-step-forward"></i>               </button>  
<button title="最后一个记录"  data-ibiz-tag="LastRecord" data-ibiz-target="SINGLEKEY"  class="btn btn-icon-only  btn-blue  ibiz-toolbar-item" >          <i class="fa fa-fast-forward"></i>               </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.HELP" text="帮助"></ibiz5:message>"  data-ibiz-tag="Help" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-question"></i>             <span ><ibiz5:message code="TBB.TEXT.*.HELP" text="帮助"></ibiz5:message></span>  </button>  
</div>
<% return;} %>
<% if(strCtrlId.compareTo("form")==0){ %>
 <div id="<%=strCId%>form" class="form-horizontal">
   <div class="col-md-12  form-body">
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>M1f"><INPUT type="hidden" name="srforikey" id="<%=strCId%>M1e"><INPUT type="hidden" name="srfkey" id="<%=strCId%>M1d"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>M1c"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>M1b"><INPUT type="hidden" name="srfuf" id="<%=strCId%>M1a"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>M19"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>M18"><INPUT type="hidden" name="deid" id="<%=strCId%>M17">
<ul class="nav nav-tabs" id="<%=strCId%>form_tab">
   <li class="active"><a href="#<%=strCId%>form_formpage1_tab" data-toggle="tab">基本信息</a></li>
   <li class=""><a href="#<%=strCId%>form_formpage2_tab" data-toggle="tab">其它</a></li>
</ul>
<div class="tab-content ">
  <div class="tab-pane active row" id="<%=strCId%>form_formpage1_tab" ><div id="<%=strCId%>M4" name="grouppanel1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel1_text"  style="height:40px;" ><h5>消息模板信息</h5></div>
</div>
<div id="<%=strCId%>M4_gd" >
<div id='<%=strCId%>M5__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M5__lb' class="control-label" style="width:130px;"  >消息模板标识</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M5_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="msgtemplateid" id="<%=strCId%>M5"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M6__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M6__lb' class="control-label" style="width:130px;"  >消息模板名称</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M6_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M6" name="msgtemplatename" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M7__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M7__lb' class="control-label" style="width:130px;"  >数据实体</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M7_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="dename" id="<%=strCId%>M7" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M8__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M8__lb' class="control-label" style="width:130px;"  >标题</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M8_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M8" name="subject" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M9__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M9__lb' class="control-label" style="width:130px;"  >内容类型</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M9_c" style="" ><SELECT id="<%=strCId%>M9" name="contenttype" class="form-control ibiz-field-dropdownlist"></SELECT></div>
	</div>
</div>
<div id='<%=strCId%>Ma__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Ma__lb' class="control-label" style="width:130px;"  >邮件群组发送</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Ma_c" style="width:100px;" ><SELECT id="<%=strCId%>Ma" name="mailgroupsend" class="form-control ibiz-field-dropdownlist"></SELECT></div>
	</div>
</div>
<div id='<%=strCId%>Mb__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mb__lb' class="control-label" style="width:130px;"  >内容</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mb_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Mb" name="content"  type="text"  class="form-control" ></textarea>
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
<div id='<%=strCId%>Mc__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mc__lb' class="control-label" style="width:130px;"  >手机消息内容</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mc_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Mc" name="smscontent"  type="text"  class="form-control" ></textarea>
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
<div id='<%=strCId%>Md__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Md__lb' class="control-label" style="width:130px;"  >IM消息内容</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Md_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Md" name="imcontent"  type="text"  class="form-control" ></textarea>
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
<div id='<%=strCId%>Me__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Me__lb' class="control-label" style="width:130px;"  >微信内容</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Me_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>Me" name="wccontent"  type="text"  class="form-control" ></textarea>
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
<div id="<%=strCId%>Mf" name="grouppanel2" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel2_text"  style="height:40px;" ><h5>发布管理</h5></div>
</div>
<div id="<%=strCId%>Mf_gd" >
<div id='<%=strCId%>M10__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M10__lb' class="control-label" style="width:130px;"  >应用发布</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M10_c" style="width:100px;" ><SELECT id="<%=strCId%>M10" name="srfuserpub" class="form-control ibiz-field-dropdownlist"></SELECT></div>
	</div>
</div>
</div>
</fieldset>
</div>
</div>
  <div class="tab-pane  row" id="<%=strCId%>form_formpage2_tab" ><div id="<%=strCId%>M12" name="grouppanel3" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel3_text"  style="height:40px;" ><h5>操作信息</h5></div>
</div>
<div id="<%=strCId%>M12_gd" >
<div id='<%=strCId%>M13__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M13__lb' class="control-label" style="width:130px;"  >建立人</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M13_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createman" id="<%=strCId%>M13"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M14__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M14__lb' class="control-label" style="width:130px;"  >建立时间</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M14_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createdate" id="<%=strCId%>M14"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M15__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M15__lb' class="control-label" style="width:130px;"  >更新人</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M15_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updateman" id="<%=strCId%>M15"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M16__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M16__lb' class="control-label" style="width:130px;"  >更新时间</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M16_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updatedate" id="<%=strCId%>M16"  >
</div>
	</div>
</div>
</div>
</fieldset>
</div>
</div>
</div>
</div>
</div>
<% return;} %>
<% if(strCtrlId.compareTo("drbar")==0){ %>
 <div></div>
<% return;} %>

<% if(strCtrlId.compareTo("drbar_header")==0){ %>
<ul class="nav nav-tabs" id="<%=strCId%>drtab" style="display:none;">
<li class="active"><a href="#<%=strCId%>drtab_form" data-toggle="tab"></a></li>
<li><a href="#<%=strCId%>drtab_DRITEM1" data-toggle="tab"></a></li>
<li><a href="#<%=strCId%>drtab_DRITEM2" data-toggle="tab"></a></li>
</ul>
<% return;} %>
<% if(strCtrlId.compareTo("drbar_content")==0){ %>
<div class="tab-pane " id="<%=strCId%>drtab_DRITEM1"></div>
<div class="tab-pane " id="<%=strCId%>drtab_DRITEM2"></div>
<% return;} %>
