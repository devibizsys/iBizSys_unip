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

import com.sa.unip.app.srv.common.ctrlmodel.UserRoleResMain2EditFormModel;
import net.ibizsys.psrt.srv.common.demodel.UserRoleResDEModel;
import net.ibizsys.psrt.srv.common.service.UserRoleResService;
import net.ibizsys.psrt.srv.common.dao.UserRoleResDAO;
import net.ibizsys.psrt.srv.common.entity.UserRoleRes;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class UserRoleResEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected UserRoleResMain2EditFormModel editformModel = null;
    public UserRoleResEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (UserRoleResMain2EditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected UserRoleResMain2EditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected UserRoleResService getRealService() {
        return (UserRoleResService)this.getService();
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
        IFormItemHandler userrolenameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserRoleResMain2EditFormUserrolenameHandler");
        userrolenameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"userrolename",userrolenameHandler);

        //注册 'uniresname'
        IFormItemHandler uniresnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserRoleResMain2EditFormUniresnameHandler");
        uniresnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"uniresname",uniresnameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        UserRoleRes entity = new UserRoleRes();
        entity.set(UserRoleRes.FIELD_USERROLERESID,objKeyValue);
        this.getRealService().executeAction(UserRoleResService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return UserRoleResService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleResService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        UserRoleRes entity = new UserRoleRes();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(UserRoleResService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        UserRoleRes entity = new UserRoleRes();
        entity.set(UserRoleRes.FIELD_USERROLERESID,objKeyValue);
        this.getRealService().executeAction(UserRoleResService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleResService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        UserRoleRes entity = new UserRoleRes();
        entity.set(UserRoleRes.FIELD_USERROLERESID,objKeyValue);
        this.getRealService().executeAction(UserRoleResService.ACTION_REMOVE,entity);
    }


}