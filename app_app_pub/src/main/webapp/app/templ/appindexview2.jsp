<%@page contentType="text/html;charset=UTF-8"%>
<%@ page import="net.ibizsys.paas.web.WebContext" language="java"%>
<%@include file="templ_header.jsp"%>
<%
	String strIndexViewIcon = vc.getAttribute("UI.APPICONPATH","");
	String strIndexViewIcon2 = vc.getAttribute("UI.APPICONPATH2","");
%>
<title><%=vc.getTitle(true)%></title>
</head>
<body>
<div class="page-header">
	<div class="page-header-top">
		<div class="container" style="width:100%">
			<div class="page-logo">
				<img src="<%=strIndexViewIcon%>" class="logo-default">
				<label style="color:#000;margin-top:25px;font-size:29px;"><%=vc.getCaption()%></label>
			</div>
			<div class="top-menu">
				<ul class="nav navbar-nav pull-right">
					<li class="dropdown dropdown-extended dropdown-notification" id="header_notification_bar">
						<a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> 
							<i class="icon-bell"></i> 
							<span class="badge badge-default ibiz-id-counter"></span>
						</a>
						<ul class="dropdown-menu ibiz-id-menu" >
						</ul>
					</li>
					<li class="dropdown dropdown-extended dropdown-tasks" id="header_task_bar">
						<a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> 
							<i class="icon-envelope-open"></i> 
							<span class="badge badge-default ibiz-id-counter"></span>
						</a>
						<ul class="dropdown-menu ibiz-id-menu">
						</ul>
					</li>
					<li class="dropdown dropdown-extended dropdown-inbox" id="header_inbox_bar">
						<a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> 
							<i class="icon-calendar"></i> 
							<span class="badge badge-default ibiz-id-counter"></span>
						</a>
						<ul class="dropdown-menu ibiz-id-menu">
						</ul>
					</li>
					<li class="dropdown dropdown-user">
						<a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> 
							<img alt="" class="img-circle" src="${ctx}/assets/metronic/4.1.0/layout/img/avatar3_small.jpg" /> 
							<span class="username username-hide-on-mobile"><%=WebContext.getCurrent().getCurUserName()%></span> 
							<i class="fa fa-angle-down"></i>
						</a>
						<ul class="dropdown-menu dropdown-menu-default">
							<li>
								<a href="javascript:void(0);"> <i class="icon-user"></i>个人信息</a>
							</li>
							<li>
								<a href="javascript:void(0);"><i class="icon-calendar"></i>我的日程</a>
							</li>
							<li>
								<a href="javascript:void(0);"> <i class="icon-envelope-open"></i>收件箱<span class="badge badge-danger">3</span></a>
							</li>
							<li class="divider"></li>
							<li>
								<a href="javascript:void(0);"> <i class="icon-key"></i>注销</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="page-header-menu">
		<div class="container" style="width:100%">
			<div class="hor-menu ">
				<ul class="ibiz-id-mainmenu nav navbar-nav">
				</ul>
			</div>
		</div>
	</div>
</div>
<div class="page-container">
	<iframe id="index-iframe" src="" style="width:100%;border:0;frameborder:0;scrolling: no;" frameborder="no" 
			border="0" 
			marginwidth="0" 
			marginheight="0" 
			scrolling="no" 
			allowtransparency="yes"></iframe>
</div>
</body>