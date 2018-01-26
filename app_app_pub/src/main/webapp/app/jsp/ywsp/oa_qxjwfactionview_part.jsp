<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2018-01-08 16:48:57
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
<%@include file="oa_qxjwfactionview_userpart.jsp"%>
<% if(strCtrlId.compareTo("form")==0){ %>
 <div id="<%=strCId%>form" class="form-horizontal">
   <div class="col-md-12  form-body">
<INPUT type="hidden" name="srfupdatedate" id="<%=strCId%>Mc"><INPUT type="hidden" name="srforikey" id="<%=strCId%>Mb"><INPUT type="hidden" name="srfkey" id="<%=strCId%>Ma"><INPUT type="hidden" name="srfmajortext" id="<%=strCId%>M9"><INPUT type="hidden" name="srftempmode" id="<%=strCId%>M8"><INPUT type="hidden" name="srfuf" id="<%=strCId%>M7"><INPUT type="hidden" name="srfdeid" id="<%=strCId%>M6"><INPUT type="hidden" name="srfsourcekey" id="<%=strCId%>M5"><INPUT type="hidden" name="oa_qxjid" id="<%=strCId%>M4">
<div class="tab_title"><a href="#<%=strCId%>form_formpage1_tab">基本信息</a></div>
  <div id='<%=strCId%>M3__fi' style="" class="ibiz-form-formitem  col-md-12 form-group" data-ibiz-allowblank="1">
	<div class='ibiz-formitem-label-left ' style="position: absolute;">
		<label id='<%=strCId%>M3__lb' class="control-label" style="width:130px;"  >审核意见</label>
	</div>
	<div style="margin-left:140px;" >
		<div id="<%=strCId%>M3_c" >
<div class="input-group  ibiz-field-textarea">
<textarea id="<%=strCId%>M3" name="memo"  type="text"  class="form-control" ></textarea>
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
</div>
<% return;} %>
