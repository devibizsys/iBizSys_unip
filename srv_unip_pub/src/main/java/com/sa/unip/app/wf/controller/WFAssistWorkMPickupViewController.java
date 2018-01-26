/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.wf.controller;

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
 * 视图[WFAssistWorkMPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/wf/WFAssistWorkMPickupView.do")
public class WFAssistWorkMPickupViewController extends net.ibizsys.paas.controller.MPickupViewControllerBase {
    public WFAssistWorkMPickupViewController() throws Exception {
        super();
        this.setId("2b8f61c08709533499f1289531332658");
        this.setCaption("工作流代办工作");
        this.setTitle("工作流代办工作实体数据多项选择视图");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/wf/WFAssistWorkMPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.wf.controller.WFAssistWorkMPickupViewController",this);
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





    private net.ibizsys.psrt.srv.wf.demodel.WFAssistWorkDEModel wFAssistWorkDEModel;

    public  net.ibizsys.psrt.srv.wf.demodel.WFAssistWorkDEModel getWFAssistWorkDEModel() {
        if(this.wFAssistWorkDEModel==null) {
            try {
                this.wFAssistWorkDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFAssistWorkDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFAssistWorkDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFAssistWorkDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getWFAssistWorkDEModel();
    }

    public  net.ibizsys.psrt.srv.wf.service.WFAssistWorkService getWFAssistWorkService() {
        try {
            return (net.ibizsys.psrt.srv.wf.service.WFAssistWorkService)ServiceGlobal.getService("net.ibizsys.psrt.srv.wf.service.WFAssistWorkService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getWFAssistWorkService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}