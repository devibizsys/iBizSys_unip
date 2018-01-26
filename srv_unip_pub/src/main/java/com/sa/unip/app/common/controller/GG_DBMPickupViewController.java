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
 * 视图[GG_DBMPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/GG_DBMPickupView.do")
public class GG_DBMPickupViewController extends net.ibizsys.paas.controller.MPickupViewControllerBase {
    public GG_DBMPickupViewController() throws Exception {
        super();
        this.setId("ceebd7e9e375ee8135c9ba6e195ff60b");
        this.setCaption("待办");
        this.setTitle("待办数据多项选择视图");
        this.setCapLanResTag("DE.LNAME.GG_DB");
        this.setTitleLanResTag("PAGE.TITLE.GG_DB.MPICKUPVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/common/GG_DBMPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.GG_DBMPickupViewController",this);
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





    private com.sa.unip.srv.ggsj.demodel.GG_DBDEModel gG_DBDEModel;

    public  com.sa.unip.srv.ggsj.demodel.GG_DBDEModel getGG_DBDEModel() {
        if(this.gG_DBDEModel==null) {
            try {
                this.gG_DBDEModel = (com.sa.unip.srv.ggsj.demodel.GG_DBDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ggsj.demodel.GG_DBDEModel");
            } catch(Exception ex) {
            }
        }
        return this.gG_DBDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getGG_DBDEModel();
    }

    public  com.sa.unip.srv.ggsj.service.GG_DBService getGG_DBService() {
        try {
            return (com.sa.unip.srv.ggsj.service.GG_DBService)ServiceGlobal.getService("com.sa.unip.srv.ggsj.service.GG_DBService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getGG_DBService();
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