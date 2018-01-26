/*首页*/
var IndexViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.config = $.extend({},this.config,config);
		var me = this;
		if(config.menualign == 'left' || config.menualign == '')
		{
//			me.render = new LeftIndexViewRender();
			me.render = new adminLTELeftIndexViewRender();
		}
		else
		{
			me.render = new TopIndexViewRender();
		}
//		setInterval(function(){me.resize();},2000);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		me.pageContent = $('.ibiz-index-page-content');
		me.pageFrame=  $("#index-iframe");
		me.pageHeader=  $(".main-header");
		
		
		$(window).resize(function() {
			me.resize();
		});
		IBiz.ajax({url:me.config.backendurl,
						params:{srfctrlid:'appmenu',srfaction:'FETCH'},
						method:'POST',
						success:function(data){
							me.onMenuLoaded(data);
						},failure:function(data){
							IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('INDEXVIEWCONTROLLER.INIT.INFO','加载菜单失败,'+data,[data]),2);
						}
		});
		$("#menu_tbsearch").bind("input propertychange", function() {
			me.searchTextChanged($(this));
		});
		me.notibar = $('#header_notification_bar');
		me.inboxbar = $('#header_inbox_bar');
		me.taskbar = $('#header_task_bar');

		//初始化数量
		if(me.config.portalcountertag){
			me.uiCounter = me.getUICounter(me.config.portalcountertag);
			if(me.uiCounter){
				me.uiCounter.on(IBizCounter.COUNTERCHANGED,function(sender,args,e){
					e.data.onCounterChanged();
				},me);
			}
		}
		
		$('#index-iframe').load(function(){me.resize();});
		
		//打开默认视图
		if(me.config.defviewurl){
			var defurl = $.getIBizApp().parseURL(BASEURL,me.config.defviewurl,me.viewparam);
			$('#index-iframe').attr("src",defurl); 
		}
		
	},
	/**
	 * 数量发生变化
	 */
	onCounterChanged:function(){
		var me = this;
		if(!me.uiCounter){
			return;
		}
		var data = me.uiCounter.getData();
		if(!data){
			return;
		}
		var wfdata = me.render.renderWFTask(data.WFTASK);
		me.notibar.find('.ibiz-id-counter').html(wfdata.count);
		me.notibar.find('.ibiz-id-menu').html(wfdata.html);
		
		var msgdata = me.render.renderMessage(data.MESSAGE);
		me.inboxbar.find('.ibiz-id-counter').html(msgdata.count);
		me.inboxbar.find('.ibiz-id-menu').html(msgdata.html);
		
		var notidata = me.render.renderNotification(data.NOTIFICATION);
		me.taskbar.find('.ibiz-id-counter').html(notidata.count);
		me.taskbar.find('.ibiz-id-menu').html(notidata.html);
		
		me.initSlimScroll('.scroller');
		
		var mainMenu = $('.ibiz-id-mainmenu');
		if(mainMenu && me.listCounterId){
			for(var i = 0;i < me.listCounterId.length; i++) {
				var strKey = me.listCounterId[i];
				var strValue = data[strKey];
				if(!strValue)
					strValue = "";
				mainMenu.find('.'+strKey).html(strValue);
			}
		}
	},
	/**
	 * 初始化滚动条
	 */
	initSlimScroll: function(el) {
        $(el).each(function() {
            var height;
            if ($(this).attr("data-height")){
                height = $(this).attr("data-height");
            }else{
                height = $(this).css('height');
            }
            $(this).slimScroll({
                height: height
            });
        });
	},
	/**
	 * 展开菜单
	 */
	expandMenu:function(){
		var me = this;
		if(me.isMenuClosed()){
			setTimeout(function(){
				$('.page-sidebar .sidebar-toggler').click();
			},200);
		}
	},
	/**
	 * 收起菜单
	 */
	closeMenu:function(){
		var me = this;
		if(me.isMenuClosed()){
			return;
		}
		setTimeout(function(){
			$('.page-sidebar .sidebar-toggler').click();
		},200);
	},
	isMenuClosed:function(){
		return $('.page-sidebar-menu-closed').length>0;
	},
	resize:function(){
		var oHeight = 0;		
		var me=this;
		
		var defurl = me.pageFrame.attr("src");
		if(!defurl || defurl=='')
		{
			return;
		}
		else
		{
			var body = me.pageFrame.contents().find("body");
			if(!body){
				return;
			}
			
			var bFill = body.is(".ibiz-body-fill");
			if(bFill)
			{
				oHeight = 600;
				if(me.config.menualign == 'top')
				{
					oHeight =  $(window).height()-$(".ibiz-id-mainmenu").height()-me.pageHeader.height();
				}
				else
				{
					var secPaddingTop = parseInt($(".content").css("padding-top").replace("px",""));
					var secPaddingButton = parseInt($(".content").css("padding-top").replace("px",""));
					oHeight = $(window).height()- me.pageHeader.height()-secPaddingTop-secPaddingButton;
				}
				oHeight-=5;
				
				var top=me.pageContent.css('padding-top');
				if(top)
				{
					oHeight -=parseInt(top);
				}
				var bottom=me.pageContent.css('padding-bottom');
				if(bottom)
				{
					oHeight -=parseInt(bottom);
				}
			}
			else
			{
				oHeight = body.height();
			}
		}
		
		if(oHeight >0 && me.pageFrame.height()!=oHeight){
			me.pageFrame.height(oHeight);
		}
	},
	onMenuLoaded:function(data){
		var me = this;
		if(data.ret != 0){
			IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('INDEXVIEWCONTROLLER.INIT.INFO','加载菜单失败,'+data.info,[data.info]),2);
			return;
		}
		me.menudata = data.items;
		if(me.config.menualign == 'none')
			return;
		
		var menuitem = me.render.render(me.menudata,0,false);
		$('.ibiz-id-mainmenu').html(menuitem.join(''));
		me.resize();
		$('[data-hover="megamenu-dropdown"]').not('.hover-initialized').each(function() {   
//	        $(this).dropdownHover(); 
	        $(this).addClass('hover-initialized'); 
	    });
		$('a.menu-item').click(function(e){
			me.menuItemClicked($(this).attr("ibiz-data-appfuncid"));
		});
		
		var openfuncid = null;
		
		$.each(me.menudata,function(idx,item){
			if(item.opendefault && item.opendefault == true){
				openfuncid = item.appfuncid;
				return false;
			}
		});
		if(openfuncid != null){
			me.menuItemClicked(openfuncid);
		}

		//存储菜单计数标识
		me.listCounterId = [];
		me.fillCounterId(me.menudata);
		
		if(me.uiCounter)
			me.uiCounter.reload();
	},
	fillCounterId:function(items){
		var me = this;
		if(items && items.length>0)
		{
			$.each(items,function(index,item){
				if(item.counterid)
					me.listCounterId.push(item.counterid);
				
				if(item.items){
					me.fillCounterId(item.items);
				}
			})
		}
	},
	/*菜单项被点击*/
	menuItemClicked:function(funcid){
		var me = this;
		var func = me.getAppFunc({"appfuncid":funcid});
		if(func)
		{
			var url;
			if(func.functype == 'SUBAPPVIEW' && func.subapp)
			{
				url = $.getIBizApp().parseURL(WEBROOTURL+'/'+func.subapp,func.viewurl,{});
			}else if(func.functype == 'OPENHTMLPAGE' && func.htmlPageUrl)
			{
				url = func.htmlPageUrl;
			}else if(func.functype == 'JAVASCRIPT' && func.jsCode)
			{
				try
				{
					eval(func.jsCode);
				}
				catch(e){}
			}else if(func.functype == 'PDTAPPFUNC' && func.pdtAppFuncId)
			{
				
			}else if(func.functype == 'CUSTOM')
			{
				
			}else{
				url = $.getIBizApp().parseURL(BASEURL,func.viewurl,{});
			}
			
			if(url && url != ''){
				url += (url.indexOf('?')==-1?'?':'&');
				if(func.openmode == 'INDEXVIEWPOPUP' || func.openmode == 'INDEXVIEWPOPUPMODAL'){
					
					var win = $.getIBizApp().createWindow({});
					var viewparam = {};
					viewparam['windowid'] = win.getId();
					$.extend(viewparam,func.openviewparam);
					win.viewparam = viewparam;
					
					win.scope = me;
					win.title = func.viewtitle;
					win.height = func.viewheight;
					win.width = func.viewwidth;
					win.url = url;
					
					win.openModal(window);
				}else if(func.openmode == 'HTMLPOPUP'){
					var win = $.getIBizApp().createWindow({});
					var viewparam = {};
					viewparam['windowid'] = win.getId();
					$.extend(viewparam,func.openviewparam);
					win.viewparam = viewparam;
					win.scope = me;
					win.title = func.title;
					win.height = func.viewheight;
					win.width = func.viewwidth;
					win.url = url;
					win.openInNewWindow(window);
				}else if(func.openmode == 'TOP'){
					if(func.openviewparam){
						url += $.param(func.openviewparam);
					}
					window.location.href = url;
					return;
				}else{
					if(func.openviewparam){
						url += $.param(func.openviewparam);
					}
					var indexframe = $('#index-iframe');
					if(indexframe[0])
					{
						try
						{
							indexframe[0].contentWindow.document.write('')  
							indexframe[0].contentWindow.document.close();  
							indexframe[0].contentWindow.close();
						}
						catch(e)
						{
							
						}
						
						try
						{
							indexframe.attr('src', 'about:blank');  
						}
						catch(e)
						{
							
						}
						
						
						//indexframe.remove();  
					}
					indexframe.attr("src",url); 
					me.resize();
				}
			}
			
			
			if(func.hidesidebar != undefined && func.hidesidebar != 'undefined' && func.hidesidebar == true){
				me.closeMenu();
			}
		}
	},
	/**搜索框值变化*/
	searchTextChanged:function(text){
		var me = this;
		if(me.lastsearchtext == text.val())
			return;
		me.lastsearchtext = text.val().toLocaleLowerCase();
		var menuitemdata;
		if(me.lastsearchtext.length>0 && me.menudata && me.menudata.length>0){
			var result = [];
			$.each(me.menudata,function(index,item){
				if(item.items && item.items.length>0){	
					$.each(item.items,function(i,subitem){
						if(subitem.text.toLocaleLowerCase().indexOf(me.lastsearchtext) != -1){
							result.push(subitem);
						}
					});
				}else{
					if(item.text.toLocaleLowerCase().indexOf(me.lastsearchtext) != -1){
						result.push(item);
					}
				}
			});
			var root = [{text:$IGM('INDEXVIEWCONTROLLER.SEARCHTEXTCHANGED.INFO','查找结果：'),expanded:true,items:result}];
			
			menuitemdata = me.render.render(root,0,false);
		}
		else{
			menuitemdata = me.render.render(me.menudata,0,false);
		}
		$('.ibiz-id-mainmenu').html(menuitemdata.join(''));
		$('[data-hover="megamenu-dropdown"]').not('.hover-initialized').each(function() {   
	        $(this).dropdownHover(); 
	        $(this).addClass('hover-initialized'); 
	    });
		$('a.menu-item').click(function(e){
			me.menuItemClicked($(this).attr("ibiz-data-appfuncid"));
		});
	}
});
/**
 * 左侧菜单绘制器
 */
