var LoginAccountEditViewControllerBase = EditViewControllerBase.extend({
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
     /*应用界面主题*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList58',datas:[]}));
     /*是否*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_YesNo',datas:[{text:'是',value:'1',realtext:'是'},{text:'否',value:'0',realtext:'否'}]}));
     /*本地语言*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList56',datas:[{text:'英文',value:'EN',realtext:'英文'},{text:'中文简体',value:'ZH_CN',realtext:'中文简体'},{text:'中文繁体（台湾）',value:'ZH_TW',realtext:'中文繁体（台湾）'}]}));
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
    var config={backendurl:cfg.appctx+'/common/LoginAccountEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/loginaccounteditview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'loginaccountid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M13',name:'userid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M5',name:'username',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'userid',minChars:2,pageSize:50
,pickupView:{view:'/common/userpickupview.jsp',title:'用户实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/LoginAccountEditView.do?SRFCTRLID=form&SRFFORMITEMID=username'

}));
form.register(new IBizTextField({id:this.getCId2()+'M6',name:'loginaccountname',allowBlank:false,form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'pwd',form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M8',name:'isenable',allowBlank:false,form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M9',name:'appuitheme',form:form,codelistid:'uniPSample_CodeList58'}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Ma',name:'language',form:form,codelistid:'uniPSample_CodeList56'}));
form.register(new IBizDateField({id:this.getCId2()+'Mb',name:'lastlogintime',fmt:'YYYY-MM-DD HH:mm:ss',form:form,width:160}));
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