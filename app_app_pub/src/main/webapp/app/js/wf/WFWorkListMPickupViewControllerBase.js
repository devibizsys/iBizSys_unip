var WFWorkListMPickupViewControllerBase = MPickupViewControllerBase.extend({
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
    this.regController(new WFWorkListPickupGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
}
,regUIActions:function(config)
{
}
,getDefaultCfg:function(cfg){
    var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFWorkListMPickupView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/wf/wfworklistmpickupview.jsp?'+'srfcid='+cfg.containerid+'&'};
    return  $.extend({},config,cfg);
}  
,getPickupViewItem:function(arg){
       var viewmode=arg.viewid;
       if(!viewmode)viewmode='';
       if(viewmode=='pickupviewpanel'){
          return {viewurl:'/wf/wfworklistpickupgridview.jsp',embedviewid:'C1'};
       }

       return null;
 }
});