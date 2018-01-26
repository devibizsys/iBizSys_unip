<%@page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="page1" scope="page" class="net.ibizsys.paas.web.jquery.WFRedirectPage" />
<% if(!page1.init(pageContext)) return;%>