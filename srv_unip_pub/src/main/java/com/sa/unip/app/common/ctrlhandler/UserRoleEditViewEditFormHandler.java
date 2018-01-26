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

import com.sa.unip.app.srv.common.ctrlmodel.UserRoleMainEditFormModel;
import net.ibizsys.psrt.srv.common.demodel.UserRoleDEModel;
import net.ibizsys.psrt.srv.common.service.UserRoleService;
import net.ibizsys.psrt.srv.common.dao.UserRoleDAO;
import net.ibizsys.psrt.srv.common.entity.UserRole;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class UserRoleEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected UserRoleMainEditFormModel editformModel = null;
    public UserRoleEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (UserRoleMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected UserRoleMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected UserRoleService getRealService() {
        return (UserRoleService)this.getService();
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
        //注册 'userroletype'
        IFormItemHandler userroletypeHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserRoleMainEditFormUserroletypeHandler");
        userroletypeHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"userroletype",userroletypeHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        UserRole entity = new UserRole();
        entity.set(UserRole.FIELD_USERROLEID,objKeyValue);
        this.getRealService().executeAction(UserRoleService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return UserRoleService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        UserRole entity = new UserRole();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(UserRoleService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        UserRole entity = new UserRole();
        entity.set(UserRole.FIELD_USERROLEID,objKeyValue);
        this.getRealService().executeAction(UserRoleService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        UserRole entity = new UserRole();
        entity.set(UserRole.FIELD_USERROLEID,objKeyValue);
        this.getRealService().executeAction(UserRoleService.ACTION_REMOVE,entity);
    }


}