var LeftIndexViewRender = Class.extend({
	render:function(items,level,bmega){
		var me = this;
		var  menuitem = [];
		if(items && items.length>0)
		{
			$.each(items,function(index,item){
				var iconcls = 'fa fa-th-large';
				if(item.iconcls && item.iconcls !=undefined && item.iconcls != 'undefined'){
					iconcls = item.iconcls;
				}
				var textcls = '';
				if(item.textcls && item.textcls !=undefined && item.textcls != 'undefined'){
					textcls = item.textcls;
				}
				if(item.items && item.items.length>0)
				{	
					menuitem.push('<li class="'+(item.expanded?'open':'')+'">');
					menuitem.push('<a href="javascript:void(0);">');
					menuitem.push('<i class="'+iconcls+'"></i>');
					menuitem.push('<span class="title '+textcls+'">'+item.text+'</span>');
					if(item.counterid)
						menuitem.push('<span class="badge badge-default ibiz-counter '+item.counterid+'"></span>');
					menuitem.push('<span class="arrow"></span>');
					menuitem.push('</a>');
					menuitem.push('<ul class="sub-menu" '+  (item.expanded?'style="display:block;"':'')+'>');
					//输出子节点
					var subitem = me.render(item.items,(level+1),bmega);
					menuitem = menuitem.concat(subitem); 
					menuitem.push('</ul></li>');
				}else
				{
					menuitem.push('<li><a class="menu-item" ibiz-data-appfuncid="'+item.appfuncid+'" href="javascript:void(0);"><i class="'+iconcls+'"></i>');
					menuitem.push('<span class="title '+textcls+'">'+item.text+'</span>');
					if(item.counterid)
						menuitem.push('<span class="badge badge-default ibiz-counter '+item.counterid+'"></span>');
					menuitem.push('</a>');
					menuitem.push('</li>'); 
				}
			});
		}
		return menuitem;
	},
	/**
	 * 绘制提醒
	 */
	renderNotification:function(data){
		var countbadge = '';
		var list = [];
		if(data && data>0){
			countbadge = data;
		}
		return {count:countbadge,html:list.join('')};
	},
	/**
	 * 绘制消息
	 */
	renderMessage:function(data){
		var countbadge = '';
		var list = [];
		if(data && data>0){
			countbadge = data;
		}
		return {count:countbadge,html:list.join('')};
	},
	/**
	 * 绘制工作流代办
	 */
	renderWFTask:function(data){
		var countbadge = '';
		var tasklist = [];
		if(data && data.totalrow && data.totalrow >0){
			countbadge = data.totalrow;
			var items = data.items;
			if(items && items.length>0){
				
				tasklist.push('<li class="external">');
				tasklist.push('	<h3><span class="bold">'+countbadge+$IGM('INDEXVIEWCONTROLLER.RENDERWFTASK.INFO','条')+'</span>'+$IGM('INDEXVIEWCONTROLLER.RENDERWFTASK.INFO2','代办')+'</h3>');
				tasklist.push('	<a href="javascript:void(0);">'+$IGM('INDEXVIEWCONTROLLER.RENDERWFTASK.INFO3','查看全部')+'</a>');
				tasklist.push('</li>');
				
				tasklist.push('<li>');
				tasklist.push('<ul class="dropdown-menu-list scroller" style="height: 250px;" data-handle-color="#637283">');
				$.each(items,function(idx,item){
					var time = '';//moment("2015-10-30 10:32:00", "YYYY-MM-DD HH:mm:ss").fromNow();
					tasklist.push('<li>');
					tasklist.push('<a href="javascript:void(0);">');
					tasklist.push('	<span class="details">');
					tasklist.push('		<span class="label label-sm label-icon label-success">');
					tasklist.push('			<i class="fa fa-plus"></i>');
					tasklist.push('		</span>');
					tasklist.push(item.wfworkflowname);
					tasklist.push('	</span>');
					tasklist.push('	<span class="time" style="float:right">'+time+'</span>');
					tasklist.push('</a>');
					tasklist.push('</li>');
				});
				tasklist.push('</ul>');
				tasklist.push('</li>');
			}
		}
		return {count:countbadge,html:tasklist.join('')};
	}
});
/**
 * 使用adminLTE模板绘制左侧菜单绘制器
 */
