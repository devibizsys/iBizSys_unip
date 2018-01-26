/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.common.controller;

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
import com.sa.unip.app.appAppModel;


/**
 * 视图[DataSyncOut2RedirectView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/common/DataSyncOut2RedirectView.do")
public class DataSyncOut2RedirectViewController extends net.ibizsys.paas.controller.RedirectViewControllerBase {
    public DataSyncOut2RedirectViewController() throws Exception {
        super();
        this.setId("e0eb1e3935b0f40e41d1c2c4461697e2");
        this.setCaption("数据同步发送队列2");
        this.setTitle("数据同步发送队列2实体数据重定向视图");
        this.setAccessUserMode(2);

        ViewControllerGlobal.registerViewController("/app/common/DataSyncOut2RedirectView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.common.controller.DataSyncOut2RedirectViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();

        this.setEnableWorkflow(true);

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


    private appAppModel appAppModel;
    public  appAppModel getappAppModel() {
        if(this.appAppModel==null) {
            try {
                this.appAppModel = (appAppModel)AppModelGlobal.getApplication("com.sa.unip.app.appAppModel");
            } catch(Exception ex) {
            }
        }
        return this.appAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getappAppModel();
    }





    private net.ibizsys.psrt.srv.common.demodel.DataSyncOut2DEModel dataSyncOut2DEModel;

    public  net.ibizsys.psrt.srv.common.demodel.DataSyncOut2DEModel getDataSyncOut2DEModel() {
        if(this.dataSyncOut2DEModel==null) {
            try {
                this.dataSyncOut2DEModel = (net.ibizsys.psrt.srv.common.demodel.DataSyncOut2DEModel)DEModelGlobal.getDEModel("net.ibizsys.psrt.srv.common.demodel.DataSyncOut2DEModel");
            } catch(Exception ex) {
            }
        }
        return this.dataSyncOut2DEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getDataSyncOut2DEModel();
    }

    public  net.ibizsys.psrt.srv.common.service.DataSyncOut2Service getDataSyncOut2Service() {
        try {
            return (net.ibizsys.psrt.srv.common.service.DataSyncOut2Service)ServiceGlobal.getService("net.ibizsys.psrt.srv.common.service.DataSyncOut2Service",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getDataSyncOut2Service();
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