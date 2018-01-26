<%@page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="p" scope="page" class="net.ibizsys.paas.web.VCPage" />
<% if(!p.init(pageContext,"/app/wx/WXEntAppEditView2.do")){return;}%>
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
	<jsp:param name="controller" value="/app/wx/WXEntAppEditView2.do"/>
	<jsp:param name="parturl" value="../jsp/wx/wxentappeditview2_part.jsp"/>
	<jsp:param name="cid" value="<%=p.getCId()%>"/>
	<jsp:param name="embed" value="<%=strEmbed%>"/>
        <jsp:param name="ifchild" value="<%=strIFChild%>"/>
</jsp:include>
<%if (!p.isEmbed()) {%>
<%@include file="../../lib/lib-common-script.jsp"%>
<%@include file="../../lib/lib-user-script.jsp"%>
<%@include file="../../lib/degridviewlib-script.jsp"%>
<%@include file="../../lib/deeditview2lib-script.jsp"%>
<script src='${ctx}/js/wx/WXMediaGridViewControllerBase.js?v=452_20171123141906' type='text/javascript'></script>
<script src='${ctx}/js/wx/WXMediaGridViewController.js?v=452_20171123141906' type='text/javascript'></script>
<script src='${ctx}/js/wx/WXMessageGridViewControllerBase.js?v=838_20171123141902' type='text/javascript'></script>
<script src='${ctx}/js/wx/WXMessageGridViewController.js?v=838_20171123141902' type='text/javascript'></script>
<script src='${ctx}/js/wx/WXEntAppEditView2ControllerBase.js?v=709_20171123141919' type='text/javascript'></script>
<script src='${ctx}/js/wx/WXEntAppEditView2Controller.js?v=709_20171123141919' type='text/javascript'></script>
<script>
var controller = null;
function getController()
{
   return controller;
}
jQuery(document).ready(function(){
        controller = new WXEntAppEditView2Controller({appctx:'${ctx2}',webctx:'${web}'});
	controller.init({parentMode:<%=p.getParentMode()%>,parentData:<%=p.getParentData()%>});
});
</script>
</body>
</html>
<%}%>