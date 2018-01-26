var PPModelEditViewControllerBase = EditViewControllerBase.extend({
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
     /*门户视图自定义布局*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_PVLayoutMode',datas:[{text:'左右布局（70%;30%）',value:'70P_30P',realtext:'左右布局（70%;30%）'},{text:'左右布局（30%;70%）',value:'30P_70P',realtext:'左右布局（30%;70%）'},{text:'左右布局（50%;50%）',value:'50P_50P',realtext:'左右布局（50%;50%）'}]}));
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
    var config={backendurl:cfg.appctx+'/common/PPModelEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/ppmodeleditview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M2f',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M2e',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M2d',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M2c',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M2b',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M2a',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M29',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M28',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'portalpageid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'r1pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1c',name:'l3pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1d',name:'r2pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1e',name:'c2pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1f',name:'c4pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M20',name:'r3pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M21',name:'c1pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M22',name:'l2pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M23',name:'c3pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M24',name:'ppmodelid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M25',name:'r4pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M26',name:'l4pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M27',name:'l1pvpartid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M8',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'portalpageid',form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M6',name:'ppmodel',form:form,codelistid:'uniPSample_PVLayoutMode'}));
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'ownerid',allowBlank:false,form:form}));
form.register(new IBizPickerField({id:this.getCId2()+'M9',name:'l1pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'l1pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=l1pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Ma',name:'c1pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'c1pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=c1pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Mb',name:'r1pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'r1pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=r1pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Mc',name:'l2pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'l2pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=l2pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Md',name:'c2pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'c2pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=c2pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Me',name:'r2pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'r2pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=r2pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Mf',name:'l3pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'l3pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=l3pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M10',name:'c3pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'c3pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=c3pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M11',name:'r3pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'r3pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=r3pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M12',name:'l4pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'l4pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=l4pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M13',name:'c4pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'c4pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=c4pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M14',name:'r4pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'r4pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelEditView.do?SRFCTRLID=form&SRFFORMITEMID=r4pvpartname'

}));
form.register(new IBizFormGroup({id:this.getCId2()+'M16',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M17',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M18',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M19',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M1a',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});