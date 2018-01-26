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
 * 视图[OA_CHRYMobMDView9]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/ywsp/OA_CHRYMobMDView9.do")
public class OA_CHRYMobMDView9Controller extends net.ibizsys.paas.controller.MobMDView9ControllerBase {
    public OA_CHRYMobMDView9Controller() throws Exception {
        super();
        this.setId("9053ce01e24aad944a035eb912917a90");
        this.setCaption("参会人员");
        this.setTitle("参会人员移动端多数据视图");
        this.setCapLanResTag("DE.LNAME.OA_CHRY");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.MDCTRL","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/ywsp/OA_CHRYMobMDView9.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.ywsp.controller.OA_CHRYMobMDView9Controller",this);
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





    private com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel oA_CHRYDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel getOA_CHRYDEModel() {
        if(this.oA_CHRYDEModel==null) {
            try {
                this.oA_CHRYDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CHRYDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CHRYDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_CHRYService getOA_CHRYService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_CHRYService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CHRYService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CHRYService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 mdctrl
        ICtrlModel mdctrl=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_CHRYMobMOBMDCTRLModel");
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
        ICtrlHandler mdctrl = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.ywsp.ctrlhandler.OA_CHRYMobMDView9MdctrlHandler");
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