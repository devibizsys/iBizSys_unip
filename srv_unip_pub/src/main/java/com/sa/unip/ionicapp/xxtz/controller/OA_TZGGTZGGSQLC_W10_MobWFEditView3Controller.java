/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.xxtz.controller;

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
import com.sa.unip.ionicapp.IonicAppAppModel;


/**
 * 视图[OA_TZGGTZGGSQLC_W10_MobWFEditView3]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/xxtz/OA_TZGGTZGGSQLC_W10_MobWFEditView3.do")
public class OA_TZGGTZGGSQLC_W10_MobWFEditView3Controller extends net.ibizsys.pswf.controller.MobWFEditView3ControllerBase {
    public OA_TZGGTZGGSQLC_W10_MobWFEditView3Controller() throws Exception {
        super();
        this.setId("62815bb90e37726ca41b81dcfa7f2370");
        this.setCaption("通知公告");
        this.setTitle("通知公告");
        this.setCapLanResTag("DE.LNAME.OA_TZGG");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.DRTAB","TRUE");
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //
        this.setAttribute("UI.CTRL.QUICKTOOLBAR","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/xxtz/OA_TZGGTZGGSQLC_W10_MobWFEditView3.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.xxtz.controller.OA_TZGGTZGGSQLC_W10_MobWFEditView3Controller",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("21C2D14F-CB19-468E-A8E2-B1219566CA04"));
        this.setWFIAMode(true);
        this.setWFStepValue("10");
        this.setDEWF(this.getDEModel().getDEWF("75B611EE-617F-4D0B-9BB3-DB4B6CF7D339"));


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


    private IonicAppAppModel ionicAppAppModel;
    public  IonicAppAppModel getIonicAppAppModel() {
        if(this.ionicAppAppModel==null) {
            try {
                this.ionicAppAppModel = (IonicAppAppModel)AppModelGlobal.getApplication("com.sa.unip.ionicapp.IonicAppAppModel");
            } catch(Exception ex) {
            }
        }
        return this.ionicAppAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getIonicAppAppModel();
    }





    private com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel oA_TZGGDEModel;

    public  com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel getOA_TZGGDEModel() {
        if(this.oA_TZGGDEModel==null) {
            try {
                this.oA_TZGGDEModel = (com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xxtz.demodel.OA_TZGGDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_TZGGDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_TZGGDEModel();
    }

    public  com.sa.unip.srv.xxtz.service.OA_TZGGService getOA_TZGGService() {
        try {
            return (com.sa.unip.srv.xxtz.service.OA_TZGGService)ServiceGlobal.getService("com.sa.unip.srv.xxtz.service.OA_TZGGService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_TZGGService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 drtab
        ICtrlModel drTab=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.xxtz.ctrlmodel.OA_TZGGTZGGSQLCMobDRDRTabModel");
        drTab.init(this);
        this.registerCtrlModel("drtab",drTab);
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.xxtz.ctrlmodel.OA_TZGGMobWFMainEditFormModel");
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
        ICtrlHandler drTab = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.xxtz.ctrlhandler.OA_TZGGTZGGSQLC_W10_MobWFEditView3DRTabHandler");
        drTab.init(this);
        this.registerCtrlHandler("drtab",drTab);
        //注册 form
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.xxtz.ctrlhandler.OA_TZGGTZGGSQLC_W10_MobWFEditView3EditFormHandler");
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