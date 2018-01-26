var OA_NSJGHYSQPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
    var config={backendurl:cfg.appctx+'/ywsp/OA_NSJGHYSQPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_nsjghysqpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.OA_NSJGHYSQNAME','会议名称'),"width":150,"data" :'oa_nsjghysqname',"orderable":true}

,{ "title" : '组织部门名称',"width":150,"data" :'orgsectorname',"orderable":true}

,{ "title" : '申请人',"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : '会议地点',"width":150,"data" :'hydd',"orderable":true}

,{ "title" : '会议要求',"width":150,"data" :'hyyq',"orderable":true}

,{ "title" : '参会领导',"width":150,"data" :'chld',"orderable":true}

,{ "title" : '会议时间',"width":150,"data" :'hysj',"orderable":true}

,{ "title" : '承办处室负责人意见',"width":150,"data" :'cbcsfzryj',"orderable":true}

,{ "title" : '秘书处意见',"width":150,"data" :'mscyj',"orderable":true}

,{ "title" : '院办负责人意见',"width":150,"data" :'ybfzryj',"orderable":true}

,{ "title" : '备注',"width":150,"data" :'bz',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_NSJGHYSQ'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID')
         {
              me.hideGridColumn('orgsectorname');
              return;
         }
         //关系类型 : DER1N ,主实体 :OA_HYS / 会议室
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_NSJGHYSQ_OA_HYS_HYSID')
         {
              return;
         }
}
});