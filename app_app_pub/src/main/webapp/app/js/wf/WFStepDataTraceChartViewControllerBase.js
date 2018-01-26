
var WFStepDataTraceChartViewControllerBase = WFTraceChartViewControllerBase.extend({
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
,getNewDataView:function(arg){
       if(!arg)arg={};
       var newmode=arg.srfnewmode;
       if(!newmode)newmode='';
       return null;
    }

,getEditDataView:function(arg){
       if(!arg)arg={};
       var list = [arg.srfeditmode2,arg.srfeditmode];
       for(var i=0;i<2;i++){
          var editmode=list[i];
          if(!editmode)
             continue;
      }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFStepDataTraceChartView.do?'+'srfcid='+cfg.containerid+'&'
                ,viewurl:'/wf/wfstepdatatracechartview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{}};
    return  $.extend({},config,cfg);
}  
});