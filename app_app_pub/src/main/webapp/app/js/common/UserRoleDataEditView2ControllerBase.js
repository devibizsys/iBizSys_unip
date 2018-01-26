var UserRoleDataEditView2ControllerBase = EditView2ControllerBase.extend({
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
     /*数据对象能力部门数据范围*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_URDSecDR',datas:[{text:'当前部门',value:'1',realtext:'当前部门'},{text:'上级部门',value:'2',realtext:'上级部门'},{text:'下级部门',value:'4',realtext:'下级部门'}]}));
     /*是否*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_YesNo',datas:[{text:'是',value:'1',realtext:'是'},{text:'否',value:'0',realtext:'否'}]}));
     /*数据对象能力机构数据范围*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_URDOrgDR',datas:[{text:'当前机构',value:'1',realtext:'当前机构'},{text:'上级机构',value:'2',realtext:'上级机构'},{text:'下级机构',value:'4',realtext:'下级机构'}]}));
     /*数据对象能力用户数据范围*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_URDUserDR',datas:[{text:'建立人',value:'1',realtext:'建立人'},{text:'更新人',value:'2',realtext:'更新人'}]}));
     /*数据对象能力条线数据范围*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_URDBCDR',datas:[{text:'当前条线',value:'1',realtext:'当前条线'}]}));
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
    this.regController(new UserRoleDatasGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new UserRoleDataDetailGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new UserRoleDataActionGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
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
    var config={backendurl:cfg.appctx+'/common/UserRoleDataEditView2.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/userroledataeditview2.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M1d',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1c',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M12',name:'deid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M13',name:'userroledataid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'dstorgsectorid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'dstorgid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M8',name:'grouppanel3',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M10',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M5',name:'dename',allowBlank:false,form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'deid',minChars:2,pageSize:50
,pickupView:{view:'/demodel/dataentitypickupview.jsp',title:'实体实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/UserRoleDataEditView2.do?SRFCTRLID=form&SRFFORMITEMID=dename'

}));
form.register(new IBizTextField({id:this.getCId2()+'M6',name:'userroledataname',allowBlank:false,form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M7',name:'isalldata',allowBlank:false,form:form,codelistid:'uniPSample_YesNo',width:100}));
form.register(new IBizCheckListField({id:this.getCId2()+'M9',name:'orgdr',form:form,codelistid:'uniPSample_URDOrgDR',orMode:'num',valueSeparator:'',itemWidth:150}));
form.register(new IBizPickerField({id:this.getCId2()+'Ma',name:'dstorgname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'dstorgid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgfzpppickupview.jsp',title:'组织机构分组平铺选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/UserRoleDataEditView2.do?SRFCTRLID=form&SRFFORMITEMID=dstorgname'

}));
form.register(new IBizCheckListField({id:this.getCId2()+'Mb',name:'secdr',form:form,codelistid:'uniPSample_URDSecDR',orMode:'num',valueSeparator:'',itemWidth:150}));
form.register(new IBizPickerField({id:this.getCId2()+'Mc',name:'dstorgsectorname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'dstorgsectorid',minChars:2,pageSize:50
,pickupView:{view:'/common/orgsectorpickupview.jsp',title:'组织部门实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/UserRoleDataEditView2.do?SRFCTRLID=form&SRFFORMITEMID=dstorgsectorname'

}));
form.register(new IBizCheckListField({id:this.getCId2()+'Md',name:'bcdr',form:form,codelistid:'uniPSample_URDBCDR',orMode:'num',valueSeparator:'',itemWidth:150}));
form.register(new IBizTextField({id:this.getCId2()+'Me',name:'dstsecbc',form:form}));
form.register(new IBizCheckListField({id:this.getCId2()+'Mf',name:'userdr',form:form,codelistid:'uniPSample_URDUserDR',orMode:'num',valueSeparator:'',itemWidth:150}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M11',name:'memo',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
   if(fieldname==''|| fieldname=='isalldata'){
var _isalldata=form.getFieldValue('isalldata');
var ret=false;if((IBiz.testCond(_isalldata,'EQ','0')&&IBiz.testCond(_isalldata,'EQ','0'))){ret=true;}form.setPanelVisible('grouppanel3',ret);
}

   if(fieldname==''|| fieldname=='bcdr'){
var _bcdr=form.getFieldValue('bcdr');
var ret=false;if(IBiz.testCond(_bcdr,'NOTEQ','1')){ret=true;}form.setFieldDisabled('dstsecbc',!ret);
}

}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
      if(drmode=='DRITEM3'){
          return {viewurl:'/common/userroledatasgridview.jsp',embedviewid:'C3'};
      	}
      if(drmode=='DRITEM2'){
          return {viewurl:'/common/userroledataactiongridview.jsp',embedviewid:'C2'};
      	}
      if(drmode=='DRITEM1'){
          return {viewurl:'/common/userroledatadetailgridview.jsp',embedviewid:'C1'};
      	}
       return null;
 }
});