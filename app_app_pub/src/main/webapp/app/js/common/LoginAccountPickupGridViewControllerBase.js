var LoginAccountPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*本地语言*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CodeList56',datas:[{text:'英文',value:'EN',realtext:'英文'},{text:'中文简体',value:'ZH_CN',realtext:'中文简体'},{text:'中文繁体（台湾）',value:'ZH_TW',realtext:'中文繁体（台湾）'}]}));
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_loginaccountname_like',form:form,width:100})
);
form.register(new IBizTextField({id:this.getCId2()+'M5',name:'n_username_like',form:form,width:100})
);
form.register(new IBizDropDownListField({id:this.getCId2()+'M6',name:'n_isenable_eq',form:form,codelistid:'uniPSample_YesNo',width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/LoginAccountPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/loginaccountpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '用户',"width":150,"data" :'username',"orderable":true}

,{ "title" : '登录帐户',"width":150,"data" :'loginaccountname',"orderable":true}

,{ "title" : '是否启用',"width":150,"data" :'isenable',"orderable":true,'render':function(data,type,row){return me.rendergrid_isenable(data,type,row,me);}}

,{ "title" : '默认语言',"width":150,"data" :'language',"orderable":true,'render':function(data,type,row){return me.rendergrid_language(data,type,row,me);}}

,{ "title" : '最后登录时间',"data" :'lastlogintime',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'LOGINACCOUNT'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :USER / 用户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_LOGINACCOUNT_USER_USERID')
         {
              me.hideGridColumn('username');
              return;
         }
}
    ,rendergrid_isenable:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
    ,rendergrid_language:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CodeList56',data,'未定义');
    }
});