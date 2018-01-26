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

import com.sa.unip.app.srv.common.ctrlmodel.UserGroupDetailMain2GridModel;
import net.ibizsys.psrt.srv.common.demodel.UserGroupDetailDEModel;
import net.ibizsys.psrt.srv.common.service.UserGroupDetailService;
import net.ibizsys.psrt.srv.common.dao.UserGroupDetailDAO;
import net.ibizsys.psrt.srv.common.entity.UserGroupDetail;

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
 * 应用视图[UserGroupDetailGridView]表格[grid]后台处理对象基类
 */
public class UserGroupDetailGridViewGridHandler extends net.ibizsys.paas.ctrlhandler.GridHandlerBase {

    protected UserGroupDetailMain2GridModel gridModel = null;
    public UserGroupDetailGridViewGridHandler()  {
        super();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.CtrlHandlerBase#onInit()
     */
    @Override
    protected void onInit() throws Exception {

        gridModel = (UserGroupDetailMain2GridModel)this.getViewController().getCtrlModel("grid");
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
    protected UserGroupDetailMain2GridModel getRealGridModel() {
        return this.gridModel;
    }

    /**
     * 获取实际的实体服务对象
     * @return
     */
    protected UserGroupDetailService getRealService() {
        return (UserGroupDetailService)this.getService();
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
        UserGroupDetail entity = new UserGroupDetail();
        getDraftEntity(entity);
        return entity;
    }

    /**
     * 获取操作数据对象
     * @param entity
     * @throws Exception
     */
    protected void getDraftEntity(UserGroupDetail entity)throws Exception {
        this.getRealService().executeAction(UserGroupDetailService.ACTION_GETDRAFT,entity);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#getEntity(java.lang.Object)
     */
    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        UserGroupDetail entity = new UserGroupDetail();
        entity.set(UserGroupDetail.FIELD_USERGROUPDETAILID,objKeyValue);
        this.getRealService().executeAction(UserGroupDetailService.ACTION_GET,entity);
        return entity;
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#createEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserGroupDetailService.ACTION_CREATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#updateEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(UserGroupDetailService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#removeEntity(java.lang.Object)
     */
    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        UserGroupDetail entity = new UserGroupDetail();
        entity.set(UserGroupDetail.FIELD_USERGROUPDETAILID,objKeyValue);
        this.getRealService().executeAction(UserGroupDetailService.ACTION_REMOVE,entity);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#getDraftEntity(java.lang.String,java.lang.String,java.lang.String,java.lang.String)
     */
    @Override
    protected IEntity getDraftEntity(String strParentType,String strTypeParam,String strParentKey,String strParentKey2) throws Exception {
        UserGroupDetail entity = new UserGroupDetail();
        if ( (StringHelper.compare(strTypeParam,"DER1N_USERGROUPDETAIL_USERGROUP_USERGROUPID",true)==0)) {
            entity.set(UserGroupDetail.FIELD_USEROBJECTID,strParentKey2);
            this.getDraftEntity(entity);
            return entity;
        }
        if ((StringHelper.compare(strTypeParam,"DER1N_USERGROUPDETAIL_USEROBJECT_USEROBJECTID",true)==0)) {
            entity.set(UserGroupDetail.FIELD_USERGROUPID,strParentKey2);
            this.getDraftEntity(entity);
            return entity;
        }

        throw new Exception("无法填充关系数据对象");
    }



}