var OA_QXJQXJLC_WFExpViewControllerBase = WFExpViewControllerBase.extend({
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
     this.regUICounter(new IBizCounter({tag: '69a3ab7e75d2d0fdfbf0d7617624e080',counterid:'ead704403097c2603be95413835eb3bf',counterparam:{"srfwfid":"88045D1E-5E70-4191-8A50-F0B3A98AE865","srfdeid":"OA_QXJ"},ctrler:this,timer:60000}));
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
    this.regController(new OA_QXJQXJLC_D40_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C8'}));
    this.regController(new OA_QXJQXJLC_D30_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C7'}));
    this.regController(new OA_QXJQXJLC_W_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C9'}));
    this.regController(new OA_QXJQXJLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new OA_QXJQXJLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new OA_QXJQXJLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C6'}));
    this.regController(new OA_QXJQXJLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C5'}));
    this.regController(new OA_QXJQXJLC_W20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cb'}));
    this.regController(new OA_QXJQXJLC_W30_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Cc'}));
    this.regController(new OA_QXJQXJLC_W10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ca'}));
    this.regController(new OA_QXJQXJLC_D_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new OA_QXJQXJLC_D10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
}
,regUIActions:function(config)
{
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/ywsp/OA_QXJQXJLC_WFExpView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_qxjqxjlc_wfexpview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{expbar:{countertag:'69a3ab7e75d2d0fdfbf0d7617624e080'}}};
    return  $.extend({},config,cfg);
}  
,getExpItemView:function(arg){
       if(!arg)arg={}
       var expmode=arg.viewid.toUpperCase();
       if(!expmode)expmode='';
      if(expmode=='QXJLC:D:30'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_d30_wfgridview.jsp',embedviewid:'C7'};
      	}
      if(expmode=='QXJLC:W:20'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_w20_wfgridview.jsp',embedviewid:'Cb'};
      	}
      if(expmode=='QXJLC:D:20'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_d20_wfgridview.jsp',embedviewid:'C3'};
      	}
      if(expmode=='QXJLC:D:10'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_d10_wfgridview.jsp',embedviewid:'C2'};
      	}
      if(expmode=='QXJLC:W:10'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_w10_wfgridview.jsp',embedviewid:'Ca'};
      	}
      if(expmode=='QXJLC:D:20:10'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_d20_wfgridview.jsp',embedviewid:'C4'};
      	}
      if(expmode=='QXJLC:W:30'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_w30_wfgridview.jsp',embedviewid:'Cc'};
      	}
      if(expmode=='QXJLC:D:40'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_d40_wfgridview.jsp',embedviewid:'C8'};
      	}
      if(expmode=='QXJLC:D:20:30'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_d20_wfgridview.jsp',embedviewid:'C6'};
      	}
      if(expmode=='QXJLC:D:20:20'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_d20_wfgridview.jsp',embedviewid:'C5'};
      	}
      if(expmode=='QXJLC:W'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_w_wfgridview.jsp',embedviewid:'C9'};
      	}
      if(expmode=='QXJLC:D'){
          return {viewurl:'/ywsp/oa_qxjqxjlc_d_wfgridview.jsp',embedviewid:'C1'};
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