<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="net.ibizsys.paas.web.Page" language="java"%>
<%
       //视图最后修改时间   2017-11-15 09:50:50
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
<%@include file="orgux_orgsectortreeexpview_userpart.jsp"%>
<% if(strCtrlId.compareTo("exptab")==0){ %>
<ul class="nav nav-tabs" id="<%=strCId%>exptab" style="display:none;">
<li><a  href="#<%=strCId%>exptab_PROPCY" data-toggle="tab"></a></li>	
<li><a  href="#<%=strCId%>exptab_QBSY" data-toggle="tab"></a></li>	
<li><a  href="#<%=strCId%>exptab_SYDW" data-toggle="tab"></a></li>	
<li><a  href="#<%=strCId%>exptab_DQALL" data-toggle="tab"></a></li>	
<li><a  href="#<%=strCId%>exptab_PROV" data-toggle="tab"></a></li>	
</ul>
<div class="tab-content" style="margin:10px">
<div class="tab-pane " id="<%=strCId%>exptab_PROPCY"></div>		
<div class="tab-pane " id="<%=strCId%>exptab_QBSY"></div>		
<div class="tab-pane " id="<%=strCId%>exptab_SYDW"></div>		
<div class="tab-pane " id="<%=strCId%>exptab_DQALL"></div>		
<div class="tab-pane " id="<%=strCId%>exptab_PROV"></div>		
</div>
<% return;} %>