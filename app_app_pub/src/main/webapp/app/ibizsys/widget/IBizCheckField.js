/**
 * 选择框表单属性
 */
var IBizCheckField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.field = $('#'+this.getUniqueId());
		
		var me = this;
		this.field.change(function(e){
			if(me.field.is(':checked')){
				me.setValue('1');
			}else{
				me.setValue('0');
			}
			
		});
	},
	/**
	 * 值变化 
	 */
	onValueChanged:function(oldValue,newValue){
		var me = this;
		
		//判断内容
		if(newValue == '1'){
			me.field.attr("checked",true);
		}else{
			me.field.attr("checked",false);
		}
		
		arguments.callee.$.onValueChanged.call(this,oldValue,newValue);
	}
});	