var adminLTELeftIndexViewRender = Class.extend({
	render:function(items,level,bmega){
		var me = this;
		var  menuitem = [];
		if(items && items.length>0)
		{
			$.each(items,function(index,item){
				var iconcls = 'fa fa-th-large';
				if(item.iconcls && item.iconcls !=undefined && item.iconcls != 'undefined'){
					iconcls = item.iconcls;
				}
				var textcls = '';
				if(item.textcls && item.textcls !=undefined && item.textcls != 'undefined'){
					textcls = item.textcls;
				}
				if(item.items && item.items.length>0)
				{	
					menuitem.push('<li class="'+(item.expanded?'treeview active':'treeview')+'">');
					menuitem.push('<a href="javascript:void(0);">');
					menuitem.push('<i class="'+iconcls+'"></i>');
					menuitem.push('<span class="title">'+item.text+'</span>');
					if(item.counterid)
						menuitem.push('<span class="badge badge-default ibiz-counter '+item.counterid+'"></span>');
					menuitem.push('<span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>');
					menuitem.push('</a>');
					menuitem.push('<ul class="treeview-menu" '+  (item.expanded?'style="display:block;"':'')+'>');
					//输出子节点
					var subitem = me.render(item.items,(level+1),bmega);
					menuitem = menuitem.concat(subitem); 
					menuitem.push('</ul></li>');
				}else
				{
					menuitem.push('<li><a class="menu-item" ibiz-data-appfuncid="'+item.appfuncid+'" href="javascript:void(0);"><i class="'+iconcls+'"></i>');
					menuitem.push('<span class="title">'+item.text+'</span>');
					if(item.counterid)
						menuitem.push('<span class="badge badge-default ibiz-counter '+item.counterid+'"></span>');
					menuitem.push('</a>');
					menuitem.push('</li>');
				}
			});
		}
		return menuitem;
	},
	/**
	 * 绘制提醒
	 */
	renderNotification:function(data){
		var countbadge = '';
		var list = [];
		if(data && data>0){
			countbadge = data;
		}
		return {count:countbadge,html:list.join('')};
	},
	/**
	 * 绘制消息
	 */
	renderMessage:function(data){
		var countbadge = '';
		var list = [];
		if(data && data>0){
			countbadge = data;
		}
		return {count:countbadge,html:list.join('')};
	},
	/**
	 * 绘制工作流代办
	 */
	renderWFTask:function(data){
		var countbadge = '';
		var tasklist = [];
		if(data && data.totalrow && data.totalrow >0){
			countbadge = data.totalrow;
			var items = data.items;
			var srfkey = items[0].userdata;
			var srfdeid = items[0].userdata4;
			if(items && items.length>0){
				tasklist.push('<li class="header">');
				tasklist.push('<span class="text-red bold">'+countbadge+$IGM('INDEXVIEWCONTROLLER.RENDERWFTASK.INFO','条')+'</span>'+$IGM('INDEXVIEWCONTROLLER.RENDERWFTASK.INFO2','代办'));
				tasklist.push('</li>');
				
				tasklist.push('<li>');
				tasklist.push('<ul class="menu">');
				$.each(items,function(idx,item){
					var time = '';//moment("2015-10-30 10:32:00", "YYYY-MM-DD HH:mm:ss").fromNow();
					tasklist.push('<li>');
					tasklist.push('<a href="../../ibizutil/wfredirectview.jsp?srfkey='+srfkey+'&srfdeid='+srfdeid+'">');
					tasklist.push('			<i class="fa fa-users text-aqua"></i>');
					tasklist.push(item.wfworkflowname);
					tasklist.push('</a>');
					tasklist.push('</li>');
				});
				tasklist.push('</ul>');
				tasklist.push('</li>');
				tasklist.push('<li class="footer">');
				tasklist.push('	<a href="javascript:void(0);">'+$IGM('INDEXVIEWCONTROLLER.RENDERWFTASK.INFO3','查看全部')+'</a>');
				tasklist.push('</li>');
			}
		}
		return {count:countbadge,html:tasklist.join('')};
	}
});
/**
 * 顶部菜单绘制器
 */
