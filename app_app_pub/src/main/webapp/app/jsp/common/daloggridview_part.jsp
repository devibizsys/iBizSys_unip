<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-23 14:22:59
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
<%@include file="daloggridview_userpart.jsp"%>
<% if(strCtrlId.compareTo("toolbar")==0){ %>
 <div id="<%=strCId%>toolbar">
<button title="<ibiz5:message code="TBB.TOOLTIP.*.NEW" text="新建"></ibiz5:message>"  data-ibiz-tag="New" data-ibiz-target=""  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-file-text-o"></i>             <span ><ibiz5:message code="TBB.TEXT.*.NEW" text="新建"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.*.EDIT" text="编辑"></ibiz5:message>"  data-ibiz-tag="Edit" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-edit"></i>             <span ><ibiz5:message code="TBB.TEXT.*.EDIT" text="编辑"></ibiz5:message></span>  </button>  
<button title="<ibiz5:message code="TBB.TOOLTIP.*.COPY" text="拷贝"></ibiz5:message>"  data-ibiz-tag="Copy" data-ibiz-target="SINGLEKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-copy"></i>             <span ><ibiz5:message code="TBB.TEXT.*.COPY" text="拷贝"></ibiz5:message></span>  </button>  
<!--分割符号-->
<button title="<ibiz5:message code="TBB.TOOLTIP.*.REMOVE" text="删除"></ibiz5:message>"  data-ibiz-tag="Remove" data-ibiz-target="MULTIKEY"  class="btn   btn-blue  ibiz-toolbar-item" >          <i class="fa fa-remove"></i>             <span ><ibiz5:message code="TBB.TEXT.*.REMOVE" text="删除"></ibiz5:message></span>  </button>  
<!--分割符号-->
<div class="btn ibiz-toolbar-item ibiz-id-dropdown" data-ibiz-tag="ExportExcel" style="padding:1px;">  	<div class="input-group-btn" style="width:auto;">  		<button type="button" class="btn btn-blue dropdown-toggle ibiz-id-dropdown" data-toggle="dropdown"><ibiz5:message code="TBB.TEXT.*.EXPORT" text="导出"></ibiz5:message>  		<i class="fa fa-angle-down"></i></button>  		<ul class="dropdown-menu  ">  			<li>  				<a class="ibiz-id-item" data-ibiz-tag="all" href="javascript:;"><ibiz5:message code="TBB.TEXT.*.EXPORT.ALL" text="导出全部"></ibiz5:message>  				<span style="color: #9eacb4;font-size: 13px;">&nbsp;<ibiz5:message code="TBB.TEXT.*.EXPORT.MAX" text="最大导出1000行"></ibiz5:message></span>  				</a>  			</li>  			<li>  				<a class="ibiz-id-item" data-ibiz-tag="current" href="javascript:;"><ibiz5:message code="TBB.TEXT.*.EXPORT.CURRENT" text="导出当前页"></ibiz5:message></a>  			</li>  			<li>  			<div style="padding:8px 14px">  				<ibiz5:message code="TBB.TEXT.*.EXPORT.SPEC" text="导出第"></ibiz5:message><input class="ibiz-id-start" style="width:35px"/>~<input class="ibiz-id-end" style="width:35px"/><ibiz5:message code="TBB.TEXT.*.EXPORT.UNIT" text="页"></ibiz5:message>  				<button class="btn btn-blue ibiz-id-item" data-ibiz-tag="custom" type="button">Go!</button>  				</div>  			</li>  		</ul>  	</div>  </div>  
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
