/**
 *自定义视图控制器对象
 */
var CustomViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
	},
	/**
	 * 初始化
	 */
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
	}
});
/*****************事件声明************************/
