 <%@page contentType="text/html;charset=UTF-8"%>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="index.jsp" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>I</b>biz</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>iBiz</b>Sys5</span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Notifications Menu -->
          <li class="dropdown notifications-menu dropdown-extended dropdown-notification" id="header_notification_bar">
            <!-- Menu toggle button -->
            <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" data-close-others="true">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning ibiz-id-counter"></span>
            </a>
            <ul class="dropdown-menu ibiz-id-menu" >
			</ul>
          </li>
          <!-- User Account Menu -->
          <li class="dropdown user user-menu">
            <!-- Menu Toggle Button -->
            <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
			  <i class="fa fa-user-circle"></i>
			  <span class="hidden-xs"><%=WebContext.getCurrent().getCurUserName()%></span>
            </a>
          </li>
          <li>
          	<a href="../../ibizutil/login.jsp" class="btn btn-default btn-flat">注销</a>
          </li>
          <!-- Control Sidebar Toggle Button -->
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
	<% if(strMainMenuAlign.compareTo("LEFT")==0){ %>
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar Menu -->
      <ul class="sidebar-menu ibiz-id-mainmenu" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200"></ul>
    </section>
    	<%} %>
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper ibiz-index-page-content">
    <!-- Main content -->
    <section class="content">

      <iframe id="index-iframe" src="" style="width:100%;border:0;frameborder:0;scrolling: no;" frameborder="no" 
				border="0" 
				marginwidth="0" 
				marginheight="0" 
				scrolling="no" 
				allowtransparency="yes"></iframe>

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <!-- Control Sidebar -->

</div>
