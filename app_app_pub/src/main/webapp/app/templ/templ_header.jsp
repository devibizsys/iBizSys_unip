<%@page contentType="text/html;charset=UTF-8"%>
<%@ page import="net.ibizsys.paas.controller.ViewControllerGlobal" language="java"%>
<%@ page import="net.ibizsys.paas.controller.IViewController" language="java"%>
<%
	String strController = request.getParameter("controller");
	String strPartUrl = request.getParameter("parturl");
	String strCId = request.getParameter("cid");
	String strEmbed = request.getParameter("embed");
	boolean bEmbedMode = (strEmbed.compareTo("true")==0);
	String strIFChild = request.getParameter("ifchild");
	boolean bIFChild = (strIFChild.compareTo("true")==0);
	IViewController vc=ViewControllerGlobal.getViewController(strController);
%>

