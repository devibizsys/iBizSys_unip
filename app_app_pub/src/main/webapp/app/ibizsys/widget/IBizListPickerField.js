/**
 * 列表-表单项属性
 */
var IBizListPickerField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
		me.itemMap = {};
		
		me.field = $('#'+me.getUniqueId());
		if(me.container){
			me.addBtn = $(me.container.find('.ibiz-id-add'));
			me.removeBtn = $(me.container.find('.ibiz-id-remove'));
		}
		
		if(me.addBtn){
			me.addBtn.click(function(e){
				me.openPickView();
			});
		}
		if(me.removeBtn){
			me.removeBtn.click(function(e){
				me.deleteSelectItems();
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
		if(me.removeBtn){
			me.removeBtn.prop("disabled", disabled);
			me.removeBtn.attr('disabled',disabled);
		}	
	},
	/**
	 * 值变化 
	 */
	onValueChanged:function(oldValue,newValue){
		var me = this;
		
		var html = [];
		if(newValue == null || newValue == undefined || newValue == ''){
			me.itemMap = {};
		}else{
			var data = [];
			try
			{
				data = JSON.parse(newValue);
			}catch(e){
			}
			
			$.each(data,function(idx,item){
				html.push('<option value="'+item.srfkey+'">'+item.srfmajortext+'</option>');
				me.itemMap[item.srfkey] = item;
			});
		}
		me.field.html(html.join(''));
		arguments.callee.$.onValueChanged.call(this,oldValue,newValue);
	},
	deleteSelectItems:function(){
		var me = this;
		if(me.isDisabled())
			return;
		var ids = me.field.val();
		if(ids == null || ids == undefined || ids == '' ){
			return;
		}
		var bChanged;
		
		$.each(ids,function(idx,id){
			if(me.itemMap[id]){
				 delete me.itemMap[id];
				 bChanged = true;
			}
		});
		if(bChanged){
			var data = [];
			$.each(me.itemMap,function(idx,item){
				data.push(item);
			});
			if(data.length==0)
				me.setValue('');
			else
				me.setValue(JSON.stringify(data));
		}
	},
	pickerWindowClose:function(win){
		var me = this;
		var bChanged = false;
		if(win.dialogResult == 'ok'){
			if(win.selectedDatas){
				$.each(win.selectedDatas,function(idx,item){
					if(!me.itemMap[item.srfkey]){
						bChanged = true;
						me.itemMap[item.srfkey] = item;
					}
				});
			}
		}
		if(bChanged){
			var data = [];
			$.each(me.itemMap,function(idx,item){
				data.push(item);
			});
			if(data.length==0)
				me.setValue('');
			else
				me.setValue(JSON.stringify(data));
		}
	},
	openPickView:function(){
		var me = this;
		if(me.isDisabled())
			return;
		if(!me.config.pickupView){
			return;
		}
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = {};
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