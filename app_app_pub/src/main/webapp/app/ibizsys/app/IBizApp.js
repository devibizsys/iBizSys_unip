/**
 *应用程序全局对象
 *<主要提供，全局根路径弹出，全局唯一标识生成、页面注册注销>
 */
;
!function(window, undefined) {
	"use strict";
	
	$.getIBizApp=function()
	{
		var err=false;
		if($.ibizapp){
			try
			{
				if($.ibizapp.isValid())
				{
					return $.ibizapp;
				}
				else
				{
					$.ibizapp = null;
					err = true;
				}
			}
			catch(e)
			{
				$.ibizapp = null;
				err = true;
			}
		}
		if(!err)
		{
			try {
				if (window.parent && window.parent.rootlayer) 
					window.rootlayer = window.parent.rootlayer;
				else
					window.rootlayer = window.layer;
				
				if (window.parent && window.parent.ibizapp) {
					window.ibizapp = window.parent.ibizapp;
					$.ibizapp = window.ibizapp;
					if($.ibizapp)
						return $.ibizapp;
				}
				if(window.opener){
					if(window.opener.window){
						if(window.opener.window.ibizapp){
							var winId = null;
							$.each(document.location.search.substr(1).split('&'),function(c,q){
								var i = q.split('=');
								var key=i[0].toLowerCase();
								if(key=='windowid')
								{
									winId = decodeURIComponent(i[1]);
								}
							});
							if(winId){
								$.ibizapp = window.ibizapp = window.opener.window.ibizapp;
								if($.ibizapp)
									return $.ibizapp;
							}
						}
					}
				}
			} catch (e) {
			}
		}
		else
		{
			window.rootlayer = window.layer;
		}
		
		window.ibizapp = {
				autoId:1,
				ctrllers:{},
				windows:{},
				/**
				 * 注册视图
				 */
				regSRFController:function(ctrler){
					this.ctrllers[ctrler.getId()] = ctrler;
				},
				/**
				 * 注销视图
				 */
				unRegSRFController:function(ctrler){
					var id=ctrler.getId();
					ctrler.quit();
					this.ctrllers[id] = null;
					delete this.ctrllers[id];
				},
				/**
				 * 注销视图
				 */
				unRegSRFController2:function(id){
					this.ctrllers[id] = null;
					delete this.ctrllers[id];
				},
				/**
				 * 获取视图
				 */
				getSRFController:function(openerid){
					return this.ctrllers[openerid];
				},
				/**
				 * 检查控制器
				 */
				checkSRFControllers:function(){
					try
					{
						var bStop=false;
						while(!bStop)
						{
							bStop = true;
							for (var A in this.ctrllers) {
					            var ctrl = this.ctrllers[A];
					            try
					            {
						            if(ctrl.isClosed())
						            {
						            	this.unRegSRFController(ctrl);
						            	bStop = false;
						            	break;
						            }
					            }
					            catch(e)
					            {
					            	this.unRegSRFController2(A);
					            	bStop = false;
					            	break;
					            }
					        }
						}
						this.lastTimer = new Date().getTime();
					}
					catch(e)
					{
						
					}
				},
				/**
				 * 创建唯一标识
				 */
				genUUID:function(){
					return window.ibizapp.autoId++;
				},
				createWindowByView:function(view){
					var me = this;
					var win = new IBizWindow({});
					me.windows[win.getId()] = win;
						
					win.title = view.title;
					win.height = view.height?view.height:0;
					win.width = view.width?view.width:0;
					win.url = BASEURL+'/jsp'+view.viewurl+'?'+(view.viewparam?$.param(view.viewparam):'');
					
					return win;
				},
				/**
				 * 创建窗口
				 */
				createWindow:function(cfg){
					var me = this;
					var window = new IBizWindow(cfg);
					me.windows[window.getId()] = window;
					return window;
				},
				/**
				 * 查找窗口
				 */
				findWindow:function(winId){
					var me = this;
					if(me.windows){
						return me.windows[winId];
					}
					return null;
				},
				releaseWindow:function(winId){
					var me = this;
					me.windows[winId] = null;
					delete me.windows[winId];
				},
				
				parseURL:function(root,url,params){
					var tmpURL;
					if(url.toLowerCase().indexOf('http') != -1){
						tmpURL = url;
					}else{
						tmpURL = root+'/jsp'+ url;
					}
					
					if(params){
						return tmpURL + (url.indexOf('?')==-1?'?':'&') + $.param(params);
					}else{
						return tmpURL;
					}
				},
				parseURL2:function(subapp,url,params){
					var tmpURL;
					var root;
					if(subapp){
						root = WEBROOTURL;
					}else{
						root = BASEURL;
					}
						
					if(url.toLowerCase().indexOf('http') != -1){
						tmpURL = url;
					}else{
						tmpURL = root+'/jsp'+ url;
					}
					
					if(params){
						return tmpURL + (url.indexOf('?')==-1?'?':'&') + $.param(params);
					}else{
						return tmpURL;
					}
				},
				alert:function(title,info){
					if(!info){
						info = title;
					}
					try
					{
						if(window.opener && window.opener.window){
							mylayer = layer;
						}else{
							mylayer = window.rootlayer;
						}
					}
					catch(ex)
					{
						mylayer = window.rootlayer;
					}
					mylayer.alert(info, {});
					/*window.rootlayer.alert(title, {
				        skin: 'layui-layer-lan'
				        ,closeBtn: 0
				        ,shift: 1
				    });*/
				},
				confirm:function(info,callback){
					var index = window.rootlayer.confirm(info, {
					    btn: [$IGM('WINDOW.CONFIRM.CONFIRM','确认'),$IGM('WINDOW.CONFIRM.CANCEL','取消')]
					}, function(){
						window.rootlayer.close(index);
					    if(callback)
					    	callback(true);
					}, function(){
						window.rootlayer.close(index);
						if(callback)
					    	callback(false);
					});
				},
				/**
				 * 异步请求 方法过期请使用<IBiz.ajax()>
				 * @param url 地址
				 * @param params 参数
				 * @param method 请求类型，默认POST
				 * @param callback 回调
				 */
				ajax2 : function(data){
					if(!data || !data.url)
						return;
					var url = data.url;
					var method = data.method?data.method:'POST';
					var params = data.params?data.params:{};
					var dataType = data.dataType?data.dataType:'json';
					var success2 = data.success;
					var failure2 = data.failure;
					if(!url)
						return;
					if(!method)
						method = 'POST';
					if(!params)
						params = {};
					$.ajax({
						traditional : true,
						type : method,
						cache : false,
						url : url,
						dataType : dataType,
						data : params,
						success : function(e) {
							if (e.type == "error" || e.type == "warning" || e.type == "failure"){
								if(failure2)
									failure2(e);
							} 
							else{
								if(success2){
									success2(e);
								}
							}	
						},
						error : function(g, e, f) {
							if(failure2)
								failure2(e);
						},
						statusCode : {
							403 : function() {
								if(failure2)
									failure2(e);
							},
							404 : function() {
								if(failure2)
									failure2(e);
							}
						}
					});
				}	
				,isValid:function(){
					try
					{
						var me=this;
						var lastTimer = new Date().getTime();
						if(me.lastTimer!=undefined)
						{
							if(lastTimer-me.lastTimer>=10000)
							{
								return false;
							}
							else
								return true;
						}
						
						return true;
					}
					catch(e)
					{
						return false;
					}
				}
		};
		$.ibizapp = window.ibizapp;
		
		setInterval(function(){$.ibizapp.checkSRFControllers();},2000);
		
		return $.ibizapp;
	};
	
	$.getIBizApp();
	
}(window) 

function $IBizC(id){
	return $.ibizapp.getSRFController(id);
}