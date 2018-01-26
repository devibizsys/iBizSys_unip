var MsgSendQueueHisEditView2ControllerBase = EditView2ControllerBase.extend({
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
     /*消息类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_MsgType',datas:[{text:'系统消息',value:'1',realtext:'系统消息'},{text:'电子邮件',value:'2',realtext:'电子邮件'},{text:'手机短信',value:'4',realtext:'手机短信'},{text:'MSN消息',value:'8',realtext:'MSN消息'},{text:'检务通消息',value:'16',realtext:'检务通消息'},{text:'微信',value:'32',realtext:'微信'}]}));
     /*日历、邮件重要程度（数值）*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_MsgImportanceLevel',datas:[{text:'高',value:'100',realtext:'高'},{text:'普通',value:'50',realtext:'普通'},{text:'低',value:'10',realtext:'低'}]}));
     /*是否（蓝、红）*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList50',datas:[{text:'是',value:'1',realtext:'是'},{text:'否',value:'0',realtext:'否'}]}));
     /*消息模板内容类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_MsgContentType',datas:[{text:'纯文本',value:'TEXT',realtext:'纯文本'},{text:'HTML网页',value:'HTML',realtext:'HTML网页'}]}));
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
    var config={backendurl:cfg.appctx+'/common/MsgSendQueueHisEditView2.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/msgsendqueuehiseditview2.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{form:{}}};
    return  $.extend({},config,cfg);
}  
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getForm();
form.register(new IBizHiddenField({id:this.getCId2()+'M25',name:'srfupdatedate'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M24',name:'srforikey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M23',name:'srfkey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M22',name:'srfmajortext'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M21',name:'srftempmode'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M20',name:'srfuf'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1f',name:'srfdeid'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1e',name:'srfsourcekey'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M1d',name:'msgsendqueuehisid'}));
form.register(new IBizFormGroup({id:this.getCId2()+'M4',name:'grouppanel1',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M5',name:'subject',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M6',name:'msgtype',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M7',name:'contenttype',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M8',name:'dstusers',form:form,height:200}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M9',name:'dstaddresses',form:form,height:200}));
form.register(new IBizTextAreaField({id:this.getCId2()+'Ma',name:'content',form:form,height:200}));
form.register(new IBizSpanField({id:this.getCId2()+'Mb',name:'importanceflag',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'Mc',name:'plansendtime',fmt:'YYYY-MM-DD HH:mm:ss',form:form,width:160}));
form.register(new IBizTextField({id:this.getCId2()+'Md',name:'sendtag',form:form}));
form.register(new IBizDateField({id:this.getCId2()+'Me',name:'processtime',fmt:'YYYY-MM-DD HH:mm:ss',form:form,width:160}));
form.register(new IBizDropDownListField({id:this.getCId2()+'Mf',name:'issend',allowBlank:false,form:form,codelistid:'uniPSample_CodeList50',width:100}));
form.register(new IBizDropDownListField({id:this.getCId2()+'M10',name:'iserror',allowBlank:false,form:form,codelistid:'uniPSample_CodeList50',width:100}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M11',name:'totaldstaddresses',form:form,height:200}));
form.register(new IBizSpanField({id:this.getCId2()+'M12',name:'fileat',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M13',name:'fileat2',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M14',name:'fileat3',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M15',name:'fileat4',form:form}));
form.register(new IBizTextAreaField({id:this.getCId2()+'M16',name:'errorinfo',form:form,height:200}));
form.register(new IBizFormGroup({id:this.getCId2()+'M18',name:'grouppanel2',titleBarCloseMode:'0',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M19',name:'createman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M1a',name:'createdate',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M1b',name:'updateman',form:form}));
form.register(new IBizSpanField({id:this.getCId2()+'M1c',name:'updatedate',form:form}));

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