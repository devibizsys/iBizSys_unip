/**
 * 页面上下文<子页面上下文参数无效>
 */
var IBizPageContext =  Class.extend({
	construct: function(config) {
		var me = this;
		me.viewparam = {};	
		
		if(!config || !config.pcontroller)
		{
			$.each(document.location.search.substr(1).split('&'),function(c,q){
				var i = q.split('=');
				var key=i[0].toLowerCase();
				if(key=='srfparentmode'||key=='srfparentdata'||key=='')
					return;
				me.viewparam[key] = decodeURIComponent(i[1]);
			});
		}
	},
	/**
	 * 获取参数
	 */
	getParamValue:function(name){
		var me = this;
		name = name.toLowerCase();
		return me.viewparam[name];
	},
	/**
	 * 清空参数
	 */
	clear:function(){
		var me = this;
		me.viewparam = {};
	}	
});	