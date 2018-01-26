/**
 * 数据信息区<图标仅支持css>
 */
var IBizDataInfoBar =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.container = $('#'+config.id);
		
		this.title = this.container.find('.ibiz-id-title');
		this.content = this.container.find('.ibiz-id-content');
		this.icon = this.container.find('.ibiz-id-icon');
	},
	setCurrentData:function(data){
		var me = this;
		me.content.html(data.srfmajortext);
	}
});	