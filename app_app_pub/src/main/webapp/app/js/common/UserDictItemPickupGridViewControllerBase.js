var UserDictItemPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_userdictitemname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/UserDictItemPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/userdictitempickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '用户词典',"width":100,"data" :'userdictname',"orderable":true}

,{ "title" : '词条类别',"width":100,"data" :'userdictcatname',"orderable":true}

,{ "title" : '词条名称',"width":150,"data" :'userdictitemname',"orderable":true}

,{ "title" : '完整内容',"width":100,"data" :'content',"orderable":true}

,{ "title" : '备注',"width":100,"data" :'memo',"orderable":true}

,{ "title" : '标记常用',"width":100,"data" :'markflag',"orderable":true}

,{ "title" : '更新人',"width":100,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":100,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'USERDICTITEM'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :USERDICT / 用户词典
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_USERDICTITEM_USERDICT_USERDICTID')
         {
              me.hideGridColumn('USERDICTNAME');
              return;
         }
         //关系类型 : DER1N ,主实体 :USERDICTCAT / 用户词条类别
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_USERDICTITEM_USERDICTCAT_USERDICTCATID')
         {
              me.hideGridColumn('USERDICTCATNAME');
              return;
         }
}
});