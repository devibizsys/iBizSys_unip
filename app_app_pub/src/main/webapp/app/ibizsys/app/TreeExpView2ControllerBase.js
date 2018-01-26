/**
 * 树导航界面2
 */
var TreeExpView2ControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		if(config.autoLayout==undefined)
			config.autoLayout = true;
		arguments.callee.$.construct.call(this,config);
	}	
	,onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;
		me.expframe=  $("#"+this.getCId2()+"expframe");
		var treeExpBarCfg=me.getTreeExpBarCfg();
		treeExpBarCfg = $.extend(treeExpBarCfg,{id:me.getCId2()+'treeexpbar',name:'treeexpbar',ctrler:this,expframe:me.expframe});
		me.treeexpbar = new IBizTreeExpBar(treeExpBarCfg);
		me.registerItem('treeexpbar',me.treeexpbar);
	}
	,getTreeExpBar:function(){
		return this.treeexpbar;
	}
	,getExpFrame:function(){
		return this.expframe;
	}
	,getTreeExpBarCfg:function(){
		return this.config.ctrls.treeexpbar||{};
	},
	doDEUIAction: function(uiaction,params) {
		var me = this;
		me.treeReloadMode = '';
		if (uiaction.tag == 'Remove') {
			me.doRemove(params);
			return;
		}
		if (uiaction.tag == 'Refresh') {
			me.doTreeRefresh(params);
			return;
		}
		if (uiaction.tag == 'New') {
			me.doNew(params);
			return;
		}
		if (uiaction.tag == 'Edit') {
			me.doEdit(params);
			return;
		}
		if (uiaction.tag == 'Copy') {
			me.doCopy(params);
			return;
		}
		
		arguments.callee.$.doDEUIAction.call(me, uiaction,params);
	},
	/*新建操作*/
	doNew: function(params) {
		var me = this;
		me.onNewData(params);
	},	
	/*拷贝操作*/
	doCopy: function(params) {
		var me = this;
		var arg = {
			data: params,
			srfcopymode: true
		};
		me.onEditData(arg);
	},
	/*编辑操作*/
	doEdit: function(params) {
		var me = this;
		//获取要编辑的数据集合
		if(params && params.srfkey){
			var arg = {data: params};
			me.onEditData(arg);
			return;
		}
		/*var node = me.getTreeExpBar().getTree().getSelection();
		if (node == null || !node.id) return;

		params.srfkey = node.id;
		var arg = {
			data: params
		};
		me.onEditData(arg);*/
	},
	/*查看操作*/
	doView: function(params) {
		this.doEdit(params);
	},
	/*删除操作*/
	doRemove: function(params) {
		this.onRemove(params);;
	},
	/*刷新操作*/
	doTreeRefresh: function(params) {
		this.onTreeRefresh(params);
	},
	/**
	 * 新建数据
	 */
	onNewData: function(arg) {
		var me = this;
		me.treeReloadMode = TreeExpView2ControllerBase.REFRESHMODE_CURRENTNODE;
		var loadParam = {};
		if (me.getViewParam()) {
			$.extend(loadParam, me.getViewParam());
		}
		if (me.getParentMode()) {
			$.extend(loadParam, me.getParentMode());
		}
		if (me.getParentData()) {
			$.extend(loadParam, me.getParentData());
		}
		if (me.isEnableBatchAdd()) {
			me.doNewDataBatch(loadParam);
			return;
		}
		if (me.doNewDataWizard(loadParam)) {
			return;
		}
		
		var newMode = me.getNewMode(arg);
		if (newMode) {
			loadParam.srfnewmode = newMode;
		}
		me.doNewDataNormal(loadParam,arg);
	},

	/**
	 * 批量新建
	 */
	doNewDataBatch: function(arg) {
		var me = this;
		var mpickupview = me.getMPickupView(arg);
		if (mpickupview){
			var win = $.getIBizApp().createWindow({});
			var viewparam = {};
			$.extend(viewparam, mpickupview.viewparam);
			if(!viewparam.srfreferdata){
				if(viewparam.srfparentdata)
				{
					viewparam.srfreferdata = viewparam.srfparentdata;
					delete viewparam.srfparentdata;
				}
			}
			viewparam['windowid'] = win.getId();
			viewparam['openerid'] = me.getId();
			win.title = mpickupview.title;
			win.scope = me;
			win.height = mpickupview.height?mpickupview.height:0;
			win.width = mpickupview.width?mpickupview.width:0;
			win.url = $.getIBizApp().parseURL2(mpickupview.subapp,mpickupview.viewurl,{windowid:win.getId(),openerid:me.getId()});
			win.viewparam = viewparam;
			win.callback =  me.onMPickupWindowClose;

			if(mpickupview.modal){
				 win.openModal(window);
			}else{
				 win.openInNewWindow(window);
			}
            
	        return true;
		}
		return false;
	},
	/**
	 * 批量新建关闭
	 */
	onMPickupWindowClose: function(win) {
		var me = win.scope;
		var loadParam = win.userData;
		var dialogResult = win.dialogResult;
		if (!dialogResult) return;
		if (dialogResult == 'ok') {
			var selectedDatas = win.selectedDatas;
			if (!selectedDatas) {
				return;
			}
			me.addDataBatch(selectedDatas);
		}
		return;
	},
	/**
	 * 批量添加数据
	 */
	addDataBatch: function(selectedDatas) {
		IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('TREEEXPVIEW2CONTROLLER.ADDDATABATCH.INFO','[addDataBatch]方法必须重写！'),2);
	},
	/**
	 * 向导新建数据
	 */
	doNewDataWizard: function(arg) {
		var me = this;
		var wizardview = me.getNewDataWizardView(arg);
		if (wizardview != null) {
			var win = $.getIBizApp().createWindow({});
			var viewparam = {};
			viewparam['windowid'] = win.getId();
			viewparam['openerid'] = me.getId();
			win.title = wizardview.title;
			win.scope = me;
			win.height = wizardview.height?wizardview.height:0;
			win.width = wizardview.width?wizardview.width:0;
			win.url = $.getIBizApp().parseURL2(wizardview.subapp,wizardview.viewurl,{windowid:win.getId(),openerid:me.getId()});
			win.viewparam = viewparam;
			win.callback =  me.onNewDataWizardWindowClose;
            if(wizardview.modal){
   			 	win.openModal(window);
	   		}else{
	   			win.openInNewWindow(window);
	   		}
	        return true;
		}

		return false;
	},
	/**
	 * 向导新建数据窗口关闭
	 */
	onNewDataWizardWindowClose: function(win, eOpts) {
		var me = win.scope;
		var loadParam = {};//win.userData;
		var dialogResult = win.dialogResult;
		if (!dialogResult) return;
		if (dialogResult == 'ok') {
			var selectedData = win.selectedData;
			if (selectedData) {
				var newMode = selectedData.srfkey;
				loadParam.srfnewmode = newMode;
				var view = me.getNewDataView(loadParam);
				if (view == null){
					return;
				}
				me.openDataView(view);
			}
		}
		return;
	},
	/**
	 * 常规新建数据
	 */
	doNewDataNormal: function(arg,params) {
		var me = this;
		var view = me.getNewDataView(arg);
		if (view == null){
			return false;
		}
		if(params && view.viewparam && view.viewparam.srfparenttype){
			var parentType = view.viewparam.srfparenttype;
			if(parentType == 'DER1N'){
				view.viewparam.srfparentkey = params.srfkey;
			}
		}
		return me.openDataView(view);
	},
	/**
	 * 编辑数据
	 */
	onEditData: function(arg) {
		var me = this;
		me.treeReloadMode = TreeExpView2ControllerBase.REFRESHMODE_PARENTNODE;
		var loadParam = {};
		if (me.getViewParam()) {
			$.extend(loadParam, me.getViewParam());
		}
		if (this.getParentMode()) {
			$.extend(loadParam, me.getParentMode());
		}
		if (this.getParentData()) {
			$.extend(loadParam, me.getParentData());
		}
		if (arg.srfcopymode) {
			$.extend(loadParam, {
				srfsourcekey: arg.data.srfkey
			});
		} else {
			$.extend(loadParam, {srfkey: arg.data.srfkey});
		}
		
		var editMode = me.getEditMode(arg.data);
		if (editMode) {
			loadParam.srfeditmode = editMode;
		}
		if(arg.data.srfmstag){
			loadParam.srfeditmode2 = arg.data.srfmstag;
		}
		
		loadParam.openerid = me.getId();
		me.doEditDataNormal(loadParam,arg);
	},
	/**
	 * 执行常规编辑数据
	 */
	doEditDataNormal: function(arg) {
		var me = this;
		var view = me.getEditDataView(arg);
		if (view == null) {
			return false;
		}
		return me.openDataView(view);
	},
	/**
	 * 打开数据视图
	 */
	openDataView: function(view) {
		var me = this;
		var openMode = view.openMode;
		if (openMode != undefined) {
			if (openMode == 'POPUPMODAL') {
				view.modal = true;
			} else if (openMode == 'POPUP') {
				view.modal = true;
			} else if (openMode == '' || openMode == 'INDEXVIEWTAB') {
				view.modal = false;
			}
		}
		if (me.isShowModal()) {
			view.modal = true;
		}
		
		var win = $.getIBizApp().createWindow({});
		var viewparam = view.viewparam;
		if(!viewparam){
			viewparam = {};
		}
		viewparam['windowid'] = win.getId();
		viewparam['openerid'] = me.getId();
		win.title = view.title;
		win.scope = me;
		win.height = view.height?view.height:0;
		win.width = view.width?view.width:0;
		win.url = $.getIBizApp().parseURL2(view.subapp,view.viewurl,{windowid:win.getId(),openerid:me.getId()});
		win.viewparam = viewparam;
		if(view.modal){
			 win.openModal(window);
		}else{
			 win.openInNewWindow(window);
		}
        return true;
	},
	onRemove: function (params){
    	var me=this;
    	var node;
    	if(params && params.node){
    		node = params.node;
    	}
    	if(node==null||node.length==0)
    		return;
    	
    	var dataInfo = params.srfmajortext; 
    	//询问框
    	IBiz.confirm($IGM('TREEEXPVIEW2CONTROLLER.ONREMOVE.INFO','确认要删除 （'+dataInfo+'） ，删除操作将不可恢复？',[dataInfo]), function(result) {
              if(result)
              {
            	  me.getTreeExpBar().getTree().remove(node);
              }
        });
     },
     /**
      * 界面操作树节点刷新
      */
     onTreeRefresh: function(params){
    	var me=this;
		var node;
		if(params && params.node){
			node = params.node;
		}
		if(node==null||node.length==0){
			var nodes = me.getSelected(true);
			if(nodes && nodes.length >0)
				node = nodes[0];
		}
		
		//刷新树节点
		me.getTreeExpBar().getTree().reload(node);
     },
     /**
      * 视图刷新操作
      */
     onRefresh: function(){
     	var me=this;
 		var node;
 		if(me.treeReloadMode == TreeExpView2ControllerBase.REFRESHMODE_NONE){
 			return;
 		}else if(me.treeReloadMode == TreeExpView2ControllerBase.REFRESHMODE_CURRENTNODE){
 			var nodes = me.getSelected(true);
 			if(nodes && nodes.length >0)
 				node = nodes[0];
 		}else if(me.treeReloadMode == TreeExpView2ControllerBase.REFRESHMODE_PARENTNODE){
 			var nodes = me.getSelected(true);
 			if(nodes && nodes.length >0)
 				node = nodes[0].parent;
 		}
 		
 		//刷新树节点
 		me.getTreeExpBar().getTree().reload(node);
 		
 		//刷新内容区
// 		if(me.expframe){
// 			if($.isFunction(me.expframe.refresh)){
// 				me.expframe.refresh();
// 				return;
// 			}
// 		}
      },
     getSelected: function(bFull){
    	 var me = this;
    	 var nodes = me.getTreeExpBar().getTree().getSelected(bFull);
    	 return nodes;
     },
	/**
	 * 获取新建模式
	 */
	getNewMode: function(data) {
		return 'NEWDATA@'+data.srfnodetype;
	},
	/**
	 * 获取编辑模式
	 */
	getEditMode: function(data) {
		return 'EDITDATA@'+data.srfnodetype;
	},
	/**
	 * 获取编辑视图
	 */
	getEditDataView: function(arg) {
		return null;
	},
	/**
	 * 获取新建视图
	 */
	getNewDataView: function(arg) {
		return null;
	},
	/**
	 * 获取新建向导视图
	 */
	getNewDataWizardView: function(arg) {
		return null;
	},
	/**
	 * 获取多选视图
	 */
	getMPickupView: function(arg) {
		return null;
	},
	doBackendUIAction: function(arg,params) {
		var me = this;
		me.getTreeExpBar().getTree().doUIAction(arg,params);
	},
	isEnableBatchAdd: function() {
		return false;
	},
	isBatchAddOnly: function() {
		return false;
	},	
 	getBackendUIActionParam:function(uiaction,params){
    	 var me=this;
    	 if(uiaction.actiontarget=='SINGLEKEY' || uiaction.actiontarget=='MULTIKEY'){
    		 var  node = null;
    		 
    		 var keys = params.srfkey;
    		 var dataInfo = params.srfmajortext;
    		 var nodeType = params.srfnodetype;
    		 return {srfkeys:keys,srfkey:keys,dataInfo:dataInfo,srfnodetype:nodeType};
    	 }
    	 return {};
    }
});

TreeExpView2ControllerBase.REFRESHMODE_CURRENTNODE = 'CURRENTNODE';
TreeExpView2ControllerBase.REFRESHMODE_PARENTNODE = 'PARENTNODE';
TreeExpView2ControllerBase.REFRESHMODE_ALLNODE = 'ALLNODE';
TreeExpView2ControllerBase.REFRESHMODE_NONE = 'NONE';











