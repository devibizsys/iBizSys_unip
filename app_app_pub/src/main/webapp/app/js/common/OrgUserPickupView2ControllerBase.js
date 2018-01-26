var OrgUserPickupView2ControllerBase = PickupView2ControllerBase.extend({
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
    this.regController(new OrgUserPickupGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
}
,regUIActions:function(config)
{
}
,getDefaultCfg:function(cfg){
    var me=this;   
    var config={backendurl:cfg.appctx+'/common/OrgUserPickupView2.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/common/orguserpickupview2.jsp?'+'srfcid='+cfg.containerid+'&'};
    return  $.extend({},config,cfg);
}  
,getPickupViewItem:function(arg){
       var viewmode=arg.viewid;
       if(!viewmode)viewmode='';
       if(viewmode=='pickupviewpanel'){
          return {viewurl:'/common/orguserpickupgridview.jsp',embedviewid:'C1'};
       }

       return null;
 }
,getNavViewParam:function(arg){
       var nodetype=arg.nodetype;
       if(!nodetype)nodetype='';
       if(nodetype=='ORG'){
          return {"n_orgid_eq":"%NODEID%"};
       }
       if(nodetype=='ORGSECTOR'){
          return {"n_orgsectorid_eq":"%NODEID%"};
       }
       if(nodetype=='root'){
          return {};
       }
       if(nodetype=='ORGSECTOR2'){
          return {"n_orgsectorid_eq":"%NODEID%"};
       }
       return null;
}
});