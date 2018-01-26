/**
 * 直接内容表单项属性
 */
var IBizRawField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.field = $('#'+this.getUniqueId());
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.html(newValue);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	}	
});	