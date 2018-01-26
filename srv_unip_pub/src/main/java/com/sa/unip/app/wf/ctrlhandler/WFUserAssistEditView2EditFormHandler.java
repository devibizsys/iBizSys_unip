/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.wf.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.wf.ctrlmodel.WFUserAssistMainEditFormModel;
import net.ibizsys.psrt.srv.wf.demodel.WFUserAssistDEModel;
import net.ibizsys.psrt.srv.wf.service.WFUserAssistService;
import net.ibizsys.psrt.srv.wf.dao.WFUserAssistDAO;
import net.ibizsys.psrt.srv.wf.entity.WFUserAssist;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class WFUserAssistEditView2EditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected WFUserAssistMainEditFormModel editformModel = null;
    public WFUserAssistEditView2EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (WFUserAssistMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected WFUserAssistMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected WFUserAssistService getRealService() {
        return (WFUserAssistService)this.getService();
    }


    /**
    * 准备部件操作数据访问能力
     * @throws Exception
     */
    @Override
    protected void prepareDataAccessActions()throws Exception {
        super.prepareDataAccessActions();
        this.registerDataAccessAction("update","UPDATE");
        this.registerDataAccessAction("loaddraftfrom","CREATE");
        this.registerDataAccessAction("remove","DELETE");
        this.registerDataAccessAction("load","READ");
        this.registerDataAccessAction("loaddraft","CREATE");
        this.registerDataAccessAction("create","CREATE");
    }



    /**
    * 准备部件成员处理对象
     * @throws Exception
     */
    @Override
    protected void prepareCtrlItemHandlers()throws Exception {
        super.prepareCtrlItemHandlers();

        ISystemRuntime iSystemRuntime = (ISystemRuntime)this.getSystemModel();
        //注册 'wfmajorusername'
        IFormItemHandler wfmajorusernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wf.ctrlhandler.WFUserAssistMainEditFormWfmajorusernameHandler");
        wfmajorusernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"wfmajorusername",wfmajorusernameHandler);

        //注册 'wfminorusername'
        IFormItemHandler wfminorusernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wf.ctrlhandler.WFUserAssistMainEditFormWfminorusernameHandler");
        wfminorusernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"wfminorusername",wfminorusernameHandler);

        //注册 'wfworkflowname'
        IFormItemHandler wfworkflownameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wf.ctrlhandler.WFUserAssistMainEditFormWfworkflownameHandler");
        wfworkflownameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"wfworkflowname",wfworkflownameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        WFUserAssist entity = new WFUserAssist();
        entity.set(WFUserAssist.FIELD_WFUSERASSISTID,objKeyValue);
        this.getRealService().executeAction(WFUserAssistService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return WFUserAssistService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WFUserAssistService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        WFUserAssist entity = new WFUserAssist();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(WFUserAssistService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        WFUserAssist entity = new WFUserAssist();
        entity.set(WFUserAssist.FIELD_WFUSERASSISTID,objKeyValue);
        this.getRealService().executeAction(WFUserAssistService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WFUserAssistService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        WFUserAssist entity = new WFUserAssist();
        entity.set(WFUserAssist.FIELD_WFUSERASSISTID,objKeyValue);
        this.getRealService().executeAction(WFUserAssistService.ACTION_REMOVE,entity);
    }


}