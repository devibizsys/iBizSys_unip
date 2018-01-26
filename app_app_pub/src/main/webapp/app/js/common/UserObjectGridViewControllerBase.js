var UserObjectGridViewControllerBase = GridViewControllerBase.extend({
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_userobjectname_like',form:form,width:100})
);
form.register(new IBizDropDownListField({id:this.getCId2()+'M5',name:'n_userobjecttype_eq',form:form,codelistid:'uniPSample_CodeList5',width:100})
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
      if(newmode=='USER'){
          return {  title: '用户实体编辑视图（分页关系）',    openMode:'',    height: 0,  width: 0,
    	            layout: 'fit',  maximizable:true,  viewurl:'/common/usereditview3.jsp',  viewparam:arg };
	}
      if(newmode=='USERGROUP'){
          return {  title: '用户组编辑视图',    openMode:'',    height: 0,  width: 0,
    	            layout: 'fit',  maximizable:true,  viewurl:'/common/usergroupeditview3.jsp',  viewparam:arg };
	}
      if(true){
	var view={
			title: '用户对象编辑',
			openMode:'',
			 height: 0,
	    	    width: 0,
    	    layout: 'fit',
            maximizable:true,
            viewurl:'/common/userobjecteditview.jsp',
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
          if(editmode=='USER'){
              return {title: '用户实体编辑视图（分页关系）',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/common/usereditview3.jsp', viewparam:arg};
          }
          if(editmode=='USERGROUP'){
              return {title: '用户组编辑视图',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/common/usergroupeditview3.jsp', viewparam:arg};
          }
      }
      if(true){
	   return {  title: '用户对象编辑', openMode:'', height: 0, width: 0,
    	              layout: 'fit',   maximizable:true,   viewurl:'/common/userobjecteditview.jsp',   viewparam:arg  	};
       }
       return null;
    }
    ,getNewDataWizardView:function(arg){
         if(!arg)arg={};
	var view={
            modal:true,
    	    title: '用户对象类型选择视图',
    	    height: 0,
    	    width: 0,
    	    layout: 'fit',
           // maximizable:true,
             viewurl:'/common/userobjectindexpickupview.jsp',
            viewparam:arg
    	};
	return view;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/UserObjectGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/userobjectgridview.jsp?'+'srfcid='+cfg.containerid+'&'
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