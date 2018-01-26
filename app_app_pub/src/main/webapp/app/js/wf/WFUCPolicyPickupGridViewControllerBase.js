var WFUCPolicyPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*工作流代办策略状态*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_WFUCPolicyState',datas:[{text:'未应用',value:'1',realtext:'未应用'},{text:'已应用',value:'2',realtext:'已应用'},{text:'已过期',value:'3',realtext:'已过期'},{text:'已取消',value:'4',realtext:'已取消'}]}));
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
    var config={backendurl:cfg.appctx+'/wf/WFUCPolicyPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wf/wfucpolicypickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '工作流用户',"width":150,"data" :'majorwfusername',"orderable":true}

,{ "title" : '候选用户',"width":150,"data" :'minorwfusername',"orderable":true}

,{ "title" : '开始时间',"width":150,"data" :'begintime',"orderable":true}

,{ "title" : '结束时间',"width":150,"data" :'endtime',"orderable":true}

,{ "title" : '备注',"width":350,"data" :'memo',"orderable":true}

,{ "title" : '策略状态',"width":150,"data" :'policystate',"orderable":true,'render':function(data,type,row){return me.rendergrid_policystate(data,type,row,me);}}
]
},searchForm:{enableAdvanceSearch:false,dename:'WFUCPOLICY'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :WFUSER / 工作流用户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFUCPOLICY_WFUSER_MAJORWFUSERID')
         {
              me.hideGridColumn('MAJORWFUSERNAME');
              return;
         }
         //关系类型 : DER1N ,主实体 :WFUSER / 工作流用户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFUCPOLICY_WFUSER_MINORWFUSERID')
         {
              me.hideGridColumn('MINORWFUSERNAME');
              return;
         }
}
    ,rendergrid_policystate:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_WFUCPolicyState',data,'未定义');
    }
});