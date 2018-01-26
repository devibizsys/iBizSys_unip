;(function ($){
  'use strict';
  function _isNumber(n) {
    return n instanceof Number || (typeof n == "number");
  }
  $.fn.ibizLayout = function(options) {
    var setItemBounds = function(itemId,bounds)
    {
    	if(itemId && options && options.ctrler){
    		var item = options.ctrler.getItem(itemId);
    		if(item){
    			item.setSize(bounds['width'],bounds['height']);
    		}
    	}
    };
    var setItemBounds2 = function(itemId,bounds)
    {
//    	if(itemId && options && options.ctrler){
//    		var item = options.ctrler.getItem(itemId);
//    		if(item){
//    			item.setSize(bounds['width'],bounds['height']);
//    		}
//    	}
    };
    var getItemBounds = function(itemId)
    {
    	if(itemId && options && options.ctrler){
    		var item = options.ctrler.getItem(itemId);
    		if(item){
    			return {height:item.getHeight()};
    		}
    	}
    	return {width:0,height:0};
    };
    
    var setBounds = function(element, bounds){
      element.style.position = 'absolute';
      element.style.boxSizing = 'border-box';
      for(var name in bounds){
    	  try
    	  {
		        var v = bounds[name];
		        if(_isNumber(v)){
		          v = parseInt(v) + 'px';
		        }
		        element.style[name] = v;
    	  }
    	  catch(e)
    	  {
    		  
    	  }
      }
      
      setItemBounds2(element.getAttribute('data-ibiz-layout-item'),bounds);
    };
    var toNumber = function(sNumber, sum){
      if(sNumber[sNumber.length - 1] === '%'){
        return sum * parseInt(sNumber) / 100;
      }
      return parseInt(sNumber);
    }
    var calculateLength = function(sNumber, sum, min, max){
      var n = toNumber(sNumber, sum);
      if(min){
        min = toNumber(min, sum);
        if(n < min){
          return min;
        }
      }
      if(max){
        max = toNumber(max, sum);
        if(n > max){
          return max;
        }
      }
      return n;
    };
    return this.each(function() {
      this.style.boxSizing = 'border-box';
      this.style.overflow = 'hidden';
      if(this == document.body || $(this).hasClass('ibiz-layout--body')){
        setBounds(this, {top: 0, bottom: 0, left: 0, right: 0})
      }
      var isH = $(this).hasClass('ibiz-layout--h');
      var width = this.clientWidth;
      var height = this.clientHeight;
      var i = 0;
      var children = this.children;
      var center, north, south, east, west,centerItem,northItem,southItem,eastItem,westItem;
      while(i < children.length){
        var child = children[i++];
        var data = child.getAttribute('data-ibiz-layout');
        var itemId = child.getAttribute('data-ibiz-layout-item');
        if(!data){
          continue;
        }
        //http://stackoverflow.com/questions/4210160/safely-parsing-a-json-string-with-unquoted-keys
        data = data.replace(/(['"])?([a-zA-Z0-9\-]+)(['"])?:/g, '"$2":');
        data = data.replace(/'/g, '"');
        data = '{' + data + '}';
        try{
          data = JSON.parse(data);
        }catch(error){
          continue;
        }
        var region = data.region;
        if(!region){
          continue;
        }
        child._data = data;
        if(/center/i.test(region)){
          center = child;
          centerItem = itemId;
          continue;
        }
        if(/north/i.test(region)){
          north = child;
          northItem = itemId;
          continue;
        }
        if(/south/i.test(region)){
          south = child;
          southItem = itemId;
          continue;
        }
        if(/east/i.test(region)){
          east = child;
          eastItem = itemId;
          continue;
        }
        if(/west/i.test(region)){
          west = child;
          westItem = itemId;
        }
      }
      var paddingLeft = parseInt(this.style.paddingLeft)|| 0;
      var paddingRight = parseInt(this.style.paddingRight)|| 0;
      var paddingTop = parseInt(this.style.paddingTop)|| 0;
      var paddingBottom = parseInt(this.style.paddingBottom)|| 0;
      
      var widthRest = width - paddingLeft - paddingRight, heightRest = height  - paddingTop -paddingBottom, top = paddingTop, left = paddingLeft, temp, temp2;
      function setWestAndEast(){
        if(west){
          temp = west._data.width;
          if(temp){
            temp = calculateLength(temp, width, west._data['min-width'], west._data['max-width']);
            left = temp;
            temp2 = parseInt(west._data.left) || paddingLeft;
            if(temp2){
              widthRest -= temp2;
              left += temp2;
            }
            widthRest -= temp;
            setBounds(west, {top: top, left: temp2, width: temp, height: heightRest});
            setItemBounds(westItem,{top: top, left: temp2, width: temp, height: heightRest});
          }
        }
        if(east){
          temp = east._data.width;
          if(temp){
            temp = calculateLength(temp, width, east._data['min-width'], east._data['max-width']);
            temp2 = parseInt(east._data.right) || paddingRight;
            if(temp2){
              widthRest -= temp2;
            }
            widthRest -= temp;
            setBounds(east, {top: top, right: temp2, width: temp, height: heightRest});
            setItemBounds(eastItem,{top: top, right: temp2, width: temp, height: heightRest});
          }
        }
      }
      function setNorthAndSouth(){
        if(north){
          temp = north._data.height;
          if(temp=='auto')
          {
        	  var bounds=getItemBounds(northItem);
        	  temp = bounds.height.toString();
          }
          if(temp){
            temp = calculateLength(temp, height, north._data['min-height'], north._data['max-height']);
            heightRest -= temp;
            top = temp;
            setBounds(north, {top: paddingTop, left: left, width: widthRest, height: temp});
            if(north._data.height!='auto')
            	setItemBounds(northItem,{top: paddingTop, left: left, width: widthRest, height: temp});
          }
        }
        if(south){
          temp = south._data.height;
          if(temp=='auto')
          {
        	  var bounds=getItemBounds(southItem);
        	  temp = bounds.height.toString();
          }
          if(temp){
            temp = calculateLength(temp, height, south._data['min-height'], south._data['max-height']);
            heightRest -= temp;
            setBounds(south, {bottom: paddingBottom, left: left, height: temp, width: widthRest});
            if(south._data.height!='auto')
            	setItemBounds(southItem,{bottom: paddingBottom, left: left, width: widthRest, height: temp});
          }
        }
      }
      
      if(isH){
        setWestAndEast();
        setNorthAndSouth();
      }else{
        setNorthAndSouth();
        setWestAndEast();
      }
      if(center){
        setBounds(center, {top: top, left: left, width: widthRest, height: heightRest});
        setItemBounds(centerItem,{top:top, left: left, width: widthRest, height: heightRest});
      }
    });
  };
/*  $(function(){
    $('.ibiz-layout').borderLayout();
    $(window).resize(function(){
      $('.ibiz-layout').borderLayout();
    });
  });*/
})(jQuery);
﻿﻿var IBizApp_Data = null;
var IBizMsg={};
var IBiz =
{
	/**
	 * 异步请求
	 * @param url 地址
	 * @param params 参数
	 * @param method 请求类型，默认POST
	 * @param callback 回调
	 */
	ajax : function(data){
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
	},
	/**
	 * 弹出框
	 * @param title 标题
	 * @param info 内容
	 * @param level 等级 0：警告 1：ok,2:错误，3:疑问，4：锁定，5：不高兴，6：高兴，
	 */
	alert:function(title,info,level){
		if(!level){
			level = -1; 
		}
		if(level==1){
			 $.bootstrapGrowl(info, {
                 ele: 'body',
                 type: 'info', 
                 offset: {
                     from: 'top',
                     amount: 250
                 },
                 align: 'center', 
                 width: 250,
                 delay: 5000, 
                 allow_dismiss: true, 
                 stackup_spacing: 10 
             });
			 return;
		}
		
		if(!title || title == ''){
			switch(level){
			case 0:
				title = $IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告');
				break;
			case -1:
			case 1:
			title = $IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息');
			break;
			case 2:
			title = $IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误');
			break;
			default:
				title=$IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息');
			}
		}
		
		var mylayer;
		try
		{
			if(window.opener && window.opener.window){
				mylayer = layer;
			}else{
				mylayer = window.rootlayer;
			}
		}
		catch(e){
			mylayer = window.rootlayer;
		}
		
		mylayer.alert(info, {
		    icon: level,
		    title:title,
		    btn: [$IGM('IBIZAPP.CONFIRM.BUTTON.OK','确定')]
		});
	},
	confirm2:function(title,info,level,callback){
		if(!level){
			level = -1; 
		}
		if(!title || title == ''){
			switch(level){
			case 0:
				title = $IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告');
				break;
			case -1:
			case 1:
				title = $IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息');
			break;
			case 2:
				title = $IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误');
			break;
			default:
				title=$IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息');
			}
		}
		var mylayer;
		try
		{
			if(window.opener && window.opener.window){
				mylayer = layer;
			}else{
				mylayer = window.rootlayer;
			}
		}
		catch(e){
			mylayer = window.rootlayer;
		}
		var index = mylayer.confirm(info, { 
			icon: level,
		    title:title,
		    btn: [$IGM('IBIZAPP.CONFIRM.BUTTON.OK','确定'),$IGM('IBIZAPP.CONFIRM.BUTTON.CANCEL','取消')]
		}, function(){
			window.rootlayer.close(index);
		    if(callback)
		    	callback(true);
		}, function(){
			mylayer.close(index);
			if(callback)
		    	callback(false);
		});
		
	},
	confirm:function(info,callback){
		IBiz.confirm3(window,info,callback);		
	},
	confirm3:function(win,info,callback){
		var realwin = win||window;
		var mylayer;
		try
		{
			if(realwin.opener && realwin.opener.window){
				mylayer = layer;
			}else{
				mylayer = realwin.rootlayer;
			}
		}
		catch(e){
			mylayer = realwin.rootlayer;
		}
//		
//		if(realwin.opener && realwin.opener.window){
//			mylayer = layer;
//		}else{
//			mylayer = realwin.rootlayer;
//		}
		var index = mylayer.confirm(info, {
		    btn: [$IGM('IBIZAPP.CONFIRM.BUTTON.OK','确定'),$IGM('IBIZAPP.CONFIRM.BUTTON.CANCEL','取消')]
		}, function(){
			realwin.rootlayer.close(index);
		    if(callback)
		    	callback(true);
		}, function(){
			mylayer.close(index);
			if(callback)
		    	callback(false);
		});
		
	},
	beginload:function(){
		var mylayer;
		try{
			if(window.opener && window.opener.window){
				mylayer = layer;
			}else{
				mylayer = window.rootlayer;
			}
		}
		catch(e){
			mylayer = window.rootlayer;
		}
		var index = mylayer.load(0, {shade: [0.1,'#fff']}); 
		return index;
	},
	endload:function(index){
		var mylayer;
		try{
			if(window.opener && window.opener.window){
				mylayer = layer;
			}else{
				mylayer = window.rootlayer;
			}
		}
		catch(e){
			mylayer = window.rootlayer;
		}
		mylayer.close(index);
	},
    isNull: function (_1) {
        return (_1 == null || _1 == undefined);
    },
    getValue: function (_1, _2) {
        if (_1 == undefined || _1 == null)
            return _2;
        return _1;
    },
    parseString: function (_1) {
        if (_1.replace) {
            _1 = _1.replace(/\\\[/g, "[");
            _1 = _1.replace(/\\]/g, "]");
            _1 = _1.replace(/\\{/g, "{");
            _1 = _1.replace(/\\}/g, "}");
            _1 = _1.replace(/\\'/g, "'");
            return _1.replace(/\\"/g, '"');
        }
        else
            return '';
    },
    parseXML: function (_1) {
        var A = null;
        if (Ext.isIE) {
            A = new ActiveXObject("Microsoft.XMLDOM");
            A.async = "false";
            A.loadXML(_1);
        }
        else {
            B = new DOMParser();
            A = B.parseFromString(_1, "text/xml");
        }
        return A;
    },
    loadXMLNode: function (_1, _2) {
        if (_2 == null || _2 == undefined)
            _2 = {};
        for (var i = 0; i < _1.attributes.length; i++) {
            var A = _1.attributes.item(i).name;
            var B = _1.attributes.item(i).value;
            A = A.toLowerCase();
            _2[A] = B;
        }
        return _2;
    },
    saveXMLNode: function (XML, obj) {
        var proName = '';
        for (proName in obj) {
            var proValue = obj[proName].toString();
            if (proValue != '')
                XML.attrib(proName, proValue);
        }
    },
    testCond: function (value, op, value2) {
    	if (op == 'EQ') { return value == value2; }
        if (op == 'GT') { 
        	var result = IBiz.compare(value, value2);
        	if(result != undefined && result > 0)
        		return true;
        	else 
        		return false;
        }
        if (op == 'GTANDEQ') { 
        	var result = IBiz.compare(value, value2);
        	if(result != undefined && result >= 0)
        		return true;
        	else 
        		return false;
        }
        if (op == 'IN') { return IBiz.contains(value, value2);}
        if (op == 'ISNOTNULL') { return (value!=null && value!=''); }
        if (op == 'ISNULL') {return (value==null || value==''); }
        if (op == 'LEFTLIKE') {return (value && value2 && (value.toUpperCase().indexOf(value2.toUpperCase())==0) ); }
        if (op == 'LIKE') {return (value && value2 && (value.toUpperCase().indexOf(value2.toUpperCase())!=-1) ); }
        if (op == 'LT') { 
        	var result = IBiz.compare(value, value2);
        	if(result != undefined && result < 0)
        		return true;
        	else 
        		return false;
        }
        if (op == 'LTANDEQ') { 
        	var result = IBiz.compare(value, value2);
        	if(result != undefined && result <= 0)
        		return true;
        	else 
        		return false;
        }
        if (op == 'NOTEQ') { return value != value2; }
        if (op == 'NOTIN') { return !IBiz.contains(value, value2)}
        if (op == 'RIGHTLIKE')
        {
        	if(!(value && value2))
        		return false;
        	var nPos = value.toUpperCase().indexOf(value2.toUpperCase());
        	if(nPos==-1)
        		return false;
        	return nPos + value2.length == value.length;
        }
        if (op == 'TESTNULL') { }
        if (op == 'USERLIKE') { }
        return false;
    },
    contains: function(value, value2){
    	if(value && value2){
    		var arr= new Array(); //定义一数组 
    		arr=value2.split(","); //字符分割
    		
    		var S=String.fromCharCode(2); //定义正则表达式的连接符
    	    var reg=new RegExp(S+value+S);
    	    return (reg.test(S+arr.join(S)+S));
    		//return arr.in_array(value); 
    	}
    	return false;
    },
    compare: function(value, value2){
    	var result;
    	if(value && (typeof(value)=='number' || value instanceof Number)){
    		result = IBiz.compareNumber(value, value2);
    	}else if(value && (typeof(value)=='string' || value instanceof String)){
    		result = IBiz.compareString(value, value2);
    	}else  if(value && (typeof(value)=='date' || value instanceof Date)){
	    	result = IBiz.compareDate(value, value2);
	    }else if(value && (typeof(value)=='boolean' || value instanceof Boolean)){
    		result = IBiz.compareBoolean(value, value2);
    	}
    	
    	return result;
    },
    compareNumber: function (value, value2){
    	if(typeof(value2)=='number' || value2 instanceof Number){
    		if(value > value2)
    			return 1;
    		else if(value < value2)
    			return -1;
    		else 
    			return 0;
    	}
    	return undefined;
    },
    compareString: function (value, value2){
    	if(typeof(value2)=='string' || value2 instanceof String){
    		return value.localeCompare(value2);
    	}
    	return undefined;
    },
    compareDate: function (value, value2){
    	if(typeof(value2)=='date' || value2 instanceof Date){
    		if(value > value2)
    			return 1;
    		else if(value < value2)
    			return -1;
    		else 
    			return 0;
    	}
    	return undefined;
    },
    compareBoolean: function (value, value2){
    	if(typeof(value2)=='boolean' || value2 instanceof Boolean){
    		if(value == value2)
    			return 0;
    		else
    			return -1;
    	}
    	return undefined;
    },
    processResult:function(o)
	{
		if(o.url != null && o.url != '')
			window.location.href = o.url;
		if(o.code != null && o.code != '')
			eval(o.code);
		
		if(o.downloadurl != null && o.downloadurl != '')
		{
			var downloadurl = BASEURL+  o.downloadurl;
			IBiz.download(downloadurl);
		}
    }
	,
	processResultBefore: function(o) {
    if (o.bcode!=undefined && o.bcode != null && o.bcode != '')
        eval(o.bcode);
    },
    download: function (url) {
        window.open(url, '', 'resizable=1,menubar=0,status=0,titlebar=0,toolbar=0,scrollbars=0,width=30,height=30', false);
    },
    createGrid:function(config){
    	if(config.gridType && config.gridType=='jqgrid')
    		return new IBizDataGrid2(config);
    	else if(config.gridType && config.gridType=='bsgrid')
    		return new IBizDataGrid(config);
    	else
	    	return new IBizDataGrid2(config);
    },
    createToolbar:function(config){
    	return new IBizToolbar(config);
    },
    createEditForm:function(config){
    	return new IBizEditForm(config);
    },
    createDataInfoBar:function(config){
    	return new IBizDataInfoBar(config);
    },
    createSearchForm:function(config){
		return new IBizSearchForm(config);
	},
	createDataView:function(config){
		return new IBizDataView(config);
	},
	createTree:function(config){
		return new IBizTree(config);
	}
	,createUpdatePanel:function(config){
		return new IBizUpdatePanel(config);
	}
	,regMsg:function(tag,msg,alias){
		IBizMsg[tag]=msg;
		if(alias){
			IBizMsg[alias]=IBizMsg[tag];
		}
	}
	,getMsg:function(tag,def,params){
		var msg=IBizMsg[tag];
		if(!msg)
			return def;
		if(params){
			for(var i=0;i<params.length;i++){
				if (params[i] != undefined) {
                    var reg= new RegExp("({)" + i + "(})", "g");
                    msg = msg.replace(reg, params[i]);
                }
			}
		}
		return msg;
	}
	
};
var $IRM=IBiz.regMsg;
var $IGM=IBiz.getMsg;
$IRM('IBIZAPP.CONFIRM.TITLE.WARN','警告');
$IRM('IBIZAPP.CONFIRM.TITLE.INFO','信息');
$IRM('IBIZAPP.CONFIRM.TITLE.ERROR','错误');
$IRM('IBIZAPP.CONFIRM.BUTTON.OK','确定');
$IRM('IBIZAPP.CONFIRM.BUTTON.CANCEL','取消');
	
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
/**
 * 实现模拟多重继承类
 */
function Class() { }
Class.prototype.construct = function() {};
Class.extend = function(def) {
  var classDef = function() {
      if (arguments[0] !== Class) { this.construct.apply(this, arguments); }
  };
 
  var proto = new this(Class);
  var superClass = this.prototype;
 
  for (var n in def) {
      var item = def[n];                      
      if (item instanceof Function) item.$ = superClass;
      proto[n] = item;
  }
 
  classDef.prototype = proto;
 
  classDef.extend = this.extend;      
  return classDef;
};	
/**
 * 对象基类
 */
var IBizObject = Class.extend({
	construct: function(config) {
		this.config = $.extend({}, {},config);
		this.config.me = this;
		if(this.config.id)
			this.setId(this.config.id);
		else
			this.setId($.getIBizApp().genUUID());
		
		if(this.config.name)
			this.setName(this.config.name);
		else
		{
			if(this.config.refname)
			{
				this.setName(this.config.refname);
			}
			else
			{
				if(this.config.ctrler && this.config.ctrler.getCId2()!=''){
					var cid= this.config.ctrler.getCId2();
					if(this.getId().indexOf(cid)==0){
						this.setName(this.getId().substring(cid.length));
					}
				}
				else
					this.setName(this.getId());
			}
		}
		
		if(this.config.refname)
		{
			this.refname = this.config.refname;
			if(this.getController()){
				this.getController().registerItem(this.refname,this);
			}
		}
		
		this.e = $({});
		
	},
	init:function(params){
		this.onInit();
	},
	onInit:function(){
		
	},
	setId:function(id){
		this.id = id;
	},
	getId:function(){
		return this.id;
	},
	setName:function(name){
		this.name = name;
	},
	getName:function(){
		return this.name;
	},
	getRefName:function()
	{
		return this.refname;
	},
	/**
	 * 获取界面控制器
	 */
	getController:function()
	{
		return this.config.ctrler;
	},
	/**
	 * 注册事件
	 * @param event 事件名称
	 * @param callback 回调函数<不支持字符串><3个参数 sender,data,event>
	 * @param scope 作用域
	 */
	on:function(event,callback,scope){
		event = event.toLowerCase();
		this.e.bind(event,scope,function(event,data){
			return callback(data.sender,data.args,event);
		});
		return;
	},	
	/**
	 * 呼出事件<参数会封装成JSON对象进行传递>
	 * @param event 事件名称
	 * @param sender 源
	 * @param args 参数
	 */
	fireEvent:function(event,sender,args){
		event = event.toLowerCase();
		this.e.trigger(event,{sender:sender,args:args});
	}
});
/**
 * 视图逻辑
 */
var IBizViewLogic = IBizObject.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
	},
	init:function(){
		var me=this;
		if(me.getTrigger()=='TIMER')
		{
			if(me.getTimer() >1000){
				setInterval(function(){me.execute();},me.getTimer());
			}
			return;
		}
		if(me.getTrigger()=='VIEWEVENT')
		{
			if(me.getEventCtrl()&& me.getEventCtrl()!=''){
				var ctrl=me.getController().getItem(me.getEventCtrl());
				if(ctrl){
					ctrl.on(me.getEventName(),function(sender,args,e){
						var me = e.data;
						me.execute(args);
					},me);
				}
			}
			else
				{
					me.getController().on(me.getEventName(),function(sender,args,e){
						var me = e.data;
						me.execute(args);
					},me);
				}
			
		}
	},
	/*获取触发器类型*/
	getTrigger:function(){
		return this.config.trigger;
	},
	/*获取定时间隔*/
	getTimer:function()
	{
		return this.config.timer;
	},
	execute : function(arg){
		var handler = this.config.handler;
		if(handler && $.isFunction(handler.execute)){
			handler.execute(arg,this);
		}
       // this.config.handler.apply(this.config.scope || Ext.global, arguments);
    },
    getTag:function(){
    	return this.config.tag;
    },
    getController:function(){
    	return this.config.ctrler;
    },
    getEventCtrl:function(){
    	return this.config.eventctrl;
    },
    getEventName:function(){
    	return this.config.eventname;
    }
});
/**
 * 控件基类
 */
var IBizControl = IBizObject.extend({
	/**
	 * 加载
	 */
	load:function(params){
		
	},
	/**
	 * 销毁<暂时无效>
	 */
	destroy:function(){
		
	},
	setSize:function(width,height){
		
	},
	setWidth:function(width){
		
	},
	setHeight:function(height){
		
	},
	isVisible:function(){
		return true;
	},
	invoke:function(command,arg){
    	var me=this;
    	me.onInvoke(command,arg);
    },
    onInvoke:function(command,arg){
    	
    }
});
/**
 * 代码表对象<>
 */
var IBizCodeList = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.datas = config.datas;
	},
	/**
	 * 根据值获文本
	 */
	getItemByValue:function(value,cascade){
		var me=this;
		var result;
		$.each(me.datas,function(index,item){
			if(item.value == value){
				result = item;
				return false;
			}
		});
		return result;
	}
});
/**
 * 计数器
 */
var IBizCounter = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		me.counterid = me.config.counterid;
		me.tag = me.config.tag;
		me.counterparam = JSON.stringify(me.config.counterparam);
		me.timer = me.config.timer;
		me.url = me.getController().getBackendUrl();
		if(me.timer >1000){
			setInterval(function(){me.reload();},me.timer);
		}
		me.reload();
	},
	/*
	 *  刷新计数器
	 */
	reload:function(){
		var me = this;
		var params = {};
		params['srfcounterid'] = me.counterid;
		params['srfaction'] = 'FETCH';
		params['srfcounterparam'] = me.counterparam;
		IBiz.ajax({url:me.url,
			params:params,
			method:'POST',
			dataType:'json',
			success:function(data){
				if(data.ret == 0){
					me.setData(data);
				}else{
					console.log('加载计数数据异常.'+data.info);
				}
			},
			failure:function(e){
				
			}	
		});	
	},
	setData:function(data){
		var me = this;
		me.result = data;
		me.data = data.data;
		me.fireEvent(IBizCounter.COUNTERCHANGED, me, me.data);
	},
	getResult:function(){
		var me = this;
		return me.result;
	},
	getData:function(){
		var me = this;
		return me.data;
	}
});
/*****************事件声明************************/
/**
 * 计数发生变化
 */
IBizCounter.COUNTERCHANGED="COUNTERCHANGED"
/**
 * 窗口对象
 */
var IBizWindow = IBizControl.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.viewparam = {};
		me.ownerwin = null;
		me.showmodel=false;
	},
	getOpenerId : function() {
		return this.config.openerid;
	},
	getParentParam : function() {
		return null;
	},
	setOwnerWindow:function(win){
		var me=this;
		//me.ownerwin = win;
	},
	getOwnerWindow:function(){
		var me=this;
		return me.ownerwin;
	},
	isShowModal:function(){
		var me=this;
		return me.showmodel;
	},
	/**
	 * @param win 当前浏览器窗口对象
	 */
	close : function(win) {
		var me = this;
		var index = me.winIndex;
		try {
			me.ownerwin = null;
			window.rootlayer.close(index);
			window.layer.close(index);
		} catch (e) {
		}
		
		try {
			if(win&&win.layer)
				win.layer.close(index);
			if(win&&win.rootlayer)
				win.rootlayer.close(index);
			
		} catch (e) {
		}
		try {
			$.getIBizApp().releaseWindow(me.getId());
	
			if (me.callback) {
				me.callback(me);
			}
			if (win) {
				if (win.opener && win.opener.window) {
					win.close();
				}
			}
		} catch (e) {
		}
	},
	open : function() {
		var me = this;
		me.openInNewWindow(window);
	},
	openModal : function(win) {
		var me = this;
		me.showmodel = true;
		
		if (!me.width) {
			if(win.outerWidth)
				me.width = win.outerWidth - 100;
			else 
				me.width = $(win).width() - 100;
		}
		if (!me.height) {
			if(win.outerHeight)
				me.height = win.outerHeight - 100;
			else
				me.height = $(win).height() - 100;
		}
		//附加参数
		var urlparams2 = me.viewparam||{};
		var urlparams=$.extend({},urlparams2);
		for (var A in urlparams2) {
            var value = urlparams2[A];
            if (value && value.toString().length >100){
            	delete urlparams[A];
            }
		}
		
		var params = $.param(urlparams);
		var cUrl = me.url + '&' + params;
		var myLayer;
		try
		{
			if (win.opener && win.opener.window) {
				myLayer = win.layer;
			} else {
				myLayer = win.rootlayer;
			}
		}
		catch(e)
		{
			myLayer = win.rootlayer;
		}
		
		me.winIndex = myLayer.open({
			type : 2,
			area : [ me.width + 'px', me.height + 'px' ],
			title : me.title,
			fix : false,
			maxmin : true,
			content : cUrl,
			cancel : function(index) {
				if (me.beforecallback) {
					var tag = me.beforecallback(me);
					if (tag) {
						IBiz.confirm3(tag.win,tag.msg, function(result) {
							if (result) {
								me.close(tag.win);
								return true;
							}
						});
						return false;
					}else {
						me.close(me.getOwnerWindow());
						return true;
					}
				}else
				{
					me.close(me.getOwnerWindow());
					return true;
				}
			}
		});
	},
	beforeClose : function() {
		var me = this;
		if (me.beforecallback) {
			return me.beforecallback(me);
		}
		return false;
	},
	openInNewWindow : function(win) {
		var me = this;
		var urlparams2 = me.viewparam||{};
		var urlparams=$.extend({},urlparams2);
		for (var A in urlparams2) {
            var value = urlparams2[A];
            if (value && value.toString().length >100){
            	delete urlparams[A];
            }
		}
		
		//delete urlparams['windowid'];
		//delete urlparams['openerid'];
		var params = $.param(urlparams);
		var cUrl = me.url + '&' + params;
		setTimeout(function() {
			if (win && win.parent) {
				win.parent.window.open(cUrl, "_blank");
			} else {
				window.open(cUrl);
			}
		}, 1);
	}
});
/**
 * 页面上下文<子页面上下文参数无效>
 */
var IBizPageContext =  Class.extend({
	construct: function(config) {
		var me = this;
		me.viewparam = {};	
		
		if(!config || !config.pcontroller)
		{
			$.each(document.location.search.substr(1).split('&'),function(c,q){
				var i = q.split('=');
				var key=i[0].toLowerCase();
				if(key=='srfparentmode'||key=='srfparentdata'||key=='')
					return;
				me.viewparam[key] = decodeURIComponent(i[1]);
			});
		}
	},
	/**
	 * 获取参数
	 */
	getParamValue:function(name){
		var me = this;
		name = name.toLowerCase();
		return me.viewparam[name];
	},
	/**
	 * 清空参数
	 */
	clear:function(){
		var me = this;
		me.viewparam = {};
	}	
});	
/**
 * 工具栏控件<后期要重点测试下拉式工具栏事件的呼出等操作 以及工具栏暂时不支持Check按钮等>
 */
var IBizToolbar = IBizControl.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.items = [];
		me.toolbar = $('#' + me.getId());
		if (me.toolbar) {
			me.toolbar.find('.ibiz-toolbar-item').each(
					function(index, element) {
						var item = $(this);
						if (!item.hasClass('ibiz-id-dropdown')) {
							me.items.push(item);
							item.click(function(e) {
								var params = {};
								params['tag'] = $(this).attr('data-ibiz-tag');
								me.itemclick(params, e);
							});
						}
					});
			// 查找下拉按钮
			me.toolbar.find('.ibiz-id-dropdown').each(function(index, element) {
				var item = $(this);
				me.items.push(item);
				var tag = item.attr('data-ibiz-tag');
				// 循环
				item.find(".ibiz-id-item").click(function(e) {
					var mytag = $(this).attr('data-ibiz-tag');
					var params = {};
					params['itemtag'] = mytag;
					params['tag'] = tag;
					params['obj'] = item;
					me.itemclick(params);
				});
			});
		}
	},
	/**
	 * 更新权限
	 */
	updateAccAction : function(action) {
		var me = this;
		$.each(me.items, function(idx, item) {
			var priv = $(item).attr('data-ibiz-priv');
			if (priv) {
				if (action != undefined && action[priv] != undefined && action[priv] != 1) {
					item.addClass('hide');
					return true;
				}
			}
			item.removeClass('hide');
		});
	},
	/**
	 * 点击按钮
	 */
	itemclick : function(params, e) {
		var me = this;
		me.fireEvent(IBizToolbar.ITEMCLICK, me, params);
	}
});
/** ***************事件声明*********************** */
/**
 * 点击按钮事件
 */
IBizToolbar.ITEMCLICK = 'ITEMCLICK';
/**
 * 表格控件
 */
