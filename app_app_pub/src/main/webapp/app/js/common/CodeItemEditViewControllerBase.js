var CodeItemEditViewControllerBase = EditViewControllerBase.extend({
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
  var uiaction_0 = {"type":"DEUIACTION","tag":"SaveAndExit"
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"Exit"
};
    this.regUIAction(uiaction_1);
}
,getDefaultCfg:function(cfg){
    var me=this;     
    var config={backendurl:cfg.appctx+'/common/CodeItemEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/codeitemeditview.jsp?'+'srfcid='+cfg.containerid+'&'
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
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'codeitemid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M13',name:'pcodeitemid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'codelistid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M5',name:'codelistname',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'codelistid',minChars:2,pageSize:50
,pickupView:{view:'/common/codelistpickupview.jsp',title:'代码表实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/CodeItemEditView.do?SRFCTRLID=form&SRFFORMITEMID=codelistname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M6',name:'pcodeitemname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'pcodeitemid',minChars:2,pageSize:50
,pickupView:{view:'/common/codeitemcurclpickupview.jsp',title:'当前代码表代码项数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/CodeItemEditView.do?SRFCTRLID=form&SRFFORMITEMID=pcodeitemname'

}));
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'codeitemname',allowBlank:false,form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M8',name:'codeitemvalue',allowBlank:false,form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M9',name:'ordervalue',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'Ma',name:'shortkey',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'Mb',name:'memo',form:form,height:200}));
form.register(new IBizFormGroup({id:this.getCId2()+'Md',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Me',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mf',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M10',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M11',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});