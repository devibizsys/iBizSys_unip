﻿var IBizApp_Data = null;
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
	