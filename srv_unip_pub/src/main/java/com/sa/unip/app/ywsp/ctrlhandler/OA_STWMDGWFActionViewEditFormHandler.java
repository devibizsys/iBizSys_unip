/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.ywsp.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.ywsp.ctrlmodel.OA_STWMDGSHYJFormEditFormModel;
import com.sa.unip.srv.ywsp.demodel.OA_STWMDGDEModel;
import com.sa.unip.srv.ywsp.service.OA_STWMDGService;
import com.sa.unip.srv.ywsp.dao.OA_STWMDGDAO;
import com.sa.unip.srv.ywsp.entity.OA_STWMDG;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_STWMDGWFActionViewEditFormHandler extends net.ibizsys.pswf.ctrlhandler.WFActionFormHandlerBase {

    protected OA_STWMDGSHYJFormEditFormModel editformModel = null;
    public OA_STWMDGWFActionViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_STWMDGSHYJFormEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_STWMDGSHYJFormEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_STWMDGService getRealService() {
        return (OA_STWMDGService)this.getService();
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
        OA_STWMDG entity = new OA_STWMDG();
        entity.set(OA_STWMDG.FIELD_OA_STWMDGID,objKeyValue);
        this.getRealService().executeAction(OA_STWMDGService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_STWMDGService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_STWMDGService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_STWMDG entity = new OA_STWMDG();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_STWMDGService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_STWMDG entity = new OA_STWMDG();
        entity.set(OA_STWMDG.FIELD_OA_STWMDGID,objKeyValue);
        this.getRealService().executeAction(OA_STWMDGService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_STWMDGService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_STWMDG entity = new OA_STWMDG();
        entity.set(OA_STWMDG.FIELD_OA_STWMDGID,objKeyValue);
        this.getRealService().executeAction(OA_STWMDGService.ACTION_REMOVE,entity);
    }


}