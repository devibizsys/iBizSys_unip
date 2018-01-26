 <%@page contentType="text/html;charset=UTF-8"%>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">


    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
	    <!-- Logo -->
	    <a href="index.jsp" class="logo">
	      <!-- mini logo for sidebar mini 50x50 pixels -->
	      <span class="logo-mini"><b>I</b>biz</span>
	      <!-- logo for regular state and mobile devices -->
	      <span class="logo-lg"><b><%=vc.getCaption()%></b></span>
	    </a>
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      
<!--       <div class="back_img"></div> -->
   
      <a href="index.jsp" class="go_index">
      	<img src="../../ibizsys/image/home.png">
      	首页
      </a>
		
      <a href="#" class="go_forum">
      	<span>/</span>
<!--       	<img src="../../ibizsys/image/forum.png"> -->
      	<%=vc.getSubCaption()%>
      </a>
      
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Notifications Menu -->
          <li class="dropdown notifications-menu dropdown-extended dropdown-notification" id="header_notification_bar">
            <!-- Menu toggle button -->
            <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown" data-close-others="true">
<!--               <i class="fa fa-bell-o"></i> -->
<!-- 			  <img class="fa fa-bell-o" src="../../ibizsys/image/icon.png"> -->
              <span class="label label-warning ibiz-id-counter"></span>
            </a>
            <ul class="dropdown-menu ibiz-id-menu" >
			</ul>
          </li>
          <!-- User Account Menu -->
          <li class="dropdown user user-menu">
            <!-- Menu Toggle Button -->
            <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
<!-- 			  <i class="fa fa-user-circle"></i> -->
			  <span class="hidden-xs"><%=WebContext.getCurrent().getCurUserName()%></span>
			  <img class="fa fa-user-circle" src="../../ibizsys/image/user.png">
<!-- 			  <img class="user_img2" src="../../ibizsys/image/user2.png"> -->
            </a>
            <ul class="dropdown-menu ibiz-id-menu" >
		          <li>
		          	<a href="../../ibizutil/login.jsp" class="btn btn-default btn-flat">注销</a>
		          </li>
			</ul>
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
