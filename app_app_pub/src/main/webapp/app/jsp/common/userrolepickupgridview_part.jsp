<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-23 14:21:55
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
<%@include file="userrolepickupgridview_userpart.jsp"%>
<% if(strCtrlId.compareTo("grid")==0){ %>
 <table id="<%=strCId%>grid" ></table>
<% return;} %>
<% if(strCtrlId.compareTo("searchform")==0){ %>
 <div id="<%=strCId%>searchform" class="form-horizontal" style="height:auto; overflow:hidden">
<!-- 表单区:开始-->
 <div class="col-md-10 row">

  <DIV id='<%=strCId%>M4__fi' style=""  class=" col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
<table width="100%" border="0" cellspacing="0" cellpadding="0"><tr>
<td width="130" valign="top">
<label id='<%=strCId%>M4__lb' class="control-label" style="width:130px;"  >用户角色名称(%)</label>
</td>
<td>
<div class="col-md-12" >
	<div id="<%=strCId%>M4_c" style="width:100px;" class="ibiz-field-textbox-container"><input id="<%=strCId%>M4" name="n_userrolename_like" type="text"  class="form-control text ibiz-field-textbox" ></div>
</div>
</td>
</tr>
</table>
</DIV>
<DIV id='<%=strCId%>M5__fi' style=""  class=" col-sm-4 col-md-4 form-group" data-ibiz-allowblank="1">
<table width="100%" border="0" cellspacing="0" cellpadding="0"><tr>
<td width="130" valign="top">
<label id='<%=strCId%>M5__lb' class="control-label" style="width:130px;"  >用户角色类型(=)</label>
</td>
<td>
<div class="col-md-12" >
	<div id="<%=strCId%>M5_c" style="width:100px;" ><SELECT id="<%=strCId%>M5" name="n_userroletype_eq" class="form-control ibiz-field-dropdownlist"></SELECT></div>
</div>
</td>
</tr>
</table>
</DIV>
  
</div>
<!-- 表单区:结束-->
<!-- 按钮区:开始-->
 <div class="col-md-2 row" style="float:right;">
    <button id="<%=strCId%>searchform_resetbutton" title="<ibiz5:message code="CONTROL.SPEX.RESET.TIPS" text="重置"></ibiz5:message>"  class=" btn  btn-blue" style="float:right;margin-right:0px;">
     <span ><ibiz5:message code="CONTROL.SPEX.RESET.TEXT" text="重置"></ibiz5:message></span>
   </button>

    <button id="<%=strCId%>searchform_searchbutton" title="<ibiz5:message code="CONTROL.SPEX.SEARCH.TIPS" text="搜索"></ibiz5:message>"  class=" btn btn-blue " style="float:right;margin-right:8px;">
     <span ><ibiz5:message code="CONTROL.SPEX.SEARCH.TEXT" text="搜索"></ibiz5:message></span>
</button>
</div>
<!-- 按钮区:结束-->
</div>
<% return;} %>
