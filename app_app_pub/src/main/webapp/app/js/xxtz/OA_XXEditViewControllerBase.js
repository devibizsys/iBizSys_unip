var OA_XXEditViewControllerBase = EditViewControllerBase.extend({
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
     /*消息是否已发送*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_XXSFYFS',datas:[{text:'已发送',value:'10',realtext:'已发送'},{text:'未发送',value:'20',realtext:'未发送'}]}));
     /*消息类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_XXLX',datas:[{text:'类型1',value:'10',realtext:'类型1'},{text:'类型2',value:'20',realtext:'类型2'},{text:'类型3',value:'30',realtext:'类型3'}]}));
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
  var uiaction_0 = {"type":"DEUIACTION","tag":"FSXX","actiontarget":"SINGLEKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"Save"
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"SaveAndNew"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"SaveAndExit"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"DEUIACTION","tag":"RemoveAndExit","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"SaveAndStart"
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
  var uiaction_10 = {"type":"DEUIACTION","tag":"FirstRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"PrevRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"NextRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_12);
  var uiaction_13 = {"type":"DEUIACTION","tag":"LastRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_13);
  var uiaction_14 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_14);
}
,getDefaultCfg:function(cfg){
    var me=this;     
    var config={backendurl:cfg.appctx+'/xxtz/OA_XXEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/xxtz/oa_xxeditview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M13',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M11',name:'orguserid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'oa_xxid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M5',name:'orgusername',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'orguserid',minChars:2,pageSize:50
,pickupView:{view:'/common/orguserpickupview.jsp',title:'组织人员实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/xxtz/OA_XXEditView.do?SRFCTRLID=form&SRFFORMITEMID=orgusername'

}));
form.register(new IBizTextField({id:this.getCId2()+'M6',name:'oa_xxname',form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M7',name:'sfyfs',form:form,codelistid:'uniPSample_XXSFYFS'}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M8',name:'xxlx',allowBlank:false,form:form,codelistid:'uniPSample_XXLX'}));
form.register(new IBizDateField({id:this.getCId2()+'M9',name:'fssj',fmt:'YYYY-MM-DD HH:mm:ss',allowBlank:false,form:form,width:160}));
form.register(new IBizTextAreaField({id:this.getCId2()+'Ma',name:'content',form:form,height:60}));
form.register(new IBizFormGroup({id:this.getCId2()+'Mc',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Md',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Me',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mf',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M10',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});