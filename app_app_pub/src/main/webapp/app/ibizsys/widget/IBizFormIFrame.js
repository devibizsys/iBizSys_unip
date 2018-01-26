/**
 * 表单IFrame部件
 */
var IBizFormIFrame =  IBizField.extend({
	parentData: null,
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		
		var form=this.getForm();
		form.on('formloaded', function (sender,data,e){
			var me=e.data;
			me.refreshIFrame();
			}, this);
		
		form.on('formsaved', function (sender,data,e){
			var me=e.data;
			me.refreshIFrame();
			}, this);
		
		var refreshItems = config.refreshitems;
		if(refreshItems && refreshItems!=''){
			var items = refreshItems.split(';');
			this.hookItems={};
			for(var i=0;i<items.length;i++){
				this.hookItems[items[i].toLowerCase()] = true;
			}
			form.on(IBizForm.FORMFIELDCHANGED,function (sender,data,e){
				var me=e.data;
				var fieldname = '';
				if (sender != null)
					fieldname = sender.getName();
				else
					return ;
				if(me.isRefreshItem(fieldname))
					me.refreshIFrame();
				}, this);
		}
		
	}
	,getName:function()
	{
		return this.config.name;
	}
	,isRefreshItem:function(name){
		var me=this;
		if(!name || name==''){
			return false;
		}
		return me.hookItems[name.toLowerCase()];
	}
	
	, setParentData: function (pd) {
	    this.parentData = pd;
	}
	, getForm: function () {
	    var me = this;
	    return me.config.form;
	}
	,refreshIFrame: function () {
	    var me = this;
   
	    var form = me.getForm();
	    var field = form.findField('srfkey');
	    if(field==null)
	    {
	    	return;
	    }
	    var value = field.getValue();
	    me.parentData = { srfparentkey: value };
	    
	    var activeData = form.getActiveData();
	    var url=me.config.url;
	    for (var key in activeData) 
		{  
			 var fieldValue=  activeData[key] ;
			 if(fieldValue)
			 {
				 fieldValue=encodeURI(fieldValue);
				 url = url.replace(new RegExp('{'+key+'}','g'),fieldValue);
			 }
		} 
	    if($('#'+me.getId()).attr("src") == url)
	    	return;
	    $('#'+me.getId()).attr("src",url); 
	}
});	