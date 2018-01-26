/**
 * 实现模拟多重继承类
 */
function Class() { }
Class.prototype.construct = function() {};
Class.extend = function(def) {
  var classDef = function() {
      if (arguments[0] !== Class) { this.construct.apply(this, arguments); }
  };
 
  var proto = new this(Class);
  var superClass = this.prototype;
 
  for (var n in def) {
      var item = def[n];                      
      if (item instanceof Function) item.$ = superClass;
      proto[n] = item;
  }
 
  classDef.prototype = proto;
 
  classDef.extend = this.extend;      
  return classDef;
};	
/**
 * 对象基类
 */
var IBizObject = Class.extend({
	construct: function(config) {
		this.config = $.extend({}, {},config);
		this.config.me = this;
		if(this.config.id)
			this.setId(this.config.id);
		else
			this.setId($.getIBizApp().genUUID());
		
		if(this.config.name)
			this.setName(this.config.name);
		else
		{
			if(this.config.refname)
			{
				this.setName(this.config.refname);
			}
			else
			{
				if(this.config.ctrler && this.config.ctrler.getCId2()!=''){
					var cid= this.config.ctrler.getCId2();
					if(this.getId().indexOf(cid)==0){
						this.setName(this.getId().substring(cid.length));
					}
				}
				else
					this.setName(this.getId());
			}
		}
		
		if(this.config.refname)
		{
			this.refname = this.config.refname;
			if(this.getController()){
				this.getController().registerItem(this.refname,this);
			}
		}
		
		this.e = $({});
		
	},
	init:function(params){
		this.onInit();
	},
	onInit:function(){
		
	},
	setId:function(id){
		this.id = id;
	},
	getId:function(){
		return this.id;
	},
	setName:function(name){
		this.name = name;
	},
	getName:function(){
		return this.name;
	},
	getRefName:function()
	{
		return this.refname;
	},
	/**
	 * 获取界面控制器
	 */
	getController:function()
	{
		return this.config.ctrler;
	},
	/**
	 * 注册事件
	 * @param event 事件名称
	 * @param callback 回调函数<不支持字符串><3个参数 sender,data,event>
	 * @param scope 作用域
	 */
	on:function(event,callback,scope){
		event = event.toLowerCase();
		this.e.bind(event,scope,function(event,data){
			return callback(data.sender,data.args,event);
		});
		return;
	},	
	/**
	 * 呼出事件<参数会封装成JSON对象进行传递>
	 * @param event 事件名称
	 * @param sender 源
	 * @param args 参数
	 */
	fireEvent:function(event,sender,args){
		event = event.toLowerCase();
		this.e.trigger(event,{sender:sender,args:args});
	}
});