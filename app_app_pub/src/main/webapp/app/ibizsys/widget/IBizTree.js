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