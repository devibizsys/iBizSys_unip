var OA_CLWXPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
form.register(new IBizTextField({id:this.getCId2()+'M6',name:'n_oa_clname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/ywsp/OA_CLWXPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_clwxpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '申请人名字',"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : '部门名称',"width":150,"data" :'orgsectorname',"orderable":true}

,{ "title" : '车牌号',"width":150,"data" :'cph',"orderable":true}

,{ "title" : '车辆名称',"width":150,"data" :'oa_clname',"orderable":true}

,{ "title" : '车辆品牌',"width":150,"data" :'clpp',"orderable":true}

,{ "title" : '维修项目',"width":150,"data" :'wxxm',"orderable":true}

,{ "title" : '地址',"width":150,"data" :'dz',"orderable":true}

,{ "title" : '金额',"width":150,"data" :'je',"orderable":true}

,{ "title" : '发动机号',"width":150,"data" :'fdjh',"orderable":true}

,{ "title" : '底盘号',"width":150,"data" :'dph',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_CLWX'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_CLWX_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_CLWX_ORGSECTOR_ORGSECTORID')
         {
              me.hideGridColumn('orgsectorname');
              return;
         }
         //关系类型 : DER1N ,主实体 :OA_CL / 车辆
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_CLWX_OA_CL_OA_CLID')
         {
              me.hideGridColumn('oa_clname');
              return;
         }
}
});