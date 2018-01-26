var MsgTemplatePickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*消息模板内容类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_MsgContentType',datas:[{text:'纯文本',value:'TEXT',realtext:'纯文本'},{text:'HTML网页',value:'HTML',realtext:'HTML网页'}]}));
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
    var config={backendurl:cfg.appctx+'/common/MsgTemplatePickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/msgtemplatepickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '消息模板标识',"width":150,"data" :'msgtemplateid',"orderable":true}

,{ "title" : '消息模板名称',"width":150,"data" :'msgtemplatename',"orderable":true}

,{ "title" : '数据实体',"width":120,"data" :'dename',"orderable":true}

,{ "title" : '标题',"width":150,"data" :'subject',"orderable":true}

,{ "title" : '内容类型',"width":100,"data" :'contenttype',"orderable":true,'render':function(data,type,row){return me.rendergrid_contenttype(data,type,row,me);}}

,{ "title" : '更新人',"width":120,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'MSGTEMPLATE'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :DATAENTITY / 实体
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_MSGTEMPLATE_DATAENTITY_DEID')
         {
              me.hideGridColumn('DENAME');
              return;
         }
}
    ,rendergrid_contenttype:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_MsgContentType',data,'未定义');
    }
});