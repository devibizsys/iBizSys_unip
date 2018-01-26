<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-12-20 18:50:13
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
<%@include file="oa_ybhysqybhysq_w50_wfeditview3_userpart.jsp"%>
<% if(strCtrlId.compareTo("toolbar")==0){ %>
 <div id="<%=strCId%>toolbar">
<button title="拒绝"  data-ibiz-tag="AC5020" data-ibiz-target="MULTIKEY"  class="btn   btn-blue  ibiz-toolbar-item" >                       <span >拒绝</span>  </button>  
<button title="通报"  data-ibiz-tag="AC5010" data-ibiz-target="MULTIKEY"  class="btn   btn-blue  ibiz-toolbar-item" >                       <span >通报</span>  </button>  
<button title="当前流程步骤"  data-ibiz-tag="ViewWFStep" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="sx-tb-stepactor"></i>             <span ><ibiz5:message code="TBB.TEXT.*.VIEWWFSTEP" text="当前流程步骤"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="数据导航"  data-ibiz-tag="9c9ff1be2924f7896ba667c051ca70c2" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >                       <span >数据导航</span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.HELP" text="帮助"></ibiz5:message>"  data-ibiz-tag="Help" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-question"></i>             <span ><ibiz5:message code="TBB.TEXT.*.HELP" text="帮助"></ibiz5:message></span>  </button>  
</div>
<% return;} %>
<% if(strCtrlId.compareTo("form")==0){ %>
 <div id="<%=strCId%>form" class="form-horizontal">
   <div class="col-md-12  form-body">
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>M2d"><INPUT type="hidden" name="srforikey" id="<%=strCId%>M2c"><INPUT type="hidden" name="srfkey" id="<%=strCId%>M2b"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>M2a"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>M29"><INPUT type="hidden" name="srfuf" id="<%=strCId%>M28"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>M27"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>M26"><INPUT type="hidden" name="oa_ybhysqid" id="<%=strCId%>M7"><INPUT type="hidden" name="orguserid" id="<%=strCId%>M9"><INPUT type="hidden" name="orgusername" id="<%=strCId%>Ma"><INPUT type="hidden" name="orgsectorid" id="<%=strCId%>Mb"><INPUT type="hidden" name="oa_hysid" id="<%=strCId%>M25">
<ul class="nav nav-tabs" id="<%=strCId%>form_tab">
   <li class="active"><a href="#<%=strCId%>form_formpage1_tab" data-toggle="tab"><ibiz5:message code="CONTROL.DEFORM.OA_YBHYSQ.MAIN.FORMPAGE.FORMPAGE1" text="基本信息"></ibiz5:message></a></li>
   <li class=""><a href="#<%=strCId%>form_formpage3_tab" data-toggle="tab">参会情况</a></li>
   <li class=""><a href="#<%=strCId%>form_formpage4_tab" data-toggle="tab">座位安排</a></li>
   <li class=""><a href="#<%=strCId%>form_formpage2_tab" data-toggle="tab"><ibiz5:message code="CONTROL.DEFORM.OA_YBHYSQ.MAIN.FORMPAGE.FORMPAGE2" text="其它"></ibiz5:message></a></li>
</ul>
<div class="tab-content ">
  <div class="tab-pane active row" id="<%=strCId%>form_formpage1_tab" ><div id="<%=strCId%>M5" name="group1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group1_text"  style="height:40px;" ><h5><ibiz5:message code="CONTROL.DEFORM.OA_YBHYSQ.MAIN.GROUPPANEL.GROUP1" text="院办会议申请基本信息"></ibiz5:message></h5></div>
</div>
<div id="<%=strCId%>M5_gd" >
<div id="<%=strCId%>M6" name="grouppanel2" style="" class="ibiz-form-formgroup-nocap row form-group  col-xs-6 col-sm-6 col-md-6 col-lg-6 ">
<div id='<%=strCId%>M8__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M8__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.OA_YBHYSQNAME" text="会议标题"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M8_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M8" name="oa_ybhysqname" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>Mc__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mc__lb' class="control-label" style="width:130px;"  >部门名称</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mc_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="orgsectorname" id="<%=strCId%>Mc" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Md__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Md__lb' class="control-label" style="width:130px;"  >申请时间</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Md_c" style="width:160px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>Md" name="sqsj"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Me__fi' style="" class="ibiz-form-formitem  col-xs-6 col-sm-6 col-md-6 col-lg-6 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Me__lb' class="control-label" style="width:130px;"  >会议时间</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Me_c" style="width:160px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>Me" name="hysj"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Mf__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mf__lb' class="control-label" style="width:130px;"  >会议室名称</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mf_c" style="">
	<div class="ibiz-field-picker">
		<div>
			<span class="toggle fa fa-search"></span>
			<input type="text" class="form-control text" name="oa_hysname" id="<%=strCId%>Mf" autocomplete="off" />
		</div>
	</div>
</div>
	</div>
</div>
</div>
<div id='<%=strCId%>M10__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M10__lb' class="control-label" style="width:130px;"  >会议要求</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M10_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>M10" name="hyyq"  type="text"  class="form-control" ></textarea>
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
<div id='<%=strCId%>M11__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="0">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M11__lb' class="control-label" style="width:130px;"  >会议内容</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M11_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>M11" name="hynr"  type="text"  class="form-control" ></textarea>
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
<div id='<%=strCId%>M12__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M12__lb' class="control-label" style="width:130px;"  >备注</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M12_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>M12" name="bz"  type="text"  class="form-control" ></textarea>
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
<div id='<%=strCId%>M13__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M13__lb' class="control-label" style="width:130px;"  >附件</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M13_c" style="" >
   <div name="fj" id="<%=strCId%>M13"   class="input-group ibiz-field-fileuploader">
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
  <div class="tab-pane  row" id="<%=strCId%>form_formpage3_tab" ><div id="<%=strCId%>M15" name="grouppanel4" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel4_text"  style="height:40px;" ><h5>院办会议参会情况</h5></div>
</div>
<div id="<%=strCId%>M15_gd" >
<div id='<%=strCId%>M16__fi' style="" class="ibiz-form-formitem  col-xs-4 col-sm-4 col-md-4 col-lg-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M16__lb' class="control-label" style="width:130px;"  >通知总人数</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M16_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="tzzrs" id="<%=strCId%>M16"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M17__fi' style="" class="ibiz-form-formitem  col-xs-4 col-sm-4 col-md-4 col-lg-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M17__lb' class="control-label" style="width:130px;"  >未参会人数</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M17_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="wchrs" id="<%=strCId%>M17"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M18__fi' style="" class="ibiz-form-formitem  col-xs-4 col-sm-4 col-md-4 col-lg-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M18__lb' class="control-label" style="width:130px;"  >已迟到人数</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M18_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="ycdrs" id="<%=strCId%>M18"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M19__fi' style="" class="ibiz-form-formitem  col-xs-4 col-sm-4 col-md-4 col-lg-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M19__lb' class="control-label" style="width:130px;"  >已参会人数</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M19_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="ychrs" id="<%=strCId%>M19"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M1a__fi' style="" class="ibiz-form-formitem  col-xs-4 col-sm-4 col-md-4 col-lg-4 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M1a__lb' class="control-label" style="width:130px;"  >已请假人数</label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M1a_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="yqjrs" id="<%=strCId%>M1a"  >
</div>
	</div>
</div>
</div>
</fieldset>
</div>
<div id="<%=strCId%>M1b" name="grouppanel1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel1_text"  style="height:40px;" ><h5></h5></div>
</div>
<div id="<%=strCId%>M1b_gd" >
<div id="<%=strCId%>M1c" class="ibiz-form-druipart  col-md-12 form-group" style="min-height:0px;"></div>
</div>
</fieldset>
</div>
</div>
  <div class="tab-pane  row" id="<%=strCId%>form_formpage4_tab" ><iframe id="<%=strCId%>M1e" style="min-height:750px;width:100%;border:0;frameborder:0;scrolling: no;"  frameborder="no"  border="0" marginwidth="0" marginheight="0" scrolling="no" 				allowtransparency="yes"></iframe>
</div>
  <div class="tab-pane  row" id="<%=strCId%>form_formpage2_tab" ><div id="<%=strCId%>M20" name="group2" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group2_text"  style="height:40px;" ><h5><ibiz5:message code="CONTROL.DEFORM.OA_YBHYSQ.MAIN.GROUPPANEL.GROUP2" text="操作信息"></ibiz5:message></h5></div>
</div>
<div id="<%=strCId%>M20_gd" >
<div id='<%=strCId%>M21__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M21__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CREATEMAN" text="建立人"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M21_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createman" id="<%=strCId%>M21"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M22__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M22__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CREATEDATE" text="建立时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M22_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createdate" id="<%=strCId%>M22"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M23__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M23__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.UPDATEMAN" text="更新人"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M23_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updateman" id="<%=strCId%>M23"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M24__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M24__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.UPDATEDATE" text="更新时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M24_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updatedate" id="<%=strCId%>M24"  >
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
<li class="active"><a href="#<%=strCId%>drtab_form" data-toggle="tab">院办会议申请</a></li>
</ul>
<% return;} %>
<% if(strCtrlId.compareTo("drtab_content")==0){ %>
<% return;} %>
