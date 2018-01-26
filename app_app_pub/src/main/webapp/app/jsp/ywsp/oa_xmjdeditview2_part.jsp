<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-12-19 17:27:23
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
<%@include file="oa_xmjdeditview2_userpart.jsp"%>
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
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>M4c"><INPUT type="hidden" name="srforikey" id="<%=strCId%>M4b"><INPUT type="hidden" name="srfkey" id="<%=strCId%>M4a"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>M49"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>M48"><INPUT type="hidden" name="srfuf" id="<%=strCId%>M47"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>M46"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>M45"><INPUT type="hidden" name="oa_xmjdid" id="<%=strCId%>M44">
<ul class="nav nav-tabs" id="<%=strCId%>form_tab">
   <li class="active"><a href="#<%=strCId%>form_formpage1_tab" data-toggle="tab"><ibiz5:message code="CONTROL.DEFORM.OA_XMJD.MAIN.FORMPAGE.FORMPAGE1" text="基本信息"></ibiz5:message></a></li>
   <li class=""><a href="#<%=strCId%>form_formpage3_tab" data-toggle="tab"><ibiz5:message code="CONTROL.DEFORM.OA_XMJD.MAIN.FORMPAGE.FORMPAGE3" text="付款进度批示"></ibiz5:message></a></li>
   <li class=""><a href="#<%=strCId%>form_formpage2_tab" data-toggle="tab"><ibiz5:message code="CONTROL.DEFORM.OA_XMJD.MAIN.FORMPAGE.FORMPAGE2" text="其它"></ibiz5:message></a></li>
</ul>
<div class="tab-content ">
  <div class="tab-pane active row" id="<%=strCId%>form_formpage1_tab" ><div id="<%=strCId%>M4" name="group1" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group1_text"  style="height:40px;" ><h5><ibiz5:message code="CONTROL.DEFORM.OA_XMJD.MAIN.GROUPPANEL.GROUP1" text="项目进度基本信息"></ibiz5:message></h5></div>
