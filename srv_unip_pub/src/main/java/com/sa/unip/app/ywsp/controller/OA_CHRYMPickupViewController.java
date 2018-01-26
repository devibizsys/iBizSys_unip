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
 * 视图[OA_CHRYMPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/ywsp/OA_CHRYMPickupView.do")
public class OA_CHRYMPickupViewController extends net.ibizsys.paas.controller.MPickupViewControllerBase {
    public OA_CHRYMPickupViewController() throws Exception {
        super();
        this.setId("a4539ade7cb3ac775645c26e8601eb09");
        this.setCaption("参会人员");
        this.setTitle("参会人员数据多项选择视图");
        this.setCapLanResTag("DE.LNAME.OA_CHRY");
        this.setTitleLanResTag("PAGE.TITLE.OA_CHRY.MPICKUPVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/ywsp/OA_CHRYMPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.ywsp.controller.OA_CHRYMPickupViewController",this);
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





    private com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel oA_CHRYDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel getOA_CHRYDEModel() {
        if(this.oA_CHRYDEModel==null) {
            try {
                this.oA_CHRYDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CHRYDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CHRYDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_CHRYService getOA_CHRYService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_CHRYService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CHRYService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CHRYService();
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