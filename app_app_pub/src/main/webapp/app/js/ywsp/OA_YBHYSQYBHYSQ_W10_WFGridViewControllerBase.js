var OA_YBHYSQYBHYSQ_W10_WFGridViewControllerBase = GridViewControllerBase.extend({
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
     /*会议类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_HYLX',datas:[{text:'院办会议',value:'10',realtext:'院办会议'},{text:'内设机构会议',value:'20',realtext:'内设机构会议'}]}));
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
  var uiaction_3 = {"type":"WFUIACTION","tag":"AC1020","actiontarget":"MULTIKEY"
,"actionmode":"WFFRONT"
,"fronttype":"WIZARD"
,"frontview":{"viewurl":"/ywsp/oa_ybhysqshyjwfactionview.jsp","viewparam":{"srfwfiatag":"AC1020","srfwfstep":"10"},"width":0,"height":0,"title":"院办会议申请",openMode:'POPUPMODAL'}
};
    this.regUIAction(uiaction_3);
  var uiaction_4 = {"type":"WFUIACTION","tag":"AC1010","actiontarget":"MULTIKEY"
,"actionmode":"WFFRONT"
,"fronttype":"WIZARD"
,"frontview":{"viewurl":"/ywsp/oa_ybhysqshyjwfactionview.jsp","viewparam":{"srfwfiatag":"AC1010","srfwfstep":"10"},"width":0,"height":0,"title":"院办会议申请",openMode:'POPUPMODAL'}
};
    this.regUIAction(uiaction_4);
  var uiaction_5 = {"type":"DEUIACTION","tag":"Copy","actiontarget":"SINGLEKEY"
};
    this.regUIAction(uiaction_5);
  var uiaction_6 = {"type":"DEUIACTION","tag":"ToggleRowEdit"
};
    this.regUIAction(uiaction_6);
  var uiaction_7 = {"type":"DEUIACTION","tag":"NewRow"
};
    this.regUIAction(uiaction_7);
  var uiaction_8 = {"type":"DEUIACTION","tag":"Remove","actiontarget":"MULTIKEY"
};
    this.regUIAction(uiaction_8);
  var uiaction_9 = {"type":"DEUIACTION","tag":"ExportExcel"
};
    this.regUIAction(uiaction_9);
  var uiaction_10 = {"type":"DEUIACTION","tag":"Print","actiontarget":"MULTIKEY"
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_oa_ybhysqname_like',form:form,width:100})
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
       return null;
    }

,getEditDataView:function(arg){
       if(!arg)arg={};
       var list = [arg.srfeditmode2,arg.srfeditmode];
       for(var i=0;i<2;i++){
          var editmode=list[i];
          if(!editmode)
             continue;
          if(editmode=='10@1'){
              return {title: '院办会议申请工作流视图(院办会议申请v1:各单位反馈参会名单)',openMode:'',height: 0,width: 0,
   		    	layout: 'fit',maximizable:true, viewurl:'/ywsp/oa_ybhysqybhysq_w10_wfeditview3.jsp', viewparam:arg};
          }
      }
      if(true){
	   return {  title: '院办会议申请工作流视图(院办会议申请v1:各单位反馈参会名单)', openMode:'', height: 0, width: 0,
    	              layout: 'fit',   maximizable:true,   viewurl:'/ywsp/oa_ybhysqybhysq_w10_wfeditview3.jsp',   viewparam:arg  	};
       }
       return null;
    }
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/ywsp/OA_YBHYSQYBHYSQ_W10_WFGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_ybhysqybhysq_w10_wfgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.OA_YBHYSQNAME','会议标题'),"width":150,"data" :'oa_ybhysqname',"orderable":true}

,{ "title" : '申请人',"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : '部门名称',"width":150,"data" :'orgsectorname',"orderable":true}

,{ "title" : '申请时间',"width":150,"data" :'sqsj',"orderable":true}

,{ "title" : '会议时间',"width":150,"data" :'hysj',"orderable":true}

,{ "title" : '会议要求',"width":150,"data" :'hyyq',"orderable":true}

,{ "title" : '会议类型',"width":150,"data" :'hylx',"orderable":true,'render':function(data,type,row){return me.rendergrid_hylx(data,type,row,me);}}

,{ "title" : '会议内容',"width":150,"data" :'hynr',"orderable":true}

,{ "title" : '备注',"width":150,"data" :'bz',"orderable":true}

,{ "title" : '通知总人数',"width":150,"data" :'tzzrs',"orderable":true}

,{ "title" : '未参会人数',"width":150,"data" :'wchrs',"orderable":true}

,{ "title" : '已迟到人数',"width":150,"data" :'ycdrs',"orderable":true}

,{ "title" : '已参会人数',"width":150,"data" :'ychrs',"orderable":true}

,{ "title" : '已请假人数',"width":150,"data" :'yqjrs',"orderable":true}

,{ "title" : '审核意见',"width":150,"data" :'memo',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEMAN','建立人'),"width":150,"data" :'createman',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_YBHYSQ'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_YBHYSQ_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              return;
         }
         //关系类型 : DER1N ,主实体 :OA_HYS / 会议室
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_YBHYSQ_OA_HYS_OA_HYSID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGSECTOR / 组织部门
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_YBHYSQ_ORGSECTOR_ORGSECTORID')
         {
              me.hideGridColumn('orgsectorname');
              return;
         }
}
    ,rendergrid_hylx:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_HYLX',data,'未定义');
    }
,getEditMode:function(data){
    var editMode=arguments.callee.$.getEditMode.call(this,data);
    if(editMode&&editMode!='')
       editMode= editMode+':'+ data.hysqbz;
    else 
       editMode= data.hysqbz;
      
     return editMode;
      }     
});