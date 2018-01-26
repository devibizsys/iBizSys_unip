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
 * 视图[OA_PCSQPCSQLC_D_MobWFMDView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/ywsp/OA_PCSQPCSQLC_D_MobWFMDView.do")
public class OA_PCSQPCSQLC_D_MobWFMDViewController extends net.ibizsys.pswf.controller.MobWFMDViewControllerBase {
    public OA_PCSQPCSQLC_D_MobWFMDViewController() throws Exception {
        super();
        this.setId("96701e140cc564ede6068122d1748bdc");
        this.setCaption("派车申请");
        this.setTitle("派车申请");
        this.setCapLanResTag("DE.LNAME.OA_PCSQ");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.RIGHTTOOLBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.MDCTRL","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/ywsp/OA_PCSQPCSQLC_D_MobWFMDView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.ywsp.controller.OA_PCSQPCSQLC_D_MobWFMDViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("AAD2F165-1BC4-477E-8C47-35E7AF46BBDD"));
        this.setDEWF(this.getDEModel().getDEWF("72C85E0B-B7DB-4D24-A23E-7E2FFE6D300C"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel oA_PCSQDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel getOA_PCSQDEModel() {
        if(this.oA_PCSQDEModel==null) {
            try {
                this.oA_PCSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_PCSQDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_PCSQDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_PCSQService getOA_PCSQService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_PCSQService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_PCSQService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_PCSQService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 mdctrl
        ICtrlModel mdctrl=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_PCSQMobMOBMDCTRLModel");
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
        ICtrlHandler mdctrl = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.ywsp.ctrlhandler.OA_PCSQPCSQLC_D_MobWFMDViewMdctrlHandler");
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