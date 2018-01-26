var OA_NSJGHYSQWFActionViewControllerBase = WFActionViewControllerBase.extend({
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
    var config={backendurl:cfg.appctx+'/ywsp/OA_NSJGHYSQWFActionView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_nsjghysqwfactionview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M11',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M10',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mf',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Me',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Md',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mc',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mb',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Ma',name:'oa_nsjghysqid'}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M3',name:'memo',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M5',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M6',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M7',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M8',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M9',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,isEnableNewData:function(){return false;}
,isEnableRemoveData:function(){return false;}
});