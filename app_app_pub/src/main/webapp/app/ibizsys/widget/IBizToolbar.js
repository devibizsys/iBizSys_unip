/**
 * 工具栏控件<后期要重点测试下拉式工具栏事件的呼出等操作 以及工具栏暂时不支持Check按钮等>
 */
var IBizToolbar = IBizControl.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.items = [];
		me.toolbar = $('#' + me.getId());
		if (me.toolbar) {
			me.toolbar.find('.ibiz-toolbar-item').each(
					function(index, element) {
						var item = $(this);
						if (!item.hasClass('ibiz-id-dropdown')) {
							me.items.push(item);
							item.click(function(e) {
								var params = {};
								params['tag'] = $(this).attr('data-ibiz-tag');
								me.itemclick(params, e);
							});
						}
					});

			// 查找下拉按钮
			me.toolbar.find('.ibiz-id-dropdown').each(function(index, element) {
				var item = $(this);
				me.items.push(item);
				var tag = item.attr('data-ibiz-tag');

				// 循环
				item.find(".ibiz-id-item").click(function(e) {
					var mytag = $(this).attr('data-ibiz-tag');
					var params = {};
					params['itemtag'] = mytag;
					params['tag'] = tag;
					params['obj'] = item;
					me.itemclick(params);
				});
			});
		}
	},
	/**
	 * 更新权限
	 */
	updateAccAction : function(action) {
		var me = this;
		$.each(me.items, function(idx, item) {
			var priv = $(item).attr('data-ibiz-priv');
			if (priv) {
				if (action != undefined && action[priv] != undefined && action[priv] != 1) {
					item.addClass('hide');
					return true;
				}
			}
			item.removeClass('hide');
		});
	},
	/**
	 * 点击按钮
	 */
	itemclick : function(params, e) {
		var me = this;
		me.fireEvent(IBizToolbar.ITEMCLICK, me, params);
	}
});
/** ***************事件声明*********************** */
/**
 * 点击按钮事件
 */
IBizToolbar.ITEMCLICK = 'ITEMCLICK';
