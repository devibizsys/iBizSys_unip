/**
 * 多选表单属性
 */
var IBizCheckListField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+this.getUniqueId());
		me.items = {};
		me.initEvents();
		me.itemWidth = config.itemWidth;
		me.orMode = config.orMode;
		me.valueSeparator = config.valueSeparator;
		if(me.itemWidth==undefined){
			me.itemWidth = 150;
		}
		if (me.orMode == undefined || me.orMode == '') {
	        me.orMode = 'str';
		}

		if (me.orMode == 'str' && (me.valueSeparator == undefined || me.valueSeparator == '')) {
	          me.valueSeparator = ',';
		}
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		$.each(me.items,function(name,it){
			$(it).parent().removeClass('checked');
			$(it).prop("checked", false); 
		});
		if(newValue){
			if(me.orMode=='num'){
				 var nVal = parseInt(newValue);
				 $.each(me.items,function(name,it){
					 var inputValue = parseInt(name);
					 if ((nVal & inputValue) == inputValue)
						 {
						 	$(it).parent().addClass('checked');
						 	$(it).prop("checked", true); 
						 }
				 });
			}
			else
				if(me.orMode=='str'){
					var values = newValue.split(me.valueSeparator);
					$.each(values,function(idx,val){
						var item = me.items[val];
						if(item){
							$(item).parent().addClass('checked');
							$(item).prop("checked", true); 
						}	
					});
				}
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
				item.change(function(e){
					if (me.isDisabled())
						return;
					if(e.target.checked){
						$(e.target).parent().addClass('checked');
					}else{
						$(e.target).parent().removeClass('checked');
					}
					if(me.orMode=='num'){
						var _tmp = 0;
						$.each(me.items,function(name,it){
							if($(it).parent().hasClass('checked'))
							{
								_tmp = _tmp | parseInt(name);
							}
						});
						me.setValue(_tmp.toString());
					}
					else
						if(me.orMode=='str'){
							var values = [];
							$.each(me.items,function(name,it){
								if($(it).parent().hasClass('checked'))
								{
									values.push(name);
								}
							});	
							me.setValue(values.join(me.valueSeparator));
						}
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
				items.push('<label class="checkbox-item">');
				items.push('<div class="checker">');
				items.push('<span>');
				items.push('<input type="checkbox" value="'+item.value+'">');
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