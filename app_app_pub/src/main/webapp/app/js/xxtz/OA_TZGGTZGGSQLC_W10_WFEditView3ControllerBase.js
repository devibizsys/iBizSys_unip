var OA_TZGGTZGGSQLC_W10_WFEditView3ControllerBase = WFEditView3ControllerBase.extend({
        construct: function(config) {
    if(!config)config={};
    if(!config.appctx)config.appctx='';
    if(!config.containerid)config.containerid='';
    arguments.callee.$.construct.call(this,this.getDefaultCfg(config));
    this.regCodeLists(config);
    this.regUICounters(config);
    this.regUIActions(config);
    this.regUpdatePanels(config);
    this.regControllers(config);
}
,regCodeLists:function(config)
{
}
,regUICounters:function(config)
{
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
}
,regUIActions:function(config)
{
  var uiaction_0 = {"type":"DEUIACTION","tag":"Save"
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"SaveAndNew"
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"SaveAndExit"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"RemoveAndExit","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"WFUIACTION","tag":"AC1020","actiontarget":"MULTIKEY"
,"actionmode":"WFFRONT"
,"fronttype":"WIZARD"
,"frontview":{"viewurl":"/xxtz/oa_tzggwfactionview.jsp","viewparam":{"srfwfiatag":"AC1020","srfwfstep":"10"},"width":0,"height":0,"title":"通知公告",openMode:'POPUPMODAL'}
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"WFUIACTION","tag":"AC1010","actiontarget":"MULTIKEY"
,"actionmode":"WFFRONT"
,"fronttype":"WIZARD"
,"frontview":{"viewurl":"/xxtz/oa_tzggwfactionview.jsp","viewparam":{"srfwfiatag":"AC1010","srfwfstep":"10"},"width":0,"height":0,"title":"通知公告",openMode:'POPUPMODAL'}
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"ViewWFStep","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"New"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"Print","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"9c9ff1be2924f7896ba667c051ca70c2","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_11);
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/xxtz/OA_TZGGTZGGSQLC_W10_WFEditView3.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/xxtz/oa_tzggtzggsqlc_w10_wfeditview3.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M13',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M6',name:'oa_tzggid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M8',name:'orguserid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M9',name:'orgusername'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M5',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M6',name:'oa_tzggid',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'oa_tzggname',allowBlank:false,form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M8',name:'orguserid',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M9',name:'orgusername',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'Ma',name:'fssj',fmt:'YYYY-MM-DD HH:mm:ss',allowBlank:false,form:form,width:160}));
form.register(new IBizTextField({id:this.getCId2()+'Mb',name:'content',allowBlank:false,form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'Md',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Me',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mf',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M10',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M11',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,isEnableNewData:function(){return false;}
,isEnableEditData:function(){return false;}
,isEnableRemoveData:function(){return false;}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
       return null;
 }
});