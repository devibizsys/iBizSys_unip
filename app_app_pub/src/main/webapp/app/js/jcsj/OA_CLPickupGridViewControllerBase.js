var OA_CLPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*车辆使用情况*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CLSYQK',datas:[{text:'使用中',value:'20',realtext:'使用中'},{text:'未使用',value:'10',realtext:'未使用'}]}));
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_oa_clname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/jcsj/OA_CLPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/jcsj/oa_clpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.OA_CLNAME','车辆名称'),"width":150,"data" :'oa_clname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CPH','车牌号'),"width":150,"data" :'cph',"orderable":true}

,{ "title" : '使用情况',"width":150,"data" :'syqk',"orderable":true,'render':function(data,type,row){return me.rendergrid_syqk(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.CLPP','车辆品牌'),"width":150,"data" :'clpp',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.COLOR','颜色'),"width":150,"data" :'color',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_CL'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
}
    ,rendergrid_syqk:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CLSYQK',data,'未定义');
    }
});