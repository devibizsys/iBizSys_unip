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

import com.sa.unip.app.srv.common.ctrlmodel.LoginAccountMainEditFormModel;
import net.ibizsys.psrt.srv.common.demodel.LoginAccountDEModel;
import net.ibizsys.psrt.srv.common.service.LoginAccountService;
import net.ibizsys.psrt.srv.common.dao.LoginAccountDAO;
import net.ibizsys.psrt.srv.common.entity.LoginAccount;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class LoginAccountEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected LoginAccountMainEditFormModel editformModel = null;
    public LoginAccountEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (LoginAccountMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected LoginAccountMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected LoginAccountService getRealService() {
        return (LoginAccountService)this.getService();
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
        //注册 'username'
        IFormItemHandler usernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.LoginAccountMainEditFormUsernameHandler");
        usernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"username",usernameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        LoginAccount entity = new LoginAccount();
        entity.set(LoginAccount.FIELD_LOGINACCOUNTID,objKeyValue);
        this.getRealService().executeAction(LoginAccountService.ACTION_GETHASHMODE,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return LoginAccountService.ACTION_GETHASHMODE;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(LoginAccountService.ACTION_SAVEHASHMODE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        LoginAccount entity = new LoginAccount();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(LoginAccountService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        LoginAccount entity = new LoginAccount();
        entity.set(LoginAccount.FIELD_LOGINACCOUNTID,objKeyValue);
        this.getRealService().executeAction(LoginAccountService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(LoginAccountService.ACTION_SAVEHASHMODE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        LoginAccount entity = new LoginAccount();
        entity.set(LoginAccount.FIELD_LOGINACCOUNTID,objKeyValue);
        this.getRealService().executeAction(LoginAccountService.ACTION_REMOVE,entity);
    }


}