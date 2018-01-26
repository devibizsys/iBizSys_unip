/**
 * 选择数据视图控制器对象
 */
var PickupDataViewControllerBase = DataViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		
//		me.okbtn = $('#okbtn');
//		me.cancelbtn = $('#cancelbtn');
//		if(me.okbtn){
//			me.okbtn.prop('disabled',true);
//			me.okbtn.click(function(e){
//				 me.onClickOkButton();
//			 });
//		}
//		if(me.cancelbtn){
//			me.cancelbtn.click(function(e){
//				me.onClickCancelButton();
//			});
//		}
    },
//    /**
//     * 值选中变化
//     * @param sender 事件源
//     * @param args 参数
//     * @param e 事件
//     */
//    onSelectionChange: function (item,args) {
//        var me = this;
//        arguments.callee.$.onSelectionChange.call(this,item,args);
//        if (args.length > 0) {
//            var record = args[0];
//            var selectedData = {srfkey:record.srfkey,srfmajortext:record.srfmajortext};
//            me.selectedData = selectedData;
//            
//            me.selectedDatas = [];
//            $.each(args,function(index,record){
//            	var selectedData = {srfkey:record.srfkey,srfmajortext:record.srfmajortext};
//            	if(index == 0){
//            		me.selectedData = selectedData;
//            	}
//            	 me.selectedDatas.push(selectedData);
//            });
//        }else {
//            me.selectedData = null;
//            me.selectedDatas = null;
//        }
//       // me.calcButtonState();
//        me.fireEvent(IBizPickupViewPanel.SELECTIONCHANGE, null);
//       
//    },
//    
//    /**
//     * 双击行数据
//     * @param sender 事件源
//     * @param args 参数
//     * @param e 事件
//     */
//    onDataActivated: function (item, selected) {
//        var me = this;
//        me.onSelectionChange(item, selected);
//        me.fireEvent(IBizPickupViewPanel.DATAACTIVATED, null);
//       // me.onClickOkButton();      
//    }
//   ,calcButtonState: function () {
//        var me = this;
//        if(me.okbtn){
//        	me.okbtn.prop('disabled',me.selectedData == null);
//        }
//    },
//    onClickOkButton: function () {
//        var me = this;
//        var window = me.getWindow();
//        if(window && me.selectedData){
//        	window.dialogResult = 'ok';
//        	window.selectedData = me.selectedData;
//        	window.selectedDatas = me.selectedDatas;
//        	me.closeWindow();
//        }
//    },
//    onClickCancelButton: function () {
//        var me = this;
//        var window=me.getWindow();
//        if(window){
//        	window.dialogResult = 'cancel';
//        	me.closeWindow();
//        }
//    }
});













