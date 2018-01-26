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
 * 视图[OA_RZRYMyReceiveMobMDView9]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/xxtz/OA_RZRYMyReceiveMobMDView9.do")
public class OA_RZRYMyReceiveMobMDView9Controller extends net.ibizsys.paas.controller.MobMDView9ControllerBase {
    public OA_RZRYMyReceiveMobMDView9Controller() throws Exception {
        super();
        this.setId("e31e24b9edcb46df8e432ef5054f4f43");
        this.setCaption("日志人员");
        this.setTitle("我收到的");
        this.setCapLanResTag("DE.LNAME.OA_RZRY");
        this.setTitleLanResTag("PAGE.TITLE.OA_RZRY.MYRECEIVEMOBMDVIEW9");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.SEARCHFORM","TRUE");
        //
        this.setAttribute("UI.CTRL.MDCTRL","TRUE");
        //支持搜常规索
        this.setAttribute("UI.ENABLESEARCH","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/xxtz/OA_RZRYMyReceiveMobMDView9.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.xxtz.controller.OA_RZRYMyReceiveMobMDView9Controller",this);
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
        //注册 mdctrl
        ICtrlModel mdctrl=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.xxtz.ctrlmodel.OA_RZRYMobMyReceiveMOBMDCTRLModel");
        mdctrl.init(this);
        this.registerCtrlModel("mdctrl",mdctrl);
        //注册 searchform
        ICtrlModel searchForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.xxtz.ctrlmodel.OA_RZRYMobSearchFormSearchFormModel");
        searchForm.init(this);
        this.registerCtrlModel("searchform",searchForm);
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
        //注册 mdctrl
        ICtrlHandler mdctrl = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.xxtz.ctrlhandler.OA_RZRYMyReceiveMobMDView9MdctrlHandler");
        mdctrl.init(this);
        this.registerCtrlHandler("mdctrl",mdctrl);
        //注册 searchform
        ICtrlHandler searchForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.xxtz.ctrlhandler.OA_RZRYMyReceiveMobMDView9SearchFormHandler");
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