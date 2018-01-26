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
 * 视图[OrgUserPickupView2]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/OrgUserPickupView2.do")
public class OrgUserPickupView2Controller extends net.ibizsys.paas.controller.PickupView2ControllerBase {
    public OrgUserPickupView2Controller() throws Exception {
        super();
        this.setId("d8289ec815db85bda1c13a1441c15a49");
        this.setCaption("组织人员");
        this.setTitle("组织人员实体数据选择视图（左右关系）");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");
        //
        this.setAttribute("UI.CTRL.TREEEXPBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/common/OrgUserPickupView2.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.OrgUserPickupView2Controller",this);
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





    private com.sa.unip.srv.subsys.demodel.OrgUserDEModel orgUserDEModel;

    public  com.sa.unip.srv.subsys.demodel.OrgUserDEModel getOrgUserDEModel() {
        if(this.orgUserDEModel==null) {
            try {
                this.orgUserDEModel = (com.sa.unip.srv.subsys.demodel.OrgUserDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.subsys.demodel.OrgUserDEModel");
            } catch(Exception ex) {
            }
        }
        return this.orgUserDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOrgUserDEModel();
    }

    public  com.sa.unip.srv.subsys.service.OrgUserService getOrgUserService() {
        try {
            return (com.sa.unip.srv.subsys.service.OrgUserService)ServiceGlobal.getService("com.sa.unip.srv.subsys.service.OrgUserService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOrgUserService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 treeexpbar
        ICtrlModel treeexpbar=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.common.ctrlmodel.OrgUsertreeexpbarTreeExpBarModel");
        treeexpbar.init(this);
        this.registerCtrlModel("treeexpbar",treeexpbar);
        //注册 treeexpbar_tree
        ICtrlModel treeexpbar_tree=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.common.ctrlmodel.OrgAllOrgTreeModel");
        treeexpbar_tree.init(this);
        this.registerCtrlModel("treeexpbar_tree",treeexpbar_tree);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 treeexpbar
        ICtrlHandler treeexpbar = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.OrgUserPickupView2TreeExpBarHandler");
        treeexpbar.init(this);
        this.registerCtrlHandler("treeexpbar",treeexpbar);
        //注册 treeexpbar_tree
        ICtrlHandler treeexpbar_tree = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.OrgUserPickupView2Treeexpbar_treeHandler");
        treeexpbar_tree.init(this);
        this.registerCtrlHandler("treeexpbar_tree",treeexpbar_tree);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}