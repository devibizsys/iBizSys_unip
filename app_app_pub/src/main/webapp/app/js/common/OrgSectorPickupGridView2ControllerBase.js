var OrgSectorPickupGridView2ControllerBase = PickupGridViewControllerBase.extend({
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
     /*是否*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_YesNo',datas:[{text:'是',value:'1',realtext:'是'},{text:'否',value:'0',realtext:'否'}]}));
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_orgsectorname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/OrgSectorPickupGridView2.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/orgsectorpickupgridview2.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '组织机构',"width":100,"data" :'orgname',"orderable":true}

,{ "title" : '上级部门',"width":100,"data" :'porgsectorname',"orderable":true}

,{ "title" : '部门名称',"width":150,"data" :'orgsectorname',"orderable":true}

,{ "title" : '部门组织编号',"width":100,"data" :'orgcode',"orderable":true}

,{ "title" : '启用标志',"width":100,"data" :'validflag',"orderable":true,'render':function(data,type,row){return me.rendergrid_validflag(data,type,row,me);}}

,{ "title" : '显示次序',"width":100,"data" :'ordervalue',"orderable":true}

,{ "title" : '级别编码',"width":100,"data" :'levelcode',"orderable":true}

,{ "title" : '虚拟部门',"width":100,"data" :'virtualflag',"orderable":true,'render':function(data,type,row){return me.rendergrid_virtualflag(data,type,row,me);}}

,{ "title" : '备注',"data" :'memo',"orderable":true}

,{ "title" : '更新人',"width":100,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":100,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'ORGSECTOR'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_ORGSECTOR_ORGSECTOR_PORGSECTORID')
         {
              me.hideGridColumn('PORGSECTORNAME');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_ORGSECTOR_ORGSECTOR_REPORGSECTORID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :ORG / 组织机构
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_ORGSECTOR_ORG_ORGID')
         {
              me.hideGridColumn('ORGNAME');
              return;
         }
}
    ,rendergrid_validflag:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
    ,rendergrid_virtualflag:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
});