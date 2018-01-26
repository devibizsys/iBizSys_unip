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