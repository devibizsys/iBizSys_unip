/**
 * 导航界面
 */
var ExpViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		if(config.autoLayout==undefined)
			config.autoLayout = true;
		arguments.callee.$.construct.call(this,config);
	}	
	,onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		this.exptab = new IBizExpTab({ctrler:this,id:this.getCId2()+'exptab',showheader:false});
		var activeitem='';
		if(me.viewparam&&me.viewparam.srfactivenavitem){
			activeitem=me.viewparam.srfactivenavitem;
		}
		
		var expbarcfg =  $.extend({},{ctrler:this,id:this.getCId2()+'expbar',url:this.getBackendUrl()+'srfctrlid=expbar&',tabctrl:this.exptab,activeitem:activeitem},this.config.ctrls.expbar);
		this.expbar = new IBizExpBar2(expbarcfg);
		
		me.registerItem('expbar',this.expbar);
		me.registerItem('exptab',this.exptab);
	}
	,getExpBar:function(){
		return this.expbar;
	}
	,getExpTab:function(){
		return this.exptab;
	}
});



