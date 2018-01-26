var LoginLogPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_loginlogname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/LoginLogPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/loginlogpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:50,forceFit:false
,columns:[
{ "title" : '帐户使用记录标识',"width":169,"data" :'loginlogid',"orderable":true}

,{ "title" : '帐户使用记录名称',"width":143,"data" :'loginlogname',"orderable":true}

,{ "title" : '登录帐户',"width":128,"data" :'loginaccountname',"orderable":true}

,{ "title" : '登录时间',"width":151,"data" :'logintime',"orderable":true}

,{ "title" : 'IP地址',"width":127,"data" :'ipaddress',"orderable":true}

,{ "title" : '服务器地址',"width":171,"data" :'serveraddr',"orderable":true}

,{ "title" : '注销时间',"width":136,"data" :'logouttime',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'LOGINLOG'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :LOGINACCOUNT / 登录帐户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_LOGINLOG_LOGINACCOUNT_LOGINACCOUNTID')
         {
              me.hideGridColumn('LOGINACCOUNTNAME');
              return;
         }
}
});