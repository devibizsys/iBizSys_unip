/**
 * 多项选择视图控制器对象
 */
var MPickupViewControllerBase = PickupViewControllerBase.extend({
	
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		me.resultbar = new IBizMPickupResult({id:this.getCId2()+'resultbar',ctrler:this});
		//注册事件
		me.resultbar.on(IBizMPickupResult.SELECTIONCHANGE,me.onMultiSelectionChange,me);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
	},
    isEnableMultiSelect:function(){
    	return true;
    },
	switchLeft:function(){
		var me = this;
		me.resultbar.removeDatas(me.resultbar.getSelections());
		
	},
	switchRight:function(){
		var me = this;
		me.resultbar.appendDatas(me.gridselectedDatas);
	},
	switchLeftAll:function(){
		var me = this;
		me.resultbar.removeDatas(me.resultbar.getDatas());
		
	},
	switchRightAll:function(){
		var me = this;
		me.resultbar.appendDatas(me.pvpanel.getAllData());
	},
	/**
     * 值选中变化
     * @param sender 事件源
     * @param args 参数
     * @param e 事件
     */
	onMultiSelectionChange: function (item,args,e) {
        var me = e.data;
        if (args.length > 0) {
            var record = args[0];
            var selectedData = {srfkey:record.srfkey,srfmajortext:record.srfmajortext};
            me.selectedData = selectedData;
            
            me.selectedDatas = [];
            $.each(args,function(index,record){
            	var selectedData = {srfkey:record.srfkey,srfmajortext:record.srfmajortext};
            	if(index == 0){
            		me.selectedData = selectedData;
            	}
            	 me.selectedDatas.push(selectedData);
            });
        }else {
            me.selectedData = null;
            me.selectedDatas = null;
        }
        me.calcButtonState();
    },
	/**
     * 值选中变化
     * @param sender 事件源
     * @param args 参数
     * @param e 事件
     */
    onSelectionChange: function (item,args,e) {
        var me = e.data;
        if (args && args.length > 0) {
            var record = args[0];
            var selectedData = {srfkey:record.srfkey,srfmajortext:record.srfmajortext};
            me.gridselectedData = selectedData;
            
            me.gridselectedDatas = [];
            $.each(args,function(index,record){
            	var selectedData = {srfkey:record.srfkey,srfmajortext:record.srfmajortext};
            	if(index == 0){
            		me.gridselectedData = selectedData;
            	}
            	 me.gridselectedDatas.push(selectedData);
            });
        }else {
            me.gridselectedData = null;
            me.gridselectedDatas = null;
        }
        me.calcButtonState();
    },
    
    /**
     * 双击行数据
     * @param sender 事件源
     * @param args 参数
     * @param e 事件
     */
    onDataActivated: function (item,args,e) {
    	var me = e.data;
        me.resultbar.appendDatas(args);
    },
    calcButtonState: function () {
        var me = this;
        if(me.okbtn){
        	me.okbtn.prop('disabled',me.selectedData == null && me.gridselectedDatas == null);
        }
    },
    onClickOkButton: function () {
        var me = this;
        var window = me.getWindow();
        if(window && ( me.selectedData || me.gridselectedData)){
        	window.dialogResult = 'ok';
        	if(me.selectedData != null){
        		window.selectedData = me.selectedData;
            	window.selectedDatas = me.selectedDatas;
        	}
        	else
        		{
	        		window.selectedData = me.gridselectedData;
	            	window.selectedDatas = me.gridselectedDatas;
        		}
        	
        	me.closeWindow();
        }
    }
});