var IBizDataGrid = IBizControl.extend({
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
		me.grid = $('#'+config.id);
		if(me.grid){
			me.grid.bootstrapTable({
				striped:false,
				showRefresh:false,
				showToggle:false,
				showColumns:false,
				showExport:false,
				detailView:false,
				height:me.getHeight(),
				showPaginationSwitch:false,
				url:me.config.url,
				formatSearch:function(){
					return $IGM('IBIZDATAGRID.FORMATSEARCH.INFO','请输入关键字');
				},
				queryParams: function (params) {
					me.fireEvent(IBizDataGrid.BEFORELOAD,me,params);
					params.srfrender='BOOTSTRAPTABLE';
					return params;
		        },
		        onLoadSuccess: function (data) {
		            return true;
		        },onAjaxSuccess:function(res){
		        	
		        	me.fireEvent(IBizDataGrid.LOADED,me,res);
		        	
		        	var arr = {};
		        	arr.total = res.totalrow;
		        	arr.rows = res.items;
		        	arr.limit = res.limit;
		        	arr.start =res.startrow;
		        	
		        	return arr;
		        },
		        onDblClickRow: function (item, $element) {
		        	me.fireEvent(IBizDataGrid.ROWDBLCLICK,me,item);
		        	return true;
		        },
		        onLoadError: function (status) {
		            return false;
		        },
				columns :me.config.columns
			});
			
			//添加表格选择事件
			this.grid.on('check.bs.table uncheck.bs.table check-all.bs.table uncheck-all.bs.table', function () {
				me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.grid.bootstrapTable('getSelections'));
	        });
		}
	},
	getHeight:function(){
		return 600;
	},
	/**
	 * 删除
	 */
	remove: function(arg) {
		var me = this;
		if (!arg) arg = {};
		$.extend(arg, {
			srfaction: 'remove'
		});
		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		IBiz.ajax({
			url: me.config.url,
			params: arg,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				if (data.ret == 0) {
					me.refresh();
					if (data.info && data.info != '') {
						IBiz.alert($IGM('IBIZDATAGRID.REMOVE.INFO','删除成功'));
					}
					IBiz.processResult(data);
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.REMOVE.TITLE','删除失败'),$IGM('IBIZDATAGRID.REMOVE.INFO2','删除数据失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	},
	/**
	 * 加载
	 */
	load:function(){
		var me = this;
		me.refresh();
	},
	refresh:function(){
		var me = this;
		me.grid.bootstrapTable('refresh');
	},
	/**
	 * 获取数据仓库<该方法仅在Ext版本中有效>
	 * @Deprecated
	 */
	getStore:function(){
		return null;
	},
	/**
	 * 设置选中数据
	 * @param selections 
	 */
	setSelection:function(selections){
		
	},
	/**
	 * 获取选中数据
	 */
	getSelection:function(){
		if(this.grid){
			return this.grid.bootstrapTable('getSelections');
		}
		return null;
	},
	doUIAction: function(params) {
		var me = this;
		
		if (!params) params = {};
		$.extend(params,{srfaction: 'uiaction'});
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			dataType:'json',
			success:function(data){
				if(data.ret == 0){
					if(data.reloadData){
						me.refresh();
					}
					if (data.info && data.info != '') {
						IBiz.alert($IGM('IBIZDATAGRID.DOUIACTION.INFO','操作成功'));
					}
					IBiz.processResult(data);
				}else{
					IBiz.alert($IGM('IBIZDATAGRID.DOUIACTION.TITLE','操作失败'),$IGM('IBIZDATAGRID.DOUIACTION.INFO2','操作失败,执行操作发生错误,'+ data.info,[data.info]),2);
				}
			},
			failure:function(e){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}	
		});
	},
	/**
	 * 提交工作流操作
	 */
	wfsubmit: function(params) {
		var me = this;
		if (!params) params = {};
		$.extend(params, {
			srfaction: 'wfsubmit'
		});
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		IBiz.ajax({
			url: me.config.url,
			params: params,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				if (data.ret == 0) {
					me.refresh();
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.WFSUBMIT.TITLE','执行失败'),$IGM('IBIZDATAGRID.WFSUBMIT.INFO','执行工作流操作失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	},
	/**
	 * 批量添加
	 */
	addBatch: function(arg) {
		var me = this;
		if (!arg) arg = {};
		$.extend(arg, {srfaction: 'addbatch'});
		
		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		IBiz.ajax({
			url: me.config.url,
			params: arg,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				if (data.ret == 0) {
					me.refresh();
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.ADDBATCH.TITLE','添加失败'),$IGM('IBIZDATAGRID.ADDBATCH.INFO','执行批量添加失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	}
		
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
IBizDataGrid.SELECTIONCHANGE = 'SELECTIONCHANGE';
/**
 * 双击行
 */
IBizDataGrid.ROWDBLCLICK = 'ROWDBLCLICK';
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataGrid.BEFORELOAD = 'BEFORELOAD';
/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataGrid.LOADED = 'LOADED';
IBizDataGrid.CHANGEEDITSTATE = 'CHANGEEDITSTATE';
$IRM('IBIZDATAGRID.AJAX.INFO','执行请求发生异常');
/**
 * 表格控件
 */
var IBizDataGrid2 = IBizControl.extend({
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
		me.grid = $('#'+config.id);
		me.grid.addClass('ibiz-jq-datatable');
		me.tableselection = null;
		me.tableselections = {};
		me.multiSelect = true;
		if(config.multiSelect != undefined && config.multiSelect == false){
			me.multiSelect = false;
		}
		me.forceFit=false;
		if(config.forceFit != undefined && config.forceFit == true){
			me.forceFit = true;
		}
		me.enablePaging = true;
		if(config.enablePaging != undefined){
			me.enablePaging = config.enablePaging;
		}
		me.pageSize = 10;
		if(config.pageSize && config.pageSize >0){
			me.pageSize = config.pageSize;
		}
			
		var columns = [];
		if(me.multiSelect){
			columns.push({ 
				"sTitle":'<input class="ibiz-id-checkall" type="checkbox"></input>',
				"width":28,
				"orderable": false,
				"sortable":false,
				"render":function(data,type,row){
					return '<input class="ibiz-id-check" type="checkbox" style="margin-left:2px;width:24px;"></input>';
				}
			});
		};
		columns = columns.concat(me.config.columns);
		if(me.grid){
			me.table = me.grid.dataTable({
				"processing": true,
				"serverSide": true,
				"searching": false,
				"bPaginate":me.enablePaging,
				"bLengthChange":false,
				"bProcessing":false,
				"iDisplayLength":me.pageSize,
				"order": [],
				"ajax": {
					"url":me.config.url,
					"type": "POST",
					"data": function (params,oSettings) {
							if(oSettings && oSettings.jqXHR){
								try
								{
									//取消上次请求
									oSettings.jqXHR.abort();
									delete oSettings.jqXHR;
									
								}
								catch(e)
								{
									
								}
								oSettings.jqXHR = null;
							}
			               	me.fireEvent(IBizDataGrid2.BEFORELOAD,me,params);
			               	params.offset = params.start;
			               	params.limit = params.length;
			               	me.datastart = params.start;
			               	me.datalimit = params.limit;
			               	if(params.limit < 0){
			               		params.limit = 1000;
			               		params.length = 1000;
			               	}
							params.srfrender='JQUERYDATATABLES';
							me.loadingTag = IBiz.beginload();
					},
					"dataSrc":function(data){
						IBiz.endload(me.loadingTag);
						if(data.ret == 0){
							me.tableselections = {};
							//呼出事件
							setTimeout(function(){
								me.fireEvent(IBizDataGrid2.LOADED,me,data);
					        }, 1);
							if(data.items){
								me.alldata = data.items;
								return data.items;
							}
						}
						else
							{
							IBiz.alert($IGM('IBIZDATAGRID.GETDATA.TITLE','加载错误信息'),$IGM('IBIZDATAGRID.GETDATA.INFO','加载数据发生错误,'+data.info,[data.info]),2);
							}
						me.alldata = [];
						return [];
					}	
				},
				"scrollY":me.getHeight(),
				"scrollX": !me.forceFit,
				//"bAutoWidth":!me.forceFit,
				"columns":columns,
				"rowCallback": function(row,data){
					row.ibizdata = data;
					if(me.tableselections[data.srfkey]){
						$(row).find('.ibiz-id-check').prop('checked',true);
						$(row).addClass('selected');
					}	
					$(row).find('.ibiz-id-check').change(function(e){
						$(row).toggleClass('selected');
						if($(this).prop('checked') == true){
							me.tableselection = row.ibizdata;
							me.tableselections[data.srfkey] = data;
						}else{
							delete me.tableselections[data.srfkey];
							delete me.tableselection;
						}
						me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.getSelection());
					});
		        },
		        "fnDrawCallback": function ( oSettings ) {
		            if(me.config.hideHeader && me.config.hideHeader == true){
		            	$(oSettings.nTHead).hide();
		            }
		            if(me.enablePaging == false){
		            	$('.dataTables_info').hide();
		            }
		           // $('.dataTables_info').hide();
		        }
			});
		}
		$('#'+me.config.id+'_wrapper .ibiz-id-checkall').change(function(e){
			var checked = false;
			if($(this).prop('checked') == true){
				me.table.find('.ibiz-id-check').prop("checked",true);  
				
				me.tableselection = null;
				
				me.table.find('tr').each(function(idx,tr){
					$(this).addClass('selected');
					if(this.ibizdata){
						me.tableselections[this.ibizdata.srfkey] = this.ibizdata;
						me.tableselection = this.ibizdata;
					}
				});
			}else{
				me.table.find('tr').removeClass('selected');
				me.table.find('.ibiz-id-check').prop("checked",false);  
				
				me.tableselection = null;
				me.tableselections = {};
			}
			me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.getSelection());
		});
		me.grid.find('tbody').on('click', 'tr', function (e) {
			if(e.target.localName == 'input'||e.target.className=='ibiz-id-check'){
				return;
			}
			if(!this.ibizdata){
				return;
			}
			me.table.$('tr.selected').removeClass('selected');
    		me.table.find('.ibiz-id-check').prop("checked",false);  
    		$(this).addClass('selected');
    		$(this).find('.ibiz-id-check').prop("checked",true);
    		$('#'+me.config.id+'_wrapper .ibiz-id-checkall').prop("checked",false);
    		
			if(me.tableselection && me.tableselection.srfkey == this.ibizdata.srfkey){
				return;
			}
			me.tableselection = this.ibizdata;
			me.tableselections = {};
			me.tableselections[this.ibizdata.srfkey] = this.ibizdata;
			
			me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.getSelection());
		 });
		me.grid.find('tbody').on('dblclick', 'tr', function (e) {
			if(e.target.localName == 'input'||e.target.className=='ibiz-id-check'){
				return;
			}
			me.fireEvent(IBizDataGrid.ROWDBLCLICK,me,this.ibizdata);
		 });
		
		me.lastVisible = me.grid.is(':visible');
		me.gridScroll = $('#'+me.config.id+'_wrapper .dataTables_scroll');
		if(!me.lastVisible){
			me.gridScroll.css({"visibility":"hidden"});
		}
		setInterval(function(){
			//判断当前是否可见
			if(me.grid.is(':visible')){
				if(me.lastVisible)
					return;
				me.grid.dataTable().fnAdjustColumnSizing(false);
				me.gridScroll.css({"visibility":"visible"});
				me.lastVisible = true;
			}
			else{
				if(me.lastVisible)
					me.gridScroll.css({"visibility":"hidden"});
				me.lastVisible = false;
			}
		},100);
	},
	setSize:function(width,height){
		var me = this;
		me.layoutHeight = height;
		me.layoutWidth = width;
		var height2 = height;
		if(!(me.config.hideHeader==true))
			 height2 -=45;
		if(me.enablePaging==true)
			 height2 -=35;
 	 
		var scrollBody=$('#'+me.config.id+'_wrapper .dataTables_scrollBody');
		scrollBody.height(height2);
		me.grid.dataTable().fnAdjustColumnSizing(false);
	},
	getAllData:function(){
		var me = this;
		return me.alldata;
	},
	getHeight:function(){
		var me = this;
		if(me.layoutHeight && me.layoutHeight >0){
			return me.layoutHeight;
		}
		if(me.config.height && me.config.height >0){
			return me.config.height;
		}
		return 0;
	},
	/**
	 * 删除
	 */
	remove: function(arg) {
		var me = this;
		if (!arg) arg = {};
		$.extend(arg, {
			srfaction: 'remove'
		});
		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({
			url: me.config.url,
			params: arg,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				IBiz.endload(me.loadingTag );
				if (data.ret == 0) {
					me.tableselection = null;
					me.tableselections = {};
					me.refresh();
					if (data.info && data.info != '') {
						IBiz.alert($IGM('IBIZDATAGRID.REMOVE.INFO','删除成功'));
					}
					IBiz.processResult(data);
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.REMOVE.TITLE','删除失败'),$IGM('IBIZDATAGRID.REMOVE.INFO2','删除数据失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	},
	/**
	 * 加载
	 */
	load:function(){
		var me = this;
		me.grid.dataTable().fnPageChange('first',true);
	},
	refresh:function(){
		var me = this;
		me.grid.dataTable().fnDraw(false);
		me.grid.dataTable().fnAdjustColumnSizing(false);
	}
	,
	/**
	 * 获取数据仓库<该方法仅在Ext版本中有效>
	 * @Deprecated
	 */
	getStore:function(){
		return null;
	},
	/**
	 * 设置选中数据
	 * @param selections 
	 */
	setSelection:function(selections){
		var me = this;
		me.tableselections = {};
		me.tableselection = null;
		if(selections)
		{
			table = me.grid.dataTable();
			table.find('tr').each(function(idx,tr){
				if(this.ibizdata)
				{
					if(this.ibizdata.srfkey==selections.srfkey){
						me.tableselections[this.ibizdata.srfkey] = this.ibizdata;
						me.tableselection = this.ibizdata;
						$(this).addClass('selected');
						$(this).find('.ibiz-id-check').prop('checked',true);
					}
					else
						{
							$(this).removeClass('selected');
							$(this).find('.ibiz-id-check').prop('checked',false);
						}
				}
			});
		}
		me.fireEvent(IBizDataGrid.SELECTIONCHANGE,me,me.getSelection());
	},
	/**
	 * 获取选中数据
	 */
	getSelection:function(){
		var me = this;
		if(me.tableselections){
			var data = [];
			$.each(me.tableselections,function(key,value){
				data.push(value);
			});
			
			return data;
		}
		return [];
	},
	doUIAction: function(params) {
		var me = this;
		var callback;
		if(params || params.callback){
			callback = params.callback;
			delete params.callback;
		}
		if (!params) params = {};
		$.extend(params,{srfaction: 'uiaction'});
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			dataType:'json',
			success:function(data){
				IBiz.endload(me.loadingTag );
				if(data.ret == 0){
					if(data.reloadData){
						me.refresh();
					}
					if (data.info && data.info != '') {
						IBiz.alert($IGM('IBIZDATAGRID.DOUIACTION.INFO','操作成功'));
					}
					IBiz.processResult(data);
					
					if(callback && typeof(callback) == 'function'){
						callback({success:true,data:data});
					}
				}else{
					IBiz.alert($IGM('IBIZDATAGRID.DOUIACTION.TITLE','操作失败'),$IGM('IBIZDATAGRID.DOUIACTION.INFO2','操作失败,执行操作发生错误,'+ data.info,[data.info]),2);
					if(callback && typeof(callback) == 'function'){
						callback({success:false,data:data});
					}
				}
			},
			failure:function(e){
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
				if(callback && typeof(callback) == 'function'){
					callback({success:false,e:e});
				}
			}	
		});
	},
	/**
	 * 提交工作流操作
	 */
	wfsubmit: function(params) {
		var me = this;
		if (!params) params = {};
		$.extend(params, {
			srfaction: 'wfsubmit'
		});
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({
			url: me.config.url,
			params: params,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				IBiz.endload(me.loadingTag );
				if (data.ret == 0) {
					me.refresh();
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.WFSUBMIT.TITLE','执行失败'),$IGM('IBIZDATAGRID.WFSUBMIT.INFO','执行工作流操作失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	},
	/**
	 * 批量添加
	 */
	addBatch: function(arg) {
		var me = this;
		if (!arg) arg = {};
		$.extend(arg, {srfaction: 'addbatch'});
		
		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({
			url: me.config.url,
			params: arg,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				IBiz.endload(me.loadingTag );
				if (data.ret == 0) {
					me.refresh();
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.ADDBATCH.TITLE','添加失败'),$IGM('IBIZDATAGRID.ADDBATCH.INFO','执行批量添加失败,'+ data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	},
	/**
	 * 导出数据
	 */
	exportData: function(arg) {
		var me = this;
		
		var params={};
		
		me.fireEvent(IBizDataGrid2.BEFORELOAD,me,params);
		params['query'] = params['search'];
		params['srfaction']='exportdata';
		
		var setting = me.grid.dataTable().fnSettings();
		if(setting && setting.aLastSort.length>0)
		{
			var sortColomn = setting.aoColumns[setting.aLastSort[0].col];
			if(sortColomn){
				params['sort'] = sortColomn.data;
				params['sortdir'] = setting.aLastSort[0].dir;
			}
		}
		if(arg.itemtag == 'all'){
			params['start'] = 0;
			params['limit'] = 1000;
		}else if(arg.itemtag == 'custom'){
			var nStart = arg.obj.find('.ibiz-id-start').val();
			var nEnd = arg.obj.find('.ibiz-id-end').val();
			if(nStart<1 || nEnd <1 || nStart >nEnd){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDATAGRID.EXPORTDATA.INFO','请输入有效的起始页'),0);
				return;
			}
			params['start'] = (nStart-1)*me.pageSize;
			params['limit'] = nEnd*me.pageSize;
		}else{
			params['start'] = me.datastart;
			params['limit'] = me.datalimit;
		}
		
		
		
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({
			url: me.config.url,
			params: params,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				IBiz.endload(me.loadingTag );
				if (data.ret == 0) {
					if(data.downloadurl){
						var downloadurl = BASEURL+ data.downloadurl;
						IBiz.download(downloadurl);
					}
					
				} else {
					IBiz.alert($IGM('IBIZDATAGRID.EXPORTDATA.TITLE','导出失败'),$IGM('IBIZDATAGRID.EXPORTDATA.INFO2','导出数据失败,' + data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.INFO','信息'));
			}
		});
	}
	,findItem:function(fieldName,fieldValue){
		var me = this;
		var table = me.grid.dataTable();
		var item = null;
		table.find('tr').each(function(idx,tr){
			if(this.ibizdata)
			{
				if(this.ibizdata[fieldName]==fieldValue){
					item = this.ibizdata;
				}
			}
		});
		return item;
	}
		
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
IBizDataGrid2.SELECTIONCHANGE = 'SELECTIONCHANGE';
/**
 * 双击行
 */
IBizDataGrid2.ROWDBLCLICK = 'ROWDBLCLICK';
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataGrid2.BEFORELOAD = 'BEFORELOAD';
/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataGrid2.LOADED = 'LOADED';
(function(){
    var oLanguage={
        "oAria": {
            "sSortAscending": ": 升序排列",
            "sSortDescending": ": 降序排列"
        },
        "oPaginate": {
            "sFirst": "首页",
            "sLast": "末页",
            "sNext": "下页",
            "sPrevious": "上页"
        },
        "sEmptyTable": "没有相关记录",
        "sInfo": "第 _START_ 到 _END_ 条记录，共 _TOTAL_ 条",
        "sInfoEmpty": "第 0 到 0 条记录，共 0 条",
        "sInfoFiltered": "",
        "sInfoPostFix": "",
        "sDecimal": "",
        "sThousands": ",",
        "sLengthMenu": "每页显示条数: _MENU_",
        "sLoadingRecords": "正在载入...",
        "sProcessing": "正在载入...",
        "sSearch": "搜索:",
        "sSearchPlaceholder": "",
        "sUrl": "",
        "sZeroRecords": "没有相关记录"
    }
    $.fn.dataTable.defaults.oLanguage=oLanguage;
})();
/**
 * 表单属性对象<主要管理属性及其标签的值、可用、显示、必填等操作>
 */
var IBizField =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.uniqueId = this.config.id;
		this.name = this.config.name;
		this.disabled = false;
		this.haserror = false;
		this.labeltext = '';
		if(this.config.allowBlank != undefined){
			this.allowBlank = this.config.allowBlank;
		}else
		{
			this.allowBlank = true;
		}
		if(this.config.hidden != undefined){
			this.hidden = this.config.hidden;
		}else
		{
			this.hidden = false;
		}
		if(this.config.visible != undefined){
			this.visible = this.config.visible;
		}else
		{
			this.visible = true;
		}
		this.label = $('#'+this.uniqueId+'__lb');
		this.container = $('#'+this.uniqueId+'__fi');
		
		if(this.label){
			this.labeltext = this.label.html();
		}
	},
	initSize:function(item){
		var me = this;
		if(me.config.width >0){
			item.width(me.config.width);
		}
		if(me.config.height >0){
			item.height(me.config.height);
		}
	},
	getFieldType:function(){
		return this.fieldType;
	},
	setForm:function(form){
		this.form = form;
	},
	getForm:function(){
		return this.form;
	},
	/**
	 * 获取值
	 */
	getValue:function(){
		var me = this;
		return me.value;
	},
	/**
	 * 设置值
	 * @param value 值
	 */
	setValue:function(value){
		var me = this;
		var oldVal = me.value;
		me.value = value;
		if(oldVal != value)
			me.onValueChanged(oldVal,me.value);
	},
	/**
	 * 获取唯一标识
	 */
	getUniqueId:function(){
		return this.uniqueId;
	},
	/**
	 * 获取属性名
	 */
	getName:function(){
		return this.name;
	},
	isDisabled:function(){
		return this.disabled;
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		this.disabled = disabled;
		if(this.field){
			if(disabled){
				this.field.attr('readonly','readonly');
			}else{
				this.field.removeAttr("readonly");  
			}
			this.field.prop("disabled", disabled);
		}
	},
	/**
	 * 隐藏控件
	 */
	setHidden:function(hidden){
		this.hidden = hidden;
		if(this.label)
		{
			if(hidden){
				this.label.addClass('hidden');
			}else
			{
				this.label.removeClass('hidden');
			}
		}
		if(this.field)
		{
			if(hidden){
				this.field.addClass('hidden');
			}else
			{
				this.field.removeClass('hidden');
			}
		}
	},
	/**
	 * 设置可见性
	 */
	setVisible:function(visible){
		this.visible = visible;
		if(this.container)
		{
			if(visible){
				this.container.removeClass('hidden');
			}else{
				this.container.addClass('hidden');
			}
		}
	},
	/**
	 * 设置属性动态配置
	 */
	setAsyncConfig:function(config){
	},
	/**
	 * 设置只读<Ext版本方法禁止使用>
	 */
	setReadOnly:function(readonly){
		this.setDisabled(readonly);
	},
	setAllowBlank:function(allowblank){
		if(this.label){
			if(allowblank)
			{
				this.label.html(this.labeltext);
			}else
			{
				this.label.html('<span class="text-danger">*</span>'+this.labeltext);
			}
		}
	},
	/**
	 * 标记表单项值无效提示
	 */
	markInvalid:function(info){
		this.haserror = true;
		if(this.container){
			this.container.addClass('has-error')
		}
	},
	/**
	 * 设置表单项错误
	 */
	setActiveError:function(info){
		this.markInvalid(info);
	},
	/**
	 * 表单项是否有错误
	 */
	hasActiveError:function(){
		return this.haserror;
	},
	/**
	 * 重置表单项错误
	 */
	unsetActiveError:function(){
		this.haserror = false;
		if(this.container){
			this.container.removeClass('has-error')
		}
	},
	/**
	 * 值变化 
	 */
	onValueChanged:function(oldValue,newValue){
		this.fireEvent(IBizField.VALUECHANGED,this,{'newvalue':newValue,'oldvalue':oldValue});
	}
});
/*****************事件声明************************/
/**
 * 表单项值变化
 */
IBizField.VALUECHANGED = 'VALUECHANGED';
/**
 * Office文档编辑控件
 * 要调用 <office.jsp>中的脚本 请使用 me.frameobj.xxxxx,xxxxx为<office.jsp>中脚本方法
 */
var IBizOfficeField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.getUniqueId()); 
		me.field.attr("src",BASEURL+'/weboffice/officeeditpage.jsp'); 
		me.field.load(function(){   
	        me.onIframeLoaded(); 
	    });  
		if(config.height >0){
			me.field.height(config.height);
		}
		if(config.width >0){
			me.field.width(config.width);
		}
		else
		{
			me.field.width('100%');
		}
	},
	onIframeLoaded:function(){
		var me = this;
		var lastValue = me.getValue();
		me.frameobj = me.field[0].contentWindow;
		if(me.frameobj){
			me.frameobj.init(this);
			me.frameobj.setFileReadOnly(me.isDisabled());
			
			if(me.getForm()!=null){
				var controller = me.getForm().getController();
				var activeData = controller.viewparam.srfactivedata;
				if (activeData){
					if(me.frameobj.setActiveData){
						me.frameobj.setActiveData($.parseJSON(activeData));
					}
				}
			}
			me.frameobj.setValue(lastValue);
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		
		if(me.frameobj){
			me.frameobj.setFileReadOnly(disabled);
		}
	},
	onValueChanged:function(oldVal,newVal){
		arguments.callee.$.onValueChanged.call(this,oldVal,newVal);
		var me = this;
		
		if(me.frameobj){
			me.frameobj.setValue(newVal);
		}
	},
	getValue:function(){
		var me = this;
		if(me.frameobj){
			return me.frameobj.getValue();
		}
		return arguments.callee.$.getValue.call(this);
	}
});	
/**
 * 
 */
var IBizFormGroup =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.getUniqueId());
		
		me.dropDownLink = $('.'+me.getUniqueId()+'_ddl');
		me.dropDownTip = $('#'+me.getUniqueId()+'_ddt');
		me.dropDownImg = $('#'+me.getUniqueId()+'_ddi');
		
		me.groupDiv = $('#'+me.getUniqueId()+'_gd');
		
		//me.groupFa = $('a.'+me.getUniqueId()+"_"+config.name+" i");
		//me.downCloseMode = $('.'+me.getUniqueId()+"_"+config.name);
		//me.groupCloseMode = $('div.'+me.getUniqueId()+"_"+config.name);
		//me.closeContent = $("."+config.name+"_content");
		
		//导航start
		me.panel_head = me.field.find("."+config.name+"_text");
		if(config.captionItem){
			me.config.form.groupMap[config.name] = config.captionItem;
		}
		
		if(document.getElementById("form_nav")){
			var text = me.panel_head.text().trim();
			var colname = me.panel_head.attr("name");
			if(text || colname){
				var name = me.field.attr("id");
				var parent = me.field.parents(".ibiz-form-formgroup");
				var li = "<li><div name='#"+name+"' class='"+config.name+"_text' style='padding-left:"+(parent.length+1)*15+"px'>"+text+"</div><ul name='#"+name+"'></ul></li>";
				if(parent.length>0){
					var name2 = parent.eq(0).attr("id");
					$("#form_nav>.ibiz-edit-menu").find("ul[name='#"+name2+"']").append(li);
				}else{
					$("#form_nav>.ibiz-edit-menu").append(li);
				}
			}
		}
		//导航end
		
		if(config.titleBarCloseMode == null || config.titleBarCloseMode == "0"){
			return;
		}
		var titleBarCloseMode = config.titleBarCloseMode;
		if(titleBarCloseMode && titleBarCloseMode != '0'){
			if(titleBarCloseMode == '1'){
				me.downState = true;
				me.dropDownTip.hide();
				me.dropDownImg.removeClass("fa-angle-double-down");
				me.dropDownImg.addClass("fa-angle-double-up");
			}else if(titleBarCloseMode == '2'){
				me.downState = false;
				me.groupDiv.hide();
				me.dropDownTip.show();
			}
			me.dropDownLink.click(function(event){
				if(me.downState){
					me.groupDiv.hide();
					me.dropDownTip.show();
					me.dropDownImg.removeClass("fa-angle-double-up");
					me.dropDownImg.addClass("fa-angle-double-down");
					me.downState = false;
				}else{
					me.groupDiv.show();
					me.dropDownTip.hide();
					me.dropDownImg.removeClass("fa-angle-double-down");
					me.dropDownImg.addClass("fa-angle-double-up");
					me.downState = true;
				}
			});
		}
	},
	setGroupText: function(text){
		var me = this;
		me.panel_head.find("h5").html(text);
		if(document.getElementById("form_nav")){
			$("#form_nav ."+me.config.name+"_text").html(text);
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		var me = this;
		me.disabled = disabled;
	},
	/**
	 * 隐藏控件
	 */
	setHidden:function(hidden){
		var me = this;
		me.hidden = hidden;
		if(me.field){
			if(hidden){
				me.field.addClass('hidden');
			}else
			{
				me.field.removeClass('hidden');
			}
		}
	},
	/**
	 * 设置可见性
	 */
	setVisible:function(visible){
		this.visible = visible;
		if(this.field)
		{
			if(visible){
				this.field.removeClass('hidden');
			}else{
				this.field.addClass('hidden');
			}
		}
	}
});
/**
 * 
 */
var IBizFormTabPanel =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});
/**
 * 表单分页控件
 */
var IBizFormTabPage =  IBizField.extend({
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
		me.field = $('#'+me.getUniqueId());
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		var me = this;
		me.disabled = disabled;
	},
	/**
	 * 隐藏控件
	 */
	setHidden:function(hidden){
		var me = this;
		me.hidden = hidden;
		if(me.field){
			if(hidden){
				me.field.addClass('hidden');
			}else
			{
				me.field.removeClass('hidden');
			}
		}
	},
	/**
	 * 设置可见性
	 */
	setVisible:function(visible){
		this.visible = visible;
		if(this.field)
		{
			if(visible){
				this.field.removeClass('hidden');
			}else{
				this.field.addClass('hidden');
			}
		}
	}
});
/**
 * 隐藏表单项属性
 */
var IBizHiddenField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.fieldType = 'hiddenfield';
		this.field = $('#'+this.getUniqueId());
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	}	
});	
/**
 * 直接内容表单项属性
 */
var IBizRawField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.field = $('#'+this.getUniqueId());
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.html(newValue);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	}	
});	
/**
 * 富文本表单属性
 */
var IBizHtmlField = IBizField.extend({
	construct: function(options) {
		arguments.callee.$.construct.call(this,options);
		var me = this;
		
		me.field = $('#'+me.getUniqueId());
		var nHeight = options.height;
		if(!nHeight || nHeight<0){
			nHeight = 100;
		}
		me.field.parent().css('height', '');
		me.initSize(me.field);
		
		if(me.field){
			me.field.summernote({
				height:nHeight,
				lang:'zh-CN',
			    defaultFontName: '微软雅黑',
			    fontNames: [
			        '微软雅黑', '宋体', '仿宋','黑体', '楷体', '隶书', '新宋体', '幼圆'
			    ],
				onChange: function (value, $editable) {
					me.ignore = true;
					me.setValue(value);
					me.ignore = false;
				}
			});
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled : function(disabled) {
		var me = this;
		me.disabled = disabled;
		if(me.container){    
			me.container.find('.note-editable').each(function(idx,item){
				$(item).attr("contentEditable", !disabled);
			});
		}
	},
	onValueChanged:function(oldVal,newVal){
		arguments.callee.$.onValueChanged.call(this,oldVal,newVal);
		var me = this;
		if(me.ignore)
			return;
		me.field.code(newVal);
	}	
});
/**
 * 列表-表单项属性
 */
var IBizListField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});	
/**
 * 数据选择表单属性<可以是 下拉、放大镜>
 * 启用禁用完成
 */
