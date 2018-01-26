var WFWorkflowPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*流程类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_WFConfigType',datas:[{text:'静态流程',value:'STATIC',realtext:'静态流程'},{text:'动态流程',value:'DYNAMIC',realtext:'动态流程'}]}));
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_wfworkflowname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFWorkflowPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wf/wfworkflowpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.WFWORKFLOWID','工作流配置标识'),"width":150,"data" :'wfworkflowid',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFWORKFLOWNAME','工作流配置名称'),"width":150,"data" :'wfworkflowname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFWORKFLOW.WFVERSION','版本'),"width":150,"data" :'wfversion',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.WFTYPE','流程类型'),"width":150,"data" :'wftype',"orderable":true,'render':function(data,type,row){return me.rendergrid_wftype(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.WFWORKFLOW.MEMO','工作流说明'),"width":150,"data" :'memo',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'WFWORKFLOW'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :MSGTEMPLATE / 消息模板
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFWORKFLOW_MSGTEMPLATE_REMINDMSGTEMPLID')
         {
              return;
         }
}
    ,rendergrid_wftype:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_WFConfigType',data,'未定义');
    }
});