/**
 * 选择树视图控制器对象
 */
var PickupTreeViewControllerBase = TreeViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		var me = this;
	}
//	/**
//     * 值选中变化
//     * @param sender 事件源
//     * @param args 参数
//     * @param e 事件
//     */
//    ,onSelectionChange: function (item,args) {
//        var me = this;
//        if (args.length > 0) {
//            var record = args[0].original.tag;
//            var selectedData = {srfkey:record.srfkey,srfmajortext:record.srfmajortext};
//            me.selectedData = selectedData;
//            
//            me.selectedDatas = [];
//            $.each(args,function(index,item){
//            	 var record = item.original.tag;
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
//        me.calcButtonState();
//        
//        arguments.callee.$.onSelectionChange.call(this,item,args);
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
//        me.onClickOkButton();      
//    },
//    calcButtonState: function () {
//        var me = this;
//        if(me.okbtn){
//        	me.okbtn.prop('disabled',me.selectedData == null);
//        }
//    },
//    onClickOkButton: function () {
//        var me = this;
//        var window=me.getWindow();
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













