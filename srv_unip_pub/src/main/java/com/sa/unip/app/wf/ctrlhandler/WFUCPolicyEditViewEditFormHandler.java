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

import com.sa.unip.app.srv.wf.ctrlmodel.WFUCPolicyMain2EditFormModel;
import net.ibizsys.psrt.srv.wf.demodel.WFUCPolicyDEModel;
import net.ibizsys.psrt.srv.wf.service.WFUCPolicyService;
import net.ibizsys.psrt.srv.wf.dao.WFUCPolicyDAO;
import net.ibizsys.psrt.srv.wf.entity.WFUCPolicy;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class WFUCPolicyEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected WFUCPolicyMain2EditFormModel editformModel = null;
    public WFUCPolicyEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (WFUCPolicyMain2EditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected WFUCPolicyMain2EditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected WFUCPolicyService getRealService() {
        return (WFUCPolicyService)this.getService();
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
        //注册 'majorwfusername'
        IFormItemHandler majorwfusernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wf.ctrlhandler.WFUCPolicyMain2EditFormMajorwfusernameHandler");
        majorwfusernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"majorwfusername",majorwfusernameHandler);

        //注册 'minorwfusername'
        IFormItemHandler minorwfusernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wf.ctrlhandler.WFUCPolicyMain2EditFormMinorwfusernameHandler");
        minorwfusernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"minorwfusername",minorwfusernameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        WFUCPolicy entity = new WFUCPolicy();
        entity.set(WFUCPolicy.FIELD_WFUCPOLICYID,objKeyValue);
        this.getRealService().executeAction(WFUCPolicyService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return WFUCPolicyService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WFUCPolicyService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        WFUCPolicy entity = new WFUCPolicy();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(WFUCPolicyService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        WFUCPolicy entity = new WFUCPolicy();
        entity.set(WFUCPolicy.FIELD_WFUCPOLICYID,objKeyValue);
        this.getRealService().executeAction(WFUCPolicyService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WFUCPolicyService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        WFUCPolicy entity = new WFUCPolicy();
        entity.set(WFUCPolicy.FIELD_WFUCPOLICYID,objKeyValue);
        this.getRealService().executeAction(WFUCPolicyService.ACTION_REMOVE,entity);
    }


}