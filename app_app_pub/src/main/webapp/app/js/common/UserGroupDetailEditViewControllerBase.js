var UserGroupDetailEditViewControllerBase = EditViewControllerBase.extend({
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
    var config={backendurl:cfg.appctx+'/common/UserGroupDetailEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/usergroupdetaileditview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M13',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M11',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M10',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Md',name:'usergroupdetailid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Me',name:'usergroupid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mf',name:'userobjectid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M5',name:'usergroupname',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'usergroupid',minChars:2,pageSize:50
,pickupView:{view:'/common/usergrouppickupview.jsp',title:'用户组实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/UserGroupDetailEditView.do?SRFCTRLID=form&SRFFORMITEMID=usergroupname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M6',name:'userobjectname',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'userobjectid',minChars:2,pageSize:50
,pickupView:{view:'/common/userobjectpickupview.jsp',title:'用户对象实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/UserGroupDetailEditView.do?SRFCTRLID=form&SRFFORMITEMID=userobjectname'

}));
form.register(new IBizFormGroup({id:this.getCId2()+'M8',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M9',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Ma',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mb',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mc',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});