</div>
<div id="<%=strCId%>M4_gd" >
<div id="<%=strCId%>M5" name="grouppanel4" style="" class="ibiz-form-formgroup-nocap row form-group  col-xs-6 col-sm-6 col-md-6 col-lg-6 ">
<div id='<%=strCId%>M6__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M6__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.OA_XMJDNAME" text="项目进度名称"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M6_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M6" name="oa_xmjdname" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M7__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M7__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.XMBH" text="项目编号"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M7_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M7" name="xmbh" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M8__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M8__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.SDXMBHRQ" text="收到项目编号日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M8_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M8" name="sdxmbhrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M9__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M9__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.YSJE" text="预算金额"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M9_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M9" name="ysje" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>Ma__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Ma__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.KSXCZSBRQ" text="开始向财政申报期日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Ma_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>Ma" name="ksxczsbrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Mb__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mb__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.ZBWJQRRQ" text="招标文件确认日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mb_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>Mb" name="zbwjqrrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Mc__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mc__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CGFS" text="采购方式"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mc_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>Mc" name="cgfs" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>Md__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Md__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.PSRQ" text="评审日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Md_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>Md" name="psrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>Me__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Me__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.PSDB" text="评审代表"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Me_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>Me" name="psdb" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>Mf__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>Mf__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DLJGPSBGBH" text="代理机构评审报告编号"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>Mf_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>Mf" name="dljgpsbgbh" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M10__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M10__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.ZTBWJGDRQ" text="招投标文件归档日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M10_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M10" name="ztbwjgdrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M11__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M11__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CJZBGS" text="成交中标公司"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M11_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M11" name="cjzbgs" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M12__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M12__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.HTZE" text="合同总额"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M12_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M12" name="htze" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M13__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M13__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.BARQ" text="备案日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M13_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M13" name="barq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M14__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M14__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.ZBBHJE" text="质保保函金额"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M14_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M14" name="zbbhje" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M15__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M15__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.BHFYJCFDD" text="保函复印件存放地点"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M15_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M15" name="bhfyjcfdd" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M16__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M16__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.YSRQ" text="验收日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M16_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M16" name="ysrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M17__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M17__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.TBRQ" text="退保日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M17_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M17" name="tbrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M18__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M18__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.WFYK" text="未付余款"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M18_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M18" name="wfyk" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
</div>
<div id="<%=strCId%>M19" name="grouppanel5" style="" class="ibiz-form-formgroup-nocap row form-group  col-xs-6 col-sm-6 col-md-6 col-lg-6 ">
<div id='<%=strCId%>M1a__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M1a__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.XMMC" text="项目名称"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M1a_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M1a" name="xmmc" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M1b__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M1b__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.LXBG" text="立项报告"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M1b_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M1b" name="lxbg" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M1c__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M1c__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.SDZZHBH" text="上党组织会编号"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M1c_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M1c" name="sdzzhbh" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M1d__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M1d__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.SYZJWH" text="使用资金文号"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M1d_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M1d" name="syzjwh" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M1e__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M1e__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DLGS" text="代理公司"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M1e_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M1e" name="dlgs" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M1f__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M1f__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.ZBWJQRQZ" text="招标文件确认签字"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M1f_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M1f" name="zbwjqrqz" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M20__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M20__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.ZBWJQRDSM" text="招标文件确认单扫描"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M20_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M20" name="zbwjqrdsm" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M21__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M21__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CGGGRQ" text="采购公告日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M21_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M21" name="cgggrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M22__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M22__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.JCRY" text="监察人员"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M22_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M22" name="jcry" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M23__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M23__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CGJGBGPFRQ" text="采购结果报告批复日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M23_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M23" name="cgjgbgpfrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M24__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M24__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CGJGPSSM" text="采购结果批示扫描"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M24_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M24" name="cgjgpssm" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M25__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M25__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.ZTBWJCFD" text="招投标文件存放地"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M25_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M25" name="ztbwjcfd" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M26__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M26__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.HTSM" text="合同扫描"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M26_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M26" name="htsm" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M27__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M27__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.HTQDRQ" text="合同签订日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M27_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M27" name="htqdrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M28__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M28__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.BABSM" text="备案表扫描"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M28_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M28" name="babsm" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M29__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M29__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.BHCFDD" text="保函存放地点"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M29_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M29" name="bhcfdd" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M2a__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M2a__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.YDLXRQ" text="约定履行日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M2a_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M2a" name="ydlxrq" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M2b__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M2b__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.YSBGSN" text="要收报告扫描"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M2b_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M2b" name="ysbgsn" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M2c__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M2c__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.JXPG" text="绩效评估"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M2c_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M2c" name="jxpg" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
</div>
<div id='<%=strCId%>M2d__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M2d__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.BZ" text="备注"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M2d_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>M2d" name="bz"  type="text"  class="form-control" ></textarea>
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
  <div class="tab-pane  row" id="<%=strCId%>form_formpage3_tab" ><div id="<%=strCId%>M2f" name="grouppanel1" style="" class="ibiz-form-formgroup  col-xs-6 col-sm-6 col-md-6 col-lg-6 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel1_text"  style="height:40px;" ><h5><ibiz5:message code="CONTROL.DEFORM.OA_XMJD.MAIN.GROUPPANEL.GROUPPANEL1" text="第一次付款批示"></ibiz5:message></h5></div>
