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

import com.sa.unip.app.srv.common.ctrlmodel.UserRoleDEFieldsMainGridModel;
import net.ibizsys.psrt.srv.common.demodel.UserRoleDEFieldsDEModel;
import net.ibizsys.psrt.srv.common.service.UserRoleDEFieldsService;
import net.ibizsys.psrt.srv.common.dao.UserRoleDEFieldsDAO;
import net.ibizsys.psrt.srv.common.entity.UserRoleDEFields;

import net.ibizsys.paas.core.DEDataSetFetchContext;
import net.ibizsys.paas.ctrlmodel.IGridModel;
import net.ibizsys.paas.db.DBFetchResult;
import net.ibizsys.paas.web.AjaxActionResult;
import net.ibizsys.paas.web.MDAjaxActionResult;
import net.ibizsys.paas.entity.IEntity;
import net.ibizsys.paas.sysmodel.ISystemRuntime;
import net.ibizsys.paas.ctrlhandler.IGridEditItemHandler;
import net.ibizsys.paas.ctrlhandler.IGridEditItemUpdateHandler;

/**
 * 应用视图[UserRoleDEFieldsGridView]表格[grid]后台处理对象基类
 */
public class UserRoleDEFieldsGridViewGridHandler extends net.ibizsys.paas.ctrlhandler.GridHandlerBase {

    protected UserRoleDEFieldsMainGridModel gridModel = null;
    public UserRoleDEFieldsGridViewGridHandler()  {
        super();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.CtrlHandlerBase#onInit()
     */
    @Override
    protected void onInit() throws Exception {

        gridModel = (UserRoleDEFieldsMainGridModel)this.getViewController().getCtrlModel("grid");
        super.onInit();


    }
    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.GridHandlerBase#getGridModel()
     */
    @Override
    protected IGridModel getGridModel() {
        return this.getRealGridModel();
    }

    /**
     * 获取实际的表格模型对象
     * @return
     */
    protected UserRoleDEFieldsMainGridModel getRealGridModel() {
        return this.gridModel;
    }

    /**
     * 获取实际的实体服务对象
     * @return
     */
    protected UserRoleDEFieldsService getRealService() {
        return (UserRoleDEFieldsService)this.getService();
    }

    /**
    * 准备部件操作数据访问能力
     * @throws Exception
     */
    @Override
    protected void prepareDataAccessActions()throws Exception {
        super.prepareDataAccessActions();
        this.registerDataAccessAction("update","UPDATE");
        this.registerDataAccessAction("remove","DELETE");
        this.registerDataAccessAction("loaddraft","CREATE");
        this.registerDataAccessAction("load","READ");
        this.registerDataAccessAction("create","CREATE");
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#fetchDEDataSet(net.ibizsys.paas.core.DEDataSetFetchContext)
     */

    @Override
    protected DBFetchResult fetchDEDataSet(DEDataSetFetchContext deDataSetFetchContext) throws Exception {
        return  this.getRealService().fetchDefault(deDataSetFetchContext);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#getDraftEntity()
     */
    @Override
    protected IEntity getDraftEntity()throws Exception {
        UserRoleDEFields entity = new UserRoleDEFields();
        getDraftEntity(entity);
        return entity;
    }

    /**
     * 获取操作数据对象
     * @param entity
     * @throws Exception
     */
    protected void getDraftEntity(UserRoleDEFields entity)throws Exception {
        this.getRealService().executeAction(UserRoleDEFieldsService.ACTION_GETDRAFT,entity);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#getEntity(java.lang.Object)
     */
    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        UserRoleDEFields entity = new UserRoleDEFields();
        entity.set(UserRoleDEFields.FIELD_USERROLEDEFIELDSID,objKeyValue);
        this.getRealService().executeAction(UserRoleDEFieldsService.ACTION_GET,entity);
        return entity;
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#createEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleDEFieldsService.ACTION_CREATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#updateEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserRoleDEFieldsService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#removeEntity(java.lang.Object)
     */
    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        UserRoleDEFields entity = new UserRoleDEFields();
        entity.set(UserRoleDEFields.FIELD_USERROLEDEFIELDSID,objKeyValue);
        this.getRealService().executeAction(UserRoleDEFieldsService.ACTION_REMOVE,entity);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#getDraftEntity(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     */
    @Override
    protected IEntity getDraftEntity(String strParentType,String strTypeParam,String strParentKey,String strParentKey2) throws Exception {
        UserRoleDEFields entity = new UserRoleDEFields();
        if ( (StringHelper.compare(strTypeParam,"DER1N_USERROLEDEFIELDS_USERROLEDEFIELD_USERROLEDEFIELDID",true)==0)) {
            entity.set(UserRoleDEFields.FIELD_USERROLEID,strParentKey2);
            this.getDraftEntity(entity);
            return entity;
        }
        if ((StringHelper.compare(strTypeParam,"DER1N_USERROLEDEFIELDS_USERROLE_USERROLEID",true)==0)) {
            entity.set(UserRoleDEFields.FIELD_USERROLEDEFIELDID,strParentKey2);
            this.getDraftEntity(entity);
            return entity;
        }

        throw new Exception("无法填充关系数据对象");
    }



}