var ServicePickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*服务容器*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_ServiceContainer',datas:[{text:'服务容器01',value:'SC01',realtext:'服务容器01'},{text:'服务容器02',value:'SC02',realtext:'服务容器02'},{text:'服务容器03',value:'SC03',realtext:'服务容器03'},{text:'服务容器04',value:'SC04',realtext:'服务容器04'}]}));
     /*服务运行状态*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_ServiceRunState',datas:[{text:'启动',value:'START',realtext:'启动'},{text:'停止',value:'STOP',realtext:'停止'},{text:'启动错误',value:'STARTERROR',realtext:'启动错误'}]}));
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
   var form=this.getSearchForm();
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_servicename_like',form:form,width:100})
);
form.register(new IBizDropDownListField({id:this.getCId2()+'M5',name:'n_container_eq',form:form,codelistid:'uniPSample_ServiceContainer',width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/ServicePickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/servicepickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '服务名称',"width":250,"data" :'servicename',"orderable":true}

,{ "title" : '服务容器',"width":150,"data" :'container',"orderable":true,'render':function(data,type,row){return me.rendergrid_container(data,type,row,me);}}

,{ "title" : '服务运行状态',"width":150,"data" :'servicestate',"orderable":true,'render':function(data,type,row){return me.rendergrid_servicestate(data,type,row,me);}}

,{ "title" : '备注',"width":350,"data" :'memo',"orderable":true}

,{ "title" : '更新人',"width":150,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'SERVICE'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
}
    ,rendergrid_container:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_ServiceContainer',data,'未定义');
    }
    ,rendergrid_servicestate:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_ServiceRunState',data,'未定义');
    }
});