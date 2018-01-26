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
 * 视图[OA_CGSQCGSQLC_D_WFEditView3]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/ywsp/OA_CGSQCGSQLC_D_WFEditView3.do")
public class OA_CGSQCGSQLC_D_WFEditView3Controller extends net.ibizsys.pswf.controller.WFEditView3ControllerBase {
    public OA_CGSQCGSQLC_D_WFEditView3Controller() throws Exception {
        super();
        this.setId("0bb6ab14684f1c47bb7e5f2f87739cee");
        this.setCaption("采购申请");
        this.setTitle("采购申请工作流视图(采购申请流程)");
        this.setCapLanResTag("DE.LNAME.OA_CGSQ");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.DRTAB","TRUE");
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/ywsp/OA_CGSQCGSQLC_D_WFEditView3.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.ywsp.controller.OA_CGSQCGSQLC_D_WFEditView3Controller",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("BE228F3D-0F19-4980-8CA4-067074612E69"));
        this.setDEWF(this.getDEModel().getDEWF("9F574D2F-51AC-4A3A-9951-29C496825BF9"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_CGSQDEModel oA_CGSQDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_CGSQDEModel getOA_CGSQDEModel() {
        if(this.oA_CGSQDEModel==null) {
            try {
                this.oA_CGSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CGSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CGSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CGSQDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CGSQDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_CGSQService getOA_CGSQService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_CGSQService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CGSQService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CGSQService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 drtab
        ICtrlModel drTab=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_CGSQCGSQLCDRDRTabModel");
        drTab.init(this);
        this.registerCtrlModel("drtab",drTab);
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_CGSQMainEditFormModel");
        editForm.init(this);
        this.registerCtrlModel("form",editForm);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 drtab
        ICtrlHandler drTab = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_CGSQCGSQLC_D_WFEditView3DRTabHandler");
        drTab.init(this);
        this.registerCtrlHandler("drtab",drTab);
        //注册 form
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_CGSQCGSQLC_D_WFEditView3EditFormHandler");
        editForm.init(this);
        this.registerCtrlHandler("form",editForm);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}