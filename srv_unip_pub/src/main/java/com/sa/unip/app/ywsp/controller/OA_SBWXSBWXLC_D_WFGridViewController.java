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
 * 视图[OA_SBWXSBWXLC_D_WFGridView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/ywsp/OA_SBWXSBWXLC_D_WFGridView.do")
public class OA_SBWXSBWXLC_D_WFGridViewController extends net.ibizsys.pswf.controller.WFGridViewControllerBase {
    public OA_SBWXSBWXLC_D_WFGridViewController() throws Exception {
        super();
        this.setId("958de944e5c3adbf9fcbb238f725bd4f");
        this.setCaption("设备维修");
        this.setTitle("设备维修工作流表格视图(设备维修流程)");
        this.setCapLanResTag("DE.LNAME.OA_SBWX");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.GRID","TRUE");
        //
        this.setAttribute("UI.CTRL.SEARCHFORM","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");
        //支持搜常规索
        this.setAttribute("UI.ENABLESEARCH","TRUE");

        ViewControllerGlobal.registerViewController("/app/ywsp/OA_SBWXSBWXLC_D_WFGridView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.ywsp.controller.OA_SBWXSBWXLC_D_WFGridViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("EAF48546-27E1-44CE-BB9D-3660F92B6A39"));
        this.setDEWF(this.getDEModel().getDEWF("28AC6E5F-3454-4BA3-A263-E46338D036BB"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel oA_SBWXDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel getOA_SBWXDEModel() {
        if(this.oA_SBWXDEModel==null) {
            try {
                this.oA_SBWXDEModel = (com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_SBWXDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_SBWXDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_SBWXDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_SBWXService getOA_SBWXService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_SBWXService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_SBWXService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_SBWXService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 grid
        ICtrlModel grid=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_SBWXMainGridModel");
        grid.init(this);
        this.registerCtrlModel("grid",grid);
        //注册 searchform
        ICtrlModel searchForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_SBWXDefaultSearchFormModel");
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
        ICtrlHandler grid = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_SBWXSBWXLC_D_WFGridViewGridHandler");
        grid.init(this);
        this.registerCtrlHandler("grid",grid);
        //注册 searchform
        ICtrlHandler searchForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_SBWXSBWXLC_D_WFGridViewSearchFormHandler");
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