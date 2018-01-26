/**
 * 代码表对象<>
 */
var IBizCodeList = IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.datas = config.datas;
	},
	/**
	 * 根据值获文本
	 */
	getItemByValue:function(value,cascade){
		var me=this;
		var result;
		$.each(me.datas,function(index,item){
			if(item.value == value){
				result = item;
				return false;
			}
		});
		return result;
	}
});