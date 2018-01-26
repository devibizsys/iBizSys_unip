/**
 * 下拉列表表单属性
 */
var IBizDropDownListField = IBizField.extend({
	construct : function(opts) {
		arguments.callee.$.construct.call(this, opts);
		var me = this;
		me.field = $('#' + this.getUniqueId());
		if (me.field) {
			me.field.select2({
				placeholder: $IGM('IBIZDROPDOWNLISTFIELD.PLACEHOLDER',"请选择...")
			});
			me.field.on("change", me, function(e) {
				var value=$(e.target).select2('val');
				if(value=='__SRFRESET__'){
					e.data.setValue('');
					$(e.target).select2('val','');
					return;
				}
				e.data.setValue($(e.target).select2('val'));
			});
		}
	},
	onValueChanged : function(oldValue, newValue) {
		var me = this;
		if(me.field){
			me.field.select2('val', newValue);
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
		var items = [];
		if (config && config.items) {
				items.push('<option value="__SRFRESET__">'+ $IGM('IBIZDROPDOWNLISTFIELD.CLEAN','(清空)')+'</option>');
			$.each(config.items, function(idx, item) {
				items.push('<option value="' + item.value + '">' + item.text + '</option>');
			});
		}
		if(me.field){
			me.field.html(items.join(''));
		}
		me.onValueChanged(me.value,me.value);
	}
});