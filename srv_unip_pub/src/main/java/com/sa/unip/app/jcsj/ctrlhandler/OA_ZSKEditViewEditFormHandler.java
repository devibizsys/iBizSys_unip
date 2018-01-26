/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.jcsj.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.jcsj.ctrlmodel.OA_ZSKMainEditFormModel;
import com.sa.unip.srv.jcsj.demodel.OA_ZSKDEModel;
import com.sa.unip.srv.jcsj.service.OA_ZSKService;
import com.sa.unip.srv.jcsj.dao.OA_ZSKDAO;
import com.sa.unip.srv.jcsj.entity.OA_ZSK;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_ZSKEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected OA_ZSKMainEditFormModel editformModel = null;
    public OA_ZSKEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_ZSKMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_ZSKMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_ZSKService getRealService() {
        return (OA_ZSKService)this.getService();
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
        //注册 'orgsectorname'
        IFormItemHandler orgsectornameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.jcsj.ctrlhandler.OA_ZSKMainEditFormOrgsectornameHandler");
        orgsectornameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgsectorname",orgsectornameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        OA_ZSK entity = new OA_ZSK();
        entity.set(OA_ZSK.FIELD_OA_ZSKID,objKeyValue);
        this.getRealService().executeAction(OA_ZSKService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_ZSKService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_ZSKService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_ZSK entity = new OA_ZSK();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_ZSKService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_ZSK entity = new OA_ZSK();
        entity.set(OA_ZSK.FIELD_OA_ZSKID,objKeyValue);
        this.getRealService().executeAction(OA_ZSKService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_ZSKService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_ZSK entity = new OA_ZSK();
        entity.set(OA_ZSK.FIELD_OA_ZSKID,objKeyValue);
        this.getRealService().executeAction(OA_ZSKService.ACTION_REMOVE,entity);
    }


}