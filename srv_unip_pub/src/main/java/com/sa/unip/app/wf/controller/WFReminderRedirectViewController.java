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
 * 视图[WFReminderRedirectView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/wf/WFReminderRedirectView.do")
public class WFReminderRedirectViewController extends net.ibizsys.paas.controller.RedirectViewControllerBase {
    public WFReminderRedirectViewController() throws Exception {
        super();
        this.setId("17ee7e6fc17028281c56a686bd7f5235");
        this.setCaption("工作流工作催办");
        this.setTitle("工作流工作催办实体数据重定向视图");
        this.setAccessUserMode(2);

        ViewControllerGlobal.registerViewController("/app/wf/WFReminderRedirectView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.wf.controller.WFReminderRedirectViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();

        this.setEnableWorkflow(true);

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





    private net.ibizsys.psrt.srv.wf.demodel.WFReminderDEModel wFReminderDEModel;

    public  net.ibizsys.psrt.srv.wf.demodel.WFReminderDEModel getWFReminderDEModel() {
        if(this.wFReminderDEModel==null) {
            try {
                this.wFReminderDEModel = (net.ibizsys.psrt.srv.wf.demodel.WFReminderDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wf.demodel.WFReminderDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wFReminderDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getWFReminderDEModel();
    }

    public  net.ibizsys.psrt.srv.wf.service.WFReminderService getWFReminderService() {
        try {
            return (net.ibizsys.psrt.srv.wf.service.WFReminderService)ServiceGlobal.getService("net.ibizsys.psrt.srv.wf.service.WFReminderService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getWFReminderService();
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