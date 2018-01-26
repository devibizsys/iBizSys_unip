/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.wx.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.wx.ctrlmodel.WXAccountMainEditFormModel;
import net.ibizsys.psrt.srv.wx.demodel.WXAccountDEModel;
import net.ibizsys.psrt.srv.wx.service.WXAccountService;
import net.ibizsys.psrt.srv.wx.dao.WXAccountDAO;
import net.ibizsys.psrt.srv.wx.entity.WXAccount;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class WXAccountEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected WXAccountMainEditFormModel editformModel = null;
    public WXAccountEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (WXAccountMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected WXAccountMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected WXAccountService getRealService() {
        return (WXAccountService)this.getService();
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
        IFormItemHandler orgnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wx.ctrlhandler.WXAccountMainEditFormOrgnameHandler");
        orgnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgname",orgnameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        WXAccount entity = new WXAccount();
        entity.set(WXAccount.FIELD_WXACCOUNTID,objKeyValue);
        this.getRealService().executeAction(WXAccountService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return WXAccountService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WXAccountService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        WXAccount entity = new WXAccount();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(WXAccountService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        WXAccount entity = new WXAccount();
        entity.set(WXAccount.FIELD_WXACCOUNTID,objKeyValue);
        this.getRealService().executeAction(WXAccountService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WXAccountService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        WXAccount entity = new WXAccount();
        entity.set(WXAccount.FIELD_WXACCOUNTID,objKeyValue);
        this.getRealService().executeAction(WXAccountService.ACTION_REMOVE,entity);
    }


}