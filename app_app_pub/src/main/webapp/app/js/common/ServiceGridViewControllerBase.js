var ServiceGridViewControllerBase = GridViewControllerBase.extend({
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
     /*服务容器*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_ServiceContainer',datas:[{text:'服务容器01',value:'SC01',realtext:'服务容器01'},{text:'服务容器02',value:'SC02',realtext:'服务容器02'},{text:'服务容器03',value:'SC03',realtext:'服务容器03'},{text:'服务容器04',value:'SC04',realtext:'服务容器04'}]}));
     /*服务运行状态*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_ServiceRunState',datas:[{text:'启动',value:'START',realtext:'启动'},{text:'停止',value:'STOP',realtext:'停止'},{text:'启动错误',value:'STARTERROR',realtext:'启动错误'}]}));
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
  var uiaction_9 = {"type":"DEUIACTION","tag":"StartService","actiontarget":"MULTIKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"StopService","actiontarget":"MULTIKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_10);
  var uiaction_11 = {"type":"DEUIACTION","tag":"ExportModel"
};
    this.regUIAction(uiaction_11);
  var uiaction_12 = {"type":"DEUIACTION","tag":"Import"
};
    this.regUIAction(uiaction_12);
  var uiaction_13 = {"type":"DEUIACTION","tag":"ToggleFilter"
};
    this.regUIAction(uiaction_13);
  var uiaction_14 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_14);
}
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getSearchForm();
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_servicename_like',form:form,width:100})
);
form.register(new IBizDropDownListField({id:this.getCId2()+'M5',name:'n_container_eq',form:form,codelistid:'uniPSample_ServiceContainer',width:100})
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
			title: '服务实体编辑视图',
			openMode:'',
			 height: 0,
	    	    width: 0,
    	    layout: 'fit',
            maximizable:true,
            viewurl:'/common/serviceeditview.jsp',
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
	   return {  title: '服务实体编辑视图', openMode:'', height: 0, width: 0,
    	              layout: 'fit',   maximizable:true,   viewurl:'/common/serviceeditview.jsp',   viewparam:arg  	};
       }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/common/ServiceGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/common/servicegridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '服务名称',"width":250,"data" :'servicename',"orderable":true}

,{ "title" : '服务容器',"width":150,"data" :'container',"orderable":true,'render':function(data,type,row){return me.rendergrid_container(data,type,row,me);}}

,{ "title" : '服务运行状态',"width":150,"data" :'servicestate',"orderable":true,'render':function(data,type,row){return me.rendergrid_servicestate(data,type,row,me);}}

,{ "title" : '备注',"width":350,"data" :'memo',"orderable":true}

,{ "title" : '更新人',"width":150,"data" :'updateman',"orderable":true}

,{ "title" : '更新时间',"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'SERVICE'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
}
    ,rendergrid_container:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_ServiceContainer',data,'未定义');
    }
    ,rendergrid_servicestate:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_ServiceRunState',data,'未定义');
    }
});