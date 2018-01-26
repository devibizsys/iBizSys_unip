/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.cg.controller;

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
import com.sa.unip.ionicapp.IonicAppAppModel;


/**
 * 视图[worklog]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/cg/worklog.do")
public class worklogController extends net.ibizsys.paas.controller.AppPortalViewControllerBase {
    public worklogController() throws Exception {
        super();
        this.setId("9F4F30B6-C2E0-4E1B-A8AD-259D3BDB6B0A");
        this.setCaption("");
        this.setTitle("工作日志");
        //
        this.setAttribute("UI.CTRL.DASHBOARD","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/cg/worklog.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.cg.controller.worklogController",this);
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


    private IonicAppAppModel ionicAppAppModel;
    public  IonicAppAppModel getIonicAppAppModel() {
        if(this.ionicAppAppModel==null) {
            try {
                this.ionicAppAppModel = (IonicAppAppModel)AppModelGlobal.getApplication("com.sa.unip.ionicapp.IonicAppAppModel");
            } catch(Exception ex) {
            }
        }
        return this.ionicAppAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getIonicAppAppModel();
    }






    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 dashboard
        ICtrlModel dashboard=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlmodel.worklogDashboardModel");
        dashboard.init(this);
        this.registerCtrlModel("dashboard",dashboard);
        //注册 db_worklog
        ICtrlModel db_worklog=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppWordLogPortletModel");
        db_worklog.init(this);
        this.registerCtrlModel("db_worklog",db_worklog);
        //注册 db_worklog_appmenu
        ICtrlModel db_worklog_appmenu=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppWordLogAppMenuModel");
        db_worklog_appmenu.init(this);
        this.registerCtrlModel("db_worklog_appmenu",db_worklog_appmenu);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 dashboard
        ICtrlHandler dashboard = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.worklogDashboardHandler");
        dashboard.init(this);
        this.registerCtrlHandler("dashboard",dashboard);
        //注册 db_worklog
        ICtrlHandler db_worklog = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.worklogDb_worklogHandler");
        db_worklog.init(this);
        this.registerCtrlHandler("db_worklog",db_worklog);
        //注册 db_worklog_appmenu
        ICtrlHandler db_worklog_appmenu = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.worklogDb_worklog_appmenuHandler");
        db_worklog_appmenu.init(this);
        this.registerCtrlHandler("db_worklog_appmenu",db_worklog_appmenu);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}