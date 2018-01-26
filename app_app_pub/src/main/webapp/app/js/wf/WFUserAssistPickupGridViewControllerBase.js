var WFUserAssistPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
}
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getSearchForm();
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_wfuserassistname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFUserAssistPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wf/wfuserassistpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '工作流用户',"width":150,"data" :'wfmajorusername',"orderable":true}

,{ "title" : '工作流代办用户',"width":150,"data" :'wfminorusername',"orderable":true}

,{ "title" : '工作流',"width":150,"data" :'wfworkflowname',"orderable":true}

,{ "title" : '代办步骤',"width":150,"data" :'wfstep',"orderable":true}

,{ "title" : '备注',"width":350,"data" :'memo',"orderable":true}

,{ "title" : '更新人',"width":150,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'WFUSERASSIST'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :WFUSER / 工作流用户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFUSERASSIST_WFUSER_WFMAJORUSERID')
         {
              me.hideGridColumn('wfmajorusername');
              return;
         }
         //关系类型 : DER1N ,主实体 :WFUSER / 工作流用户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFUSERASSIST_WFUSER_WFMINORUSERID')
         {
              me.hideGridColumn('wfminorusername');
              return;
         }
         //关系类型 : DER1N ,主实体 :WFWORKFLOW / 工作流配置
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFUSERASSIST_WFWORKFLOW_WFWORKFLOWID')
         {
              me.hideGridColumn('wfworkflowname');
              return;
         }
}
});