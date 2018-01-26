/**
 * 表单属性对象<主要管理属性及其标签的值、可用、显示、必填等操作>
 */
var IBizField =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.uniqueId = this.config.id;
		this.name = this.config.name;
		this.disabled = false;
		this.haserror = false;
		this.labeltext = '';
		if(this.config.allowBlank != undefined){
			this.allowBlank = this.config.allowBlank;
		}else
		{
			this.allowBlank = true;
		}
		if(this.config.hidden != undefined){
			this.hidden = this.config.hidden;
		}else
		{
			this.hidden = false;
		}
		if(this.config.visible != undefined){
			this.visible = this.config.visible;
		}else
		{
			this.visible = true;
		}
		this.label = $('#'+this.uniqueId+'__lb');
		this.container = $('#'+this.uniqueId+'__fi');
		
		if(this.label){
			this.labeltext = this.label.html();
		}
	},
	initSize:function(item){
		var me = this;
		if(me.config.width >0){
			item.width(me.config.width);
		}
		if(me.config.height >0){
			item.height(me.config.height);
		}
	},
	getFieldType:function(){
		return this.fieldType;
	},
	setForm:function(form){
		this.form = form;
	},
	getForm:function(){
		return this.form;
	},
	/**
	 * 获取值
	 */
	getValue:function(){
		var me = this;
		return me.value;
	},
	/**
	 * 设置值
	 * @param value 值
	 */
	setValue:function(value){
		var me = this;
		var oldVal = me.value;
		me.value = value;
		if(oldVal != value)
			me.onValueChanged(oldVal,me.value);
	},
	/**
	 * 获取唯一标识
	 */
	getUniqueId:function(){
		return this.uniqueId;
	},
	/**
	 * 获取属性名
	 */
	getName:function(){
		return this.name;
	},
	isDisabled:function(){
		return this.disabled;
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		this.disabled = disabled;
		if(this.field){
			if(disabled){
				this.field.attr('readonly','readonly');
			}else{
				this.field.removeAttr("readonly");  
			}
			this.field.prop("disabled", disabled);
		}
	},
	/**
	 * 隐藏控件
	 */
	setHidden:function(hidden){
		this.hidden = hidden;
		if(this.label)
		{
			if(hidden){
				this.label.addClass('hidden');
			}else
			{
				this.label.removeClass('hidden');
			}
		}
		if(this.field)
		{
			if(hidden){
				this.field.addClass('hidden');
			}else
			{
				this.field.removeClass('hidden');
			}
		}
	},
	/**
	 * 设置可见性
	 */
	setVisible:function(visible){
		this.visible = visible;
		if(this.container)
		{
			if(visible){
				this.container.removeClass('hidden');
			}else{
				this.container.addClass('hidden');
			}
		}
	},
	/**
	 * 设置属性动态配置
	 */
	setAsyncConfig:function(config){
	},
	/**
	 * 设置只读<Ext版本方法禁止使用>
	 */
	setReadOnly:function(readonly){
		this.setDisabled(readonly);
	},
	setAllowBlank:function(allowblank){
		if(this.label){
			if(allowblank)
			{
				this.label.html(this.labeltext);
			}else
			{
				this.label.html('<span class="text-danger">*</span>'+this.labeltext);
			}
		}
	},
	/**
	 * 标记表单项值无效提示
	 */
	markInvalid:function(info){
		this.haserror = true;
		if(this.container){
			this.container.addClass('has-error')
		}
	},
	/**
	 * 设置表单项错误
	 */
	setActiveError:function(info){
		this.markInvalid(info);
	},
	/**
	 * 表单项是否有错误
	 */
	hasActiveError:function(){
		return this.haserror;
	},
	/**
	 * 重置表单项错误
	 */
	unsetActiveError:function(){
		this.haserror = false;
		if(this.container){
			this.container.removeClass('has-error')
		}
	},
	/**
	 * 值变化 
	 */
	onValueChanged:function(oldValue,newValue){
		this.fireEvent(IBizField.VALUECHANGED,this,{'newvalue':newValue,'oldvalue':oldValue});
	}
});
/*****************事件声明************************/
/**
 * 表单项值变化
 */
IBizField.VALUECHANGED = 'VALUECHANGED';