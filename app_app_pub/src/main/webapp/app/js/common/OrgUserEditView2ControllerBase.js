var OrgUserEditView2ControllerBase = EditView2ControllerBase.extend({
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
    this.regController(new OA_TZGGRYGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C16'}));
    this.regController(new OA_YYSSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C8'}));
    this.regController(new OA_XXGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C17'}));
    this.regController(new OA_STWMDGGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C7'}));
    this.regController(new OA_XXRYGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C18'}));
    this.regController(new OA_CGSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C9'}));
    this.regController(new OA_PCSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new OA_CHRYGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new OA_YCSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C6'}));
    this.regController(new OA_CPMJSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C5'}));
    this.regController(new OA_ZSKGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cb'}));
    this.regController(new OA_SBWXGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ca'}));
    this.regController(new OA_CLWXGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C10'}));
    this.regController(new OA_BGYPSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C11'}));
    this.regController(new OA_NSJGHYSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C12'}));
    this.regController(new OA_GZRZGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C13'}));
    this.regController(new OA_RZRYGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C14'}));
    this.regController(new OA_TZGGGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C15'}));
    this.regController(new OA_CCSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cd'}));
    this.regController(new OA_QXJGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cc'}));
    this.regController(new OrgSecUserGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new OA_JPYDGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cf'}));
    this.regController(new OA_YBHYSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
    this.regController(new OA_JPYDGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ce'}));
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
    var config={backendurl:cfg.appctx+'/common/OrgUserEditView2.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/orgusereditview2.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M21',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M20',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1f',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1e',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1d',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1c',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'orguserid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'orgsectorid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'orgsecusertypeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'orgid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'orguserlevelid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M5',name:'orgname',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'orgid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgfzpppickupview.jsp',title:'组织机构分组平铺选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/OrgUserEditView2.do?SRFCTRLID=form&SRFFORMITEMID=orgname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M6',name:'orgsectorname',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'orgsectorid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgsectorpickupview.jsp',title:'组织部门实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/OrgUserEditView2.do?SRFCTRLID=form&SRFFORMITEMID=orgsectorname'

}));
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'orgusername',allowBlank:false,form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M8',name:'usercode',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M9',name:'orgsecusertypename',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'orgsecusertypeid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgsecusertypepickupview.jsp',title:'部门人员关系类型实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/OrgUserEditView2.do?SRFCTRLID=form&SRFFORMITEMID=orgsecusertypename'

}));
form.register(new IBizTextField({id:this.getCId2()+'Ma',name:'titlename',form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Mb',name:'validflag',allowBlank:false,form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizPickerField({id:this.getCId2()+'Mc',name:'orguserlevelname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'orguserlevelid',minChars:2,pageSize:50
,pickupView:{view:'/common/orguserlevelpickupview.jsp',title:'组织人员级别实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/OrgUserEditView2.do?SRFCTRLID=form&SRFFORMITEMID=orguserlevelname'

}));
form.register(new IBizTextField({id:this.getCId2()+'Md',name:'ordervalue',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'Me',name:'memo',form:form,height:200}));
form.register(new IBizFormGroup({id:this.getCId2()+'M10',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M11',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M12',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M13',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M14',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
      if(drmode=='DRITEM16'){
          return {viewurl:'/ywsp/oa_gzrzgridview.jsp',embedviewid:'C13'};
      	}
      if(drmode=='DRITEM21'){
          return {viewurl:'/ywsp/oa_clwxgridview.jsp',embedviewid:'C10'};
      	}
      if(drmode=='DRITEM3'){
          return {viewurl:'/ywsp/oa_chrygridview.jsp',embedviewid:'C3'};
      	}
      if(drmode=='DRITEM20'){
          return {viewurl:'/ywsp/oa_ccsqgridview.jsp',embedviewid:'Cd'};
      	}
      if(drmode=='DRITEM2'){
          return {viewurl:'/ywsp/oa_ybhysqgridview.jsp',embedviewid:'C2'};
      	}
      if(drmode=='DRITEM15'){
          return {viewurl:'/ywsp/oa_cgsqgridview.jsp',embedviewid:'C9'};
      	}
      if(drmode=='DRITEM23'){
          return {viewurl:'/ywsp/oa_nsjghysqgridview.jsp',embedviewid:'C12'};
      	}
      if(drmode=='DRITEM5'){
          return {viewurl:'/ywsp/oa_pcsqgridview.jsp',embedviewid:'C4'};
      	}
      if(drmode=='DRITEM14'){
          return {viewurl:'/ywsp/oa_yyssqgridview.jsp',embedviewid:'C8'};
      	}
      if(drmode=='DRITEM22'){
          return {viewurl:'/ywsp/oa_bgypsqgridview.jsp',embedviewid:'C11'};
      	}
      if(drmode=='DRITEM4'){
          return {viewurl:'/ywsp/oa_jpydgridview.jsp',embedviewid:'Ce'};
      	}
      if(drmode=='DRITEM13'){
          return {viewurl:'/ywsp/oa_stwmdggridview.jsp',embedviewid:'C7'};
      	}
      if(drmode=='DRITEM7'){
          return {viewurl:'/xxtz/oa_xxgridview.jsp',embedviewid:'C17'};
      	}
      if(drmode=='DRITEM12'){
          return {viewurl:'/ywsp/oa_ycsqgridview.jsp',embedviewid:'C6'};
      	}
      if(drmode=='DRITEM24'){
          return {viewurl:'/xxtz/oa_rzrygridview.jsp',embedviewid:'C14'};
      	}
      if(drmode=='DRITEM6'){
          return {viewurl:'/ywsp/oa_jpydgridview.jsp',embedviewid:'Cf'};
      	}
      if(drmode=='DRITEM11'){
          return {viewurl:'/ywsp/oa_cpmjsqgridview.jsp',embedviewid:'C5'};
      	}
      if(drmode=='DRITEM10'){
          return {viewurl:'/xxtz/oa_tzggrygridview.jsp',embedviewid:'C16'};
      	}
      if(drmode=='DRITEM9'){
          return {viewurl:'/xxtz/oa_tzgggridview.jsp',embedviewid:'C15'};
      	}
      if(drmode=='DRITEM8'){
          return {viewurl:'/xxtz/oa_xxrygridview.jsp',embedviewid:'C18'};
      	}
      if(drmode=='DRITEM1'){
          return {viewurl:'/common/orgsecusergridview.jsp',embedviewid:'C1'};
      	}
      if(drmode=='DRITEM17'){
          return {viewurl:'/ywsp/oa_sbwxgridview.jsp',embedviewid:'Ca'};
      	}
      if(drmode=='DRITEM18'){
          return {viewurl:'/jcsj/oa_zskgridview.jsp',embedviewid:'Cb'};
      	}
      if(drmode=='DRITEM19'){
          return {viewurl:'/ywsp/oa_qxjgridview.jsp',embedviewid:'Cc'};
      	}
       return null;
 }
});