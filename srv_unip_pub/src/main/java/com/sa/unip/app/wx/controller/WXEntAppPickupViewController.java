/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.wx.controller;

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
 * 视图[WXEntAppPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/wx/WXEntAppPickupView.do")
public class WXEntAppPickupViewController extends net.ibizsys.paas.controller.PickupViewControllerBase {
    public WXEntAppPickupViewController() throws Exception {
        super();
        this.setId("6583d2efe782e8f3e39b81abb15f5de2");
        this.setCaption("微信企业应用");
        this.setTitle("微信企业应用实体数据选择视图");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/wx/WXEntAppPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.wx.controller.WXEntAppPickupViewController",this);
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





    private net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel wXEntAppDEModel;

    public  net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel getWXEntAppDEModel() {
        if(this.wXEntAppDEModel==null) {
            try {
                this.wXEntAppDEModel = (net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wXEntAppDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getWXEntAppDEModel();
    }

    public  net.ibizsys.psrt.srv.wx.service.WXEntAppService getWXEntAppService() {
        try {
            return (net.ibizsys.psrt.srv.wx.service.WXEntAppService)ServiceGlobal.getService("net.ibizsys.psrt.srv.wx.service.WXEntAppService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getWXEntAppService();
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