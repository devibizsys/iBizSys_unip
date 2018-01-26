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
 * 视图[OA_RZRYEditView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/xxtz/OA_RZRYEditView.do")
public class OA_RZRYEditViewController extends net.ibizsys.paas.controller.EditViewControllerBase {
    public OA_RZRYEditViewController() throws Exception {
        super();
        this.setId("68ee7771a53ffe43a89d877a4381bbb0");
        this.setCaption("日志人员");
        this.setTitle("日志人员编辑视图");
        this.setCapLanResTag("DE.LNAME.OA_RZRY");
        this.setTitleLanResTag("PAGE.TITLE.OA_RZRY.EDITVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/xxtz/OA_RZRYEditView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.xxtz.controller.OA_RZRYEditViewController",this);
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





    private com.sa.unip.srv.xxtz.demodel.OA_RZRYDEModel oA_RZRYDEModel;

    public  com.sa.unip.srv.xxtz.demodel.OA_RZRYDEModel getOA_RZRYDEModel() {
        if(this.oA_RZRYDEModel==null) {
            try {
                this.oA_RZRYDEModel = (com.sa.unip.srv.xxtz.demodel.OA_RZRYDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.OA_RZRYDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_RZRYDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_RZRYDEModel();
    }

    public  com.sa.unip.srv.xxtz.service.OA_RZRYService getOA_RZRYService() {
        try {
            return (com.sa.unip.srv.xxtz.service.OA_RZRYService)ServiceGlobal.getService("com.sa.unip.srv.xxtz.service.OA_RZRYService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_RZRYService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.xxtz.ctrlmodel.OA_RZRYMainEditFormModel");
        editForm.init(this);
        this.registerCtrlModel("form",editForm);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 form
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.xxtz.ctrlhandler.OA_RZRYEditViewEditFormHandler");
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