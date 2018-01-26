/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.ywsp.controller;

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
 * 视图[OA_BGYPSQBGYPSQLC_D_MobWFEditView3]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/ywsp/OA_BGYPSQBGYPSQLC_D_MobWFEditView3.do")
public class OA_BGYPSQBGYPSQLC_D_MobWFEditView3Controller extends net.ibizsys.pswf.controller.MobWFEditView3ControllerBase {
    public OA_BGYPSQBGYPSQLC_D_MobWFEditView3Controller() throws Exception {
        super();
        this.setId("695b217d6bfe5a624ca82a7717babfe7");
        this.setCaption("办公用品申请");
        this.setTitle("办公用品申请");
        this.setCapLanResTag("DE.LNAME.OA_BGYPSQ");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //
        this.setAttribute("UI.CTRL.QUICKTOOLBAR","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.RIGHTTOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/ywsp/OA_BGYPSQBGYPSQLC_D_MobWFEditView3.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.ywsp.controller.OA_BGYPSQBGYPSQLC_D_MobWFEditView3Controller",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("DE0E3BE2-18D6-45AF-8D11-B57FE2335985"));
        this.setDEWF(this.getDEModel().getDEWF("AFB1D21D-733B-4FE4-B4DA-6D182D8ABAB2"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel oA_BGYPSQDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel getOA_BGYPSQDEModel() {
        if(this.oA_BGYPSQDEModel==null) {
            try {
                this.oA_BGYPSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_BGYPSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_BGYPSQDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_BGYPSQDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_BGYPSQService getOA_BGYPSQService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_BGYPSQService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_BGYPSQService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_BGYPSQService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_BGYPSQMobMainEditFormModel");
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
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.ywsp.ctrlhandler.OA_BGYPSQBGYPSQLC_D_MobWFEditView3EditFormHandler");
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