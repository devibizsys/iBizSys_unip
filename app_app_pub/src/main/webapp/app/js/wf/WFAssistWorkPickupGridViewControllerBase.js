var WFAssistWorkPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFAssistWorkPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wf/wfassistworkpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '工作流代办工作名称',"width":250,"data" :'wfassistworkname',"orderable":true}

,{ "title" : '工作流',"width":250,"data" :'wfworkflowname',"orderable":true}

,{ "title" : '流程步骤名称',"width":150,"data" :'wfplogicname',"orderable":true}

,{ "title" : '步骤操作者',"width":150,"data" :'wfstepactorname',"orderable":true}

,{ "title" : '建立时间',"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'WFASSISTWORK'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :WFSTEPACTOR / 工作流步骤操作者
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFASSISTWORK_WFSTEPACTOR_WFSTEPACTORID')
         {
              me.hideGridColumn('wfstepactorname');
              return;
         }
         //关系类型 : DER1N ,主实体 :WFINSTANCE / 工作流实例
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFASSISTWORK_WFINSTANCE_WFINSTANCEID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :WFWORKFLOW / 工作流配置
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFASSISTWORK_WFWORKFLOW_WFWORKFLOWID')
         {
              me.hideGridColumn('wfworkflowname');
              return;
         }
}
});