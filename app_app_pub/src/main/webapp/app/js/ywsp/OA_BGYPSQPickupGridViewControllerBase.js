var OA_BGYPSQPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_orgusername_like',form:form,width:100})
);
form.register(new IBizTextField({id:this.getCId2()+'M5',name:'n_orgsectorname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/ywsp/OA_BGYPSQPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_bgypsqpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '申请人',"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : '部门名称',"width":150,"data" :'orgsectorname',"orderable":true}

,{ "title" : '房间号',"width":150,"data" :'fjh',"orderable":true}

,{ "title" : '电话',"width":150,"data" :'dh',"orderable":true}

,{ "title" : '日期',"width":150,"data" :'rq',"orderable":true}

,{ "title" : '数量',"width":150,"data" :'sl',"orderable":true}

,{ "title" : '备注',"width":150,"data" :'bz',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_BGYPSQ'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_BGYPSQ_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_BGYPSQ_ORGSECTOR_ORGSECTORID')
         {
              me.hideGridColumn('orgsectorname');
              return;
         }
}
});