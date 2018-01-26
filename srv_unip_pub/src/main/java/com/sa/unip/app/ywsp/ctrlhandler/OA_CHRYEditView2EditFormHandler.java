/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.app.ywsp.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.app.srv.ywsp.ctrlmodel.OA_CHRYMainEditFormModel;
import com.sa.unip.srv.ywsp.demodel.OA_CHRYDEModel;
import com.sa.unip.srv.ywsp.service.OA_CHRYService;
import com.sa.unip.srv.ywsp.dao.OA_CHRYDAO;
import com.sa.unip.srv.ywsp.entity.OA_CHRY;

import net.ibizsys.paas.ctrlmodel.IEditFormModel;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IFormItemHandler;
import net.ibizsys.paas.ctrlhandler.IFormItemUpdateHandler;

public class OA_CHRYEditView2EditFormHandler extends net.ibizsys.paas.ctrlhandler.EditFormHandlerBase {

    protected OA_CHRYMainEditFormModel editformModel = null;
    public OA_CHRYEditView2EditFormHandler()  {
        super();
    }

    @Override
    protected void onInit() throws Exception {

        editformModel  = (OA_CHRYMainEditFormModel)this.getViewController().getCtrlModel("form");
        super.onInit();
    }

    @Override
    protected IEditFormModel getEditFormModel() {
        return this.getRealEditFormModel();
    }

    protected OA_CHRYMainEditFormModel getRealEditFormModel() {
        return this.editformModel ;
    }

    protected OA_CHRYService getRealService() {
        return (OA_CHRYService)this.getService();
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
        //注册 'ybhysqname'
        IFormItemHandler ybhysqnameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.ywsp.ctrlhandler.OA_CHRYMainEditFormYbhysqnameHandler");
        ybhysqnameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"ybhysqname",ybhysqnameHandler);

        //注册 'orgusername'
        IFormItemHandler orgusernameHandler=(IFormItemHandler)iSystemRuntime.createObject("com.sa.unip.app.srv.ywsp.ctrlhandler.OA_CHRYMainEditFormOrgusernameHandler");
        orgusernameHandler.init(this.getEditFormModel(),this);
        this.registerCtrlItemHandler(ITEMACTIONTYPE_FORMITEM+"orgusername",orgusernameHandler);


    }

    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        OA_CHRY entity = new OA_CHRY();
        entity.set(OA_CHRY.FIELD_OA_CHRYID,objKeyValue);
        this.getRealService().executeAction(OA_CHRYService.ACTION_GET,entity);
        return entity;
    }

    @Override
    protected String getGetEntityAction() {
        return OA_CHRYService.ACTION_GET;
    }

    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_CHRYService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    @Override
    protected IEntity getDraftEntity()throws Exception {
        OA_CHRY entity = new OA_CHRY();
        fillDefaultValues(entity ,false);
        this.getRealService().executeAction(OA_CHRYService.ACTION_GETDRAFT,entity);
        return entity;
    }

    @Override
    protected IEntity getDraftEntityFrom(Object objKeyValue)throws Exception {
        OA_CHRY entity = new OA_CHRY();
        entity.set(OA_CHRY.FIELD_OA_CHRYID,objKeyValue);
        this.getRealService().executeAction(OA_CHRYService.ACTION_GETDRAFTFROM,entity);
        return entity;
    }

    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_CHRYService.ACTION_CREATE,iEntity);
        return iEntity;
    }


    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_CHRY entity = new OA_CHRY();
        entity.set(OA_CHRY.FIELD_OA_CHRYID,objKeyValue);
        this.getRealService().executeAction(OA_CHRYService.ACTION_REMOVE,entity);
    }


}