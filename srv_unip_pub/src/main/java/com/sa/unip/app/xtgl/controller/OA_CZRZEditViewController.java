/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.xtgl.controller;

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
 * 视图[OA_CZRZEditView]控制类基类
 *
 * !! 不要对此代码进行修改
 */
@Controller
@RequestMapping(value = "/app/xtgl/OA_CZRZEditView.do")
public class OA_CZRZEditViewController extends net.ibizsys.paas.controller.EditViewControllerBase {
    public OA_CZRZEditViewController() throws Exception {
        super();
        this.setId("aed9d1b68bfa508d94d531281b447a84");
        this.setCaption("操作日志");
        this.setTitle("操作日志编辑视图");
        this.setCapLanResTag("DE.LNAME.OA_CZRZ");
        this.setTitleLanResTag("PAGE.TITLE.OA_CZRZ.EDITVIEW");
        this.setAccessUserMode(2);
        //
        this.setAttribute("UI.CTRL.FORM","TRUE");
        //显示数据信息栏
        this.setAttribute("UI.SHOWDATAINFOBAR","TRUE");
        //
        this.setAttribute("UI.CTRL.TOOLBAR","TRUE");

        ViewControllerGlobal.registerViewController("/app/xtgl/OA_CZRZEditView.do",this);
        ViewControllerGlobal.registerViewController("com.sa.unip.app.xtgl.controller.OA_CZRZEditViewController",this);
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





    private com.sa.unip.srv.xtgl.demodel.OA_CZRZDEModel oA_CZRZDEModel;

    public  com.sa.unip.srv.xtgl.demodel.OA_CZRZDEModel getOA_CZRZDEModel() {
        if(this.oA_CZRZDEModel==null) {
            try {
                this.oA_CZRZDEModel = (com.sa.unip.srv.xtgl.demodel.OA_CZRZDEModel)DEModelGlobal.getDEModel("com.sa.unip.srv.xtgl.demodel.OA_CZRZDEModel");
            } catch(Exception ex) {
            }
        }
        return this.oA_CZRZDEModel;
    }

    public  IDataEntityModel getDEModel() {
        return this.getOA_CZRZDEModel();
    }

    public  com.sa.unip.srv.xtgl.service.OA_CZRZService getOA_CZRZService() {
        try {
            return (com.sa.unip.srv.xtgl.service.OA_CZRZService)ServiceGlobal.getService("com.sa.unip.srv.xtgl.service.OA_CZRZService",this.getSessionFactory());
        } catch(Exception ex) {
            return null;
        }
    }

    /* (non-Javadoc)
    * @see net.ibizsys.paas.controller.IViewController#getService()
    */
    @Override
    public IService getService() {
        return getOA_CZRZService();
    }





    /**
     * 准备部件模型
     * @throws Exception
     */
    @Override
    protected void prepareCtrlModels()throws Exception {
        //注册 form
        ICtrlModel editForm=(ICtrlModel)getUniPSampleSysModel().createObject("com.sa.unip.app.srv.xtgl.ctrlmodel.OA_CZRZMainEditFormModel");
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
        ICtrlHandler editForm = (ICtrlHandler)getUniPSampleSysModel().createObject("com.sa.unip.app.xtgl.ctrlhandler.OA_CZRZEditViewEditFormHandler");
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