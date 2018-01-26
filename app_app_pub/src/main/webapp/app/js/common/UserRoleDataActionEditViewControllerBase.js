var UserRoleDataActionEditViewControllerBase = EditViewControllerBase.extend({
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
    var config={backendurl:cfg.appctx+'/common/UserRoleDataActionEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/userroledataactioneditview.jsp?'+'srfcid='+cfg.containerid+'&'
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
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'userroledataid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M8',name:'userroledataactionid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'userroledataid',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M6',name:'userroledataactionname',allowBlank:false,form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M7',name:'isallow',allowBlank:false,form:form,codelistid:'uniPSample_YesNo',width:100}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});