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

import com.sa.unip.app.srv.ywsp.ctrlmodel.OA_CGSQMainEditFormModel;
import com.sa.unip.srv.ywsp.demodel.OA_CGSQDEModel;
import com.sa.unip.srv.ywsp.service.OA_CGSQService;
import com.sa.unip.srv.ywsp.dao.OA_CGSQDAO;
import com.sa.unip.srv.ywsp.entity.OA_CGSQ;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_CGSQCGSQLC_W50_WFEditView3EditFormHandler extends net.ibizsys.pswf.ctrlhandler.WFEditFormHandlerBase {

    protected OA_CGSQMainEditFormModel editformModel = null;
    public OA_CGSQCGSQLC_W50_WFEditView3EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_CGSQMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_CGSQMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_CGSQService getRealService() {
        return (OA_CGSQService)this.getService();
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
        IFormItemHandler orgsectornameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.ywsp.ctrlhandler.OA_CGSQMainEditFormOrgsectornameHandler");
        orgsectornameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgsectorname",orgsectornameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        OA_CGSQ entity = new OA_CGSQ();
        entity.set(OA_CGSQ.FIELD_OA_CGSQID,objKeyValue);
        this.getRealService().executeAction(OA_CGSQService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_CGSQService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_CGSQService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_CGSQ entity = new OA_CGSQ();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_CGSQService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_CGSQ entity = new OA_CGSQ();
        entity.set(OA_CGSQ.FIELD_OA_CGSQID,objKeyValue);
        this.getRealService().executeAction(OA_CGSQService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_CGSQService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_CGSQ entity = new OA_CGSQ();
        entity.set(OA_CGSQ.FIELD_OA_CGSQID,objKeyValue);
        this.getRealService().executeAction(OA_CGSQService.ACTION_REMOVE,entity);
    }


}