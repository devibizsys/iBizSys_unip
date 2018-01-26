var UserRoleDetailPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_userroledetailname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/UserRoleDetailPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/userroledetailpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '用户角色',"width":246,"data" :'uesrrolename',"orderable":true}

,{ "title" : '用户对象',"width":275,"data" :'userobjectname',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'USERROLEDETAIL'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :USERROLE / 用户角色
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_USERROLEDETAIL_USERROLE_USERROLEID')
         {
              me.hideGridColumn('UESRROLENAME');
              return;
         }
         //关系类型 : DER1N ,主实体 :USEROBJECT / 用户对象
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_USERROLEDETAIL_USEROBJECT_USEROBJECTID')
         {
              me.hideGridColumn('USEROBJECTNAME');
              return;
         }
}
});