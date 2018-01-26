var OA_CGSQEditViewControllerBase = EditViewControllerBase.extend({
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
     /*支付方式*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_ZFFS',datas:[{text:'网银',value:'10',realtext:'网银'},{text:'微信',value:'20',realtext:'微信'},{text:'支付宝',value:'30',realtext:'支付宝'},{text:'现金',value:'40',realtext:'现金'}]}));
     /*采购类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CGLX',datas:[{text:'打印机',value:'10',realtext:'打印机'},{text:'扫描仪',value:'20',realtext:'扫描仪'},{text:'电脑',value:'30',realtext:'电脑'},{text:'其他',value:'40',realtext:'其他'}]}));
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
  var uiaction_0 = {"type":"DEUIACTION","tag":"Save"
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"SaveAndNew"
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"SaveAndExit"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"RemoveAndExit","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"DEUIACTION","tag":"SaveAndStart"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"ViewWFStep","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"New"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"Print","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"FirstRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"PrevRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"NextRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"LastRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_12);
  var uiaction_13 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_13);
}
,getDefaultCfg:function(cfg){
    var me=this;     
    var config={backendurl:cfg.appctx+'/ywsp/OA_CGSQEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_cgsqeditview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M1e',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1d',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1c',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'orguserid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M6',name:'orgusername'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'orgsectorid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'oa_cgsqid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'orguserid',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M6',name:'orgusername',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'orgsectorid',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M8',name:'orgsectorname',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'orgsectorid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgsectorpickupview.jsp',title:'组织部门实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/ywsp/OA_CGSQEditView.do?SRFCTRLID=form&SRFFORMITEMID=orgsectorname'

}));
form.register(new IBizTextField({id:this.getCId2()+'M9',name:'sl',allowBlank:false,form:form}));
form.register(new IBizTextField({id:this.getCId2()+'Ma',name:'jg',allowBlank:false,form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Mb',name:'cglx',allowBlank:false,form:form,codelistid:'uniPSample_CGLX'}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Mc',name:'zffs',allowBlank:false,form:form,codelistid:'uniPSample_ZFFS'}));
form.register(new IBizTextField({id:this.getCId2()+'Md',name:'gg',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'Me',name:'sqsy',allowBlank:false,form:form,height:60}));
form.register(new IBizTextAreaField({id:this.getCId2()+'Mf',name:'bz',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M11',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M12',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M13',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M14',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M15',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});