/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.angular.jcsj.controller;

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
import com.sa.unip.angular.AngularAppModel;


/**
 * 视图[OA_GZRZAngularEditView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/Angular/jcsj/OA_GZRZAngularEditView.do")
public class OA_GZRZAngularEditViewController extends net.ibizsys.pswf.controller.EditViewControllerBase {
    public OA_GZRZAngularEditViewController() throws Exception {
        super();
        this.setId("dcbb9e81c4e6bdfa264f1d413a1fd10d");
        this.setCaption("工作日志");
        this.setTitle("工作日志");
        this.setAccessUserMode(3);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/Angular/jcsj/OA_GZRZAngularEditView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.angular.jcsj.controller.OA_GZRZAngularEditViewController",this);
    }


    @Override
    protected void prepareViewParam() throws Exception {
        super.prepareViewParam();
        this.setWFModel(this.getSystemModel().getWFModel("E7BDF6C1-A7A2-43BB-AB28-4E6DC36DA33F"));
        this.setDEWF(this.getDEModel().getDEWF("2C996634-8819-473F-B708-C2CB3990A386"));


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


    private AngularAppModel angularAppModel;
    public  AngularAppModel getAngularAppModel() {
        if(this.angularAppModel==null) {
            try {
                this.angularAppModel = (AngularAppModel)AppModelGlobal.getApplication("com.sa.unip.angular.AngularAppModel");
            } catch(Exception ex) {
            }
        }
        return this.angularAppModel;
    }

    @Override
    public  IApplicationModel  getAppModel() {
        return this.getAngularAppModel();
    }





    private com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel oA_GZRZDEModel;

    public  com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel getOA_GZRZDEModel() {
        if(this.oA_GZRZDEModel==null) {
            try {
                this.oA_GZRZDEModel = (com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_GZRZDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_GZRZDEModel();
    }

    public  com.sa.unip.srv.ywsp.service.OA_GZRZService getOA_GZRZService() {
        try {
            return (com.sa.unip.srv.ywsp.service.OA_GZRZService)ServiceGlobal.getService("com.sa.unip.srv.ywsp.service.OA_GZRZService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_GZRZService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.angular.srv.ywsp.ctrlmodel.OA_GZRZAngularMainEditFormModel");
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
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.angular.jcsj.ctrlhandler.OA_GZRZAngularEditViewEditFormHandler");
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