var OA_CHRYEditViewControllerBase = EditViewControllerBase.extend({
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
     /*参会状态*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CL_CHZT',datas:[{text:'未参加',value:'10',realtext:'未参加'},{text:'已请假',value:'20',realtext:'已请假'},{text:'已参加',value:'30',realtext:'已参加'},{text:'已迟到',value:'40',realtext:'已迟到'}]}));
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
  var uiaction_0 = {"type":"DEUIACTION","tag":"CH","actiontarget":"SINGLEKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"QJ","actiontarget":"SINGLEKEY"
,"actionmode":"FRONT"
,"fronttype":"WIZARD"
,"frontview":{"viewurl":"/common/oa_chryredirectview2.jsp","width":0,"height":0,"title":"参会人员数据重定向视图",openMode:'',redirectview:true,backendurl:"/common/OA_CHRYRedirectView2.do"}
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"Save"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"SaveAndNew"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"DEUIACTION","tag":"SaveAndExit"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"RemoveAndExit","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"SaveAndStart"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"ViewWFStep","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"New"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"Print","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"FirstRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"PrevRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_12);
  var uiaction_13 = {"type":"DEUIACTION","tag":"NextRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_13);
  var uiaction_14 = {"type":"DEUIACTION","tag":"LastRecord","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_14);
  var uiaction_15 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_15);
}
,getDefaultCfg:function(cfg){
    var me=this;     
    var config={backendurl:cfg.appctx+'/ywsp/OA_CHRYEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_chryeditview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M1c',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'ybhysqid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'orguserid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'oa_chryid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'ybhysqid',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M6',name:'ybhysqname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'ybhysqid',minChars:2,pageSize:50
,pickupView:{view:'/ywsp/oa_ybhysqpickupview.jsp',title:'院办会议申请数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/ywsp/OA_CHRYEditView.do?SRFCTRLID=form&SRFFORMITEMID=ybhysqname'

}));
form.register(new IBizHiddenField({id:this.getCId2()+'M7',name:'orguserid',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M8',name:'orgusername',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'orguserid',minChars:2,pageSize:50
,pickupView:{view:'/common/orguserpickupview.jsp',title:'组织人员实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/ywsp/OA_CHRYEditView.do?SRFCTRLID=form&SRFFORMITEMID=orgusername'

}));
form.register(new IBizSpanField({id:this.getCId2()+'M9',name:'orgsecusertypename',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'Ma',name:'chsj',fmt:'YYYY-MM-DD HH:mm:ss',form:form,width:160}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Mb',name:'chzt',form:form,codelistid:'uniPSample_CL_CHZT'}));
form.register(new IBizTextField({id:this.getCId2()+'Mc',name:'zwh',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'Md',name:'zwhms',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'Mf',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M10',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M11',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M12',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M13',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});