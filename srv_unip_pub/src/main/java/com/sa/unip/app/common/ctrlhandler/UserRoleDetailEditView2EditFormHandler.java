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

import com.sa.unip.app.srv.common.ctrlmodel.UserRoleDetailMainEditFormModel;
import net.ibizsys.psrt.srv.common.demodel.UserRoleDetailDEModel;
import net.ibizsys.psrt.srv.common.service.UserRoleDetailService;
import net.ibizsys.psrt.srv.common.dao.UserRoleDetailDAO;
import net.ibizsys.psrt.srv.common.entity.UserRoleDetail;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class UserRoleDetailEditView2EditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected UserRoleDetailMainEditFormModel editformModel = null;
    public UserRoleDetailEditView2EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (UserRoleDetailMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected UserRoleDetailMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected UserRoleDetailService getRealService() {
        return (UserRoleDetailService)this.getService();
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
        //注册 'uesrrolename'
        IFormItemHandler uesrrolenameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserRoleDetailMainEditFormUesrrolenameHandler");
        uesrrolenameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"uesrrolename",uesrrolenameHandler);

        //注册 'userobjectname'
        IFormItemHandler userobjectnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserRoleDetailMainEditFormUserobjectnameHandler");
        userobjectnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"userobjectname",userobjectnameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        UserRoleDetail entity = new UserRoleDetail();
        entity.set(UserRoleDetail.FIELD_USERROLEDETAILID,objKeyValue);
        this.getRealService().executeAction(UserRoleDetailService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return UserRoleDetailService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleDetailService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        UserRoleDetail entity = new UserRoleDetail();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(UserRoleDetailService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        UserRoleDetail entity = new UserRoleDetail();
        entity.set(UserRoleDetail.FIELD_USERROLEDETAILID,objKeyValue);
        this.getRealService().executeAction(UserRoleDetailService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleDetailService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        UserRoleDetail entity = new UserRoleDetail();
        entity.set(UserRoleDetail.FIELD_USERROLEDETAILID,objKeyValue);
        this.getRealService().executeAction(UserRoleDetailService.ACTION_REMOVE,entity);
    }


}