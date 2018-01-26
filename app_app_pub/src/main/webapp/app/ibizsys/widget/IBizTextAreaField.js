/**
 * 多行文本框表单属性
 */
var IBizTextAreaField =  IBizField.extend({
	construct: function(options) {
		arguments.callee.$.construct.call(this,options);
		
		var me = this;
		me.itemMap = {};
		
		me.field = $('#'+me.getUniqueId());
		me.field.change(me,function(e){
			var me = e.data;
			me.setValue(me.field.val());
		});
		me.menucontainer = $('#'+me.getUniqueId()+'_c').find('.ibiz-id-dropdownmenu');
		me.dropdownbtn = $('#'+me.getUniqueId()+'_c').find('.dropdown-toggle');
		me.initSize(me.field);
		
		var ctrlConfig = {};
		if(options.maxHeight)
			ctrlConfig.maxHeight = options.maxHeight;
		else if(options.height)
			ctrlConfig.maxHeight = options.height;
		
		if(!options.dictId){
			me.menucontainer.addClass('hide');
			me.dropdownbtn.addClass('hide');
		}
		$('#'+me.getUniqueId()).autotextarea(ctrlConfig);
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		if(me.dropdownbtn){
			me.dropdownbtn.prop("disabled", disabled);
			me.dropdownbtn.attr('disabled',disabled);
		}
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue);
		$('#'+me.getUniqueId()).autotextarea2({minHeight:me.config.height?me.config.height:34});
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	},
	setAsyncConfig:function(config){
		var me = this;
		if(me.menucontainer){
			var items = [];
			if(config && config.dictitems){
				$.each(config.dictitems,function(idx,item){
					me.itemMap[item.value] = item;
					
					items.push('<li><a class="ibiz-id-menuitem" href="javascript:void(0);" data-ibiz-id="'+item.value+'">');
					items.push(item.text);
					items.push('</a></li>');
				});
			}
			me.menucontainer.html(items.join(''));
			me.initEvents();
		}
	},
	initEvents:function(){
		var me = this;
		if(me.menucontainer){
			me.menucontainer.find('.ibiz-id-menuitem').click(function(e){
				var text = me.itemMap[$(this).attr('data-ibiz-id')].value;
				me.field.insertAtCaret(text);
				me.setValue(me.field.val());
			});
		}
	}
});	