var WFActorIndexPickupDataViewControllerBase = PickupDataViewControllerBase.extend({
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
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFActorIndexPickupDataView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/wf/wfactorindexpickupdataview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{dataview:{}}};
    return  $.extend({},config,cfg);
}
});