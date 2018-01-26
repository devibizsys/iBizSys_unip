var PPModelPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
    var config={backendurl:cfg.appctx+'/common/PPModelPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/ppmodelpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '频道页',"data" :'portalpagename',"orderable":true}

,{ "title" : '所有者',"width":150,"data" :'ownerid',"orderable":true}

,{ "title" : '更新人',"width":150,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'PPMODEL'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_L3PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_R1PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_C1PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_L4PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_R4PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_L1PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_R2PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PORTALPAGE / 门户页面
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PORTALPAGE_PORTALPAGEID')
         {
              me.hideGridColumn('portalpagename');
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_C4PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_L2PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_C2PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_R3PVPARTID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :PVPART / 门户视图部件
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_PPMODEL_PVPART_C3PVPARTID')
         {
              return;
         }
}
});