/**
 * 表单对象
 */	
var IBizForm =  IBizControl.extend({
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		this.id = this.config.id;
		this.backendurl = this.config.url;
		this.controller = config.ctrler;
		this.fieldIdMap = {};
		this.fieldMap = {};
		this.groupMap = {};
	},
	/**
	 *
	 */
	init:function(){
		var me = this;
		$.each(me.fieldMap,function(key,item){
			//计算表单是否允许为空
        	item.setAllowBlank(item.allowBlank);
        	//计算表单是否显示
        	item.setVisible(item.visible);
        	//计算表单是否隐藏
        	item.setHidden(item.hidden);
		});
	},	
	/**
	 * 加载
	 * @param arg 参数
	 */
	autoLoad : function(arg) {
		var me = this;
		if (!arg)
			arg = {};
		if (arg.srfkey != undefined && arg.srfkey != '') {
			me.load2(arg);
			return;
		}
		if(arg.srfkeys != undefined && arg.srfkeys != ''){
			arg.srfkey = arg.srfkeys;
			//me.viewparam['srfkey'] = arg.srfkey;
			me.load2(arg);
			return;
		}
		me.loadDraft(arg);
	},
	load2 : function(arg) {
		var me = this;
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        $.extend(arg, { srfaction: 'load' });
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        me.load(arg,function (form, action) {
        			me.setFieldAsyncConfig(action.config);
	                me.setFieldState(action.state);
	                me.setDataAccAction(action.dataaccaction);
	                me.fillForm(action.data);
	            	me.formDirty = false;
	                me.fireEvent(IBizForm.FORMLOADED,me);
	                me.ignoreUFI = false;
	                me.ignoreformfieldchange=false;
	                me.fireEvent(IBizForm.FORMFIELDCHANGED,null);
	                me.onLoaded();
	                
             },function (form, action) {
            	 action.failureType = 'SERVER_INVALID';
     			IBiz.alert($IGM('IBIZFORM.LOAD.TITLE','加载失败'),$IGM('IBIZFORM.LOAD2.INFO',"加载数据发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
                me.ignoreUFI = false;
                me.ignoreformfieldchange=false;
     	});
	},
	loadDraft : function(arg) {
		var me=this;
        if (!arg)
            arg = {};
        me.ignoreUFI = true;
        me.ignoreformfieldchange=true;
        
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        if(!arg.srfsourcekey || arg.srfsourcekey=='')
        	$.extend(arg, { srfaction: 'loaddraft' });
        else
        	$.extend(arg, { srfaction: 'loaddraftfrom' });
        me.load(arg,function (form, action) {
        				me.setFieldAsyncConfig(action.config);
        				me.setFieldState(action.state);
        				me.setDataAccAction(action.dataaccaction);
        				me.fillForm(action.data);
        				me.formDirty = false;
                		me.fireEvent(IBizForm.FORMLOADED,me);
                		me.ignoreUFI = false;
                		me.ignoreformfieldchange=false;
                		me.fireEvent(IBizForm.FORMFIELDCHANGED,null);
                		me.onDraftLoaded();
              		},
              		function (form, action) {
              			action.failureType = 'SERVER_INVALID';
              			IBiz.alert($IGM('IBIZFORM.LOAD.TITLE','加载失败'),$IGM('IBIZFORM.LOADDRAFT.INFO',"加载草稿发生错误,"+me.getActionErrorInfo(action),[me.getActionErrorInfo(action)]),2);
              			me.ignoreUFI = false;
              			me.ignoreformfieldchange=false;
              		});
	},
	onDraftLoaded:function(){
		var me = this;
	},
	onLoaded:function(){
		var me = this;
	},
	/**
	 * 设置表单动态配置
	 */
	setFieldAsyncConfig:function(config){
		if (config == undefined || config == null)
            return;
        var me = this;
        $.each(config,function(name,value){
        	var field = me.findField(name);
        	if(field){
        		field.setAsyncConfig(value);
        	}
        });
	},
	/**
	 * 设置当前表单权限信息
	 */
	setDataAccAction:function(dataaccaction){
		var me = this;
		me.dataaccaction = dataaccaction;
		
		me.fireEvent(IBizForm.DATAACCACTIONCHANGE, me, dataaccaction);
	},
	/**
	 * 获取当前表单权限信息
	 */
	getDataAccAction:function(){
		var me = this;
		return me.dataaccaction;
	},
	/**
	 * 设置属性状态
	 */
	setFieldState: function (state) {
        if (state == undefined || state == null)
            return;
        var me = this;
        $.each(state,function(name,value){
        	var field = me.findField(name);
        	if(field){
            	var disabled = ((value & 1) == 0);
            	if(field.isDisabled()!=disabled)
            		field.setDisabled(disabled);
        	}
        });
	},
	isDirty:function(){
		var me = this;
		return me.formDirty;
	},
	/**
	 * 注册表单属性
	 * @param field 属性
	 */
	register:function(field){
		var me = this;
		if($.isArray(field))
		{
			$.each(field,function(index,item){
				me.fieldIdMap[item.getName()] = item;
				me.fieldMap[item.getName()] = item;
				item.setForm(me);
				//注册事件
				item.on(IBizField.VALUECHANGED,function(sender,args,e){
			        if (me.ignoreformfieldchange)
			            return;
			        me.formDirty = true;
			        me.fireEvent(IBizForm.FORMFIELDCHANGED, sender, args);
				},me);
				
			});
		}else
		{
			me.fieldIdMap[field.getName()] = field;
			me.fieldMap[field.getName()] = field;
			field.setForm(me);
			//注册事件
			field.on(IBizField.VALUECHANGED,function(sender,args,e){
		        if (me.ignoreformfieldchange)
		            return;
		        me.formDirty = true;
		        me.fireEvent(IBizForm.FORMFIELDCHANGED, sender, args);
			},me);
		}
	},
	/**
	 * 注销表单属性
	 * @param field 属性
	 */
	unRegister:function(field){
		this.fieldMap[field.getName()] = null;
		this.fieldIdMap[field.getUniqueId()] = null;
	},
	/**
	 * 获取控件标识
	 */
	getSRFCtrlId:function(){
		return this.srfctrlid;
	},
	/**
	 * 获取后台服务地址
	 */
	getBackendUrl:function(){
		return this.backendurl;
	},
	/**
	 * 根据名称获取属性
	 */
	findField:function(name){
		return this.fieldMap[name];
	},
	/**
	 * 根据唯一标识获取属性
	 */
	getFieldById:function(id){
		return this.fieldIdMap[id];
	},
	/**
	 * 加载数据
	 */
	load:function(arg,success2,failure2){
		var me = this;
		if(!arg)
			arg = {};
		
		me.loadingTag = IBiz.beginload();		
		IBiz.ajax({url:me.backendurl,
			params:arg,
			method:'POST',
			success:function(data){
				 IBiz.endload(me.loadingTag);
				if(data && data.ret == 0){
					success2(me,data);
				}else{
					failure2(me,data);
				}
			},
			failure:function(data){
				IBiz.endload(me.loadingTag);
				failure2(me,data);
			}
		});
	},  
	submit:function(arg,success,failure){
		var me = this;
		if(!arg)
			arg = {};
		me.loadingTag = IBiz.beginload();
		IBiz.ajax({url:this.backendurl,
			params:arg,
			method:'POST',
			success:function(data){
				 IBiz.endload(me.loadingTag);
				if(data.ret == 0)
					success(me,data);
				else
					failure(me,data);
			},
			failure:function(e){
				IBiz.endload(me.loadingTag);
				failure(me,{ret:1000,errorMessage:$IGM('IBIZFORM.SUBMIT.ERROR','请求发生错误')});
			}
		});
	},  
	getActionErrorInfo: function (action) {
        if (action.failureType === 'CONNECT_FAILURE') {
            return 'Status:' + action.response.status + ': '+ action.response.statusText;
        }
        if (action.failureType === 'SERVER_INVALID') {
            var msg = action.errorMessage;
            if(action.error && action.error.items)
            {
	            $.each(action.error.items,function(index,item){
	            	if(index>=5)
	                {
	                	msg+=("<BR>...... ");
	                	return false;
	                }
	                if(item.info&&item.info!='')
	                {
	                	msg+=("<BR>"+item.info);
	                }
	            });
            }
            return msg;
        }
        if (action.failureType === 'CLIENT_INVALID') {
            return "";
        }
        if (action.failureType === 'LOAD_FAILURE') {
            return "";
        }
    },
	/**
	 * 填充表单
	 */
	fillForm:function(data){
		if(!data)
			return;
		var me = this;
		$.each(data, function(key, val) {  
			if($.isArray(val)){
				val = JSON.stringify(val);
			}
			me.setFieldValue(key,val);
		});
		$.each(me.groupMap, function(key, val) { 
			var groupField = me.findField(key);
			var coptionField = me.findField(val);
			if(coptionField){
				groupField.setGroupText(coptionField.getValue());
			}
		});
	},
	/**
	 * 设置表单项值
	 */
	setFieldValue:function(name,value){
    	var field = this.findField(name);
    	if(field)
    		field.setValue(value);
    },
    /**
     * 获取表单项值
     */
    getFieldValue: function (name) {
        var me = this;
        var field = me.findField(name);
        if (!field) {
            IBiz.alert($IGM('IBIZFORM.GETFIELDVALUE.TITLE','获取失败'), $IGM('IBIZFORM.GETFIELDVALUE.INFO','无法获取表单项['+name+']',[name]),2);
            return '';
        }
        return field.getValue();
    },
    /**
     * 设置表单项允许为空
     */
    setFieldAllowBlank: function (name,allowblank) {
    	var me = this;
    	var field = me.findField(name);
    	if (field) {
    		field.setAllowBlank(allowblank);
    	}
   	},
   	/**
   	 * 设置表单项属性是否禁用
   	 */
    setFieldDisabled: function (name, disabled) {
        var me = this;
        var field = me.findField(name);
        if (field){
        	field.setDisabled(disabled);
        }
	},
	/**
	 * 设置表单错误
	 */
	setFormError: function (formerror) {
        var me = this;
        me.resetFormError();
        if (formerror && formerror.items) {
        	$.each(formerror.items,function(index,item){
        		 var field = me.findField(item.id);
                 if (field){
                	 field.markInvalid($IGM('IBIZFORM.SETFORMERROR.ERROR','输入有误'));
                     field.setActiveError($IGM('IBIZFORM.SETFORMERROR.ERROR','输入有误'));
                 }
        	});
        }
    },
    resetFormError: function () {
        var me = this;
        $.each(me.fieldMap,function(key,item){
        	if(item.hasActiveError())
        	{
        		item.unsetActiveError();
        	}
		});
    },
    /**
     * 设置面板<分组、分页面板>隐藏
     */
    setPanelVisible:function(name,visible){
    	var me = this;
    	var field = me.findField(name);
    	if(field){
    		field.setVisible(visible);
    	}
    },
    /**
     * 获取当前表单项值
     */
    getActiveData:function(){
    	var me = this;
        var values = {};
        $.each(me.fieldMap,function(key,field){
        	if(field){
        		if (values[field.getName()] == undefined) {
                    var value = field.getValue();
                    if (value)
                    {
                    	if (value.toString().length < 8000)
                    		values[field.getName()] = field.getValue();
                    }
                }
        	}
 		});
        return values;
    },
    /**
     * 获取全部表单项值
     */
    getValues:function(){
    	var me = this;
		var values = {};
		$.each(me.fieldMap, function(index, item) {  
			var name = item.getName();
			var value = item.getValue();
			values[name] = value;
		}); 
		return values;
    },
    testFieldEnableReadonly:function(value){
    	return false;
    },
    /**
     * 更新表单项
     */
    updateFormItems: function (arg) {
    	var me=this;
    	if(me.ignoreUFI)
    		return;
    	var activeData = me.getActiveData();
        if (!arg)
            arg = {};
        if(IBizApp_Data)
        	arg.srfappdata=IBizApp_Data;
        $.extend(arg, { srfaction: 'updateformitem',srfactivedata:JSON.stringify(activeData)});
        me.ignoreUFI = true;
//        me.ignoreformfieldchange=true;
        me.load(arg,function (form, action) {
	        	me.setFieldAsyncConfig(action.config);
	            me.setFieldState(action.state);
	            if(action.dataaccaction)
	            	me.setDataAccAction(action.dataaccaction);
	            me.fillForm(action.data);
            	me.ignoreUFI = false;
//                me.ignoreformfieldchange=false;
//                me.fireEvent(IBizForm.FORMFIELDCHANGED, null);
            },function (form, action) {
            	action.failureType = 'SERVER_INVALID';
      			IBiz.alert($IGM('IBIZFORM.UPDATEFORMITEMS.TITLE','更新失败'), $IGM('IBIZFORM.UPDATEFORMITEMS.INFO',"更新表单项发生错误,"+action.info,[action.info]),2);
                me.ignoreUFI = false;
//                me.ignoreformfieldchange=false;
      	});
    },
    /**
     * 重置表单
     */
    reset:function(){
    	var me = this;
    	me.autoLoad();
    },
    getFormType:function(){
    	return '';
    }
});

/*****************事件声明************************/
/**
 * 表单加载完成事件
 */
IBizForm.FORMLOADED = 'FORMLOADED';
/**
 * 表单属性值变化事件
 */
IBizForm.FORMFIELDCHANGED = 'FORMFIELDCHANGED';
/**
 * 表单保存完成
 */
IBizForm.FORMSAVED = 'FORMSAVED';
/**
 * 表单删除完成
 */
IBizForm.FORMREMOVED = 'FORMREMOVED';
/**
 * 表单工作流启动完成
 */
IBizForm.FORMWFSTARTED = 'FORMWFSTARTED';
/**
 * 表单工作流提交完成
 */
IBizForm.FORMWFSUBMITTED = 'FORMWFSUBMITTED';
/**
 * 表单权限发生变化
 */
IBizForm.DATAACCACTIONCHANGE = 'DATAACCACTIONCHANGE';






