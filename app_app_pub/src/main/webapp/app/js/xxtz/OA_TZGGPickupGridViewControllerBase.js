var OA_TZGGPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*通知公告类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_TZGGLX',datas:[{text:'类型1',value:'10',realtext:'类型1'},{text:'类型2',value:'20',realtext:'类型2'},{text:'类型3',value:'30',realtext:'类型3'}]}));
     /*是否已发送*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_SFYFS',datas:[{text:'已发送',value:'10',realtext:'已发送'},{text:'未发送',value:'20',realtext:'未发送'}]}));
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_oa_tzggname_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/xxtz/OA_TZGGPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/xxtz/oa_tzggpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.OA_TZGGNAME','通知公告标题'),"width":150,"data" :'oa_tzggname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.OA_TZGG.ORGUSERNAME','发送人名称'),"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.TZGGLX','通知公告类型'),"width":150,"data" :'tzgglx',"orderable":true,'render':function(data,type,row){return me.rendergrid_tzgglx(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.FSSJ','发送时间'),"width":150,"data" :'fssj',"orderable":true}

,{ "title" : '是否已发送',"width":150,"data" :'sfyfs',"orderable":true,'render':function(data,type,row){return me.rendergrid_sfyfs(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_TZGG'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_TZGG_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              return;
         }
}
    ,rendergrid_tzgglx:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_TZGGLX',data,'未定义');
    }
    ,rendergrid_sfyfs:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_SFYFS',data,'未定义');
    }
});