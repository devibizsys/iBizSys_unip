var OA_XMJDPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
   var form=this.getSearchForm();
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_oa_xmjdname_like',form:form,width:100})
);
form.register(new IBizTextField({id:this.getCId2()+'M5',name:'n_xmmc_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/ywsp/OA_XMJDPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_xmjdpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.OA_XMJDNAME','项目进度名称'),"width":150,"data" :'oa_xmjdname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.XMMC','项目名称'),"width":150,"data" :'xmmc',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.SDXMBHRQ','收到项目编号日期'),"width":150,"data" :'sdxmbhrq',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.ZBWJQRRQ','招标文件确认日期'),"width":150,"data" :'zbwjqrrq',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.HTQDRQ','合同签订日期'),"width":150,"data" :'htqdrq',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.KSXCZSBRQ','开始向财政申报期日期'),"width":150,"data" :'ksxczsbrq',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.BARQ','备案日期'),"width":150,"data" :'barq',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.YSRQ','验收日期'),"width":150,"data" :'ysrq',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.PSRQ','评审日期'),"width":150,"data" :'psrq',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_XMJD'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
}
});