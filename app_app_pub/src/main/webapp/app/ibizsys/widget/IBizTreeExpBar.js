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