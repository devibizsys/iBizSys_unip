/**
 * 工作流启动视图控制器对象
 */
var WFStartViewControllerBase = WFEditViewControllerBase.extend({
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
    onFormWFStarted: function() {
    	var me=this;
    	var window=me.getWindow();
    	if(window)
    	{
    		window.dialogResult = 'ok';
    	}
    	arguments.callee.$.onFormWFStarted.call(this);
//		var me = this;
//		if (me.pagecontext) {
//			var openerid = me.pagecontext.getParamValue('openerid');
//			var view = $.getIBizApp().getSRFController(openerid);
//			if (view){
//				if(view.refreshReferView){
//					view.refreshReferView();
//				}
//				if(view.closeWindow){
//					view.closeWindow();
//				}
//			}
//		}
	},
    onClickOkButton: function () {
        var me = this;
        me.doSaveAndStart();
       // me.getForm().wfstart(me.viewparam);
    },
    onClickCancelButton: function () {
        var me = this;
        var window=me.getWindow();
        if(window){
        	window.dialogResult = 'cancel';
        	me.closeWindow();
        }

    }
});













