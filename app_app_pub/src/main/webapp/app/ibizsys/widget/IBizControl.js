/**
 * 控件基类
 */
var IBizControl = IBizObject.extend({
	/**
	 * 加载
	 */
	load:function(params){
		
	},
	/**
	 * 销毁<暂时无效>
	 */
	destroy:function(){
		
	},
	setSize:function(width,height){
		
	},
	setWidth:function(width){
		
	},
	setHeight:function(height){
		
	},
	isVisible:function(){
		return true;
	},
	invoke:function(command,arg){
    	var me=this;
    	me.onInvoke(command,arg);
    },
    onInvoke:function(command,arg){
    	
    }
});