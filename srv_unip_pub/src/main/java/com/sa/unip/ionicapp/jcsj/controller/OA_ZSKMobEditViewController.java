/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.jcsj.controller;

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
 * 视图[OA_ZSKMobEditView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/jcsj/OA_ZSKMobEditView.do")
public class OA_ZSKMobEditViewController extends net.ibizsys.paas.controller.MobEditViewControllerBase {
    public OA_ZSKMobEditViewController() throws Exception {
        super();
        this.setId("67607298c531dfc33dff5662560d69b0");
        this.setCaption("知识库");
        this.setTitle("知识库");
        this.setCapLanResTag("DE.LNAME.OA_ZSK");
        this.setTitleLanResTag("PAGE.TITLE.OA_ZSK.MOBEDITVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.RIGHTTOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/jcsj/OA_ZSKMobEditView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.jcsj.controller.OA_ZSKMobEditViewController",this);
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





    private com.sa.unip.srv.jcsj.demodel.OA_ZSKDEModel oA_ZSKDEModel;

    public  com.sa.unip.srv.jcsj.demodel.OA_ZSKDEModel getOA_ZSKDEModel() {
        if(this.oA_ZSKDEModel==null) {
            try {
                this.oA_ZSKDEModel = (com.sa.unip.srv.jcsj.demodel.OA_ZSKDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.jcsj.demodel.OA_ZSKDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_ZSKDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_ZSKDEModel();
    }

    public  com.sa.unip.srv.jcsj.service.OA_ZSKService getOA_ZSKService() {
        try {
            return (com.sa.unip.srv.jcsj.service.OA_ZSKService)ServiceGlobal.getService("com.sa.unip.srv.jcsj.service.OA_ZSKService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_ZSKService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.jcsj.ctrlmodel.OA_ZSKMobMainEditFormModel");
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
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.jcsj.ctrlhandler.OA_ZSKMobEditViewEditFormHandler");
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