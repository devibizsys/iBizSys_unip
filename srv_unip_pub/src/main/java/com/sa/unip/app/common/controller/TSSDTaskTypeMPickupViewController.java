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
 * 视图[TSSDTaskTypeMPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/TSSDTaskTypeMPickupView.do")
public class TSSDTaskTypeMPickupViewController extends net.ibizsys.paas.controller.MPickupViewControllerBase {
    public TSSDTaskTypeMPickupViewController() throws Exception {
        super();
        this.setId("f0c425aa36bd3befc42c795432dd6d0e");
        this.setCaption("任务调度任务类型");
        this.setTitle("任务调度任务类型实体数据多项选择视图");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/app/common/TSSDTaskTypeMPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.TSSDTaskTypeMPickupViewController",this);
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





    private net.ibizsys.psrt.srv.common.demodel.TSSDTaskTypeDEModel tSSDTaskTypeDEModel;

    public  net.ibizsys.psrt.srv.common.demodel.TSSDTaskTypeDEModel getTSSDTaskTypeDEModel() {
        if(this.tSSDTaskTypeDEModel==null) {
            try {
                this.tSSDTaskTypeDEModel = (net.ibizsys.psrt.srv.common.demodel.TSSDTaskTypeDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.TSSDTaskTypeDEModel");
            } catch(Exception ex) {
            }
        }
        return this.tSSDTaskTypeDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getTSSDTaskTypeDEModel();
    }

    public  net.ibizsys.psrt.srv.common.service.TSSDTaskTypeService getTSSDTaskTypeService() {
        try {
            return (net.ibizsys.psrt.srv.common.service.TSSDTaskTypeService)ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.TSSDTaskTypeService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getTSSDTaskTypeService();
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