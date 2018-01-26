/**
 * 表单分页控件
 */
var IBizFormTabPage =  IBizField.extend({
	construct: function(config) {
		var me = this;
		arguments.callee.$.construct.call(this,config);
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
	},
	/**
	 * 设置可见性
	 */
	setVisible:function(visible){
		this.visible = visible;
		if(this.field)
		{
			if(visible){
				this.field.removeClass('hidden');
			}else{
				this.field.addClass('hidden');
			}
		}
	}
});