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