var IBizPickerField = IBizField.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.field = $('#' + this.getUniqueId());
		me.initSize(me.field.parent());
		me.initSize(me.field);
		
		if(config.pageSize >0)
		{
			me.pageSize = config.pageSize;
		}else{
			me.pageSize = 50;
		}
		
		if(config.minChars >0)
		{
			me.minChars = config.minChars;
		}else{
			me.minChars = 2;
		}
		
		me.valueItem = this.config.valueItem;
		
		me.srftext = '';
		me.srfvalue = '';
		if (me.config.pickupView) {
			me.field.parent().find(".toggle").click(function(){
				me.openPickView();
			});
		}
		if (me.config.linkview){
			me.field.parent().find(".linkEditor").click(function(){
				me.openEditView();
			});
		}
		if (me.config.ac != undefined && !me.config.ac){
			me.field.attr("readOnly",true);
		}
		me.field.parent().autocomplete(
				{
					type:'POST',
					minChars: me.minChars,
					serviceUrl : function() {
						return me.config.url + '&srfaction=itemfetch';
					},
					onSelect : function(data) {
						me.onSelectValue(data.data, data.value);
					},
					onSearchStart : function(params) {
						var curparams = {
							srfaction : 'itemfetch'
						};
						var bcancel = me.fillPickupCondition(curparams);
						if(bcancel == false)
							return false;
						params = $.extend(params, curparams);
						params['limit'] = me.pageSize;
						return true;
					},
					onACClosed : function(that) {
						if (me.field.val() == '') {
							me.onSelectValue('', '');
							return;
						}
						if (me.field.val() != me.value) {
							me.field.val(me.value);
						}
					},
					onToggleClick : function(that) {
						if (me.pickermode) {
							me.openPickView();
						} else {
							that.getSuggestions('');
						}
					},
					transformResult : function(response) {
						var data = (typeof response === 'string' ? $.parseJSON(response) : response);
						var items = [];
						if (data.ret == 0) {
							$.each(data.items, function(index, item) {
								var text = item.text ? item.text.toString(): $IGM('IBIZPICKERFIELD.TRANSFORMRESULT.INFO','未定义');
								var data = item.value ? item.value.toString(): '';
								items.push({
									value : text,
									data : data
								});
							});
						}
						if(items.length == 0 && me.pickermode == true){
							items.push({
								value : $IGM('IBIZPICKERFIELD.TRANSFORMRESULT.INFO2','找不到符合的数据'),
								data : ''
							});
						}
						return {
							'suggestions' : items
						};
					}
				});
	},
	onSelectValue : function(id, text) {
		var me = this;
		if(!id || id == ''){
			id = '';
			text = '';
		}
		me.getForm().setFieldValue(me.valueItem, id);
		me.setValue(text);
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	},
	pickerWindowClose : function(win) {
		var me = this;
		if (win.dialogResult == 'ok') {
			if (win.selectedData) {
				me.onSelectValue(win.selectedData.srfkey,win.selectedData.srfmajortext);
			}
		} else if (win.dialogResult == 'reset') {
			me.onSelectValue('', '');
		}
	},
	openEditView : function(){
		var me = this;
		var data = {};
		var viewparam = {};
		var bcancel = me.fillPickupCondition(data);
		if(bcancel == false){
			return;
		}
		viewparam.srfkey = JSON.parse(data.srfreferdata)[me.config.valueItem];
		if(!viewparam.srfkey){
			return;
		}
		var win = $.getIBizApp().createWindow({});
		viewparam['windowid'] = win.getId();
		win.title = me.config.linkview.title;
		win.height = me.config.linkview.height;
		win.width = me.config.linkview.width;
		win.url = $.getIBizApp().parseURL(BASEURL, me.config.linkview.view, {
			windowid : win.getId()
		});
		win.viewparam = viewparam;
		win.openModal(window);
	},
	openPickView : function() {
		var me = this;
		if (me.isDisabled())
			return;
		var win = $.getIBizApp().createWindow({});
		var viewparam = {srfaction : 'itemfetch'};
		var bcancel = me.fillPickupCondition(viewparam);
		
		if(bcancel == false){
			return;
		}
		viewparam['windowid'] = win.getId();
		win.scope = me;
		win.title = me.config.pickupView.title;
		win.height = me.config.pickupView.height;
		win.width = me.config.pickupView.width;
		win.url = $.getIBizApp().parseURL(BASEURL, me.config.pickupView.view, {
			windowid : win.getId()
		});
		win.viewparam = viewparam;
		win.callback = function(win) {
			me.pickerWindowClose(win);
		};
		win.openModal(window);
	},
	/**
	 * 填充条件
	 */
	fillPickupCondition : function(arg) {
		var me = this;
		var form = me.getForm();
		if (!form) {
			IBiz.alert($IGM('IBIZPICKERFIELD.FILLPICKUPCONDITION.TITLE','操作失败'),$IGM('IBIZPICKERFIELD.FILLPICKUPCONDITION.INFO','未能找到当前表单，无法继续操作'),2);
			return false;
		}
		
		if (me.config.itemParam && me.config.itemParam.fetchcond) {
			var fetchparam = {};
			var fetchCond = me.config.itemParam.fetchcond;
			for ( var cond in fetchCond) {
				var field = form.findField(fetchCond[cond]);
				if (!field) {
					IBiz.alert($IGM('IBIZPICKERFIELD.FILLPICKUPCONDITION.TITLE','操作失败'),$IGM('IBIZPICKERFIELD.FILLPICKUPCONDITION.INFO2','未能找到表单项[' + fetchCond[cond]+ '],无法继续操作',[fetchCond[cond]]),2);
					return false;
				}
				var value = field.getValue();
				if (value == null || value == '') {
					return false;
				}
				fetchparam[cond] = value;
			}
			arg.srffetchcond = JSON.stringify(fetchparam);
		}
		if (me.config.itemParam && me.config.itemParam.temprs) {
			if (form.tempMode) {
				arg.srftempmode = true;
			}
		}
		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		arg.srfreferitem = me.config.name;
		var formtype = form.getFormType();
		if (formtype == 'EDITFORM'){
			var activeData = form.getActiveData();
			arg.srfreferdata = JSON.stringify(activeData);
		}else if (formtype == 'SEARCHFORM') {
			var controller = me.getForm().getController();
			var referData = controller.getReferData();
			if (referData)
				arg.srfreferdata = JSON.stringify(referData);
			if (!arg.srfreferdata) {
				var parentData = controller.getParentData();
				if (parentData)
					arg.srfparentdata = JSON.stringify(parentData);
			}
		}
		return true;
	}
});
/**
 * 单选框控件
 */
var IBizRadioField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+this.getUniqueId());
		me.items = {};
		me.initEvents();
		me.itemWidth = config.itemWidth;
		if(me.itemWidth==undefined){
			me.itemWidth = 150;
		}		
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		$.each(this.items,function(value,item){
			item.parent().removeClass('checked');
			item.removeAttr("checked");
		});
		var item = this.items[newValue];
		if(item)
		{
			item.parent().addClass('checked');
			item.attr("checked",'checked'); 
		}
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	},
	initEvents:function(){
		var me = this;
		me.items = {};
		if(me.field)
		{
			me.field.find('input').each(function(index,ele){
				var item = $(ele);
				me.items[ele.value] = item;
				item.prop("disabled", me.disabled);
				item.change(function(e) { 
					if (me.isDisabled())
						return;
					me.setValue(e.target.value);
				}); 
			});
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		$.each(me.items,function(key,item){
			item.prop("disabled", me.disabled);
		});
	},
	setAsyncConfig:function(config){
		var me = this;
		var items = [];
		if(config && config.items){
			$.each(config.items,function(idx,item){
				items.push('<label class="radio-inline" style="width:'+me.itemWidth.toString()+'px;">');
				items.push('<div class="radio">');
				items.push('<span class="">');
				items.push('<input type="radio" value="'+item.value+'">');
				items.push('</span>');
				items.push('</div>');
				items.push(item.text);
				items.push('</label>');
			});
		}
		me.field.html(items.join(''));
		me.initEvents();
		me.onValueChanged(me.value,me.value);
	}
});	
/**
 * 标签控件
 */
var IBizSpanField =  IBizField.extend({
	construct: function(options) {
		arguments.callee.$.construct.call(this,options);
		var me = this;
		me.fieldType = 'displayfield';
		me.field = $('#'+me.getUniqueId());
		me.initSize(me.field);
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue)
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	}
});	
/**
 * 多行文本框表单属性
 */
var IBizTextAreaField =  IBizField.extend({
	construct: function(options) {
		arguments.callee.$.construct.call(this,options);
		
		var me = this;
		me.itemMap = {};
		
		me.field = $('#'+me.getUniqueId());
		me.field.change(me,function(e){
			var me = e.data;
			me.setValue(me.field.val());
		});
		me.menucontainer = $('#'+me.getUniqueId()+'_c').find('.ibiz-id-dropdownmenu');
		me.dropdownbtn = $('#'+me.getUniqueId()+'_c').find('.dropdown-toggle');
		me.initSize(me.field);
		
		var ctrlConfig = {};
		if(options.maxHeight)
			ctrlConfig.maxHeight = options.maxHeight;
		else if(options.height)
			ctrlConfig.maxHeight = options.height;
		
		if(!options.dictId){
			me.menucontainer.addClass('hide');
			me.dropdownbtn.addClass('hide');
		}
		$('#'+me.getUniqueId()).autotextarea(ctrlConfig);
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		if(me.dropdownbtn){
			me.dropdownbtn.prop("disabled", disabled);
			me.dropdownbtn.attr('disabled',disabled);
		}
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue);
		$('#'+me.getUniqueId()).autotextarea2({minHeight:me.config.height?me.config.height:34});
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	},
	setAsyncConfig:function(config){
		var me = this;
		if(me.menucontainer){
			var items = [];
			if(config && config.dictitems){
				$.each(config.dictitems,function(idx,item){
					me.itemMap[item.value] = item;
					
					items.push('<li><a class="ibiz-id-menuitem" href="javascript:void(0);" data-ibiz-id="'+item.value+'">');
					items.push(item.text);
					items.push('</a></li>');
				});
			}
			me.menucontainer.html(items.join(''));
			me.initEvents();
		}
	},
	initEvents:function(){
		var me = this;
		if(me.menucontainer){
			me.menucontainer.find('.ibiz-id-menuitem').click(function(e){
				var text = me.itemMap[$(this).attr('data-ibiz-id')].value;
				me.field.insertAtCaret(text);
				me.setValue(me.field.val());
			});
		}
	}
});	
/**
 * 时间选择表单属性
 * 
 * <div id="datetimepicker1" class="input-append date">
 *   <input data-format="dd/MM/yyyy hh:mm:ss" type="text"></input>
 *   <span class="add-on">
 *     <i data-time-icon="icon-time" data-date-icon="icon-calendar">
 *     </i>
 *   </span>
 * 	</div>
 * 
 */
var IBizDateField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.fmt = config.fmt;
		if(!me.fmt){
			me.fmt = 'YYYY-MM-DD HH:mm';
		}
		me.field = $('#'+me.getUniqueId());
		me.initSize(me.field);
		
		me.field.datetimepicker({
			locale: locale,
			format:me.fmt
	    });
		me.field.on('dp.change',me,function(event){
			var me = event.data;
			if(event.date === false){
				me.setValue('');
			}else{
				me.setValue(moment(event.date).format(me.fmt));
			}
		});
		
		me.field.on('dp.show',me,function(event){
			var me = event.data;
			me.onShowHideChanged(true);
		});
		
		me.field.on('dp.hide',me,function(event){
			var me = event.data;
			me.onShowHideChanged(false);
		});
	},
	onValueChanged:function(oldVal,newVal){
		var me = this;
		
		if(!newVal || newVal == ''){
			me.field.val('');
		}else{
			me.field.val(newVal);
		}
		arguments.callee.$.onValueChanged.call(this,oldVal,newVal);
	},
	onShowHideChanged:function(bShow){
		var me=this;
		if(!me.getForm())
			return;
		var formtype = me.getForm().getFormType();
		if (formtype == 'SEARCHFORM')
		{
			if(bShow)
			{
				$('#'+me.getUniqueId()+"_c").css("height","400px");
			}
			else
			{
				$('#'+me.getUniqueId()+"_c").css("height","");
			}
		}
	}
});	
/**
 * 基本输入框属性
 */
var IBizTextField =  IBizField.extend({
	construct: function(options) {
		arguments.callee.$.construct.call(this,options);
		var me = this;
		me.field = $('#'+me.getUniqueId());
		me.field.change(me,function(e){
			var me = e.data;
			me.setValue(me.field.val());
		});
		me.initSize(me.field);
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	}
});	
/**
 * 单选框控件
 */
var IBizFileField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+this.getUniqueId());
		me.containerEL = me.field.find('.ibiz-fileupload-container');
		me.container = $(me.containerEL);
		me.uploadbtnEL = me.field.find('.ibiz-fileupload-upload');
		me.uploadbtn = $(me.uploadbtnEL);
		
		me.uploadbtn.click(function(){
			me.openUploadView('');
		});
		
		me.initSize(me.field);
		me.field.find('.select2-container').css('cssText','height:100%!important');
		me.field.find('.select2-choices').css('cssText','height:100%!important');
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		if(me.uploadbtn){
			me.uploadbtn.prop("disabled", disabled);
			me.uploadbtn.attr('disabled',disabled);
		}
	},
	getValue:function(){
		if(this.value){
			try 
			{ 
				if(this.value.length==0)
					return '';
			}
			catch (e)
			{
				
			}
			return JSON.stringify(this.value);
		}
		return '';
	},
	setValue:function(value){
		var me = this;
		if(value && value !== ''){
			if(typeof(value) !== 'object'){
				try 
				{ 
					value = JSON.parse(value);
				}catch (e) 
				{ 
					value = [];
				}
			}
		}else{
			value = [];
		}
		
		
		var oldVal = me.value;
		me.value = value;
		me.render(me.value);
		if(oldVal != value)
			me.onValueChanged(oldVal,me.value);
	},
	render:function(files){
		var me = this;
		if(files){
			var items = [];
			$.each(files,function(index,file){
				var id = file.id;
				var text = file.name;
				
				var item = '<li data-ibiz-fileid="'+id+'" class="ibiz-fileupload-item select2-search-choice ms-hover">';
				item +='<div>'+text+'</div>';
				item +='<a href="#" class="ibiz-fileupload-remove select2-search-choice-close" tabindex="-1"></a>';
				item +='</li>';
			
				items.push(item);
			});
			me.container.html(items.join(''));
			me.container.find('.ibiz-fileupload-remove').each(function(index,item){
				$(item).click(function(){
					me.removeFile($(this).parent().attr('data-ibiz-fileid'));
				});	
			});
			me.container.find('.ibiz-fileupload-item').each(function(index,item){
				$(item).dblclick(function(){
					me.openFile($(this).attr('data-ibiz-fileid'));
				});	
			});
		}else{
			me.container.html('');
		}
	},
	removeFile:function(fileid){
		var me = this;
		
		if(me.isDisabled())
			return;
		
		var values = [];
		if(me.value){
			$.each(me.value,function(index,file){
				if(file.id != fileid){
					values.push(file);
				}
			});
		}
		me.setValue(values);
	},
	openFile:function(fileid){
		window.open(BASEURL+'/ibizutil/exportfile.jsp?fileid='+fileid,'_blank');
	},
	uploadCallback:function(win){
		var me = win.opener;
		var data = win.files;
		if(data){
			if(me.value){
				var newVal = $.merge(me.value,data);
				me.setValue(newVal);
			}else{
				me.setValue(data);
			}
		}
	},
	openUploadView:function(codelist){
		var me = this;
		if(me.isDisabled())
			return;
		var win = $.getIBizApp().createWindow({});
		win.opener = me;
		win.title = $IGM('IBIZFILEFIELD.OPENUPLOADVIEW.INFO','上传文件');
		win.height = 500;
		win.width = 600;
		win.url = BASEURL +'/ibizutil/fileuploadview.jsp?'+$.param({windowid:win.getId()});
		win.callback = me.uploadCallback;
        win.openModal(window);
	}	
	
	
});	
/**
 * 下拉列表表单属性
 */
var IBizDropDownListField = IBizField.extend({
	construct : function(opts) {
		arguments.callee.$.construct.call(this, opts);
		var me = this;
		me.field = $('#' + this.getUniqueId());
		if (me.field) {
			me.field.select2({
				placeholder: $IGM('IBIZDROPDOWNLISTFIELD.PLACEHOLDER',"请选择...")
			});
			me.field.on("change", me, function(e) {
				var value=$(e.target).select2('val');
				if(value=='__SRFRESET__'){
					e.data.setValue('');
					$(e.target).select2('val','');
					return;
				}
				e.data.setValue($(e.target).select2('val'));
			});
		}
	},
	onValueChanged : function(oldValue, newValue) {
		var me = this;
		if(me.field){
			me.field.select2('val', newValue);
		}
		arguments.callee.$.onValueChanged.call(this, oldValue, newValue);
	},
	/**
	 * 设置是否启用
	 */
	setDisabled : function(disabled) {
		arguments.callee.$.setDisabled.call(this, disabled);
		var me = this;
		if (me.field) {
			me.field.prop("disabled", disabled);
		}
	},
	/**
	 * 设置动态配置
	 */
	setAsyncConfig : function(config) {
		var me = this;
		var items = [];
		if (config && config.items) {
				items.push('<option value="__SRFRESET__">'+ $IGM('IBIZDROPDOWNLISTFIELD.CLEAN','(清空)')+'</option>');
			$.each(config.items, function(idx, item) {
				items.push('<option value="' + item.value + '">' + item.text + '</option>');
			});
		}
		if(me.field){
			me.field.html(items.join(''));
		}
		me.onValueChanged(me.value,me.value);
	}
});
/**
 * 选择框表单属性
 */
var IBizCheckField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.field = $('#'+this.getUniqueId());
		
		var me = this;
		this.field.change(function(e){
			if(me.field.is(':checked')){
				me.setValue('1');
			}else{
				me.setValue('0');
			}
			
		});
	},
	/**
	 * 值变化 
	 */
	onValueChanged:function(oldValue,newValue){
		var me = this;
		
		//判断内容
		if(newValue == '1'){
			me.field.attr("checked",true);
		}else{
			me.field.attr("checked",false);
		}
		
		arguments.callee.$.onValueChanged.call(this,oldValue,newValue);
	}
});	
/**
 * 多选表单属性
 */
var IBizCheckListField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+this.getUniqueId());
		me.items = {};
		me.initEvents();
		me.itemWidth = config.itemWidth;
		me.orMode = config.orMode;
		me.valueSeparator = config.valueSeparator;
		if(me.itemWidth==undefined){
			me.itemWidth = 150;
		}
		if (me.orMode == undefined || me.orMode == '') {
	        me.orMode = 'str';
		}
		if (me.orMode == 'str' && (me.valueSeparator == undefined || me.valueSeparator == '')) {
	          me.valueSeparator = ',';
		}
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		$.each(me.items,function(name,it){
			$(it).parent().removeClass('checked');
			$(it).prop("checked", false); 
		});
		if(newValue){
			if(me.orMode=='num'){
				 var nVal = parseInt(newValue);
				 $.each(me.items,function(name,it){
					 var inputValue = parseInt(name);
					 if ((nVal & inputValue) == inputValue)
						 {
						 	$(it).parent().addClass('checked');
						 	$(it).prop("checked", true); 
						 }
				 });
			}
			else
				if(me.orMode=='str'){
					var values = newValue.split(me.valueSeparator);
					$.each(values,function(idx,val){
						var item = me.items[val];
						if(item){
							$(item).parent().addClass('checked');
							$(item).prop("checked", true); 
						}	
					});
				}
		}
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	},
	initEvents:function(){
		var me = this;
		me.items = {};
		if(me.field)
		{
			me.field.find('input').each(function(index,ele){
				var item = $(ele);
				me.items[ele.value] = item;
				item.prop("disabled", me.disabled);
				item.change(function(e){
					if (me.isDisabled())
						return;
					if(e.target.checked){
						$(e.target).parent().addClass('checked');
					}else{
						$(e.target).parent().removeClass('checked');
					}
					if(me.orMode=='num'){
						var _tmp = 0;
						$.each(me.items,function(name,it){
							if($(it).parent().hasClass('checked'))
							{
								_tmp = _tmp | parseInt(name);
							}
						});
						me.setValue(_tmp.toString());
					}
					else
						if(me.orMode=='str'){
							var values = [];
							$.each(me.items,function(name,it){
								if($(it).parent().hasClass('checked'))
								{
									values.push(name);
								}
							});	
							me.setValue(values.join(me.valueSeparator));
						}
				}); 
			});
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		$.each(me.items,function(key,item){
			item.prop("disabled", me.disabled);
		});
	},
	setAsyncConfig:function(config){
		var me = this;
		var items = [];
		if(config && config.items){
			$.each(config.items,function(idx,item){
				items.push('<label class="checkbox-item">');
				items.push('<div class="checker">');
				items.push('<span>');
				items.push('<input type="checkbox" value="'+item.value+'">');
				items.push('</span>');
				items.push('</div>');
				items.push(item.text);
				items.push('</label>');
			});
			
		}
		me.field.html(items.join(''));
		me.initEvents();
		me.onValueChanged(me.value,me.value);
	}
});	
/**
 * 多选表单属性
 */
var IBizCheckListField2 =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.itemMap = {};
		me.field = $('#'+me.getUniqueId());
		me.initSize(me.field);
		
		me.field.change(function(){
			me.setValue(me.field.val());
		});
	},
	initData:function(items){
		var me = this;
		if(!items){
			items = [];
		}
		$.each(items,function(idx,item){
			me.itemMap[item.value] = item;
		});
		
		me.field.select2({
            tags: items,
            id:function(e){
            	return  e.value;
            }
		});
		me.field.parent().find('.select2-container').css('cssText','height:100%!important');
		me.field.parent().find('.select2-choices').css('cssText','height:100%!important');
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		var items = [];
		
		if(newValue){
			var ids = newValue.split(',');
			
			$.each(ids,function(idx,item){
				var txt = $IGM('IBIZCHECKLISTFIELD.ONVALUECHANGED.INFO','未知');
				var data = me.itemMap[item];
				if(data){
					txt = data.text;
				}
				items.push({value:item,text:txt});
			});
		}
		me.field.select2('data',items);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	},
	setAsyncConfig:function(config){
		var me = this;
		var items = [];
		if(config && config.items){
			me.initData(config.items);
		}else{
			me.initData([]);
		}
		me.onValueChanged(me.value,me.value);
	}
});	
/**
 * 列表-表单项属性
 */
var IBizListPickerField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.itemMap = {};
		
		me.field = $('#'+me.getUniqueId());
		if(me.container){
			me.addBtn = $(me.container.find('.ibiz-id-add'));
			me.removeBtn = $(me.container.find('.ibiz-id-remove'));
		}
		
		if(me.addBtn){
			me.addBtn.click(function(e){
				me.openPickView();
			});
		}
		if(me.removeBtn){
			me.removeBtn.click(function(e){
				me.deleteSelectItems();
			});
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		
		if(me.addBtn){
			me.addBtn.prop("disabled", disabled);
			me.addBtn.attr('disabled',disabled);
		}
		if(me.removeBtn){
			me.removeBtn.prop("disabled", disabled);
			me.removeBtn.attr('disabled',disabled);
		}	
	},
	/**
	 * 值变化 
	 */
	onValueChanged:function(oldValue,newValue){
		var me = this;
		
		var html = [];
		if(newValue == null || newValue == undefined || newValue == ''){
			me.itemMap = {};
		}else{
			var data = [];
			try
			{
				data = JSON.parse(newValue);
			}catch(e){
			}
			
			$.each(data,function(idx,item){
				html.push('<option value="'+item.srfkey+'">'+item.srfmajortext+'</option>');
				me.itemMap[item.srfkey] = item;
			});
		}
		me.field.html(html.join(''));
		arguments.callee.$.onValueChanged.call(this,oldValue,newValue);
	},
	deleteSelectItems:function(){
		var me = this;
		if(me.isDisabled())
			return;
		var ids = me.field.val();
		if(ids == null || ids == undefined || ids == '' ){
			return;
		}
		var bChanged;
		
		$.each(ids,function(idx,id){
			if(me.itemMap[id]){
				 delete me.itemMap[id];
				 bChanged = true;
			}
		});
		if(bChanged){
			var data = [];
			$.each(me.itemMap,function(idx,item){
				data.push(item);
			});
			if(data.length==0)
				me.setValue('');
			else
				me.setValue(JSON.stringify(data));
		}
	},
	pickerWindowClose:function(win){
		var me = this;
		var bChanged = false;
		if(win.dialogResult == 'ok'){
			if(win.selectedDatas){
				$.each(win.selectedDatas,function(idx,item){
					if(!me.itemMap[item.srfkey]){
						bChanged = true;
						me.itemMap[item.srfkey] = item;
					}
				});
			}
		}
		if(bChanged){
			var data = [];
			$.each(me.itemMap,function(idx,item){
				data.push(item);
			});
			if(data.length==0)
				me.setValue('');
			else
				me.setValue(JSON.stringify(data));
		}
	},
	openPickView:function(){
		var me = this;
		if(me.isDisabled())
			return;
		if(!me.config.pickupView){
			return;
		}
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = {};
		viewparam['windowid'] = win.getId();
		win.scope = me;
		win.title = me.config.pickupView.title;
		win.height = me.config.pickupView.height;
		win.width = me.config.pickupView.width;
		win.url = $.getIBizApp().parseURL(BASEURL,me.config.pickupView.view,{windowid:win.getId()});
		win.viewparam = viewparam;
		win.callback = function(win){
			me.pickerWindowClose(win);
		};	
		win.openModal(window);
	}
});	
/**
 * 地址框-表单项属性
 */
var IBizAddressPickerField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.itemMap = {};
		me.field = $('#'+this.getUniqueId());
		me.containerEL = me.field.find('.ibiz-id-container');
		me.container = $(me.containerEL);
		me.uploadbtn = me.field.find('.ibiz-id-picker');
		me.uploadbtn.click(function(){
			me.openPickView();
		});
		
		me.initSize(me.field);
		me.field.find('.select2-container').css('cssText','height:100%!important');
		me.field.find('.select2-choices').css('cssText','height:100%!important');
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		if(me.uploadbtn){
			me.uploadbtn.prop("disabled", disabled);
			me.uploadbtn.attr('disabled',disabled);
		}
	},
	/**
	 * 值变化 
	 */
	onValueChanged:function(oldValue,newValue){
		var me = this;
		
		var html = [];
		if(newValue == null || newValue == undefined || newValue == ''){
			me.itemMap = {};
		}else{
			var data = [];
			try
			{
				data = JSON.parse(newValue);
			}catch(e){
			}
			
			$.each(data,function(idx,item){
				me.itemMap[item.srfkey] = item;
			});
		}
		me.render();
		arguments.callee.$.onValueChanged.call(this,oldValue,newValue);
	},
	render:function(){
		var me = this;
		if(me.itemMap){
			var items = [];
			$.each(me.itemMap,function(index,item){
				if(item){
					var id = item.srfkey;
					var text = item.srfmajortext;
					
					var item = '<li data-id-item="'+id+'" class="ibiz-id-item select2-search-choice ms-hover">';
					item +='<div>'+text+'</div>';
					item +='<a href="#" class="ibiz-id-remove select2-search-choice-close" tabindex="-1"></a>';
					item +='</li>';
				
					items.push(item);
				}
			});
			me.container.html(items.join(''));
			me.container.find('.ibiz-id-remove').each(function(index,item){
				$(item).click(function(){
					me.removeItem($(this).parent().attr('data-id-item'));
				});	
			});
		}else{
			me.container.html('');
		}
	},
	removeItem:function(itemid){
		var me = this;
		
		if(me.isDisabled())
			return;
		
		me.itemMap[itemid] = null;
		var data = [];
		$.each(me.itemMap,function(idx,item){
			if(item){
				data.push(item);	
			}
		});
		if(data.length==0)
		{
			me.setValue('');
		}
		else
			me.setValue(JSON.stringify(data));
	},
	openPickView:function(){
		var me = this;
		if(me.isDisabled())
			return;
		if(!me.config.pickupView){
			return;
		}
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = {srfaction : 'itemfetch'};
		var bcancel = me.fillPickupCondition(viewparam);
		
		if(bcancel == false){
			return;
		}
		viewparam['windowid'] = win.getId();
		win.scope = me;
		win.title = me.config.pickupView.title;
		win.height = me.config.pickupView.height;
		win.width = me.config.pickupView.width;
		win.url = $.getIBizApp().parseURL(BASEURL,me.config.pickupView.view,{windowid:win.getId()});
		win.viewparam = viewparam;
		win.callback = function(win){
			me.pickerWindowClose(win);
		};	
		win.openModal(window);
	},
	pickerWindowClose:function(win){
		var me = this;
		var bChanged = false;
		if(win.dialogResult == 'ok'){
			if(win.selectedDatas){
				$.each(win.selectedDatas,function(idx,item){
					if(!me.itemMap[item.srfkey]){
						bChanged = true;
						me.itemMap[item.srfkey] = item;
					}
				});
			}
		}
		if(bChanged){
			var data = [];
			$.each(me.itemMap,function(idx,item){
				if(item){
					data.push(item);	
				}
			});
			if(data.length==0)
			{
				me.setValue('');
			}
			else
				me.setValue(JSON.stringify(data));
		}
	},
	/**
	 * 填充条件
	 */
	fillPickupCondition : function(arg) {
		var me = this;
		var form = me.getForm();
		if (!form) {
			IBiz.alert($IGM('IBIZADDRESSPICKERFIELD.FILLPICKUPCONDITION.TITLE','操作失败'),$IGM('IBIZADDRESSPICKERFIELD.FILLPICKUPCONDITION.INFO','未能找到当前表单，无法继续操作'),2);
			return false;
		}
		
		if (me.config.itemParam && me.config.itemParam.fetchcond) {
			var fetchparam = {};
			var fetchCond = me.config.itemParam.fetchcond;
			for ( var cond in fetchCond) {
				var field = form.findField(fetchCond[cond]);
				if (!field) {
					IBiz.alert($IGM('IBIZADDRESSPICKERFIELD.FILLPICKUPCONDITION.TITLE','操作失败'),$IGM('IBIZADDRESSPICKERFIELD.FILLPICKUPCONDITION.INFO2','未能找到表单项[' + fetchCond[cond]+ '],无法继续操作',[fetchCond[cond]]),2);
					return false;
				}
				var value = field.getValue();
				if (value == null || value == '') {
					return false;
				}
				fetchparam[cond] = value;
			}
			arg.srffetchcond = JSON.stringify(fetchparam);
		}
		if (me.config.itemParam && me.config.itemParam.temprs) {
			if (form.tempMode) {
				arg.srftempmode = true;
			}
		}
		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		arg.srfreferitem = me.config.name;
		var formtype = form.getFormType();
		if (formtype == 'EDITFORM'){
			var activeData = form.getActiveData();
			arg.srfreferdata = JSON.stringify(activeData);
		}else if (formtype == 'SEARCHFORM') {
			var controller = me.getForm().getController();
			var referData = controller.getReferData();
			if (referData)
				arg.srfreferdata = JSON.stringify(referData);
			if (!arg.srfreferdata) {
				var parentData = controller.getParentData();
				if (parentData)
					arg.srfparentdata = JSON.stringify(parentData);
			}
		}
		return true;
	}
});	
/**
 * 表单对象
 */	
