var WFStepActorPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_wfstepactorname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFStepActorPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wf/wfstepactorpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '工作流步骤操作者名称',"width":150,"data" :'wfstepactorname',"orderable":true}

,{ "title" : '工作流用户',"width":150,"data" :'actorid',"orderable":true}

,{ "title" : '查看时间',"width":150,"data" :'firstreadtime',"orderable":true}

,{ "title" : '步骤角色_步骤',"width":150,"data" :'wfstepid',"orderable":true}

,{ "title" : '流程步骤',"width":150,"data" :'wfstepname',"orderable":true}

,{ "title" : '督促次数',"width":150,"data" :'remindercount',"orderable":true}

,{ "title" : '是否完成',"width":150,"data" :'isfinish',"orderable":true,'render':function(data,type,row){return me.rendergrid_isfinish(data,type,row,me);}}

,{ "title" : '是否只读',"width":150,"data" :'isreadonly',"orderable":true,'render':function(data,type,row){return me.rendergrid_isreadonly(data,type,row,me);}}

,{ "title" : '用户类型',"width":150,"data" :'actortype',"orderable":true}

,{ "title" : '备注',"data" :'memo',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'WFSTEPACTOR'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :WFUSER / 工作流用户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFSTEPACTOR_WFUSER_ORIGINALWFUSERID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :WFSTEP / 工作流步骤
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFSTEPACTOR_WFSTEP_WFSTEPID')
         {
              me.hideGridColumn('wfstepid');
              me.hideGridColumn('wfstepname');
              return;
         }
}
    ,rendergrid_isfinish:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
    ,rendergrid_isreadonly:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
});