var OA_CCSQCCSQLC_D_WFEditView3ControllerBase = WFEditView3ControllerBase.extend({
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
  var uiaction_4 = {"type":"DEUIACTION","tag":"SaveAndStart"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"ViewWFStep","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"New"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"Print","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"9c9ff1be2924f7896ba667c051ca70c2","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_10);
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/ywsp/OA_CCSQCCSQLC_D_WFEditView3.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_ccsqccsqlc_d_wfeditview3.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M1c',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M6',name:'orguserid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'orgusername'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'oa_ccsqid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M5',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M6',name:'orguserid',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'orgusername',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M8',name:'ccdz',allowBlank:false,form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M9',name:'sc',allowBlank:false,form:form}));
form.register(new IBizDateField({id:this.getCId2()+'Ma',name:'kssj',fmt:'YYYY-MM-DD HH:mm:ss',allowBlank:false,form:form,width:160}));
form.register(new IBizDateField({id:this.getCId2()+'Mb',name:'jssj',fmt:'YYYY-MM-DD HH:mm:ss',allowBlank:false,form:form,width:160}));
form.register(new IBizTextAreaField({id:this.getCId2()+'Mc',name:'ccsy',allowBlank:false,form:form,height:60}));
form.register(new IBizFileField({id:this.getCId2()+'Md',name:'fj',form:form,uploadLimited:''}));
form.register(new IBizFormGroup({id:this.getCId2()+'Mf',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M10',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M11',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M12',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M13',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
       return null;
 }
});