var IndexViewControllerBase = IndexViewControllerBase.extend({
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
     /*门户界面计数器*/
     this.regUICounter(new IBizCounter({tag: '956f2c99da31bb9d03e1160e9a90b130',counterid:'2cfc5bba445f0d9908920a83e87ab1c9',counterparam:{},ctrler:this,timer:60000}));
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
      ,getDefaultCfg:function(cfg){
         var me=this;   
         var config={backendurl:cfg.appctx+'/tygz/IndexView.do?'+'srfcid='+cfg.containerid+'&'
                     ,viewurl:'/tygz/indexview.jsp?'+'srfcid='+cfg.containerid+'&',portalcountertag:'956f2c99da31bb9d03e1160e9a90b130'
               ,menualign:'',ctrls:{},defviewurl:'/common/potal.jsp'};
       return  $.extend({},config,cfg);
      } 
        ,getAppFunc:function(arg){
        var me = this;
        var appfuncid = arg.appfuncid;
           if(appfuncid=='70E096E8-E903-4C68-8BD6-0D48EED964E8'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_gzrzrztjlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'工作日志工作流导航视图(日志提交流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='A978F740-5B26-46E1-9518-52BD12925038'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/xxtz/oa_tzggtzggsqlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'通知公告工作流导航视图(通知公告申请)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='FCD1C5FD-39AF-4C36-AE77-2CD2AA1C4285'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/xxtz/oa_xxgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'消息表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='47C0D856-4B59-445E-A24F-B0E214DB7E3B'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/jcsj/oa_zskgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'知识库表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='F05EE30A-A0EE-40C5-B016-BDAD4FD08FCA'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/jcsj/oa_flfggridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'法律法规表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='7314F60D-A75D-4884-8A3B-F9E353A5439C'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_ybhysqybhysq_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'院办会议申请工作流导航视图(院办会议申请)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='2F033F27-5262-4170-9E91-C8081347ACCD'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_nsjghysqnsjghysq_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'内设机构会议申请工作流导航视图(内设机构会议申请)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='662D1F67-0AD1-4ACF-906C-45365B318968'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_chrywchgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'参会人员表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='662D1F67-0AD1-4ACF-906C-45365B318968'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_chrywchgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'参会人员表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='4A647515-97EB-45F8-BEDD-BC07DC51B1E7'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_chryyqjgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'参会人员表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='39EE2E81-6476-46D0-A0F7-F850C1D174D1'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_qxjqxjlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'请休假工作流导航视图(请休假流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='604D0616-6EF6-47A4-9F0B-1E06C1C43A42'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_ccsqccsqlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'出差申请工作流导航视图(出差申请流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='E21F67E6-5929-49A7-B9ED-4BFF8C755137'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_cgsqcgsqlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'采购申请工作流导航视图(采购申请流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='0C5B1CCE-EBF2-4356-9273-160953B289EF'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_xmjdgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'项目进度表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='592ACECF-AB68-4136-BCAB-EA336ED5E09A'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_ycsqycsqlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'用餐申请工作流导航视图(用餐申请流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='5C5FD07F-5E2F-408E-8763-04C4F89549CA'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_sbwxsbwxlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'设备维修工作流导航视图(设备维修流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='9DCA9DD0-3CDF-41FF-8984-C20D5A3F15AF'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_jpydjpydlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'机票预订工作流导航视图(机票预订流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='18C1BDBE-2FE8-4B1D-AC38-EA156FA0BE4C'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_yyssqyyssq_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'饮用水申请工作流导航视图(饮用水申请流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='4F51A7C1-DCB9-4781-87D7-91497DEADF12'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_bgypsqbgypsqlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'办公用品申请工作流导航视图(办公用品申领流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='7758F366-904B-409F-B5C2-8C07A5B22D51'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_clwxclwxlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'车辆维修工作流导航视图(车辆维修流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='9788E100-880E-4A59-BC6E-D15691D659BC'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_stwmdgstwmdglc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'食堂外卖订购工作流导航视图(食堂外卖订购流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='0DEE343D-99DA-4AA2-A035-E073DF7371FF'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_cpmjsqcpmjsqlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'车牌门禁申请工作流导航视图(车牌门禁申请流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='F15E6E87-25FB-4CF2-8160-F17B03AAE92E'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/ywsp/oa_pcsqpcsqlc_wfexpview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'派车申请工作流导航视图(派车申请流程)',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='2D0712A4-D592-402F-89AD-118D3A9FA390'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/orggridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'组织机构实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='147AB456-A939-446C-8BD1-54BDB7C34AC8'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/orgsectorgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'组织部门实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='349D89C5-01BA-42DE-A134-7CB21447C21C'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/orgsecusertypegridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'部门人员关系类型实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='E54A3B9A-AD49-4CFC-ACCD-A77EB4AB9BEF'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/orguserux_gridview2.jsp',pdtAppFuncId:'',closable:true,viewtitle:'组织人员表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='90422F4D-8D61-474C-A0E4-8BD2FE5321E9'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/wx/wxaccountgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'微信公众号实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='866447C8-EBF2-40A7-B520-8BCF3A3DE4FE'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/wx/wxorgsectorgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'微信部门实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='18E33826-1655-482D-A105-A00EC4703AC3'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/wx/wxentappgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'微信企业应用实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='FAF0281A-2C7F-4E24-B6E6-1A16FD0F8126'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/userobjectgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'用户对象实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='C7AA6271-2FD6-4B16-99D2-9B5C528A0FFE'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/userrolegridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'用户角色实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='9A20F4BE-197E-4D89-8C24-19248D0E6A1E'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/wf/wfusergroupgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'工作流用户组实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='55ACDD3E-8F30-4B41-98E0-E957533E7D75'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/uniresgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'统一资源实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='71A000A2-C7CB-4146-BF41-BD81E9EB49A1'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/userroledatagridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'数据对象能力实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='42A37D26-F262-46F2-98D7-790606D7516B'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/demodel/dataentitygridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'实体实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='06F33437-40DA-410B-BE1D-5DA92B5F72C9'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/jcsj/oa_clgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'车辆表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='6875B831-663E-4768-8CD3-EE2057960786'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/jcsj/oa_hysgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'会议室表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='E99E188D-1A9C-4ADD-A2D3-F978B0918CED'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/msgtemplategridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'消息模板实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='4BEFF96D-319C-4FCC-AAE5-0D1D794795BB'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/xtgl/oa_czrzgridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'操作日志表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           if(appfuncid=='36A4159E-A1E7-464F-8EC8-CBA4D84D4082'){
                var ret={funcsn:'',functype:'APPVIEW',openmode:'INDEXVIEWTAB',viewurl:'/common/servicegridview.jsp',pdtAppFuncId:'',closable:true,viewtitle:'服务实体表格视图',openviewparam:{}};
             return $.extend({},ret,arg);
           }
           return null;
        }

});