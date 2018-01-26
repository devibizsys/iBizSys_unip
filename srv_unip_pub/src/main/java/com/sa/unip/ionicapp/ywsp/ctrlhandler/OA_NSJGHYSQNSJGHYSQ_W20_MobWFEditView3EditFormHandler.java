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

import com.sa.unip.ionicapp.srv.ywsp.ctrlmodel.OA_NSJGHYSQMobWFFromEditFormModel;
import com.sa.unip.srv.ywsp.demodel.OA_NSJGHYSQDEModel;
import com.sa.unip.srv.ywsp.service.OA_NSJGHYSQService;
import com.sa.unip.srv.ywsp.dao.OA_NSJGHYSQDAO;
import com.sa.unip.srv.ywsp.entity.OA_NSJGHYSQ;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_NSJGHYSQNSJGHYSQ_W20_MobWFEditView3EditFormHandler extends net.ibizsys.pswf.ctrlhandler.WFEditFormHandlerBase {

    protected OA_NSJGHYSQMobWFFromEditFormModel editformModel = null;
    public OA_NSJGHYSQNSJGHYSQ_W20_MobWFEditView3EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_NSJGHYSQMobWFFromEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_NSJGHYSQMobWFFromEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_NSJGHYSQService getRealService() {
        return (OA_NSJGHYSQService)this.getService();
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
        OA_NSJGHYSQ entity = new OA_NSJGHYSQ();
        entity.set(OA_NSJGHYSQ.FIELD_OA_NSJGHYSQID,objKeyValue);
        this.getRealService().executeAction(OA_NSJGHYSQService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_NSJGHYSQService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_NSJGHYSQService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_NSJGHYSQ entity = new OA_NSJGHYSQ();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_NSJGHYSQService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_NSJGHYSQ entity = new OA_NSJGHYSQ();
        entity.set(OA_NSJGHYSQ.FIELD_OA_NSJGHYSQID,objKeyValue);
        this.getRealService().executeAction(OA_NSJGHYSQService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_NSJGHYSQService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_NSJGHYSQ entity = new OA_NSJGHYSQ();
        entity.set(OA_NSJGHYSQ.FIELD_OA_NSJGHYSQID,objKeyValue);
        this.getRealService().executeAction(OA_NSJGHYSQService.ACTION_REMOVE,entity);
    }


}