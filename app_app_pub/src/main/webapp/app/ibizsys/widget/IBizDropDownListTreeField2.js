/**
 * 树形下拉列表选择
 */
var IBizDropDownListTreeField2 = IBizField.extend({
	construct : function(opts) {
		arguments.callee.$.construct.call(this, opts);
		var me = this;
		me.codeListType = IBizDropDownListTreeField2.CODELISTTYPE_DYNAMIC;
		me.codeListMode = 0;
		me.lastSelectNode = null;
		me.firstOpenSelect = true;
		me.onlyLeafCheck = false;
		me.searchable = true;
		
		me.field = $('#' + this.getUniqueId());
		
		if (me.field) {
			if(opts.onlyLeafCheck)
				me.onlyLeafCheck = opts.onlyLeafCheck;
			else{
				if(opts.codelistid && opts.codelistid == 'xFOnline_PUCL_XIAQU'){
					me.onlyLeafCheck = true;
				}
			}
			
			if(opts.codeListType)
				me.codeListType = opts.codeListType;
			
			if(opts.codeListMode)
				me.codeListMode = opts.codeListMode;
				
			if(opts.dataUrl){
				me.dataUrl = opts.dataUrl;	
			}
			else if(opts.form && opts.form.backendurl) {
				me.dataUrl =opts.form.backendurl+'srfaction=itemfetch&SRFFORMITEMID='+opts.name+'&';
			}

			var ctrlwidth=200;
			if(opts.width)
				ctrlwidth=opts.width;
			
			var ctrlheight=34;
			if(opts.height)
				ctrlheight=opts.height;
			
			var multiple = false;
			if(opts.multiple)
				multiple=opts.multiple;
			if(opts.searchable){
				me.searchable = opts.searchable;
			}
			me.field.combotree({
				searchable:me.searchable,
				width:ctrlwidth,
				height:ctrlheight,
				panelHeight:'200',//高度
				editable:false,
				multiple: multiple,//是否多选
				onlyLeafCheck : me.onlyLeafCheck ,//控制父节点是否可选，但是只在多选下生效
				searcher:function(text){
					me.reloadTreeData(text);
				},
				onChange:function(){
					var oldValue = me.getValue();
					var t = me.field.combotree('getValues');	// 获取树对象	
					me.value=t.join(',');
					var newValue = me.value;
					me.onValueChanged(oldValue,newValue);
		        },
		        onBeforeExpand: function(node){
					me.fetchSelectItems(node);
				},
				loadFilter:function(data){
					var nodes = [];
					if(data.items){
						var rows = data.items;
					    for(var i=0; i<rows.length; i++){  
					        var row = rows[i];  
					        if(!row.id)
					        	row.id = row.value;
					        if(!row.state){
					        	if(!row.leaf)
					        		row.state = 'closed';
					        }
					        nodes.push(row);
					    }  
					}
					return nodes;
				},
				onShowPanel:function(){
					if(me.codeListType == IBizDropDownListTreeField2.CODELISTTYPE_DYNAMIC && me.codeListMode == 1){
						if(me.firstOpenSelect){
							me.firstOpenSelect = false;
							me.reloadTreeData();
						}
					}
				},
				onHidePanel:function(){
					me.reloadTreeData();
				},
		        onBeforeSelect: function(node) {  
		        	if(me.onlyLeafCheck){
		        		if (!$(this).tree('isLeaf', node.target)) {  
		        			return false;  
		        		}  
		        	}else{
		        		return true;
		        	}
		        },
				onSelect:function(node){
					me.setLastSelectNode(node);
					//me.lastSelectNode = node;
				},  
		        onClick: function(node) {  
		        	if(me.onlyLeafCheck){
		        		if (!$(this).tree('isLeaf', node.target)) {  
//		        			alert('foler not selected!');
		        			me.field.combotree('showPanel');  
			            }  
		        	}
		        }
			});
			if(me.field && !opts.width){
				var spanCtrl = me.field.parent().find('span.combo');
				if(spanCtrl)
					spanCtrl.css('width','100%');
				var textboxCtrl = me.field.parent().find('input.textbox-text');
				if(textboxCtrl)
					textboxCtrl.css('width','100%');
			}
			
			if(me.searchable){
				var _ibiz_search_box = $("#_ibiz_search_box").parent().find('span.searchbox');
				_ibiz_search_box.css('width','100%');
			}
		}
	},
	fetchSelectItems : function(node) {
		var me = this;
		var url = me.dataUrl;
		if(me.dataUrl && node){
			url =url +"&srfnodeid=" + encodeURI(node.id);
		}
		if(url)
			me.field.combotree("tree").tree("options").url = url;
	},
	reloadTreeData : function(text) {
		var me = this;
		if(!me.dataUrl)
			return;
		var param = {};
		if(text)
			param.query = text;
		
		$.ajax({
			url:me.dataUrl,
			data:param,
			type:"post",
			dataType:"json",
			success:function(result){
				if(result.success && result.items){
					var nodes = [];
					if(me.lastSelectNode)
						nodes.push(me.lastSelectNode);
					
					var rows = result.items;
					for(var i=0; i<rows.length; i++){  
				        var row = rows[i];  
				        row.id = row.value;
				        nodes.push(row);
				    }  
					me.field.combotree('loadData',{items:nodes});  
				}else{
					 console.log(result.err);
				}
			},
			error:function(){
				console.log(me.dataUrl+",访问异常"); 
			}
		});	 	
	},
	onValueChanged : function(oldValue, newValue) {
		var me = this;
		if(me.field && newValue){
			me.field.combotree('setValues',newValue.split(','));
			var curNodeId = newValue;
			if(curNodeId.indexOf(me.PRE_NODEID) == -1)
				curNodeId = me.PRE_NODEID + curNodeId;
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
		me.firstOpenSelect = true;
		if(me.field && config && config.items){
			if(me.codeListMode == 1){
				me.setLastSelectNode(config.items[0]);
			}
			else if(me.codeListMode == 2){
				config.items=convert(config.items);
			}
			me.field.combotree('loadData',config);  
		}
		
		me.onValueChanged(me.value,me.value);
	},
	getRealNodeId: function(strNodeId){
		if(strNodeId.indexOf(me.PRE_NODEID) == 0 && strNodeId.length>10)
			return strNodeId.substr(11);
		return strNodeId;
	},
	setLastSelectNode: function(node){
		var me = this;
		if(node){
			me.lastSelectNode = node;
			me.lastSelectNode.leaf = true;
			me.lastSelectNode.state = 'open';
			me.lastSelectNode.iconCls = 'tree-dnd-yes';
		}else{
			me.lastSelectNode = null;
		}
	},
	convert : function(rows){  
	    function exists(rows, pvalue){  
	        for(var i=0; i<rows.length; i++){  
	            if (rows[i].value == pvalue) 
	            	return true;  
	        }  
	        return false;  
	    }  
	      
	    var nodes = [];  
	    // 得到顶层节点
	    for(var i=0; i<rows.length; i++){  
	        var row = rows[i];  
	        if (!row.pvalue){
	            nodes.push(row);  
	        }  
	    }  
	      
	    var toDo = [];  
	    for(var i=0; i<nodes.length; i++){  
	        toDo.push(nodes[i]);  
	    }
	    
	    while(toDo.length){  
	        var node = toDo.shift();    // 父节点 
	        // 得到子节点 
	        for(var i=0; i<rows.length; i++){  
	            var row = rows[i];  
	            if (row.pvalue && row.pvalue == node.value){  
	                if (node.children){  
	                    node.children.push(row);  
	                } else {  
	                    node.children = [row];  
	                }  
	                toDo.push(row);  
	            }  
	        }  
	    }  
	    return nodes;  
	}  
});

IBizDropDownListTreeField2.CODELISTTYPE_STATIC = 'STATIC';
IBizDropDownListTreeField2.CODELISTTYPE_DYNAMIC = 'DYNAMIC';