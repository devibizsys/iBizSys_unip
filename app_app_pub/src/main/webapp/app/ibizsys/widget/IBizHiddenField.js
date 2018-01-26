/**
 * 隐藏表单项属性
 */
var IBizHiddenField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.fieldType = 'hiddenfield';
		this.field = $('#'+this.getUniqueId());
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	}	
});	