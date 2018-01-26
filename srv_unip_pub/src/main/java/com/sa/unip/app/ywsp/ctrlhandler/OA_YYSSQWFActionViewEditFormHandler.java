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

import com.sa.unip.app.srv.ywsp.ctrlmodel.OA_YYSSQSHYJFormEditFormModel;
import com.sa.unip.srv.ywsp.demodel.OA_YYSSQDEModel;
import com.sa.unip.srv.ywsp.service.OA_YYSSQService;
import com.sa.unip.srv.ywsp.dao.OA_YYSSQDAO;
import com.sa.unip.srv.ywsp.entity.OA_YYSSQ;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_YYSSQWFActionViewEditFormHandler extends net.ibizsys.pswf.ctrlhandler.WFActionFormHandlerBase {

    protected OA_YYSSQSHYJFormEditFormModel editformModel = null;
    public OA_YYSSQWFActionViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_YYSSQSHYJFormEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_YYSSQSHYJFormEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_YYSSQService getRealService() {
        return (OA_YYSSQService)this.getService();
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
        OA_YYSSQ entity = new OA_YYSSQ();
        entity.set(OA_YYSSQ.FIELD_OA_YYSSQID,objKeyValue);
        this.getRealService().executeAction(OA_YYSSQService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_YYSSQService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_YYSSQService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_YYSSQ entity = new OA_YYSSQ();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_YYSSQService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_YYSSQ entity = new OA_YYSSQ();
        entity.set(OA_YYSSQ.FIELD_OA_YYSSQID,objKeyValue);
        this.getRealService().executeAction(OA_YYSSQService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_YYSSQService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_YYSSQ entity = new OA_YYSSQ();
        entity.set(OA_YYSSQ.FIELD_OA_YYSSQID,objKeyValue);
        this.getRealService().executeAction(OA_YYSSQService.ACTION_REMOVE,entity);
    }


}