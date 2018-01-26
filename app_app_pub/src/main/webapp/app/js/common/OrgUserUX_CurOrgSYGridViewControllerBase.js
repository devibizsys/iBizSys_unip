var OrgUserUX_CurOrgSYGridViewControllerBase = GridViewControllerBase.extend({
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_orgname_like',form:form,width:100})
);
form.register(new IBizTextField({id:this.getCId2()+'M5',name:'n_orgsectorname_like',form:form,width:100})
);
form.register(new IBizRadioField({id:this.getCId2()+'M6',name:'n_reserver25_eq',form:form,codelistid:'uniPSample_YesNo',itemWidth:60})
);
form.register(new IBizTextField({id:this.getCId2()+'M7',name:'n_orgusername_like',form:form,width:100})
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
			title: 'UX_组织人员实体编辑视图',
			openMode:'',
			 height: 0,
	    	    width: 0,
    	    layout: 'fit',
            maximizable:true,
            viewurl:'/common/orguserux_editview.jsp',
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
	   return {  title: 'UX_组织人员实体编辑视图', openMode:'', height: 0, width: 0,
    	              layout: 'fit',   maximizable:true,   viewurl:'/common/orguserux_editview.jsp',   viewparam:arg  	};
       }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/OrgUserUX_CurOrgSYGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/orguserux_curorgsygridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '所属组织',"width":150,"data" :'orgname',"orderable":true}

,{ "title" : '所属部门',"width":150,"data" :'orgsectorname',"orderable":true}

,{ "title" : '人员名称',"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : '用户编号',"width":150,"data" :'usercode',"orderable":true}

,{ "title" : '人员级别',"width":150,"data" :'orguserlevelname',"orderable":true}

,{ "title" : '备注',"width":150,"data" :'memo',"orderable":true}

,{ "title" : '人员排序',"width":150,"data" :'ordervalue',"orderable":true}

,{ "title" : '启用标志',"width":150,"data" :'validflag',"orderable":true,'render':function(data,type,row){return me.rendergrid_validflag(data,type,row,me);}}

,{ "title" : '头衔名称',"width":150,"data" :'titlename',"orderable":true}

,{ "title" : '部门人员关系',"width":150,"data" :'orgsecusertypename',"orderable":true}

,{ "title" : '更新人',"width":150,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'ORGUSER'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORG / 组织机构
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_ORGUSER_ORG_ORGID')
         {
              me.hideGridColumn('orgname');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_ORGUSER_ORGSECTOR_ORGSECTORID')
         {
              me.hideGridColumn('orgsectorname');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGUSERLEVEL / 组织人员级别
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_ORGUSER_ORGUSERLEVEL_ORGUSERLEVELID')
         {
              me.hideGridColumn('orguserlevelname');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGSECUSERTYPE / 部门人员关系类型
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_ORGUSER_ORGSECUSERTYPE_ORGSECUSERTYPEID')
         {
              me.hideGridColumn('orgsecusertypename');
              return;
         }
}
    ,rendergrid_validflag:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_YesNo',data,'未定义');
    }
});