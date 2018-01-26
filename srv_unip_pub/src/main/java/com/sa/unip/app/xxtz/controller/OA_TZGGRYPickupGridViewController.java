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
 * 视图[OA_TZGGRYPickupGridView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/xxtz/OA_TZGGRYPickupGridView.do")
public class OA_TZGGRYPickupGridViewController extends net.ibizsys.paas.controller.PickupGridViewControllerBase {
    public OA_TZGGRYPickupGridViewController() throws Exception {
        super();
        this.setId("a1f912a6df0ea687f49a0e5077047e22");
        this.setCaption("通知公告人员");
        this.setTitle("通知公告人员选择表格视图");
        this.setCapLanResTag("DE.LNAME.OA_GGTZRY");
        this.setTitleLanResTag("PAGE.TITLE.OA_TZGGRY.PICKUPGRIDVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.GRID","TRUE");
        //
        this.setAttribute("UI.CTRL.SEARCHFORM","TRUE");
        //支持搜常规索
        this.setAttribute("UI.ENABLESEARCH","TRUE");

        ViewControllerGlobal.registerViewController("/app/xxtz/OA_TZGGRYPickupGridView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.xxtz.controller.OA_TZGGRYPickupGridViewController",this);
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





    private com.sa.unip.srv.xxtz.demodel.OA_TZGGRYDEModel oA_TZGGRYDEModel;

    public  com.sa.unip.srv.xxtz.demodel.OA_TZGGRYDEModel getOA_TZGGRYDEModel() {
        if(this.oA_TZGGRYDEModel==null) {
            try {
                this.oA_TZGGRYDEModel = (com.sa.unip.srv.xxtz.demodel.OA_TZGGRYDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.OA_TZGGRYDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_TZGGRYDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_TZGGRYDEModel();
    }

    public  com.sa.unip.srv.xxtz.service.OA_TZGGRYService getOA_TZGGRYService() {
        try {
            return (com.sa.unip.srv.xxtz.service.OA_TZGGRYService)ServiceGlobal.getService("com.sa.unip.srv.xxtz.service.OA_TZGGRYService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_TZGGRYService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 grid
        ICtrlModel grid=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.xxtz.ctrlmodel.OA_TZGGRYMainGridModel");
        grid.init(this);
        this.registerCtrlModel("grid",grid);
        //注册 searchform
        ICtrlModel searchForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.xxtz.ctrlmodel.OA_TZGGRYDefaultSearchFormModel");
        searchForm.init(this);
        this.registerCtrlModel("searchform",searchForm);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 grid
        ICtrlHandler grid = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.xxtz.ctrlhandler.OA_TZGGRYPickupGridViewGridHandler");
        grid.init(this);
        this.registerCtrlHandler("grid",grid);
        //注册 searchform
        ICtrlHandler searchForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.xxtz.ctrlhandler.OA_TZGGRYPickupGridViewSearchFormHandler");
        searchForm.init(this);
        this.registerCtrlHandler("searchform",searchForm);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}