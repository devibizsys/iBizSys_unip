/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.common.controller;

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
 * 视图[MsgAccountRedirectView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/MsgAccountRedirectView.do")
public class MsgAccountRedirectViewController extends net.ibizsys.paas.controller.RedirectViewControllerBase {
    public MsgAccountRedirectViewController() throws Exception {
        super();
        this.setId("d0953ee90ab9d889f1fe8c4d5d8fd8d4");
        this.setCaption("消息账户");
        this.setTitle("消息账户实体数据重定向视图");
        this.setAccessUserMode(2);

        ViewControllerGlobal.registerViewController("/app/common/MsgAccountRedirectView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.MsgAccountRedirectViewController",this);
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





    private net.ibizsys.psrt.srv.common.demodel.MsgAccountDEModel msgAccountDEModel;

    public  net.ibizsys.psrt.srv.common.demodel.MsgAccountDEModel getMsgAccountDEModel() {
        if(this.msgAccountDEModel==null) {
            try {
                this.msgAccountDEModel = (net.ibizsys.psrt.srv.common.demodel.MsgAccountDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.MsgAccountDEModel");
            } catch(Exception ex) {
            }
        }
        return this.msgAccountDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getMsgAccountDEModel();
    }

    public  net.ibizsys.psrt.srv.common.service.MsgAccountService getMsgAccountService() {
        try {
            return (net.ibizsys.psrt.srv.common.service.MsgAccountService)ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.MsgAccountService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getMsgAccountService();
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