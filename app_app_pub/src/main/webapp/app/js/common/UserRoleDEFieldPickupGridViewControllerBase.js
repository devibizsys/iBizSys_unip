var UserRoleDEFieldPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*实体属性访问控制*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList88',datas:[{text:'无',value:'NONE',realtext:'无'},{text:'读取',value:'READ',realtext:'读取'},{text:'更新',value:'UPDATE',realtext:'更新'}]}));
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
form.register(new IBizHiddenField({id:this.getCId2()+'M4',name:'n_deid_eq'}));
form.register(new IBizHiddenField({id:this.getCId2()+'M4',name:'n_deid_eq',form:form})
);
form.register(new IBizTextField({id:this.getCId2()+'M5',name:'n_userroledefieldname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/UserRoleDEFieldPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/userroledefieldpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '数据实体',"width":100,"data" :'dename',"orderable":true}

,{ "title" : '实体属性访问能力',"width":232,"data" :'userroledefieldname',"orderable":true}

,{ "title" : '访问行为',"width":127,"data" :'defaction',"orderable":true,'render':function(data,type,row){return me.rendergrid_defaction(data,type,row,me);}}

,{ "title" : '更新人',"width":113,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":121,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'USERROLEDEFIELD'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :DATAENTITY / 实体
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_USERROLEDEFIELD_DATAENTITY_DEID')
         {
              me.hideGridColumn('DENAME');
              return;
         }
}
    ,rendergrid_defaction:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CodeList88',data,'未定义');
    }
});