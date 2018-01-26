/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.xxtz.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.xxtz.ctrlmodel.OA_XXMainEditFormModel;
import com.sa.unip.srv.xxtz.demodel.OA_XXDEModel;
import com.sa.unip.srv.xxtz.service.OA_XXService;
import com.sa.unip.srv.xxtz.dao.OA_XXDAO;
import com.sa.unip.srv.xxtz.entity.OA_XX;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_XXEditView2EditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected OA_XXMainEditFormModel editformModel = null;
    public OA_XXEditView2EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_XXMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_XXMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_XXService getRealService() {
        return (OA_XXService)this.getService();
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
        //注册 'orgusername'
        IFormItemHandler orgusernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.xxtz.ctrlhandler.OA_XXMainEditFormOrgusernameHandler");
        orgusernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgusername",orgusernameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        OA_XX entity = new OA_XX();
        entity.set(OA_XX.FIELD_OA_XXID,objKeyValue);
        this.getRealService().executeAction(OA_XXService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_XXService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_XXService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_XX entity = new OA_XX();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_XXService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_XX entity = new OA_XX();
        entity.set(OA_XX.FIELD_OA_XXID,objKeyValue);
        this.getRealService().executeAction(OA_XXService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_XXService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_XX entity = new OA_XX();
        entity.set(OA_XX.FIELD_OA_XXID,objKeyValue);
        this.getRealService().executeAction(OA_XXService.ACTION_REMOVE,entity);
    }


}