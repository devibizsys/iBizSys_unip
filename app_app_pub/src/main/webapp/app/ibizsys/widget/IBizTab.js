/**
 * 分页控件
 */	
var IBizTab =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.config.id);
		me.field.find('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
			me.fireEvent(IBizTab.SELECTIONCHANGE,me,e);
		});
	},
	setActiveItem:function(index)
	{
		if($.isNumeric( index ))
		{
			$('#'+this.config.id+' li:eq('+index.toString()+') a').tab('show');
		}
		else
		{
			$('#'+this.config.id+' a[href="#'+index+'"]').tab('show');
		}
	},
	setSize:function(width,height){
		var me = this;
		$('#'+me.id).width(width);
		$('#'+me.id).height(height);
		/*if(me.activeSubController != null){
			me.activeSubController.setSize(width,height);
		}*/
	}
	,getHeight:function(){
		var me = this;
		return $('#'+me.id).height();
	}
	,getWidth:function(){
		var me = this;
		return $('#'+me.id).width();
	}
});
/*****************事件声明************************/
/**
 * 选择变化
 */
IBizTab.SELECTIONCHANGE = "SELECTIONCHANGE";