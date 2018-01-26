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
 * 视图[OA_PCSQEditView2]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/ywsp/OA_PCSQEditView2.do")
public class OA_PCSQEditView2Controller extends net.ibizsys.pswf.controller.EditView2ControllerBase {
    public OA_PCSQEditView2Controller() throws Exception {
        super();
        this.setId("8aebfc5ce2d11251fd1518864acaf20b");
        this.setCaption("派车申请");
        this.setTitle("派车申请编辑视图");
        this.setCapLanResTag("DE.LNAME.OA_PCSQ");
        this.setTitleLanResTag("PAGE.TITLE.OA_PCSQ.EDITVIEW2");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.DRBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/ywsp/OA_PCSQEditView2.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.ywsp.controller.OA_PCSQEditView2Controller",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("AAD2F165-1BC4-477E-8C47-35E7AF46BBDD"));
        this.setDEWF(this.getDEModel().getDEWF("72C85E0B-B7DB-4D24-A23E-7E2FFE6D300C"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel oA_PCSQDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel getOA_PCSQDEModel() {
        if(this.oA_PCSQDEModel==null) {
            try {
                this.oA_PCSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_PCSQDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_PCSQDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_PCSQService getOA_PCSQService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_PCSQService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_PCSQService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_PCSQService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_PCSQMainEditFormModel");
        editForm.init(this);
        this.registerCtrlModel("form",editForm);
        //注册 drbar
        ICtrlModel drBar=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_PCSQDefaultDRBarModel");
        drBar.init(this);
        this.registerCtrlModel("drbar",drBar);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 form
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_PCSQEditView2EditFormHandler");
        editForm.init(this);
        this.registerCtrlHandler("form",editForm);
        //注册 drbar
        ICtrlHandler drBar = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_PCSQEditView2DRBarHandler");
        drBar.init(this);
        this.registerCtrlHandler("drbar",drBar);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}