var IBizForm =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.id = this.config.id;
		this.backendurl = this.config.url;
		this.controller = config.ctrler;
		this.fieldIdMap = {};
		this.fieldMap = {};
		this.groupMap = {};
	},
	/**
	 *
	 */
	init:function(){
		var me = this;
		$.each(me.fieldMap,function(key,item){
			//计算表单是否允许为空
        	item.setAllowBlank(item.allowBlank);
        	//计算表单是否显示
        	item.setVisible(item.visible);
        	//计算表单是否隐藏
        	item.setHidden(item.hidden);
		});
	},	
	/**
	 * 加载
	 * @param arg 参数
	 */
	autoLoad : function(arg) {
		var me = this;
		if (!arg)
			arg = {};
		if (arg.srfkey != undefined && arg.srfkey != '') {
			me.load2(arg);
			return;
		}
		if(arg.srfkeys != undefined && arg.srfkeys != ''){
			arg.srfkey = arg.srfkeys;
			//me.viewparam['srfkey'] = arg.srfkey;
			me.load2(arg);
			return;
		}
		me.loadDraft(arg);
	},
	load2 : function(arg) {
		var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        $.extend(arg, { srfaction: 'load' });
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        me.load(arg,function (form, action) {
        			me.setFieldAsyncConfig(action.config);
	                me.setFieldState(action.state);
	                me.setDataAccAction(action.dataaccaction);
	                me.fillForm(action.data);
	            	me.formDirty = false;
	                me.fireEvent(IBizForm.FORMLOADED,me);
	                me.ignoreUFI = false;
	                me.ignoreformfieldchange=false;
	                me.fireEvent(IBizForm.FORMFIELDCHANGED,null);
	                me.onLoaded();
	                
             },function (form, action) {
            	 action.failureType = 'SERVER_INVALID';
     			IBiz.alert($IGM('IBIZFORM.LOAD.TITLE','加载失败'),$IGM('IBIZFORM.LOAD2.INFO',"加载数据发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
                me.ignoreUFI = false;
                me.ignoreformfieldchange=false;
     	});
	},
	loadDraft : function(arg) {
		var me=this;
        if (!arg)
            arg = {};
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        if(!arg.srfsourcekey || arg.srfsourcekey=='')
        	$.extend(arg, { srfaction: 'loaddraft' });
        else
        	$.extend(arg, { srfaction: 'loaddraftfrom' });
        me.load(arg,function (form, action) {
        				me.setFieldAsyncConfig(action.config);
        				me.setFieldState(action.state);
        				me.setDataAccAction(action.dataaccaction);
        				me.fillForm(action.data);
        				me.formDirty = false;
                		me.fireEvent(IBizForm.FORMLOADED,me);
                		me.ignoreUFI = false;
                		me.ignoreformfieldchange=false;
                		me.fireEvent(IBizForm.FORMFIELDCHANGED,null);
                		me.onDraftLoaded();
              		},
              		function (form, action) {
              			action.failureType = 'SERVER_INVALID';
              			IBiz.alert($IGM('IBIZFORM.LOAD.TITLE','加载失败'),$IGM('IBIZFORM.LOADDRAFT.INFO',"加载草稿发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
              			me.ignoreUFI = false;
              			me.ignoreformfieldchange=false;
              		});
	},
	onDraftLoaded:function(){
		var me = this;
	},
	onLoaded:function(){
		var me = this;
	},
	/**
	 * 设置表单动态配置
	 */
	setFieldAsyncConfig:function(config){
		if (config == undefined || config == null)
            return;
        var me = this;
        $.each(config,function(name,value){
        	var field = me.findField(name);
        	if(field){
        		field.setAsyncConfig(value);
        	}
        });
	},
	/**
	 * 设置当前表单权限信息
	 */
	setDataAccAction:function(dataaccaction){
		var me = this;
		me.dataaccaction = dataaccaction;
		
		me.fireEvent(IBizForm.DATAACCACTIONCHANGE, me, dataaccaction);
	},
	/**
	 * 获取当前表单权限信息
	 */
	getDataAccAction:function(){
		var me = this;
		return me.dataaccaction;
	},
	/**
	 * 设置属性状态
	 */
	setFieldState: function (state) {
        if (state == undefined || state == null)
            return;
        var me = this;
        $.each(state,function(name,value){
        	var field = me.findField(name);
        	if(field){
            	var disabled = ((value & 1) == 0);
            	if(field.isDisabled()!=disabled)
            		field.setDisabled(disabled);
        	}
        });
	},
	isDirty:function(){
		var me = this;
		return me.formDirty;
	},
	/**
	 * 注册表单属性
	 * @param field 属性
	 */
	register:function(field){
		var me = this;
		if($.isArray(field))
		{
			$.each(field,function(index,item){
				me.fieldIdMap[item.getName()] = item;
				me.fieldMap[item.getName()] = item;
				item.setForm(me);
				//注册事件
				item.on(IBizField.VALUECHANGED,function(sender,args,e){
			        if (me.ignoreformfieldchange)
			            return;
			        me.formDirty = true;
			        me.fireEvent(IBizForm.FORMFIELDCHANGED, sender, args);
				},me);
				
			});
		}else
		{
			me.fieldIdMap[field.getName()] = field;
			me.fieldMap[field.getName()] = field;
			field.setForm(me);
			//注册事件
			field.on(IBizField.VALUECHANGED,function(sender,args,e){
		        if (me.ignoreformfieldchange)
		            return;
		        me.formDirty = true;
		        me.fireEvent(IBizForm.FORMFIELDCHANGED, sender, args);
			},me);
		}
	},
	/**
	 * 注销表单属性
	 * @param field 属性
	 */
	unRegister:function(field){
		this.fieldMap[field.getName()] = null;
		this.fieldIdMap[field.getUniqueId()] = null;
	},
	/**
	 * 获取控件标识
	 */
	getSRFCtrlId:function(){
		return this.srfctrlid;
	},
	/**
	 * 获取后台服务地址
	 */
	getBackendUrl:function(){
		return this.backendurl;
	},
	/**
	 * 根据名称获取属性
	 */
	findField:function(name){
		return this.fieldMap[name];
	},
	/**
	 * 根据唯一标识获取属性
	 */
	getFieldById:function(id){
		return this.fieldIdMap[id];
	},
	/**
	 * 加载数据
	 */
	load:function(arg,success2,failure2){
		var me = this;
		if(!arg)
			arg = {};
		
		me.loadingTag = IBiz.beginload();		
		IBiz.ajax({url:me.backendurl,
			params:arg,
			method:'POST',
			success:function(data){
				 IBiz.endload(me.loadingTag);
				if(data && data.ret == 0){
					success2(me,data);
				}else{
					failure2(me,data);
				}
			},
			failure:function(data){
				IBiz.endload(me.loadingTag);
				failure2(me,data);
			}
		});
	},  
	submit:function(arg,success,failure){
		var me = this;
		if(!arg)
			arg = {};
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({url:this.backendurl,
			params:arg,
			method:'POST',
			success:function(data){
				 IBiz.endload(me.loadingTag);
				if(data.ret == 0)
					success(me,data);
				else
					failure(me,data);
			},
			failure:function(e){
				IBiz.endload(me.loadingTag);
				failure(me,{ret:1000,errorMessage:$IGM('IBIZFORM.SUBMIT.ERROR','请求发生错误')});
			}
		});
	},  
	getActionErrorInfo: function (action) {
        if (action.failureType === 'CONNECT_FAILURE') {
            return 'Status:' + action.response.status + ': '+ action.response.statusText;
        }
        if (action.failureType === 'SERVER_INVALID') {
            var msg = action.errorMessage;
            if(action.error && action.error.items)
            {
	            $.each(action.error.items,function(index,item){
	            	if(index>=5)
	                {
	                	msg+=("<BR>...... ");
	                	return false;
	                }
	                if(item.info&&item.info!='')
	                {
	                	msg+=("<BR>"+item.info);
	                }
	            });
            }
            return msg;
        }
        if (action.failureType === 'CLIENT_INVALID') {
            return "";
        }
        if (action.failureType === 'LOAD_FAILURE') {
            return "";
        }
    },
	/**
	 * 填充表单
	 */
	fillForm:function(data){
		if(!data)
			return;
		var me = this;
		$.each(data, function(key, val) {  
			if($.isArray(val)){
				val = JSON.stringify(val);
			}
			me.setFieldValue(key,val);
		});
		$.each(me.groupMap, function(key, val) { 
			var groupField = me.findField(key);
			var coptionField = me.findField(val);
			if(coptionField){
				groupField.setGroupText(coptionField.getValue());
			}
		});
	},
	/**
	 * 设置表单项值
	 */
	setFieldValue:function(name,value){
    	var field = this.findField(name);
    	if(field)
    		field.setValue(value);
    },
    /**
     * 获取表单项值
     */
    getFieldValue: function (name) {
        var me = this;
        var field = me.findField(name);
        if (!field) {
            IBiz.alert($IGM('IBIZFORM.GETFIELDVALUE.TITLE','获取失败'), $IGM('IBIZFORM.GETFIELDVALUE.INFO','无法获取表单项['+name+']',[name]),2);
            return '';
        }
        return field.getValue();
    },
    /**
     * 设置表单项允许为空
     */
    setFieldAllowBlank: function (name,allowblank) {
    	var me = this;
    	var field = me.findField(name);
    	if (field) {
    		field.setAllowBlank(allowblank);
    	}
   	},
   	/**
   	 * 设置表单项属性是否禁用
   	 */
    setFieldDisabled: function (name, disabled) {
        var me = this;
        var field = me.findField(name);
        if (field){
        	field.setDisabled(disabled);
        }
	},
	/**
	 * 设置表单错误
	 */
	setFormError: function (formerror) {
        var me = this;
        me.resetFormError();
        if (formerror && formerror.items) {
        	$.each(formerror.items,function(index,item){
        		 var field = me.findField(item.id);
                 if (field){
                	 field.markInvalid($IGM('IBIZFORM.SETFORMERROR.ERROR','输入有误'));
                     field.setActiveError($IGM('IBIZFORM.SETFORMERROR.ERROR','输入有误'));
                 }
        	});
        }
    },
    resetFormError: function () {
        var me = this;
        $.each(me.fieldMap,function(key,item){
        	if(item.hasActiveError())
        	{
        		item.unsetActiveError();
        	}
		});
    },
    /**
     * 设置面板<分组、分页面板>隐藏
     */
    setPanelVisible:function(name,visible){
    	var me = this;
    	var field = me.findField(name);
    	if(field){
    		field.setVisible(visible);
    	}
    },
    /**
     * 获取当前表单项值
     */
    getActiveData:function(){
    	var me = this;
        var values = {};
        $.each(me.fieldMap,function(key,field){
        	if(field){
        		if (values[field.getName()] == undefined) {
                    var value = field.getValue();
                    if (value)
                    {
                    	if (value.toString().length < 8000)
                    		values[field.getName()] = field.getValue();
                    }
                }
        	}
 		});
        return values;
    },
    /**
     * 获取全部表单项值
     */
    getValues:function(){
    	var me = this;
		var values = {};
		$.each(me.fieldMap, function(index, item) {  
			var name = item.getName();
			var value = item.getValue();
			values[name] = value;
		}); 
		return values;
    },
    testFieldEnableReadonly:function(value){
    	return false;
    },
    /**
     * 更新表单项
     */
    updateFormItems: function (arg) {
    	var me=this;
    	if(me.ignoreUFI)
    		return;
    	var activeData = me.getActiveData();
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        $.extend(arg, { srfaction: 'updateformitem',srfactivedata:JSON.stringify(activeData)});
        me.ignoreUFI = true;
//        me.ignoreformfieldchange=true;
        me.load(arg,function (form, action) {
	        	me.setFieldAsyncConfig(action.config);
	            me.setFieldState(action.state);
	            if(action.dataaccaction)
	            	me.setDataAccAction(action.dataaccaction);
	            me.fillForm(action.data);
            	me.ignoreUFI = false;
//                me.ignoreformfieldchange=false;
//                me.fireEvent(IBizForm.FORMFIELDCHANGED, null);
            },function (form, action) {
            	action.failureType = 'SERVER_INVALID';
      			IBiz.alert($IGM('IBIZFORM.UPDATEFORMITEMS.TITLE','更新失败'), $IGM('IBIZFORM.UPDATEFORMITEMS.INFO',"更新表单项发生错误,"+action.info,[action.info]),2);
                me.ignoreUFI = false;
//                me.ignoreformfieldchange=false;
      	});
    },
    /**
     * 重置表单
     */
    reset:function(){
    	var me = this;
    	me.autoLoad();
    },
    getFormType:function(){
    	return '';
    }
});
/*****************事件声明************************/
/**
 * 表单加载完成事件
 */
IBizForm.FORMLOADED = 'FORMLOADED';
/**
 * 表单属性值变化事件
 */
IBizForm.FORMFIELDCHANGED = 'FORMFIELDCHANGED';
/**
 * 表单保存完成
 */
IBizForm.FORMSAVED = 'FORMSAVED';
/**
 * 表单删除完成
 */
IBizForm.FORMREMOVED = 'FORMREMOVED';
/**
 * 表单工作流启动完成
 */
IBizForm.FORMWFSTARTED = 'FORMWFSTARTED';
/**
 * 表单工作流提交完成
 */
IBizForm.FORMWFSUBMITTED = 'FORMWFSUBMITTED';
/**
 * 表单权限发生变化
 */
IBizForm.DATAACCACTIONCHANGE = 'DATAACCACTIONCHANGE';
/**
 * 表单对象
 */
var IBizSearchForm = IBizForm.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.container = $('#'+config.id);
		me.searchBtn = $('#'+config.id+'_searchbutton');
		me.resetBtn = $('#'+config.id+'_resetbutton');
		me.searchTab = $('#'+config.id+'_tab li');
		me.bResetting = false;
		
		if(me.searchBtn){
			if(me.getController().hasQuickSearch()){
				me.searchBtn.addClass('hidden');
			}else{
				me.searchBtn.click(me,function(e){
					e.data.onSearch();
				});
			}
		}
		if(me.resetBtn){
			me.resetBtn.click(me,function(e){
				e.data.onReset();
			});
		}
		
		me.container.find('input').keyup(function() {
            if (event.keyCode == "13") {
            	me.onSearch();
            }
		}); 
		me.container.find('select').keyup(function() {
            if (event.keyCode == "13") {
            	me.onSearch();
            }
		}); 
		me.searchTab.click(function(){
			setTimeout(function(){
				me.controller.doLayout();
			},70);
		});
		//是否有自定义搜索面板
		if(me.isCustomSearch())
			me.initCustomSearchPanel();
	},
	//是否开启自定义查询
	isCustomSearch : function (){
		var me = this;
		if(me.config &&me.config.enableAdvanceSearch)
			return true;
		else
			return false;
	},
	//初始化自定义搜索面板
	initCustomSearchPanel : function(){
		var me = this;
		var cid = '';
		me.customSearchView = $('#'+me.config.id+'_addsearchbutton');
		if(me.customSearchView){
			me.customSearchView.on("click","",function(){
				me.openPickView();
			});
		}
	},
	//设置自定义查询值
	setCustomSearchVal : function(value, text){
		var me = this;
		
		me.customSearchVal = value;
		
		var searchText = $("#"+me.config.id+"_searchtext");
		if(searchText)
			searchText.text(text);
	},
	getCustomSearchVal : function(){
		var me = this;
		var cmsVal = {};
		if(me.customSearchVal && me.customSearchVal != '')
			cmsVal.customsearchval = JSON.stringify(me.customSearchVal);
		return cmsVal;
	},
	//打开搜索条件面板视图
	openPickView : function(){
		var me = this;
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = {};
		
		if(me.config.dename){
			viewparam['dename'] = me.config.dename;
		}
		if(me.config.ctrler.getId()){
			viewparam['ctrid'] = me.config.ctrler.getId();
			viewparam['openerid'] = me.config.ctrler.getId();
		}
		viewparam['windowid'] = win.getId();
		win.scope = me;
		win.title = $IGM('IBIZSEARCHFORM.OPENPICKVIEW.INFO','自定义搜索');
		win.height = 500;
		win.width = 900;
		win.url = BASEURL + '/ibizutil/customsearchview.jsp?' + $.param({windowid:win.getId()});
		win.viewparam = viewparam;
		win.callback = function(win){
			me.pickerWindowClose(win);
		};	
		win.openModal(window);
	},
	//点击确定按钮关闭窗口对象
	pickerWindowClose : function(win){
		var me = this;
		if(win.dialogResult == "ok"){
			var tmp = win.tmp;
			me.setCustomSearchVal(win.param, win.tmp);
		}
	},
	isOpen:function(){
		var me = this;
		return me.opened;
	},
	open:function(){
		var me = this;
		me.opened = true;
		if(me.container){
			me.container.removeClass('hidden');
		}
	},
	close:function(){
		var me = this;
		me.opened = false;
		if(me.container){
			me.container.addClass('hidden');
		}
	},
	/**
	 * 搜索
	 */
	onSearch:function(){
		var me = this;
		me.fireEvent(IBizSearchForm.FORMSEARCHED, me, {});
	},
	/**
	 * 重置
	 */
	onReset:function(){
		var me = this;
		me.bResetting = true;
		me.setCustomSearchVal('', '');
		me.reset();
	},
	onDraftLoaded:function(){
		var me = this;
		me.fireEvent(IBizSearchForm.FORMRESETED, me, {});
	},
	onLoaded:function(){
		var me = this;
		me.fireEvent(IBizSearchForm.FORMRESETED, me, {});
	},
    getFormType:function(){
    	return 'SEARCHFORM';
    },
	getHeight:function(){
		var me = this;
		if(me.isOpen())
		{
			return me.container.outerHeight();
		}
		return 0;
	}
});
/*****************事件声明************************/
/**
 * 搜索表单重置事件
 */
IBizSearchForm.FORMRESETED = 'FORMRESETED';
/**
 * 搜索表单搜索事件
 */
IBizSearchForm.FORMSEARCHED = 'FORMSEARCHED';
/**
 * 表单对象
 */
var IBizEditForm = IBizForm.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
	},
	save2: function (arg) {
    	var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        var data = this.getValues();
        $.extend(arg, data);
        
        if (data.srfuf == "1")
        	$.extend(arg, { srfaction: 'update' });
        else
        	$.extend(arg, { srfaction: 'create' });
        //获取所有Disabled数据
        var disablevalues = {};
        $.each(this.fieldMap,function (name,item) {
            if (item.isDisabled()) {
                if (disablevalues[item.name] == undefined) {
                	disablevalues[item.name] = item.getValue();
                }
            }
        });
        $.extend(arg, disablevalues);
        
        arg.srfcancel=false;
     	me.fireEvent( IBizEditForm.FORMBEFORESAVE, me,arg);
        if(arg.srfcancel==true){
        	return;
        }
        delete arg.srfcancel;
        
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        
        this.submit(arg,function (form, action) {
		            me.resetFormError();
		            me.setFieldAsyncConfig(action.config);
		            me.setFieldState(action.state);
		            me.setDataAccAction(action.dataaccaction);
		            me.fillForm(action.data);
		            me.formDirty = false;
		            //判断是否有提示
		            if (action.info && action.info != '') {
    					IBiz.alert('',action.info,1);
    				}
		            me.fireEvent('formsaved', me,action);
		            me.ignoreUFI = false;
		            me.ignoreformfieldchange=false;
		            me.fireEvent('formfieldchanged', null);
		            me.onSaved();
        		},
        		function (form, action) {
        			if (action.error) {
        				me.setFormError(action.error);
        			}
        			
        			me.ignoreUFI = false;
        			me.ignoreformfieldchange=false;
        			
        			me.fireEvent(IBizEditForm.FORMSAVEERROR, me);
        			
        			action.failureType = 'SERVER_INVALID';
        			if(action.ret==10)
        			{
        				IBiz.confirm2($IGM('IBIZEDITFORM.SAVE2FAILED.TITLE',"保存错误信息"),$IGM('IBIZEDITFORM.SAVE2FAILED2.INFO',"保存数据发生错误,"+me.getActionErrorInfo(action)+',是否要重新加载数据？',[me.getActionErrorInfo(action)]),2,function (ret){
        					if(ret)
        						me.reload();
        				});
        			}
        			else
        			{
        				IBiz.alert($IGM('IBIZEDITFORM.SAVE2FAILED.TITLE',"保存错误信息"),$IGM('IBIZEDITFORM.SAVE2FAILED.INFO',"保存数据发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
        			}
        		}
        	);
    }, 
    onSaved:function(){
		var me = this;
	},
	reload:function(){
		var me=this;
		var field = me.findField('srfkey');
		var loadarg = {};
        if (field) {
        	loadarg.srfkey = field.getValue();
        	if(loadarg.srfkey.indexOf('SRFTEMPKEY:')==0) {
	           	 field = me.findField('srforikey');
	           	 if (field) {
	           		loadarg.srfkey = field.getValue();
	             }
            }
        }
		me.autoLoad(loadarg);
	},
    remove: function (arg) {
        var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        if (!arg.srfkey) {
            var field = me.findField('srfkey');
            if (field) {
                arg.srfkey = field.getValue();
            }
        }
       
        if (arg.srfkey == undefined || arg.srfkey == null || arg.srfkey == '') {
        	IBiz.alert($IGM('IBIZEDITFORM.REMOVEFAILED.TITLE',"删除错误信息"), $IGM('IBIZEDITFORM.UNLOADDATA','当前表单未加载数据！'),2);
            return;
        }
        $.extend(arg, { srfaction: 'remove' });
        me.ignoreUFI = true;
        me.load(arg,function (form, action) {
        	if(action.ret == 0){
        		me.setFieldAsyncConfig(action.config);
        		me.setFieldState(action.state);
            	me.fireEvent(IBizForm.FORMREMOVED);
        	}
        	me.ignoreUFI = false;
  		},
  		function (form, action) {
  			action.failureType = 'SERVER_INVALID';
  			IBiz.alert($IGM('IBIZEDITFORM.REMOVEFAILED.TITLE',"删除错误信息"),$IGM('IBIZEDITFORM.REMOVEFAILED.INFO',"删除数据发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
             me.ignoreUFI = false;
  		});
        
    },
    wfstart: function (arg) {
    	var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        if (!arg.srfkey) {
            var field = me.findField('srfkey');
            if (field) {
                arg.srfkey = field.getValue();
            }
            field = me.findField('srforikey');
            if (field) {
            	var v=field.getValue();
            	if(v && v!='')
            	{
            		arg.srfkey = v;
            	}
            }
        }
        if (arg.srfkey == undefined || arg.srfkey == null || arg.srfkey == '') {
            IBiz.alert($IGM('IBIZEDITFORM.WFSTARTFAILED.TITLE',"启动流程错误信息"), $IGM('IBIZEDITFORM.UNLOADDATA','当前表单未加载数据！'),2);
            return;
        }
        
        $.extend(arg, { srfaction: 'wfstart' });
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        
        me.load(arg,function (form, action) {
        	me.setFieldAsyncConfig(action.config);
			me.setFieldState(action.state);
			me.setDataAccAction(action.dataaccaction);
			me.fillForm(action.data);
			me.formDirty = false;
    	//	me.fireEvent(IBizForm.FORMLOADED);
    		me.fireEvent(IBizForm.FORMWFSTARTED);
    		me.ignoreUFI = false;
    		me.ignoreformfieldchange=false;
    		me.fireEvent(IBizForm.FORMFIELDCHANGED, null);
  		},
  		function (form, action) {
  			action.failureType = 'SERVER_INVALID';
			IBiz.alert($IGM('IBIZEDITFORM.WFSTARTFAILED.TITLE',"启动流程错误信息"),$IGM('IBIZEDITFORM.REMOVEFAILED.INFO',"启动流程发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
  			me.ignoreUFI = false;
  			me.ignoreformfieldchange=false;
  		});
    },
    wfsubmit: function (arg) {
        var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        var data = me.getValues();
        $.extend(arg, data);
        $.extend(arg, { srfaction: 'wfsubmit' });
        
//        if (!arg.srfkey) {
//            var field = me.findField('srfkey');
//            if (field) {
//                arg.srfkey = field.getValue();
//            }
//        }
        if (arg.srfkey == undefined || arg.srfkey == null || arg.srfkey == '') {
            IBiz.alert($IGM('IBIZEDITFORM.WFSUBMITFAILED.TITLE',"提交流程错误信息"),$IGM('IBIZEDITFORM.UNLOADDATA','当前表单未加载数据！'),2);
            return;
        }
        
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        
        me.load(arg,function (form, action) {
        	me.setFieldAsyncConfig(action.config);
			me.setFieldState(action.state);
			me.setDataAccAction(action.dataaccaction);
			me.fillForm(action.data);
			me.formDirty = false;
    //		me.fireEvent(IBizForm.FORMLOADED);
    		me.fireEvent(IBizForm.FORMWFSUBMITTED);
    		me.ignoreUFI = false;
    		me.ignoreformfieldchange=false;
    		me.fireEvent(IBizForm.FORMFIELDCHANGED, null);
  		},
  		function (form, action) {
  			action.failureType = 'SERVER_INVALID';
			IBiz.alert($IGM('IBIZEDITFORM.WFSUBMITFAILED.TITLE',"提交流程错误信息"),$IGM('IBIZEDITFORM.REMOVEFAILED.INFO',"工作流提交发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
  			me.ignoreUFI = false;
  			me.ignoreformfieldchange=false;
  		});
    },
    doUIAction: function(arg) {
    	var me = this;
    	if (!arg) arg = {};
    	$.extend(arg, {srfaction: 'uiaction'});
    	if (IBizApp_Data) {
    		arg.srfappdata = IBizApp_Data;
    	}
    	me.loadingTag = IBiz.beginload();	
    	IBiz.ajax({
    		url: me.config.url,
    		params: arg,
    		method: 'POST',
    		dataType: 'json',
    		success: function(data) {
    			IBiz.endload(me.loadingTag);
    			if (data.ret == 0) {
    				IBiz.processResultBefore(data);
    				me.fireEvent(IBizEditForm.UIACTIONFINISHED, me,data);
    				if (data.reloadData) {
    					me.reload();
    				}
    				if (data.info && data.info != '') {
    					IBiz.alert('',data.info,1);
    				}
    				IBiz.processResult(data);
    			} else {
    				IBiz.alert($IGM('IBIZEDITFORM.DOUIACTIONFAILED.TITLE',"界面操作错误信息"),$IGM('IBIZEDITFORM.DOUIACTIONFAILED.INFO',"操作失败,"+data.errorMessage,[data.errorMessage]),2);
    			}
    		},
    		failure: function(e) {
    			IBiz.endload(me.loadingTag);
    			IBiz.alert($IGM('IBIZEDITFORM.DOUIACTIONFAILED.TITLE',"界面操作错误信息"),$IGM('IBIZEDITFORM.DOUIACTIONFAILED2.INFO',"执行请求异常！"),2);
    		}
    	});
    },
    getFormType:function(){
    	return 'EDITFORM';
    }
});
$IRM('IBIZEDITFORM.UNLOADDATA','当前表单未加载数据！');
/*****************事件声明************************/
/**
 * 表单权限发生变化
 */
IBizEditForm.UIACTIONFINISHED = 'UIACTIONFINISHED';
/**
 * 表单保存之前触发
 */
IBizEditForm.FORMBEFORESAVE = 'FORMBEFORESAVE';
/**
 * 表单保存错误触发
 */
IBizEditForm.FORMSAVEERROR = 'FORMSAVEERROR';
/**
 * 
 */
var IBizFormDRPanel =  IBizField.extend({
	parentData: null,
	drController :null,
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		
		var form=this.getForm();
		form.on('formloaded', function (sender,data,e){
			var me=e.data;
			me.refreshDRUIPart();
			}, this);
		
		form.on('FORMSAVED', function (sender,data,e){
			var me=e.data;
			me.refreshDRUIPart();
		}, this);
		
		form.on(IBizEditForm.FORMBEFORESAVE, function (sender,data,e){
			var me=e.data;
			if(!me.saveDRData()){
				if(data){
					data.srfcancel=true;
					var mform =me.getForm();
					if(!mform.drpanels){
						mform.drpanels={};
					}
					var drpanel='panel'+me.getId();
					if(!mform.drpanels[drpanel]){
						mform.drpanels[drpanel]=0;
					}
				}
				return false;
			}
		}, this);
		
		var refreshItems = config.refreshitems;
		if(refreshItems && refreshItems!=''){
			var items = refreshItems.split(';');
			this.hookItems={};
			for(var i=0;i<items.length;i++){
				this.hookItems[items[i].toLowerCase()] = true;
			}
			form.on(IBizForm.FORMFIELDCHANGED,function (sender,data,e){
				var me=e.data;
				var fieldname = '';
				if (sender != null)
					fieldname = sender.getName();
				else
					return ;
				if(me.isRefreshItem(fieldname))
					me.refreshDRUIPart();
				}, this);
		}
		//界面加载起来
		var dritem = config.dritem;
		this.drController = form.getController().getController(form.getController().getCId2()+dritem.embedviewid);
		/*监控子数据保存*/
		this.drController.on('DRDATASAVED', function (sender,data,e){
			var me=e.data;
			var mform=me.getForm();
			var drpanel='panel'+me.getId();
			if(mform.drpanels){
				if(!mform.drpanels[drpanel]){
					mform.drpanels[drpanel]=1;
				}
			}
			var bOK=true;
			for(var key in mform.drpanels){
				var value = mform.drpanels[key];
				if(value==0){
					bOK=false;
					break;
				}
			}
			if(bOK){
				delete mform.drpanels;
				me.getForm().save2();
			}
		}, this);
		
//		//获取界面大小
//		if(config.height!=undefined && config.height>0){
//			if($.isFunction(this.drController.setSize)){
//				this.drController.setSize(undefined,config.height);
//			}
//		}
		if(!this.drController.isInited())
		{
			this.drController.asyncInit({parentMode:dritem.parentmode,parentData:this.parentData,renderTo:this.getId()});
			return;
		}
	}
	,getName:function()
	{
		return this.config.name;
	}
	,isRefreshItem:function(name){
		var me=this;
		if(!name || name==''){
			return false;
		}
		return me.hookItems[name.toLowerCase()];
	}
	
	, setParentData: function (pd) {
	    this.parentData = pd;
	}
	, getForm: function () {
	    var me = this;
	    return me.config.form;
	}
	,refreshDRUIPart: function () {
	    var me = this;
   
	    var form = me.getForm();
	    var field = form.findField('srfkey');
	    if(field==null)
	    {
	    	return;
	    }
	    var value = field.getValue();
	    
//	    if(value=="")
//	    {
//	       var block =$('#'+me.getUniqueId());
//	       Metronic.blockUI({
//               target: block ,
//               textOnly: true,
//               boxed: true,
//               message: $IGM('IBIZFORM.REFRESHDRUIPART.INFO','请先保存数据')
//           });
//	    	return;
//	    }
//	    else 
//	    {
//	    	Metronic.unblockUI('#'+me.getUniqueId());
//	    }
	    
	    me.parentData = { srfparentkey: value };
	    
	    var activeData = form.getActiveData();
	    activeData.srfparentkey = value;
	    activeData.srfparentdeid=activeData.srfdeid;
	    
	    delete activeData.srfkey;
	    delete activeData.srfdeid;
	    
        $.extend(me.parentData, {srfparentdata:JSON.stringify(activeData)});
 	    
//	    me.drController.setParentData(me.parentData);
//	    me.drController.refresh();
    	var intervalFunc = function() {
			if (me.drController.isInited()) {
				me.drController.setParentData(me.parentData);
				me.drController.refresh();
				clearInterval(interval);
				interval = null;
			}
		};
		var interval = setInterval(intervalFunc, 100);
	},
	/*保存关系数据，继续父数据保存，返回true,否则返回false*/
	saveDRData:function(){
		var me=this;
		if($.isFunction(me.drController.saveDRData)){
			return me.drController.saveDRData();
		}
		return true;
	}
	
});	
/**
 * 表单IFrame部件
 */
var IBizFormIFrame =  IBizField.extend({
	parentData: null,
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		
		var form=this.getForm();
		form.on('formloaded', function (sender,data,e){
			var me=e.data;
			me.refreshIFrame();
			}, this);
		
		form.on('formsaved', function (sender,data,e){
			var me=e.data;
			me.refreshIFrame();
			}, this);
		
		var refreshItems = config.refreshitems;
		if(refreshItems && refreshItems!=''){
			var items = refreshItems.split(';');
			this.hookItems={};
			for(var i=0;i<items.length;i++){
				this.hookItems[items[i].toLowerCase()] = true;
			}
			form.on(IBizForm.FORMFIELDCHANGED,function (sender,data,e){
				var me=e.data;
				var fieldname = '';
				if (sender != null)
					fieldname = sender.getName();
				else
					return ;
				if(me.isRefreshItem(fieldname))
					me.refreshIFrame();
				}, this);
		}
		
	}
	,getName:function()
	{
		return this.config.name;
	}
	,isRefreshItem:function(name){
		var me=this;
		if(!name || name==''){
			return false;
		}
		return me.hookItems[name.toLowerCase()];
	}
	
	, setParentData: function (pd) {
	    this.parentData = pd;
	}
	, getForm: function () {
	    var me = this;
	    return me.config.form;
	}
	,refreshIFrame: function () {
	    var me = this;
   
	    var form = me.getForm();
	    var field = form.findField('srfkey');
	    if(field==null)
	    {
	    	return;
	    }
	    var value = field.getValue();
	    me.parentData = { srfparentkey: value };
	    
	    var activeData = form.getActiveData();
	    var url=me.config.url;
	    for (var key in activeData) 
		{  
			 var fieldValue=  activeData[key] ;
			 if(fieldValue)
			 {
				 fieldValue=encodeURI(fieldValue);
				 url = url.replace(new RegExp('{'+key+'}','g'),fieldValue);
			 }
		} 
	    if($('#'+me.getId()).attr("src") == url)
	    	return;
	    $('#'+me.getId()).attr("src",url); 
	}
});	
/**
 * 
 */
var IBizFormRawItem =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.getUniqueId());
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		var me = this;
		me.disabled = disabled;
	},
	/**
	 * 隐藏控件
	 */
	setHidden:function(hidden){
		var me = this;
		me.hidden = hidden;
		if(me.field){
			if(hidden){
				me.field.addClass('hidden');
			}else
			{
				me.field.removeClass('hidden');
			}
		}
	}
});
/**
 * 
 */
var IBizFormButton =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.getUniqueId());
		me.field.click(function(e){
			me.onClick();
		});
	},
	onClick:function(){
		var me = this;
		if(me.config.uiaction && me.config.actiontype=='UIACTION'){
			var uiaction = me.getForm().getController().getUIAction(me.config.uiaction.tag);
			me.getForm().getController().doUIAction(uiaction);
			return;
		}
		if(me.config.fiupdate && me.config.actiontype=='FIUPDATE'){
			  me.getForm().updateFormItems({srfufimode:me.config.fiupdate.tag});
			return;
		}
	}
});
/**
 * 单个图片控件
 */
var IBizPictureField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.uploapath = BASEURL+'/ibizutil/uploadfile.jsp?';
		me.exportpath = BASEURL+'/ibizutil/exportfile.jsp?';
		
		me.field = $('#'+this.getUniqueId());
		me.image = me.field.find('.ibiz-id-image');
		me.uploadbtn = me.field.find('.ibiz-id-upload');
		me.removebtn = me.field.find('.ibiz-id-remove');
		
		if(config.width && config.width>0){
			//me.field.width(config.width);
			me.image.width(config.width-40);
		}
		if(config.height && config.height>0){
			//me.field.height(config.height);
			me.image.height(config.height);
		}
		
		if(me.uploadbtn){
			me.uploadbtn.click(function(){
				me.onUploadBtnClick();
			});
		}
		if(me.removebtn){
			me.removebtn.click(function(){
				me.onRemoveBtnClick();
			});
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		
		if(me.uploadbtn){
			me.uploadbtn.prop("disabled", disabled);
			me.uploadbtn.attr('disabled',disabled);
		}
		if(me.removebtn){
			me.removebtn.prop("disabled", disabled);
			me.removebtn.attr('disabled',disabled);
		}	
	},
	onValueChanged:function(oldVal,newVal){
		arguments.callee.$.onValueChanged.call(this,oldVal,newVal);
		var me = this;
		if(newVal){
			me.image.attr('src',me.exportpath +'fileid='+newVal);
		}else{
			me.image.attr('src','');
		}
	},
	onUploadBtnClick:function(){
		var me = this;
		if(me.isDisabled())
			return;
		
		if(window.ActiveXObject && !$.support.leadingWhitespace)
			//if(true)
		{
			me.openUploadView();
		}
		else
		{
			var file = $('<INPUT type="file" name="files">');
			file.change(function(){
				var filename=file.val();
				if(filename=='')
					return;
				
				$.ajaxFileUpload
		        (
		            {
		                url: me.uploapath, //用于文件上传的服务器端请求地址
		                secureuri: false, //是否需要安全协议，一般设置为false
		                fileElement: file, //文件上传域的ID
		                dataType: 'json', //返回值类型 一般设置为json
		                success: function (data, status)  //服务器成功响应处理函数
		                {
		                	if(data && typeof(data) === 'object'){
		    					if(status != 'success'){
		    						IBiz.alert($IGM('IBIZPICTUREFIELD.ONUPLOADBTNCLICK.TITLE','上传失败'),$IGM('IBIZPICTUREFIELD.ONUPLOADBTNCLICK.INFO','上传文件失败,'+data.message,[data.message]),2);
		    					}else{
		    						me.setValue(data.files[0].id);
		    					}
		    				}else{
		    					IBiz.alert($IGM('IBIZPICTUREFIELD.ONUPLOADBTNCLICK.TITLE','上传失败'),$IGM('IBIZPICTUREFIELD.ONUPLOADBTNCLICK.INFO','上传文件失败,'+data.message,[data.message]),2);
		    				}
		                },
		                error: function (data, status, e)//服务器响应失败处理函数
		                {
		                	IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误'),$IGM('IBIZPICTUREFIELD.AJAX.INFO','执行请求发生异常'),2);
		                }
		            }
		        );
			});
			file.click();
		}
	},
	onRemoveBtnClick:function(){
		var me = this;
		if(me.isDisabled())
			return;
		me.setValue('');
	},
	uploadCallback:function(win){
		var me = win.opener;
		var data = win.files;
		if(data && data.length>0){
			me.setValue(data[0].id);
		}
	},
	openUploadView:function(){
		var me = this;
		var win = $.getIBizApp().createWindow({});
		win.opener = me;
		win.title = $IGM('IBIZPICTUREFIELD.OPENUPLOADVIEW.INFO','上传文件');
		win.height = 500;
		win.width = 600;
		win.url = BASEURL +'/ibizutil/fileuploadview.jsp?'+$.param({windowid:win.getId()});
		win.callback = me.uploadCallback;
        win.openModal(window);
	}	
});	
/**
 * 单选框控件
 */
