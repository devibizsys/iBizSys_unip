/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.tygz.controller;

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
 * 视图[IndexView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/tygz/IndexView.do")
public class IndexViewController extends net.ibizsys.paas.controller.AppIndexViewControllerBase {
    public IndexViewController() throws Exception {
        super();
        this.setId("B172156F-4EFD-4C81-8A8A-4ECED3760538");
        this.setCaption("办公系统");
        this.setTitle("办公系统");
        this.setCapLanResTag("PAGE.CAPTION.APP.INDEXVIEW");
        this.setTitleLanResTag("PAGE.TITLE.APP.INDEXVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.APPMENU","TRUE");

        ViewControllerGlobal.registerViewController("/app/tygz/IndexView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.tygz.controller.IndexViewController",this);
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
        //注册 appmenu
        ICtrlModel appMenu=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.sys.ctrlmodel.appDefaultAppMenuModel");
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
        ICtrlHandler appMenu = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.tygz.ctrlhandler.IndexViewAppMenuHandler");
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