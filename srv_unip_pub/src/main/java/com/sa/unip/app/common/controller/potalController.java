/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import net.ibizsys.paas.appmodel.AppModelGlobal;
import net.ibizsys.paas.appmodel.IApplicationModel;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;
import net.ibizsys.paas.sysmodel.ISystemModel;
import net.ibizsys.paas.sysmodel.SysModelGlobal;
import net.ibizsys.paas.controller.ViewControllerGlobal;
import net.ibizsys.paas.ctrlmodel.ICtrlModel;
import net.ibizsys.paas.ctrlhandler.ICtrlHandler;


import com.sa.unip.srv.UniPSampleSysModel;
import com.sa.unip.app.appAppModel;


/**
 * 视图[potal]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/potal.do")
public class potalController extends net.ibizsys.paas.controller.AppPortalViewControllerBase {
    public potalController() throws Exception {
        super();
        this.setId("B61BDC9E-F03D-4429-BE62-9F8BFBAC659A");
        this.setCaption("门户视图");
        this.setTitle("门户视图");
        //
        this.setAttribute("UI.CTRL.DASHBOARD","TRUE");

        ViewControllerGlobal.registerViewController("/app/common/potal.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.potalController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();


    }

    private UniPSampleSysModel uniPSampleSysModel;

    public  UniPSampleSysModel getUniPSampleSysModel() {
        if(this.uniPSampleSysModel==null) {
            try {
                this.uniPSampleSysModel = (UniPSampleSysModel)SysModelGlobal.getSystem("com.sa.unip.srv.UniPSampleSysModel");
            } catch(Exception ex) {
            }
        }
        return this.uniPSampleSysModel;
    }

    @Override
    public  ISystemModel getSystemModel() {
        return this.getUniPSampleSysModel();
    }


    private appAppModel appAppModel;
    public  appAppModel getappAppModel() {
        if(this.appAppModel==null) {
            try {
                this.appAppModel = (appAppModel)AppModelGlobal.getApplication("com.sa.unip.app.appAppModel");
            } catch(Exception ex) {
            }
        }
        return this.appAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getappAppModel();
    }






    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 dashboard
        ICtrlModel dashboard=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlmodel.potalDashboardModel");
        dashboard.init(this);
        this.registerCtrlModel("dashboard",dashboard);
        //注册 db_myworklist
        ICtrlModel db_myworklist=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.sys.ctrlmodel.appMyWFWorkListPortletModel");
        db_myworklist.init(this);
        this.registerCtrlModel("db_myworklist",db_myworklist);
        //注册 db_myworklist_list
        ICtrlModel db_myworklist_list=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.wf.ctrlmodel.WFWorkListMyWorkListListModel");
        db_myworklist_list.init(this);
        this.registerCtrlModel("db_myworklist_list",db_myworklist_list);
        //注册 db_qxjtb
        ICtrlModel db_qxjtb=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.sys.ctrlmodel.appQXJTBPortletModel");
        db_qxjtb.init(this);
        this.registerCtrlModel("db_qxjtb",db_qxjtb);
        //注册 db_qxjtb_chart
        ICtrlModel db_qxjtb_chart=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_QXJQXJTBChartModel");
        db_qxjtb_chart.init(this);
        this.registerCtrlModel("db_qxjtb_chart",db_qxjtb_chart);
        //注册 db_ccsqtb
        ICtrlModel db_ccsqtb=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.sys.ctrlmodel.appCCSQTBPortletModel");
        db_ccsqtb.init(this);
        this.registerCtrlModel("db_ccsqtb",db_ccsqtb);
        //注册 db_ccsqtb_chart
        ICtrlModel db_ccsqtb_chart=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_CCSQCCSQTBChartModel");
        db_ccsqtb_chart.init(this);
        this.registerCtrlModel("db_ccsqtb_chart",db_ccsqtb_chart);
        //注册 db_tzgg
        ICtrlModel db_tzgg=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.sys.ctrlmodel.apptzggPortletModel");
        db_tzgg.init(this);
        this.registerCtrlModel("db_tzgg",db_tzgg);
        //注册 db_tzgg_list
        ICtrlModel db_tzgg_list=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.xxtz.ctrlmodel.OA_TZGGTZGG_MHListModel");
        db_tzgg_list.init(this);
        this.registerCtrlModel("db_tzgg_list",db_tzgg_list);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 dashboard
        ICtrlHandler dashboard = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.potalDashboardHandler");
        dashboard.init(this);
        this.registerCtrlHandler("dashboard",dashboard);
        //注册 db_myworklist
        ICtrlHandler db_myworklist = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.potalDb_myworklistHandler");
        db_myworklist.init(this);
        this.registerCtrlHandler("db_myworklist",db_myworklist);
        //注册 db_myworklist_list
        ICtrlHandler db_myworklist_list = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.potalDb_myworklist_listHandler");
        db_myworklist_list.init(this);
        this.registerCtrlHandler("db_myworklist_list",db_myworklist_list);
        //注册 db_qxjtb
        ICtrlHandler db_qxjtb = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.potalDb_qxjtbHandler");
        db_qxjtb.init(this);
        this.registerCtrlHandler("db_qxjtb",db_qxjtb);
        //注册 db_qxjtb_chart
        ICtrlHandler db_qxjtb_chart = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.potalDb_qxjtb_chartHandler");
        db_qxjtb_chart.init(this);
        this.registerCtrlHandler("db_qxjtb_chart",db_qxjtb_chart);
        //注册 db_ccsqtb
        ICtrlHandler db_ccsqtb = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.potalDb_ccsqtbHandler");
        db_ccsqtb.init(this);
        this.registerCtrlHandler("db_ccsqtb",db_ccsqtb);
        //注册 db_ccsqtb_chart
        ICtrlHandler db_ccsqtb_chart = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.potalDb_ccsqtb_chartHandler");
        db_ccsqtb_chart.init(this);
        this.registerCtrlHandler("db_ccsqtb_chart",db_ccsqtb_chart);
        //注册 db_tzgg
        ICtrlHandler db_tzgg = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.potalDb_tzggHandler");
        db_tzgg.init(this);
        this.registerCtrlHandler("db_tzgg",db_tzgg);
        //注册 db_tzgg_list
        ICtrlHandler db_tzgg_list = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.potalDb_tzgg_listHandler");
        db_tzgg_list.init(this);
        this.registerCtrlHandler("db_tzgg_list",db_tzgg_list);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}