var IBizPictureUploaderField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+this.getUniqueId());
		me.containerEL = me.field.find('.ibiz-fileupload-container');
		me.container = $(me.containerEL);
		me.uploadbtnEL = me.field.find('.ibiz-fileupload-upload');
		me.uploadbtn = $(me.uploadbtnEL);
		
		me.uploadbtn.click(function(){
			me.openUploadView('');
		});
	},
	getValue:function(){
		if(this.value){
			try 
			{ 
				if(this.value.length==0)
					return '';
			}
			catch (e)
			{
				
			}
			return JSON.stringify(this.value);
		}
		return '';
	},
	setValue:function(value){
		var me = this;
		if(value && value !== ''){
			if(typeof(value) !== 'object'){
				try 
				{ 
					value = JSON.parse(value);
				}catch (e) 
				{ 
					value = [];
				}
			}
		}else{
			value = [];
		}
		
		
		var oldVal = me.value;
		me.value = value;
		me.render(me.value);
		if(oldVal != value)
			me.onValueChanged(oldVal,me.value);
	},
	render:function(files){
		var me = this;
		if(files){
			var items = [];
			$.each(files,function(index,file){
				var id = file.id;
				var text = file.name;
				
				var item = '<li data-ibiz-fileid="'+id+'" class="ibiz-fileupload-item select2-search-choice ms-hover">';
				item +='<div>'+text+'</div>';
				item +='<a href="#" class="ibiz-fileupload-remove select2-search-choice-close" tabindex="-1"></a>';
				item +='</li>';
			
				items.push(item);
			});
			me.container.html(items.join(''));
			me.container.find('.ibiz-fileupload-remove').each(function(index,item){
				$(item).click(function(){
					me.removeFile($(this).parent().attr('data-ibiz-fileid'));
				});	
			});
			me.container.find('.ibiz-fileupload-item').each(function(index,item){
				$(item).dblclick(function(){
					me.openFile($(this).attr('data-ibiz-fileid'));
				});	
			});
		}else{
			me.container.html('');
		}
	},
	removeFile:function(fileid){
		var me = this;
		var values = [];
		if(me.value){
			$.each(me.value,function(index,file){
				if(file.id != fileid){
					values.push(file);
				}
			});
		}
		me.setValue(values);
	},
	openFile:function(fileid){
		window.open(BASEURL+'/../ibizutil/exportfile.jsp?fileid='+fileid,'_blank');
	},
	uploadCallback:function(win,data){
		var me = win.opener;
		if(data){
			if(me.value){
				var newVal = $.merge(me.value,data);
				me.setValue(newVal);
			}else{
				me.setValue(data);
			}
		}
	},
	openUploadView:function(codelist){
		var me = this;
		
		var win = $.getIBizApp().createWindow({});
		win.opener = me;
		win.title = $IGM('IBIZPICTUREFIELD.OPENUPLOADVIEW.INFO','上传文件');
		win.height = 500;
		win.width = 600;
		win.url = BASEURL +'/util/fileuploadview.jsp?'+$.param({windowid:win.getId()});
		win.callback = me.uploadCallback;
		win.openModal(window);
	}	
	
	
});	
/**
 * 数据关系区
 */
var IBizDRBar = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		//构建对象
		 $('#'+config.id).jstree({
		    'core' : {
		    	'multiple' : false,
		        'data' : {
		        	'url' : config.url,
		           'data' : function (node) {
		                return { 'id' : node.id, srfaction: 'fetch',srfappdata:IBizApp_Data,srfrender:'JSTREE' };
		            }
		        }
		    }
		 });
		 $('#'+config.id).on('changed.jstree', this,function (e, data) {
			    var i, j, r = [];
			    for(i = 0, j = data.selected.length; i < j; i++) {
			      r.push(data.instance.get_node(data.selected[i]));
			    }
			    e.data.onSelectionChange(data.instance,r,e);
			  });
	}
	,parentData:null
	,getDRTab:function()
	{
		return this.config.tabctrl;
	}
	,onSelectionChange:function(tree,records,eOpts){
		
		var me=this;
		if(records==null||records.length==0)
			return;
		
		var record=records[0];
		var dritem = record.original.dritem;
		if(dritem==null)
			return;
		
		var controller = me.getController();
		var layoutcard = me.getDRTab();
//		//判断有误对象
		if(record.id=='form')
		{
			layoutcard.setActiveItem(0);
			/*if (Ext.isFunction(controller.showCommandBar)){
				controller.showCommandBar(true);
			}*/
			return;
		}
	
		if(dritem.viewid == undefined || dritem.viewid=='')
			return;
		
		var parentKey='';
		if(me.parentData){
			parentKey = me.parentData.srfparentkey;
		}
		if(!parentKey || parentKey=='')
		{
			layoutcard.setActiveItem(0);
			IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDRBAR.ONSELECTIONCHANGE.INFO','请先建立主数据'),0);
			return;
		}
		
		var parentData = {};
		var viewParam = dritem.viewparam;
		if(!viewParam)
			return;
		if(true)
		{
			$.extend(parentData, viewParam);
			$.extend(parentData, me.parentData);
		}
		
		var viewItem = controller.getDRItemView(dritem);
		if(viewItem==null)
			return ;
		
		var itemid=layoutcard.id + '_'+ dritem.viewid.replace(new RegExp(':','g'),'_');
		layoutcard.setActiveItem(itemid);
		
		var subController = controller.getController(controller.getCId2()+viewItem.embedviewid);
		if(!subController.isInited())
		{
			subController.asyncInit({parentMode:viewParam,parentData:parentData,renderTo:itemid,subApp:viewItem.subapp,autoLayout:false});
			return;
		}
		
		subController.setParentData(parentData);
		subController.refresh();
		
	}
	
	,setParentData:function(pd){
		this.parentData=pd;
	}
});
/**
 * 分页控件
 */	
var IBizTab =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.config.id);
		me.field.find('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
			me.fireEvent(IBizTab.SELECTIONCHANGE,me,e);
		});
	},
	setActiveItem:function(index)
	{
		if($.isNumeric( index ))
		{
			$('#'+this.config.id+' li:eq('+index.toString()+') a').tab('show');
		}
		else
		{
			$('#'+this.config.id+' a[href="#'+index+'"]').tab('show');
		}
	},
	setSize:function(width,height){
		var me = this;
		$('#'+me.id).width(width);
		$('#'+me.id).height(height);
		/*if(me.activeSubController != null){
			me.activeSubController.setSize(width,height);
		}*/
	}
	,getHeight:function(){
		var me = this;
		return $('#'+me.id).height();
	}
	,getWidth:function(){
		var me = this;
		return $('#'+me.id).width();
	}
});
/*****************事件声明************************/
/**
 * 选择变化
 */
IBizTab.SELECTIONCHANGE = "SELECTIONCHANGE";
/**
 * 分页控件
 */	
var IBizExpTab =  IBizTab.extend({
	setActiveSubController:function(subController)
	{
		var me=this;
		me.activeSubController = subController;
		if(me.activeSubController != null){
			me.activeSubController.setSize(me.getWidth(),me.getHeight());
		}
	}
	,setSize:function(width,height){
		arguments.callee.$.setSize.call(this,width,height);
		var me = this;
		if(me.activeSubController != null){
			me.activeSubController.setSize(width,height);
		}
	}
});
/*****************事件声明************************/
/**
 * 导航栏
 */
var IBizExpBar = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		//构建对象
		 $('#'+config.id).jstree({
		    'core' : {
		    	'multiple' : false,
		        'data' : {
		        	'url' : config.url,
		           'data' : function (node) {
		                return { 'id' : node.id, srfaction: 'fetch',srfappdata:IBizApp_Data,srfrender:'JSTREE' };
		            }
		        }
		    }
		 });
		 $('#'+config.id).on('changed.jstree', this,function (e, data) {
			 	var me=e.data;
			    var i, j, r = [];
			    for(i = 0, j = data.selected.length; i < j; i++) {
			      r.push(data.instance.get_node(data.selected[i]));
			    }
			    me.onSelectionChange(data.instance,r,e);
			  });
		
		 $('#'+config.id).on('loaded.jstree', this,function (e, data) {
			   var me=e.data;
			  });
		 
		 
	}
	,parentData:null
	,getExpTab:function()
	{
		return this.config.tabctrl;
	}
	,onSelectionChange:function(tree,records,eOpts){
		
		var me=this;
		if(records==null||records.length==0)
			return;
		
		var record=records[0];
		var expitem = record.original.expitem;
		if(expitem==null)
			return;
		
		var controller = me.getController();
		var layoutcard = me.getExpTab();
	
		if(expitem.viewid == undefined || expitem.viewid=='')
			return;
			
		var parentData = {};
		var viewParam = expitem.viewparam;
		if(!viewParam)
			return;
		if(true)
		{
			$.extend(parentData, viewParam);
			$.extend(parentData, me.parentData);
		}
		
		var viewItem = controller.getExpItemView(expitem);
		if(viewItem==null)
			return ;
		
		var itemid=layoutcard.id + '_'+ expitem.viewid.replace(new RegExp(':','g'),'_');
		layoutcard.setActiveItem(itemid);
		
		var subController = controller.getController(controller.getCId2()+viewItem.embedviewid);
		if(!subController.isInited())
		{
			subController.asyncInit({parentMode:viewParam,parentData:parentData,renderTo:itemid});
			return;
		}
		
		subController.setParentData(parentData);
		subController.refresh();
		
		
//		var item = layoutcard.getComponent(itemid);
//		var bRefresh = true;
//		if(item==null){
//			
//			var viewParam = expitem.viewparam;
//			if(viewParam==null)
//				return;
//			console.log(viewParam);
//			//建立对象
//			var viewItem = controller.getExpItemView(expitem);
//			if(viewItem==null)
//			{
//				Ext.Msg.alert(Ext.String.format('没有配置对应的关系界面，标识值为[{0}]',expitem.viewid));
//				return;
//			}
//			console.log('create '+ viewItem.view );
//			item = Ext.create(viewItem.view, {id:itemid,border:false,parentMode:viewParam,parentData:parentData});
//			layoutcard.add(item);
//			bRefresh = false;
//		}
//		layoutcard.setActiveItem(itemid);
//		if (Ext.isFunction(controller.showCommandBar)){
//			controller.showCommandBar(false);
//		}
//		console.log(item);
//		var childController=item.lookupController();
//		console.log(childController);
//
//		if(bRefresh){
//			childController.setParentData(parentData);
//			childController.refresh();
//		}
	}
	
	,setParentData:function(pd){
		this.parentData=pd;
	}
//	,getContentPanel:function(){
//		var controller = this.lookupController();
//		var layoutcard = controller.lookupReference(this.contentpanel);
//		return layoutcard;
//	},
//	onStoreLoad: function (store, records, successful, eOpts) {
//		  var me=this;
//	      console.log('onStoreLoad ' + (successful ? 'yes' : 'false'));
//	      if (!successful) {
//	    	  Ext.Msg.alert("加载关系视图数据发生错误");
//	       }
//	      else
//	    	  {
//	    	  	me.getRootNode().expand();
//	    	  }
//	},
		
});
/**
 * 导航栏
 */
var IBizExpBar2 = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.container = $('#'+config.id);
		
		me.container.addClass('');
		me.items = {};
		me.itemELMap = {};
		me.selectitem = null;
		
		var params = {srfaction: 'fetch',srfappdata:IBizApp_Data,srfrender:'JSTREE'};
		
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			success:function(data){
				me.renderData(data);
			},failure:function(data){
				IBiz.alert($IGM('IBIZEXPBAR.CONSTRUCT.TITLE','加载失败'),$IGM('IBIZEXPBAR.CONSTRUCT.INFO','加载菜单失败,'+data,[data]),2);
			}
		});
		if(config.countertag){
			me.uiCounter = me.getController().getUICounter(config.countertag);
			if(me.uiCounter){
				me.uiCounter.on(IBizCounter.COUNTERCHANGED,function(sender,args,e){
					e.data.onCounterChanged();
				},me);
			}
		}
	},
	onCounterChanged:function(){
		var me = this;
		if(!me.uiCounter){
			return;
		}
		var data = me.uiCounter.getData();
		if(!data){
			return;
		}
		var bNeedReSelect = false;
		var firstItem = null;
		$.each(me.itemELMap,function(id,item){
			var itemdata = me.items[id];
			if(!firstItem){
				firstItem = itemdata;
			}
			var counterid = itemdata.counterid;
			var countermode = itemdata.countermode; 
			
			var count = data[counterid];
			if(!count){
				count = 0;
			}
			me.changeItemCount(item,count);
			if(count == 0 && countermode && countermode == 1){
				item.addClass('hidden');
				//判断是否选中列，如果是则重置选中
				if(me.selectitem  && me.selectitem.id == itemdata.id ){
					bNeedReSelect = true;
					item.removeClass('active');
				}
			}else{
				item.removeClass('hidden');
			}
		});
		if(bNeedReSelect){
			me.selectitem = firstItem;
			var item = me.itemELMap[firstItem.id];
			
			item.addClass('active');
			me.onSelectionChange(null,[me.selectitem],null);
		}
	},
	renderData:function(data){
		var me = this;
		var items = me.renderTreeMenu(data,0);
		me.container.html('<ul class="inbox-nav margin-bottom-10">'+items.join('')+'</ul>');
		
		me.container.find('.inbox').each(function(idx,item){
			me.itemELMap[$(item).attr('ibiz-id')] = $(item);
			$(item).click(item,function (e) {
				me.container.find('.inbox-nav > li.active').removeClass('active');
				$(this).addClass('active');
				me.onItemClick($(this));
	        });
		});
		//设置默认选中，
		var bHasDefault = false;
		var defaultItem;
		var firstItem;
		var activeItem;
		var activeItemId = me.config.activeitem;
		$.each(me.items,function(idx,item){
			if(!firstItem){
				firstItem = item;
			}
			if(item.selected){
				bHasDefault = true;
				defaultItem = item;
			}
			if(activeItemId){
				if(item.id==activeItemId)
					activeItem=item;
			}
		});
		if(!bHasDefault){
			defaultItem = firstItem;
		}	
		if(activeItem){
			defaultItem=activeItem;
		}
		var id = defaultItem.id;
		var el = me.itemELMap[id];
		if(el){
			el.addClass('active');
			me.onItemClick(el);
		}
		me.onCounterChanged();
	},
	changeItemCount:function(item,count){
		if(!item){
			return;
		}
		var counter = item.find('.ibiz-counter');
		if(counter){
			if(count>0){
				counter.html(count);
				counter.removeClass('hidden');
			}else{
				counter.addClass('hidden');
			}
		}
	},
	onItemClick:function(item){
		var me = this;
		
		var id = item.attr('ibiz-id');
		var item = me.items[id];
		
		me.selectitem = item;
		
		me.onSelectionChange(null,[me.selectitem],null);
	},
	/**
	 * 绘制树菜单
	 * @param data 数据
	 */
	renderTreeMenu:function(items,level){
		var me = this;
		var  menuitem = [];
		
		if(items && items.length>0)
		{
			var sep = [];
			for(var i= 0;i<level;i++){
				sep.push('&nbsp;&nbsp;');
			}
			sep = sep.join('');
			
			$.each(items,function(index,item){
				var children = item.children;
				
				me.items[item.id] = item;
				var style = '';
				if(level == 0){
					style = 'font-weight:bold;border-left:4px solid #1BBC9B;';
				}
				
				if(children){
					//先输出自身，
					menuitem.push('<div class="inbox list-group" ibiz-id="'+item.id+'">');
					menuitem.push('<a href="javascript:;" data-title="Inbox" style="'+style+'" class="list-group-item">');
					menuitem.push(sep+item.text+'<b></b>');
					menuitem.push('<span class="badge badge-default ibiz-counter hidden"></span>');
					menuitem.push('</a>');
					menuitem.push('</div>');
					
					//输出子节点
					var subitem = me.renderTreeMenu(children,(level+1));
					menuitem = menuitem.concat(subitem);  
				}else{
					menuitem.push('<div class="inbox list-group" ibiz-id="'+item.id+'">');
					menuitem.push('<a href="javascript:;" data-title="Inbox" style="'+style+'" class="list-group-item">');
					menuitem.push(sep+item.text+'<b></b>');
					menuitem.push('<span class="badge badge-default ibiz-counter hidden"></span>');
					menuitem.push('</a>');
					menuitem.push('</div>');
				}
			});
		}
		return menuitem;
	},
	parentData:null
	,getExpTab:function()
	{
		return this.config.tabctrl;
	}
	,onSelectionChange:function(tree,records,eOpts){
		
		var me=this;
		if(records==null||records.length==0)
			return;
		
		var record=records[0];
		var expitem = record.expitem;
		if(expitem==null)
			return;
		
		var controller = me.getController();
		var layoutcard = me.getExpTab();
	
		if(expitem.viewid == undefined || expitem.viewid=='')
			return;
			
		var parentData = {};
		var viewParam = expitem.viewparam;
		if(!viewParam)
			return;
		if(true)
		{
			$.extend(parentData, viewParam);
			$.extend(parentData, me.parentData);
		}
		
		var viewItem = controller.getExpItemView(expitem);
		if(viewItem==null)
			return ;
		
		var itemid=layoutcard.id + '_'+ expitem.viewid.replace(new RegExp(':','g'),'_');
		layoutcard.setActiveItem(itemid);
		
		var subController = controller.getController(controller.getCId2()+viewItem.embedviewid);
		
		me.activeSubController = subController;
		layoutcard.setActiveSubController(subController);
		if(!subController.isInited())
		{
			subController.asyncInit({parentMode:viewParam,parentData:parentData,renderTo:itemid});
			return;
		}
		
		subController.setParentData(parentData);
		subController.refresh();
	}
	
	,setParentData:function(pd){
		this.parentData=pd;
	}	
	
	
});
/**
 * 多视图面板
 */	
var IBizViewPanel =  IBizTab.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
	
});
/**
 * 数据看板
 */
var IBizDashboard = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		 
	}
	
});
/**
 * 图表
 */
var IBizChart = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		me.chart = echarts.init(document.getElementById(this.getId()));
		me.chart.on('click',function(params){
			me.fireEvent(IBizChart.CLICK,me,params);
		});
		me.chart.on('dblclick',function(params){
			me.fireEvent(IBizChart.DBLCLICK,me,params);
		});
	},
	buildChart:function(ec){
		var me=this;
		
		var params={};
		me.fireEvent(IBizChart.BEFORELOAD,me,params);
		params.srfrender='ECHARTS3';
		params.srfaction = 'FETCH';
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			success:function(data){
				IBiz.endload(me.loadingTag);
				if(data.ret == 0){
					//呼出事件
					setTimeout(function(){
						me.fireEvent(IBizChart.LOADED,me,data);
			        }, 1);
					me.renderData(data);
					
				}else{
					IBiz.alert($IGM('IBIZCHART.BUILDCHART.TITLE','加载失败'),$IGM('IBIZCHART.BUILDCHART.INFO','加载数据失败,'+data.info,[data.info]),2);
				}	
			},failure:function(data){
				IBiz.endload(me.loadingTag);
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZCHART.AJAX.INFO','执行请求发生异常'),2);
			}
		});
	},
	load:function()
	{
		var me=this;
		me.buildChart();
	},
	renderData:function(data){
		var me = this;
		var opt = null;
		if(me.config.render){
			opt = me.config.render(data.items,data,me);
		}
		else
		{
			opt = {};
			if(me.config.baseopt)
				$.extend(opt, me.config.baseopt);
			if(data.data)
				$.extend(opt, data.data);
		}
		me.chart.setOption(opt,true);
	}
	,setSize:function(width,height){
		var me = this;
		var chart=$('#'+this.getId());
		chart.height(height);
		me.chart.resize();
	}
	,getChart:function(){
		var me=this;
		return me.chart;
	}
});
/*****************事件声明************************/
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizChart.BEFORELOAD = 'BEFORELOAD';
/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizChart.LOADED = 'LOADED';
/**
 * 双击
 */
IBizChart.DBLCLICK = 'DBLCLICK';
/**
 * 单击
 */
IBizChart.CLICK = 'CLICK';
/**
 * 报表框架
 */
var IBizReportPanel = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
	},
	buildReport:function(ec){
		var me=this;
		
		var params={};
		me.fireEvent(IBizReportPanel.BEFORELOAD,me,params);
		
		delete params['srfaction'];
		params['srfreportid']=me.config.reportid;
		var repframe = $('#'+this.getId());
		if(repframe[0])
		{
			var viewurl=me.config.reporturl;
			if(!viewurl||viewurl==''){
				viewurl = BASEURL+'/ibizutil/report.pdf';
			}
			else
			{
				viewurl = BASEURL+viewurl;
			}
			viewurl = viewurl + (viewurl.indexOf('?')==-1?'?':'&') + $.param(params);
			repframe.attr('src', viewurl);  
		}
			
	},
	load:function()
	{
		var me=this;
		me.buildReport();
	}
	,setSize:function(width,height){
		var me = this;
		var chart=$('#'+this.getId());
		chart.height(height);
	}
//	,getChart:function(){
//		var me=this;
//		return me.chart;
//	}
});
/*****************事件声明************************/
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizReportPanel.BEFORELOAD = 'BEFORELOAD';
/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizReportPanel.LOADED = 'LOADED';
/**
 * 列表
 */
var IBizList = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.reload();
		if(me.timer >1000){
			setInterval(function(){me.reload();},me.timer);
		}
	},
	renderData:function(data){
		var me = this;
		var html;
		if(me.config.render){
			html = me.config.render(data.items,data,me);
		}	
		if(html){
			$('#'+me.getId()).html(html);
		}
		me.initSlimScroll('.scroller');
		$('#'+me.getId()).find(".ibiz-listrefresh").click(function(e){
			me.reload();
		})
		
	},
	reload:function(){
		var me = this;
		var url = me.config.url;
		IBiz.ajax({url:url,
			params:{srfaction:'FETCH'},
			method:'POST',
			success:function(data){
				if(data.ret == 0){
					if(data.items){
						me.renderData(data);
					}
				}else{
					IBiz.alert($IGM('IBIZLIST.RELOAD.TITLE','加载失败'),$IGM('IBIZLIST.RELOAD.INFO','加载数据失败,'+data.info,[data.info]),2);
					
				}	
			},failure:function(data){
				$('#'+me.getId()).html($IGM('IBIZLIST.RELOAD.TITLE','加载失败'));
				//IBiz.alert('加载数据失败',data,2);
			}
		});
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
	}
});
/**
 * 数据视图
 */
var IBizDataView = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		
		var me = this;
		me.container = $('#'+config.id);
		me.container.addClass('tiles');
		me.selections = [];
		me.itemMap = {};
		
		IBiz.ajax({url:me.config.url,
			params:{srfaction:'FETCH'},
			method:'POST',
			success:function(data){
				if(data && data.ret == 0){
					me.onDataLoaded(data.items);
				}else{
					IBiz.alert($IGM('IBIZDATAVIEW.CONSTRUCT.TITLE','加载失败'),$IGM('IBIZDATAVIEW.CONSTRUCT.INFO','加载数据失败,'+data.info,[data.info]),2);
				}
			},failure:function(data){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDATAVIEW.AJAX.INFO','执行请求发生异常'),2);
			}	
		});
	},
	onDataLoaded:function(items){
		var me = this;
		me.renderData(items);
	},
	/**
	 * 设置选中数据
	 * @param selections 
	 */
	setSelection:function(selections){
		
	},
	/**
	 * 获取选中数据
	 */
	getSelection:function(){
		var me = this;
		
		return me.selections;
	},
	renderData:function(items){
		var me = this;
		
		if(!items){
			return;
		}
		var html = [];
		$.each(items,function(idx,item){
			me.itemMap[item.srfkey] = item;
			
			var tmp = me.renderRow(item,idx);
			
			html = html.concat(tmp); 
		});
		me.container.html(html.join(''));
		
		var _time = null;
		
		me.container.find('.ibiz-id-tile').click(function(e){
			clearTimeout(_time);
			var item = $(this);
            _time = setTimeout(function(){
            	me.container.find('.tile').removeClass('selected');
            	var id =item.attr('data-ibiz-id');
            	item.find('.tile').addClass('selected');
            	
            	me.selections =[me.itemMap[id]];
            	me.fireEvent(IBizDataView.SELECTIONCHANGE, me,me.selections);
            }, 200);
		});
		me.container.find('.ibiz-id-tile').dblclick(function(e){
			 clearTimeout(_time);
			 me.container.find('.tile').removeClass('selected');
			 var id = $(this).attr('data-ibiz-id');
			 $(this).addClass('selected');
			 
			 me.selections =[me.itemMap[id]];
			 
			 me.fireEvent(IBizDataView.ROWDBLCLICK, me,me.itemMap[id]);
		});
	},
	renderRow:function(row,idx){
		var me = this;
		
		var html = [];
		html.push('<div class="ibiz-id-tile" data-ibiz-id="'+row.srfkey+'">')
		
		if(me.config.render){
			html.push(me.config.render(row,idx));
		}else{
			html.push('<div class="tile bg-purple-studio">');
			html.push('	<div class="tile-body">');
			html.push('		<i class="fa fa-bars"></i>');
			html.push('	</div>');
			html.push('	<div class="tile-object">');
			html.push('		<div style="text-align:center;">'+row.srfmajortext+'</div>');
			html.push('	</div>');
			html.push('</div>');
		}
		
		html.push('</div>');
		
		return html;
	}
	,
	/**
	 * 加载
	 */
	load:function(){
		var me=this;
		
	}
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
IBizDataView.SELECTIONCHANGE = 'SELECTIONCHANGE';
/**
 * 双击行
 */
IBizDataView.ROWDBLCLICK = 'ROWDBLCLICK';
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataView.BEFORELOAD = 'BEFORELOAD';
/**
 * 加载完成<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizDataView.LOADED = 'LOADED';
/**
 * 门户部件
 */
var IBizPortlet = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		if(config.timer >1000){
			setInterval(function(){me.reload();},config.timer);
		}
	},
	reload:function(){
		
	}
});
var IBizChartPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.chart = new IBizChart({ctrler:this.getController(),id:this.getId()+'_chart',url:this.getController().getBackendUrl()+'srfctrlid='+this.getName()+'_chart&'});
	}
	
});
var IBizListPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		config.listcfg.ctrler = me.config.ctrler;
		me.listctrl = new IBizList(config.listcfg);
	},
	reload:function(){
		var me=this;
		me.listctrl.reload();
	}
});
var IBizCustomPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});
var IBizHtmlPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});
var IBizViewPortlet = IBizPortlet.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}
});
/**
 * 拾取数据视图面板
 */	
var IBizPickupViewPanel =  IBizViewPanel.extend({
	parentData: null,
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		//加载默认视图
		for(var i=0;i<10;i++){
			var viewid='pickupviewpanel'+((i==0)?'':i.toString());
			var viewitem = this.getController().getPickupViewItem({viewid:viewid});
			if(viewitem!=null){
				me.activeViewItem(viewid);
				return;
			}
		}
	},
	setSize:function(width,height){
		var me = this;
		$('#'+me.id+'_pickupviewpanel').width(width);
		$('#'+me.id+'_pickupviewpanel').height(height);
		if(me.activeSubController != null){
			me.activeSubController.setSize(width,height);
		}
	},
	/**
	 * 激活视图
	 */
	activeViewItem:function(viewid)
	{
		var me=this;
		var controller = this.getController();
		var viewitem = controller.getPickupViewItem({viewid:viewid});
		var itemid=this.getId() + '_'+ viewid.replace(new RegExp(':','g'),'_');
		
		me.setActiveItem(itemid);
		var subController = controller.getController(controller.getCId2()+viewitem.embedviewid);
		
		me.activeSubController = subController;
		
		if(!subController.isInited())
		{
			if(controller.getViewParam().srfreferdata)
			{
				subController.getViewParam().srfreferdata = controller.getViewParam().srfreferdata;
			}
			
			if($.isFunction(controller.isEnableMultiSelect) && $.isFunction(subController.setEnableMultiSelect)){
				subController.setEnableMultiSelect(controller.isEnableMultiSelect());
			}
			subController.asyncInit({parentData:me.parentData,renderTo:itemid,referData:controller.getReferData()});
			subController.on(IBizPickupViewPanel.SELECTIONCHANGE, me.onSelectionChange, me);
			subController.on(IBizPickupViewPanel.DATAACTIVATED, me.onDataActivated, me);
			return;
		}
		subController.setParentData(me.parentData);
		subController.refresh();
		
	},
	getAllData:function(){
		var me = this;
		
		if(me.activeSubController){
			return me.activeSubController.getAllData();
		}
		
		return [];
	},
	onSelectionChange: function (item,args,e) {
	    var me = e.data;
	    me.fireEvent(IBizPickupViewPanel.SELECTIONCHANGE, me, args);
	},
	onDataActivated: function (item, args,e) {
		var me = e.data;
	    me.fireEvent(IBizPickupViewPanel.DATAACTIVATED, me, args);
	}, 
	setParentData: function (pd) {
	    var me=this;
		me.parentData = pd;
	    if(me.activeSubController)
	    {
	    	var subController = me.activeSubController;
	    	subController.setParentData(me.parentData);
	    	subController.refresh();
	    }
	    else
	    	{
	    	
	    	}
	}, 
	refreshViewPanel: function () {
	    var me = this;
	    if(me.activeSubController)
	    {
	    	 me.activeSubController.refresh();
	    }	
	}	
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
IBizPickupViewPanel.SELECTIONCHANGE = 'SELECTIONCHANGE';
/**
 * 双击行
 */
IBizPickupViewPanel.DATAACTIVATED = 'DATAACTIVATED';
/**
 * 树部件
 */
var IBizTree = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		me.catalog='';
		$('#'+config.id).css("overflow","auto");
		//构建对象
		 $('#'+config.id).jstree({
		    'core' : {
		    	'multiple' : false,
		        'data' : {
		        	'url' : config.url,
		        	'type':'POST',
		        	'data' : function (node) {
		        	   var viewParam = me.getController().getViewParam();
		        	   if(!viewParam)
		        		   viewParam={};
		                return { 'srfnodeid' : node.id, srfaction: 'fetch',srfappdata:IBizApp_Data,srfrender:'JSTREE',srfcatalog:me.catalog,srfviewparam:JSON.stringify(viewParam) };
		            }
		        }
		    }
		    ,"plugins": ["types", "contextmenu"]
		    ,"contextmenu":{"items": function (node){
		    		var opt={node:node,menu:null};
		    		me.fireEvent(IBizTree.CONTEXTMENU,me,opt);
		    		if(opt.menu){
		    			return opt.menu;
		    		}
		    		var type=node.original.tag.srfnodetype;
		    		var menu=me.config.contextmenu[type];
		    		if(!menu){
		    			return menu;
		    		}
		    		menu = $.extend(true,{},menu); 
			    	for(key in menu){
			    		var item=menu[key];
			    		item.node=node;
			    		if(item.ua){
			    			item["action"]=function(data){
			    				var ctrler = me.getController();
			    				var uiaction = ctrler.getUIAction(data.item.ua.tag);
			    				if(uiaction){
			    					var params=$.extend({},data.item.node.original.tag);
			    					params.node=data.item.node;
			    					ctrler.doUIAction(uiaction, params);
			    				}
			    			}
			    		}
			    	}
		    		return menu;
			     }
		      }
		 });
		 $('#'+config.id).on('changed.jstree', this,function (e, data) {
			    var i, j, r = [];
			    for(i = 0, j = data.selected.length; i < j; i++) {
			      r.push(data.instance.get_node(data.selected[i]));
			    }
			    me.fireEvent(IBizTree.SELECTIONCHANGE,me,r);
			  });
		 $('#'+config.id).on('load_node.jstree', this,function (e, data) {
			 if(data.node.id=='#'){
				 //根节点，选中第一个
				 if(data.node.children.length>0)
				 {
					 $('#'+me.getId()).jstree("select_node",data.node.children[0]);
				 }
			 }
			 
		 });
	},
	setSize:function(width,height){
		var me = this;
		$('#'+me.getId()).width(width);
		$('#'+me.getId()).height(height);
	},
	setCatalog:function(catalog){
		var me=this;
		me.catalog = catalog;
		$('#'+me.getId()).jstree("refresh");
	},
	/**
	 * 加载
	 */
	load:function(){
		var me=this;
		$('#'+me.getId()).jstree("refresh");
	},
	/**
	 * 获取选择节点数据
	 * 
	 * bFull，true：返回的数据包含节点全部数据，false：返回的数组仅包含节点ID
	 */
	getSelected:function(bFull){
		var me=this;
		return $('#'+me.getId()).jstree("get_selected",bFull);
	},
	reload:function(node){
		var tree = jQuery.jstree.reference('#'+this.config.id);
		if(node && node != '#'){
			var obj;
			if(typeof(node) =='String'){
//				var inst = $.jstree.reference(node);
//				obj = inst.get_node(nodeid);
				obj = tree.get_node(node);
			}else{
				obj = node;
			}
			tree.refresh_node(obj) ;
		}else{
			 tree.refresh() ;
		}
	},
	/**
	 * 删除
	 */
	remove: function(node) {
		var me = this;
		var arg = {srfnodeid:node.id};
		$.extend(arg, {
			srfaction: 'remove'
		});
		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({
			url: me.config.url,
			params: arg,
			method: 'POST',
			dataType: 'json',
			success: function(data) {
				IBiz.endload(me.loadingTag );
				if (data.ret == 0) {
					me.tableselection = null;
					me.tableselections = {};
					me.reload(node.parent);
					if (data.info && data.info != '') {
						IBiz.alert($IGM('IBIZTREE.REMOVE.TITLE','删除成功'),$IGM('IBIZTREE.REMOVE.INFO','删除数据成功,'+data.info,[data.info]),1);
					}
					IBiz.processResult(data);
				} else {
					IBiz.alert($IGM('IBIZTREE.REMOVE.TITLE2','删除失败'),$IGM('IBIZTREE.REMOVE.INFO2','删除数据失败,'+data.info,[data.info]),2);
				}
			},
			failure: function(e) {
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZTREE.AJAX.INFO','执行请求发生异常'),2);
			}
		});
	},
	doUIAction: function(params) {
		var me = this;
		var callback;
		if(params || params.callback){
			callback = params.callback;
			delete params.callback;
		}
		if (!params) params = {};
		$.extend(params,{srfaction: 'uiaction'});
		if (IBizApp_Data) {
			params.srfappdata = IBizApp_Data;
		}
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			dataType:'json',
			success:function(data){
				IBiz.endload(me.loadingTag );
				if(data.ret == 0){
					if(data.reloadData){
						me.refresh();
					}
					if (data.info && data.info != '') {
						IBiz.alert($IGM('IBIZTREE.DOUIACTION.TITLE','操作成功'),$IGM('IBIZTREE.DOUIACTION.INFO','操作成功,'+data.info,[data.info]),1);
					}
					IBiz.processResult(data);
					
					if(callback && typeof(callback) == 'function'){
						callback({success:true,data:data});
					}
				}else{
					IBiz.alert($IGM('IBIZTREE.DOUIACTION.TITLE2','操作失败'),$IGM('IBIZTREE.DOUIACTION.INFO2','操作失败,执行操作发生错误,'+data.info,[data.info]),2);
					if(callback && typeof(callback) == 'function'){
						callback({success:false,data:data});
					}
				}
			},
			failure:function(e){
				IBiz.endload(me.loadingTag );
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZTREE.AJAX.INFO','执行请求发生异常'),2);
				if(callback && typeof(callback) == 'function'){
					callback({success:false,e:e});
				}
			}	
		});
	}
});
/*****************事件声明************************/
/**
 * 选择变化
 */
