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
 * 视图[OA_CCSQCCSQLC_WFExpView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/ywsp/OA_CCSQCCSQLC_WFExpView.do")
public class OA_CCSQCCSQLC_WFExpViewController extends net.ibizsys.pswf.controller.WFExpViewControllerBase {
    public OA_CCSQCCSQLC_WFExpViewController() throws Exception {
        super();
        this.setId("15f58e003c09382671b3f7d008686ce6");
        this.setCaption("出差申请");
        this.setTitle("出差申请工作流导航视图(出差申请流程)");
        this.setCapLanResTag("DE.LNAME.QA_CCSQ");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.EXPBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/ywsp/OA_CCSQCCSQLC_WFExpView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.ywsp.controller.OA_CCSQCCSQLC_WFExpViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("8E3B9638-79A4-4ED1-AFBD-1D87D5EFCC5F"));
        this.setDEWF(this.getDEModel().getDEWF("A9392098-5077-434E-A00E-4A4E1771CEA2"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel oA_CCSQDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel getOA_CCSQDEModel() {
        if(this.oA_CCSQDEModel==null) {
            try {
                this.oA_CCSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CCSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CCSQDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CCSQDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_CCSQService getOA_CCSQService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_CCSQService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CCSQService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CCSQService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 expbar
        ICtrlModel expBar=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_CCSQexpbarWFExpBarModel");
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
        ICtrlHandler expBar = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_CCSQCCSQLC_WFExpViewExpBarHandler");
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