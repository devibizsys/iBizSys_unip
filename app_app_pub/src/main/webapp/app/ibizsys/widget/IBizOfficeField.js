/**
 * Office文档编辑控件
 * 要调用 <office.jsp>中的脚本 请使用 me.frameobj.xxxxx,xxxxx为<office.jsp>中脚本方法
 */
var IBizOfficeField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.getUniqueId()); 
		me.field.attr("src",BASEURL+'/weboffice/officeeditpage.jsp'); 
		me.field.load(function(){   
	        me.onIframeLoaded(); 
	    });  
		if(config.height >0){
			me.field.height(config.height);
		}
		if(config.width >0){
			me.field.width(config.width);
		}
		else
		{
			me.field.width('100%');
		}
	},
	onIframeLoaded:function(){
		var me = this;
		var lastValue = me.getValue();
		me.frameobj = me.field[0].contentWindow;
		if(me.frameobj){
			me.frameobj.init(this);
			me.frameobj.setFileReadOnly(me.isDisabled());
			
			if(me.getForm()!=null){
				var controller = me.getForm().getController();
				var activeData = controller.viewparam.srfactivedata;
				if (activeData){
					if(me.frameobj.setActiveData){
						me.frameobj.setActiveData($.parseJSON(activeData));
					}
				}
			}
			me.frameobj.setValue(lastValue);
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		
		if(me.frameobj){
			me.frameobj.setFileReadOnly(disabled);
		}
	},
	onValueChanged:function(oldVal,newVal){
		arguments.callee.$.onValueChanged.call(this,oldVal,newVal);
		var me = this;
		
		if(me.frameobj){
			me.frameobj.setValue(newVal);
		}
	},
	getValue:function(){
		var me = this;
		if(me.frameobj){
			return me.frameobj.getValue();
		}
		return arguments.callee.$.getValue.call(this);
	}
});	