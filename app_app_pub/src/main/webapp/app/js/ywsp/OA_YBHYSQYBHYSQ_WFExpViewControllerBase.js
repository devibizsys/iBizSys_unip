var OA_YBHYSQYBHYSQ_WFExpViewControllerBase = WFExpViewControllerBase.extend({
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
     this.regUICounter(new IBizCounter({tag: '0c193beb76a418c91d87666d4344f5c6',counterid:'ead704403097c2603be95413835eb3bf',counterparam:{"srfwfid":"8202F292-D8BD-4FA8-B9C3-7948EEFCC24D","srfdeid":"OA_YBHYSQ"},ctrler:this,timer:60000}));
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
    this.regController(new OA_YBHYSQYBHYSQ_D10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C8'}));
    this.regController(new OA_YBHYSQYBHYSQ_D_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C7'}));
    this.regController(new OA_YBHYSQYBHYSQ_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C9'}));
    this.regController(new OA_YBHYSQYBHYSQ_W30_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new OA_YBHYSQYBHYSQ_W20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new OA_YBHYSQYBHYSQ_W50_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C6'}));
    this.regController(new OA_YBHYSQYBHYSQ_W40_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C5'}));
    this.regController(new OA_YBHYSQYBHYSQ_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cb'}));
    this.regController(new OA_YBHYSQYBHYSQ_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ca'}));
    this.regController(new OA_YBHYSQYBHYSQ_D40_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C10'}));
    this.regController(new OA_YBHYSQYBHYSQ_D_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C11'}));
    this.regController(new OA_YBHYSQYBHYSQ_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cd'}));
    this.regController(new OA_YBHYSQYBHYSQ_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cc'}));
    this.regController(new OA_YBHYSQYBHYSQ_W_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new OA_YBHYSQYBHYSQ_D30_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cf'}));
    this.regController(new OA_YBHYSQYBHYSQ_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ce'}));
    this.regController(new OA_YBHYSQYBHYSQ_W10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
}
,regUIActions:function(config)
{
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/ywsp/OA_YBHYSQYBHYSQ_WFExpView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_ybhysqybhysq_wfexpview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{expbar:{countertag:'0c193beb76a418c91d87666d4344f5c6'}}};
    return  $.extend({},config,cfg);
}  
,getExpItemView:function(arg){
       if(!arg)arg={}
       var expmode=arg.viewid.toUpperCase();
       if(!expmode)expmode='';
      if(expmode=='YBHYSQ:D:20:50'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d20_wfgridview.jsp',embedviewid:'Ce'};
      	}
      if(expmode=='YBHYSQ:W'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_w_wfgridview.jsp',embedviewid:'C1'};
      	}
      if(expmode=='YBHYSQ:W:10'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_w10_wfgridview.jsp',embedviewid:'C2'};
      	}
      if(expmode=='YBHYSQ:W:30'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_w30_wfgridview.jsp',embedviewid:'C4'};
      	}
      if(expmode=='YBHYSQ:W:20'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_w20_wfgridview.jsp',embedviewid:'C3'};
      	}
      if(expmode=='YBHYSQ:D'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d_wfgridview.jsp',embedviewid:'C7'};
      	}
      if(expmode=='YBHYSQ:D:20'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d20_wfgridview.jsp',embedviewid:'C9'};
      	}
      if(expmode=='YBHYSQ:D:10'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d10_wfgridview.jsp',embedviewid:'C8'};
      	}
      if(expmode=='YBHYSQ:D:40'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d40_wfgridview.jsp',embedviewid:'C10'};
      	}
      if(expmode=='YBHYSQ:D:30'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d30_wfgridview.jsp',embedviewid:'Cf'};
      	}
      if(expmode=='YBHYSQ:D:50'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d_wfgridview.jsp',embedviewid:'C11'};
      	}
      if(expmode=='YBHYSQ:W:50'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_w50_wfgridview.jsp',embedviewid:'C6'};
      	}
      if(expmode=='YBHYSQ:D:20:30'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d20_wfgridview.jsp',embedviewid:'Cc'};
      	}
      if(expmode=='YBHYSQ:D:20:20'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d20_wfgridview.jsp',embedviewid:'Cb'};
      	}
      if(expmode=='YBHYSQ:D:20:10'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d20_wfgridview.jsp',embedviewid:'Ca'};
      	}
      if(expmode=='YBHYSQ:D:20:40'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_d20_wfgridview.jsp',embedviewid:'Cd'};
      	}
      if(expmode=='YBHYSQ:W:40'){
          return {viewurl:'/ywsp/oa_ybhysqybhysq_w40_wfgridview.jsp',embedviewid:'C5'};
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