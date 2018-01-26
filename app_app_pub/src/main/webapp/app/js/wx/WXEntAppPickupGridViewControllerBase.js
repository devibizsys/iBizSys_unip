var WXEntAppPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*是否*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_YesNo',datas:[{text:'是',value:'1',realtext:'是'},{text:'否',value:'0',realtext:'否'}]}));
     /*微信企业应用类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_WXEntAppType',datas:[{text:'H5主页型',value:'H5',realtext:'H5主页型'},{text:'消息响应型',value:'MSG',realtext:'消息响应型'}]}));
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_wxentappname_like',form:form,width:100})
);
form.register(new IBizDropDownListField({id:this.getCId2()+'M5',name:'n_apptype_eq',form:form,codelistid:'uniPSample_WXEntAppType',width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wx/WXEntAppPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wx/wxentapppickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '微信公众号',"width":150,"data" :'wxaccountname',"orderable":true}

,{ "title" : '微信企业应用名称',"width":150,"data" :'wxentappname',"orderable":true}

,{ "title" : '应用类型',"width":150,"data" :'apptype',"orderable":true,'render':function(data,type,row){return me.rendergrid_apptype(data,type,row,me);}}

,{ "title" : '应用标识',"width":150,"data" :'agentid',"orderable":true}

,{ "title" : '是否上报位置',"width":150,"data" :'replocationflag',"orderable":true,'render':function(data,type,row){return me.rendergrid_replocationflag(data,type,row,me);}}

,{ "title" : '是否进入应用',"width":150,"data" :'repenterflag',"orderable":true,'render':function(data,type,row){return me.rendergrid_repenterflag(data,type,row,me);}}

,{ "title" : '是否启用',"width":150,"data" :'validflag',"orderable":true,'render':function(data,type,row){return me.rendergrid_validflag(data,type,row,me);}}

,{ "title" : '备注',"width":350,"data" :'memo',"orderable":true}

,{ "title" : '更新人',"width":150,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'WXENTAPP'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :WXACCOUNT / 微信公众号
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WXENTAPP_WXACCOUNT_WXACCOUNTID')
         {
              me.hideGridColumn('wxaccountname');
              return;
         }
}
    ,rendergrid_apptype:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_WXEntAppType',data,'未定义');
    }
    ,rendergrid_replocationflag:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
    ,rendergrid_repenterflag:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
    ,rendergrid_validflag:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
});