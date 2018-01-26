/**
 * 富文本表单属性
 */
var IBizHtmlField = IBizField.extend({
	construct: function(options) {
		arguments.callee.$.construct.call(this,options);
		var me = this;
		
		me.field = $('#'+me.getUniqueId());
		var nHeight = options.height;
		if(!nHeight || nHeight<0){
			nHeight = 100;
		}
		me.field.parent().css('height', '');
		me.initSize(me.field);
		
		if(me.field){
			me.field.summernote({
				height:nHeight,
				lang:'zh-CN',
			    defaultFontName: '微软雅黑',
			    fontNames: [
			        '微软雅黑', '宋体', '仿宋','黑体', '楷体', '隶书', '新宋体', '幼圆'
			    ],
				onChange: function (value, $editable) {
					me.ignore = true;
					me.setValue(value);
					me.ignore = false;
				}
			});
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled : function(disabled) {
		var me = this;
		me.disabled = disabled;
		if(me.container){    
			me.container.find('.note-editable').each(function(idx,item){
				$(item).attr("contentEditable", !disabled);
			});
		}
	},
	onValueChanged:function(oldVal,newVal){
		arguments.callee.$.onValueChanged.call(this,oldVal,newVal);
		var me = this;
		if(me.ignore)
			return;
		me.field.code(newVal);
	}	
});