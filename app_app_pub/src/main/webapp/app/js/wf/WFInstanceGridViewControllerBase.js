var WFInstanceGridViewControllerBase = GridViewControllerBase.extend({
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
  var uiaction_0 = {"type":"DEUIACTION","tag":"New"
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"Edit","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"View","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"DEUIACTION","tag":"ToggleRowEdit"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"NewRow"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"Remove","actiontarget":"MULTIKEY"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"ExportExcel"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"Print","actiontarget":"MULTIKEY"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"Restart","actiontarget":"MULTIKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"UserCancel","actiontarget":"MULTIKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"GotoStep","actiontarget":"MULTIKEY"
,"actionmode":"FRONT"
,"fronttype":"WIZARD"
,"frontview":{"viewurl":"/wf/wfuiwizardgotooptionview.jsp","width":800,"height":400,"title":"工作流跳转操作视图",openMode:'POPUPMODAL'}
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"ExportModel"
};
    this.regUIAction(uiaction_12);
  var uiaction_13 = {"type":"DEUIACTION","tag":"Import"
};
    this.regUIAction(uiaction_13);
  var uiaction_14 = {"type":"DEUIACTION","tag":"ToggleFilter"
};
    this.regUIAction(uiaction_14);
  var uiaction_15 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_15);
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
,url:this.getAppCtx()+'/wf/WFInstanceGridView.do?SRFCTRLID=searchform&SRFFORMITEMID=n_wfworkflowname_eq'

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
,getNewDataView:function(arg){
       if(!arg)arg={};
       var newmode=arg.srfnewmode;
       if(!newmode)newmode='';
      if(true){
	var view={
			title: '工作流实例实体编辑视图',
			openMode:'',
			 height: 0,
	    	    width: 0,
    	    layout: 'fit',
            maximizable:true,
            viewurl:'/wf/wfinstanceeditview.jsp',
            viewparam:arg
      	};
	return view;
       }
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
      if(true){
	   return {  title: '工作流实例实体编辑视图', openMode:'', height: 0, width: 0,
    	              layout: 'fit',   maximizable:true,   viewurl:'/wf/wfinstanceeditview.jsp',   viewparam:arg  	};
       }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFInstanceGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wf/wfinstancegridview.jsp?'+'srfcid='+cfg.containerid+'&'
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