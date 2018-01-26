var UserRoleDatasEditViewControllerBase = EditViewControllerBase.extend({
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
    var config={backendurl:cfg.appctx+'/common/UserRoleDatasEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/userroledataseditview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M11',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M10',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mf',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Me',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Md',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mc',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mb',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Ma',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'userroledatasid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M8',name:'userroledataid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M9',name:'userroleid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M5',name:'userrolename',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'userroleid',minChars:2,pageSize:50
,pickupView:{view:'/common/userrolepickupview.jsp',title:'用户角色实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/UserRoleDatasEditView.do?SRFCTRLID=form&SRFFORMITEMID=userrolename'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M6',name:'userroledataname',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'userroledataid',minChars:2,pageSize:50
,pickupView:{view:'/common/userroledatapickupview.jsp',title:'数据对象能力实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/UserRoleDatasEditView.do?SRFCTRLID=form&SRFFORMITEMID=userroledataname'

}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});