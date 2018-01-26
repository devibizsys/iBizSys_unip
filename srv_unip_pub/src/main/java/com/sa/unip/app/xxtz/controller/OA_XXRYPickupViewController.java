/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.xxtz.controller;

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
 * 视图[OA_XXRYPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/xxtz/OA_XXRYPickupView.do")
public class OA_XXRYPickupViewController extends net.ibizsys.paas.controller.PickupViewControllerBase {
    public OA_XXRYPickupViewController() throws Exception {
        super();
        this.setId("b9b650c6431e9f6f9d318d09f3e7a95d");
        this.setCaption("消息人员");
        this.setTitle("消息人员数据选择视图");
        this.setCapLanResTag("DE.LNAME.OA_XXRY");
        this.setTitleLanResTag("PAGE.TITLE.OA_XXRY.PICKUPVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/xxtz/OA_XXRYPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.xxtz.controller.OA_XXRYPickupViewController",this);
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





    private com.sa.unip.srv.xxtz.demodel.OA_XXRYDEModel oA_XXRYDEModel;

    public  com.sa.unip.srv.xxtz.demodel.OA_XXRYDEModel getOA_XXRYDEModel() {
        if(this.oA_XXRYDEModel==null) {
            try {
                this.oA_XXRYDEModel = (com.sa.unip.srv.xxtz.demodel.OA_XXRYDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.OA_XXRYDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_XXRYDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_XXRYDEModel();
    }

    public  com.sa.unip.srv.xxtz.service.OA_XXRYService getOA_XXRYService() {
        try {
            return (com.sa.unip.srv.xxtz.service.OA_XXRYService)ServiceGlobal.getService("com.sa.unip.srv.xxtz.service.OA_XXRYService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_XXRYService();
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