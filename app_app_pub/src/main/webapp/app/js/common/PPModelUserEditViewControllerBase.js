var PPModelUserEditViewControllerBase = EditViewControllerBase.extend({
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
  var uiaction_0 = {"type":"DEUIACTION","tag":"SaveAndExit"
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"Exit"
};
    this.regUIAction(uiaction_1);
}
,getDefaultCfg:function(cfg){
    var me=this;     
    var config={backendurl:cfg.appctx+'/common/PPModelUserEditView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/ppmodelusereditview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M28',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M27',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M26',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M25',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M24',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M23',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M22',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M21',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'portalpageid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M14',name:'r1pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M15',name:'l3pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M16',name:'r2pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M17',name:'c2pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M18',name:'c4pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M19',name:'r3pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1a',name:'c1pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1b',name:'l2pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1c',name:'c3pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1d',name:'ppmodelid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1e',name:'r4pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1f',name:'l4pvpartid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M20',name:'l1pvpartid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M7',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizHiddenField({id:this.getCId2()+'M5',name:'portalpageid',form:form}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M6',name:'ppmodel',form:form,codelistid:'uniPSample_PVLayoutMode'}));
form.register(new IBizPickerField({id:this.getCId2()+'M8',name:'l1pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'l1pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=l1pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M9',name:'c1pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'c1pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=c1pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Ma',name:'r1pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'r1pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=r1pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Mb',name:'l2pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'l2pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=l2pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Mc',name:'c2pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'c2pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=c2pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Md',name:'r2pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'r2pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=r2pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Me',name:'l3pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'l3pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=l3pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'Mf',name:'c3pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'c3pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=c3pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M10',name:'r3pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'r3pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=r3pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M11',name:'l4pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'l4pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=l4pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M12',name:'c4pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'c4pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=c4pvpartname'

}));
form.register(new IBizPickerField({id:this.getCId2()+'M13',name:'r4pvpartname',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'r4pvpartid',minChars:2,pageSize:50
,pickupView:{view:'/common/pvpartcurpvpickupview.jsp',title:'当前门户视图部件体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/common/PPModelUserEditView.do?SRFCTRLID=form&SRFFORMITEMID=r4pvpartname'

}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
});