<%@page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="p" scope="page" class="net.ibizsys.paas.web.jquery.RedirectVCPage" />
<% if(!p.init(pageContext,"/app/xxtz/OA_RZRYRedirectView.do")){return;}%>