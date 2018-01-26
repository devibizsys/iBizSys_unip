/**
 * 数据关系分页
 */
var IBizDRTab = IBizTab.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me=this;
		me.on(IBizTab.SELECTIONCHANGE,function(sender,args,e){
			var me = e.data;
			me.onTabSelectionChange(args);
		},me);
		//激活第一个分页
		me.setActiveItem(0);
	}
	,parentData:null
	,onTabSelectionChange:function(args){
		
		var me=this;
		var href=args.target.attributes['href'].value;
		var itemid=href.replace(new RegExp('#','g'),'');
		var viewid = href.replace(new RegExp('#'+me.id+'_','g'),'');
		
		var controller = me.getController();
		//判断有误对象
		if(viewid=='form')
		{
			me.setActiveItem(0);
			return;
		}
		var parentKey='';
		if(me.parentData){
			parentKey = me.parentData.srfparentkey;
		}
		if(!parentKey || parentKey=='')
		{
			me.setActiveItem(0);
			IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDRTAB.ONTABSELECTIONCHANGE.INFO','请先建立主数据'),0);
			return;
		}
		
		var dritem = {viewid:viewid};
		if(dritem.viewid == undefined || dritem.viewid=='')
			return;
		
		var viewItem = controller.getDRItemView(dritem);
		if(viewItem==null || !viewItem.viewparam)
			return ;
		
		var viewParam =viewItem.viewparam ;
		var parentData = {};
		if(true)
		{
			$.extend(parentData, viewParam);
			$.extend(parentData, me.parentData);
			if(viewParam.srfparentdeid)
			{
				parentData.srfparentdeid=viewParam.srfparentdeid;
			}
		}
		
		var itemid=me.id + '_'+ dritem.viewid.replace(new RegExp(':','g'),'_');
		me.setActiveItem(itemid);
		
		var subController = controller.getController(controller.getCId2()+viewItem.embedviewid);
		if(!subController.isInited())
		{
			subController.asyncInit({parentMode:viewParam,parentData:parentData,renderTo:itemid,subApp:viewItem.subapp,autoLayout:false});
			return;
		}
		
		subController.setParentData(parentData);
		subController.refresh();
	}
	,setParentData:function(pd){
		var me=this;
		me.parentData=pd;
		//向服务器请求状态
		var params={};
		if(me.parentData)
		{
			$.extend(params, me.parentData);
		}
		params.srfaction = 'FETCH';
		
		IBiz.ajax({url:me.config.url,
			params:params,
			method:'POST',
			success:function(data){
				if(data.ret == 0){
					if(data.items)
					{
						$.each(data.items,function(idx,item){
							if(item.enabled==undefined)
								return;
							var dritem=item.dritem;
							if(!dritem||!dritem.viewid)
								return;
							if(item.enabled)
								$('#'+me.getId()+'_h_'+dritem.viewid).show();
							else
								$('#'+me.getId()+'_h_'+dritem.viewid).hide();
								
						});
					}
					
				}else{
					IBiz.alert($IGM('IBIZDRTAB.SETPARENTDATA.TITLE','获取失败'),$IGM('IBIZDRTAB.SETPARENTDATA.INFO','获取数据失败,'+data.info,[data.info]),2);

				}	
			},failure:function(data){
				IBiz.alert($IGM('IBIZAPP.CONFIRM.TITLE.WARN','警告'),$IGM('IBIZDRTAB.AJAX.INFO','执行请求发生异常'),2);
			}
		});
	}
});