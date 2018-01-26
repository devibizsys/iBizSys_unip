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
 * 视图[OA_TZGGRYEditView2]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/xxtz/OA_TZGGRYEditView2.do")
public class OA_TZGGRYEditView2Controller extends net.ibizsys.paas.controller.EditView2ControllerBase {
    public OA_TZGGRYEditView2Controller() throws Exception {
        super();
        this.setId("4e637c146ea5d3720525d1b768c936c5");
        this.setCaption("通知公告人员");
        this.setTitle("通知公告人员编辑视图");
        this.setCapLanResTag("DE.LNAME.OA_GGTZRY");
        this.setTitleLanResTag("PAGE.TITLE.OA_TZGGRY.EDITVIEW2");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.DRBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/xxtz/OA_TZGGRYEditView2.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.xxtz.controller.OA_TZGGRYEditView2Controller",this);
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
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.xxtz.ctrlmodel.OA_TZGGRYMainEditFormModel");
        editForm.init(this);
        this.registerCtrlModel("form",editForm);
        //注册 drbar
        ICtrlModel drBar=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.xxtz.ctrlmodel.OA_TZGGRYDefaultDRBarModel");
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
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.xxtz.ctrlhandler.OA_TZGGRYEditView2EditFormHandler");
        editForm.init(this);
        this.registerCtrlHandler("form",editForm);
        //注册 drbar
        ICtrlHandler drBar = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.xxtz.ctrlhandler.OA_TZGGRYEditView2DRBarHandler");
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