/**
 * 树导航界面
 */
var TreeExpViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		if(config.autoLayout==undefined)
			config.autoLayout = true;
		arguments.callee.$.construct.call(this,config);
	}	
	,onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;
		//初始化分页
		me.exptab = new IBizExpTab({ctrler:this,id:this.getCId2()+'exptab',showheader:false});
		me.registerItem('exptab',this.exptab);
		var treeExpBarCfg=me.getTreeExpBarCfg();
		treeExpBarCfg = $.extend(treeExpBarCfg,{id:this.getCId2()+'treeexpbar',ctrler:this,tabctrl : me.exptab});
		me.treeexpbar = new IBizTreeExpBar(treeExpBarCfg);
		me.registerItem('treeexpbar',me.treeexpbar);
	}
	,getTreeExpBar:function(){
		return this.treeexpbar;
	}
	,getExpTab:function(){
		return this.exptab;
	}
	,getTreeExpBarCfg:function(){
		return this.config.ctrls.treeexpbar||{};
	}
	,getExpTabCfg:function(){
		return this.config.ctrls.exptab||{};
	}
});













