/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.ionicapp.ywsp.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_PCSQSHYJMobFormEditFormModel;
import com.sa.unip.srv.ywsp.demodel.OA_PCSQDEModel;
import com.sa.unip.srv.ywsp.service.OA_PCSQService;
import com.sa.unip.srv.ywsp.dao.OA_PCSQDAO;
import com.sa.unip.srv.ywsp.entity.OA_PCSQ;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_PCSQMobWFActionViewEditFormHandler extends net.ibizsys.pswf.ctrlhandler.WFActionFormHandlerBase {

    protected OA_PCSQSHYJMobFormEditFormModel editformModel = null;
    public OA_PCSQMobWFActionViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_PCSQSHYJMobFormEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_PCSQSHYJMobFormEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_PCSQService getRealService() {
        return (OA_PCSQService)this.getService();
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
        OA_PCSQ entity = new OA_PCSQ();
        entity.set(OA_PCSQ.FIELD_OA_PCSQID,objKeyValue);
        this.getRealService().executeAction(OA_PCSQService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_PCSQService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_PCSQService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_PCSQ entity = new OA_PCSQ();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_PCSQService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_PCSQ entity = new OA_PCSQ();
        entity.set(OA_PCSQ.FIELD_OA_PCSQID,objKeyValue);
        this.getRealService().executeAction(OA_PCSQService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_PCSQService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_PCSQ entity = new OA_PCSQ();
        entity.set(OA_PCSQ.FIELD_OA_PCSQID,objKeyValue);
        this.getRealService().executeAction(OA_PCSQService.ACTION_REMOVE,entity);
    }


}