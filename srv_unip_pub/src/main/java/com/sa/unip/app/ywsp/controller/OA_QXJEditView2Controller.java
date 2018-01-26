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
 * 视图[OA_QXJEditView2]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/ywsp/OA_QXJEditView2.do")
public class OA_QXJEditView2Controller extends net.ibizsys.pswf.controller.EditView2ControllerBase {
    public OA_QXJEditView2Controller() throws Exception {
        super();
        this.setId("6ed9213f832dc6572dcf9c25fd0b0441");
        this.setCaption("请休假");
        this.setTitle("请休假编辑视图");
        this.setCapLanResTag("DE.LNAME.OA_QXJ");
        this.setTitleLanResTag("PAGE.TITLE.OA_QXJ.EDITVIEW2");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.DRBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/ywsp/OA_QXJEditView2.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.ywsp.controller.OA_QXJEditView2Controller",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("88045D1E-5E70-4191-8A50-F0B3A98AE865"));
        this.setDEWF(this.getDEModel().getDEWF("99BCF14D-0B1F-4679-A525-1055ADDB5DA4"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel oA_QXJDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel getOA_QXJDEModel() {
        if(this.oA_QXJDEModel==null) {
            try {
                this.oA_QXJDEModel = (com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_QXJDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_QXJDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_QXJDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_QXJService getOA_QXJService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_QXJService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_QXJService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_QXJService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_QXJMainEditFormModel");
        editForm.init(this);
        this.registerCtrlModel("form",editForm);
        //注册 drbar
        ICtrlModel drBar=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.ywsp.ctrlmodel.OA_QXJDefaultDRBarModel");
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
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_QXJEditView2EditFormHandler");
        editForm.init(this);
        this.registerCtrlHandler("form",editForm);
        //注册 drbar
        ICtrlHandler drBar = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.ywsp.ctrlhandler.OA_QXJEditView2DRBarHandler");
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