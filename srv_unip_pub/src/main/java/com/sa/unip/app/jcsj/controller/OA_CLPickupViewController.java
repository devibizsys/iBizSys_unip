/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.jcsj.controller;

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
 * 视图[OA_CLPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/jcsj/OA_CLPickupView.do")
public class OA_CLPickupViewController extends net.ibizsys.paas.controller.PickupViewControllerBase {
    public OA_CLPickupViewController() throws Exception {
        super();
        this.setId("b79c7f454fb8fc47429119c59584d814");
        this.setCaption("车辆");
        this.setTitle("车辆数据选择视图");
        this.setCapLanResTag("DE.LNAME.OA_CL");
        this.setTitleLanResTag("PAGE.TITLE.OA_CL.PICKUPVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/jcsj/OA_CLPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.jcsj.controller.OA_CLPickupViewController",this);
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





    private com.sa.unip.srv.jcsj.demodel.OA_CLDEModel oA_CLDEModel;

    public  com.sa.unip.srv.jcsj.demodel.OA_CLDEModel getOA_CLDEModel() {
        if(this.oA_CLDEModel==null) {
            try {
                this.oA_CLDEModel = (com.sa.unip.srv.jcsj.demodel.OA_CLDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_CLDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CLDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CLDEModel();
    }

    public  com.sa.unip.srv.jcsj.service.OA_CLService getOA_CLService() {
        try {
            return (com.sa.unip.srv.jcsj.service.OA_CLService)ServiceGlobal.getService("com.sa.unip.srv.jcsj.service.OA_CLService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CLService();
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