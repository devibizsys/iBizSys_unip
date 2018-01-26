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
 * 视图[UserObjectIndexPickupDataView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/UserObjectIndexPickupDataView.do")
public class UserObjectIndexPickupDataViewController extends net.ibizsys.paas.controller.IndexPickupDataViewControllerBase {
    public UserObjectIndexPickupDataViewController() throws Exception {
        super();
        this.setId("ef9a3713278a678734e34f0b4cbbed54");
        this.setCaption("用户对象");
        this.setTitle("用户对象实体索引关系选择数据视图（dataview）");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.DATAVIEW","TRUE");

        ViewControllerGlobal.registerViewController("/app/common/UserObjectIndexPickupDataView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.UserObjectIndexPickupDataViewController",this);
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





    private net.ibizsys.psrt.srv.common.demodel.UserObjectDEModel userObjectDEModel;

    public  net.ibizsys.psrt.srv.common.demodel.UserObjectDEModel getUserObjectDEModel() {
        if(this.userObjectDEModel==null) {
            try {
                this.userObjectDEModel = (net.ibizsys.psrt.srv.common.demodel.UserObjectDEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.UserObjectDEModel");
            } catch(Exception ex) {
            }
        }
        return this.userObjectDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getUserObjectDEModel();
    }

    public  net.ibizsys.psrt.srv.common.service.UserObjectService getUserObjectService() {
        try {
            return (net.ibizsys.psrt.srv.common.service.UserObjectService)ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.UserObjectService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getUserObjectService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 dataview
        ICtrlModel dataView=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.common.ctrlmodel.UserObjectIndexTypeDataViewModel");
        dataView.init(this);
        this.registerCtrlModel("dataview",dataView);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 dataview
        ICtrlHandler dataView = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.common.ctrlhandler.UserObjectIndexPickupDataViewDataViewHandler");
        dataView.init(this);
        this.registerCtrlHandler("dataview",dataView);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}