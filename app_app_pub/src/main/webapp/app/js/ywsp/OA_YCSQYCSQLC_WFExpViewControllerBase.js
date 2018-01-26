var OA_YCSQYCSQLC_WFExpViewControllerBase = WFExpViewControllerBase.extend({
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
     this.regUICounter(new IBizCounter({tag: '4836f6b96b0fa37119ed3e4a87164e63',counterid:'ead704403097c2603be95413835eb3bf',counterparam:{"srfwfid":"ADE23A90-392B-4847-9284-052BCC1AD79C","srfdeid":"OA_YCSQ"},ctrler:this,timer:60000}));
}
,regUpdatePanels:function(config)
{
     var me=this;
}
,regControllers:function(config)
{
  var cid=config.containerid;
    if(cid!='')cid=cid+'_';
    this.regController(new OA_YCSQYCSQLC_W_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C8'}));
    this.regController(new OA_YCSQYCSQLC_D_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C7'}));
    this.regController(new OA_YCSQYCSQLC_W10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C9'}));
    this.regController(new OA_YCSQYCSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C4'}));
    this.regController(new OA_YCSQYCSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C3'}));
    this.regController(new OA_YCSQYCSQLC_D30_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C6'}));
    this.regController(new OA_YCSQYCSQLC_D20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C5'}));
    this.regController(new OA_YCSQYCSQLC_W20_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'Ca'}));
    this.regController(new OA_YCSQYCSQLC_D_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C1'}));
    this.regController(new OA_YCSQYCSQLC_D10_WFGridViewController({pcontroller:this,appctx:config.appctx,containerid:cid+'C2'}));
}
,regUIActions:function(config)
{
}
,getDefaultCfg:function(cfg){
    var me=this;
    var config={backendurl:cfg.appctx+'/ywsp/OA_YCSQYCSQLC_WFExpView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/ywsp/oa_ycsqycsqlc_wfexpview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{expbar:{countertag:'4836f6b96b0fa37119ed3e4a87164e63'}}};
    return  $.extend({},config,cfg);
}  
,getExpItemView:function(arg){
       if(!arg)arg={}
       var expmode=arg.viewid.toUpperCase();
       if(!expmode)expmode='';
      if(expmode=='YCSQLC:W:10'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_w10_wfgridview.jsp',embedviewid:'C9'};
      	}
      if(expmode=='YCSQLC:D:10'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_d10_wfgridview.jsp',embedviewid:'C2'};
      	}
      if(expmode=='YCSQLC:D:30'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_d30_wfgridview.jsp',embedviewid:'C6'};
      	}
      if(expmode=='YCSQLC:W'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_w_wfgridview.jsp',embedviewid:'C8'};
      	}
      if(expmode=='YCSQLC:D:40'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_d_wfgridview.jsp',embedviewid:'C7'};
      	}
      if(expmode=='YCSQLC:W:20'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_w20_wfgridview.jsp',embedviewid:'Ca'};
      	}
      if(expmode=='YCSQLC:D:20'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_d20_wfgridview.jsp',embedviewid:'C3'};
      	}
      if(expmode=='YCSQLC:D:20:10'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_d20_wfgridview.jsp',embedviewid:'C4'};
      	}
      if(expmode=='YCSQLC:D:20:20'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_d20_wfgridview.jsp',embedviewid:'C5'};
      	}
      if(expmode=='YCSQLC:D'){
          return {viewurl:'/ywsp/oa_ycsqycsqlc_d_wfgridview.jsp',embedviewid:'C1'};
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