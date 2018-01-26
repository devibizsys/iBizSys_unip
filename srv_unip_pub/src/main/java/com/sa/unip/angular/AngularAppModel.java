/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.angular;

import org.springframework.stereotype.Component;
import net.ibizsys.paas.appmodel.AppModelGlobal;
import net.ibizsys.paas.core.ISystem;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.appmodel.AppViewModel;
import net.ibizsys.paas.appmodel.AppDEViewModel;
import com.sa.unip.srv.UniPSampleSysModel;

/**
 * 应用程序[网页Angular]模型对象
 */
@Component
public class AngularAppModel extends net.ibizsys.paas.appmodel.AppModelBase  {

    public AngularAppModel() throws Exception {
        super();
        //设置应用基本信息
        this.setId("245D3B53-1D67-49E5-A4C0-1A7F556007F3");
        this.setName("Angular");
        this.setPFType("ANGULAR");
        //注册到全局应用程序模型对象
        AppModelGlobal.registerApplication("com.sa.unip.angular.AngularAppModel",this);
        //准备应用用户模式菜单
        this.prepareAppUserModeMenus();
        //准备应用视图
        this.prepareAppViews();
    }

    private UniPSampleSysModel uniPSampleSysModel;

    /**
     * 获取当前系统模型对象
     * @return
     */
    public  UniPSampleSysModel getUniPSampleSysModel() {
        if(this.uniPSampleSysModel==null) {
            try {
                this.uniPSampleSysModel = (UniPSampleSysModel)SysModelGlobal.getSystem("com.sa.unip.srv.UniPSampleSysModel");
            } catch(Exception ex) {
            }
        }
        return this.uniPSampleSysModel;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.core.IApplication#getSystem()
     */
    @Override
    public  ISystem getSystem() {
        return this.getUniPSampleSysModel();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.appmodel.AppModelBase#setPFType(java.lang.String)
     */
    @Override
    protected void setPFType(String strPFType) {
        super.setPFType(strPFType);
    }

    /**
     * 准备应用用户模式菜单
     * @throws Exception
     */
    protected void prepareAppUserModeMenus()throws Exception {
    }

    /**
     * 准备应用视图
     * @throws Exception
     */
    protected void prepareAppViews()throws Exception {
        //注册应用模块[微信]视图
        prepareAppViews_wx();
        //注册应用模块[常规]视图
        prepareAppViews_common();
        //注册应用模块[消息通知]视图
        prepareAppViews_xxtz();
        //注册应用模块[基础数据]视图
        prepareAppViews_jcsj();
        //注册应用模块[工作流]视图
        prepareAppViews_gzl();
        //注册应用模块[系统管理]视图
        prepareAppViews_xtgl();
    }

    /**
     * 准备应用视图[微信]
     * @throws Exception
     */
    protected void prepareAppViews_wx()throws Exception {
    }
    /**
     * 准备应用视图[常规]
     * @throws Exception
     */
    protected void prepareAppViews_common()throws Exception {
        registerAppView("53594A97-CA1B-43BD-9E33-912E88FDDB85","IndexView",null,"","common",null,-1,-1);
        registerAppView("BC4694BA-8403-433B-8361-F4FB2105B8B4","potal",null,"门户视图","common",null,-1,-1);
    }
    /**
     * 准备应用视图[消息通知]
     * @throws Exception
     */
    protected void prepareAppViews_xxtz()throws Exception {
    }
    /**
     * 准备应用视图[基础数据]
     * @throws Exception
     */
    protected void prepareAppViews_jcsj()throws Exception {
        registerAppView("1c361bfbe724397459229c74e442951e","OrgSectorPickupGridView","d887e3e480fb625c3212c269c9c46389","组织部门实体选择表格视图","jcsj",null,-1,-1);
        registerAppView("229a5bdc9a7a552628eab1e5479afa6b","OA_ZSKEditView","23ca0e86dab260da55738f278a2ec823","知识库编辑视图","jcsj",null,-1,-1);
        registerAppView("28293cbd6a6a4e67b5335e10478fa67c","OA_ZSKGridView","72e47fc1cd258239f1eade2260ee6a71","知识库表格视图","jcsj",null,-1,-1);
        registerAppView("3e92e13a3e2fac706aae35031bae8719","OrgUserPickupView","569d0fa67dc67a3981e9e995a711430c","组织人员实体数据选择视图","jcsj",null,-1,-1);
        registerAppView("5bee60195136b362d3e67c5f98643da3","OrgSectorPickupView","c28a54340a144b83ea001488ebcbe75f","组织部门实体数据选择视图","jcsj",null,-1,-1);
        registerAppView("6b7cbb8c8bb54fc01987d8245c96478e","OA_GZRZAngularGridView","FD185A2E-F269-4331-992A-6C48092F232D","工作日志","jcsj",null,-1,-1);
        registerAppView("dc056086eb2b00e6f8811286c90405fb","OrgUserPickupGridView","131b57e8be64d960856248f8651f9016","组织人员实体选择表格视图","jcsj",null,-1,-1);
        registerAppView("dcbb9e81c4e6bdfa264f1d413a1fd10d","OA_GZRZAngularEditView","0635B8DC-3D59-4E80-94DF-7AA02A6BD81B","工作日志","jcsj",null,-1,-1);
    }
    /**
     * 准备应用视图[工作流]
     * @throws Exception
     */
    protected void prepareAppViews_gzl()throws Exception {
        registerAppView("037cefb737718849113b16b0ac3c30fc","OA_GZRZRZTJLC_W_WFGridView","427638ea8ee74bdc75dfd4c851d2c310","工作日志工作流表格视图(日志提交流程)","gzl",null,-1,-1);
        registerAppView("328cb68a95b1755c87098371d5dc25b9","OA_GZRZRZTJLC_D_WFEditView3","97d900c6314094eaa459e6c3be894ff0","工作日志工作流视图(日志提交流程)","gzl",null,-1,-1);
        registerAppView("3ac6c4a3bf75c237bc83343647e57916","OA_GZRZRZTJLC_D20_WFGridView","0ebb74da4fa6807e5e355c514f51133e","工作日志工作流表格视图(日志提交流程:审核中)","gzl",null,-1,-1);
        registerAppView("46e6959105654091d6543d836dd0f5ea","OA_GZRZRZTJLC_D10_WFGridView","2667d6f1dce8d1dd9e0840a4c30eee22","工作日志工作流表格视图(日志提交流程:未提交)","gzl",null,-1,-1);
        registerAppView("710036572c790b44557ca0bac3000af0","OA_GZRZRZTJLC_W10_WFGridView","5c77b61e7f16030959b10f3d1c19709c","工作日志工作流表格视图(日志提交流程:部门领导审核)","gzl",null,-1,-1);
        registerAppView("964819e005e175d0525844a48c09d6a5","OA_GZRZRZTJLC_D_WFGridView","cfc00ac7de75741bc303277809d027ad","工作日志工作流表格视图(日志提交流程)","gzl",null,-1,-1);
        registerAppView("acf0be08600e195e53ce18ab151bbf47","OA_GZRZRZTJLC_WFExpView","13d1c4ba4c273f77cbe3c94834cd1709","工作日志工作流导航视图(日志提交流程)","gzl",null,-1,-1);
        registerAppView("bf02e3bd0ae103b9bcad4ed131437c36","OA_GZRZRZTJLC_D30_WFGridView","75b19211ba5b3bf870f40d436f4d4f1f","工作日志工作流表格视图(日志提交流程:已完成)","gzl",null,-1,-1);
        registerAppView("dba6d07761715379de84dddf685df9ae","OA_GZRZWFActionView","85882AFC-9C06-4F89-9AF1-F5FF66314DFB","工作日志","gzl","POPUPMODAL",-1,-1);
        registerAppView("ec9aa96a241e4747a993f7b11f03be84","OA_GZRZRZTJLC_W10_WFEditView3","4d2ca9d5d6327fd2e434439f3bdd61fa","工作日志工作流视图(日志提交流程v1:部门领导审核)","gzl",null,-1,-1);
        registerAppView("f92644cee97bcf18d6053fa5f35cf61a","OA_GZRZRZTJLC_W20_WFGridView","e97fdbcf10fcee8347bae8cc9d27bbcb","工作日志工作流表格视图(日志提交流程:承办处领导审核)","gzl",null,-1,-1);
    }
    /**
     * 准备应用视图[系统管理]
     * @throws Exception
     */
    protected void prepareAppViews_xtgl()throws Exception {
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.appmodel.AppModelBase#onInstallRTDatas()
     */
    @Override
    protected void onInstallRTDatas() throws Exception {
        super.onInstallRTDatas();

        //登记所有的门户界面
        net.ibizsys.psrt.srv.common.service.PortalPageService portalPageService  = (net.ibizsys.psrt.srv.common.service.PortalPageService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.PortalPageService.class);
        net.ibizsys.psrt.srv.common.service.PVPartService pvPartService  = (net.ibizsys.psrt.srv.common.service.PVPartService)ServiceGlobal.getService(net.ibizsys.psrt.srv.common.service.PVPartService.class);
        //创建门户视图 potal
        if(true) {
            net.ibizsys.psrt.srv.common.entity.PortalPage portalPage = new net.ibizsys.psrt.srv.common.entity.PortalPage();
            portalPage.setPortalPageId("BC4694BA-8403-433B-8361-F4FB2105B8B4");
            portalPage.setPortalPageName("门户视图");
            if(portalPageService.checkKey(portalPage)==IService.CHECKKEYSTATE_OK) {
                portalPageService.create(portalPage,false);
            } else {
                pvPartService.removeByPortalPage(portalPage);
            }
        }
    }
}