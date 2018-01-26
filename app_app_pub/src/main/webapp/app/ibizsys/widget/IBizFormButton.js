/**
 * 
 */
var IBizFormButton =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.field = $('#'+me.getUniqueId());
		me.field.click(function(e){
			me.onClick();
		});
	},
	onClick:function(){
		var me = this;
		if(me.config.uiaction && me.config.actiontype=='UIACTION'){
			var uiaction = me.getForm().getController().getUIAction(me.config.uiaction.tag);
			me.getForm().getController().doUIAction(uiaction);
			return;
		}
		if(me.config.fiupdate && me.config.actiontype=='FIUPDATE'){
			  me.getForm().updateFormItems({srfufimode:me.config.fiupdate.tag});
			return;
		}
	}
});