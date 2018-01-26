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

import com.sa.unip.app.srv.wf.ctrlmodel.WFUserCandidateMainEditFormModel;
import net.ibizsys.psrt.srv.wf.demodel.WFUserCandidateDEModel;
import net.ibizsys.psrt.srv.wf.service.WFUserCandidateService;
import net.ibizsys.psrt.srv.wf.dao.WFUserCandidateDAO;
import net.ibizsys.psrt.srv.wf.entity.WFUserCandidate;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class WFUserCandidateEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected WFUserCandidateMainEditFormModel editformModel = null;
    public WFUserCandidateEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (WFUserCandidateMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected WFUserCandidateMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected WFUserCandidateService getRealService() {
        return (WFUserCandidateService)this.getService();
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
        IFormItemHandler wfmajorusernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wf.ctrlhandler.WFUserCandidateMainEditFormWfmajorusernameHandler");
        wfmajorusernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"wfmajorusername",wfmajorusernameHandler);

        //注册 'wfminorusername'
        IFormItemHandler wfminorusernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wf.ctrlhandler.WFUserCandidateMainEditFormWfminorusernameHandler");
        wfminorusernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"wfminorusername",wfminorusernameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        WFUserCandidate entity = new WFUserCandidate();
        entity.set(WFUserCandidate.FIELD_WFUSERCANDIDATEID,objKeyValue);
        this.getRealService().executeAction(WFUserCandidateService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return WFUserCandidateService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WFUserCandidateService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        WFUserCandidate entity = new WFUserCandidate();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(WFUserCandidateService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        WFUserCandidate entity = new WFUserCandidate();
        entity.set(WFUserCandidate.FIELD_WFUSERCANDIDATEID,objKeyValue);
        this.getRealService().executeAction(WFUserCandidateService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WFUserCandidateService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        WFUserCandidate entity = new WFUserCandidate();
        entity.set(WFUserCandidate.FIELD_WFUSERCANDIDATEID,objKeyValue);
        this.getRealService().executeAction(WFUserCandidateService.ACTION_REMOVE,entity);
    }


}