/**
 * 地址框-表单项属性
 */
var IBizAddressPickerField =  IBizField.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.itemMap = {};
		me.field = $('#'+this.getUniqueId());
		me.containerEL = me.field.find('.ibiz-id-container');
		me.container = $(me.containerEL);
		me.uploadbtn = me.field.find('.ibiz-id-picker');
		me.uploadbtn.click(function(){
			me.openPickView();
		});
		
		me.initSize(me.field);
		me.field.find('.select2-container').css('cssText','height:100%!important');
		me.field.find('.select2-choices').css('cssText','height:100%!important');
	},
	/**
	 * 设置是否启用
	 */
	setDisabled:function(disabled){
		arguments.callee.$.setDisabled.call(this,disabled);
		var me = this;
		if(me.uploadbtn){
			me.uploadbtn.prop("disabled", disabled);
			me.uploadbtn.attr('disabled',disabled);
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
				me.itemMap[item.srfkey] = item;
			});
		}
		me.render();
		arguments.callee.$.onValueChanged.call(this,oldValue,newValue);
	},
	render:function(){
		var me = this;
		if(me.itemMap){
			var items = [];
			$.each(me.itemMap,function(index,item){
				if(item){
					var id = item.srfkey;
					var text = item.srfmajortext;
					
					var item = '<li data-id-item="'+id+'" class="ibiz-id-item select2-search-choice ms-hover">';
					item +='<div>'+text+'</div>';
					item +='<a href="#" class="ibiz-id-remove select2-search-choice-close" tabindex="-1"></a>';
					item +='</li>';
				
					items.push(item);
				}
			});
			me.container.html(items.join(''));
			me.container.find('.ibiz-id-remove').each(function(index,item){
				$(item).click(function(){
					me.removeItem($(this).parent().attr('data-id-item'));
				});	
			});
		}else{
			me.container.html('');
		}
	},
	removeItem:function(itemid){
		var me = this;
		
		if(me.isDisabled())
			return;
		
		me.itemMap[itemid] = null;
		var data = [];
		$.each(me.itemMap,function(idx,item){
			if(item){
				data.push(item);	
			}
		});
		if(data.length==0)
		{
			me.setValue('');
		}
		else
			me.setValue(JSON.stringify(data));
	},
	openPickView:function(){
		var me = this;
		if(me.isDisabled())
			return;
		if(!me.config.pickupView){
			return;
		}
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = {srfaction : 'itemfetch'};
		var bcancel = me.fillPickupCondition(viewparam);
		
		if(bcancel == false){
			return;
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
				if(item){
					data.push(item);	
				}
			});
			if(data.length==0)
			{
				me.setValue('');
			}
			else
				me.setValue(JSON.stringify(data));
		}
	},
	/**
	 * 填充条件
	 */
	fillPickupCondition : function(arg) {
		var me = this;
		var form = me.getForm();
		if (!form) {
			IBiz.alert($IGM('IBIZADDRESSPICKERFIELD.FILLPICKUPCONDITION.TITLE','操作失败'),$IGM('IBIZADDRESSPICKERFIELD.FILLPICKUPCONDITION.INFO','未能找到当前表单，无法继续操作'),2);
			return false;
		}
		
		if (me.config.itemParam && me.config.itemParam.fetchcond) {
			var fetchparam = {};
			var fetchCond = me.config.itemParam.fetchcond;
			for ( var cond in fetchCond) {
				var field = form.findField(fetchCond[cond]);
				if (!field) {
					IBiz.alert($IGM('IBIZADDRESSPICKERFIELD.FILLPICKUPCONDITION.TITLE','操作失败'),$IGM('IBIZADDRESSPICKERFIELD.FILLPICKUPCONDITION.INFO2','未能找到表单项[' + fetchCond[cond]+ '],无法继续操作',[fetchCond[cond]]),2);
					return false;
				}
				var value = field.getValue();
				if (value == null || value == '') {
					return false;
				}
				fetchparam[cond] = value;
			}
			arg.srffetchcond = JSON.stringify(fetchparam);
		}

		if (me.config.itemParam && me.config.itemParam.temprs) {
			if (form.tempMode) {
				arg.srftempmode = true;
			}
		}

		if (IBizApp_Data) {
			arg.srfappdata = IBizApp_Data;
		}
		arg.srfreferitem = me.config.name;
		var formtype = form.getFormType();
		if (formtype == 'EDITFORM'){
			var activeData = form.getActiveData();
			arg.srfreferdata = JSON.stringify(activeData);
		}else if (formtype == 'SEARCHFORM') {
			var controller = me.getForm().getController();
			var referData = controller.getReferData();
			if (referData)
				arg.srfreferdata = JSON.stringify(referData);

			if (!arg.srfreferdata) {
				var parentData = controller.getParentData();
				if (parentData)
					arg.srfparentdata = JSON.stringify(parentData);
			}
		}
		return true;
	}
});	