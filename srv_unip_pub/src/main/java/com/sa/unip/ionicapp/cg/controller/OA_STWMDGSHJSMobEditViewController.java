/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.cg.controller;

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
 * 视图[OA_STWMDGSHJSMobEditView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/cg/OA_STWMDGSHJSMobEditView.do")
public class OA_STWMDGSHJSMobEditViewController extends net.ibizsys.pswf.controller.MobEditViewControllerBase {
    public OA_STWMDGSHJSMobEditViewController() throws Exception {
        super();
        this.setId("cb567978b9c389a83321b372550d5661");
        this.setCaption("食堂外卖订购");
        this.setTitle("食堂外卖订购");
        this.setCapLanResTag("DE.LNAME.OA_STWMDG");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/cg/OA_STWMDGSHJSMobEditView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.cg.controller.OA_STWMDGSHJSMobEditViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("49A0F3C3-CC7E-4297-95D2-5A2A8D30C09A"));
        this.setDEWF(this.getDEModel().getDEWF("E35ECF64-209C-4437-BF21-10E3E8374111"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel oA_STWMDGDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel getOA_STWMDGDEModel() {
        if(this.oA_STWMDGDEModel==null) {
            try {
                this.oA_STWMDGDEModel = (com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_STWMDGDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_STWMDGDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_STWMDGService getOA_STWMDGService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_STWMDGService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_STWMDGService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_STWMDGService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_STWMDGMobWFMainEditFormModel");
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
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.cg.ctrlhandler.OA_STWMDGSHJSMobEditViewEditFormHandler");
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