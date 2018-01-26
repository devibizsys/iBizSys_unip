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
 * 视图[IndexView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/Angular/common/IndexView.do")
public class IndexViewController extends net.ibizsys.paas.controller.AppIndexViewControllerBase {
    public IndexViewController() throws Exception {
        super();
        this.setId("53594A97-CA1B-43BD-9E33-912E88FDDB85");
        this.setCaption("首页");
        this.setTitle("");
        this.setAccessUserMode(3);
        //
        this.setAttribute("UI.CTRL.APPMENU","TRUE");

        ViewControllerGlobal.registerViewController("/Angular/common/IndexView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.angular.common.controller.IndexViewController",this);
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
        //注册 appmenu
        ICtrlModel appMenu=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.angular.srv.sys.ctrlmodel.AngularDefaultAppMenuModel");
        appMenu.init(this);
        this.registerCtrlModel("appmenu",appMenu);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 appmenu
        ICtrlHandler appMenu = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.angular.common.ctrlhandler.IndexViewAppMenuHandler");
        appMenu.init(this);
        this.registerCtrlHandler("appmenu",appMenu);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}