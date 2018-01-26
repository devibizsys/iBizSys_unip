/**
 * 分页导航界面
 */
var TabExpViewControllerBase = MainViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	}	
	,onInit: function() {
		arguments.callee.$.onInit.call(this);
		var me = this;
		//初始化分页
		me.exptab = new IBizTab({id:this.getCId2()+'exptab'});
		me.exptab.on(IBizTab.SELECTIONCHANGE,function(sender,args,e){
			var me = e.data;
			me.onTabSelectionChange(args);
		},me);
		//激活第一个分页
		me.exptab.setActiveItem(0);
		me.registerItem('exptab',me.exptab);
	}
	,onTabSelectionChange:function(args)
	{
		var me=this;
		
		var layoutcard = me.getExpTab();
		var href=args.target.attributes['href'].value;
		var itemid=href.replace(new RegExp('#','g'),'');
		var viewid = href.replace(new RegExp('#'+layoutcard.id+'_','g'),'').toUpperCase();
		
		var viewarg={viewid:viewid};

		var viewItem = me.getExpItemView(viewarg);
		if(viewItem==null)
			return ;
			
		var subController = me.getController(me.getCId2()+viewItem.embedviewid);
		if(!subController.isInited())
		{
			subController.asyncInit({parentMode:{},parentData:{},renderTo:itemid,subApp:viewItem.subapp});
			return;
		}
		
		subController.refresh();
	}
	,getExpTab:function(){
		return this.exptab;
	}
});













