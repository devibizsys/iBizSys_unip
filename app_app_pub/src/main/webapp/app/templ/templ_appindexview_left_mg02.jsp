<%@page contentType="text/html;charset=UTF-8"%>
<body class="page-header-fixed page-quick-sidebar-over-content page-sidebar-closed-hide-logo page-container-bg-solid">
<!-- BEGIN HEADER -->
<div class="page-header navbar navbar-fixed-top">
	<!-- BEGIN HEADER INNER -->
	<div class="page-header-inner main_nav">
		<!-- BEGIN LOGO -->
		<div class="ibiz-page-logo" style="padding-top:5px;" >
			<img class="fv-middle" alt="" src="../../apputil/images/logo_2.png" style="padding:10px;padding-top:5px;">
			<span class="fc-ab mg-l-ac fs-ad ff-ac fw-ac"  style="margin-top:20px;"><%=vc.getCaption()%></span>
        	<div class="top-menu" style="margin-top:-5px;" >
			<ul class="nav navbar-nav pull-right">
				<li class="dropdown dropdown-extended dropdown-notification" id="header_notification_bar">
					<a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> 
						<i class="icon-bell"></i> 
						<span class="badge badge-default ibiz-id-counter"></span>
					</a>
					<ul class="dropdown-menu ibiz-id-menu" >
					</ul>
				</li>
				<li class="dropdown dropdown-extended dropdown-inbox" id="header_inbox_bar">
					<a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> 
						<i class="icon-envelope-open"></i> 
						<span class="badge badge-default ibiz-id-counter"></span>
					</a>
					<ul class="dropdown-menu ibiz-id-menu">
					</ul>
				</li>
				<li class="dropdown dropdown-extended dropdown-tasks" id="header_task_bar">
					<a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> 
						<i class="icon-calendar"></i> 
						<span class="badge badge-default ibiz-id-counter"></span>
					</a>
					<ul class="dropdown-menu ibiz-id-menu">
					</ul>
				</li>
				<li class="dropdown dropdown-user">
					<a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true"> 
						<img alt="" class="img-circle" src="${'$'}{ctx}/assets/metronic/4.1.0/layout/img/avatar3_small.jpg" /> 
						<span class="username username-hide-on-mobile"><%=WebContext.getCurrent().getCurUserName()%></span> 
						<i class="fa fa-angle-down"></i>
					</a>
					<ul class="dropdown-menu dropdown-menu-default">
						<li>
							<a href="extra_profile.html"> <i class="icon-user"></i>个人信息</a>
						</li>
						<li>
							<a href="page_calendar.html"><i class="icon-calendar"></i>我的日程</a>
						</li>
						<li>
							<a href="inbox.html"> <i class="icon-envelope-open"></i>收件箱<span class="badge badge-danger">3</span></a>
						</li>
						<li>
							<a href="page_todo.html"> <i class="icon-rocket"></i>我的任务<span class="badge badge-success">2</span></a>
						</li>
						<li class="divider"></li>
						<li>
							<a href="extra_lock.html"> <i class="icon-lock"></i>锁屏</a>
						</li>
						<li>
							<a href="login.html"> <i class="icon-key"></i>注销</a>
						</li>
					</ul>
				</li>
				<!-- END USER LOGIN DROPDOWN -->
				<!-- BEGIN QUICK SIDEBAR TOGGLER -->
				<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
				<li class="dropdown dropdown-quick-sidebar-toggler"><a
					href="javascript:;" class="dropdown-toggle"> <i
						class="icon-logout"></i>
				</a></li>
				<!-- END QUICK SIDEBAR TOGGLER -->
			</ul>
		</div>
		</div>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="menu-toggler responsive-toggler"
			data-toggle="collapse" data-target=".navbar-collapse"> </a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN TOP NAVIGATION MENU -->
		
		<!-- END TOP NAVIGATION MENU -->
	</div>
	<!-- END HEADER INNER -->
</div>
<!-- END HEADER -->
<div class="clearfix"></div>
<!-- BEGIN CONTAINER -->
<div class="page-container">
	<!-- BEGIN SIDEBAR -->
	<div class="page-sidebar-wrapper">
		<div class="page-sidebar navbar-collapse collapse">
			<ul class="page-sidebar-menu " data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
				<li class="sidebar-toggler-wrapper">
					<div class="sidebar-toggler">
					</div>
				</li>
				<li class="sidebar-search-wrapper">
					<form class="sidebar-search " action="#" method="POST">
						<a href="javascript:;" class="remove">
						<i class="icon-close"></i>
						</a>
						<div class="input-group">
							<input id="menu_tbsearch" type="text" class="form-control">
							<span class="input-group-btn">
							<a href="javascript:;" class="btn submit"><i class="icon-magnifier"></i></a>
							</span>
						</div>
					</form>
				</li>
			</ul>
			<ul class="page-sidebar-menu ibiz-id-mainmenu" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
			</ul>
		</div>
	</div>
</div>
<!-- BEGIN CONTENT -->
<div class="page-content-wrapper">
	<div class="page-content ibiz-index-page-content" style='padding:5px'>
		<iframe id="index-iframe" src="" style="width:100%;border:0;frameborder:0;scrolling: no;" frameborder="no" 
				border="0" 
				marginwidth="0" 
				marginheight="0" 
				scrolling="no" 
				allowtransparency="yes"></iframe>
	</div>
</div>
