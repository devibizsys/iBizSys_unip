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
 * 视图[OA_TZGGTZGGSQLC_D_MobWFMDView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/xxtz/OA_TZGGTZGGSQLC_D_MobWFMDView.do")
public class OA_TZGGTZGGSQLC_D_MobWFMDViewController extends net.ibizsys.pswf.controller.MobWFMDViewControllerBase {
    public OA_TZGGTZGGSQLC_D_MobWFMDViewController() throws Exception {
        super();
        this.setId("c0afe4cfaccde2d50c40773617b4d45a");
        this.setCaption("通知公告");
        this.setTitle("通知公告");
        this.setCapLanResTag("DE.LNAME.OA_TZGG");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.RIGHTTOOLBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.MDCTRL","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/xxtz/OA_TZGGTZGGSQLC_D_MobWFMDView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.xxtz.controller.OA_TZGGTZGGSQLC_D_MobWFMDViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("21C2D14F-CB19-468E-A8E2-B1219566CA04"));
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
        //注册 mdctrl
        ICtrlModel mdctrl=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.xxtz.ctrlmodel.OA_TZGGMobMOBMDCTRLModel");
        mdctrl.init(this);
        this.registerCtrlModel("mdctrl",mdctrl);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 mdctrl
        ICtrlHandler mdctrl = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.xxtz.ctrlhandler.OA_TZGGTZGGSQLC_D_MobWFMDViewMdctrlHandler");
        mdctrl.init(this);
        this.registerCtrlHandler("mdctrl",mdctrl);
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}