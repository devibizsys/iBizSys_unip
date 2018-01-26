var OA_GZRZPickupGridViewControllerBase = PickupGridViewControllerBase.extend({
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
     /*是否已读*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CL_SFYD',datas:[{text:'未读',value:'10',realtext:'未读'},{text:'已读',value:'20',realtext:'已读'}]}));
     /*工作日志类型*/
     this.regCodeList(new IBizCodeList({id: 'uniPSample_CL_GZRZLX',datas:[{text:'日报',value:'10',realtext:'日报'},{text:'周报',value:'20',realtext:'周报'},{text:'月报',value:'30',realtext:'月报'}]}));
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

}
,onSearchFormFieldChanged: function (fieldname, field, value) {
   var me=this;
   var form=me.getSearchForm();
}
,getDefaultCfg:function(cfg){
     var me=this;   
    var config={backendurl:cfg.appctx+'/ywsp/OA_GZRZPickupGridView.do?'+'srfcid='+cfg.containerid+'&',loaddefault:true
                ,viewurl:'/ywsp/oa_gzrzpickupgridview.jsp?'+'srfcid='+cfg.containerid+'&'
               ,ctrls:{grid:{multiSelect:true
,enablePaging:true,pageSize:20,forceFit:false
,columns:[
{ "title" : $IGM('DEF.LNAME.OA_GZRZNAME','工作日志名称'),"width":150,"data" :'oa_gzrzname',"orderable":true}

,{ "title" : '提交人',"width":150,"data" :'orgusername',"orderable":true}

,{ "title" : '日志类型',"width":150,"data" :'rzlx',"orderable":true,'render':function(data,type,row){return me.rendergrid_rzlx(data,type,row,me);}}

,{ "title" : $IGM('DEF.LNAME.JRGZCX','今日工作成效'),"width":150,"data" :'jrgzcx',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CZWT','存在问题'),"width":150,"data" :'czwt',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.MRJH','明日计划'),"width":150,"data" :'mrjh',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.XXT','需协调'),"width":150,"data" :'xxt',"orderable":true}

,{ "title" : '审批人',"width":150,"data" :'spr',"orderable":true}

,{ "title" : '抄送人',"width":150,"data" :'csr',"orderable":true}

,{ "title" : '是否已读',"width":150,"data" :'sfyd',"orderable":true,'render':function(data,type,row){return me.rendergrid_sfyd(data,type,row,me);}}

,{ "title" : '备注',"width":150,"data" :'bz',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEMAN','更新人'),"width":150,"data" :'updateman',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.UPDATEDATE','更新时间'),"width":150,"data" :'updatedate',"orderable":true}

,{ "title" : $IGM('DEF.LNAME.CREATEDATE','建立时间'),"width":150,"data" :'createdate',"orderable":true}
]
},searchForm:{enableAdvanceSearch:false,dename:'OA_GZRZ'}}};
    return  $.extend({},config,cfg);
}
,doHideParentColumns: function (parentMode)
    {
        var me=this;
        arguments.callee.$.doHideParentColumns.call(this,parentMode);
 
         //关系类型 : DER1N ,主实体 :ORGUSER / 组织人员
         if (parentMode.srfparenttype=='DER1N' && parentMode.srfder1nid=='DER1N_OA_GZRZ_ORGUSER_ORGUSERID')
         {
              me.hideGridColumn('orgusername');
              return;
         }
}
    ,rendergrid_rzlx:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CL_GZRZLX',data,'未定义');
    }
    ,rendergrid_sfyd:function(data,type,row,me){
           return me.renderCodeList_Normal('uniPSample_CL_SFYD',data,'未定义');
    }
});