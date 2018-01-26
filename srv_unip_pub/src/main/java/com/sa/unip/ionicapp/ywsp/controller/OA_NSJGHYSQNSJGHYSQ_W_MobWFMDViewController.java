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
 * 视图[OA_NSJGHYSQNSJGHYSQ_W_MobWFMDView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/ywsp/OA_NSJGHYSQNSJGHYSQ_W_MobWFMDView.do")
public class OA_NSJGHYSQNSJGHYSQ_W_MobWFMDViewController extends net.ibizsys.pswf.controller.MobWFMDViewControllerBase {
    public OA_NSJGHYSQNSJGHYSQ_W_MobWFMDViewController() throws Exception {
        super();
        this.setId("96e4ecfe77c87e732bd2b14b8d0a7bbe");
        this.setCaption("内设机构会议申请");
        this.setTitle("内设机构会议申请");
        this.setCapLanResTag("DE.LNAME.OA_NSJGHYSQ");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.RIGHTTOOLBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.MDCTRL","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/ywsp/OA_NSJGHYSQNSJGHYSQ_W_MobWFMDView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.ywsp.controller.OA_NSJGHYSQNSJGHYSQ_W_MobWFMDViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("0A378005-5F3C-4BEB-ADE2-6D3E1ABC441B"));
        this.setWFIAMode(true);
        this.setWFStepValue("");
        this.setDEWF(this.getDEModel().getDEWF("F9D95EB0-D7C5-415A-AC29-68D859C9A0E3"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel oA_NSJGHYSQDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel getOA_NSJGHYSQDEModel() {
        if(this.oA_NSJGHYSQDEModel==null) {
            try {
                this.oA_NSJGHYSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_NSJGHYSQDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_NSJGHYSQDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService getOA_NSJGHYSQService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_NSJGHYSQService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 mdctrl
        ICtrlModel mdctrl=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_NSJGHYSQMobMOBMDCTRLModel");
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
        ICtrlHandler mdctrl = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.ywsp.ctrlhandler.OA_NSJGHYSQNSJGHYSQ_W_MobWFMDViewMdctrlHandler");
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