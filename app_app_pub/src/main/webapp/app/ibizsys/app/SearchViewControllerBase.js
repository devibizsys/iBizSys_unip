/**
 * 搜索视图控制器对象
 */
var SearchViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		if(config.autoLayout==undefined)
		{
			if(config.pcontroller)
			{
				config.autoLayout  = config.pcontroller.isAutoLayout();
			}
			else
				config.autoLayout = true;
		}
		arguments.callee.$.construct.call(this, config);
		var me = this;
	},
	/**
	 * 初始化
	 */
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		me.parentDataChanged = false;
		
		if(me.searchform){
			me.searchform.init();
			if(me.isLoadDefault())
			{
				me.searchform.autoLoad(me.viewparam);
			}
			if(me.hasQuickSearch() == true){
				me.searchform.close();
			}
			else
				{
					me.searchform.open();
				}
		}
		me.doLayout();
	},
	onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;
		
	
		var dataurl = me.getBackendUrl()+'srfctrlid=searchform&SRFSUBAPP='+me.subapp+'&';
		
		//初始化快速搜索
		if($('#'+this.getCId2()+'searchcond').length>0)
		{
			me.bQuickSearch = true;
			me.quickSearch = $('#'+this.getCId2()+'searchcond');
		}
		if(me.quickSearch){
			me.quickSearch.keyup(function() {
	            if (event.keyCode == "13") {
	            	me.onSearchFormSearched();
	            }
	        });
		}
		
		me.quickSearchBtn = $('#'+this.getCId2()+'searchbutton');
		if(me.quickSearchBtn){
			me.quickSearchBtn.click(function(e){
				me.onSearchFormSearched();
			});
		}
		me.moreSearchBtn = $('#'+this.getCId2()+'moresearchbutton');
		if(me.moreSearchBtn){
			me.moreSearchBtn.click(function(e){
				if(me.searchform){
					if(me.searchform.isOpen() == true){
						me.searchform.close();
					}else{
						me.searchform.open();
					}
					me.doLayout();
				}
			});
		}
		
		//初始化搜索面板
		if(me.hasHtmlElement('searchform')){
			me.searchform = me.createSearchForm({id:this.getCId2()+'searchform',url:dataurl,ctrler: me});
			me.registerItem('searchform',me.searchform);
			me.searchform.on(IBizSearchForm.FORMSEARCHED, function(sender, args, e) {
				me.onSearchFormSearched();
			}, me);
			me.searchform.on(IBizSearchForm.FORMRESETED, function(sender, args, e) {
				me.onSearchFormReseted();
			}, me);
			me.searchform.on(IBizForm.FORMFIELDCHANGED, function(sender, args, e) {
				var fieldname = '';
				if (sender != null) fieldname = sender.getName();
				if (!args) args = {};
				me.onSearchFormFieldChanged(fieldname, sender, args.newvalue, args.oldvalue);
			}, me);
		}
	},
	createSearchForm:function(config){
		return IBiz.createSearchForm(config);
	},
	hasQuickSearch:function(){
		var me = this;
		return me.bQuickSearch;
	},
	/**
	 * 获取搜索表单对象
	 */
	getSearchForm:function(){
		return this.searchform;
	},
	/**
	 * 搜索表单属性值发生变化
	 */
	onSearchFormFieldChanged: function(fieldname, field, value) {
		var me = this;
	},
	/**
	 * 搜索表单重置
	 */
	onSearchFormReseted:function(){
		
	},
	
	isLoadDefault: function() {
		return true;
	},
	getSearchCond: function() {
		if (this.getSearchForm()) {
			return this.getSearchForm().getValues();
		}
		return null;
	},
	onSearchFormSearched: function() {
	},
	onSearchFormReseted: function() {
	},
	/**
	 * 数据加载之前
	 */
	onStoreBeforeLoad: function(sender, args, e) {
		var me = this;
        var fetchParam = {};
        if (me.viewparam){
        	$.extend(fetchParam,me.viewparam);
        }
        if (me.getParentMode()) {
        	$.extend(fetchParam, me.getParentMode());
        }
        if (me.getParentData()) {
        	$.extend(fetchParam, me.getParentData());
        }
        if ((me.getSearchCond() && me.searchform.isOpen()) || !me.hasQuickSearch()) {
        	$.extend(fetchParam, me.getSearchCond());
        }
        //获取快速搜索里的搜索参数
        if(me.hasQuickSearch() && me.quickSearch){
        	args['search'] = me.quickSearch.val();
        }
        $.extend(args, fetchParam);
	}
	/**
	 * 数据加载之前
	 */
	,onStoreLoad: function(sender, args, e) {
		var me = this;
    	me.parentDataChanged = false;
    	me.reloadUICounters();
	}
	,
	onSetParentData: function() {
		arguments.callee.$.onSetParentData.call(this);
		this.parentDataChanged = true;
	}
	/**
	 * 数据被激活<最典型的情况就是行双击>
	 * @param record 记录
	 * @param e 事件
	 */
	,onDataActivated: function(record, e) {
		var me = this;
		
	}
});
/*****************事件声明************************/

