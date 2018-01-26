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
 * 视图[sp]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/cg/sp.do")
public class spController extends net.ibizsys.paas.controller.AppPortalViewControllerBase {
    public spController() throws Exception {
        super();
        this.setId("C50A2E7E-9E7D-4894-B356-C21EAE081EB5");
        this.setCaption("");
        this.setTitle("审批");
        //
        this.setAttribute("UI.CTRL.DASHBOARD","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/cg/sp.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.cg.controller.spController",this);
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
        ICtrlModel dashboard=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlmodel.spDashboardModel");
        dashboard.init(this);
        this.registerCtrlModel("dashboard",dashboard);
        //注册 db_sp
        ICtrlModel db_sp=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppSPPortletModel");
        db_sp.init(this);
        this.registerCtrlModel("db_sp",db_sp);
        //注册 db_sp_appmenu
        ICtrlModel db_sp_appmenu=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppSPAppMenuModel");
        db_sp_appmenu.init(this);
        this.registerCtrlModel("db_sp_appmenu",db_sp_appmenu);
        //注册 db_sphead
        ICtrlModel db_sphead=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppSPheadPortletModel");
        db_sphead.init(this);
        this.registerCtrlModel("db_sphead",db_sphead);
        //注册 db_sphead_appmenu
        ICtrlModel db_sphead_appmenu=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppSPheadAppMenuModel");
        db_sphead_appmenu.init(this);
        this.registerCtrlModel("db_sphead_appmenu",db_sphead_appmenu);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 dashboard
        ICtrlHandler dashboard = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.spDashboardHandler");
        dashboard.init(this);
        this.registerCtrlHandler("dashboard",dashboard);
        //注册 db_sp
        ICtrlHandler db_sp = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.spDb_spHandler");
        db_sp.init(this);
        this.registerCtrlHandler("db_sp",db_sp);
        //注册 db_sp_appmenu
        ICtrlHandler db_sp_appmenu = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.spDb_sp_appmenuHandler");
        db_sp_appmenu.init(this);
        this.registerCtrlHandler("db_sp_appmenu",db_sp_appmenu);
        //注册 db_sphead
        ICtrlHandler db_sphead = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.spDb_spheadHandler");
        db_sphead.init(this);
        this.registerCtrlHandler("db_sphead",db_sphead);
        //注册 db_sphead_appmenu
        ICtrlHandler db_sphead_appmenu = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.spDb_sphead_appmenuHandler");
        db_sphead_appmenu.init(this);
        this.registerCtrlHandler("db_sphead_appmenu",db_sphead_appmenu);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}