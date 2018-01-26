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
 * 视图[OA_CPMJSQCPMJSQLC_W_MobWFMDView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/IonicApp/ywsp/OA_CPMJSQCPMJSQLC_W_MobWFMDView.do")
public class OA_CPMJSQCPMJSQLC_W_MobWFMDViewController extends net.ibizsys.pswf.controller.MobWFMDViewControllerBase {
    public OA_CPMJSQCPMJSQLC_W_MobWFMDViewController() throws Exception {
        super();
        this.setId("0c47972c1d786efaa09817d829cdd75f");
        this.setCaption("车牌门禁申请");
        this.setTitle("车牌门禁申请");
        this.setCapLanResTag("DE.LNAME.OA_CPMJSQ");
        this.setAccessUserMode(2);
        //支持快速搜索
        this.setAttribute("UI.ENABLEQUICKSEARCH","TRUE");
        //
        this.setAttribute("UI.CTRL.RIGHTTOOLBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.MDCTRL","TRUE");

        ViewControllerGlobal.registerViewController("/IonicApp/ywsp/OA_CPMJSQCPMJSQLC_W_MobWFMDView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.ionicapp.ywsp.controller.OA_CPMJSQCPMJSQLC_W_MobWFMDViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("BCE28AB4-6801-4E94-B40C-1B4DEA610230"));
        this.setWFIAMode(true);
        this.setWFStepValue("");
        this.setDEWF(this.getDEModel().getDEWF("6320402B-4AFB-44C4-AA4C-2FF53B1338F4"));


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





    private com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel oA_CPMJSQDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel getOA_CPMJSQDEModel() {
        if(this.oA_CPMJSQDEModel==null) {
            try {
                this.oA_CPMJSQDEModel = (com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_CPMJSQDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CPMJSQDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CPMJSQDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_CPMJSQService getOA_CPMJSQService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_CPMJSQService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_CPMJSQService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CPMJSQService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 mdctrl
        ICtrlModel mdctrl=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_CPMJSQMobMOBMDCTRLModel");
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
        ICtrlHandler mdctrl = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.ionicapp.ywsp.ctrlhandler.OA_CPMJSQCPMJSQLC_W_MobWFMDViewMdctrlHandler");
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