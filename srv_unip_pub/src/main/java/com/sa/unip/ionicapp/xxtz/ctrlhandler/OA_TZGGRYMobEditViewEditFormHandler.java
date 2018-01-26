/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.xxtz.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.ionicapp.srv.xxtz.ctrlmodel.OA_TZGGRYCKMobMainEditFormModel;
import com.sa.unip.srv.xxtz.demodel.OA_TZGGRYDEModel;
import com.sa.unip.srv.xxtz.service.OA_TZGGRYService;
import com.sa.unip.srv.xxtz.dao.OA_TZGGRYDAO;
import com.sa.unip.srv.xxtz.entity.OA_TZGGRY;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_TZGGRYMobEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected OA_TZGGRYCKMobMainEditFormModel editformModel = null;
    public OA_TZGGRYMobEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_TZGGRYCKMobMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_TZGGRYCKMobMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_TZGGRYService getRealService() {
        return (OA_TZGGRYService)this.getService();
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
        OA_TZGGRY entity = new OA_TZGGRY();
        entity.set(OA_TZGGRY.FIELD_OA_TZGGRYID,objKeyValue);
        this.getRealService().executeAction(OA_TZGGRYService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_TZGGRYService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_TZGGRYService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_TZGGRY entity = new OA_TZGGRY();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_TZGGRYService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_TZGGRY entity = new OA_TZGGRY();
        entity.set(OA_TZGGRY.FIELD_OA_TZGGRYID,objKeyValue);
        this.getRealService().executeAction(OA_TZGGRYService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_TZGGRYService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_TZGGRY entity = new OA_TZGGRY();
        entity.set(OA_TZGGRY.FIELD_OA_TZGGRYID,objKeyValue);
        this.getRealService().executeAction(OA_TZGGRYService.ACTION_REMOVE,entity);
    }


}