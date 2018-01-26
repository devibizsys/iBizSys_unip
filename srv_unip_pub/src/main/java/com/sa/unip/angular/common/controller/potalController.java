/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.angular.common.controller;

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
import com.sa.unip.angular.AngularAppModel;


/**
 * 视图[potal]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/Angular/common/potal.do")
public class potalController extends net.ibizsys.paas.controller.AppPortalViewControllerBase {
    public potalController() throws Exception {
        super();
        this.setId("BC4694BA-8403-433B-8361-F4FB2105B8B4");
        this.setCaption("");
        this.setTitle("门户视图");
        this.setAccessUserMode(3);
        //
        this.setAttribute("UI.CTRL.DASHBOARD","TRUE");

        ViewControllerGlobal.registerViewController("/Angular/common/potal.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.angular.common.controller.potalController",this);
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


    private AngularAppModel angularAppModel;
    public  AngularAppModel getAngularAppModel() {
        if(this.angularAppModel==null) {
            try {
                this.angularAppModel = (AngularAppModel)AppModelGlobal.getApplication("com.sa.unip.angular.AngularAppModel");
            } catch(Exception ex) {
            }
        }
        return this.angularAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getAngularAppModel();
    }






    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 dashboard
        ICtrlModel dashboard=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.angular.common.ctrlmodel.potalDashboardModel");
        dashboard.init(this);
        this.registerCtrlModel("dashboard",dashboard);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 dashboard
        ICtrlHandler dashboard = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.angular.common.ctrlhandler.potalDashboardHandler");
        dashboard.init(this);
        this.registerCtrlHandler("dashboard",dashboard);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}