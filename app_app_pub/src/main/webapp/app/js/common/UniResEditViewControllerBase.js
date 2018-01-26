var UniResEditViewControllerBase = EditViewControllerBase.extend({
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
     /*统一资源类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList16',datas:[{text:'内置页面',value:'PAGE',realtext:'内置页面'},{text:'报表',value:'REPORT',realtext:'报表'},{text:'自定义',value:'CUSTOM',realtext:'自定义'}]}));
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
    var config={backendurl:cfg.appctx+'/common/UniResEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/unireseditview.jsp?'+'srfcid='+cfg.containerid+'&'
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
form.register(new IBizHiddenField({id:this.getCId2()+'Mf',name:'uniresid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M5',name:'uniresname',allowBlank:false,form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M6',name:'unirestype',allowBlank:false,form:form,codelistid:'uniPSample_CodeList16'}));
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'resourceid',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M8',name:'memo',form:form,height:200}));
form.register(new IBizFormGroup({id:this.getCId2()+'Ma',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mb',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Mc',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Md',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'Me',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});