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

import com.sa.unip.app.srv.common.ctrlmodel.OrgSectorMain2EditFormModel;
import com.sa.unip.srv.subsys.demodel.OrgSectorDEModel;
import com.sa.unip.srv.subsys.service.OrgSectorService;
import net.ibizsys.psrt.srv.common.dao.OrgSectorDAO;
import net.ibizsys.psrt.srv.common.entity.OrgSector;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OrgSectorEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected OrgSectorMain2EditFormModel editformModel = null;
    public OrgSectorEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OrgSectorMain2EditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OrgSectorMain2EditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OrgSectorService getRealService() {
        return (OrgSectorService)this.getService();
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
        //注册 'orgname'
        IFormItemHandler orgnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.OrgSectorMain2EditFormOrgnameHandler");
        orgnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgname",orgnameHandler);

        //注册 'porgsectorname'
        IFormItemHandler porgsectornameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.OrgSectorMain2EditFormPorgsectornameHandler");
        porgsectornameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"porgsectorname",porgsectornameHandler);

        //注册 'reporgsectorname'
        IFormItemHandler reporgsectornameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.OrgSectorMain2EditFormReporgsectornameHandler");
        reporgsectornameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"reporgsectorname",reporgsectornameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        OrgSector entity = new OrgSector();
        entity.set(OrgSector.FIELD_ORGSECTORID,objKeyValue);
        this.getRealService().executeAction(OrgSectorService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OrgSectorService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OrgSectorService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OrgSector entity = new OrgSector();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OrgSectorService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OrgSector entity = new OrgSector();
        entity.set(OrgSector.FIELD_ORGSECTORID,objKeyValue);
        this.getRealService().executeAction(OrgSectorService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OrgSectorService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OrgSector entity = new OrgSector();
        entity.set(OrgSector.FIELD_ORGSECTORID,objKeyValue);
        this.getRealService().executeAction(OrgSectorService.ACTION_REMOVE,entity);
    }


}