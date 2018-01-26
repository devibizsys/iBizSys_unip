var UserRoleDataDetailPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_userroledatadetailname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/UserRoleDataDetailPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/userroledatadetailpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '数据对象能力',"width":150,"data" :'userroledataname',"orderable":true}

,{ "title" : '查询模型',"width":150,"data" :'querymodelname',"orderable":true}

,{ "title" : '排除数据范围',"width":150,"data" :'isexclude',"orderable":true,'render':function(data,type,row){return me.rendergrid_isexclude(data,type,row,me);}}

,{ "title" : '备注',"data" :'memo',"orderable":true}

,{ "title" : '更新人',"width":150,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'USERROLEDATADETAIL'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :QUERYMODEL / 实体查询模型
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_USERROLEDATADETAIL_QUERYMODEL_QUERYMODELID')
         {
              me.hideGridColumn('querymodelname');
              return;
         }
         //关系类型 : DER1N ,主实体 :USERROLEDATA / 数据对象能力
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_USERROLEDATADETAIL_USERROLEDATA_USERROLEDATAID')
         {
              me.hideGridColumn('userroledataname');
              return;
         }
}
    ,rendergrid_isexclude:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
});