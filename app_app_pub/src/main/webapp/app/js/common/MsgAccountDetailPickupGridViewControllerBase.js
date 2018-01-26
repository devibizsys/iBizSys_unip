var MsgAccountDetailPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
    var config={backendurl:cfg.appctx+'/common/MsgAccountDetailPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/msgaccountdetailpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '组消息账户明细名称',"width":150,"data" :'msgaccountdetailname',"orderable":true}

,{ "title" : '更新人',"width":150,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'MSGACCOUNTDETAIL'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :MSGACCOUNT / 消息账户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MINORMSGACCOUNTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :MSGACCOUNT / 消息账户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_MSGACCOUNTDETAIL_MSGACCOUNT_MAJORMSGACCOUNTID')
         {
              return;
         }
}
});