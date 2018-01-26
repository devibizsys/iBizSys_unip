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

import com.sa.unip.app.srv.common.ctrlmodel.UserRoleDatasMainEditFormModel;
import net.ibizsys.psrt.srv.common.demodel.UserRoleDatasDEModel;
import net.ibizsys.psrt.srv.common.service.UserRoleDatasService;
import net.ibizsys.psrt.srv.common.dao.UserRoleDatasDAO;
import net.ibizsys.psrt.srv.common.entity.UserRoleDatas;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class UserRoleDatasEditView2EditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected UserRoleDatasMainEditFormModel editformModel = null;
    public UserRoleDatasEditView2EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (UserRoleDatasMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected UserRoleDatasMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected UserRoleDatasService getRealService() {
        return (UserRoleDatasService)this.getService();
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
        //注册 'userrolename'
        IFormItemHandler userrolenameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserRoleDatasMainEditFormUserrolenameHandler");
        userrolenameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"userrolename",userrolenameHandler);

        //注册 'userroledataname'
        IFormItemHandler userroledatanameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserRoleDatasMainEditFormUserroledatanameHandler");
        userroledatanameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"userroledataname",userroledatanameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        UserRoleDatas entity = new UserRoleDatas();
        entity.set(UserRoleDatas.FIELD_USERROLEDATASID,objKeyValue);
        this.getRealService().executeAction(UserRoleDatasService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return UserRoleDatasService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleDatasService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        UserRoleDatas entity = new UserRoleDatas();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(UserRoleDatasService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        UserRoleDatas entity = new UserRoleDatas();
        entity.set(UserRoleDatas.FIELD_USERROLEDATASID,objKeyValue);
        this.getRealService().executeAction(UserRoleDatasService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleDatasService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        UserRoleDatas entity = new UserRoleDatas();
        entity.set(UserRoleDatas.FIELD_USERROLEDATASID,objKeyValue);
        this.getRealService().executeAction(UserRoleDatasService.ACTION_REMOVE,entity);
    }


}