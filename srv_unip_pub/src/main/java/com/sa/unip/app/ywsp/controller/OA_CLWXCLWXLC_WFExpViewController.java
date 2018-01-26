/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.ywsp.controller;

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
 * 视图[OA_CLWXCLWXLC_WFExpView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/ywsp/OA_CLWXCLWXLC_WFExpView.do")
public class OA_CLWXCLWXLC_WFExpViewController extends net.ibizsys.pswf.controller.WFExpViewControllerBase {
    public OA_CLWXCLWXLC_WFExpViewController() throws Exception {
        super();
        this.setId("1aac187860a5b991d9291bb8054f4ed4");
        this.setCaption("车辆维修");
        this.setTitle("车辆维修工作流导航视图(车辆维修流程)");
        this.setCapLanResTag("DE.LNAME.OA_CLWX");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.EXPBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/ywsp/OA_CLWXCLWXLC_WFExpView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.ywsp.controller.OA_CLWXCLWXLC_WFExpViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("F0924354-0FAF-4863-BAF3-7438CB558E48"));
        this.setDEWF(this.getDEModel().getDEWF("CB92693E-A0D2-48C2-946B-E1272A46D2BB"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel oA_CLWXDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel getOA_CLWXDEModel() {
        if(this.oA_CLWXDEModel==null) {
            try {
                this.oA_CLWXDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CLWXDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CLWXDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CLWXDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_CLWXService getOA_CLWXService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_CLWXService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CLWXService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CLWXService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 expbar
        ICtrlModel expBar=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_CLWXexpbarWFExpBarModel");
        expBar.init(this);
        this.registerCtrlModel("expbar",expBar);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 expbar
        ICtrlHandler expBar = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_CLWXCLWXLC_WFExpViewExpBarHandler");
        expBar.init(this);
        this.registerCtrlHandler("expbar",expBar);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}