IBizTree.SELECTIONCHANGE = "SELECTIONCHANGE";
/**
 * 上下文菜单
 */
IBizTree.CONTEXTMENU = "CONTEXTMENU";
$IRM('IBIZTREE.AJAX.INFO','执行请求发生异常');
/**
 * 树导航栏
 */
var IBizTreeExpBar = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		var dataurl = me.getController().getBackendUrl()+'srfctrlid='+this.getName()+'_tree'+'&';
		
		var treeCfg=me.getTreeCfg();
		treeCfg=$.extend(treeCfg,{id:this.getId()+'_tree',url:dataurl,ctrler:config.ctrler});
		me.tree = new IBizTree(treeCfg);
		
		me.tree.on(IBizTree.SELECTIONCHANGE,function(sender,args,e){
			var me = e.data;
			me.onTreeSelectionChange(sender,args,e);
		},me);
		
		me.tree.on(IBizTree.CONTEXTMENU,function(sender,args,e){
			var me = e.data;
			me.onTreeContextMenu(sender,args,e);
		},me);
		
		me.getController().registerItem(this.getName()+'_tree',me.tree);
		
		me.treecat = $('#' + this.getId()+'_cat');
		if (me.treecat.length>0) {
			me.treecat.on("change", me, function(e) {
				var firstItem = me.treecat.val();
				me.tree.setCatalog(firstItem);
			});
			me.fetchCat(dataurl,{srfaction: 'fetchcat',srfappdata:IBizApp_Data});
		}
	},
	setSize:function(width,height){
		var me = this;
		$('#'+me.getId()).height(height);
		$('#'+me.getId()).width(width);
	},
	getTree:function()
	{
		return this.tree;
	}
	,getExpTab:function()
	{
		return this.config.tabctrl;
	}
	,getTreeCfg:function(){
		return this.config.treeCfg||{};
	}
	,getExpFrame:function()
	{
		return this.config.expframe;
	}
	,getPVPanel:function()
	{
		return this.config.pvpanel;
	}
	,onTreeSelectionChange:function(tree,records,eOpts){
		
		var me=this;
		if(records==null||records.length==0)
			return;
		
		var record=records[0];
		if(!record.original)
			return;
		
		var tag = record.original.tag;
		if(!tag || !(tag.srfnodetype))
			return;
		
		//替换键值
		var nodeids = record.id.split(';');
		var nodetext = record.text;
		
		var controller = me.getController();
		if(me.getExpTab())
		{
			var viewarg={viewid:tag.srfnodetype};
			var viewItem = controller.getExpItemView(viewarg);
			if(viewItem==null)
				return ;
			var layoutcard = me.getExpTab();
			var itemid=layoutcard.id + '_'+ tag.srfnodetype;
			layoutcard.setActiveItem(itemid);
			
			var viewParam=  {};
			if(viewItem.viewparam)
			{
				$.extend(viewParam,viewItem.viewparam);
			}
			for (var key in viewParam) 
			{  
				 var value =  viewParam[key] ;
				 if(value)
				 {
					 value = value.replace(new RegExp('%NODETEXT%','g'),nodetext);
			    	 //进行替换
					 for(var i=1;i<nodeids.length;i++){
						value = value.replace(new RegExp('%NODEID'+((i==1)?'':i.toString())+'%','g'),nodeids[i]);
					 }
					 viewParam[key] = value;
				 }
			} 
			
			var subController = controller.getController(controller.getCId2()+viewItem.embedviewid);
			layoutcard.setActiveSubController(subController);
			if(!subController.isInited())
			{
				subController.asyncInit({parentData:viewParam,renderTo:itemid,subApp:viewItem.subapp});
				return;
			}
			
			subController.setParentData(viewParam);
			subController.refresh();
			return;
		}
		
		if(me.getPVPanel())
		{
			var viewarg={nodetype:tag.srfnodetype};
			var viewParam = controller.getNavViewParam(viewarg);
			if(viewParam==null)
				return ;
			
			for (var key in viewParam) 
			 {  
				 var value =  viewParam[key] ;
				 if(value)
				 {
					 value = value.replace(new RegExp('%NODETEXT%','g'),nodetext);
					//进行替换
					 for(var i=1;i<nodeids.length;i++){
						value = value.replace(new RegExp('%NODEID'+((i==1)?'':i.toString())+'%','g'),nodeids[i]);
					 }
					 viewParam[key] = value;
				 }
			} 
			
			me.getPVPanel().setParentData(viewParam);
			return;
		}
		
		if(me.getExpFrame())
		{
			var viewarg={viewid:tag.srfnodetype};
			var viewItem = controller.getExpItemView(viewarg);
			if(viewItem==null)
				return ;
			
			var viewParam=  {};
			if(viewItem.viewparam)
			{
				$.extend(viewParam,viewItem.viewparam);
			}
			
			for (var key in viewParam) 
			{  
				 var value =  viewParam[key] ;
				 if(value)
				 {
					 value = value.replace(new RegExp('%NODETEXT%','g'),nodetext);
					//进行替换
					 for(var i=1;i<nodeids.length;i++){
						value = value.replace(new RegExp('%NODEID'+((i==1)?'':i.toString())+'%','g'),nodeids[i]);
					 }
					 viewParam[key] = value;
				 }
			} 
			
			var url = $.getIBizApp().parseURL(BASEURL,viewItem.viewurl,{});
			url += "&"+$.param({'srfifchild':true,'srfparentdata':JSON.stringify(viewParam)});
			me.getExpFrame().attr("src",url); 
			return;
		}
	}
	,onTreeContextMenu:function(tree,params,eOpts){
		var me=this;
		var node=params.node;
		
	}
	,fetchCat:function(backendurl,arg){
		var me=this;
		IBiz.ajax({url:backendurl,
			params:arg,
			method:'POST',
			success:function(data){
				if(data.ret == 0)
				{
					var firstItem = '';
					var items = [];
					if (data.items) {
						$.each(data.items, function(idx, item) {
							items.push('<option value="' + item.value + '">' + item.text + '</option>');
							if(firstItem=='')
								firstItem = item.value;
						});
					}
					if(me.treecat){
						me.treecat.html(items.join(''));
					}
					me.tree.setCatalog(firstItem);
				}
				else
				{
					IBiz.alert($IGM('IBIZTREEEXPBAR.FETCHCAT.TITLE','获取失败'),$IGM('IBIZTREEEXPBAR.FETCHCAT.INFO','获取树分类数据发生错误,'+data.errorMessage,[data.errorMessage]),2);
				}
			},
			failure:function(e){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZTREE.AJAX.INFO','执行请求发生异常'),2);
			}
		});
	}
		
});
/**
 * 数据关系分页
 */
var IBizDRTab = IBizTab.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		me.on(IBizTab.SELECTIONCHANGE,function(sender,args,e){
			var me = e.data;
			me.onTabSelectionChange(args);
		},me);
		//激活第一个分页
		me.setActiveItem(0);
	}
	,parentData:null
	,onTabSelectionChange:function(args){
		
		var me=this;
		var href=args.target.attributes['href'].value;
		var itemid=href.replace(new RegExp('#','g'),'');
		var viewid = href.replace(new RegExp('#'+me.id+'_','g'),'');
		
		var controller = me.getController();
		//判断有误对象
		if(viewid=='form')
		{
			me.setActiveItem(0);
			return;
		}
		var parentKey='';
		if(me.parentData){
			parentKey = me.parentData.srfparentkey;
		}
		if(!parentKey || parentKey=='')
		{
			me.setActiveItem(0);
			IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDRTAB.ONTABSELECTIONCHANGE.INFO','请先建立主数据'),0);
			return;
		}
		
		var dritem = {viewid:viewid};
		if(dritem.viewid == undefined || dritem.viewid=='')
			return;
		
		var viewItem = controller.getDRItemView(dritem);
		if(viewItem==null || !viewItem.viewparam)
			return ;
		
		var viewParam =viewItem.viewparam ;
		var parentData = {};
		if(true)
		{
			$.extend(parentData, viewParam);
			$.extend(parentData, me.parentData);
			if(viewParam.srfparentdeid)
			{
				parentData.srfparentdeid=viewParam.srfparentdeid;
			}
		}
		
		var itemid=me.id + '_'+ dritem.viewid.replace(new RegExp(':','g'),'_');
		me.setActiveItem(itemid);
		
		var subController = controller.getController(controller.getCId2()+viewItem.embedviewid);
		if(!subController.isInited())
		{
			subController.asyncInit({parentMode:viewParam,parentData:parentData,renderTo:itemid,subApp:viewItem.subapp,autoLayout:false});
			return;
		}
		
		subController.setParentData(parentData);
		subController.refresh();
	}
	,setParentData:function(pd){
		var me=this;
		me.parentData=pd;
		//向服务器请求状态
		var params={};
		if(me.parentData)
		{
			$.extend(params, me.parentData);
		}
		params.srfaction = 'FETCH';
		
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			success:function(data){
				if(data.ret == 0){
					if(data.items)
					{
						$.each(data.items,function(idx,item){
							if(item.enabled==undefined)
								return;
							var dritem=item.dritem;
							if(!dritem||!dritem.viewid)
								return;
							if(item.enabled)
								$('#'+me.getId()+'_h_'+dritem.viewid).show();
							else
								$('#'+me.getId()+'_h_'+dritem.viewid).hide();
								
						});
					}
					
				}else{
					IBiz.alert($IGM('IBIZDRTAB.SETPARENTDATA.TITLE','获取失败'),$IGM('IBIZDRTAB.SETPARENTDATA.INFO','获取数据失败,'+data.info,[data.info]),2);
				}	
			},failure:function(data){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDRTAB.AJAX.INFO','执行请求发生异常'),2);
			}
		});
	}
});
/**
 * 工作流催办控件
 */
var IBizWFStepActor =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.container = $('#'+config.id);
		me.container.addClass('tiles');
		me.itemMap = {};
		me.selections = [];
		me.load();
	},
	/**
	 * 加载
	 */
	load:function(){
		var me = this;
		me.refresh();
	},
	refresh:function(){
		var me = this;
		var params = {};
		me.fireEvent(IBizWFStepActor.BEFORELOAD,me,params);
       	params.offset = params.start;
       	params.limit = params.length;
		params.srfrender='JQUERYDATATABLES';
		
		
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			success:function(data){
				me.onDataLoaded(data);
			},failure:function(data){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZWFSTEPACTOR.AJAX.INFO','执行请求发生异常'),2);
			}
		});
	},
	onDataLoaded:function(data){
		var me = this;
		
		if(data.ret != 0){
			IBiz.alert($IGM('IBIZWFSTEPACTOR.ONDATALOADED.TITLE','加载失败'),$IGM('IBIZWFSTEPACTOR.ONDATALOADED.INFO','加载数据失败,'+data.info,[data.info]),2);
			return;
		}
		
		var caphtml = [];
		var capcontainer = $('#'+me.config.id+'_cap');
		if(data.activestep){
			caphtml.push('<small>&nbsp;'+$IGM('IBIZWFSTEPACTOR.ONDATALOADED.SMALL','当前环节')+'&nbsp;</small>');
			caphtml.push(data.activestep.wfplogicname);
			caphtml.push('<small>&nbsp;'+$IGM('IBIZWFSTEPACTOR.ONDATALOADED.SMALL2','处理人员')+':</small>');
		}
		capcontainer.html(caphtml.join(''));
		
		var html = [];
		
		$.each(data.items,function(idx,item){
			me.itemMap[item.srfkey] = item;
			var wfstepactorname = item.wfstepactorname;
			var remindercount  = item.remindercount 
			html.push('<div class="ibiz-id-tile" data-ibiz-id="'+item.srfkey+'">')
			html.push('<div class="tile bg-purple-studio" style="');
			if(item.isfinish == 1)
			{
				html.push('border-color: #888 !important;background-color: #888 !important;');
			}
			html.push('">');
			html.push('	<div>');
			html.push('		<div style="text-align:right;">');
			if(remindercount>0){
				html.push('			<span class="badge badge-default ibiz-id-counter">');
				html.push(remindercount);
				html.push('			</span>');	
			}
			html.push('</div>');
			html.push('	<div class="tile-body">');
			html.push('			<i class="fa fa-user"></i>');
			html.push('	</div>');
			html.push('	<div class="tile-object">');
			html.push('		<div style="text-align:center;">');
			html.push(wfstepactorname);
			html.push('</div>');
			html.push('	</div>');
			html.push('</div>');
			html.push('</div>');
			html.push('</div>');
		});
		
		me.container.html(html.join(''));
		
		me.container.find('.ibiz-id-tile').dblclick(function(e){
			 me.container.find('.tile').removeClass('selected');
			 var id = $(this).attr('data-ibiz-id');
			 $(this).addClass('selected');
			 
			 me.selections =[me.itemMap[id]];
			 
			 me.fireEvent(IBizWFStepActor.ROWDBLCLICK, me,me.selections);
		});
	}
});
/*****************事件声明************************/
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizWFStepActor.BEFORELOAD = 'BEFORELOAD';
/**
 * 双击行
 */
IBizWFStepActor.ROWDBLCLICK = 'ROWDBLCLICK';
$IRM('IBIZWFSTEPACTOR.AJAX.INFO','执行请求发生异常');
/**
 * 工作流表单历史处理步骤时间线控件
 */
var IBizWFTimeline =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.container = $('#'+config.id);
		me.load();
	},
	/**
	 * 加载
	 */
	load:function(){
		var me = this;
		me.refresh();
	},
	selectItem:function(data){
		var me = this;
		if(data && data.wfstepvalue){
			var items = [];
			if(me.items)
			{
				$.each(me.items,function(idx,item){
					//判断步骤是否相同
					if(data.wfstepvalue == item.wfstepname){
						items.push(item);
					}
				});
			}
			me.renderItems(items);
		}else
		{
			me.renderItems(me.items);
		}
	},
	refresh:function(){
		var me = this;
		var params = {};
		me.fireEvent(IBizWFTimeline.BEFORELOAD,me,params);
       	params.offset = params.start;
       	params.limit = params.length;
		params.srfrender='JQUERYDATATABLES';
		
		
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			success:function(data){
				me.onDataLoaded(data);
			},failure:function(data){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZWFSTEPACTOR.AJAX.INFO','执行请求发生异常'),2);
			}
		});
	},
	renderItems:function(items)
	{
		var me = this;
		var html = [];
		$.each(items,function(idx,item){
			var wfprocessid = item.wfstepid;
			var stepname = item.wfstepdataname;
			var actiontime = item.actiontime;
			var actorname = item.actorname;
			var actorname2 = item.actorname2;
			var memo = item.memo;
			var wfplogicname = item.wfplogicname;
			var name='';
			if(actorname2){
				name = '('+actorname2+' 代办)';
			}
			if(!actorname || actorname == null){
				actorname = '';
			}
			if(!stepname || stepname == null){
				stepname = '';
			}
			if(!actiontime || actiontime == null){
				actiontime = '';
			}else
			{
				actiontime = moment(actiontime).format('YYYY-MM-DD HH:mm')
			}
			if(!memo || memo == null){
				memo = '';
			}
			if(!wfplogicname || wfplogicname == null){
				wfplogicname = '';
			}
			html.push('<div data-ibiz-processid="'+wfprocessid+'" class="timeline-item ibiz-wftimeline">');
			html.push('	<div class="timeline-badge">');
			html.push('		<div class="timeline-icon ">');
			html.push('			<i class="icon-user-following font-green-haze"></i>');
			html.push('		<div style="margin-left:-5px;">'+actorname+'</div>');
			html.push('		</div>');
			html.push('	</div>');
			html.push('	<div class="timeline-body">');
			html.push('		<div class="timeline-body-arrow">');
			html.push('		</div>');
			html.push('		<div class="timeline-body-head">');
			html.push('			<div class="timeline-body-head-caption">');
			html.push('				<a href="javascript:;" class="timeline-body-title font-blue-madison">');
			html.push(stepname);
			html.push('				</a>');
			html.push('				<span class="timeline-body-time font-grey-cascade">');
			html.push(actiontime+name);
			html.push('				</span>');
			html.push('			</div>');
			html.push('			<div style="float:right">'+wfplogicname+'</div>');
			html.push('		</div>');
			html.push('		<div class="timeline-body-content">');
			html.push('			<span class="font-grey-cascade">');
			html.push(memo);
			html.push('			</span>');
			html.push('		</div>');
			html.push('	</div>');
			html.push('</div>');
		});
		
		me.container.html(html.join(''));
	},
	onDataLoaded:function(data){
		var me = this;
		
		if(data.ret != 0){
			IBiz.alert($IGM('IBIZWFSTEPACTOR.ONDATALOADED.TITLE','加载失败'),$IGM('IBIZWFSTEPACTOR.ONDATALOADED.INFO','加载数据失败,'+data.info,[data.info]),2);
			return;
		}
		me.items = data.items;
		me.renderItems(data.items);
	}
});
/*****************事件声明************************/
/**
 * 加载之前<后期要抽象出Store对象，由Store呼出此事件>
 */
IBizWFTimeline.BEFORELOAD = 'BEFORELOAD';
/**
 * 多选页结果集合控件
 */
var IBizMPickupResult =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.container = $('#'+config.id);
		me.field = me.container.find('.ibiz-id-select');
		me.itemMap = {};
		me.selectionskeys = [];
		
		me.leftBtn = me.container.find('.ibiz-id-left');
		me.rightBtn = me.container.find('.ibiz-id-right');
		me.rightAllBtn = me.container.find('.ibiz-id-rightall');
		me.leftAllBtn = me.container.find('.ibiz-id-leftall');
		
		me.leftBtn.click(function(e){
			me.onLeftClick();
		});
		me.rightBtn.click(function(e){
			me.onRightClick();
		});
		me.rightAllBtn.click(function(e){
			me.onRightAllClick();
		});
		me.leftAllBtn.click(function(e){
			me.onLeftAllClick();
		});
		me.field.change(function(e){
			me.onListSelectChanged(me.field.val());
		});
		
	},
	onListSelectChanged:function(ids){
		var me = this;
		me.selectionskeys = ids;
	},
	onLeftClick:function(){
		var me = this;
		me.getController().switchLeft();
	},
	onRightClick:function(){
		var me = this;
		me.getController().switchRight();
	},
	onRightAllClick:function(){
		var me = this;
		me.getController().switchRightAll();
	},
	onLeftAllClick:function(){
		var me = this;
		me.getController().switchLeftAll();
	},
	getDatas:function(){
		var me = this;
		var sele = [];
		$.each(me.itemMap,function(key,item){
			sele.push(item);
		});
		return sele;
	},
	/**
	 * 获取选中值
	 */
	getSelections:function(){
		var me = this;
		var sele = [];
		if(me.selectionskeys){
			$.each(me.selectionskeys,function(idx,id){
				var item = me.itemMap[id];
				if(item){
					sele.push(item);
				}
			});
		}
		return sele;
	},
	/**
	 * 清空
	 */
	clear:function(){
		var me = this;
		me.itemMap = {};
		
		me.fireEvent(IBizMPickupResult.SELECTIONCHANGE,me,me.getDatas());
	},
	/**
	 * 添加数据
	 */
	appendDatas:function(items){
		if(!items){
			return;
		}
		var me = this;
		var bChanged = false;
		$.each(items,function(idx,item){
			if(!me.itemMap[item.srfkey]){
				me.itemMap[item.srfkey] = item;
				bChanged = true;
			}
		});
		if(bChanged){
			me.renderUI();
			me.fireEvent(IBizMPickupResult.SELECTIONCHANGE,me,me.getDatas());
		}
	},
	removeDatas:function(items){
		if(!items){
			return;
		}
		var me = this;
		var bChanged = false;
		$.each(items,function(idx,item){
			if(me.itemMap[item.srfkey]){
				delete me.itemMap[item.srfkey];
				bChanged = true;
			}
		});
		if(bChanged){
			me.renderUI();
			me.fireEvent(IBizMPickupResult.SELECTIONCHANGE,me,me.getDatas());
		}
	},
	renderUI:function(){
		var me = this;
		var html = [];
		$.each(me.itemMap, function(key, item) {
			html.push('<option value="' + item.srfkey + '">' + item.srfmajortext + '</option>');
		});
		if(me.field){
			me.field.html(html.join(''));
		}
	}
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
IBizMPickupResult.SELECTIONCHANGE = 'SELECTIONCHANGE';
/**
 * 数据信息区<图标仅支持css>
 */
var IBizDataInfoBar =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.container = $('#'+config.id);
		
		this.title = this.container.find('.ibiz-id-title');
		this.content = this.container.find('.ibiz-id-content');
		this.icon = this.container.find('.ibiz-id-icon');
	},
	setCurrentData:function(data){
		var me = this;
		me.content.html(data.srfmajortext);
	}
});	
/**
 * 多编辑视图面板部件
 */
var IBizMultiEditViewPanel = IBizControl.extend({
	editCtrlers:{},//选项表单控制器数据
	removeKeys:'',//需要删除的键值
	subindex:0,//选项页序号
	parentViewCtrler:null,
	isReadOnly:false,
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
		if(config.readonly)
			me.isReadOnly = true;
		me.parentViewCtrler=config.viewctrler;
		me.mainPanel = $('#'+me.getId());
		me.createMainPanel();
		
		if(!me.isReadOnly){
			//添加新建按钮
			me.addNewItemDiv();
		}
	},
	/**
	 * 加载数据
	 */
	load:function(){
		var me = this;		
		var params = {};
		if(me.parentViewCtrler.parentMode)
			$.extend(params,me.parentViewCtrler.parentMode);
		if(me.parentViewCtrler.parentData)
			$.extend(params,me.parentViewCtrler.parentData);
		var dataurl = me.config.url+'srfaction=fetch&start=0&limit=500&';
		IBiz.ajax({
			url: dataurl,
			params : params,
			method : "POST",
			dataType: "json",
			success:function(data){
				if(data.ret == 0){
					if(data.items && data.items.length>0){
						var bActive=true;
						$.each(data.items,function(name,item){
							var id=me.addItemDiv({srfkey:item.srfkey,srfmajortext:item.srfmajortext,active:bActive});
							var param={containerid:id,srfkey:item.srfkey};
							me.fireEvent(IBizMultiEditViewPanel.FINDEDITVIEWCONTROLLER,me,param);	
							if(bActive){
								bActive=false;
							}
				        });
					}
					//没有返回数据，新建默认表单
					if(data.items.length == 0 && me.config.defaultLoad){
						if(me.config.defaultLoad>0){
							var params = {};
							for(var i=0,number=me.config.defaultLoad;i<number;i++){
								me.doNew(params)
							}
						}
					}
				}else{
					console.log('加载计数数据异常.'+data.info);
				}
			},
			failure:function(e){
				
			}	
		});
	},
	/**
	 * 添加选项页编辑视图控制器
	 */
	addEditViewCtrler:function(ctrler){
		var me = this;
		if(!ctrler.isInited())
		{
			if(ctrler.config.srfkey)
				ctrler.viewparam.srfkey=ctrler.config.srfkey;
			var parentMode = me.parentViewCtrler.parentMode;
			var parentData = me.parentViewCtrler.parentData;
			var renderTo = ctrler.config.containerid;
			var subApp = me.parentViewCtrler.subApp;
			$.extend(parentData,parentMode);
			
			ctrler.asyncInit({parentMode:parentMode,parentData:parentData,renderTo:renderTo,subApp:subApp});
			//注册编辑视图保存成功事件
			ctrler.on(EditView9ControllerBase.FORMSAVED, function (sender,data,e){
				var me=e.data;
				me.onEditViewSaved(sender,data);
			}, me);
			//注册编辑视图保存失败事件
			ctrler.on(EditView9ControllerBase.FORMSAVEERROR, function (sender,data,e){
				var me=e.data;
				me.onEditViewSaveError(sender,data);
			}, me);
			
			me.editCtrlers[renderTo]=ctrler;
		}
	},	
	/**
	 * 表单保存成功
	 */
	onEditViewSaved:function(ctrler,data){
		var me=this;
		if(ctrler)
			me.doTabs.pop(ctrler.config.containerid);
		
		if(!me.doTabs || me.doTabs.length==0){
			//调用主数据保存
			me.doMajorSave();
		}
	},
	/**
	 * 表单保存错误
	 */
	onEditViewSaveError:function(ctrler,data){
		
	},
	/**
	 * 新建
	 */
	doNew:function(params){
		var me=this;
		
		//添加div及注册删除操作
		var id=me.addItemDiv({active:true});
		
		//触发获取编辑视图控制器事件
		var param={pcontroller:me.parentViewCtrler,appctx:me.config.appctx,containerid:id};
		me.fireEvent(IBizMultiEditViewPanel.FINDEDITVIEWCONTROLLER,me,param);	
	},
	/**
	 * 删除
	 */
	doRemove: function(panelId) {
		me = this;
		var ctrler=me.editCtrlers[panelId];
		if(ctrler){
			var srfkey = '';
			if (srfkey == undefined || srfkey == '') {
				field = ctrler.getForm().findField('srfkey');
				if (field) {
					srfkey = field.getValue();
				}
			}
			if(srfkey){
				if(me.removeKeys.length>0)
					me.removeKeys+=';';
				me.removeKeys+=srfkey;
			}
			delete me.editCtrlers[panelId];
		}
		me.onRemove(panelId);
	},
	/**
	 * 保存数据
	 */
	doSave:function(){
		var me=this;
		
		me.errorTabId='';
		me.doTabs=[];
		var bNeedOuterSave=true;
		//需要添加或更新的数据
		for(var key in me.editCtrlers){
			//仅保存变更的子数据
			var ctrler = me.editCtrlers[key];
			if(ctrler && ctrler.form.isDirty()){
				bNeedOuterSave=false;
				ctrler.doSave({afterformsaveaction:'embedsave'})
				me.doTabs.push(ctrler.config.containerid);					
			}
		}
		
		if(bNeedOuterSave)
			me.doMajorSave();
	},
	/**
	 * 保存主数据
	 */
	doMajorSave:function(ctrler,data){
		var me=this;
		var bNeedOuterSave=true;
		//需要删除的数据
		if(me.removeKeys.length>0){
			bNeedOuterSave=false;
			var params={srfaction: 'remove','srfkeys':me.removeKeys};
			IBiz.ajax({
				url: me.config.url,
				params: params,
				method: 'POST',
				dataType: 'json',
				async:false,  
				success: function(data) {
					me.removeKeys='';
					if (data.ret == 0) {
						me.parentViewCtrler.onDRDataSaved();
					} else {
						IBiz.alert($IGM('IBIZMULTIEDITVIEWPANEL.DOMAJORSAVE.TITLE','删除失败'),$IGM('IBIZMULTIEDITVIEWPANEL.DOMAJORSAVE.INFO','删除数据失败,'+data.info,[data.info]),2);
					}
				},
				failure: function(e) {
					IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZMULTIEDITVIEWPANEL.AJAX.INFO','执行请求发生异常'),2);
				}
			});
		}
		
		//调用主数据保存
		if(bNeedOuterSave)
			me.parentViewCtrler.onDRDataSaved();
	},
	/**
	 * 注册删除操作
	 */
	regRemoveUIAction:function(params){
		var me = this;
		var uiaction = {type:"Remove"};
		$.extend(uiaction,params);
		me.regUIAction(uiaction);
	},
	/**
	 * 点击按钮
	 */
	tabItemClick : function(params, e) {
		var me = this;
		var uiaction = me.getUIAction(params.tag);
		if(!uiaction)
			return;
		$.extend(uiaction,params);
		me.doUIAction(uiaction);
	},
	doUIAction: function(uiaction) {
		var me = this;
		if (uiaction) {
			if (uiaction.type == 'Add') {
				me.doNew(uiaction);
				return;
			}
			if (uiaction.type == 'Remove') {
				if(uiaction.panelId){
					me.doRemove(uiaction.panelId);
					return;
				}
			}
		}
	},
	/**
	 * 控件刷新
	 */
	refresh:function(){
		var me = this;
		me.uiactions={};
		me.editCtrlers={};
		me.removeKeys='';
		me.subindex=0;
		
		me.onRefresh();
		
		if(!me.isReadOnly){
			//添加新建按钮
			me.addNewItemDiv();
		}
		
		me.load();
	},
	/**
	 * 数据是否有修改  有修改返回true 否则返回false
	 */
	isDirty:function(){
		var me=this;
		var bDirty = false;
		
		//只读模式不提供数据修改能力
		if(me.isReadOnly){
			return bDirty;
		}
		if(me.removeKeys.length>0){
			bDirty=true;
		}else{
			for(var key in me.editCtrlers){
				var ctrler = me.editCtrlers[key];
				if(ctrler && ctrler.form && ctrler.form.isDirty()){
					bDirty=true;
					break;
				}
			}
		}
		
		return bDirty;
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		//arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		me.onSetDisabled(disabled);
	},
	onSetDisabled:function(disabled){},
	getHeight:function(){
		return 600;
	},
	/**
	 * 注册界面行为
	 */
	regUIAction:function(uiaction){
		var me = this;
		if(!me.uiactions){
			me.uiactions = {};
		}
		me.uiactions[uiaction.tag] = uiaction;
	},
	/**
	 * 获取界面行为
	 */
	getUIAction:function(uiactionId){
		var me = this;
		
		if(me.uiactions){
			return me.uiactions[uiactionId];
		}
		return null;
	},
	/**
	 * 控件刷新
	 */
	onRefresh:function(){},
	/**
	 * 删除操作
	 */
	onRemove:function(panelId){},
	/**
	 * 添加基础面板
	 */
	createMainPanel:function(){},
	/**
	 * 添加div及注册删除操作
	 * params.srfmajortext	主信息内容
	 * params.active		是否激活显示
	 */
	addItemDiv:function(params){},
	/**
	 * 添加选项页div及注册新建操作
	 */
	addNewItemDiv:function(){}
		
});
/*****************事件声明************************/
/**
 * 获取选项编辑页控制对象事件
 */
