/**
 * 数据选择表单属性<可以是 下拉、放大镜>
 * 启用禁用完成
 */
var IBizPickerField = IBizField.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.field = $('#' + this.getUniqueId());
		me.initSize(me.field.parent());
		me.initSize(me.field);
		
		if(config.pageSize >0)
		{
			me.pageSize = config.pageSize;
		}else{
			me.pageSize = 50;
		}
		
		if(config.minChars >0)
		{
			me.minChars = config.minChars;
		}else{
			me.minChars = 2;
		}
		
		me.valueItem = this.config.valueItem;
		
		me.srftext = '';
		me.srfvalue = '';

		if (me.config.pickupView) {
			me.field.parent().find(".toggle").click(function(){
				me.openPickView();
			});
		}
		if (me.config.linkview){
			me.field.parent().find(".linkEditor").click(function(){
				me.openEditView();
			});
		}
		if (me.config.ac != undefined && !me.config.ac){
			me.field.attr("readOnly",true);
		}
		me.field.parent().autocomplete(
				{
					type:'POST',
					minChars: me.minChars,
					serviceUrl : function() {
						return me.config.url + '&srfaction=itemfetch';
					},
					onSelect : function(data) {
						me.onSelectValue(data.data, data.value);
					},
					onSearchStart : function(params) {
						var curparams = {
							srfaction : 'itemfetch'
						};
						var bcancel = me.fillPickupCondition(curparams);
						if(bcancel == false)
							return false;
						params = $.extend(params, curparams);
						params['limit'] = me.pageSize;
						return true;
					},
					onACClosed : function(that) {
						if (me.field.val() == '') {
							me.onSelectValue('', '');
							return;
						}
						if (me.field.val() != me.value) {
							me.field.val(me.value);
						}
					},
					onToggleClick : function(that) {
						if (me.pickermode) {
							me.openPickView();
						} else {
							that.getSuggestions('');
						}
					},
					transformResult : function(response) {
						var data = (typeof response === 'string' ? $.parseJSON(response) : response);
						var items = [];
						if (data.ret == 0) {
							$.each(data.items, function(index, item) {
								var text = item.text ? item.text.toString(): $IGM('IBIZPICKERFIELD.TRANSFORMRESULT.INFO','未定义');
								var data = item.value ? item.value.toString(): '';
								items.push({
									value : text,
									data : data
								});
							});
						}
						if(items.length == 0 && me.pickermode == true){
							items.push({
								value : $IGM('IBIZPICKERFIELD.TRANSFORMRESULT.INFO2','找不到符合的数据'),
								data : ''
							});
						}
						return {
							'suggestions' : items
						};
					}
				});
	},
	onSelectValue : function(id, text) {
		var me = this;
		if(!id || id == ''){
			id = '';
			text = '';
		}
		me.getForm().setFieldValue(me.valueItem, id);
		me.setValue(text);
	},
	onValueChanged:function(oldValue,newValue){
		var me = this;
		me.field.val(newValue);
		arguments.callee.$.onValueChanged.call(me,oldValue,newValue);
	},
	pickerWindowClose : function(win) {
		var me = this;
		if (win.dialogResult == 'ok') {
			if (win.selectedData) {
				me.onSelectValue(win.selectedData.srfkey,win.selectedData.srfmajortext);
			}
		} else if (win.dialogResult == 'reset') {
			me.onSelectValue('', '');
		}
	},
	openEditView : function(){
		var me = this;
		var data = {};
		var viewparam = {};
		var bcancel = me.fillPickupCondition(data);
		if(bcancel == false){
			return;
		}
		viewparam.srfkey = JSON.parse(data.srfreferdata)[me.config.valueItem];
		if(!viewparam.srfkey){
			return;
		}
		var win = $.getIBizApp().createWindow({});
		viewparam['windowid'] = win.getId();
		win.title = me.config.linkview.title;
		win.height = me.config.linkview.height;
		win.width = me.config.linkview.width;
		win.url = $.getIBizApp().parseURL(BASEURL, me.config.linkview.view, {
			windowid : win.getId()
		});
		win.viewparam = viewparam;
		win.openModal(window);
	},
	openPickView : function() {
		var me = this;
		if (me.isDisabled())
			return;

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
		win.url = $.getIBizApp().parseURL(BASEURL, me.config.pickupView.view, {
			windowid : win.getId()
		});
		win.viewparam = viewparam;
		win.callback = function(win) {
			me.pickerWindowClose(win);
		};
		win.openModal(window);
	},
	/**
	 * 填充条件
	 */
	fillPickupCondition : function(arg) {
		var me = this;
		var form = me.getForm();
		if (!form) {
			IBiz.alert($IGM('IBIZPICKERFIELD.FILLPICKUPCONDITION.TITLE','操作失败'),$IGM('IBIZPICKERFIELD.FILLPICKUPCONDITION.INFO','未能找到当前表单，无法继续操作'),2);
			return false;
		}
		
		if (me.config.itemParam && me.config.itemParam.fetchcond) {
			var fetchparam = {};
			var fetchCond = me.config.itemParam.fetchcond;
			for ( var cond in fetchCond) {
				var field = form.findField(fetchCond[cond]);
				if (!field) {
					IBiz.alert($IGM('IBIZPICKERFIELD.FILLPICKUPCONDITION.TITLE','操作失败'),$IGM('IBIZPICKERFIELD.FILLPICKUPCONDITION.INFO2','未能找到表单项[' + fetchCond[cond]+ '],无法继续操作',[fetchCond[cond]]),2);
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