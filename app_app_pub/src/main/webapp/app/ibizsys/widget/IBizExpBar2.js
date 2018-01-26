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