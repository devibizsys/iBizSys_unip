/**
 * 窗口对象
 */
var IBizWindow = IBizControl.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.viewparam = {};
		me.ownerwin = null;
		me.showmodel=false;
	},
	getOpenerId : function() {
		return this.config.openerid;
	},
	getParentParam : function() {
		return null;
	},
	setOwnerWindow:function(win){
		var me=this;
		//me.ownerwin = win;
	},
	getOwnerWindow:function(){
		var me=this;
		return me.ownerwin;
	},
	isShowModal:function(){
		var me=this;
		return me.showmodel;
	},
	/**
	 * @param win 当前浏览器窗口对象
	 */
	close : function(win) {
		var me = this;
		var index = me.winIndex;
		try {
			me.ownerwin = null;
			window.rootlayer.close(index);
			window.layer.close(index);
		} catch (e) {
		}
		
		try {
			if(win&&win.layer)
				win.layer.close(index);
			if(win&&win.rootlayer)
				win.rootlayer.close(index);
			
		} catch (e) {
		}

		try {
			$.getIBizApp().releaseWindow(me.getId());
	
			if (me.callback) {
				me.callback(me);
			}
			if (win) {
				if (win.opener && win.opener.window) {
					win.close();
				}
			}
		} catch (e) {
		}
	},
	open : function() {
		var me = this;
		me.openInNewWindow(window);
	},
	openModal : function(win) {
		var me = this;
		me.showmodel = true;
		
		if (!me.width) {
			if(win.outerWidth)
				me.width = win.outerWidth - 100;
			else 
				me.width = $(win).width() - 100;
		}
		if (!me.height) {
			if(win.outerHeight)
				me.height = win.outerHeight - 100;
			else
				me.height = $(win).height() - 100;
		}


		//附加参数
		var urlparams2 = me.viewparam||{};
		var urlparams=$.extend({},urlparams2);
		for (var A in urlparams2) {
            var value = urlparams2[A];
            if (value && value.toString().length >100){
            	delete urlparams[A];
            }
		}
		
		var params = $.param(urlparams);
		var cUrl = me.url + '&' + params;

		var myLayer;
		try
		{
			if (win.opener && win.opener.window) {
				myLayer = win.layer;
			} else {
				myLayer = win.rootlayer;
			}
		}
		catch(e)
		{
			myLayer = win.rootlayer;
		}
		
		me.winIndex = myLayer.open({
			type : 2,
			area : [ me.width + 'px', me.height + 'px' ],
			title : me.title,
			fix : false,
			maxmin : true,
			content : cUrl,
			cancel : function(index) {
				if (me.beforecallback) {
					var tag = me.beforecallback(me);
					if (tag) {
						IBiz.confirm3(tag.win,tag.msg, function(result) {
							if (result) {
								me.close(tag.win);
								return true;
							}
						});
						return false;
					}else {
						me.close(me.getOwnerWindow());
						return true;
					}
				}else
				{
					me.close(me.getOwnerWindow());
					return true;
				}
			}
		});
	},
	beforeClose : function() {
		var me = this;
		if (me.beforecallback) {
			return me.beforecallback(me);
		}
		return false;
	},
	openInNewWindow : function(win) {
		var me = this;

		var urlparams2 = me.viewparam||{};
		var urlparams=$.extend({},urlparams2);
		for (var A in urlparams2) {
            var value = urlparams2[A];
            if (value && value.toString().length >100){
            	delete urlparams[A];
            }
		}
		
		//delete urlparams['windowid'];
		//delete urlparams['openerid'];
		var params = $.param(urlparams);
		var cUrl = me.url + '&' + params;
		setTimeout(function() {
			if (win && win.parent) {
				win.parent.window.open(cUrl, "_blank");
			} else {
				window.open(cUrl);
			}
		}, 1);
	}
});