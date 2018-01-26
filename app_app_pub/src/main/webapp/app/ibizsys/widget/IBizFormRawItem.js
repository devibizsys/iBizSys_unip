/**
 * 
 */
var IBizFormRawItem =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.getUniqueId());
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		var me = this;
		me.disabled = disabled;
	},
	/**
	 * 隐藏控件
	 */
	setHidden:function(hidden){
		var me = this;
		me.hidden = hidden;
		if(me.field){
			if(hidden){
				me.field.addClass('hidden');
			}else
			{
				me.field.removeClass('hidden');
			}
		}
	}
});