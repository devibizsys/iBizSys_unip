/**
 * 表单对象
 */
var IBizEditForm = IBizForm.extend({
	construct : function(config) {
		arguments.callee.$.construct.call(this, config);
	},
	save2: function (arg) {
    	var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        var data = this.getValues();

        $.extend(arg, data);
        
        if (data.srfuf == "1")
        	$.extend(arg, { srfaction: 'update' });
        else
        	$.extend(arg, { srfaction: 'create' });


        //获取所有Disabled数据
        var disablevalues = {};
        $.each(this.fieldMap,function (name,item) {
            if (item.isDisabled()) {
                if (disablevalues[item.name] == undefined) {
                	disablevalues[item.name] = item.getValue();
                }
            }
        });
        $.extend(arg, disablevalues);
        
        arg.srfcancel=false;
     	me.fireEvent( IBizEditForm.FORMBEFORESAVE, me,arg);
        if(arg.srfcancel==true){
        	return;
        }
        delete arg.srfcancel;
        
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        
        this.submit(arg,function (form, action) {
		            me.resetFormError();
		            me.setFieldAsyncConfig(action.config);
		            me.setFieldState(action.state);
		            me.setDataAccAction(action.dataaccaction);
		            me.fillForm(action.data);
		            me.formDirty = false;
		            //判断是否有提示
		            if (action.info && action.info != '') {
    					IBiz.alert('',action.info,1);
    				}
		            me.fireEvent('formsaved', me,action);
		            me.ignoreUFI = false;
		            me.ignoreformfieldchange=false;
		            me.fireEvent('formfieldchanged', null);
		            me.onSaved();
        		},
        		function (form, action) {
        			if (action.error) {
        				me.setFormError(action.error);
        			}
        			
        			me.ignoreUFI = false;
        			me.ignoreformfieldchange=false;
        			
        			me.fireEvent(IBizEditForm.FORMSAVEERROR, me);
        			
        			action.failureType = 'SERVER_INVALID';
        			if(action.ret==10)
        			{
        				IBiz.confirm2($IGM('IBIZEDITFORM.SAVE2FAILED.TITLE',"保存错误信息"),$IGM('IBIZEDITFORM.SAVE2FAILED2.INFO',"保存数据发生错误,"+me.getActionErrorInfo(action)+',是否要重新加载数据？',[me.getActionErrorInfo(action)]),2,function (ret){
        					if(ret)
        						me.reload();
        				});
        			}
        			else
        			{
        				IBiz.alert($IGM('IBIZEDITFORM.SAVE2FAILED.TITLE',"保存错误信息"),$IGM('IBIZEDITFORM.SAVE2FAILED.INFO',"保存数据发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
        			}
        		}
        	);
    }, 
    onSaved:function(){
		var me = this;
	},
	reload:function(){
		var me=this;
		var field = me.findField('srfkey');
		var loadarg = {};
        if (field) {
        	loadarg.srfkey = field.getValue();
        	if(loadarg.srfkey.indexOf('SRFTEMPKEY:')==0) {
	           	 field = me.findField('srforikey');
	           	 if (field) {
	           		loadarg.srfkey = field.getValue();
	             }
            }
        }
		me.autoLoad(loadarg);
	},
    remove: function (arg) {
        var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        if (!arg.srfkey) {
            var field = me.findField('srfkey');
            if (field) {
                arg.srfkey = field.getValue();
            }
        }
       
        if (arg.srfkey == undefined || arg.srfkey == null || arg.srfkey == '') {
        	IBiz.alert($IGM('IBIZEDITFORM.REMOVEFAILED.TITLE',"删除错误信息"), $IGM('IBIZEDITFORM.UNLOADDATA','当前表单未加载数据！'),2);
            return;
        }
        $.extend(arg, { srfaction: 'remove' });
        me.ignoreUFI = true;
        me.load(arg,function (form, action) {
        	if(action.ret == 0){
        		me.setFieldAsyncConfig(action.config);
        		me.setFieldState(action.state);
            	me.fireEvent(IBizForm.FORMREMOVED);
        	}
        	me.ignoreUFI = false;
  		},
  		function (form, action) {
  			action.failureType = 'SERVER_INVALID';
  			IBiz.alert($IGM('IBIZEDITFORM.REMOVEFAILED.TITLE',"删除错误信息"),$IGM('IBIZEDITFORM.REMOVEFAILED.INFO',"删除数据发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
             me.ignoreUFI = false;
  		});
        
    },
    wfstart: function (arg) {
    	var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        if (!arg.srfkey) {
            var field = me.findField('srfkey');
            if (field) {
                arg.srfkey = field.getValue();
            }
            field = me.findField('srforikey');
            if (field) {
            	var v=field.getValue();
            	if(v && v!='')
            	{
            		arg.srfkey = v;
            	}
            }
        }
        if (arg.srfkey == undefined || arg.srfkey == null || arg.srfkey == '') {
            IBiz.alert($IGM('IBIZEDITFORM.WFSTARTFAILED.TITLE',"启动流程错误信息"), $IGM('IBIZEDITFORM.UNLOADDATA','当前表单未加载数据！'),2);
            return;
        }
        
        $.extend(arg, { srfaction: 'wfstart' });
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        
        me.load(arg,function (form, action) {
        	me.setFieldAsyncConfig(action.config);
			me.setFieldState(action.state);
			me.setDataAccAction(action.dataaccaction);
			me.fillForm(action.data);
			me.formDirty = false;
    	//	me.fireEvent(IBizForm.FORMLOADED);
    		me.fireEvent(IBizForm.FORMWFSTARTED);
    		me.ignoreUFI = false;
    		me.ignoreformfieldchange=false;
    		me.fireEvent(IBizForm.FORMFIELDCHANGED, null);
  		},
  		function (form, action) {
  			action.failureType = 'SERVER_INVALID';
			IBiz.alert($IGM('IBIZEDITFORM.WFSTARTFAILED.TITLE',"启动流程错误信息"),$IGM('IBIZEDITFORM.REMOVEFAILED.INFO',"启动流程发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
  			me.ignoreUFI = false;
  			me.ignoreformfieldchange=false;
  		});
    },
    wfsubmit: function (arg) {
        var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;

        var data = me.getValues();
        $.extend(arg, data);
        $.extend(arg, { srfaction: 'wfsubmit' });
        
//        if (!arg.srfkey) {
//            var field = me.findField('srfkey');
//            if (field) {
//                arg.srfkey = field.getValue();
//            }
//        }
        if (arg.srfkey == undefined || arg.srfkey == null || arg.srfkey == '') {
            IBiz.alert($IGM('IBIZEDITFORM.WFSUBMITFAILED.TITLE',"提交流程错误信息"),$IGM('IBIZEDITFORM.UNLOADDATA','当前表单未加载数据！'),2);
            return;
        }
        
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        
        me.load(arg,function (form, action) {
        	me.setFieldAsyncConfig(action.config);
			me.setFieldState(action.state);
			me.setDataAccAction(action.dataaccaction);
			me.fillForm(action.data);
			me.formDirty = false;
    //		me.fireEvent(IBizForm.FORMLOADED);
    		me.fireEvent(IBizForm.FORMWFSUBMITTED);
    		me.ignoreUFI = false;
    		me.ignoreformfieldchange=false;
    		me.fireEvent(IBizForm.FORMFIELDCHANGED, null);
  		},
  		function (form, action) {
  			action.failureType = 'SERVER_INVALID';
			IBiz.alert($IGM('IBIZEDITFORM.WFSUBMITFAILED.TITLE',"提交流程错误信息"),$IGM('IBIZEDITFORM.REMOVEFAILED.INFO',"工作流提交发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
  			me.ignoreUFI = false;
  			me.ignoreformfieldchange=false;
  		});
    },
    doUIAction: function(arg) {
    	var me = this;
    	if (!arg) arg = {};
    	$.extend(arg, {srfaction: 'uiaction'});
    	if (IBizApp_Data) {
    		arg.srfappdata = IBizApp_Data;
    	}
    	me.loadingTag = IBiz.beginload();	
    	IBiz.ajax({
    		url: me.config.url,
    		params: arg,
    		method: 'POST',
    		dataType: 'json',
    		success: function(data) {
    			IBiz.endload(me.loadingTag);
    			if (data.ret == 0) {
    				IBiz.processResultBefore(data);
    				me.fireEvent(IBizEditForm.UIACTIONFINISHED, me,data);
    				if (data.reloadData) {
    					me.reload();
    				}
    				if (data.info && data.info != '') {
    					IBiz.alert('',data.info,1);
    				}
    				IBiz.processResult(data);
    			} else {
    				IBiz.alert($IGM('IBIZEDITFORM.DOUIACTIONFAILED.TITLE',"界面操作错误信息"),$IGM('IBIZEDITFORM.DOUIACTIONFAILED.INFO',"操作失败,"+data.errorMessage,[data.errorMessage]),2);
    			}
    		},
    		failure: function(e) {
    			IBiz.endload(me.loadingTag);
    			IBiz.alert($IGM('IBIZEDITFORM.DOUIACTIONFAILED.TITLE',"界面操作错误信息"),$IGM('IBIZEDITFORM.DOUIACTIONFAILED2.INFO',"执行请求异常！"),2);
    		}
    	});
    },
    getFormType:function(){
    	return 'EDITFORM';
    }
});

$IRM('IBIZEDITFORM.UNLOADDATA','当前表单未加载数据！');

/*****************事件声明************************/
/**
 * 表单权限发生变化
 */
IBizEditForm.UIACTIONFINISHED = 'UIACTIONFINISHED';

/**
 * 表单保存之前触发
 */
IBizEditForm.FORMBEFORESAVE = 'FORMBEFORESAVE';


/**
 * 表单保存错误触发
 */
IBizEditForm.FORMSAVEERROR = 'FORMSAVEERROR';