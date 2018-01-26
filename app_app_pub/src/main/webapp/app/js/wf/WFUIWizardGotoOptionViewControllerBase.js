var WFUIWizardGotoOptionViewControllerBase = OptionViewControllerBase.extend({
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
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFUIWizardGotoOptionView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/wf/wfuiwizardgotooptionview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M10',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mf',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Me',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Md',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mc',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mb',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Ma',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M9',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'actionmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'actionparam'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M8',name:'wfuiwizardid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M3',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M4',name:'datainfo',form:form,height:200}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'actionmode',form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M6',name:'wfstepvalue',allowBlank:false,form:form,codelistid:'uniPSample_WFGotoStep'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'actionparam',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});