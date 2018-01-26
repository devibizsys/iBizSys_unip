var OA_CLGridViewControllerBase = GridViewControllerBase.extend({
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
     /*车辆使用情况*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CLSYQK',datas:[{text:'使用中',value:'20',realtext:'使用中'},{text:'未使用',value:'10',realtext:'未使用'}]}));
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_oa_clname_like',form:form,width:100})
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
			title: '车辆编辑视图',
			openMode:'',
			 height: 0,
	    	    width: 0,
    	    layout: 'fit',
            maximizable:true,
            viewurl:'/jcsj/oa_cleditview.jsp',
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
	   return {  title: '车辆编辑视图', openMode:'', height: 0, width: 0,
    	              layout: 'fit',   maximizable:true,   viewurl:'/jcsj/oa_cleditview.jsp',   viewparam:arg  	};
       }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/jcsj/OA_CLGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/jcsj/oa_clgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.OA_CLNAME','车辆名称'),"width":150,"data" :'oa_clname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CPH','车牌号'),"width":150,"data" :'cph',"orderable":true}

,{ "title" : '使用情况',"width":150,"data" :'syqk',"orderable":true,'render':function(data,type,row){return me.rendergrid_syqk(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.CLPP','车辆品牌'),"width":150,"data" :'clpp',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.COLOR','颜色'),"width":150,"data" :'color',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_CL'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
}
    ,rendergrid_syqk:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CLSYQK',data,'未定义');
    }
});