var WFStepDataTraceGridViewControllerBase = GridViewControllerBase.extend({
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
  var uiaction_0 = {"type":"DEUIACTION","tag":"New"
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"Edit","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"View","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"DEUIACTION","tag":"ToggleRowEdit"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"NewRow"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"Remove","actiontarget":"MULTIKEY"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"ExportExcel"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"Print","actiontarget":"MULTIKEY"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"ExportModel"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"Import"
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"ToggleFilter"
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_12);
}
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getSearchForm();
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_wfstepdataname_like',form:form,width:100})
);
 
}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getNewDataView:function(arg){
       if(!arg)arg={};
       var newmode=arg.srfnewmode;
       if(!newmode)newmode='';
       return null;
    }

,getEditDataView:function(arg){
       if(!arg)arg={};
       var list = [arg.srfeditmode2,arg.srfeditmode];
       for(var i=0;i<2;i++){
          var editmode=list[i];
          if(!editmode)
             continue;
      }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFStepDataTraceGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wf/wfstepdatatracegridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.ACTORNAME','操作人名称'),"width":150,"data" :'actorname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.ACTORID','操作人'),"width":150,"data" :'actorid',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.ACTIONTIME','操作时间'),"width":150,"data" :'actiontime',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFSTEPDATA.MEMO','内容'),"width":150,"data" :'memo',"orderable":false}

,{ "title" : $IGM('DEF.LNAME.SDPARAM2','代办人'),"width":150,"data" :'sdparam2',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.SDPARAM','SDPARAM'),"width":150,"data" :'sdparam',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.NEXTTO','下一步'),"width":150,"data" :'nextto',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFSTEPDATA.USERDATA','用户数据标识'),"width":150,"data" :'userdata',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.USERDATADESC','用户数据'),"width":150,"data" :'userdatadesc',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFSTEPDATA.WFINSTANCEID','WFInstanceId'),"width":150,"data" :'wfinstanceid',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFINSTANCENAME','流程实例'),"width":150,"data" :'wfinstancename',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFSTEPDATA.WFPLOGICNAME','执行步骤'),"width":150,"data" :'wfplogicname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFSTEPDATANAME','流程操作'),"width":150,"data" :'wfstepdataname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFSTEPDATA.WFSTEPID','步骤数据_相关步骤'),"width":150,"data" :'wfstepid',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFSTEPDATA.WFSTEPNAME','步骤名称'),"width":150,"data" :'wfstepname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.ACTORNAME2','代办人名称'),"width":150,"data" :'actorname2',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'WFSTEPDATA'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :WFSTEP / 工作流步骤
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFSTEPDATA_WFSTEP_WFSTEPID')
         {
              me.hideGridColumn('wfplogicname');
              me.hideGridColumn('wfstepid');
              me.hideGridColumn('wfstepname');
              return;
         }
         //关系类型 : DER1N ,主实体 :WFINSTANCE / 工作流实例
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFSTEPDATA_WFINSTANCE_WFINSTANCEID')
         {
              me.hideGridColumn('userdata');
              me.hideGridColumn('userdatadesc');
              me.hideGridColumn('wfinstanceid');
              me.hideGridColumn('wfinstancename');
              return;
         }
         //关系类型 : DER1N ,主实体 :WFUSER / 工作流用户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFSTEPDATA_WFUSER_ORIGINALWFUSERID')
         {
              return;
         }
}
});