</div>
<div id="<%=strCId%>M2f_gd" >
<div id='<%=strCId%>M30__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M30__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DYCFKJDPS" text="第一次付款进度批示"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M30_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M30" name="dycfkjdps" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M31__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M31__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DYCFKJE" text="第一次付款金额"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M31_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M31" name="dycfkje" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M32__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M32__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DYCZFPSRQ" text="第一次支付批示日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M32_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M32" name="dyczfpsrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M33__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M33__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DYCZFPSSM" text="第一次支付批示扫描"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M33_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M33" name="dyczfpssm" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
</div>
</fieldset>
</div>
<div id="<%=strCId%>M34" name="grouppanel2" style="" class="ibiz-form-formgroup  col-xs-6 col-sm-6 col-md-6 col-lg-6 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel2_text"  style="height:40px;" ><h5><ibiz5:message code="CONTROL.DEFORM.OA_XMJD.MAIN.GROUPPANEL.GROUPPANEL2" text="第二次付款批示"></ibiz5:message></h5></div>
</div>
<div id="<%=strCId%>M34_gd" >
<div id='<%=strCId%>M35__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M35__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DECFKJDPS" text="第二次付款进度批示"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M35_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M35" name="decfkjdps" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M36__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M36__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DECFKJE" text="第二次付款金额"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M36_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M36" name="decfkje" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M37__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M37__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DECZFPSRQ" text="第二次支付批示日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M37_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M37" name="deczfpsrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M38__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M38__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DECZFPSSM" text="第二次支付批示扫描"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M38_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M38" name="deczfpssm" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
</div>
</fieldset>
</div>
<div id="<%=strCId%>M39" name="grouppanel3" style="" class="ibiz-form-formgroup  col-xs-6 col-sm-6 col-md-6 col-lg-6 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text grouppanel3_text"  style="height:40px;" ><h5><ibiz5:message code="CONTROL.DEFORM.OA_XMJD.MAIN.GROUPPANEL.GROUPPANEL3" text="第三次付款批示"></ibiz5:message></h5></div>
</div>
<div id="<%=strCId%>M39_gd" >
<div id='<%=strCId%>M3a__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M3a__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DSCFKJDPS" text="第三次付款进度批示"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M3a_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M3a" name="dscfkjdps" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M3b__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M3b__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DSCFKJE" text="第三次付款金额"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M3b_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M3b" name="dscfkje" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
<div id='<%=strCId%>M3c__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M3c__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DSCZFPSRQ" text="第三次支付批示日期"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M3c_c" style="width:100px;" >
<div class="input-group ibiz-field-datepicker">
	<input id="<%=strCId%>M3c" name="dsczfpsrq"  class="form-control form-control-inline date-picker"  type="text" />
</div>
</div>
	</div>
</div>
<div id='<%=strCId%>M3d__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M3d__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.DSCZFPSSM" text="第三次支付批示扫描"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M3d_c" style="" class="ibiz-field-textbox-container"><input id="<%=strCId%>M3d" name="dsczfpssm" type="text"  class="form-control text ibiz-field-textbox" ></div>
	</div>
</div>
</div>
</fieldset>
</div>
</div>
  <div class="tab-pane  row" id="<%=strCId%>form_formpage2_tab" ><div id="<%=strCId%>M3f" name="group2" style="" class="ibiz-form-formgroup  col-md-12 ">
<fieldset style="border: 1px solid #e5e5e5;margin-bottom:10px;">
<div class="panel panel-success">
<div class="panel-heading panel-text group2_text"  style="height:40px;" ><h5><ibiz5:message code="CONTROL.DEFORM.OA_XMJD.MAIN.GROUPPANEL.GROUP2" text="操作信息"></ibiz5:message></h5></div>
</div>
<div id="<%=strCId%>M3f_gd" >
<div id='<%=strCId%>M40__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M40__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CREATEMAN" text="建立人"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M40_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createman" id="<%=strCId%>M40"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M41__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M41__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.CREATEDATE" text="建立时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M41_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="createdate" id="<%=strCId%>M41"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M42__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M42__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.UPDATEMAN" text="更新人"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M42_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updateman" id="<%=strCId%>M42"  >
</div>
	</div>
</div>
<div id='<%=strCId%>M43__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M43__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="DEF.LNAME.UPDATEDATE" text="更新时间"></ibiz5:message></label>
	</div>
        <div style="margin-left:140px;margin-right:10px;" >
		<div id="<%=strCId%>M43_c" style="" >
<input type="text" class="form-control text ibiz-field-span" readonly="readonly" name="updatedate" id="<%=strCId%>M43"  >
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
</ul>
<% return;} %>
<% if(strCtrlId.compareTo("drbar_content")==0){ %>
<% return;} %>