IBizMultiEditViewPanel.FINDEDITVIEWCONTROLLER = 'FINDEDITVIEWCONTROLLER';
/**
 * 多编辑视图面板部件
 */
var IBizMultiEditViewTabPanel = IBizMultiEditViewPanel.extend({
	header:{},//选项页头
	content:{},//选项页内容
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
	},
	//添加基础面板
	createMainPanel:function(){
		var me=this;
		if(me.mainPanel){
			var headerId=me.getId()+'_header';
			var contentId=me.getId()+'_content';
			me.mainPanel.append(
				'<ul class="nav nav-tabs " id="'+headerId+'"> </ul>'+
				'<div class="tab-content" id="'+contentId+'"> </div>'
			);
			me.header=$('#'+headerId);
			me.content=$('#'+contentId);
		}
	},
	/**
	 * 添加选项页div及注册新建操作
	 */
	addNewItemDiv:function(){
		var me=this;
		
		var newId=me.getId()+'_new';
		me.header.append(
				'<li> '+
				'	<button id ="'+newId+'" class="btn btn-priamry" data-ibiz-tag="New"'+
				'		style="margin-top: 9px;margin-left: 16px;">'+$IGM('IBIZMULTIEDITVIEWPANEL.ADDNEWITEMDIV.BUTTON','新建')+'<i class="fa fa-plus"></i></button>	'+
				'</li> '
				);
		
		me.newTab=$('#'+newId);
		
		var sender = me;
		me.newTab.on('click',sender,function(e) {
			var params = {};
			params['tag'] = $(this).attr('data-ibiz-tag');
			var regItem = e.data;
			if(regItem){
				regItem.tabItemClick(params, e);
			}
		});
		
		var uiaction = {"type":"Add","tag":"New"};
		me.regUIAction(uiaction);
	},
	/**
	 * 添加div及注册删除操作
	 * params.srfmajortext	主信息内容
	 * params.active		是否激活显示
	 */
	addItemDiv:function(params){
		var me=this;
		me.subindex++;
		var tabHeadText=$IGM('IBIZMULTIEDITVIEWPANEL.ADDITEMDIV.TITLE','基本信息');
		if(params && params.srfmajortext)
			tabHeadText=params.srfmajortext;
		
		var panelId = me.getId()+'_'+me.subindex;
		
		var headTag=panelId+"_head";
		var removeTag=panelId+"_remove";
		
		var divHeadHtml = '<li class="" id="'+headTag+'"><a id="'+panelId+'_a" href="#'+panelId+'" data-toggle="tab">';
		divHeadHtml += '	<span id="'+panelId+'_caption">'+tabHeadText+'</span>';
		if(!me.isReadOnly){
			divHeadHtml += '	<sub style="bottom: 1.4em;">';
			divHeadHtml += '		<span class="btn" style="padding:0px;" data-ibiz-tag="'+removeTag+'" id="'+removeTag+'">';
			divHeadHtml += '			<i class="fa fa-times"></i>';
			divHeadHtml += '		</span>';
			divHeadHtml += '	</sub></a>';
		}
		divHeadHtml += '</li>';
	    me.newTab.parent().before(divHeadHtml);
	
		var div = '<div class="tab-pane row" id="'+panelId+'"></div>';
		me.content.append(div);
		
		if(!me.isReadOnly){
			//删除事件绑定
			var sender = me;
			$('#'+removeTag).on('click',sender,function(e) {
				if(!params)
					params = {};
				params['tag'] = $(this).attr('data-ibiz-tag');
				var regItem = e.data;
				if(regItem){
					regItem.tabItemClick(params, e);
				}
			});
			me.regRemoveUIAction({panelId:panelId,tag:removeTag});
		}
		
		//设置选中状态
		if(params && params.active){
			$('#'+panelId+'_a').click();
		}
		return panelId;
	},
	/**
	 * 控件刷新
	 */
	onRefresh:function(){
		var me = this;
		if(me.header)
			me.header.empty();
		if(me.content)
			me.content.empty();
	},
	/**
	 * 选项页编辑视图保存成功
	 */
	onEditViewSaved:function(controller,data){
		arguments.callee.$.onEditViewSaved.call(this,controller,data);
		
		var majorText='';
		var field = controller.getForm().findField('srfmajortext');
		if (field) {
			majorText = field.getValue();
		}
		if(majorText){
			var panelId=controller.config.containerid;
			$('#'+panelId+'_caption').text(majorText);			
		}
	},	
	/**
	 * 选项页编辑视图保存错误
	 */
	onEditViewSaveError:function(controller,data){
		arguments.callee.$.onEditViewSaveError.call(this,controller,data);
		
		var me = this;
		//选中错误面板
		var panelId=controller.config.containerid;
		if(!me.errorTabId || panelId<me.errorTabId){
			$('#'+panelId+'_a').click();
		}
	},
	onRemove:function(panelId){
		//删除项为选中时，需要查找设置选中项（紧前项或紧后选项卡，如果无则不设置）
		var tabHead=$("#"+panelId+"_head");
		if(tabHead){
			if(tabHead.attr('class')=='active'){
				var nextTab = tabHead.prev();
				if(nextTab.length==0)
					nextTab=tabHead.next();
				if(nextTab.length>0)
					nextTab.find("a").click();
			}
		}
		$("#"+panelId+"_head").remove(); 
		$("#"+panelId).remove();
	}
		
});
/**
 * 多编辑视图面板部件
 */
var IBizMultiEditViewRowPanel = IBizMultiEditViewPanel.extend({
	header:{},//选项页头
	content:{},//选项页内容
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
	},
	//添加基础面板
	createMainPanel:function(){
		var me=this;
		if(me.mainPanel){
			var contentId=me.getId()+'_header';
			var btnId=me.getId()+'_content';
			var mainPanelHtml = '<table class="table table-bordered" id="'+contentId+'"></table>';
			if(!me.isReadOnly){
				mainPanelHtml += '<div id="'+btnId+'"></div>';
			}
			me.mainPanel.append(mainPanelHtml);
			me.tabContent=$('#'+contentId);
			
			if(!me.isReadOnly){
				me.tabBtn=$('#'+btnId);
			}
		}
	},
	/**
	 * 添加选项页div及注册新建操作
	 */
	addNewItemDiv:function(){
		var me=this;
		
		var newId=me.getId()+'_new';
		me.tabBtn.append(
				'<button class="btn btn-success ibiz-toolbar-item"'+
				'  data-ibiz-tag="New" id ="'+newId+'" style="Float: right;">'+$IGM('IBIZMULTIEDITVIEWPANEL.ADDNEWITEMDIV.BUTTON','新建')+'</button>'
				);
		
		me.newTab=$('#'+newId);
		
		var sender = me;
		me.newTab.on('click',sender,function(e) {
			var params = {};
			params['tag'] = $(this).attr('data-ibiz-tag');
			var regItem = e.data;
			if(regItem){
				regItem.tabItemClick(params, e);
			}
		});
		
		var uiaction = {"type":"Add","tag":"New"};
		me.regUIAction(uiaction);
	},
	/**
	 * 添加div及注册删除操作
	 * params.srfmajortext	主信息内容
	 * params.active		是否激活显示
	 */
	addItemDiv:function(params){
		var me=this;
		me.subindex++;
		
		var panelId = me.getId()+'_'+me.subindex;
		
		var headTag=panelId+"_head";
		var removeTag=panelId+"_remove";
		
		var divHtml = '<tr><td id="'+panelId+'"></td>';
		if(!me.isReadOnly){
			divHtml += '<td><div style="float: right;"><span class="btn btn-priamry" data-ibiz-tag="'+removeTag+'" id="'+removeTag+'"><i class="fa fa-times"></i></span></div></td></tr>';
		}
		divHtml += '</tr>';
		me.tabContent.append(divHtml);
		
		if(!me.isReadOnly){
			//删除事件绑定
			var sender = me;
			$('#'+removeTag).on('click',sender,function(e) {
				if(!params)
					params = {};
				params['tag'] = $(this).attr('data-ibiz-tag');
				var regItem = e.data;
				if(regItem){
					regItem.tabItemClick(params, e);
				}
			});
			me.regRemoveUIAction({panelId:panelId,tag:removeTag});
		}
		return panelId;
	},
	/**
	 * 控件刷新
	 */
	onRefresh:function(){
		var me=this;
		if(me.tabContent)
			me.tabContent.empty();
		if(me.tabBtn)
		me.tabBtn.empty();
	},
	/**
	 * 选项页编辑视图保存成功
	 */
	onEditViewSaved:function(controller,data){
		arguments.callee.$.onEditViewSaved.call(this,controller,data);
		
		var majorText='';
		var field = controller.getForm().findField('srfmajortext');
		if (field) {
			majorText = field.getValue();
		}
		if(majorText){
			var panelId=controller.config.containerid;
			$('#'+panelId+'_caption').text(majorText);			
		}
	},	
	/**
	 * 选项页编辑视图保存错误
	 */
	onEditViewSaveError:function(controller,data){
		arguments.callee.$.onEditViewSaveError.call(this,controller,data);
		
		var me = this;
		//选中错误面板(暂无)
		var panelId=controller.config.containerid;
		if(!me.errorTabId || panelId<me.errorTabId){
			$('#'+panelId+'_a').click();
		}
	},
	onRemove:function(panelId){
		//删除内容
		$("#"+panelId).parent().remove();
	}
		
});
/**
 * 更新面板
 */
var IBizUpdatePanel = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		//me.counterid = me.config.counterid;
		me.name = me.config.name;
		//me.counterparam = name.stringify(me.config.counterparam);
		me.timer = me.config.timer;
		me.url = me.getController().getBackendUrl();
		if(me.timer >1000){
			setInterval(function(){
				var params = {};
				if(me.lastParams){
					$.extend(params,me.lastParams);
				}
				me.reload(params);},me.timer);
		}
		me.reload();
	},
	/*
	 *  刷新更新面板
	 */
	reload:function(params){
		var me = this;
		if(!params)
			params = {};
		
		//备份最后信息
		me.lastParams = null;
		me.lastParams = {};
		$.extend(me.lastParams,params);
		
		
		params['srfctrlid'] = me.name;
		params['srfaction'] = 'FETCH';
		IBiz.ajax({url:me.url,
			params:params,
			method:'POST',
			dataType:'json',
			success:function(data){
				if(data.ret==0){
					$('#'+me.getId()).html(data.content);
				}
				else{
					$('#'+me.getId()).html(data.info);
				}
			},
			failure:function(e){
				$('#'+me.getId()).html($IGM('PANEL.AJAX.INFO','请求发生错误！'));
			}	
		});	
	}
});
/*基类*/
var ViewControllerBase = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.bInited = false;
		me.htmlwin=window;
		$.getIBizApp().regSRFController(me);
	
		me.lastTimer = new Date().getTime();
		setInterval(function(){me.lastTimer = new Date().getTime();},1000);
		
		me.autoLayout = config.autoLayout;
		if(me.autoLayout==undefined)
			me.autoLayout = false;
		me.itemMap = {};
		me.ctrlers = {};
		me.viewLogics = {};
		me.pagecontext = new IBizPageContext(config);
		var winId = me.pagecontext.getParamValue('windowid');
		var hookUnload = true;
		if(winId){
			me.window = $.getIBizApp().findWindow(winId);
			if(me.window){
				me.viewparam = me.window.viewparam;
				me.window.setOwnerWindow(window);
			//	if(!me.getPController() && (me.window.beforecallback==undefined)){
				if(!me.getPController() && me.window.isShowModal()){
					hookUnload = false;
					me.window.beforecallback = function(e){
						var tag = me.unloaded();
						if(tag)
						{
							return {win:window,msg:tag}; 
						}
						return tag;
					}
				}
			}	
		}	
		me.viewparam = $.extend({},me.pagecontext.viewparam,me.viewparam);
		if(!me.getPController()){
			if(hookUnload){
				//注册窗口关闭事件
				window.onbeforeunload = function(){
					var tag = me.unloaded();
					if(tag)
						return tag;
					return ;
				}
			}
			if(me.isAutoLayout()){
				$(window).resize(function(){
					me.doLayout();
				});
			}
		}
	},
	isClosed:function(){
		var me=this;
		if(me.htmlwin)
		{
			if(me.htmlwin.closed)
			{
				me.htmlwin = null;
				return true;
			}
			try
			{
				var lastTimer = new Date().getTime();
				if(lastTimer-me.lastTimer>=10000)
				{
					me.htmlwin = null;
					return true;
				}
				else
					return false;
			}
			catch(e)
			{
				me.htmlwin = null;
				return true;
			}
		}
		return true;
	},
	quit:function()
	{
		var me=this;
		me.htmlwin=null;
	},
	isAutoLayout:function()
	{
		var me=this;
		return me.autoLayout;
	}
	,doLayout:function(){
		var me = this;
		if(!me.isAutoLayout())
			return;
		if(me.getPController()){
			$('#'+me.getCId2()).ibizLayout({ctrler:me});
			$('#'+me.getCId2()).find('.ibiz-layout').ibizLayout({ctrler:me});
		}else{
			$('.ibiz-layout').ibizLayout({ctrler:me});
		}
	},
	/**
	 * 执行初始化
	 */
	onInit:function(){
		var me = this;
		if(me.tmpwidth != undefined)
			$('#'+me.getCId2()).width(me.tmpwidth);
		if( me.tmpheight != undefined)
			$('#'+me.getCId2()).height(me.tmpheight);
		me.tmpwidth = undefined;
		me.tmpheight = undefined;
	},
	setSize:function(width,height){
		var me = this;
		if(me.getPController()&&me.isAutoLayout()){
			if(me.isInited()){
				if(width!=undefined){
					$('#'+me.getCId2()).width(width);
				}
				if(height!=undefined){
					$('#'+me.getCId2()).height(height);
				}
				me.doLayout();
			}else{
				me.tmpwidth = width;
				me.tmpheight = height;
			}
		}
	},
	getItem:function(itemId){
		var me = this;
		return me.itemMap[itemId];
	},
	registerItem:function(itemId,item){
		var me = this;
		me.itemMap[itemId] = item;
	},
	unloaded:function(){
		/*//子控件如何处理，
		if(me.ctrlers && me.ctrlers.length> 0){
			
		}*/
		return null;
	},
	/**
	 * 初始化
	 */
	init:function(params){
		var me = this;
		if(params)
		{
			me.parentMode = params.parentMode;
			me.setParentData(params.parentData); 
		}
		
		me.bInited = true;
		me.onInit();
		me.initViewLogic();
		if(!me.getPController()&&me.isAutoLayout()){
			me.doLayout();
		}
		me.reloadUpdatePanels();
		me.fireEvent(ViewControllerBase.INITED, me, {});
	},
	/**
	 * 异步初始化<加载HTML内容动态绘制到界面>
	 */
	asyncInit:function(params){
		var me = this;
		me.pagecontext.clear();
		me.parentMode = params.parentMode;
		me.setParentData(params.parentData); 
		me.subapp = params.subApp;
		if(params.renderTo)
			me.renderTo = $('#'+params.renderTo);
		
		var root;
		if(params.subApp){
			root = WEBROOTURL+'/'+params.subApp;
		}else{
			root = BASEURL;
		}
		
		IBiz.ajax({url:root+'/jsp/'+me.config.viewurl,
			params:params,
			method:'GET',
			dataType:'html',
			success:function(data){
				me.renderHTML(data);
				me.init();
			},
			failure:function(e){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('VIEWCONTROLLERBASE.AJAX.INFO','加载内容布局异常'),1);
			}	
		});	
	},
	/**
	 * 绘制内容布局
	 */
	renderHTML:function(data){
		var me = this;
		if(me.renderTo){
			me.renderTo.html(data);
		}	
	},
	/**
	 * 是否初始化完毕
	 */
	isInited:function(){
		var me = this;
		return me.bInited;
	},
	/**
	 * 获取当前容器标识
	 */
	getCId:function(){
		var me = this;
		return me.config.containerid;
	},
	/**
	 * 获取当前容器标识2<自动附加_>
	 */
	getCId2:function(){
		var me  = this;
		var cid = me.getCId();
		if(cid !='')
			return cid+'_';
		return cid;
	},
	getAppCtx:function(){
		var me = this;
		return me.config.appctx;
	},
	/**
	 * 注册子控制器对象
	 */
	regController:function(ctrler){
		var me = this;
		me.ctrlers[ctrler.getCId()] = ctrler;
	},
	/**
	 *获取子控制器对象
	 */
	getController:function(id){
		var me = this;
		return me.ctrlers[id];
	},
	/**
	 * 获取父控件
	 */
	getPController:function(){
		var me = this;
		if(me.config && me.config.pcontroller){
			return me.config.pcontroller;
		}
		return null;
	},
	/**
	 * 注销子控制器对象
	 */
	unRegController:function(ctrler){
		var me = this;
		me.ctrlers[ctrler.getCId()] = null;
	},
	/**
	 * 注册代码表
	 */
	regCodeList:function(codelist){
		var me = this;
		if(!me.codelists){
			me.codelists = {};
		}
		me.codelists[codelist.getId()] = codelist;
	},
	/**
	 * 获取代码表
	 */
	getCodeList:function(codelistId){
		var me = this;
		
		if(me.codelists){
			return me.codelists[codelistId];
		}
		return null;
	}
	,
	/**
	 * 注册界面行为
	 */
	regUIAction:function(uiaction){
		var me = this;
		if(!me.uiactions){
			me.uiactions = {};
		}
		me.uiactions[uiaction.tag] = uiaction;
	},
	/**
	 * 获取界面行为
	 */
	getUIAction:function(uiactionId){
		var me = this;
		
		if(me.uiactions){
			return me.uiactions[uiactionId];
		}
		return null;
	}
	,
	/**
	 * 注册界面计数器
	 */
	regUICounter:function(uicounter){
		var me = this;
		if(!me.uicounters){
			me.uicounters = {};
		}
		me.uicounters[uicounter.tag] = uicounter;
	},
	/**
	 * 获取界面计数器
	 */
	getUICounter:function(uicounterId){
		var me = this;
		
		if(me.uicounters){
			return me.uicounters[uicounterId];
		}
		return null;
	}
	/**
	 * 刷新全部界面计数器
	 */
	,reloadUICounters:function()
	{
		var me = this;
		if(me.uicounters){
			$.each(me.uicounters,function(idx,item){
				if(item){
					item.reload();
				}
			});
		}
		var pController = me.getPController();
		if(pController){
			pController.reloadUICounters();
		}
	}
	,
	getWindow:function(){
		var me = this;
		return me.window;
	},
	
	/**
	 * 是否支持视图模型
	 */
    isEnableViewModel:function(){
    	return false;
    },
	/**
	 * 获取后台地址
	 */
	getBackendUrl : function(){
		var me = this;
		if(me.config && me.config.backendurl)
		{
			return me.config.backendurl;
		}
		return null;
	},
	/**
	 * 销毁 
	 */
	destroy : function(){
		var me = this;
		$.getIBizApp().unRegSRFView(me);
		me.config = null;
		arguments.callee.$.destroy.call(this);
	},
	/**
	 * 刷新
	 */
	refresh : function(){
		var me = this;
		me.onRefresh();
	},
	onRefresh: function(){
		
    },
    /**
	 * 刷新子项
	 */
    refreshItem:function(name){
    	var me=this;
    	var item = me.getItem(name);
    	if(item ){
    		if($.isFunction(item.refresh)){
    			item.refresh();
    			return;
    		}
    		if($.isFunction(item.reload)){
    			item.reload();
    			return;
    		}
    	}
    },
	/**
	 * 设置父数据
	 */
	setParentData : function(data){
		var me=this;
		me.parentData = data;
		me.onSetParentData();
		me.reloadUpdatePanels();
	},
	onSetParentData: function () {
		
    },
	/**
	 * 获取父数据
	 */
	getParentData : function(){
		var me = this;
		return me.parentData;
	},
	/**
	 * 获取父模式
	 */
	getParentMode : function(){
		var me = this;
		return me.parentMode;
	},
	/**
	 * 获取引用数据
	 */
	getReferData : function(){
		var me = this;
		return me.config.referData;
	},
	/**
	 * 获取引用数据
	 */
	getViewParam : function(){
		var me = this;
		return me.viewparam;
	},
	renderCodeList_Normal:function(codeListId,value,emtpytext){
    	var codelist = this.getCodeList(codeListId);
    	var item=codelist.getItemByValue(value);
    	if(item==null){
    		return emtpytext;
    	}
    	return this.getCodeItemText(item);
    },
    renderCodeList_NumOr:function(codeListId,value,emtpytext,textSeparator){
    	if(!textSeparator||textSeparator=='')
    		textSeparator = '、';
    	var codelist = this.getCodeList(codeListId);
    	if(value==null){
    		return emtpytext ;
    	}
    	var nValue = parseInt(value);
    	var strTextOr = '' ;
    	for(var i = 0 ; i < codelist.datas.length;i++){
    		var item = codelist.datas[i];
    		var codevalue = item.value;
    		if((parseInt(codevalue)&nValue)>0){
    			if(strTextOr.length >0 )
    				strTextOr += (textSeparator);
    			strTextOr += this.getCodeItemText(item);
    		}
    	}
    	
    	return strTextOr;
    },
    renderCodeList_StrOr:function(codeListId,value,emtpytext,textSeparator,valueSeparator){
    	if(!textSeparator||textSeparator=='')
    		textSeparator = '、';
    	if(value==null){
    		return emtpytext ;
    	}
    	var strTextOr = '' ;
    	var codelist = this.getCodeList(codeListId);
    	var arrayValue = new Array();   
    	arrayValue = value.split(valueSeparator);
    	for (i=0;i<arrayValue.length ;i++ )   
        {
    		var strText = '' ;
        	strText = this.renderCodeList_Normal(codeListId,arrayValue[i],emtpytext);
        	if(strTextOr.length >0 )
				strTextOr += (textSeparator);
        	strTextOr +=  strText;
    	}
    	
    	return strTextOr;
    }
    ,getCodeItemText:function(item){
    	var color = item.color;
    	var textCls = item.textcls;
    	var iconCls = item.iconcls;
    	var realText = item.text;
    	var ret = '';
    	if(iconCls)
    	{
    		ret = ('<i class="'+iconCls+'"></i>');
    	}
    	if(textCls || color)
    	{
    		ret += '<span';
    		if(textCls)
    		{
    			ret += (' class="'+textCls +'"');
    		}
    		if(color)
    		{
    			ret += (' style="color:'+color +'"');
    		}
    		ret += '>';
    		ret += realText;
    		ret += '</span>';
    	}
    	else
    	{
    		ret += realText;
    	}
    		
    	return ret;
    }
    ,hasHtmlElement:function(id){
    	if($('#'+this.getCId2()+id).length>0)
    		return true;
    	else
    		return false;
    },
    initViewLogic:function(){
		var me=this;
    	me.onPrepareViewLogics();
    	for (var A in me.viewLogics) {
            var logic = me.viewLogics[A];
            logic.init();
    	}
	},
	onPrepareViewLogics:function(){
		
	},
    regViewLogic: function(logic){
    	var me=this;
    	me.viewLogics[logic.getTag()] = logic;
    },
    getViewLogic: function(tag){
    	var me=this;
    	return me.viewLogics[tag];
    },
    invokeCtrl:function(ctrlid,command,arg){
    	var me=this;
    	if(!ctrlid || ctrlid==''){
    		me.invoke(command,arg);
    	}
    	else{
    		var ctrl=me.getItem(ctrlid);
    		if(ctrl){
    			if($.isFunction(ctrl.invoke)){
    				ctrl.invoke(command,arg);
    			}
    		}
    	}
    },
    /**
	 * 注册界面更新面板
	 */
	regUpdatePanel:function(updatepanel){
		var me = this;
		if(!me.updatepanels){
			me.updatepanels = {};
		}
		me.updatepanels[updatepanel.name] = updatepanel;
		me.registerItem(updatepanel.name,updatepanel);
	},
	/**
	 * 获取界面更新面板
	 */
	getUpdatePanel:function(updatepanelId){
		var me = this;
		if(me.updatepanels){
			return me.updatepanels[updatepanelId];
		}
		return null;
	}
	/**
	 * 刷新全部界面更新面板
	 */
	,reloadUpdatePanels:function()
	{
		var me = this;
		if(!me.isInited())
			return;
		if(me.updatepanels){
			var params = {};
			me.onFillUpdatePanelParam(params);
			$.each(me.updatepanels,function(idx,item){
				if(item){
					item.reload(params);
				}
			});
		}
		var pController = me.getPController();
		if(pController){
			pController.reloadUpdatePanels();
		}
	},
	createUpdatePanel:function(config){
		return IBiz.createUpdatePanel(config);
	}
	/**
	 * 填充更新面板调用参数
	 */
	,onFillUpdatePanelParam:function(params){
		var me=this;
		if (me.viewparam){
        	$.extend(params,me.viewparam);
        }
		if (me.getParentMode()) {
	       	$.extend(params, me.getParentMode());
		 }
        if (me.getParentData()) {
        	$.extend(params, me.getParentData());
        }
	}
});
/*****************事件声明************************/
/**
 * 控制器初始化完成
 */
ViewControllerBase.INITED = 'INITED';
/*主视图控制器对象*/
var MainViewControllerBase = ViewControllerBase.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		this.config = $.extend({}, this.config, config);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
		this.caption = null;
		this.calcToolbarItemState(false);
	},
	onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;
		//初始化工具栏
		if(me.hasHtmlElement('toolbar')){
			me.toolbar = me.createToolbar({id:this.getCId2()+'toolbar',ctrler: me});
			me.toolbar.on(IBizToolbar.ITEMCLICK,function(sender,args,e){
				var me = e.data;
				me.onClickTBItem(args);
			},me);
		}
	},
	createToolbar:function(config){
		return IBiz.createToolbar(config);
	},
	/**
	 * 点击按钮
	 * @param tag 事件源
	 */
	onClickTBItem : function(params) {
		var me = this;
		var uiaction = me.getUIAction(params.tag);
		me.doUIAction(uiaction, params);
	},
	doUIAction : function(uiaction, params) {
		var me = this;
		if(uiaction && (typeof uiaction == 'string')){
			uiaction =me.getUIAction(uiaction);
		}
		if (uiaction) {
			if (uiaction.type == 'DEUIACTION') {
				me.doDEUIAction(uiaction, params);
				return;
			}
			if (uiaction.type == 'WFUIACTION') {
				me.doWFUIAction(uiaction, params);
				return;
			}
		}
	},
	/**
	 * 获取前台行为参数
	 * 
	 * @param uiaction
	 *            行为
	 */
	getFrontUIActionParam : function(uiaction,params) {
		var me = this;
		var arg = {};
		if(uiaction.refreshview){
			arg.callback=function(win){
				me.refresh();
			}
		}
		return arg;
	},
	/**
	 * 获取后台行为参数
	 * 
	 * @param uiaction
	 *            行为
	 */
	getBackendUIActionParam : function(uiaction,params) {
		return {};
	},
	/**
	 * 打开界面行为视图
	 * @param uiaction 行为
	 */
	openUIActionView:function(frontview,viewparam)
	{
		var me = this;
		var callback;
		if(viewparam && viewparam.callback){
			callback = viewparam.callback;
			delete viewparam.callback;
		}
		var win = $.getIBizApp().createWindow({});
		win.scope = me;
		win.title = frontview.title;
		win.height = frontview.height ? frontview.height: 0;
		win.width = frontview.width ? frontview.width: 0;
		win.url = $.getIBizApp().parseURL2(	frontview.subapp,frontview.viewurl, {windowid : win.getId(),openerid : me.getId()});
		win.viewparam = viewparam;
		win.callback = function(win) {
			if(callback && typeof(callback) == 'function'){
				callback({win:win});
			}
		}
		
		var modal=false;
		if(frontview.openMode=='POPUPMODAL')
		{
			modal = true;
		}
		if(modal){
			win.openModal(window);
		} else {
			win.openInNewWindow(window);
		}
	},
	/**
	 * 执行实体行为
	 * @param uiaction 行为
	 */
	doDEUIAction : function(uiaction, params) {
		var me = this;
		if (uiaction.actionmode == 'FRONT') {
			if ((uiaction.fronttype == 'WIZARD')||(uiaction.fronttype == 'SHOWPAGE')) {
				var viewparam = me.getFrontUIActionParam(uiaction,params);
				if (!viewparam) {
					viewparam = {};
				}
				var frontview=uiaction.frontview;
				if(frontview.redirectview)
				{
					var param={};
					param['srfviewparam'] = JSON.stringify(viewparam);
					param['srfaction'] = 'GETRDVIEW';
					//远程请求
					IBiz.ajax({
						url: me.getAppCtx()+frontview.backendurl,
						params: param,
						method: 'POST',
						dataType: 'json',
						success: function(data) {
							if (data.ret == 0) {
								if(data.rdview)
									me.openUIActionView(data.rdview,viewparam);
								else
								{
									IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MAINVIEWCONTROLLER.DODEUIACTION.INFO','无法打开视图,'+data.info,[data.info]),1);
								}
							} else {
								IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MAINVIEWCONTROLLER.DODEUIACTION.INFO','无法打开视图,'+data.info,[data.info]),2);
							}
						},
						failure: function(e) {
							IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MAINVIEWCONTROLLER.AJAX.INFO','获取打开视图失败,请求异常'),2);
						}
					});
					return;
				}
				me.openUIActionView(frontview,viewparam);
				return;
			}
			if (uiaction.fronttype == 'OPENHTMLPAGE') {
				var url = $.getIBizApp().parseURL2(null,uiaction.htmlpageurl, me.getFrontUIActionParam(uiaction,params));
				window.open(url, '_blank');
				return;
			}
		}
		if (uiaction.actionmode == 'BACKEND') {
			var param = me.getBackendUIActionParam(uiaction,params);
			if (param == null)
				return;
			param.srfuiactionid = uiaction.tag;
			if (uiaction.confirmmsg) {
				IBiz.confirm(uiaction.confirmmsg, function(result) {
					if (result) {
						me.doBackendUIAction(param);
					}
				});
			} else {
				me.doBackendUIAction(param);
			}
			return;
		}
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误'),$IGM('MAINVIEWCONTROLLER.DODEUIACTION.INFO2','未处理的实体行为['+uiaction.tag+']',[uiaction.tag]), 2);
	},
	/**
	 * 执行工作流行为
	 * @param uiaction 行为
	 */
	doWFUIAction : function(uiaction, params) {
		var me = this;
		if (uiaction.actionmode == 'WFFRONT') {
			if ((uiaction.fronttype == 'WIZARD')||(uiaction.fronttype == 'SHOWPAGE')) {
				var win = $.getIBizApp().createWindow({});
				var viewparam = me.getFrontUIActionParam(uiaction,params);
				if (!viewparam) {
					viewparam = {};
				}
				viewparam['windowid'] = win.getId();
				viewparam['openerid'] = me.getId();
				$.extend(viewparam, uiaction.frontview.viewparam);
				win.scope = me;
				win.title = uiaction.frontview.title;
				win.height = uiaction.frontview.height ? uiaction.frontview.height
						: 0;
				win.width = uiaction.frontview.width ? uiaction.frontview.width
						: 0;
				win.url = $.getIBizApp().parseURL2(
						uiaction.frontview.subapp,
						uiaction.frontview.viewurl, {
							windowid : win.getId(),
							openerid : me.getId()
						});
				win.viewparam = viewparam;
				win.callback  = function(win){
					me.onWFUIFrontWindowClosed(win);
				};
				if (true) {// uiaction.frontview.modal){
					win.openModal(window);
				} else {
					win.openInNewWindow(window);
				}
				return;
			}
		}
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误'),$IGM('MAINVIEWCONTROLLER.DOWFUIACTION.INFO','未处理的实体工作流行为['+uiaction.tag+']',[uiaction.tag]), 2);
	},
	onWFUIFrontWindowClosed : function(win, data) {
	},
	/**
	 * 执行后台行为
	 * 
	 * @param uiaction
	 *            行为
	 */
	doBackendUIAction : function(uiaction) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.ERROR','错误'),$IGM('MAINVIEWCONTROLLER.DOBACKENDUIACTION.INFO','未处理的后台界面行为['+uiaction.tag+']',[uiaction.tag]), 2);
	},
	/**
	 * 是否-模式框显示
	 */
	isShowModal : function() {
		return false;
	},
	/**
	 * 关闭窗口
	 */
	closeWindow : function() {
		var me = this;
		var win = me.getWindow();
		if (win) {
			win.close(window);
		}
		else
			{
				window.close();
			}
	},
	
	getWindow:function(){
		var me=this;
		try
		{
			if(me.window)
			{
				var curwindow = $.getIBizApp().findWindow(me.window.getId());
				if(curwindow!=me.window)
				{
					 me.window = null;
				}
			}
		}
		catch(e)
		{
			 me.window = null;
		}
		return me.window;
	},
	/**
	 * 获取标题
	 */
	getCaption : function() {
		return this.caption;
	},
	/**
	 * 设置标题
	 * 
	 * @param caption
	 *            标题
	 */
	setCaption : function(caption) {
		if (this.caption != caption) {
			this.caption = caption;
			this.fireEvent(MainViewControllerBase.CAPTIONCHANGED, this,
					this.caption);
		}
	},
	/**
	 * 获取工具栏
	 */
	getToolbar : function() {
		return this.toolbar;
	},
	/**
	 * 计算工具栏项状态-<例如 根据是否有选中数据,设置 工具栏按钮是否可点击>
	 * 
	 * @param hasdata
	 *            是否有数据
	 */
	calcToolbarItemState : function(hasdata,dataaccaction) {
		if (this.toolbar && this.toolbar.items) {
			$.each(this.toolbar.items, function(index, ele) {
				var target = ele.attr('data-ibiz-target');
				if (target == 'SINGLEKEY' || target == 'MULTIKEY') {
					ele.prop('disabled', !hasdata);
				}
			});
			this.toolbar.updateAccAction(dataaccaction);
		}
	},
	/**
	 * 获取引用视图	
	 */
	getReferView : function() {
		var me = this;
		if (me.pageparams && me.pageparams.openerid) {
			return $.getIBizApp().getSRFView(me.pageparams.openerid);
		}
		return null;
	}
});
/*****************事件声明************************/
/**
 * 选中值变化
 */
