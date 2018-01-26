var OA_CPMJSQCPMJSQLC_WFExpViewControllerBase = WFExpViewControllerBase.extend({
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
     this.regUICounter(new IBizCounter({tag: '06b8469afe0cc02da7d09fd5c2bd6199',counterid:'ead704403097c2603be95413835eb3bf',counterparam:{"srfwfid":"BCE28AB4-6801-4E94-B40C-1B4DEA610230","srfdeid":"OA_CPMJSQ"},ctrler:this,timer:60000}));
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
    this.regController(new OA_CPMJSQCPMJSQLC_W_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C8'}));
    this.regController(new OA_CPMJSQCPMJSQLC_D40_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C7'}));
    this.regController(new OA_CPMJSQCPMJSQLC_W10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C9'}));
    this.regController(new OA_CPMJSQCPMJSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new OA_CPMJSQCPMJSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new OA_CPMJSQCPMJSQLC_D30_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C6'}));
    this.regController(new OA_CPMJSQCPMJSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C5'}));
    this.regController(new OA_CPMJSQCPMJSQLC_W20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ca'}));
    this.regController(new OA_CPMJSQCPMJSQLC_D_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new OA_CPMJSQCPMJSQLC_D10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
}
,regUIActions:function(config)
{
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/ywsp/OA_CPMJSQCPMJSQLC_WFExpView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_wfexpview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{expbar:{countertag:'06b8469afe0cc02da7d09fd5c2bd6199'}}};
    return  $.extend({},config,cfg);
}  
,getExpItemView:function(arg){
       if(!arg)arg={}
       var expmode=arg.viewid.toUpperCase();
       if(!expmode)expmode='';
      if(expmode=='CPMJSQLC:D:20:20'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_d20_wfgridview.jsp',embedviewid:'C5'};
      	}
      if(expmode=='CPMJSQLC:D:10'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_d10_wfgridview.jsp',embedviewid:'C2'};
      	}
      if(expmode=='CPMJSQLC:D'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_d_wfgridview.jsp',embedviewid:'C1'};
      	}
      if(expmode=='CPMJSQLC:W'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_w_wfgridview.jsp',embedviewid:'C8'};
      	}
      if(expmode=='CPMJSQLC:D:30'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_d30_wfgridview.jsp',embedviewid:'C6'};
      	}
      if(expmode=='CPMJSQLC:D:20'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_d20_wfgridview.jsp',embedviewid:'C3'};
      	}
      if(expmode=='CPMJSQLC:W:10'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_w10_wfgridview.jsp',embedviewid:'C9'};
      	}
      if(expmode=='CPMJSQLC:D:20:10'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_d20_wfgridview.jsp',embedviewid:'C4'};
      	}
      if(expmode=='CPMJSQLC:D:40'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_d40_wfgridview.jsp',embedviewid:'C7'};
      	}
      if(expmode=='CPMJSQLC:W:20'){
          return {viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_w20_wfgridview.jsp',embedviewid:'Ca'};
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