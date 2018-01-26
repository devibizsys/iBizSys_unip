<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-23 14:19:45
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
<%@include file="wfstepdatamyhistgridview_userpart.jsp"%>
<% if(strCtrlId.compareTo("toolbar")==0){ %>
 <div id="<%=strCId%>toolbar">
<% if(Page.getCurrent().isShowAction("NONE")){ %>  <button title="回撤操作"  data-ibiz-tag="Rollback" data-ibiz-target="MULTIKEY" data-ibiz-priv="NONE"  class="btn   btn-blue  ibiz-toolbar-item" >                       <span >回撤操作</span>  </button>  <%} %>  
<!--分割符号-->
<!--操作集合-->
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.FILTER" text="过滤"></ibiz5:message>"  data-ibiz-tag="ToggleFilter" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-filter"></i>             <span ><ibiz5:message code="TBB.TEXT.*.FILTER" text="过滤"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.*.HELP" text="帮助"></ibiz5:message>"  data-ibiz-tag="Help" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-question"></i>             <span ><ibiz5:message code="TBB.TEXT.*.HELP" text="帮助"></ibiz5:message></span>  </button>  
</div>
<% return;} %>
<% if(strCtrlId.compareTo("grid")==0){ %>
 <table id="<%=strCId%>grid" ></table>
<% return;} %>
<% if(strCtrlId.compareTo("searchform")==0){ %>
 <div id="<%=strCId%>searchform" class="form-horizontal" style="height:auto; overflow:hidden">
<!-- 表单区:开始-->
 <div class="col-md-10 row">

  <DIV id='<%=strCId%>M4__fi' style=""  class=" col-md-12 form-group" data-ibiz-allowblank="1">
<table width="100%" border="0" cellspacing="0" cellpadding="0"><tr>
<td width="130" valign="top">
<label id='<%=strCId%>M4__lb' class="control-label" style="width:130px;"  ><ibiz5:message code="CONTROL.DEFSFITEM.WFSTEPDATA.N_WFSTEPDATANAME_LIKE" text="流程操作(%)"></ibiz5:message></label>
</td>
<td>
<div class="col-md-12" >
	<div id="<%=strCId%>M4_c" style="width:100px;" class="ibiz-field-textbox-container"><input id="<%=strCId%>M4" name="n_wfstepdataname_like" type="text"  class="form-control text ibiz-field-textbox" ></div>
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
