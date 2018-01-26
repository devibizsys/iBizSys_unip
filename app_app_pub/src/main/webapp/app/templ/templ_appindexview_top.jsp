<%@page contentType="text/html;charset=UTF-8"%>
<body class="skin-blue sidebar-mini">
<div class="main-header">
	<header class="main-header">
    	<a href="index.jsp" class="logo">
      		<span class="logo-mini"><b>I</b>biz</span>
      		<span class="logo-lg"><b>iBiz</b>Sys5</span>
    	</a>
    	<div class="navbar navbar-static-top"  role="navigation">
			
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
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <!-- The user image in the navbar-->
<!--               <img src="" class="user-image" alt="User Image"> -->
              <!-- hidden-xs hides the username on small devices so only the image appears. -->
			  <span class="hidden-xs"><%=WebContext.getCurrent().getCurUserName()%></span>
            </a>
<!--             <ul class="dropdown-menu"> -->
              <!-- The user image in the menu -->
<!--               <li class="user-header"> -->
<!--                 <img src="../../assets/metronic/4.1.0/layout/img/avatar3_small.jpg" class="img-circle" alt="User Image"> -->
<!--               </li> -->
              <!-- Menu Footer-->
<!--               <li class="user-footer"> -->
<!--                 <div class="pull-left"> -->
<!--                   <a href="#" class="btn btn-default btn-flat">简介</a> -->
<!--                 </div> -->
<!--                 <span class="pull-right"> -->
<!--                   <a href="../../ibizutil/login.jsp" class="btn btn-default btn-flat">注销</a> -->
<!--                 </span> -->
<!--               </li> -->
<!--             </ul> -->
          </li>
          <li>
<!-- 	          	<a class="pull-right"> -->
	              <a href="../../ibizutil/login.jsp" class="btn btn-default btn-flat">注销</a>
<!-- 	            </a> -->
          </li>
          <!-- Control Sidebar Toggle Button -->
        </ul>
      </div>
		</div>
  </header>
</div>
<div class="ibiz-top-menu">
	<ul class="ibiz-id-mainmenu nav navbar-nav">
	</ul>
</div>
<div class="page-container ibiz-index-page-content" style='padding:5px;'>
	<iframe id="index-iframe" src="" style="width:100%;border:0;frameborder:0;scrolling: no;" frameborder="no" 
			border="0" 
			marginwidth="0" 
			marginheight="0" 
			scrolling="no" 
			allowtransparency="yes"></iframe>
</div>
