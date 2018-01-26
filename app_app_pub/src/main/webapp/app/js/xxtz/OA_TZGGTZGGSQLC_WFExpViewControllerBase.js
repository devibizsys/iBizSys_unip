var OA_TZGGTZGGSQLC_WFExpViewControllerBase = WFExpViewControllerBase.extend({
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
     /*流程导航栏计数器*/
     this.regUICounter(new IBizCounter({tag: 'b288345fde2cce239a3c3216125e41ed',counterid:'ead704403097c2603be95413835eb3bf',counterparam:{"srfwfid":"21C2D14F-CB19-468E-A8E2-B1219566CA04","srfdeid":"OA_TZGG"},ctrler:this,timer:60000}));
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
    this.regController(new OA_TZGGTZGGSQLC_W_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C8'}));
    this.regController(new OA_TZGGTZGGSQLC_D40_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C7'}));
    this.regController(new OA_TZGGTZGGSQLC_W10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C9'}));
    this.regController(new OA_TZGGTZGGSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new OA_TZGGTZGGSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new OA_TZGGTZGGSQLC_D30_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C6'}));
    this.regController(new OA_TZGGTZGGSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C5'}));
    this.regController(new OA_TZGGTZGGSQLC_W20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ca'}));
    this.regController(new OA_TZGGTZGGSQLC_D_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new OA_TZGGTZGGSQLC_D10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
}
,regUIActions:function(config)
{
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/xxtz/OA_TZGGTZGGSQLC_WFExpView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/xxtz/oa_tzggtzggsqlc_wfexpview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{expbar:{countertag:'b288345fde2cce239a3c3216125e41ed'}}};
    return  $.extend({},config,cfg);
}  
,getExpItemView:function(arg){
       if(!arg)arg={}
       var expmode=arg.viewid.toUpperCase();
       if(!expmode)expmode='';
      if(expmode=='TZGGSQLC:D:40'){
          return {viewurl:'/ywsp/oa_tzggtzggsqlc_d40_wfgridview.jsp',embedviewid:'C7'};
      	}
      if(expmode=='TZGGSQLC:D:20:20'){
          return {viewurl:'/xxtz/oa_tzggtzggsqlc_d20_wfgridview.jsp',embedviewid:'C5'};
      	}
      if(expmode=='TZGGSQLC:W:10'){
          return {viewurl:'/xxtz/oa_tzggtzggsqlc_w10_wfgridview.jsp',embedviewid:'C9'};
      	}
      if(expmode=='TZGGSQLC:W:20'){
          return {viewurl:'/xxtz/oa_tzggtzggsqlc_w20_wfgridview.jsp',embedviewid:'Ca'};
      	}
      if(expmode=='TZGGSQLC:D:10'){
          return {viewurl:'/xxtz/oa_tzggtzggsqlc_d10_wfgridview.jsp',embedviewid:'C2'};
      	}
      if(expmode=='TZGGSQLC:D:20'){
          return {viewurl:'/xxtz/oa_tzggtzggsqlc_d20_wfgridview.jsp',embedviewid:'C3'};
      	}
      if(expmode=='TZGGSQLC:D:30'){
          return {viewurl:'/xxtz/oa_tzggtzggsqlc_d30_wfgridview.jsp',embedviewid:'C6'};
      	}
      if(expmode=='TZGGSQLC:D:20:10'){
          return {viewurl:'/xxtz/oa_tzggtzggsqlc_d20_wfgridview.jsp',embedviewid:'C4'};
      	}
      if(expmode=='TZGGSQLC:W'){
          return {viewurl:'/xxtz/oa_tzggtzggsqlc_w_wfgridview.jsp',embedviewid:'C8'};
      	}
      if(expmode=='TZGGSQLC:D'){
          return {viewurl:'/xxtz/oa_tzggtzggsqlc_d_wfgridview.jsp',embedviewid:'C1'};
      	}
       return null;
 }
,getNewDataView:function(arg){
       if(!arg)arg={};
       var newmode=arg.srfnewmode;
       if(!newmode)newmode='';

     var parts=newmode.split('@');
     if(parts.length !=2)
         return null;
       return null;
    }

,getEditDataView:function(arg){
       var editmode=arg.srfeditmode;
       if(!editmode)editmode='';
      var parts=editmode.split('@');
     if(parts.length !=2)
         return null;
       return null;
    }
});