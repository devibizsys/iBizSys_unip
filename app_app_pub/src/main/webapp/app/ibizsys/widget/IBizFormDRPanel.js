/**
 * 
 */
var IBizFormDRPanel =  IBizField.extend({
	parentData: null,
	drController :null,
	construct: function(config) {
		arguments.callee.$.construct.call(this,config);
		
		var form=this.getForm();
		form.on('formloaded', function (sender,data,e){
			var me=e.data;
			me.refreshDRUIPart();
			}, this);
		
		form.on('FORMSAVED', function (sender,data,e){
			var me=e.data;
			me.refreshDRUIPart();
		}, this);
		
		form.on(IBizEditForm.FORMBEFORESAVE, function (sender,data,e){
			var me=e.data;
			if(!me.saveDRData()){
				if(data){
					data.srfcancel=true;
					var mform =me.getForm();
					if(!mform.drpanels){
						mform.drpanels={};
					}
					var drpanel='panel'+me.getId();
					if(!mform.drpanels[drpanel]){
						mform.drpanels[drpanel]=0;
					}
				}
				return false;
			}
		}, this);
		
		var refreshItems = config.refreshitems;
		if(refreshItems && refreshItems!=''){
			var items = refreshItems.split(';');
			this.hookItems={};
			for(var i=0;i<items.length;i++){
				this.hookItems[items[i].toLowerCase()] = true;
			}
			form.on(IBizForm.FORMFIELDCHANGED,function (sender,data,e){
				var me=e.data;
				var fieldname = '';
				if (sender != null)
					fieldname = sender.getName();
				else
					return ;
				if(me.isRefreshItem(fieldname))
					me.refreshDRUIPart();
				}, this);
		}
		//界面加载起来
		var dritem = config.dritem;
		this.drController = form.getController().getController(form.getController().getCId2()+dritem.embedviewid);
		/*监控子数据保存*/
		this.drController.on('DRDATASAVED', function (sender,data,e){
			var me=e.data;
			var mform=me.getForm();
			var drpanel='panel'+me.getId();
			if(mform.drpanels){
				if(!mform.drpanels[drpanel]){
					mform.drpanels[drpanel]=1;
				}
			}
			var bOK=true;
			for(var key in mform.drpanels){
				var value = mform.drpanels[key];
				if(value==0){
					bOK=false;
					break;
				}
			}
			if(bOK){
				delete mform.drpanels;
				me.getForm().save2();
			}
		}, this);
		
//		//获取界面大小
//		if(config.height!=undefined && config.height>0){
//			if($.isFunction(this.drController.setSize)){
//				this.drController.setSize(undefined,config.height);
//			}
//		}
		if(!this.drController.isInited())
		{
			this.drController.asyncInit({parentMode:dritem.parentmode,parentData:this.parentData,renderTo:this.getId()});
			return;
		}
	}
	,getName:function()
	{
		return this.config.name;
	}
	,isRefreshItem:function(name){
		var me=this;
		if(!name || name==''){
			return false;
		}
		return me.hookItems[name.toLowerCase()];
	}
	
	, setParentData: function (pd) {
	    this.parentData = pd;
	}
	, getForm: function () {
	    var me = this;
	    return me.config.form;
	}
	,refreshDRUIPart: function () {
	    var me = this;
   
	    var form = me.getForm();
	    var field = form.findField('srfkey');
	    if(field==null)
	    {
	    	return;
	    }
	    var value = field.getValue();
	    
//	    if(value=="")
//	    {
//	       var block =$('#'+me.getUniqueId());
//	       Metronic.blockUI({
//               target: block ,
//               textOnly: true,
//               boxed: true,
//               message: $IGM('IBIZFORM.REFRESHDRUIPART.INFO','请先保存数据')
//           });
//	    	return;
//	    }
//	    else 
//	    {
//	    	Metronic.unblockUI('#'+me.getUniqueId());
//	    }
	    
	    me.parentData = { srfparentkey: value };
	    
	    var activeData = form.getActiveData();
	    activeData.srfparentkey = value;
	    activeData.srfparentdeid=activeData.srfdeid;
	    
	    delete activeData.srfkey;
	    delete activeData.srfdeid;
	    
        $.extend(me.parentData, {srfparentdata:JSON.stringify(activeData)});
 	    
//	    me.drController.setParentData(me.parentData);
//	    me.drController.refresh();
    	var intervalFunc = function() {
			if (me.drController.isInited()) {
				me.drController.setParentData(me.parentData);
				me.drController.refresh();
				clearInterval(interval);
				interval = null;
			}
		};
		var interval = setInterval(intervalFunc, 100);
	},
	/*保存关系数据，继续父数据保存，返回true,否则返回false*/
	saveDRData:function(){
		var me=this;
		if($.isFunction(me.drController.saveDRData)){
			return me.drController.saveDRData();
		}
		return true;
	}
	
});	