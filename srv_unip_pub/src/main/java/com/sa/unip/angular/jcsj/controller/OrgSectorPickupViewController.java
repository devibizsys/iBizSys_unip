/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.angular.jcsj.controller;

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
import com.sa.unip.angular.AngularAppModel;


/**
 * 视图[OrgSectorPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/Angular/jcsj/OrgSectorPickupView.do")
public class OrgSectorPickupViewController extends net.ibizsys.paas.controller.PickupViewControllerBase {
    public OrgSectorPickupViewController() throws Exception {
        super();
        this.setId("5bee60195136b362d3e67c5f98643da3");
        this.setCaption("组织部门");
        this.setTitle("组织部门实体数据选择视图");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/Angular/jcsj/OrgSectorPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.angular.jcsj.controller.OrgSectorPickupViewController",this);
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


    private AngularAppModel angularAppModel;
    public  AngularAppModel getAngularAppModel() {
        if(this.angularAppModel==null) {
            try {
                this.angularAppModel = (AngularAppModel)AppModelGlobal.getApplication("com.sa.unip.angular.AngularAppModel");
            } catch(Exception ex) {
            }
        }
        return this.angularAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getAngularAppModel();
    }





    private com.sa.unip.srv.subsys.demodel.OrgSectorDEModel orgSectorDEModel;

    public  com.sa.unip.srv.subsys.demodel.OrgSectorDEModel getOrgSectorDEModel() {
        if(this.orgSectorDEModel==null) {
            try {
                this.orgSectorDEModel = (com.sa.unip.srv.subsys.demodel.OrgSectorDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.OrgSectorDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgSectorDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOrgSectorDEModel();
    }

    public  com.sa.unip.srv.subsys.service.OrgSectorService getOrgSectorService() {
        try {
            return (com.sa.unip.srv.subsys.service.OrgSectorService)ServiceGlobal.getService("com.sa.unip.srv.subsys.service.OrgSectorService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOrgSectorService();
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