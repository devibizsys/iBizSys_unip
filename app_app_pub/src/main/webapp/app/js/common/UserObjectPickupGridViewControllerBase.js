var UserObjectPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*用户对象类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList5',datas:[{text:'用户',value:'USER',realtext:'用户'},{text:'用户组',value:'USERGROUP',realtext:'用户组'}]}));
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_userobjectname_like',form:form,width:100})
);
form.register(new IBizDropDownListField({id:this.getCId2()+'M5',name:'n_userobjecttype_eq',form:form,codelistid:'uniPSample_CodeList5',width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/UserObjectPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/userobjectpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '用户对象标识',"width":150,"data" :'userobjectid',"orderable":true}

,{ "title" : '用户对象名称',"width":150,"data" :'userobjectname',"orderable":true}

,{ "title" : '用户对象类型',"width":100,"data" :'userobjecttype',"orderable":true,'render':function(data,type,row){return me.rendergrid_userobjecttype(data,type,row,me);}}

,{ "title" : '备注',"data" :'memo',"orderable":true}

,{ "title" : '更新人',"width":120,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'USEROBJECT'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
}
    ,rendergrid_userobjecttype:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CodeList5',data,'未定义');
    }
});