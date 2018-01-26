var OA_CGSQCGSQLC_WFExpViewControllerBase = WFExpViewControllerBase.extend({
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
     this.regUICounter(new IBizCounter({tag: '8710d542ed1bd24e3158e51cddd33c01',counterid:'ead704403097c2603be95413835eb3bf',counterparam:{"srfwfid":"BE228F3D-0F19-4980-8CA4-067074612E69","srfdeid":"OA_CGSQ"},ctrler:this,timer:60000}));
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
    this.regController(new OA_CGSQCGSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C8'}));
    this.regController(new OA_CGSQCGSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C7'}));
    this.regController(new OA_CGSQCGSQLC_D30_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C9'}));
    this.regController(new OA_CGSQCGSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new OA_CGSQCGSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new OA_CGSQCGSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C6'}));
    this.regController(new OA_CGSQCGSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C5'}));
    this.regController(new OA_CGSQCGSQLC_D_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cb'}));
    this.regController(new OA_CGSQCGSQLC_D40_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ca'}));
    this.regController(new OA_CGSQCGSQLC_W40_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C10'}));
    this.regController(new OA_CGSQCGSQLC_W50_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C11'}));
    this.regController(new OA_CGSQCGSQLC_W10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cd'}));
    this.regController(new OA_CGSQCGSQLC_W_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cc'}));
    this.regController(new OA_CGSQCGSQLC_D_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new OA_CGSQCGSQLC_W30_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cf'}));
    this.regController(new OA_CGSQCGSQLC_W20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ce'}));
    this.regController(new OA_CGSQCGSQLC_D10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
}
,regUIActions:function(config)
{
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/ywsp/OA_CGSQCGSQLC_WFExpView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_cgsqcgsqlc_wfexpview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{expbar:{countertag:'8710d542ed1bd24e3158e51cddd33c01'}}};
    return  $.extend({},config,cfg);
}  
,getExpItemView:function(arg){
       if(!arg)arg={}
       var expmode=arg.viewid.toUpperCase();
       if(!expmode)expmode='';
      if(expmode=='CGSQLC:D:20:30'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d20_wfgridview.jsp',embedviewid:'C6'};
      	}
      if(expmode=='CGSQLC:D:20:10'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d20_wfgridview.jsp',embedviewid:'C4'};
      	}
      if(expmode=='CGSQLC:D'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d_wfgridview.jsp',embedviewid:'C1'};
      	}
      if(expmode=='CGSQLC:D:20:20'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d20_wfgridview.jsp',embedviewid:'C5'};
      	}
      if(expmode=='CGSQLC:D:20:40'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d20_wfgridview.jsp',embedviewid:'C7'};
      	}
      if(expmode=='CGSQLC:W'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_w_wfgridview.jsp',embedviewid:'Cc'};
      	}
      if(expmode=='CGSQLC:W:50'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_w50_wfgridview.jsp',embedviewid:'C11'};
      	}
      if(expmode=='CGSQLC:W:30'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_w30_wfgridview.jsp',embedviewid:'Cf'};
      	}
      if(expmode=='CGSQLC:W:20'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_w20_wfgridview.jsp',embedviewid:'Ce'};
      	}
      if(expmode=='CGSQLC:W:40'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_w40_wfgridview.jsp',embedviewid:'C10'};
      	}
      if(expmode=='CGSQLC:W:10'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_w10_wfgridview.jsp',embedviewid:'Cd'};
      	}
      if(expmode=='CGSQLC:D:10'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d10_wfgridview.jsp',embedviewid:'C2'};
      	}
      if(expmode=='CGSQLC:D:20'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d20_wfgridview.jsp',embedviewid:'C3'};
      	}
      if(expmode=='CGSQLC:D:30'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d30_wfgridview.jsp',embedviewid:'C9'};
      	}
      if(expmode=='CGSQLC:D:40'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d40_wfgridview.jsp',embedviewid:'Ca'};
      	}
      if(expmode=='CGSQLC:D:20:50'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d20_wfgridview.jsp',embedviewid:'C8'};
      	}
      if(expmode=='CGSQLC:D:50'){
          return {viewurl:'/ywsp/oa_cgsqcgsqlc_d_wfgridview.jsp',embedviewid:'Cb'};
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