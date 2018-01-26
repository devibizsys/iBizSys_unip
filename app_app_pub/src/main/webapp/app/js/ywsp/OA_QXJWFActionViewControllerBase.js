var OA_QXJWFActionViewControllerBase = WFActionViewControllerBase.extend({
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
    var config={backendurl:cfg.appctx+'/ywsp/OA_QXJWFActionView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_qxjwfactionview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'Mc',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Mb',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'Ma',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M9',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M8',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M6',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M4',name:'oa_qxjid'}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M3',name:'memo',form:form,height:60}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,isEnableNewData:function(){return false;}
,isEnableRemoveData:function(){return false;}
});