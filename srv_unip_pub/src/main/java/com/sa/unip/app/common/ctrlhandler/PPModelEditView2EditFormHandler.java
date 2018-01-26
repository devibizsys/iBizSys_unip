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

import com.sa.unip.app.srv.common.ctrlmodel.PPModelMainEditFormModel;
import net.ibizsys.psrt.srv.common.demodel.PPModelDEModel;
import net.ibizsys.psrt.srv.common.service.PPModelService;
import net.ibizsys.psrt.srv.common.dao.PPModelDAO;
import net.ibizsys.psrt.srv.common.entity.PPModel;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class PPModelEditView2EditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected PPModelMainEditFormModel editformModel = null;
    public PPModelEditView2EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (PPModelMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected PPModelMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected PPModelService getRealService() {
        return (PPModelService)this.getService();
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
        //注册 'l1pvpartname'
        IFormItemHandler l1pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormL1pvpartnameHandler");
        l1pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"l1pvpartname",l1pvpartnameHandler);

        //注册 'c1pvpartname'
        IFormItemHandler c1pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormC1pvpartnameHandler");
        c1pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"c1pvpartname",c1pvpartnameHandler);

        //注册 'r1pvpartname'
        IFormItemHandler r1pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormR1pvpartnameHandler");
        r1pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"r1pvpartname",r1pvpartnameHandler);

        //注册 'l2pvpartname'
        IFormItemHandler l2pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormL2pvpartnameHandler");
        l2pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"l2pvpartname",l2pvpartnameHandler);

        //注册 'c2pvpartname'
        IFormItemHandler c2pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormC2pvpartnameHandler");
        c2pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"c2pvpartname",c2pvpartnameHandler);

        //注册 'r2pvpartname'
        IFormItemHandler r2pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormR2pvpartnameHandler");
        r2pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"r2pvpartname",r2pvpartnameHandler);

        //注册 'l3pvpartname'
        IFormItemHandler l3pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormL3pvpartnameHandler");
        l3pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"l3pvpartname",l3pvpartnameHandler);

        //注册 'c3pvpartname'
        IFormItemHandler c3pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormC3pvpartnameHandler");
        c3pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"c3pvpartname",c3pvpartnameHandler);

        //注册 'r3pvpartname'
        IFormItemHandler r3pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormR3pvpartnameHandler");
        r3pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"r3pvpartname",r3pvpartnameHandler);

        //注册 'l4pvpartname'
        IFormItemHandler l4pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormL4pvpartnameHandler");
        l4pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"l4pvpartname",l4pvpartnameHandler);

        //注册 'c4pvpartname'
        IFormItemHandler c4pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormC4pvpartnameHandler");
        c4pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"c4pvpartname",c4pvpartnameHandler);

        //注册 'r4pvpartname'
        IFormItemHandler r4pvpartnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.PPModelMainEditFormR4pvpartnameHandler");
        r4pvpartnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"r4pvpartname",r4pvpartnameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        PPModel entity = new PPModel();
        entity.set(PPModel.FIELD_PPMODELID,objKeyValue);
        this.getRealService().executeAction(PPModelService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return PPModelService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(PPModelService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        PPModel entity = new PPModel();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(PPModelService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        PPModel entity = new PPModel();
        entity.set(PPModel.FIELD_PPMODELID,objKeyValue);
        this.getRealService().executeAction(PPModelService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(PPModelService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        PPModel entity = new PPModel();
        entity.set(PPModel.FIELD_PPMODELID,objKeyValue);
        this.getRealService().executeAction(PPModelService.ACTION_REMOVE,entity);
    }


}