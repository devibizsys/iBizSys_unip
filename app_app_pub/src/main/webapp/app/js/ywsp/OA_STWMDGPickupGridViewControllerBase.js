var OA_STWMDGPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*工作流状态（通用）*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CL_WFSTATE',datas:[{text:'未提交',value:'10',realtext:'未提交'},{text:'流程中',value:'20',realtext:'流程中'},{text:'已完成',value:'30',realtext:'已完成'},{text:'已拒绝',value:'40',realtext:'已拒绝'}]}));
     /*工作流步骤（通用）*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CL_WFSTEP',datas:[{text:'部门领导审核',value:'10',realtext:'部门领导审核'},{text:'承办处领导审核',value:'20',realtext:'承办处领导审核'}]}));
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

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/ywsp/OA_STWMDGPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_stwmdgpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '订餐人姓名',"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : '送餐时间',"width":150,"data" :'scsj',"orderable":true}

,{ "title" : '用餐地点',"width":150,"data" :'ycdd',"orderable":true}

,{ "title" : '用餐人数',"width":150,"data" :'ycrs',"orderable":true}

,{ "title" : '事由',"width":300,"data" :'sy',"orderable":true}

,{ "title" : '备注',"width":150,"data" :'bz',"orderable":true}

,{ "title" : '外卖订购状态',"width":150,"data" :'stwmdgzt',"orderable":true,'render':function(data,type,row){return me.rendergrid_stwmdgzt(data,type,row,me);}}

,{ "title" : '外卖订购步骤',"width":150,"data" :'stwmdgbz',"orderable":true,'render':function(data,type,row){return me.rendergrid_stwmdgbz(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_STWMDG'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_STWMDG_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              return;
         }
}
    ,rendergrid_stwmdgzt:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CL_WFSTATE',data,'未定义');
    }
    ,rendergrid_stwmdgbz:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CL_WFSTEP',data,'未定义');
    }
});