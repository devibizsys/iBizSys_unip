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
 * 视图[OA_FLFGPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/jcsj/OA_FLFGPickupView.do")
public class OA_FLFGPickupViewController extends net.ibizsys.paas.controller.PickupViewControllerBase {
    public OA_FLFGPickupViewController() throws Exception {
        super();
        this.setId("e8dc04ed3cefb31c30013b476709dccd");
        this.setCaption("法律法规");
        this.setTitle("法律法规数据选择视图");
        this.setCapLanResTag("DE.LNAME.OA_FLFG");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/jcsj/OA_FLFGPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.jcsj.controller.OA_FLFGPickupViewController",this);
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





    private com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel oA_FLFGDEModel;

    public  com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel getOA_FLFGDEModel() {
        if(this.oA_FLFGDEModel==null) {
            try {
                this.oA_FLFGDEModel = (com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_FLFGDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_FLFGDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_FLFGDEModel();
    }

    public  com.sa.unip.srv.jcsj.service.OA_FLFGService getOA_FLFGService() {
        try {
            return (com.sa.unip.srv.jcsj.service.OA_FLFGService)ServiceGlobal.getService("com.sa.unip.srv.jcsj.service.OA_FLFGService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_FLFGService();
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