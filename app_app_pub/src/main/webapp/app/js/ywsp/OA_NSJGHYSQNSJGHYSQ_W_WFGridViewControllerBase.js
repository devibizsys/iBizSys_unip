var OA_NSJGHYSQNSJGHYSQ_W_WFGridViewControllerBase = GridViewControllerBase.extend({
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
 
}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getNewDataView:function(arg){
       if(!arg)arg={};
       var newmode=arg.srfnewmode;
       if(!newmode)newmode='';
       return null;
    }

,getEditDataView:function(arg){
       if(!arg)arg={};
       var list = [arg.srfeditmode2,arg.srfeditmode];
       for(var i=0;i<2;i++){
          var editmode=list[i];
          if(!editmode)
             continue;
          if(editmode=='10'){
              return {title: '内设机构会议申请工作流视图(内设机构会议申请v1:参会领导审核)',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/ywsp/oa_nsjghysqnsjghysq_w10_wfeditview3.jsp', viewparam:arg};
          }
          if(editmode=='30'){
              return {title: '内设机构会议申请工作流视图(内设机构会议申请v1:秘书处审核)',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/ywsp/oa_nsjghysqnsjghysq_w30_wfeditview3.jsp', viewparam:arg};
          }
          if(editmode=='40@1'){
              return {title: '内设机构会议申请工作流视图(内设机构会议申请v1:院办负责人审核)',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/ywsp/oa_nsjghysqnsjghysq_w40_wfeditview3.jsp', viewparam:arg};
          }
          if(editmode=='30@1'){
              return {title: '内设机构会议申请工作流视图(内设机构会议申请v1:秘书处审核)',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/ywsp/oa_nsjghysqnsjghysq_w30_wfeditview3.jsp', viewparam:arg};
          }
          if(editmode=='10@1'){
              return {title: '内设机构会议申请工作流视图(内设机构会议申请v1:参会领导审核)',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/ywsp/oa_nsjghysqnsjghysq_w10_wfeditview3.jsp', viewparam:arg};
          }
          if(editmode=='20'){
              return {title: '内设机构会议申请工作流视图(内设机构会议申请v1:承办处室负责人审核)',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/ywsp/oa_nsjghysqnsjghysq_w20_wfeditview3.jsp', viewparam:arg};
          }
          if(editmode=='20@1'){
              return {title: '内设机构会议申请工作流视图(内设机构会议申请v1:承办处室负责人审核)',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/ywsp/oa_nsjghysqnsjghysq_w20_wfeditview3.jsp', viewparam:arg};
          }
          if(editmode=='40'){
              return {title: '内设机构会议申请工作流视图(内设机构会议申请v1:院办负责人审核)',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/ywsp/oa_nsjghysqnsjghysq_w40_wfeditview3.jsp', viewparam:arg};
          }
      }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/ywsp/OA_NSJGHYSQNSJGHYSQ_W_WFGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_nsjghysqnsjghysq_w_wfgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.OA_NSJGHYSQNAME','会议名称'),"width":150,"data" :'oa_nsjghysqname',"orderable":true}

,{ "title" : '组织部门名称',"width":150,"data" :'orgsectorname',"orderable":true}

,{ "title" : '申请人',"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : '会议地点',"width":150,"data" :'hydd',"orderable":true}

,{ "title" : '会议要求',"width":150,"data" :'hyyq',"orderable":true}

,{ "title" : '参会领导',"width":150,"data" :'chld',"orderable":true}

,{ "title" : '会议时间',"width":150,"data" :'hysj',"orderable":true}

,{ "title" : '承办处室负责人意见',"width":150,"data" :'cbcsfzryj',"orderable":true}

,{ "title" : '秘书处意见',"width":150,"data" :'mscyj',"orderable":true}

,{ "title" : '院办负责人意见',"width":150,"data" :'ybfzryj',"orderable":true}

,{ "title" : '备注',"width":150,"data" :'bz',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_NSJGHYSQ'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_NSJGHYSQ_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_NSJGHYSQ_ORGSECTOR_ORGSECTORID')
         {
              me.hideGridColumn('orgsectorname');
              return;
         }
         //关系类型 : DER1N ,主实体 :OA_HYS / 会议室
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_NSJGHYSQ_OA_HYS_HYSID')
         {
              return;
         }
}
,getEditMode:function(data){
    var editMode=arguments.callee.$.getEditMode.call(this,data);
    if(editMode&&editMode!='')
       editMode= editMode+':'+ data.nsjghysqbz;
    else 
       editMode= data.nsjghysqbz;
      
     return editMode;
      }     
});