var TopIndexViewRender = LeftIndexViewRender.extend({
	render:function(items,level,bmega){
		var me = this;
		var  menuitem = [];
		if(items && items.length>0)
		{
			$.each(items,function(index,item){
				var iconcls = 'fa fa-th-large';
				if(item.iconcls && item.iconcls !=undefined && item.iconcls != 'undefined'){
					iconcls = item.iconcls;
				}
				var textcls = '';
				if(item.textcls && item.textcls !=undefined && item.textcls != 'undefined'){
					textcls = item.textcls;
				}
				//判断是否平铺
				var bTmpMega = false;
				if(bmega){
					bTmpMega = true;
				}else{
					if(item.mega){
						bTmpMega = item.mega;
					}
				}
				if(item.items && item.items.length>0)
				{	
					if(level == 0)
					{
						if(bTmpMega){
							menuitem.push('<li class="menu-dropdown mega-menu-dropdown ">');
							menuitem.push('<a data-hover="megamenu-dropdown" data-close-others="true" data-toggle="dropdown" href="javascript:void(0);" class="dropdown-toggle">');
							menuitem.push('<i class="'+iconcls+'"></i>');
							menuitem.push('<span class="title '+textcls+'">'+item.text+'</span>');
							menuitem.push('<i class="fa fa-angle-down"></i>');
							menuitem.push('</a>');
							menuitem.push('<ul class="dropdown-menu" style="min-width: 710px">');
							menuitem.push('<li>');
							menuitem.push('<div class="mega-menu-content">');
							menuitem.push('<div class="row">');
						}else{
							menuitem.push('<li class="menu-dropdown classic-menu-dropdown">');
							menuitem.push('<a data-hover="megamenu-dropdown" data-close-others="true" data-toggle="dropdown" href="javascript:void(0);">');
							menuitem.push('<i class="'+iconcls+'"></i>');
							menuitem.push('<span class="title '+textcls+'">'+item.text+'</span>');
							menuitem.push('<i class="fa fa-angle-down"></i></a>');
						}
						if(bTmpMega){
							var subitem = me.render(item.items,(level+1),bTmpMega);
							menuitem = menuitem.concat(subitem); 
							menuitem.push('</div></div></li></ul></li>');
							
						}else{
							menuitem.push('<ul class="dropdown-menu pull-left">');
							var subitem = me.render(item.items,(level+1),bTmpMega);
							menuitem = menuitem.concat(subitem); 
							menuitem.push('</ul></li>');
						}
					}
					if(level == 1){
						if(bTmpMega){
							menuitem.push('<div class="col-md-4">');
							menuitem.push('<ul class="mega-menu-submenu">');
							menuitem.push('<li>');
							menuitem.push('<h3>'+item.text+'</h3>');
							menuitem.push('</li>');
							
							var subitem = me.render(item.items,(level+1),bTmpMega);
							menuitem = menuitem.concat(subitem); 
							menuitem.push('</ul></div>');
						}else{
							menuitem.push('<li class="dropdown-submenu">');
							menuitem.push('<a href="javascript:void(0);">');
							menuitem.push('<i class="'+iconcls+'"></i>');
							menuitem.push('<span class="title '+textcls+'">'+item.text+'</span>');
							menuitem.push('</a>');
							
							menuitem.push('<ul class="dropdown-menu pull-left">');
							var subitem = me.render(item.items,(level+1),bTmpMega);
							menuitem = menuitem.concat(subitem); 
							menuitem.push('</ul></li>');
						}
					}
					if(level>1)
					{
						if(!bTmpMega){
							menuitem.push('<li class="dropdown-submenu">');
							menuitem.push('<a href="javascript:void(0);">');
							menuitem.push('<i class="'+iconcls+'"></i>');
							menuitem.push('<span class="title '+textcls+'">'+item.text+'</span>');
							menuitem.push('</a>');
						}
					}
				}else
				{
					if(bTmpMega){
						menuitem.push('<li>');
						menuitem.push('<a class="menu-item iconify" ibiz-data-appfuncid="'+item.appfuncid+'" href="javascript:void(0);">');
						menuitem.push('<i class="'+iconcls+'"></i>');
						menuitem.push('<span class="'+textcls+'">'+item.text+'</span>');
						menuitem.push('</a>');
						menuitem.push('</li>');
					}else{
						menuitem.push('<li><a class="menu-item" ibiz-data-appfuncid="'+item.appfuncid+'" href="javascript:void(0);"><i class="'+iconcls+'"></i>');
						menuitem.push('<span class="title '+textcls+'">'+item.text+'</span>');
						menuitem.push('</a>');
						menuitem.push('</li>'); 
					}
				}
			});
		}
		return menuitem;
	},
	/**
	 * 绘制工作流代办
	 */
	renderWFTask:function(data){
		var countbadge = '';
		var tasklist = [];
		if(data && data.totalrow && data.totalrow >0){
			countbadge = data.totalrow;
			var items = data.items;
			var srfkey = items[0].userdata;
			var srfdeid = items[0].userdata4;
			if(items && items.length>0){
				tasklist.push('<li class="header">');
				tasklist.push('<span class="text-red bold">'+countbadge+$IGM('INDEXVIEWCONTROLLER.RENDERWFTASK.INFO','条')+'</span>'+$IGM('INDEXVIEWCONTROLLER.RENDERWFTASK.INFO2','代办'));
				tasklist.push('</li>');
				
				tasklist.push('<li>');
				tasklist.push('<ul class="menu">');
				$.each(items,function(idx,item){
					var time = '';//moment("2015-10-30 10:32:00", "YYYY-MM-DD HH:mm:ss").fromNow();
					tasklist.push('<li>');
					tasklist.push('<a href="../../ibizutil/wfredirectview.jsp?srfkey='+srfkey+'&srfdeid='+srfdeid+'">');
					tasklist.push('			<i class="fa fa-users text-aqua"></i>');
					tasklist.push(item.wfworkflowname);
					tasklist.push('</a>');
					tasklist.push('</li>');
				});
				tasklist.push('</ul>');
				tasklist.push('</li>');
				tasklist.push('<li class="footer">');
				tasklist.push('	<a href="javascript:void(0);">'+$IGM('INDEXVIEWCONTROLLER.RENDERWFTASK.INFO3','查看全部')+'</a>');
				tasklist.push('</li>');
			}
		}
		return {count:countbadge,html:tasklist.join('')};
	}
});