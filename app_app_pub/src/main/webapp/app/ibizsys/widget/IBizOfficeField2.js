/**
 * Office控件
 */
var IBizOfficeField2 =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.valueItem = this.config.valueItem;
		
		me.field = $('#'+me.getUniqueId());
		if(me.container){
			me.addBtn = $(me.container.find('.ibiz-id-picker'));
			me.contentDiv =  $(me.container.find('.ibiz-id-content'));
			me.contentDiv.css("line-height","350%");
			
			if(me.config.width >0){
				me.contentDiv.width(me.config.width);
			}
			if(me.config.height >0){
				me.contentDiv.css({minHeight:me.config.height});
			}
		}
		
		if(me.addBtn){
			me.addBtn.click(function(e){
				me.openPickView();
			});
		}
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		
		if(me.addBtn){
			me.addBtn.prop("disabled", disabled);
			me.addBtn.attr('disabled',disabled);
		}
	},
	onSelectValue : function(id, text) {
		var me = this;
		if(!id || id == ''){
			id = '';
			text = '';
		}
		me.getForm().setFieldValue(me.valueItem, id);
		me.setValue(text);
		me.contentDiv.html(text);
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.contentDiv.html(newValue);
		me.field.val(newValue);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	},
	pickerWindowClose : function(win) {
		var me = this;
		if (win.dialogResult == 'ok') {
			if (win.activeData) {
				me.onSelectValue(win.activeData.srfkey,win.activeData.srfmajortext);
			}
		} else if (win.dialogResult == 'reset') {
			me.onSelectValue('', '');
		}
	},
	
	openPickView:function(){
		var me = this;
		if(me.isDisabled())
			return;
		if(!me.config.pickupView){
			return;
		}
		
		var id = me.getForm().getFieldValue(me.valueItem);
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = {srfkey:id};
		var formtype = me.getForm().getFormType();
		if (formtype == 'EDITFORM'){
			var activeData = me.getForm().getActiveData();
			viewparam.srfactivedata = JSON.stringify(activeData);
		}
		viewparam['windowid'] = win.getId();
		win.scope = me;
		win.title = me.config.pickupView.title;
		win.height = me.config.pickupView.height;
		win.width = me.config.pickupView.width;
		win.url = $.getIBizApp().parseURL(BASEURL,me.config.pickupView.view,{windowid:win.getId()});
		win.viewparam = viewparam;
		win.callback = function(win){
			me.pickerWindowClose(win);
		};	
		win.openModal(window);
	}
});	