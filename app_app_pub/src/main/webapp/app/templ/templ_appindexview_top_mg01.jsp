<%@page contentType="text/html;charset=UTF-8"%>
<body>
<div class="page-header" style="height:auto;">
	<div class="mini_nav">
          <div class="inMain fv-right fc-ab">
              <span id="timer"></span>
              <script>
                  setInterval("timeStr=new Date().toLocaleString();timer.innerText=timeStr;",1000)
              </script>
              <span class="mg-lr-ab">王艳</span>
              <span><a href="javascript:void(0);">退出</a></span>
          </div>
      </div>
	<div class="page-header-top main_nav" >
		<div class="container" style="width:1000px;">
       	 	 <div class="inMain">
	                <h1><img alt="" src="../../apputil/images/logo_1.png" class="fv-middle"><img alt="" src="../../apputil/images/logo_2.png" class="mg-l-ac fv-middle"></h1>
	                <div class="search">
	                    <div class="search-box">
	                        <div class="search-input-box"><input id="tbxsearchtext" type="text"><i class="icon icon-search"></i></div>
	                        <button title="搜通讯录" style="margin-left:5px;"   class="dept_select btn btn-info" onclick='searchtxl();'><span >搜通讯录</span></button>  
	                        <button title="搜文档"   class="dept_select btn btn-info"  onclick='searchwd();'><span >搜文档</span></button> 
	                    </div>
	                   <!--  <div class="search-keyword "><span class="mg-r-ac fc-ab">最近搜索</span><a href="#">毕肖行</a><a href="#">刘鹏</a><a href="#">王青青</a><a href="#">清空</a></div> -->
	                </div>
	            </div>
		</div>
	</div>
	<div class="page-header-menu" style="background-image: url(../../apputil/images/icon_menu_bg.png) !important;background-repeat: repeat-x;">
		<div class="container" style="width:990px">
			<div class="hor-menu ">
				<ul class="ibiz-id-mainmenu nav navbar-nav">
				</ul>
			</div>
		</div>
	</div>
	<script>
		function searchtxl(){
			var text=$('#tbxsearchtext').val();
			text = text.trim();
			if(text==''){
				IBiz.alert('','请输入要查询的通讯录信息',1);
				return;
			}
			
			var param={};
			param['n_demobxdname_like'] = text;
			var url = "indexview5.jsp?"+$.param(param);
			window.location.href=url;
		}
		
		function searchwd(){
			var text=$('#tbxsearchtext').val();
			text = text.trim();
			if(text==''){
				IBiz.alert('','请输入要查询的文档信息',1);
				return;
			}
			
		}
</script>
</div>
<div class="page-container ibiz-index-page-content ibiz-page-content bg-inverse" style='padding:5px'>
	<iframe id="index-iframe" src="" style="width:100%;border:0;frameborder:0;scrolling: no;" frameborder="no" 
			border="0" 
			marginwidth="0" 
			marginheight="0" 
			scrolling="no" 
			allowtransparency="yes"></iframe>
</div>
