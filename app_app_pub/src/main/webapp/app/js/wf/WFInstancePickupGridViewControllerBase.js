var WFInstancePickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
form.register(new IBizHiddenField({id:this.getCId2()+'M8',name:'n_wfworkflowid_eq'}));
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_wfinstancename_like',form:form,width:100})
);
form.register(new IBizPickerField({id:this.getCId2()+'M5',name:'n_wfworkflowname_eq',form:form,forceSelection:true,queryCaching:false, displayField:'text',valueField: 'value',valueItem:'n_wfworkflowid_eq',minChars:2,pageSize:50
,pickupView:{view:'/wf/wfworkflowpickupview.jsp',title:'工作流配置实体数据选择视图'}
,ac:true
,url:this.getAppCtx()+'/wf/WFInstancePickupGridView.do?SRFCTRLID=searchform&SRFFORMITEMID=n_wfworkflowname_eq'

,width:100})
);
form.register(new IBizTextField({id:this.getCId2()+'M6',name:'n_userdata_like',form:form,width:100})
);
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'n_userdata4_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFInstancePickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wf/wfinstancepickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '工作流实例名称',"width":150,"data" :'wfinstancename',"orderable":true}

,{ "title" : '父实例',"width":150,"data" :'pwfinstancename',"orderable":true}

,{ "title" : '工作流名称',"width":150,"data" :'wfworkflowname',"orderable":true}

,{ "title" : '用户数据信息',"width":150,"data" :'userdatainfo',"orderable":true}

,{ "title" : '开始时间',"width":150,"data" :'starttime',"orderable":true}

,{ "title" : '结束时间',"width":150,"data" :'endtime',"orderable":true}

,{ "title" : '是否完成',"width":150,"data" :'isfinish',"orderable":true,'render':function(data,type,row){return me.rendergrid_isfinish(data,type,row,me);}}

,{ "title" : '是否取消',"width":150,"data" :'iscancel',"orderable":true,'render':function(data,type,row){return me.rendergrid_iscancel(data,type,row,me);}}

,{ "title" : '是否关闭',"width":150,"data" :'isclose',"orderable":true,'render':function(data,type,row){return me.rendergrid_isclose(data,type,row,me);}}

,{ "title" : '工作流说明',"width":150,"data" :'memo',"orderable":true}

,{ "title" : '用户数据',"width":150,"data" :'userdata',"orderable":true}

,{ "title" : '用户数据4',"width":150,"data" :'userdata4',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'WFINSTANCE'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :WFINSTANCE / 工作流实例
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFINSTANCE_WFINSTANCE_PWFINSTANCEID')
         {
              me.hideGridColumn('pwfinstancename');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORG / 组织机构
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFINSTANCE_ORG_ORGID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :WFWORKFLOW / 工作流配置
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFINSTANCE_WFWORKFLOW_WFWORKFLOWID')
         {
              me.hideGridColumn('wfworkflowname');
              return;
         }
}
    ,rendergrid_isfinish:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
    ,rendergrid_iscancel:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
    ,rendergrid_isclose:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
});