<%@page contentType="text/html;charset=UTF-8"%>
<jsp:useBean id="page1" scope="page" class="net.ibizsys.pswf.web.util.WFTraceChartPage" />
<% if(!page1.init(pageContext)) return;%>
<!doctype html>
<html>
    <head>
        <title>工作流流程图</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no"/>
		<link rel="stylesheet" href="../assets/jsplumb/css/jsplumb.css">
		<link rel="stylesheet" href="../assets/jsplumb/flowchataction.css">
    </head>
    <body data-demo-id="flowchart" data-library="dom">
		<div class="flowchart-demo" id="flowchart-demo"  style="height:6000px;border:1px solid #D9D9D9;">
		</div>
         
		<script src="https://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
        <script src="https://cdn.bootcss.com/jsPlumb/1.7.2/jquery.jsPlumb.js"></script>
    	<script src="../assets/jsplumb/flowchataction.js"></script>
    <script>
	
    var _fl;
	var _flReady = false;
	var _parentObj = null;
	var _nodeMap = {};
	var _nodeMap2 = {};
	var _linkMap = {};
	var _linkMap2 = {};
	var _linkMap3 = {};
	var _addConnection = false;
	var _removeConnection = false;
	var _lastLogicLink = null;
	var _draftConnection = null;
	
	var parentCtrler;
	var activeItem;
	function init(controller)
	{
		parentCtrler = controller;
	}
	
	function moveItemToCenter(item)
	{
		activeItem = item;
		
		//判断item 的高宽是否超过界面，如果超过则滚动
	}
	function onNodesLoaded()
	{
		var cDiv = $('#flowchart-demo');
		var activeItem;
		$.each(_nodeMap,function(key,item){
			if(item.active == true){
				activeItem = item;
				return false;
			}
		});
		if(activeItem){
			if(activeItem.leftpos > cDiv.prop("scrollWidth")){
				$(document).scrollLeft(400);
			}
			if(activeItem.leftpos > cDiv.prop("scrollWidth")){
				$(document).scrollLeft(activeItem.leftpos);
			}
			if(activeItem.toppos > parentCtrler.getframeHeight()){
				$(document).scrollTop(activeItem.toppos);
			}
		}
	}
	
	jsPlumb.ready(function() {

		var _jsInstance = jsPlumb.getInstance({
			Endpoint : ["Dot", {radius:4}],
			HoverPaintStyle : {strokeStyle:"#1e8151", lineWidth:5 },
			ConnectionOverlays : [
				[ "Arrow", {
					location:1,
					id:"arrow",
	                length:14,
	                foldback:0.8
				} ],
	            [ "Label", { label:"未命名", id:"label", cssClass:"aLabel" }]
			],
			Container:"flowchart-demo"
		});
		
	//	_jsInstance.bind('click',function(obj, originalEvent){alert('click');});
		_jsInstance.bind('dblclick',function(obj, originalEvent){
			console.log('dblclick');
			console.log(obj)
			
			var linkid=obj.getId();
			if(linkid==null)
				return;
			_logicLink = _linkMap[linkid];
			if(_logicLink && _parentObj)
			{
				_parentObj.editLink(_logicLink);	 
			}
		});
		_jsInstance.bind('connection',function(obj, originalEvent){
			console.log('connection');
			console.log(obj)
			
			if (obj.component != undefined) 
				obj = obj.component;
			
			var linkid= obj.connection.getId();
			if(linkid==null)
				return;
			
			if(_addConnection)
			{
				//现有连接
				_linkMap[linkid] = _lastLogicLink;
				_linkMap2[_lastLogicLink.pswflinkid] = linkid;
				_linkMap3[linkid] = obj;
				var overlays = obj.connection.getOverlays();
				
				var connname = _lastLogicLink.label;
//				if(!connname)
//					connname = _lastLogicLink.pswflinkname;
				
				overlays[1].setLabel(connname);
				return;
			}
			else
			{
				//判断linkid是否存在
				if(_linkMap[linkid])
				{
					_linkMap3[linkid] = obj;
					return;
				}
				
				var srcid= obj.source.id;
				var srcobj = _nodeMap[srcid];
				
				var dstid=obj.target.id;
				var dstobj = _nodeMap[dstid];
				
				if(!srcobj && !dstobj)
					return;
				
				var srcanchor =obj.sourceEndpoint.anchor.type;
				var dstanchor =obj.targetEndpoint.anchor.type;
				
				var arg = {frompswfprocid:srcobj.pswfprocessid,topswfprocid:dstobj.pswfprocessid,srcendpoint:srcanchor,dstendpoint:dstanchor};
				
				_draftConnection = obj;
				console.log(arg);
				 if(_parentObj)
		      	 {
					  _parentObj.addLink(arg);	 
		         }
			}
		}
		);
		_jsInstance.bind('connectionDetached',function(obj, originalEvent){
				console.log('connectionDetached');
				if (obj.component != undefined) 
					obj = obj.component;
				
				var linkid= obj.connection.getId();
				if(linkid==null)
					return;
				
				if(!_removeConnection)
				{
					var linkobj = _linkMap[linkid];
					delete _linkMap[linkid];
					delete _linkMap2[linkobj.pswflinkid];
					delete _linkMap3[linkid];
					
					if(_parentObj)
			      	{
						_parentObj.removeLink(linkobj);	 
			        }
				}
			}
		);
		
		
		_jsInstance.bind('endpointClick',function(obj, originalEvent){console.log('endpointClick');});
		_jsInstance.bind('endpointDblClick',function(obj, originalEvent){console.log('endpointDblClick');});
		
		_fl = new SRFFlowChat(document.getElementById('flowchart-demo'),_jsInstance);
		_flReady = true;
		if(_parentObj)
		{
			_parentObj.loadConfig(); 
		}
/*	    
		//处理
		$('#flowchart-demo').on('mouseenter','.wfprocess',function(){
			$(this).append("<img src='img/icon_close.png'  style='position: absolute;' />");
			$("img").css("left",146).css("top",-8);
		});
		$('#flowchart-demo').on('mouseleave','.wfprocess',function(){$("img").remove();});

		$('#flowchart-demo').on('mouseenter','.wfend',function(){
			$(this).append("<img src='img/icon_close.png'  style='position: absolute;' />");
			$("img").css("left",19).css("top",-7);
		});
		$('#flowchart-demo').on('mouseleave','.wfend',function(){$("img").remove();});
		
		$('#flowchart-demo').on("click", "img",function(){

			               if (confirm("确定要删除吗？")){
			            	   var id=$(this).parent().attr("id");
			            	   _fl.jsInstance.remove(id);
			            	   if(_parentObj)
			            	   {
			            		   var obj = _nodeMap[id];
			            		   _parentObj.removeProcess(obj);
			            	   }
			               }
		});*/
		
		
		<%=page1.outputScript()%>
		onNodesLoaded();
	});
	

	function setParentObj(obj)
	{
		_parentObj = obj;
		if(_flReady)
		{
			_parentObj.loadConfig(); 
		}
	}
	function addTooltip(div,obj){
		if(div && obj && obj.tips){
			$(div).attr('title',obj.tips);
		}
	}
	function addProcess(obj)
	{
		console.log('addProcess');
		
		var leftPos = obj.leftpos;
		var topPos = obj.toppos;
		if(!leftPos)
		{
			leftPos = Math.floor(Math.random() * ( 800 + 1));
		}
		if(!topPos)
		{
			topPos = Math.floor(Math.random() * ( 400 + 1));
		}
		var arg={left:leftPos,top:topPos,label:obj.pswfprocessname};
		
		var wfprocesstype = obj.wfprocesstype;
		if(wfprocesstype=='START')
		{
			var div= _fl.addBeginPoint(arg);
			if(div)
			{
				addTooltip(div,obj);
				_nodeMap[div.id]=obj;
				_nodeMap2[obj.pswfprocessid]=div.id;
			}
			return;
		}
		
		if(wfprocesstype=='END')
		{
			var div= _fl.addEndPoint(arg);
			if(div)
			{
				addTooltip(div,obj);
				_nodeMap[div.id]=obj;
				_nodeMap2[obj.pswfprocessid]=div.id;
			}
			return;
		}
		
		arg.count = obj.count;
		arg.active = obj.active;
		
		var div= _fl.addProcessPoint(arg);
		if(div)
		{
			addTooltip(div,obj);
			_nodeMap[div.id]=obj;
			_nodeMap2[obj.pswfprocessid]=div.id;
			              
			$(div).dblclick(function(){
				var obj = _nodeMap[this.id];
				//alert('divdblclick  '+obj.pswfprocessid);
				if(parentCtrler)
				{
					//parentCtrler.onChartClickItem(obj);
				};
			});
			$(div).click(function(){
				var obj = _nodeMap[this.id];
				//alert('divdblclick  '+obj.pswfprocessid);
				if(parentCtrler)
				{
					parentCtrler.onChartClickItem(obj);
				};
			});
			
			

		/*	var endpoint = _fl.jsInstance.getEndpoints(div);
			console.log(endpoint);
			if(endpoint)
			{
				endpoint.bind('dblclick',function(endpoint, originalEvent){
					alert(endpoint);
				});
			}*/
		}
		return;
	}
	
	function updateProcessPos(obj)
	{
		console.log('updateProcessPos');
		var divid = _nodeMap2[obj.pswfprocessid];
		if(!divid)
			return;
		var div=$('#'+divid)[0];
		if(!div)
			return;
		if(div.style.left)
		{
			var pos=div.style.left;
			pos = pos.replace('px','')
			obj.leftpos = parseInt(pos);
		}
		if(div.style.top)
		{
			var pos=div.style.top;
			pos =  pos.replace('px','')
			obj.toppos = parseInt(pos);
		}
	}
	function updateProcess(obj)
	{
		console.log('updateProcess');
		
		var divid = _nodeMap2[obj.pswfprocessid];
		if(!divid)
			return;
		_nodeMap[divid]=obj;
		
		var wfprocesstype = obj.wfprocesstype;
		if(wfprocesstype=='START')
		{
			return;
		}
		//更新文字
		var arg={label:obj.pswfprocessname};
		$('#'+divid)[0].innerHTML = _fl.getProcessContent(arg);
		
	}
	
	function removeProcess(obj)
	{
		var divid = _nodeMap2[obj.pswfprocessid];
		if(!divid)
			return;
		
		_nodeMap2[obj.pswfprocessid] = null;
		_nodeMap[divid] = null;
		delete _nodeMap[divid];
		delete _nodeMap2[obj.pswfprocessid];
		
		_fl.jsInstance.remove(divid);
	}
	
	function addConnection(obj)
	{
		console.log('addConnection');
		
		var srcid = _nodeMap2[obj.frompswfprocid];
		var dstid = _nodeMap2[obj.topswfprocid];
		if(srcid && dstid)
		{
			_lastLogicLink = obj;
			_addConnection = true;
			
			var srcanchor = obj.srcendpoint;
			var dstanchor = obj.dstendpoint;
			if(!srcanchor||srcanchor=='')
			{
				srcanchor = "BottomCenter";
			}
			if(!dstanchor||dstanchor=='')
			{
				dstanchor = "TopCenter";
			}
			
 			var args={uuids:[srcid+srcanchor,dstid+dstanchor], editable:true};
			_fl.addConnection(args);
			_addConnection = false;
			_lastLogicLink = null;
			
		}
		else
		{
			console.log('连接无效');
			console.log(obj)
		}
	}
	
	
	function removeConnection(obj)
	{
		console.log('removeConnection');
		if(!_draftConnection)
			return;
		
		_removeConnection = true;
		jsPlumb.detach(_draftConnection);
		_draftConnection = null;
		_removeConnection = false;
	}
	
	function updateConnection(obj)
	{
		console.log('updateConnection');
		
		var linkid= _linkMap2[obj.pswflinkid];
		if(!linkid)
		{
			if(!_draftConnection)
				return;
			
			linkid = _draftConnection.connection.getId();
			
			//现有连接
			_linkMap[linkid] = obj;
			_linkMap2[obj.pswflinkid] = linkid;
			_linkMap3[linkid] = _draftConnection;
			var overlays = _draftConnection.connection.getOverlays();
			
			var connname = obj.label;
//			if(!connname)
//				connname = obj.pswflinkname;
			
			
			overlays[1].setLabel(connname);
			_draftConnection = null;
			return;
		}
		else
			{
				_linkMap[linkid] = obj;
				var conn = _linkMap3[linkid];
				var overlays = conn.connection.getOverlays();
				
				var connname = obj.label;
//				if(!connname)
//					connname = obj.pswflinkname;
				
				overlays[1].setLabel(connname);
			}
	}
	
	function updateConnectionPos(obj)
	{
		console.log('updateConnectionPos');
		var linkid= _linkMap2[obj.pswflinkid];
		if(!linkid)
		{
			return;
		}
		
		var conn = _linkMap3[linkid];
		
		var srcid= conn.source.id;
		var srcobj = _nodeMap[srcid];
		
		var dstid=conn.target.id;
		var dstobj = _nodeMap[dstid];
		
		if(!srcobj && !dstobj)
			return;
		
		var srcanchor =conn.sourceEndpoint.anchor.type;
		var dstanchor =conn.targetEndpoint.anchor.type;
		
		
		obj.frompswfprocid=srcobj.pswfprocessid;
		obj.topswfprocid=dstobj.pswfprocessid;
		obj.srcendpoint=srcanchor;
		obj.dstendpoint=dstanchor;
		
	}
	
	function exportModel()
	{
		console.log('exportModel');
	}
	
	 function resetAll()
	 {
		 var _back = _parentObj;
		 _parentObj = null;
		 _fl.jsInstance.detachEveryConnection();
		 for (id in _nodeMap) {
			  _fl.jsInstance.remove(id);
		 }
		 _fl.startEL = null;
		 _fl.endEL = null;
		 _nodeMap = {};
		 _nodeMap2 = {};
		 _linkMap = {};
		 _linkMap2 = {};
		 _linkMap3 = {};
		 _draftConnection = null;
		 _parentObj = _back;
	 }
	
    </script>
    
    </body>
</html>
