/**
 *  iBizSys 5.0 机器人生产代码（不要直接修改当前代码）
 *  http://www.ibizsys.net
 */
package com.sa.unip.angular.gzl.ctrlhandler;


import java.util.ArrayList;
import java.util.List;
import net.ibizsys.paas.util.StringHelper;
import net.ibizsys.paas.web.WebContext;
import net.ibizsys.paas.demodel.DEModelGlobal;
import net.ibizsys.paas.demodel.IDataEntityModel;
import net.ibizsys.paas.service.IService;
import net.ibizsys.paas.service.ServiceGlobal;

import com.sa.unip.angular.srv.ywsp.ctrlmodel.OA_GZRZMainGridModel;
import com.sa.unip.srv.ywsp.demodel.OA_GZRZDEModel;
import com.sa.unip.srv.ywsp.service.OA_GZRZService;
import com.sa.unip.srv.ywsp.dao.OA_GZRZDAO;
import com.sa.unip.srv.ywsp.entity.OA_GZRZ;

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
 * 应用视图[OA_GZRZRZTJLC_W10_WFGridView]表格[grid]后台处理对象基类
 */
public class OA_GZRZRZTJLC_W10_WFGridViewGridHandler extends net.ibizsys.pswf.ctrlhandler.WFGridHandlerBase {

    protected OA_GZRZMainGridModel gridModel = null;
    public OA_GZRZRZTJLC_W10_WFGridViewGridHandler()  {
        super();
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.CtrlHandlerBase#onInit()
     */
    @Override
    protected void onInit() throws Exception {
        this.setMinorSortField("CREATEDATE");
        this.setMinorSortDir("DESC");

        gridModel = (OA_GZRZMainGridModel)this.getViewController().getCtrlModel("grid");
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
    protected OA_GZRZMainGridModel getRealGridModel() {
        return this.gridModel;
    }

    /**
     * 获取实际的实体服务对象
     * @return
     */
    protected OA_GZRZService getRealService() {
        return (OA_GZRZService)this.getService();
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
        OA_GZRZ entity = new OA_GZRZ();
        getDraftEntity(entity);
        return entity;
    }

    /**
     * 获取操作数据对象
     * @param entity
     * @throws Exception
     */
    protected void getDraftEntity(OA_GZRZ entity)throws Exception {
        this.getRealService().executeAction(OA_GZRZService.ACTION_GETDRAFT,entity);
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#getEntity(java.lang.Object)
     */
    @Override
    protected IEntity getEntity(Object objKeyValue)throws Exception {
        OA_GZRZ entity = new OA_GZRZ();
        entity.set(OA_GZRZ.FIELD_OA_GZRZID,objKeyValue);
        this.getRealService().executeAction(OA_GZRZService.ACTION_GET,entity);
        return entity;
    }


    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#createEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity createEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_GZRZService.ACTION_CREATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#updateEntity(net.ibizsys.paas.entity.IEntity)
     */
    @Override
    protected IEntity updateEntity(IEntity iEntity)throws Exception {
        this.getRealService().executeAction(OA_GZRZService.ACTION_UPDATE,iEntity);
        return iEntity;
    }

    /* (non-Javadoc)
     * @see net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase#removeEntity(java.lang.Object)
     */
    @Override
    protected void removeEntity(Object objKeyValue)throws Exception {
        OA_GZRZ entity = new OA_GZRZ();
        entity.set(OA_GZRZ.FIELD_OA_GZRZID,objKeyValue);
        this.getRealService().executeAction(OA_GZRZService.ACTION_REMOVE,entity);
    }



}