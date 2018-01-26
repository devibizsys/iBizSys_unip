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

import com.sa.unip.app.srv.common.ctrlmodel.UserDictItemMain2EditFormModel;
import net.ibizsys.psrt.srv.common.demodel.UserDictItemDEModel;
import net.ibizsys.psrt.srv.common.service.UserDictItemService;
import net.ibizsys.psrt.srv.common.dao.UserDictItemDAO;
import net.ibizsys.psrt.srv.common.entity.UserDictItem;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class UserDictItemEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected UserDictItemMain2EditFormModel editformModel = null;
    public UserDictItemEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (UserDictItemMain2EditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected UserDictItemMain2EditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected UserDictItemService getRealService() {
        return (UserDictItemService)this.getService();
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
        //注册 'userdictname'
        IFormItemHandler userdictnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserDictItemMain2EditFormUserdictnameHandler");
        userdictnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"userdictname",userdictnameHandler);

        //注册 'userdictcatname'
        IFormItemHandler userdictcatnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.common.ctrlhandler.UserDictItemMain2EditFormUserdictcatnameHandler");
        userdictcatnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"userdictcatname",userdictcatnameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        UserDictItem entity = new UserDictItem();
        entity.set(UserDictItem.FIELD_USERDICTITEMID,objKeyValue);
        this.getRealService().executeAction(UserDictItemService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return UserDictItemService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserDictItemService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        UserDictItem entity = new UserDictItem();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(UserDictItemService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        UserDictItem entity = new UserDictItem();
        entity.set(UserDictItem.FIELD_USERDICTITEMID,objKeyValue);
        this.getRealService().executeAction(UserDictItemService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserDictItemService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        UserDictItem entity = new UserDictItem();
        entity.set(UserDictItem.FIELD_USERDICTITEMID,objKeyValue);
        this.getRealService().executeAction(UserDictItemService.ACTION_REMOVE,entity);
    }


}