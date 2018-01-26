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
 * 视图[mywork]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/cg/mywork.do")
public class myworkController extends net.ibizsys.paas.controller.AppPortalViewControllerBase {
    public myworkController() throws Exception {
        super();
        this.setId("30BD6B20-4E74-48D3-8CBB-E6E1D2EF5C96");
        this.setCaption("移动办公辅助系统");
        this.setTitle("移动办公辅助系统");
        //
        this.setAttribute("UI.CTRL.DASHBOARD","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/cg/mywork.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.cg.controller.myworkController",this);
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
        ICtrlModel dashboard=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlmodel.myworkDashboardModel");
        dashboard.init(this);
        this.registerCtrlModel("dashboard",dashboard);
        //注册 db_appmenu
        ICtrlModel db_appmenu=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppAppMenuPortletModel");
        db_appmenu.init(this);
        this.registerCtrlModel("db_appmenu",db_appmenu);
        //注册 db_appmenu_appmenu
        ICtrlModel db_appmenu_appmenu=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.sys.ctrlmodel.IonicAppAppMenuAppMenuModel");
        db_appmenu_appmenu.init(this);
        this.registerCtrlModel("db_appmenu_appmenu",db_appmenu_appmenu);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 dashboard
        ICtrlHandler dashboard = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.myworkDashboardHandler");
        dashboard.init(this);
        this.registerCtrlHandler("dashboard",dashboard);
        //注册 db_appmenu
        ICtrlHandler db_appmenu = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.myworkDb_appmenuHandler");
        db_appmenu.init(this);
        this.registerCtrlHandler("db_appmenu",db_appmenu);
        //注册 db_appmenu_appmenu
        ICtrlHandler db_appmenu_appmenu = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.myworkDb_appmenu_appmenuHandler");
        db_appmenu_appmenu.init(this);
        this.registerCtrlHandler("db_appmenu_appmenu",db_appmenu_appmenu);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}