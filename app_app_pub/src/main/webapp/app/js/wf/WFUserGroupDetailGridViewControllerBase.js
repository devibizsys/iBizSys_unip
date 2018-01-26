var WFUserGroupDetailGridViewControllerBase = GridViewControllerBase.extend({
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
  var uiaction_9 = {"type":"DEUIACTION","tag":"ExportModel"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"Import"
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"ToggleFilter"
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_12);
}
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getSearchForm();
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_wfusergroupdetailname_like',form:form,width:100})
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
			title: '工作流用户组成员实体编辑视图',
			openMode:'POPUPMODAL',
			 height: 0,
	    	    width: 0,
    	    layout: 'fit',
            maximizable:true,
            viewurl:'/wf/wfusergroupdetaileditview.jsp',
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
	   return {  title: '工作流用户组成员实体编辑视图', openMode:'POPUPMODAL', height: 0, width: 0,
    	              layout: 'fit',   maximizable:true,   viewurl:'/wf/wfusergroupdetaileditview.jsp',   viewparam:arg  	};
       }
       return null;
    }
   ,isEnableBatchAdd:function(){return true;}
   ,getMPickupView: function (arg)
    {
        if(!arg)arg={};
        var me=this;
        var parentMode=me.getParentMode();
        var tempMode=me.getMDCtrl().tempMode;
        if(!tempMode)
             tempMode=false;
        if ( parentMode.srfder1nid=='DER1N_WFUSERGROUPDETAIL_WFUSERGROUP_WFUSERGROUPID'){
arg.srftempmode=false;
            var view={
                modal:true,
    	        title: '工作流用户实体数据多项选择视图',
    	        height: 0,
    	        width: 0,
    	        layout: 'fit',
                 viewurl:'/wf/wfusermpickupview.jsp',
                viewparam:arg
    	     };
	    return view;
        }       

        if (parentMode.srfder1nid=='DER1N_WFUSERGROUPDETAIL_WFUSER_WFUSERID'){
arg.srftempmode=false;
            var view={
                modal:true,
    	        title: '工作流用户组实体数据多项选择视图',
    	        height: 0,
    	        width: 0,
    	        layout: 'fit',
                viewurl:'/wf/wfusergroupmpickupview.jsp',
                viewparam:arg
    	     };
	    return view;
        }
        return null;
     }

,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/wf/WFUserGroupDetailGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/wf/wfusergroupdetailgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[]
},searchForm:{enableAdvanceSearch:false,dename:'WFUSERGROUPDETAIL'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :WFUSERGROUP / 工作流用户组
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFUSERGROUPDETAIL_WFUSERGROUP_WFUSERGROUPID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :WFUSER / 工作流用户
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_WFUSERGROUPDETAIL_WFUSER_WFUSERID')
         {
              return;
         }
}
});