MainViewControllerBase.CAPTIONCHANGED = 'CAPTIONCHANGED';
/**
 * 搜索视图控制器对象
 */
var SearchViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		if(config.autoLayout==undefined)
		{
			if(config.pcontroller)
			{
				config.autoLayout  = config.pcontroller.isAutoLayout();
			}
			else
				config.autoLayout = true;
		}
		arguments.callee.$.construct.call(this, config);
		var me = this;
	},
	/**
	 * 初始化
	 */
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		me.parentDataChanged = false;
		
		if(me.searchform){
			me.searchform.init();
			if(me.isLoadDefault())
			{
				me.searchform.autoLoad(me.viewparam);
			}
			if(me.hasQuickSearch() == true){
				me.searchform.close();
			}
			else
				{
					me.searchform.open();
				}
		}
		me.doLayout();
	},
	onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;
		
	
		var dataurl = me.getBackendUrl()+'srfctrlid=searchform&SRFSUBAPP='+me.subapp+'&';
		
		//初始化快速搜索
		if($('#'+this.getCId2()+'searchcond').length>0)
		{
			me.bQuickSearch = true;
			me.quickSearch = $('#'+this.getCId2()+'searchcond');
		}
		if(me.quickSearch){
			me.quickSearch.keyup(function() {
	            if (event.keyCode == "13") {
	            	me.onSearchFormSearched();
	            }
	        });
		}
		
		me.quickSearchBtn = $('#'+this.getCId2()+'searchbutton');
		if(me.quickSearchBtn){
			me.quickSearchBtn.click(function(e){
				me.onSearchFormSearched();
			});
		}
		me.moreSearchBtn = $('#'+this.getCId2()+'moresearchbutton');
		if(me.moreSearchBtn){
			me.moreSearchBtn.click(function(e){
				if(me.searchform){
					if(me.searchform.isOpen() == true){
						me.searchform.close();
					}else{
						me.searchform.open();
					}
					me.doLayout();
				}
			});
		}
		
		//初始化搜索面板
		if(me.hasHtmlElement('searchform')){
			me.searchform = me.createSearchForm({id:this.getCId2()+'searchform',url:dataurl,ctrler: me});
			me.registerItem('searchform',me.searchform);
			me.searchform.on(IBizSearchForm.FORMSEARCHED, function(sender, args, e) {
				me.onSearchFormSearched();
			}, me);
			me.searchform.on(IBizSearchForm.FORMRESETED, function(sender, args, e) {
				me.onSearchFormReseted();
			}, me);
			me.searchform.on(IBizForm.FORMFIELDCHANGED, function(sender, args, e) {
				var fieldname = '';
				if (sender != null) fieldname = sender.getName();
				if (!args) args = {};
				me.onSearchFormFieldChanged(fieldname, sender, args.newvalue, args.oldvalue);
			}, me);
		}
	},
	createSearchForm:function(config){
		return IBiz.createSearchForm(config);
	},
	hasQuickSearch:function(){
		var me = this;
		return me.bQuickSearch;
	},
	/**
	 * 获取搜索表单对象
	 */
	getSearchForm:function(){
		return this.searchform;
	},
	/**
	 * 搜索表单属性值发生变化
	 */
	onSearchFormFieldChanged: function(fieldname, field, value) {
		var me = this;
	},
	/**
	 * 搜索表单重置
	 */
	onSearchFormReseted:function(){
		
	},
	
	isLoadDefault: function() {
		return true;
	},
	getSearchCond: function() {
		if (this.getSearchForm()) {
			return this.getSearchForm().getValues();
		}
		return null;
	},
	onSearchFormSearched: function() {
	},
	onSearchFormReseted: function() {
	},
	/**
	 * 数据加载之前
	 */
	onStoreBeforeLoad: function(sender, args, e) {
		var me = this;
        var fetchParam = {};
        if (me.viewparam){
        	$.extend(fetchParam,me.viewparam);
        }
        if (me.getParentMode()) {
        	$.extend(fetchParam, me.getParentMode());
        }
        if (me.getParentData()) {
        	$.extend(fetchParam, me.getParentData());
        }
        if ((me.getSearchCond() && me.searchform.isOpen()) || !me.hasQuickSearch()) {
        	$.extend(fetchParam, me.getSearchCond());
        }
        //获取快速搜索里的搜索参数
        if(me.hasQuickSearch() && me.quickSearch){
        	args['search'] = me.quickSearch.val();
        }
        $.extend(args, fetchParam);
	}
	/**
	 * 数据加载之前
	 */
	,onStoreLoad: function(sender, args, e) {
		var me = this;
    	me.parentDataChanged = false;
    	me.reloadUICounters();
	}
	,
	onSetParentData: function() {
		arguments.callee.$.onSetParentData.call(this);
		this.parentDataChanged = true;
	}
	/**
	 * 数据被激活<最典型的情况就是行双击>
	 * @param record 记录
	 * @param e 事件
	 */
	,onDataActivated: function(record, e) {
		var me = this;
		
	}
});
/*****************事件声明************************/
/**
 * 多数据视图控制器对象
 */
var MDViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		if(config.autoLayout==undefined)
		{
			if(config.pcontroller)
			{
				config.autoLayout  = config.pcontroller.isAutoLayout();
			}
			else
				config.autoLayout = true;
		}
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.currentDataKey = null;
		me.multiSelect = config.multiselect;
		if(me.multiSelect==undefined){
			me.multiSelect=true;
		}
		me.isInGridRowEdit = false;
	},
	/**
	 * 初始化
	 */
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		me.parentDataChanged = false;
		
		var mdctrl = this.getMDCtrl();
		if (mdctrl) {
			mdctrl.on(IBizDataGrid.SELECTIONCHANGE, function(sender, args, e) {
				me.onSelectionChange(sender, args);
			}, me);
			mdctrl.on(IBizDataGrid.BEFORELOAD, function(sender, args, e) {
				me.onStoreBeforeLoad(sender, args,e);
			}, me);
			mdctrl.on(IBizDataGrid.LOADED, function(sender, args, e) {
				me.onStoreLoad(sender, args,e);
			}, me);
			mdctrl.on(IBizDataGrid.CHANGEEDITSTATE,function(sender, args, e){
				me.onGridRowEditChange(sender, args,e);
			},me);
		}
		if (me.getParentMode()) {
			me.doHideParentColumns(me.getParentMode());
		}	
		if(me.searchform){
			me.searchform.init();
			if(me.config.loaddefault != undefined && me.config.loaddefault)
				me.searchform.autoLoad(me.viewparam);
			if(me.hasQuickSearch() == true){
				me.searchform.close();
			}
			else
				{
					me.searchform.open();
				}
		}
		me.doLayout();
	},
	onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;
		
		//初始化快速搜索
		if(me.hasHtmlElement('searchcond'))
		{
			me.bQuickSearch = true;
			me.quickSearch = $('#'+this.getCId2()+'searchcond');
		}
		if(me.quickSearch){
			me.quickSearch.keyup(function() {
	            if (event.keyCode == "13") {
	            	me.onSearchFormSearched();
	            }
	        });
		}
		
		me.quickSearchBtn = $('#'+this.getCId2()+'searchbutton');
		if(me.quickSearchBtn){
			me.quickSearchBtn.click(function(e){
				me.onSearchFormSearched();
			});
		}
		me.moreSearchBtn = $('#'+this.getCId2()+'moresearchbutton');
		if(me.moreSearchBtn){
			me.moreSearchBtn.click(function(e){
				if(me.searchform){
					if(me.searchform.isOpen() == true){
						me.searchform.close();
					}else{
						me.searchform.open();
					}
					me.doLayout();
				}
			});
		}
		
		//初始化搜索面板
		if(me.hasHtmlElement('searchform')){
			var dataurl = me.getBackendUrl()+'srfctrlid=searchform&SRFSUBAPP='+me.subapp+'&';
			var sfCfg = $.extend({id:this.getCId2()+'searchform',url:dataurl,ctrler: me},me.config.ctrls.searchForm);
			me.searchform = me.createSearchForm(sfCfg);
			me.registerItem('searchform',me.searchform);
			me.searchform.on(IBizSearchForm.FORMSEARCHED, function(sender, args, e) {
				me.onSearchFormSearched();
			}, me);
			me.searchform.on(IBizSearchForm.FORMRESETED, function(sender, args, e) {
				me.onSearchFormReseted();
			}, me);
			me.searchform.on(IBizForm.FORMFIELDCHANGED, function(sender, args, e) {
				var fieldname = '';
				if (sender != null) fieldname = sender.getName();
				if (!args) args = {};
				me.onSearchFormFieldChanged(fieldname, sender, args.newvalue, args.oldvalue);
			}, me);
		}
	},
	createSearchForm:function(config){
		return IBiz.createSearchForm(config);
	},
	hasQuickSearch:function(){
		var me = this;
		return me.bQuickSearch;
	},
	/**
	 * 获取搜索表单对象
	 */
	getSearchForm:function(){
		return this.searchform;
	},
	
	getAllData:function(){
		var me = this;
		if(me.getMDCtrl()){
			return me.getMDCtrl().getAllData();
		}
		return [];
	},
	/**
	 * 搜索表单属性值发生变化
	 */
	onSearchFormFieldChanged: function(fieldname, field, value) {
		var me = this;
	},
	/**
	 * 搜索表单重置
	 */
	onSearchFormReseted:function(){
		
	},
	/**
	 * 数据加载之前
	 */
	onStoreBeforeLoad: function(sender, args, e) {
		var me = this;
        var fetchParam = {};
        if (me.viewparam){
        	$.extend(fetchParam,me.viewparam);
        }
        if (me.getParentMode()) {
        	$.extend(fetchParam, me.getParentMode());
        }
        if (me.getParentData()) {
        	$.extend(fetchParam, me.getParentData());
        }
        if ((me.getSearchCond() && me.searchform.isOpen()) || !me.hasQuickSearch()) {
        	$.extend(fetchParam, me.getSearchCond());
        }
        //是否有自定义查询
        if (me.searchform && me.searchform.isCustomSearch()) {
        	$.extend(fetchParam, me.searchform.getCustomSearchVal());
        }
        //获取快速搜索里的搜索参数
        if(me.hasQuickSearch() && me.quickSearch){
        	args['search'] = me.quickSearch.val();
        }
        $.extend(args, fetchParam,{ srfaction: 'fetch',SRFSUBAPP:me.subapp });
	},
	/**
	 * 数据加载之前
	 */
	onStoreLoad: function(sender, args, e) {
		var me = this;
    	var lastActive=null;
    	if(me.currentDataKey!=null && me.currentDataKey!='' && args && args.items){
    		
    		$.each(args.items,function(index,record){
    			if(record.srfkey == me.currentDataKey){
    				lastActive = record;
    				return false;
    			}
    		});
    	}
    	if(lastActive){
    		me.getMDCtrl().setSelection(lastActive);
    		me.calcToolbarItemState(true,lastActive.srfdataaccaction);
    	}else{
    		me.currentDataKey = null;
    		me.fireEvent(MDViewControllerBase.SELECTIONCHANGE, me, []);
    		me.calcToolbarItemState(false);
    	}
    	me.parentDataChanged = false;
    	
    	me.reloadUICounters();
	},
	/**
	 * 数据被激活<最典型的情况就是行双击>
	 * @param record 记录
	 * @param e 事件
	 */
	onDataActivated: function(record, e) {
		var me = this;
		if (!record || !record.srfkey){
			return;
		} 
		me.fireEvent(MDViewControllerBase.DATAACTIVATED, me, [record]);
		me.currentDataKey = record.srfkey;
		
		me.calcToolbarItemState(true,record.srfdataaccaction);
		me.onEditData({data: record});
	},
	/**
	 * 行选择变化
	 * @param sender 来源
	 * @param selected 选中数据
	 */
	onSelectionChange: function(sender, selected) {
		var me = this;
		if (selected == null || selected.length == 0){
			me.currentDataKey = null;
		}else{
			me.currentDataKey = selected[0].srfkey;
		}
		me.fireEvent(MDViewControllerBase.SELECTIONCHANGE, me, selected);
		me.calcToolbarItemState(me.currentDataKey != null,(me.currentDataKey != null)?selected[0].srfdataaccaction:null);
	},
	/**
	 * 改变工具栏启用编辑按钮信息
	 */
	onGridRowEditChange: function(sender, args,e){
		var me = this;
		var editButton = null;
		var submitButton = null;
		if (this.toolbar && this.toolbar.items) {
			$.each(this.toolbar.items, function(index, ele) {
				if(ele.attr("data-ibiz-tag")=="NewRow")
					submitButton = ele;
				if(ele.attr("data-ibiz-tag")=="ToggleRowEdit")
					editButton = ele;
			});
		}
		me.isInGridRowEdit=args.state;
		if(editButton){
			if(!args.state){
				editButton.find("span").html($IGM('MDVIEWCONTROLLER.ONGRIDROWEDITCHANGE.ENABLE','启用编辑'));
			}else{
				editButton.find("span").html($IGM('MDVIEWCONTROLLER.ONGRIDROWEDITCHANGE.ENABLE2','关闭编辑'));
			}
		}
		if(submitButton)
			submitButton[0].disabled = !args.state;
	},
	/**
	 * 计算工具栏项状态-<例如 根据是否有选中数据,设置 工具栏按钮是否可点击>
	 * 
	 * @param hasdata
	 *            是否有数据
	 */
	calcToolbarItemState : function(hasdata,dataaccaction) {
		var me = this;
		arguments.callee.$.calcToolbarItemState.call(this,hasdata,dataaccaction);
		if (this.toolbar && this.toolbar.items) {
			$.each(this.toolbar.items, function(index, ele) {
				if(ele.attr("data-ibiz-tag")=="NewRow"){
					if(me.isInGridRowEdit){
						ele[0].disabled = false;
					}else{
						ele[0].disabled = true;
					}
				}
			});
		}
	},
	/**
	 * 表单权限发生变化
	 */
	onDataAccActionChange:function(dataaccaction){
		var me = this;
		if(me.getToolbar())
			me.getToolbar().updateAccAction(dataaccaction);
		if(me.mintoolbar)
			me.mintoolbar.updateAccAction(dataaccaction);
		if(me.floattoolbar)
			me.floattoolbar.updateAccAction(dataaccaction);
	},
	/**
	 * 新建数据
	 */
	onNewData: function() {
		var me = this;
		var loadParam = {};
		if (me.getViewParam()) {
			$.extend(loadParam, me.getViewParam());
		}
		if (me.getParentMode()) {
			$.extend(loadParam, me.getParentMode());
		}
		if (me.getParentData()) {
			$.extend(loadParam, me.getParentData());
		}
		if(me.isInGridRowEdit){
			me.doNewRow(loadParam);
			return;
		}
		if (me.isEnableBatchAdd()) {
			me.doNewDataBatch(loadParam);
			return;
		}
		if (me.doNewDataWizard(loadParam)) {
			return;
		}
		me.doNewDataNormal(loadParam);
	},
	/**
	 * 批量新建
	 */
	doNewDataBatch: function(arg) {
		var me = this;
		var mpickupview = me.getMPickupView(arg);
		if (mpickupview){
			var win = $.getIBizApp().createWindow({});
			var viewparam = {};
			$.extend(viewparam, mpickupview.viewparam);
			if(!viewparam.srfreferdata){
				if(viewparam.srfparentdata)
				{
					viewparam.srfreferdata = viewparam.srfparentdata;
					delete viewparam.srfparentdata;
				}
			}
			viewparam['windowid'] = win.getId();
			viewparam['openerid'] = me.getId();
			win.title = mpickupview.title;
			win.scope = me;
			win.height = mpickupview.height?mpickupview.height:0;
			win.width = mpickupview.width?mpickupview.width:0;
			win.url = $.getIBizApp().parseURL2(mpickupview.subapp,mpickupview.viewurl,{windowid:win.getId(),openerid:me.getId()});
			win.viewparam = viewparam;
			win.callback =  me.onMPickupWindowClose;
			if(mpickupview.modal){
				 win.openModal(window);
			}else{
				 win.openInNewWindow(window);
			}
            
	        return true;
		}
		return false;
	},
	/**
	 * 批量新建关闭
	 */
	onMPickupWindowClose: function(win) {
		var me = win.scope;
		var loadParam = win.userData;
		var dialogResult = win.dialogResult;
		if (!dialogResult) return;
		if (dialogResult == 'ok') {
			var selectedDatas = win.selectedDatas;
			if (!selectedDatas) {
				return;
			}
			me.addDataBatch(selectedDatas);
		}
		return;
	},
	/**
	 * 批量添加数据
	 */
	addDataBatch: function(selectedDatas) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.ADDDATABATCH.INFO','[addDataBatch]方法必须重写！'),2);
	},
	/**
	 * 向导新建数据
	 */
	doNewDataWizard: function(arg) {
		var me = this;
		var wizardview = me.getNewDataWizardView(arg);
		if (wizardview != null) {
			var win = $.getIBizApp().createWindow({});
			var viewparam = {};
			viewparam['windowid'] = win.getId();
			viewparam['openerid'] = me.getId();
			win.title = wizardview.title;
			win.scope = me;
			win.height = wizardview.height?wizardview.height:0;
			win.width = wizardview.width?wizardview.width:0;
			win.url = $.getIBizApp().parseURL2(wizardview.subapp,wizardview.viewurl,{windowid:win.getId(),openerid:me.getId()});
			win.viewparam = viewparam;
			win.callback =  me.onNewDataWizardWindowClose;
            if(wizardview.modal){
   			 	win.openModal(window);
	   		}else{
	   			win.openInNewWindow(window);
	   		}
	        return true;
		}
		return false;
	},
	/**
	 * 向导新建数据窗口关闭
	 */
	onNewDataWizardWindowClose: function(win, eOpts) {
		var me = win.scope;
		var loadParam = {};//win.userData;
		var dialogResult = win.dialogResult;
		if (!dialogResult) return;
		if (dialogResult == 'ok') {
			var selectedData = win.selectedData;
			if (selectedData) {
				var newMode = selectedData.srfkey;
				loadParam.srfnewmode = newMode;
				var view = me.getNewDataView(loadParam);
				if (view == null){
					return;
				}
				me.openDataView(view);
			}
		}
		return;
	},
	/**
	 * 常规新建数据
	 */
	doNewDataNormal: function(arg) {
		var me = this;
		var view = me.getNewDataView(arg);
		if (view == null){
			return false;
		}
		return me.openDataView(view);
	},
	/**
	 * 编辑数据
	 */
	onEditData: function(arg) {
		var me = this;
		var loadParam = {};
		if (me.getViewParam()) {
			$.extend(loadParam, me.getViewParam());
		}
		if (this.getParentMode()) {
			$.extend(loadParam, me.getParentMode());
		}
		if (this.getParentData()) {
			$.extend(loadParam, me.getParentData());
		}
		if (arg.srfcopymode) {
			$.extend(loadParam, {
				srfsourcekey: arg.data.srfkey
			});
		} else {
			$.extend(loadParam, {srfkey: arg.data.srfkey});
		}
		
		var editMode = me.getEditMode(arg.data);
		if (editMode) {
			loadParam.srfeditmode = editMode;
		}
		if(arg.data.srfmstag){
			loadParam.srfeditmode2 = arg.data.srfmstag;
		}
		
		loadParam.openerid = me.getId();
		me.doEditDataNormal(loadParam);
	},
	/**
	 * 执行常规编辑数据
	 */
	doEditDataNormal: function(arg) {
		var me = this;
		var view = me.getEditDataView(arg);
		if (view == null) {
			return false;
		}
		return me.openDataView(view);
	},
	/**
	 * 打开数据视图
	 */
	openDataView: function(view) {
		var me = this;
		var openMode = view.openMode;
		if (openMode != undefined) {
			if (openMode == 'POPUPMODAL') {
				view.modal = true;
			} else if (openMode == 'POPUP') {
				view.modal = true;
			} else if (openMode == '' || openMode == 'INDEXVIEWTAB') {
				view.modal = false;
			}
		}
		if (me.isShowModal()) {
			view.modal = true;
		}
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = view.viewparam;
		if(!viewparam){
			viewparam = {};
		}
		viewparam['windowid'] = win.getId();
		viewparam['openerid'] = me.getId();
		win.title = view.title;
		win.scope = me;
		win.height = view.height?view.height:0;
		win.width = view.width?view.width:0;
		win.url = $.getIBizApp().parseURL2(view.subapp,view.viewurl,{windowid:win.getId(),openerid:me.getId()});
		win.viewparam = viewparam;
		if(view.modal){
			 win.openModal(window);
		}else{
			 win.openInNewWindow(window);
		}
       
        
        return true;
	},
	/**
	 * 获取编辑模式
	 */
	getEditMode: function(data) {
		return data.srfdatatype;
	},
	/**
	 * 获取编辑视图
	 */
	getEditDataView: function(arg) {
		return null;
	},
	/**
	 * 获取新建视图
	 */
	getNewDataView: function(arg) {
		return null;
	},
	/**
	 * 获取新建向导视图
	 */
	getNewDataWizardView: function(arg) {
		return null;
	},
	/**
	 * 获取多选视图
	 */
	getMPickupView: function(arg) {
		return null;
	},
	/**
	 * 获取多数据对象
	 */
	getMDCtrl: function() {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.GETMDCTRL.INFO','[getMDCtrl]方法必须重写！'),2);
	},
	isLoadDefault: function() {
		return true;
	},
	isEnableBatchAdd: function() {
		return false;
	},
	isBatchAddOnly: function() {
		return false;
	},
	onRefresh: function() {
		arguments.callee.$.onRefresh.call(this);
		var me = this;
		if (me.getMDCtrl()) {
			me.getMDCtrl().load();
		}
	},
	onSetParentData: function() {
		arguments.callee.$.onSetParentData.call(this);
		this.parentDataChanged = true;
	},
	getSearchCond: function() {
		if (this.getSearchForm()) {
			return this.getSearchForm().getValues();
		}
		return null;
	},
	onSearchFormSearched: function() {
		if (this.getMDCtrl()) {
			this.getMDCtrl().load();
		}
	},
	onSearchFormReseted: function() {
		if (this.getMDCtrl()) {
			this.getMDCtrl().load();
		}
	},
	doDEUIAction: function(uiaction,params) {
		var me = this;
		if (uiaction.tag == 'Help') {
			me.doHelp(params);
			return;
		}
		if (uiaction.tag == 'Edit') {
			me.doEdit(params);
			return;
		}
		if (uiaction.tag == 'View') {
			me.doView(params);
			return;
		}
		if (uiaction.tag == 'Print') {
			
			me.doPrint(params);
			return;
		}
		if (uiaction.tag == 'ExportExcel') {
			me.doExportExcel(params);
			return;
		}
		if (uiaction.tag == 'ExportModel') {
			me.doExportModel(params);
			return;
		}
		if (uiaction.tag == 'Copy') {
			me.doCopy(params);
			return;
		}
		if (uiaction.tag == 'Remove') {
			me.doRemove(params);
			return;
		}
		if (uiaction.tag == 'Import') {
			me.doImport(params);
			return;
		}
		if (uiaction.tag == 'Refresh') {
			me.doRefresh(params);
			return;
		}
		if (uiaction.tag == 'NewRow') {
			me.doCheck(params);
			return;
		}
		if (uiaction.tag == 'New') {
			me.doNew(params);
			return;
		}
		if (uiaction.tag == 'ToggleRowEdit') {
			me.doToggleRowEdit(params);
			return;
		}
		arguments.callee.$.doDEUIAction.call(me, uiaction,params);
	},
	doToggleRowEdit: function(params) {
		var me = this;
		if(me.getMDCtrl() && typeof(me.getMDCtrl().isOpenEdit) == 'function')
			me.getMDCtrl().isOpenEdit(params);
	},
	doNewRow: function(params) {
		var me = this;
		if(me.getMDCtrl() && typeof(me.getMDCtrl().newRowAjax) == 'function')
			me.getMDCtrl().newRowAjax(params);
	},
	doCheck: function(params){
		var me = this;
		if(me.getMDCtrl() && typeof(me.getMDCtrl().quitEdit) == 'function')
			me.getMDCtrl().quitEdit();
	},
	doHelp: function() {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOHELP.INFO','帮助操作'),0);
	},
	/*编辑操作*/
	doEdit: function(params) {
		var me = this;
		//获取要编辑的数据集合
		if(params && params.srfkey){
			if($.isFunction(me.getMDCtrl().findItem)){
				params = me.getMDCtrl().findItem('srfkey',params.srfkey);
			}
			var arg = {data: params};
			me.onEditData(arg);
			return;
		}
		var selectedData = me.getMDCtrl().getSelection();
		if (selectedData == null || selectedData.length == 0) return;
		var arg = {
			data: selectedData[0]
		};
		me.onEditData(arg);
	},
	/*查看操作*/
	doView: function(params) {
		this.doEdit(params);
	},
	/*打印操作*/
	doPrint: function() {
		var me=this;
		var arg={};
		var bSingle=true;
		var selectedData = me.getMDCtrl().getSelection();
		if (!(selectedData == null || selectedData.length == 0)) {
			var keys = '';
			if(bSingle){
				keys = selectedData[0].srfkey;
			}else{
				$.each(selectedData,function(index,item){
					var key = item.srfkey;
					if (keys != '') keys += ';';
					keys += key;
				});
			}
			arg.srfkeys = keys;
		}
		else
			return;
		me.onPrintData(arg);
	},
	/*导出操作（Excel）*/
	doExportExcel: function(params) {
		if(params.itemtag == ''){
			
		}
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOEXPORTEXCEL.INFO','导出操作（Excel）'),0);
	},
	/*导出数据模型*/
	doExportModel: function(params) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOEXPORTMODEL.INFO','导出数据模型'),0);
	},
	/*拷贝操作*/
	doCopy: function(params) {
		var me = this;
		//获取要拷贝的数据集合
		var selectedData = me.getMDCtrl().getSelection();
		if (selectedData == null || selectedData.length == 0) return;
		var arg = {
			data: selectedData[0],
			srfcopymode: true
		};
		me.onEditData(arg);
	},
	/*删除操作*/
	doRemove: function(params) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOREMOVE.INFO','删除操作'),0);
	},
	/*数据导入栏*/
	doImport: function(params) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('MDVIEWCONTROLLER.DOIMPORT.INFO','数据导入栏'),0);
	},
	/*刷新操作*/
	doRefresh: function(params) {
		this.refresh();
	},
	/*新建操作*/
	doNew: function(params) {
		var me = this;
		me.onNewData(params);
	},
	doWFUIAction: function(uiaction,params) {
		var me = this;
		if (uiaction.actionmode == 'WFBACKEND') {
			var selectedData = me.getMDCtrl().getSelection();
			if (selectedData == null || selectedData.length == 0){
				return;
			}
			var keys = '';
			$.each(selectedData,function(index,item){
				var key = item.srfkey;
				if (keys != '') keys += ';';
				keys += key;
			});
			
			me.getMDCtrl().wfsubmit({srfwfiatag: uiaction.tag,srfkeys:keys});
			return;
		}
		arguments.callee.$.doWFUIAction.call(this,uiaction,params);
	},
	onWFUIFrontWindowClosed:function(win,data){
		var me = this;
		me.load();
	},
	
	/**
	 * 获取UI操作参数
	 */
	getFrontUIActionParam: function(uiaction,params) {
		var me = this;
		var arg = arguments.callee.$.getFrontUIActionParam.call(this, uiaction);
		if (me.getParentMode()) {
			$.extend(arg, me.getParentMode());
		}
		if (me.getParentData()) {
			$.extend(arg, this.getParentData());
		}
		var target = 'NONE';
		if (uiaction.actiontarget) {
			target = uiaction.actiontarget;
		}
		if (target != 'NONE'){
			var selectedData = me.getMDCtrl().getSelection();
			if (!(selectedData == null || selectedData.length == 0)) {
				if(target == 'SINGLEKEY'){
					arg.srfkeys = selectedData[0].srfkey;
				}else if(target == 'SINGLEDATA'){
					$.extend(arg, selectedData[0]);
				}else if(target == 'MULTIKEY'){
					var keys = '';
					$.each(selectedData,function(index,item){
						var key = item.srfkey;
						if (keys != '') 
							keys += ';';
						keys += key;
					});
					arg.srfkeys = keys;
				}
			}
		}
		return arg;
	},
	getBackendUIActionParam: function(uiaction,params) {
		var me = this;
		var arg = {};
		if (me.getParentMode()) {
			$.extend(arg, me.getParentMode());
		}
		if (me.getParentData()) {
			$.extend(arg, this.getParentData());
		}
		var bSingle = false;
		if (uiaction.actiontarget == 'SINGLEKEY') {
			bSingle = true;
		}
		var selectedData = me.getMDCtrl().getSelection();
		if (!(selectedData == null || selectedData.length == 0)) {
			var keys = '';
			if(bSingle){
				keys = selectedData[0].srfkey;
			}else{
				$.each(selectedData,function(index,item){
					var key = item.srfkey;
					if (keys != '') keys += ';';
					keys += key;
				});
			}
			arg.srfkeys = keys;
		}
		return arg;
	},
	/*移动记录*/
	moveRecord: function(target) {
		var me = this;
		var store = me.getMDCtrl().getStore();
		if (!store.isLoaded()) return null;
		var nCount = store.getCount();
		var nIndex = 0;
		var nLastIndex = -1;
		var selectedData = me.getMDCtrl().getSelection();
		if (!(selectedData == null || selectedData.length == 0)) {
			nIndex = store.indexOf(selectedData[0]);
			nLastIndex = nIndex;
		}
		if (typeof target == 'string') {
			if (target == 'first') nIndex = 0;
			else if (target == 'prev') nIndex -= 1;
			else if (target == 'next') nIndex += 1;
			else if (target == 'last') nIndex = nCount - 1;
		}
		if (nIndex < 0 || nIndex >= nCount) return null;
		if (nIndex == nLastIndex) return null;
		var record = store.getAt(nIndex);
		me.getMDCtrl().setSelection(record);
		return record;
	},
	doBackendUIAction: function(arg) {
		var me = this;
		me.getMDCtrl().doUIAction(arg);
	},
	/*隐藏关系列*/
    doHideParentColumns: function (parentMode) {
    },
    onPrintData:function(arg){
    	var me=this;
    	me.doPrintDataNormal(arg);
    },
    /**
	 * 常规新建数据
	 */
	doPrintDataNormal: function(arg) {
		var me = this;
		var view = me.getPrintDataView(arg);
		if (view == null){
			return false;
		}
		var viewurl=view.viewurl;
		if(!viewurl||viewurl==''){
			viewurl = BASEURL+'/ibizutil/print.pdf';
		}
		else
		{
			viewurl = BASEURL+viewurl;
		}
		viewurl = viewurl + (viewurl.indexOf('?')==-1?'?':'&') + $.param(view.viewparam);
		window.open(viewurl, '_blank');
		return true;
	},
	getPrintDataView:function(arg){
		return null;
	},
	isEnableMultiSelect:function(){
    	return this.multiSelect;
    },
    setEnableMultiSelect:function(multiSelect){
    	this.multiSelect = multiSelect;
    }
});
/*****************事件声明************************/
/**
 * 数据激活<例如：表格行双击>
 */
MDViewControllerBase.DATAACTIVATED = 'DATAACTIVATED';
/**
 * 数据选择变化
 */
MDViewControllerBase.SELECTIONCHANGE = 'SELECTIONCHANGE';
