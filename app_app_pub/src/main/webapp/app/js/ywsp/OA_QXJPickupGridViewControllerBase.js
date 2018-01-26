var OA_QXJPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*请休假类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_QXJLX',datas:[{text:'事假',value:'10',realtext:'事假'},{text:'病假',value:'20',realtext:'病假'},{text:'年假',value:'30',realtext:'年假'},{text:'调休',value:'40',realtext:'调休'},{text:'婚假',value:'50',realtext:'婚假'},{text:'产假',value:'60',realtext:'产假'},{text:'陪产假',value:'70',realtext:'陪产假'},{text:'丧假',value:'80',realtext:'丧假'}]}));
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
form.register(new IBizTextField({id:this.getCId2()+'M4',name:'n_orgusername_like',form:form,width:100})
);

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/ywsp/OA_QXJPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_qxjpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.OA_QXJNAME','请休假名称'),"width":150,"data" :'oa_qxjname',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.OA_QXJ.ORGUSERNAME','申请人'),"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.QXJLX','请休假类型'),"width":150,"data" :'qxjlx',"orderable":true,'render':function(data,type,row){return me.rendergrid_qxjlx(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.SC','时长'),"width":150,"data" :'sc',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.ZW','职务'),"width":150,"data" :'zw',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.KSSJ','开始时间'),"width":150,"data" :'kssj',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.JSSJ','结束时间'),"width":150,"data" :'jssj',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.QXJSY','请休假事由'),"width":150,"data" :'qxjsy',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_QXJ'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :OA_YBHYSQ / 院办会议申请
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_QXJ_OA_YBHYSQ_YBHYSQID')
         {
              return;
         }
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_QXJ_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              return;
         }
}
    ,rendergrid_qxjlx:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_QXJLX',data,'未定义');
    }
});