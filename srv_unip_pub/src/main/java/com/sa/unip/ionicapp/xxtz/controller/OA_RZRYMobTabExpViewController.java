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
 * 视图[OA_RZRYMobTabExpView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/xxtz/OA_RZRYMobTabExpView.do")
public class OA_RZRYMobTabExpViewController extends net.ibizsys.paas.controller.MobTabExpViewControllerBase {
    public OA_RZRYMobTabExpViewController() throws Exception {
        super();
        this.setId("a8d84dbac308a2893ae8b258f823175f");
        this.setCaption("日志人员");
        this.setTitle("日志人员");
        this.setCapLanResTag("DE.LNAME.OA_RZRY");
        this.setTitleLanResTag("PAGE.TITLE.OA_RZRY.MOBTABEXPVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.TABVIEWPANEL2","TRUE");
        //
        this.setAttribute("UI.CTRL.TABVIEWPANEL","TRUE");
        //
        this.setAttribute("UI.CTRL.RIGHTTOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/xxtz/OA_RZRYMobTabExpView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.xxtz.controller.OA_RZRYMobTabExpViewController",this);
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
    }

    /**
     * 准备部件处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlHandlers()throws Exception {
    }


    /**
     * 注册界面行为
     * @throws Exception
     */
    @Override
    protected void prepareUIActions()throws Exception {

    }
}