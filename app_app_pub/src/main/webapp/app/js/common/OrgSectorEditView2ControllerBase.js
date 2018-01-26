var OrgSectorEditView2ControllerBase = EditView2ControllerBase.extend({
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
    this.regController(new OA_CPMJSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C8'}));
    this.regController(new OA_PCSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C7'}));
    this.regController(new OA_YYSSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C9'}));
    this.regController(new OrgSectorGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new OrgSectorGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new OA_YBHYSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C6'}));
    this.regController(new UserRoleDataGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C5'}));
    this.regController(new OA_SBWXGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cb'}));
    this.regController(new OA_CGSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ca'}));
    this.regController(new OA_NSJGHYSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C10'}));
    this.regController(new OA_JPYDGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cd'}));
    this.regController(new OA_ZSKGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cc'}));
    this.regController(new OrgSecUserGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new OA_BGYPSQGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cf'}));
    this.regController(new OA_CLWXGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ce'}));
    this.regController(new OrgUserGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
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
    var config={backendurl:cfg.appctx+'/common/OrgSectorEditView2.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/orgsectoreditview2.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M22',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M21',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M20',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1f',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1e',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1d',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1c',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'orgid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'reporgsectorid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'porgsectorid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M5',name:'orgsectorid',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M6',name:'orgname',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'orgid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgfzpppickupview.jsp',title:'组织机构分组平铺选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/OrgSectorEditView2.do?SRFCTRLID=form&SRFFORMITEMID=orgname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M7',name:'porgsectorname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'porgsectorid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgsectorcurorgpickupview.jsp',title:'当前组织部门数据选择视图'}
,itemParam:{"fetchcond":{"n_orgid_eq":"orgid"}}
,ac:true
,url:this.getAppCtx()+'/common/OrgSectorEditView2.do?SRFCTRLID=form&SRFFORMITEMID=porgsectorname'

}));
form.register(new IBizTextField({id:this.getCId2()+'M8',name:'orgsectorname',allowBlank:false,form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M9',name:'orgcode',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'Ma',name:'shortname',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'Mb',name:'reporgsectorname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'reporgsectorid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgsectorpickupview.jsp',title:'组织部门实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/OrgSectorEditView2.do?SRFCTRLID=form&SRFFORMITEMID=reporgsectorname'

}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Mc',name:'validflag',allowBlank:false,form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizTextField({id:this.getCId2()+'Md',name:'ordervalue',form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Me',name:'virtualflag',allowBlank:false,form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizTextField({id:this.getCId2()+'Mf',name:'levelcode',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M10',name:'bizcode',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M11',name:'memo',form:form,height:200}));
form.register(new IBizFormGroup({id:this.getCId2()+'M13',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M14',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M15',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M16',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M17',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
   if( (fieldname=='orgid') ) form.setFieldValue('porgsectorname','');

   if( (fieldname=='orgid') ) form.setFieldValue('porgsectorid','');

}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
      if(drmode=='DRITEM16'){
          return {viewurl:'/ywsp/oa_bgypsqgridview.jsp',embedviewid:'Cf'};
      	}
      if(drmode=='DRITEM3'){
          return {viewurl:'/common/orgsectorgridview.jsp',embedviewid:'C3'};
      	}
      if(drmode=='DRITEM15'){
          return {viewurl:'/ywsp/oa_clwxgridview.jsp',embedviewid:'Ce'};
      	}
      if(drmode=='DRITEM2'){
          return {viewurl:'/common/orgusergridview.jsp',embedviewid:'C2'};
      	}
      if(drmode=='DRITEM14'){
          return {viewurl:'/ywsp/oa_jpydgridview.jsp',embedviewid:'Cd'};
      	}
      if(drmode=='DRITEM5'){
          return {viewurl:'/common/userroledatagridview.jsp',embedviewid:'C5'};
      	}
      if(drmode=='DRITEM4'){
          return {viewurl:'/common/orgsectorgridview.jsp',embedviewid:'C4'};
      	}
      if(drmode=='DRITEM13'){
          return {viewurl:'/jcsj/oa_zskgridview.jsp',embedviewid:'Cc'};
      	}
      if(drmode=='DRITEM7'){
          return {viewurl:'/ywsp/oa_pcsqgridview.jsp',embedviewid:'C7'};
      	}
      if(drmode=='DRITEM12'){
          return {viewurl:'/ywsp/oa_sbwxgridview.jsp',embedviewid:'Cb'};
      	}
      if(drmode=='DRITEM11'){
          return {viewurl:'/ywsp/oa_nsjghysqgridview.jsp',embedviewid:'C10'};
      	}
      if(drmode=='DRITEM6'){
          return {viewurl:'/ywsp/oa_ybhysqgridview.jsp',embedviewid:'C6'};
      	}
      if(drmode=='DRITEM9'){
          return {viewurl:'/ywsp/oa_yyssqgridview.jsp',embedviewid:'C9'};
      	}
      if(drmode=='DRITEM10'){
          return {viewurl:'/ywsp/oa_cgsqgridview.jsp',embedviewid:'Ca'};
      	}
      if(drmode=='DRITEM8'){
          return {viewurl:'/ywsp/oa_cpmjsqgridview.jsp',embedviewid:'C8'};
      	}
      if(drmode=='DRITEM1'){
          return {viewurl:'/common/orgsecusergridview.jsp',embedviewid:'C1'};
      	}
       return null;
 }
});