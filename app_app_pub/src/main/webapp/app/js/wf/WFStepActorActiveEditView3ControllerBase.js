var WFStepActorActiveEditView3ControllerBase = EditView3ControllerBase.extend({
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
     /*是否*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_YesNo',datas:[{text:'是',value:'1',realtext:'是'},{text:'否',value:'0',realtext:'否'}]}));
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
    this.regController(new WFReminderActiveGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
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
    var config={backendurl:cfg.appctx+'/wf/WFStepActorActiveEditView3.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/wf/wfstepactoractiveeditview3.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M13',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M11',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M10',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mf',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M9',name:'isfinish'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Me',name:'wfstepactorid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M5',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'Mb',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M6',name:'wfstepactorname',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M7',name:'firstreadtime',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M8',name:'isfinish1',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M9',name:'isfinish',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Ma',name:'finishdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mc',name:'remindercount',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'Md',name:'remindmemo',allowBlank:false,form:form,height:300}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
      if(drmode=='DRITEM1'){
          return {viewurl:'/wf/wfreminderactivegridview.jsp',embedviewid:'C1',viewparam:{"srfparentdeid":"3860c42c755f4097c4dfe7d806b185bc","srfparenttype":"DER1N","srfder1nid":"DER1N_WFREMINDER_WFSTEPACTOR_WFSTEPACTORID"}};
      	}
       return null;
 }
});