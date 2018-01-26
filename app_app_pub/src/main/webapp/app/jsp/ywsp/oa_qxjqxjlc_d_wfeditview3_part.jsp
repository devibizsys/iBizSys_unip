<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-12-25 13:46:32
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
<%@include file="oa_qxjqxjlc_d_wfeditview3_userpart.jsp"%>
<% if(strCtrlId.compareTo("toolbar")==0){ %>
 <div id="<%=strCId%>toolbar">
<button title="<ibiz5:message code="TBB.TOOLTIP.*.SAVE" text="保存"></ibiz5:message>"  data-ibiz-tag="Save" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-save"></i>             <span ><ibiz5:message code="TBB.TEXT.*.SAVE" text="保存"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.SAVEANDNEW" text="保存并新建"></ibiz5:message>"  data-ibiz-tag="SaveAndNew" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-saveandnew"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.SAVEANDNEW" text="保存并新建"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message>"  data-ibiz-tag="SaveAndExit" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-saveandclose"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.SAVEANDCLOSE" text="保存并关闭"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.EDITVIEW.REMOVEANDCLOSE" text="删除并关闭"></ibiz5:message>"  data-ibiz-tag="RemoveAndExit" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-remove"></i>             <span ><ibiz5:message code="TBB.TEXT.EDITVIEW.REMOVEANDCLOSE" text="删除并关闭"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="提交"  data-ibiz-tag="SaveAndStart" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >                       <span >提交</span>  </button>  
<button title="当前流程步骤"  data-ibiz-tag="ViewWFStep" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-stepactor"></i>             <span ><ibiz5:message code="TBB.TEXT.*.VIEWWFSTEP" text="当前流程步骤"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.NEW" text="新建"></ibiz5:message>"  data-ibiz-tag="New" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-file-text-o"></i>             <span ><ibiz5:message code="TBB.TEXT.*.NEW" text="新建"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.COPY" text="拷贝"></ibiz5:message>"  data-ibiz-tag="Copy" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-copy"></i>             <span ><ibiz5:message code="TBB.TEXT.*.COPY" text="拷贝"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="数据导航"  data-ibiz-tag="9c9ff1be2924f7896ba667c051ca70c2" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >                       <span >数据导航</span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.HELP" text="帮助"></ibiz5:message>"  data-ibiz-tag="Help" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-question"></i>             <span ><ibiz5:message code="TBB.TEXT.*.HELP" text="帮助"></ibiz5:message></span>  </button>  
</div>
<% return;} %>
<% if(strCtrlId.compareTo("form")==0){ %>
 <div id="<%=strCId%>form" class="form-horizontal">
   <div class="col-md-12  form-body">
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>M1f"><INPUT type="hidden" name="srforikey" id="<%=strCId%>M1e"><INPUT type="hidden" name="srfkey" id="<%=strCId%>M1d"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>M1c"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>M1b"><INPUT type="hidden" name="srfuf" id="<%=strCId%>M1a"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>M19"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>M18"><INPUT type="hidden" name="ybhysqid" id="<%=strCId%>M6"><INPUT type="hidden" name="orguserid" id="<%=strCId%>M7"><INPUT type="hidden" name="orgusername" id="<%=strCId%>M8"><INPUT type="hidden" name="oa_qxjid" id="<%=strCId%>M9">
<ul class="nav nav-tabs" id="<%=strCId%>form_tab">
   <li class="active"><a href="#<%=strCId%>form_formpage1_tab" data-toggle="tab"><ibiz5:message code="CONTROL.DEFORM.OA_QXJ.MAIN.FORMPAGE.FORMPAGE1" text="基本信息"></ibiz5:message></a></li>
   <li class=""><a href="#<%=strCId%>form_formpage2_tab" data-toggle="tab"><ibiz5:message code="CONTROL.DEFORM.OA_QXJ.MAIN.FORMPAGE.FORMPAGE2" text="其它"></ibiz5:message></a></li>
</ul>
<div class="tab-content ">
  <div class="tab-pane active row" id="<%=strCId%>form_formpage1_tab" ><div id="<%=strCId%>M5" name="group1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group1_text"  style="height:40px;" ><h5><ibiz5:message code="CONTROL.DEFORM.OA_QXJ.MAIN.GROUPPANEL.GROUP1" text="请休假基本信息"></ibiz5:message></h5></div>
</div>
<div id="<%=strCId%>M5_gd" >
<div id='<%=strCId%>Ma__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Ma__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.OA_QXJNAME" text="请休假名称"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Ma_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>Ma" name="oa_qxjname" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>Mb__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mb__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="CONTROL.DEFORM.OA_QXJ.MAIN.FORMITEM.SC" text="请假时长"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mb_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>Mb" name="sc" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>Mc__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mc__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.QXJLX" text="请休假类型"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mc_c" style="" ><SELECT id="<%=strCId%>Mc" name="qxjlx" class="form-control ibiz-field-dropdownlist"></SELECT></div>
	</div>
</div>
<div id='<%=strCId%>Md__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Md__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.KSSJ" text="开始时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Md_c" style="width:160px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>Md" name="kssj"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Me__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Me__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.JSSJ" text="结束时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Me_c" style="width:160px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>Me" name="jssj"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Mf__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mf__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CJGZSJ" text="参加工作时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mf_c" style="width:160px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>Mf" name="cjgzsj"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M10__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M10__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.QXJSY" text="请休假事由"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M10_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>M10" name="qxjsy"  type="text"  class="form-control" ></textarea>
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
<div id='<%=strCId%>M11__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M11__lb' class="control-label" style="width:130px;"  >附件</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M11_c" style="" >
   <div name="fj" id="<%=strCId%>M11"   class="input-group ibiz-field-fileuploader">
		<div class="select2-container select2-container-multi form-control select2">
			<ul class="ibiz-fileupload-container select2-choices"></ul>
		</div>
		<div class="input-group-addon">
			<a class="ibiz-fileupload-upload btn btn-icon-only" onclick="return false;"  href="javascript:;">
				<i class="fa fa-upload"></i>
			</a>
		</div>
	</div>
</div>
	</div>
</div>
</div>
</fieldset>
</div>
</div>
  <div class="tab-pane  row" id="<%=strCId%>form_formpage2_tab" ><div id="<%=strCId%>M13" name="group2" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group2_text"  style="height:40px;" ><h5><ibiz5:message code="CONTROL.DEFORM.OA_QXJ.MAIN.GROUPPANEL.GROUP2" text="操作信息"></ibiz5:message></h5></div>
</div>
<div id="<%=strCId%>M13_gd" >
<div id='<%=strCId%>M14__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M14__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CREATEMAN" text="建立人"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M14_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createman" id="<%=strCId%>M14"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M15__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M15__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CREATEDATE" text="建立时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M15_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createdate" id="<%=strCId%>M15"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M16__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M16__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.UPDATEMAN" text="更新人"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M16_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updateman" id="<%=strCId%>M16"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M17__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M17__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.UPDATEDATE" text="更新时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M17_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updatedate" id="<%=strCId%>M17"  >
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
<% if(strCtrlId.compareTo("drtab_header")==0){ %>
<ul class="nav nav-tabs" id="<%=strCId%>drtab" >
<li class="active"><a href="#<%=strCId%>drtab_form" data-toggle="tab">请休假</a></li>
</ul>
<% return;} %>
<% if(strCtrlId.compareTo("drtab_content")==0){ %>
<% return;} %>
