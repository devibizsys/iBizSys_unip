/**
 * 基本输入框属性
 */
var IBizTextField =  IBizField.extend({
	construct: function(options) {
		arguments.callee.$.construct.call(this,options);
		var me = this;
		me.field = $('#'+me.getUniqueId());
		me.field.change(me,function(e){
			var me = e.data;
			me.setValue(me.field.val());
		});
		me.initSize(me.field);
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	}
});	