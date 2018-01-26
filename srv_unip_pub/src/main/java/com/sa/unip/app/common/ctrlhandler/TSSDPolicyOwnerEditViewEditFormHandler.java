/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.common.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.common.ctrlmodel.TSSDPolicyOwnerMainEditFormModel;
import net.ibizsys.psrt.srv.common.demodel.TSSDPolicyOwnerDEModel;
import net.ibizsys.psrt.srv.common.service.TSSDPolicyOwnerService;
import net.ibizsys.psrt.srv.common.dao.TSSDPolicyOwnerDAO;
import net.ibizsys.psrt.srv.common.entity.TSSDPolicyOwner;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class TSSDPolicyOwnerEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected TSSDPolicyOwnerMainEditFormModel editformModel = null;
    public TSSDPolicyOwnerEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (TSSDPolicyOwnerMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected TSSDPolicyOwnerMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected TSSDPolicyOwnerService getRealService() {
        return (TSSDPolicyOwnerService)this.getService();
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

    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        TSSDPolicyOwner entity = new TSSDPolicyOwner();
        entity.set(TSSDPolicyOwner.FIELD_TSSDPOLICYOWNERID,objKeyValue);
        this.getRealService().executeAction(TSSDPolicyOwnerService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return TSSDPolicyOwnerService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(TSSDPolicyOwnerService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        TSSDPolicyOwner entity = new TSSDPolicyOwner();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(TSSDPolicyOwnerService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        TSSDPolicyOwner entity = new TSSDPolicyOwner();
        entity.set(TSSDPolicyOwner.FIELD_TSSDPOLICYOWNERID,objKeyValue);
        this.getRealService().executeAction(TSSDPolicyOwnerService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(TSSDPolicyOwnerService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        TSSDPolicyOwner entity = new TSSDPolicyOwner();
        entity.set(TSSDPolicyOwner.FIELD_TSSDPOLICYOWNERID,objKeyValue);
        this.getRealService().executeAction(TSSDPolicyOwnerService.ACTION_REMOVE,entity);
    }


}