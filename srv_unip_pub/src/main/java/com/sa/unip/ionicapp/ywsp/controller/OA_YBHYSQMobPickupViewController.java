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
 * 视图[OA_YBHYSQMobPickupView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/ywsp/OA_YBHYSQMobPickupView.do")
public class OA_YBHYSQMobPickupViewController extends net.ibizsys.paas.controller.MobPickupViewControllerBase {
    public OA_YBHYSQMobPickupViewController() throws Exception {
        super();
        this.setId("51029bd7ae9ba30f32e186f28b20d7ad");
        this.setCaption("会议申请");
        this.setTitle("院办会议申请");
        this.setCapLanResTag("DE.LNAME.OA_YBHYSQ");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.PICKUPVIEWPANEL","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/ywsp/OA_YBHYSQMobPickupView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.ywsp.controller.OA_YBHYSQMobPickupViewController",this);
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





    private com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel oA_YBHYSQDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel getOA_YBHYSQDEModel() {
        if(this.oA_YBHYSQDEModel==null) {
            try {
                this.oA_YBHYSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_YBHYSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_YBHYSQDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_YBHYSQDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_YBHYSQService getOA_YBHYSQService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_YBHYSQService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_YBHYSQService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_YBHYSQService();
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