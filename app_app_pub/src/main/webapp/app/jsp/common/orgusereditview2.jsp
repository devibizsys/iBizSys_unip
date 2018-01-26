<%@page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="p" scope="page" class="net.ibizsys.paas.web.VCPage" />
<% if(!p.init(pageContext,"/app/common/OrgUserEditView2.do")){return;}%>
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
	<jsp:param name="controller" value="/app/common/OrgUserEditView2.do"/>
	<jsp:param name="parturl" value="../jsp/common/orgusereditview2_part.jsp"/>
	<jsp:param name="cid" value="<%=p.getCId()%>"/>
	<jsp:param name="embed" value="<%=strEmbed%>"/>
        <jsp:param name="ifchild" value="<%=strIFChild%>"/>
</jsp:include>
<%if (!p.isEmbed()) {%>
<%@include file="../../lib/lib-common-script.jsp"%>
<%@include file="../../lib/lib-user-script.jsp"%>
<%@include file="../../lib/degridviewlib-script.jsp"%>
<%@include file="../../lib/deeditview2lib-script.jsp"%>
<script src='${ctx}/js/ywsp/OA_GZRZGridViewControllerBase.js?v=1984_20171223153416' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_GZRZGridViewController.js?v=1984_20171223153416' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_XXGridViewControllerBase.js?v=847_20171214195113' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_XXGridViewController.js?v=847_20171214195113' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_QXJGridViewControllerBase.js?v=1914_20171215173850' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_QXJGridViewController.js?v=1914_20171215173850' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_YCSQGridViewControllerBase.js?v=908_20171215134836' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_YCSQGridViewController.js?v=908_20171215134836' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CLWXGridViewControllerBase.js?v=1055_20171215174057' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CLWXGridViewController.js?v=1055_20171215174057' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_TZGGGridViewControllerBase.js?v=1443_20171228142819' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_TZGGGridViewController.js?v=1443_20171228142819' type='text/javascript'></script>
<script src='${ctx}/js/jcsj/OA_ZSKGridViewControllerBase.js?v=617_20171215155121' type='text/javascript'></script>
<script src='${ctx}/js/jcsj/OA_ZSKGridViewController.js?v=617_20171215155121' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_YBHYSQGridViewControllerBase.js?v=2831_20171225193406' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_YBHYSQGridViewController.js?v=2831_20171225193406' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_RZRYGridViewControllerBase.js?v=611_20171227105858' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_RZRYGridViewController.js?v=611_20171227105858' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_XXRYGridViewControllerBase.js?v=197_20171228155032' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_XXRYGridViewController.js?v=197_20171228155032' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgSecUserGridViewControllerBase.js?v=1186_20171123142433' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgSecUserGridViewController.js?v=1186_20171123142433' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CHRYGridViewControllerBase.js?v=871_20171214151215' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CHRYGridViewController.js?v=871_20171214151215' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_TZGGRYGridViewControllerBase.js?v=220_20171228115143' type='text/javascript'></script>
<script src='${ctx}/js/xxtz/OA_TZGGRYGridViewController.js?v=220_20171228115143' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_BGYPSQGridViewControllerBase.js?v=915_20171216161624' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_BGYPSQGridViewController.js?v=915_20171216161624' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_PCSQGridViewControllerBase.js?v=981_20171215112813' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_PCSQGridViewController.js?v=981_20171215112813' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CPMJSQGridViewControllerBase.js?v=1165_20171215112838' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CPMJSQGridViewController.js?v=1165_20171215112838' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CCSQGridViewControllerBase.js?v=942_20171215173958' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CCSQGridViewController.js?v=942_20171215173958' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_NSJGHYSQGridViewControllerBase.js?v=1116_20171222175447' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_NSJGHYSQGridViewController.js?v=1116_20171222175447' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_JPYDGridViewControllerBase.js?v=1074_20171215104403' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_JPYDGridViewController.js?v=1074_20171215104403' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_STWMDGGridViewControllerBase.js?v=1005_20171215154840' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_STWMDGGridViewController.js?v=1005_20171215154840' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_SBWXGridViewControllerBase.js?v=1042_20171215155026' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_SBWXGridViewController.js?v=1042_20171215155026' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_YYSSQGridViewControllerBase.js?v=819_20171215154917' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_YYSSQGridViewController.js?v=819_20171215154917' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CGSQGridViewControllerBase.js?v=1179_20171215145930' type='text/javascript'></script>
<script src='${ctx}/js/ywsp/OA_CGSQGridViewController.js?v=1179_20171215145930' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgUserEditView2ControllerBase.js?v=1332_20171123142205' type='text/javascript'></script>
<script src='${ctx}/js/common/OrgUserEditView2Controller.js?v=1332_20171123142205' type='text/javascript'></script>
<script>
var controller = null;
function getController()
{
   return controller;
}
jQuery(document).ready(function(){
        controller = new OrgUserEditView2Controller({appctx:'${ctx2}',webctx:'${web}'});
	controller.init({parentMode:<%=p.getParentMode()%>,parentData:<%=p.getParentData()%>});
});
</script>
</body>
</html>
<%}%>