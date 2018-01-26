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
 * 视图[WXMediaMPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/wx/WXMediaMPickupView.do")
public class WXMediaMPickupViewController extends net.ibizsys.paas.controller.MPickupViewControllerBase {
    public WXMediaMPickupViewController() throws Exception {
        super();
        this.setId("f909a976cd61e090f0cbe010e9ec19b1");
        this.setCaption("微信多媒体内容");
        this.setTitle("微信多媒体内容实体数据多项选择视图");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/wx/WXMediaMPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.wx.controller.WXMediaMPickupViewController",this);
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





    private net.ibizsys.psrt.srv.wx.demodel.WXMediaDEModel wXMediaDEModel;

    public  net.ibizsys.psrt.srv.wx.demodel.WXMediaDEModel getWXMediaDEModel() {
        if(this.wXMediaDEModel==null) {
            try {
                this.wXMediaDEModel = (net.ibizsys.psrt.srv.wx.demodel.WXMediaDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.wx.demodel.WXMediaDEModel");
            } catch(Exception ex) {
            }
        }
        return this.wXMediaDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getWXMediaDEModel();
    }

    public  net.ibizsys.psrt.srv.wx.service.WXMediaService getWXMediaService() {
        try {
            return (net.ibizsys.psrt.srv.wx.service.WXMediaService)ServiceGlobal.getService("net.ibizsys.psrt.srv.wx.service.WXMediaService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getWXMediaService();
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