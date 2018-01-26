var OA_XMJDEditView2ControllerBase = EditView2ControllerBase.extend({
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
    var config={backendurl:cfg.appctx+'/ywsp/OA_XMJDEditView2.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_xmjdeditview2.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M4c',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M4b',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M4a',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M49',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M48',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M47',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M46',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M45',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M44',name:'oa_xmjdid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'group1',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M5',name:'grouppanel4',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M19',name:'grouppanel5',titleBarCloseMode:'0',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M2d',name:'bz',form:form,height:200}));
form.register(new IBizTextField({id:this.getCId2()+'M6',name:'oa_xmjdname',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'xmbh',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M8',name:'sdxmbhrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M9',name:'ysje',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'Ma',name:'ksxczsbrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizDateField({id:this.getCId2()+'Mb',name:'zbwjqrrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'Mc',name:'cgfs',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'Md',name:'psrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'Me',name:'psdb',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'Mf',name:'dljgpsbgbh',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M10',name:'ztbwjgdrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M11',name:'cjzbgs',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M12',name:'htze',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M13',name:'barq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M14',name:'zbbhje',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M15',name:'bhfyjcfdd',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M16',name:'ysrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizDateField({id:this.getCId2()+'M17',name:'tbrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M18',name:'wfyk',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M1a',name:'xmmc',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M1b',name:'lxbg',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M1c',name:'sdzzhbh',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M1d',name:'syzjwh',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M1e',name:'dlgs',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M1f',name:'zbwjqrqz',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M20',name:'zbwjqrdsm',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M21',name:'cgggrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M22',name:'jcry',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M23',name:'cgjgbgpfrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M24',name:'cgjgpssm',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M25',name:'ztbwjcfd',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M26',name:'htsm',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M27',name:'htqdrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M28',name:'babsm',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M29',name:'bhcfdd',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M2a',name:'ydlxrq',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M2b',name:'ysbgsn',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M2c',name:'jxpg',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M2f',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M34',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M39',name:'grouppanel3',titleBarCloseMode:'0',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M30',name:'dycfkjdps',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M31',name:'dycfkje',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M32',name:'dyczfpsrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M33',name:'dyczfpssm',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M35',name:'decfkjdps',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M36',name:'decfkje',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M37',name:'deczfpsrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M38',name:'deczfpssm',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M3a',name:'dscfkjdps',form:form}));
form.register(new IBizTextField({id:this.getCId2()+'M3b',name:'dscfkje',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'M3c',name:'dsczfpsrq',fmt:'YYYY-MM-DD',form:form,width:100}));
form.register(new IBizTextField({id:this.getCId2()+'M3d',name:'dsczfpssm',form:form}));
form.register(new IBizFormGroup({id:this.getCId2()+'M3f',name:'group2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M40',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M41',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M42',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M43',name:'updatedate',form:form}));

}
,onFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getForm();
}
,getDRItemView:function(arg){
       if(!arg)arg={};
       var drmode=arg.viewid;
       if(!drmode)drmode='';
       return null;
 }
});