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

import com.sa.unip.app.srv.common.ctrlmodel.OrgSecUserMain2EditFormModel;
import net.ibizsys.psrt.srv.common.demodel.OrgSecUserDEModel;
import net.ibizsys.psrt.srv.common.service.OrgSecUserService;
import net.ibizsys.psrt.srv.common.dao.OrgSecUserDAO;
import net.ibizsys.psrt.srv.common.entity.OrgSecUser;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OrgSecUserEditView2EditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected OrgSecUserMain2EditFormModel editformModel = null;
    public OrgSecUserEditView2EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OrgSecUserMain2EditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OrgSecUserMain2EditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OrgSecUserService getRealService() {
        return (OrgSecUserService)this.getService();
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
        IFormItemHandler orgnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.OrgSecUserMain2EditFormOrgnameHandler");
        orgnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgname",orgnameHandler);

        //注册 'orgsectorname'
        IFormItemHandler orgsectornameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.OrgSecUserMain2EditFormOrgsectornameHandler");
        orgsectornameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgsectorname",orgsectornameHandler);

        //注册 'orgusername'
        IFormItemHandler orgusernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.OrgSecUserMain2EditFormOrgusernameHandler");
        orgusernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgusername",orgusernameHandler);

        //注册 'orgsecusertypename'
        IFormItemHandler orgsecusertypenameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.OrgSecUserMain2EditFormOrgsecusertypenameHandler");
        orgsecusertypenameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgsecusertypename",orgsecusertypenameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        OrgSecUser entity = new OrgSecUser();
        entity.set(OrgSecUser.FIELD_ORGSECUSERID,objKeyValue);
        this.getRealService().executeAction(OrgSecUserService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OrgSecUserService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OrgSecUserService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OrgSecUser entity = new OrgSecUser();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OrgSecUserService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OrgSecUser entity = new OrgSecUser();
        entity.set(OrgSecUser.FIELD_ORGSECUSERID,objKeyValue);
        this.getRealService().executeAction(OrgSecUserService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OrgSecUserService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OrgSecUser entity = new OrgSecUser();
        entity.set(OrgSecUser.FIELD_ORGSECUSERID,objKeyValue);
        this.getRealService().executeAction(OrgSecUserService.ACTION_REMOVE,entity);
    }


}