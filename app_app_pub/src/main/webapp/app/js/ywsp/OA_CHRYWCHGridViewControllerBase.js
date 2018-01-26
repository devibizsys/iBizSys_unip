var OA_CHRYWCHGridViewControllerBase = GridViewControllerBase.extend({
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
     /*参会状态*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CL_CHZT',datas:[{text:'未参加',value:'10',realtext:'未参加'},{text:'已请假',value:'20',realtext:'已请假'},{text:'已参加',value:'30',realtext:'已参加'},{text:'已迟到',value:'40',realtext:'已迟到'}]}));
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
  var uiaction_0 = {"type":"DEUIACTION","tag":"CH","actiontarget":"SINGLEKEY"
,"actionmode":"BACKEND"
,"timeout":60000
};
    this.regUIAction(uiaction_0);
  var uiaction_1 = {"type":"DEUIACTION","tag":"QJ","actiontarget":"SINGLEKEY"
,"actionmode":"FRONT"
,"fronttype":"WIZARD"
,"frontview":{"viewurl":"/common/oa_chryredirectview2.jsp","width":0,"height":0,"title":"参会人员数据重定向视图",openMode:'',redirectview:true,backendurl:"/common/OA_CHRYRedirectView2.do"}
};
    this.regUIAction(uiaction_1);
  var uiaction_2 = {"type":"DEUIACTION","tag":"View","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_2);
  var uiaction_3 = {"type":"DEUIACTION","tag":"ExportModel"
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"DEUIACTION","tag":"Import"
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"ToggleFilter"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"Help"
};
    this.regUIAction(uiaction_6);
}
,onInit:function(){
   arguments.callee.$.onInit.call(this);
   var form=this.getSearchForm();
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_ybhysqname_like',form:form,width:100})
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
			title: '参会人员编辑视图',
			openMode:'',
			 height: 0,
	    	    width: 0,
    	    layout: 'fit',
            maximizable:true,
            viewurl:'/ywsp/oa_chryeditview.jsp',
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
	   return {  title: '参会人员编辑视图', openMode:'', height: 0, width: 0,
    	              layout: 'fit',   maximizable:true,   viewurl:'/ywsp/oa_chryeditview.jsp',   viewparam:arg  	};
       }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/ywsp/OA_CHRYWCHGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_chrywchgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : '院办会议申请名称',"width":150,"data" :'ybhysqname',"orderable":true}

,{ "title" : '参会人员名称',"width":100,"data" :'orgusername',"orderable":true}

,{ "title" : '参会时间',"width":150,"data" :'chsj',"orderable":true}

,{ "title" : '参会状态',"width":100,"data" :'chzt',"orderable":true,'render':function(data,type,row){return me.rendergrid_chzt(data,type,row,me);}}

,{ "title" : '职位',"width":100,"data" :'orgsecusertypename',"orderable":true}

,{ "title" : '座位号',"width":60,"data" :'zwh',"orderable":true}

,{ "title" : '座位号描述',"width":150,"data" :'zwhms',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_CHRY'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :OA_YBHYSQ / 院办会议申请
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_CHRY_OA_YBHYSQ_YBHYSQID')
         {
              me.hideGridColumn('ybhysqname');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_CHRY_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              me.hideGridColumn('orgsecusertypename');
              return;
         }
}
    ,rendergrid_chzt:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CL_CHZT',data,'未定义');
    }
});