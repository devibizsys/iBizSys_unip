<%@page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="p" scope="page" class="net.ibizsys.paas.web.VCPage" />
<% if(!p.init(pageContext,"/app/common/OrgEditView2.do")){return;}%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ibiz5" uri="http://www.ibizsys.cn/tags"%>
<c:set var="web" value="${pageContext.request.contextPath}" />
<c:set var="ctx" value="${pageContext.request.contextPath}/app" />
<c:set var="ctx2" value="${pageContext.request.contextPath}/app" />
<% String strEmbed = (p.isEmbed()?"true":"");String strCId=p.getCId();pageContext.setAttribute("cid",strCId);String strIFChild=(p.isIFChild()?"true":"false");String strLocale=p.getLocalization().toLowerCase();pageContext.setAttribute("locale",strLocale);%>
<%if (!p.isEmbed()) {%>
<!DOCTYPE html>
<html lang="zh-CN">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
<%@include file="../../lib/lib-common-style.jsp"%>
<%@include file="../../lib/lib-user-style.jsp"%>
<%@include file="../../lib/degridviewlib-style.jsp"%>
<%@include file="../../lib/deeditview2lib-style.jsp"%>
<%}%>
<jsp:include page="../../templ/deeditview2.jsp" flush="true" >
	<jsp:param name="controller" value="/app/common/OrgEditView2.do"/>
	<jsp:param name="parturl" value="../jsp/common/orgeditview2_part.jsp"/>
	<jsp:param name="cid" value="<%=p.getCId()%>"/>
	<jsp:param name="embed" value="<%=strEmbed%>"/>
        <jsp:param name="ifchild" value="<%=strIFChild%>"/>
</jsp:include>
<%if (!p.isEmbed()) {%>
<%@include file="../../lib/lib-common-script.jsp"%>
<%@include file="../../lib/lib-user-script.jsp"%>
<%@include file="../../lib/degridviewlib-script.jsp"%>
<%@include file="../../lib/deeditview2lib-script.jsp"%>
<script src='${ctx}/js/common/UserRoleDataGridViewControllerBase.js?v=884_20171123142500' type='text/javascript'></script>
<script src='${ctx}/js/common/UserRoleDataGridViewController.js?v=884_20171123142500' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgSectorGridViewControllerBase.js?v=1797_20171115093216' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgSectorGridViewController.js?v=1797_20171115093216' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgGridViewControllerBase.js?v=1692_20171115093119' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgGridViewController.js?v=1692_20171115093119' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgSecUserGridViewControllerBase.js?v=1186_20171123142433' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgSecUserGridViewController.js?v=1186_20171123142433' type='text/javascript'></script>
<script src='${ctx}/js/wf/WFInstanceGridViewControllerBase.js?v=486_20171123141937' type='text/javascript'></script>
<script src='${ctx}/js/wf/WFInstanceGridViewController.js?v=486_20171123141937' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgUserGridViewControllerBase.js?v=1332_20171123142205' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgUserGridViewController.js?v=1332_20171123142205' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgEditView2ControllerBase.js?v=1692_20171115093119' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgEditView2Controller.js?v=1692_20171115093119' type='text/javascript'></script>
<script>
var controller = null;
function getController()
{
   return controller;
}
jQuery(document).ready(function(){
        controller = new OrgEditView2Controller({appctx:'${ctx2}',webctx:'${web}'});
	controller.init({parentMode:<%=p.getParentMode()%>,parentData:<%=p.getParentData()%>});
});
</script>
</body>
</html>
<%}%>