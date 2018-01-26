function SRFFlowChat(elementid, jsInstance) {
	var processIndex = 1;
	var currentLine;
	var lastClickLine = false;

	this.jsInstance = jsInstance;

	this.startEL;
	this.endEL;

	this.content = elementid;
	
	var stateMachineConnector = {
            connector: "Flowchart",
            paintStyle: { lineWidth: 1, strokeStyle: "black" },
            hoverPaintStyle: { strokeStyle: "#dbe300" },
            endpoint: "Blank",
            anchor: "Continuous"
        };
	
	var connectorPaintStyle = {
			lineWidth: 1,
			strokeStyle: "black",
			joinstyle:"round"
//				,
//			outlineColor: "#096EBB",
//			outlineWidth: 1
		};
	
	var connectorHoverStyle = {
			lineWidth: 2,
			strokeStyle: "#dbe300",
//			,outlineColor: "#dbe300",
//			outlineWidth: 1
		};
	
	/**
	 * 源锚点
	 */
	var sourceEndpoint = {
		endpoint : "Dot",
		paintStyle : {
			fillStyle : "#FC040A",
			radius : 1
		},
		maxConnections : -1,
		isSource : true,
		connector:[ "Flowchart", { stub:[40, 60], gap:10, cornerRadius:5, alwaysRespectStubs:true} ],
		connectorStyle: connectorPaintStyle
		,connectorHoverStyle: connectorHoverStyle,
		//,		hoverPaintStyle: endpointHoverStyle
		//,connectorHoverStyle: connectorHoverStyle
	};

	/**
	 * 目标锚点
	 */
	var targetEndpoint = {
		endpoint : "Dot",
		paintStyle : {
			fillStyle : "#7AB02C",
			radius : 1
		},
		maxConnections : -1,
		dropOptions : {
			hoverClass : "hover",
			activeClass : "active"
		},
		isTarget : true,
		beforeDrop : function(params) {
			return beforeLineAdd(params);
		}
	};
	/**
	 * 添加开始节点
	 */
	this.addBeginPoint = function(nodeArg) {
		if (this.content == undefined)
			return null;

		if (this.startEL != undefined) {
			alert('开始节点已经添加过.');
			return null;
		}
		var elId = 'SRFBEGIN';
		var elPointId = 'SRFBEGINBottomCenter';

		var _el = document.createElement('div');

		_el.setAttribute('class', 'wfstart');
		_el.setAttribute('id', elId);
		
		var _style = 'left:'+nodeArg.left.toString()+'px;top:'+nodeArg.top.toString()+'px;';
		if(_style){
			_el.setAttribute('style', _style);
		}
		this.startEL = _el;

		this.content.appendChild(_el);

		this.jsInstance.addEndpoint(elId, sourceEndpoint, {
			anchor : 'BottomCenter',
			uuid : elPointId
		});
		this.jsInstance.draggable(_el, {
			grid : [ 5, 5 ]
		});
		return _el;
	};

	/**
	 * 添加结束节点
	 */
	this.addEndPoint = function(nodeArg) {
		if (this.content == undefined)
			return null;

		var elId = this.makeUUID();
		
//		if (this.endEL != undefined) {
//			alert('结束节点已经添加过.');
//			return null;
//		}
//		var elId = 'SRFEND';
		var elPointId = 'SRFENDBottomCenter';

		var _el = document.createElement('div');

		_el.setAttribute('class', 'wfend');
		_el.setAttribute('id', elId);
		
		var _style = 'left:'+nodeArg.left.toString()+'px;top:'+nodeArg.top.toString()+'px;';
		if(_style){
			_el.setAttribute('style', _style);
		}

		//this.endEL = _el;

		this.content.appendChild(_el);

		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'BottomCenter',
			uuid : elPointId
		});
		
		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'TopCenter',
			uuid : elId + 'TopCenter'
		});
		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'LeftMiddle',
			uuid : elId + 'LeftMiddle'
		});
		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'RightMiddle',
			uuid : elId + 'RightMiddle'
		});
		
		this.jsInstance.draggable(_el, {
			grid : [ 20, 20 ]
		});
		
		return _el;

	};

	/**
	 * 获取处理的标题
	 */
	this.getProcessContent = function(nodeArg){
		return '<p>'+nodeArg.label+'</p>';
	};
	
	
	/**
	 * 添加处理节点
	 */
	this.addProcessPoint = function(nodeArg) {
		if (this.content == undefined)
			return null;

		var elId = this.makeUUID();

		var _el = document.createElement('div');

		_el.setAttribute('class', 'wfprocess');
		_el.setAttribute('id', elId);
		_el.innerHTML =  this.getProcessContent(nodeArg);
		var _style = 'left:'+nodeArg.left.toString()+'px;top:'+nodeArg.top.toString()+'px;';
		if(nodeArg.active!=undefined && nodeArg.active)
		{
			_style += 'background-color:LightPink';
		}
		else
			if(nodeArg.count!=undefined && nodeArg.count > 0)
			{
				_style += 'background-color:LightGreen';
			}
		if(_style){
			_el.setAttribute('style', _style);
		}
		
		this.content.appendChild(_el);

		_el.onclick = function(elment) {
			/*var _title = '处理节点';
			if (elment.target.innerHTML.indexOf('<p>') == -1) {
				elment.target.innerHTML = _title;
			} else {
				elment.target.innerHTML = '<p>' + _title + '</p>';
			}*/

		};

		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'TopCenter',
			uuid : elId + 'TopCenter'
		});
		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'LeftMiddle',
			uuid : elId + 'LeftMiddle'
		});
		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'RightMiddle',
			uuid : elId + 'RightMiddle'
		});
		
		this.jsInstance.addEndpoint(elId, sourceEndpoint, {
			anchor : 'BottomCenter',
			uuid : elId + 'BottomCenter'
		});

		this.jsInstance.addEndpoint(elId, sourceEndpoint, {
			anchor : 'BottomLeft',
			uuid : elId + 'BottomLeft'
		});
		
		this.jsInstance.addEndpoint(elId, sourceEndpoint, {
			anchor : 'BottomRight',
			uuid : elId + 'BottomRight'
		});
		
		
		this.jsInstance.draggable(_el, {
			grid : [ 20, 20 ]
		});
		return _el;
	};
	
	this.removeProcessPoint = function(id){
		this.jsInstance.remove(id);
	};

	/**
	 * 添加判断节点
	 */
	this.addDecidePoint = function() {
		if (this.content == undefined)
			return null;

		var elId = this.makeUUID();

		var _el = document.createElement('div');

		_el.setAttribute('class', 'wfdecide');
		_el.setAttribute('id', elId);

		this.content.appendChild(_el);

		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'TopCenter',
			uuid : elId + 'TopCenter'
		});
		this.jsInstance.addEndpoint(elId, sourceEndpoint, {
			anchor : 'LeftMiddle',
			uuid : elId + 'LeftMiddle'
		});
		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'RightMiddle',
			uuid : elId + 'RightMiddle'
		});
		this.jsInstance.addEndpoint(elId, sourceEndpoint, {
			anchor : 'BottomCenter',
			uuid : elId + 'BottomCenter'
		});

		this.jsInstance.draggable(_el, {
			grid : [ 20, 20 ]
		});

		return _el;
	};

	/**
	 * 添加子流程节点
	 */
	this.addSubWFPoint = function() {
		if (this.content == undefined)
			return null;

		var elId = this.makeUUID();

		var _el = document.createElement('div');

		_el.setAttribute('class', 'wfsubwf');
		_el.setAttribute('id', elId);

		this.startEL = _el;

		this.content.appendChild(_el);

		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'TopCenter',
			uuid : elId + 'TopCenter'
		});
		this.jsInstance.addEndpoint(elId, sourceEndpoint, {
			anchor : 'LeftMiddle',
			uuid : elId + 'LeftMiddle'
		});
		this.jsInstance.addEndpoint(elId, targetEndpoint, {
			anchor : 'RightMiddle',
			uuid : elId + 'RightMiddle'
		});
		this.jsInstance.addEndpoint(elId, sourceEndpoint, {
			anchor : 'BottomCenter',
			uuid : elId + 'BottomCenter'
		});

		this.jsInstance.draggable(_el, {
			grid : [ 20, 20 ]
		});
		return _el;
	};

	this.addConnection = function(linkArg){
		this.jsInstance.connect(linkArg,stateMachineConnector);
	};
	/**
	 * 将要添加连线
	 */
	function beforeLineAdd(params) {
		console.log('beforeLineAdd');
		console.log(params);
		
		if (params.sourceId == params.targetId) {
			return false;
		}
		return true;
	}
	;

	/**
	 * 重置
	 */
	this.reset = function() {

	};

	/**
	 * 连线点击事件
	 */
	this.jsInstance.bind("click", function(conn, originalEvent) {
		if (conn.component != undefined) {
			currentLine = conn.component;
		} else {
			currentLine = conn;
		}
		lastClickLine = true;
	});

	this.makeUUID = function() {
		var d = processIndex + '';
		processIndex += 1;
		return d;
	};

	function keyevent() {
		if (event.keyCode == 46 && currentLine != undefined) {
			if (confirm('确定删除连线?')) {
				jsPlumb.detach(currentLine);
			}
		}
	}

	if (this.content != undefined) {
		this.content.onclick = function() {
			if (lastClickLine == true) {
				lastClickLine = false;
			} else {
				currentLine = undefined;
			}
		};
	}
	
	
	document.onkeydown = keyevent;
};

