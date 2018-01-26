/**
 * 标签控件
 */
var IBizSpanField =  IBizField.extend({
	construct: function(options) {
		arguments.callee.$.construct.call(this,options);
		var me = this;
		me.fieldType = 'displayfield';
		me.field = $('#'+me.getUniqueId());
		me.initSize(me.field);
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue)
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	}
});	