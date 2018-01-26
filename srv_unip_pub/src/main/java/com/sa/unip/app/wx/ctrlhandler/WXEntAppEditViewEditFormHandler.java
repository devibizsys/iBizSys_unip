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

import com.sa.unip.app.srv.wx.ctrlmodel.WXEntAppMainEditFormModel;
import net.ibizsys.psrt.srv.wx.demodel.WXEntAppDEModel;
import net.ibizsys.psrt.srv.wx.service.WXEntAppService;
import net.ibizsys.psrt.srv.wx.dao.WXEntAppDAO;
import net.ibizsys.psrt.srv.wx.entity.WXEntApp;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class WXEntAppEditViewEditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected WXEntAppMainEditFormModel editformModel = null;
    public WXEntAppEditViewEditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (WXEntAppMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected WXEntAppMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected WXEntAppService getRealService() {
        return (WXEntAppService)this.getService();
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
        //注册 'wxaccountname'
        IFormItemHandler wxaccountnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.wx.ctrlhandler.WXEntAppMainEditFormWxaccountnameHandler");
        wxaccountnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"wxaccountname",wxaccountnameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        WXEntApp entity = new WXEntApp();
        entity.set(WXEntApp.FIELD_WXENTAPPID,objKeyValue);
        this.getRealService().executeAction(WXEntAppService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return WXEntAppService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WXEntAppService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        WXEntApp entity = new WXEntApp();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(WXEntAppService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        WXEntApp entity = new WXEntApp();
        entity.set(WXEntApp.FIELD_WXENTAPPID,objKeyValue);
        this.getRealService().executeAction(WXEntAppService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(WXEntAppService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        WXEntApp entity = new WXEntApp();
        entity.set(WXEntApp.FIELD_WXENTAPPID,objKeyValue);
        this.getRealService().executeAction(WXEntAppService.ACTION_REMOVE,entity);
    }


}