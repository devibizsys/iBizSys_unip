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

import com.sa.unip.app.srv.common.ctrlmodel.MsgSendQueueHisMain2EditFormModel;
import net.ibizsys.psrt.srv.common.demodel.MsgSendQueueHisDEModel;
import net.ibizsys.psrt.srv.common.service.MsgSendQueueHisService;
import net.ibizsys.psrt.srv.common.dao.MsgSendQueueHisDAO;
import net.ibizsys.psrt.srv.common.entity.MsgSendQueueHis;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class MsgSendQueueHisEditView2EditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected MsgSendQueueHisMain2EditFormModel editformModel = null;
    public MsgSendQueueHisEditView2EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (MsgSendQueueHisMain2EditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected MsgSendQueueHisMain2EditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected MsgSendQueueHisService getRealService() {
        return (MsgSendQueueHisService)this.getService();
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
        MsgSendQueueHis entity = new MsgSendQueueHis();
        entity.set(MsgSendQueueHis.FIELD_MSGSENDQUEUEHISID,objKeyValue);
        this.getRealService().executeAction(MsgSendQueueHisService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return MsgSendQueueHisService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(MsgSendQueueHisService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        MsgSendQueueHis entity = new MsgSendQueueHis();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(MsgSendQueueHisService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        MsgSendQueueHis entity = new MsgSendQueueHis();
        entity.set(MsgSendQueueHis.FIELD_MSGSENDQUEUEHISID,objKeyValue);
        this.getRealService().executeAction(MsgSendQueueHisService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(MsgSendQueueHisService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        MsgSendQueueHis entity = new MsgSendQueueHis();
        entity.set(MsgSendQueueHis.FIELD_MSGSENDQUEUEHISID,objKeyValue);
        this.getRealService().executeAction(MsgSendQueueHisService.ACTION_REMOVE,entity);
    }


}