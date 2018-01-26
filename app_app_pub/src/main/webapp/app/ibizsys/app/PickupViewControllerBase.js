/**
 * 选择视图控制器对象
 */
var PickupViewControllerBase = MainViewControllerBase.extend({
	selectedData: null,
    selectedDatas:null,
	construct: function(config) {
		if(config.autoLayout==undefined)
			config.autoLayout = true;
		arguments.callee.$.construct.call(this,config);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
	},
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		
		me.okbtn = $('#okbtn');
		me.cancelbtn = $('#cancelbtn');
		me.resetbtn = $('#resetbtn');
		if(me.okbtn){
			me.okbtn.prop('disabled',true);
			me.okbtn.click(function(e){
				 me.onClickOkButton();
			 });
		}
		if(me.cancelbtn){
			me.cancelbtn.click(function(e){
				me.onClickCancelButton();
			});
		}
		if(me.resetbtn){
			me.resetbtn.click(function(e){
				me.onClickResetButton();
			});
		}
		
		me.pvpanel = new IBizPickupViewPanel({ctrler:this,id:this.getCId2()+'pvpanel'});
		//注册事件
		me.pvpanel.on(IBizPickupViewPanel.SELECTIONCHANGE,me.onSelectionChange,me);
		me.pvpanel.on(IBizPickupViewPanel.DATAACTIVATED,me.onDataActivated,me);
		
		
		me.registerItem('pvpanel',me.pvpanel);
		
		me.doLayout();
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
     * 双击行数据
     * @param sender 事件源
     * @param args 参数
     * @param e 事件
     */
    onDataActivated: function (item,args,e) {
    	 var me = e.data;
        if(me.isEnableMultiSelect())
        	return;
        
        me.onSelectionChange(item, args,e);
        me.onClickOkButton();      
    },
    calcButtonState: function () {
        var me = this;
        if(me.okbtn){
        	me.okbtn.prop('disabled',me.selectedData == null);
        }
    },
    onClickOkButton: function () {
        var me = this;
        var window = me.getWindow();
        if(window && me.selectedData){
        	window.dialogResult = 'ok';
        	window.selectedData = me.selectedData;
        	window.selectedDatas = me.selectedDatas;
        	me.closeWindow();
        }
    },
    onClickCancelButton: function () {
        var me = this;
        var window = me.getWindow();
        if(window){
        	window.dialogResult = 'cancel';
        	me.closeWindow();
        }

    },
    onClickResetButton: function () {

    },
    getPickupViewPanel: function () {
        return this.pvpanel;
    },
    isEnableMultiSelect:function(){
    	return false;
    }
});













