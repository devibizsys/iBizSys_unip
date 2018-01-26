/**
 * 表单对象
 */
var IBizSearchForm = IBizForm.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
		var me = this;
		me.container = $('#'+config.id);
		me.searchBtn = $('#'+config.id+'_searchbutton');
		me.resetBtn = $('#'+config.id+'_resetbutton');
		me.searchTab = $('#'+config.id+'_tab li');
		me.bResetting = false;
		
		if(me.searchBtn){
			if(me.getController().hasQuickSearch()){
				me.searchBtn.addClass('hidden');
			}else{
				me.searchBtn.click(me,function(e){
					e.data.onSearch();
				});
			}
		}
		if(me.resetBtn){
			me.resetBtn.click(me,function(e){
				e.data.onReset();
			});
		}
		
		me.container.find('input').keyup(function() {
            if (event.keyCode == "13") {
            	me.onSearch();
            }
		}); 
		me.container.find('select').keyup(function() {
            if (event.keyCode == "13") {
            	me.onSearch();
            }
		}); 
		me.searchTab.click(function(){
			setTimeout(function(){
				me.controller.doLayout();
			},70);
		});
		//是否有自定义搜索面板
		if(me.isCustomSearch())
			me.initCustomSearchPanel();
	},
	//是否开启自定义查询
	isCustomSearch : function (){
		var me = this;
		if(me.config &&me.config.enableAdvanceSearch)
			return true;
		else
			return false;
	},
	//初始化自定义搜索面板
	initCustomSearchPanel : function(){
		var me = this;
		var cid = '';
		me.customSearchView = $('#'+me.config.id+'_addsearchbutton');
		if(me.customSearchView){
			me.customSearchView.on("click","",function(){
				me.openPickView();
			});
		}
	},
	//设置自定义查询值
	setCustomSearchVal : function(value, text){
		var me = this;
		
		me.customSearchVal = value;
		
		var searchText = $("#"+me.config.id+"_searchtext");
		if(searchText)
			searchText.text(text);
	},
	getCustomSearchVal : function(){
		var me = this;
		var cmsVal = {};
		if(me.customSearchVal && me.customSearchVal != '')
			cmsVal.customsearchval = JSON.stringify(me.customSearchVal);
		return cmsVal;
	},
	//打开搜索条件面板视图
	openPickView : function(){
		var me = this;
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = {};
		
		if(me.config.dename){
			viewparam['dename'] = me.config.dename;
		}
		if(me.config.ctrler.getId()){
			viewparam['ctrid'] = me.config.ctrler.getId();
			viewparam['openerid'] = me.config.ctrler.getId();
		}
		viewparam['windowid'] = win.getId();
		win.scope = me;
		win.title = $IGM('IBIZSEARCHFORM.OPENPICKVIEW.INFO','自定义搜索');
		win.height = 500;
		win.width = 900;
		win.url = BASEURL + '/ibizutil/customsearchview.jsp?' + $.param({windowid:win.getId()});
		win.viewparam = viewparam;
		win.callback = function(win){
			me.pickerWindowClose(win);
		};	
		win.openModal(window);
	},
	//点击确定按钮关闭窗口对象
	pickerWindowClose : function(win){
		var me = this;
		if(win.dialogResult == "ok"){
			var tmp = win.tmp;
			me.setCustomSearchVal(win.param, win.tmp);
		}
	},
	isOpen:function(){
		var me = this;
		return me.opened;
	},
	open:function(){
		var me = this;
		me.opened = true;
		if(me.container){
			me.container.removeClass('hidden');
		}
	},
	close:function(){
		var me = this;
		me.opened = false;
		if(me.container){
			me.container.addClass('hidden');
		}
	},
	/**
	 * 搜索
	 */
	onSearch:function(){
		var me = this;
		me.fireEvent(IBizSearchForm.FORMSEARCHED, me, {});
	},
	/**
	 * 重置
	 */
	onReset:function(){
		var me = this;
		me.bResetting = true;
		me.setCustomSearchVal('', '');
		me.reset();
	},
	onDraftLoaded:function(){
		var me = this;
		me.fireEvent(IBizSearchForm.FORMRESETED, me, {});
	},
	onLoaded:function(){
		var me = this;
		me.fireEvent(IBizSearchForm.FORMRESETED, me, {});
	},
    getFormType:function(){
    	return 'SEARCHFORM';
    },
	getHeight:function(){
		var me = this;
		if(me.isOpen())
		{
			return me.container.outerHeight();
		}
		return 0;
	}
});
/*****************事件声明************************/
/**
 * 搜索表单重置事件
 */
IBizSearchForm.FORMRESETED = 'FORMRESETED';
/**
 * 搜索表单搜索事件
 */
IBizSearchForm.FORMSEARCHED = 'FORMSEARCHED';