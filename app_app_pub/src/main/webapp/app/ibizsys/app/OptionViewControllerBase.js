/**
 * 实体选项视图控制器对象
 */
var OptionViewControllerBase = EditViewControllerBase.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
	},
	init:function(params){
		arguments.callee.$.init.call(this,params);
		var me = this;
	},
	onInit:function(){
		arguments.callee.$.onInit.call(this);
		var me = this;
		
		me.okbtn = $('#okbtn');
		me.cancelbtn = $('#cancelbtn');
		if(me.okbtn){
			me.okbtn.click(function(e){
				 me.onClickOkButton();
			 });
		}
		if(me.cancelbtn){
			me.cancelbtn.click(function(e){
				me.onClickCancelButton();
			});
		}
    },
    onClickOkButton: function () {
        var me = this;
        me.doSaveAndExit();
    },
    onClickCancelButton: function () {
        var me = this;
        var window = me.window;
        if(window){
        	window.dialogResult = 'cancel';
        }
        me.closeWindow();
    }
    /**
	 * 表单保存完成
	 */
	,onFormSaved: function() {
		var me = this;
		var window = me.window;
		if (window) {
			window.dialogResult = 'ok';
			window.activeData = me.getForm().getValues();
			window.selectedData = window.activeData
		}
		me.closeWindow();
		return;
	}
    
});













