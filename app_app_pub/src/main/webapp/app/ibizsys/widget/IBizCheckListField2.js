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