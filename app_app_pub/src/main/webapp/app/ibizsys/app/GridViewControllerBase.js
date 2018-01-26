/**
 * 多数据视图控制器对象
 */
var GridViewControllerBase = MDViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	/**
	 * 初始化
	 */
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
		if(!me.searchform){
			me.datagrid.load();
		}
	},
	/**
	 * 执行初始化
	 */
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		
		if(me.hasHtmlElement('grid')){
			var dataurl = me.config.backendurl+'srfctrlid=grid&SRFSUBAPP='+me.subapp+'&';
			//初始化主表格
			var dgCfg = $.extend({id:this.getCId2()+'grid',url:dataurl},me.config.ctrls.grid);
			dgCfg.multiselect=me.isEnableMultiSelect();
			me.datagrid = me.createGrid(dgCfg);
			me.datagrid.on(IBizDataGrid.ROWDBLCLICK, function(sender,args,e){
				var me = e.data;
	    		me.onDataActivated(args,e);
	        }, me);	
			me.registerItem('grid',me.datagrid);
		}
		me.doLayout();
	},
	createGrid:function(config){
		return IBiz.createGrid(config);
	},
	setSize:function(width,height){
		arguments.callee.$.setSize.call(this,width,height);
	},
	/**
	 * 获取多项数据控件对象
	 */
	getMDCtrl: function() {
		return this.getGrid();
	},
	getGrid:function(){
		return this.datagrid;
	},
	/*隐藏关系列*/
    doHideParentColumns: function (parentMode) {
    }, 
    /*隐藏列*/
    hideGridColumn: function (columnname) {
        
    },
    /*删除操作*/
    doRemove: function (params){
    	var me=this;
    	if(params && params.srfkey){
    		if($.isFunction(me.getMDCtrl().findItem)){
				params = me.getMDCtrl().findItem('srfkey',params.srfkey);
			}
    		//询问框
        	IBiz.confirm($IGM('GRIDVIEWCONTROLLER.DOREMOVE.INFO','确认要删除数据，删除操作将不可恢复？'), function(result) {
                  if(result)
                  {
                	  me.removeData({srfkeys:params.srfkey});
                  }
            });
    	}
    	else{
    		var selectedData =  me.getGrid().getSelection() ;
        	if(selectedData==null||selectedData.length==0)
        		return;
        	
        	var dataInfo = '';
        	
        	$.each(selectedData, function(index, record) {  
        		var srfmajortext = record.srfmajortext;
        		if(index<5)
        		{
        			if(dataInfo!='')
        				dataInfo+='、';
        			dataInfo+=srfmajortext;
        		}
        		else
        			return false;
    		}); 
        	if(selectedData.length<5)
        	{
        		dataInfo = dataInfo+$IGM('GRIDVIEWCONTROLLER.DOREMOVE.DATAINFO','共')+selectedData.length+$IGM('GRIDVIEWCONTROLLER.DOREMOVE.DATAINFO2','条数据');
        	}
        	else
        	{
        		dataInfo = dataInfo+'...'+$IGM('GRIDVIEWCONTROLLER.DOREMOVE.DATAINFO','共')+selectedData.length+$IGM('GRIDVIEWCONTROLLER.DOREMOVE.DATAINFO2','条数据');
        	}
        	//询问框
        	IBiz.confirm($IGM('GRIDVIEWCONTROLLER.DOREMOVE.INFO2','确认要删除 '+dataInfo+'，删除操作将不可恢复？',[dataInfo]), function(result) {
                  if(result)
                  {
                	  me.removeData(null);
                  }
            });
    	}
    	
     },
     removeData:function(arg){
    	 var me=this;
    	 if(!arg)
    	 {
    		 arg={};
    	 }
    	 
    	 if (me.getParentMode()) {
             $.extend(arg, this.getParentMode());
         }

         if (me.getParentData()) {
        	 $.extend(arg, this.getParentData());
         }

        if(!arg.srfkeys){
	     	//获取要删除的数据集合
	     	var  selectedData =  me.getGrid().getSelection() ;
	     	if(selectedData==null||selectedData.length==0)
	     		return;
	     	
	     	var keys = '';
	     	$.each(selectedData, function(index, record) {  
	     		var key = record.srfkey;
	     		if(keys!='')
	     			keys+=';';
	     		keys += key;
			});
	     	arg.srfkeys = keys;
        }
        
     	me.getGrid().remove(arg);
     },
     /**
      * 批量添加数据
      */
     addDataBatch:function(selectedDatas)
     {
    	 var me=this;
    	 var arg={};
    	 
    	 if(selectedDatas==null||selectedDatas.length==0)
	     	return;

    	 if (me.getParentMode()) {
             $.extend(arg, this.getParentMode());
         }

         if (me.getParentData()) {
        	 $.extend(arg, this.getParentData());
         }
         
         var keys = '';
         $.each(selectedDatas, function(index, record) {  
	     		var key = record.srfkey;
	     		if(keys!='')
	     			keys+=';';
	     		keys += key;
		 });
	     arg.srfkeys = keys;
         me.getGrid().addBatch(arg);
     }
     ,
     /*编辑操作*/
     doEdit: function (params){
     	var me=this;
     	//获取要编辑的数据集合
		if(params && params.srfkey){
			if($.isFunction(me.getGrid().findItem)){
				params = me.getGrid().findItem('srfkey',params.srfkey);
			}
			var arg = {data: params};
			me.onEditData(arg);
			return;
		}
		
     	var  selectedData =  me.getGrid().getSelection() ;
     	if(selectedData==null||selectedData.length==0)
     		return;
      	 var arg = { data: selectedData[0] };
         me.onEditData(arg);
     },
     getBackendUIActionParam:function(uiaction){
    	 var me=this;
    	 if(uiaction.actiontarget=='SINGLEKEY' || uiaction.actiontarget=='MULTIKEY'){
    		 var  selectedData =  me.getGrid().getSelection() ;
    		 if(selectedData==null||selectedData.length==0)
    	    	return null;
    	    	
    		 var dataInfo = '';
    		 var keys = '';
    		 var firstOnly = (uiaction.actiontarget=='SINGLEKEY');
    		 $.each(selectedData, function(index, record) {  
    			 	var srfmajortext = record.srfmajortext;
 	    			var key = record.srfkey;
 	    			if(keys!='')
 		     		keys+=';';
 	    			keys += key;
 		     	
 	    			if(index<5)
 	    			{
 	    				if(dataInfo!='')
 	    					dataInfo+='、';
 	    				dataInfo+=srfmajortext;
 	    			}
 	    			if(firstOnly)
 	    				return false;
    		 });
    		 return {srfkeys:keys,srfkey:keys,dataInfo:dataInfo};
    	 }
    	 return {};
    },
    /*导出操作（Excel）*/
	doExportExcel: function(params) {
		var me=this;
		me.getGrid().exportData(params);
	}
});